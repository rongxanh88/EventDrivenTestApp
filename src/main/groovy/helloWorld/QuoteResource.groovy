package helloWorld

class QuoteResource {
    String type
    Quote value

    String getType() {
        return type
    }

    void setType(String type) {
        this.type = type
    }

    Quote getValue() {
        return value
    }

    void setValue(Quote value) {
        this.value = value
    }
}
