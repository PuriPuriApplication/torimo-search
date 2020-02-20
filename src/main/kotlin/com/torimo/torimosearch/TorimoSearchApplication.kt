package com.torimo.torimosearch

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct
import javax.annotation.PreDestroy

@SpringBootApplication
class TorimoSearchApplication

fun main(args: Array<String>) {
	runApplication<TorimoSearchApplication>(*args)
}

@Component
class BeanLifeCycle {
	@PostConstruct
	fun initAfterStartup() {
		println("TODO: ここでEsのClient接続をする")
	}

	@PreDestroy
	fun cleanupBeforeExit() {
		println("RODO: ここでEsのClient接続を切る")
	}
}