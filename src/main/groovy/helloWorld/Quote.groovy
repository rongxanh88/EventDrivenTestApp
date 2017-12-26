package helloWorld

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown=true)
class Quote {
    long id
    String quote

    long getId() {
        return id
    }

    void setId(long id) {
        this.id = id
    }

    String getQuote() {
        return quote
    }

    void setQuote(String quote) {
        this.quote = quote
    }
}
