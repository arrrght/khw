package hw4

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

class App {
    val greeting: String
        get() {
            return "Hello world."
        }
}

fun main(args: Array<String>) {
    // println(App().greeting)
    embeddedServer(Netty, 8080) {
		routing {
			get("/") {
				call.respondText("Hello world 2", ContentType.Text.Html)
			}
		}
    }.start(wait = true)
}
