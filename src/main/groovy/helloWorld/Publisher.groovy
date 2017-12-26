package helloWorld

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.bus.Event
import reactor.bus.EventBus

import java.util.concurrent.CountDownLatch
import java.util.concurrent.atomic.AtomicInteger

@Service
class Publisher {

    @Autowired
    EventBus eventBus

    @Autowired
    CountDownLatch latch

    void publishQuotes(numberOfQuotes) throws InterruptedException {
        def start = System.currentTimeMillis()

        AtomicInteger counter = new AtomicInteger(1)

        for (int i = 0; i < numberOfQuotes; i++) {
            eventBus.notify("quotes", Event.wrap(counter.getAndIncrement()))
        }

        latch.await()

        def elapsed = System.currentTimeMillis() - start

        println("Elapsed Time: ${elapsed} ms")
        println("Average time per quote: ${elapsed / numberOfQuotes} ms")
    }
}
