package app.freakshow.kmm_sample

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}