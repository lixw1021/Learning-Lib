package com.xianwei.learninglib.lib_rxjava

import io.reactivex.rxjava3.subjects.AsyncSubject
import io.reactivex.rxjava3.subjects.BehaviorSubject
import io.reactivex.rxjava3.subjects.PublishSubject
import io.reactivex.rxjava3.subjects.ReplaySubject

fun main() {

    println("//////////////// PublishSubject /////////////")
    val subject = PublishSubject.create<Int>()

    subject.onNext(1)
    subject.onNext(2)
    subject.subscribe {
        println(it)
    }
    subject.onNext(3)
    subject.onNext(4)

    println("//////////////// asyncSubject /////////////")
    val asyncSubject = AsyncSubject.create<Int>()

    asyncSubject.onNext(1)
    asyncSubject.onNext(2)
    asyncSubject.onComplete()

    asyncSubject.subscribe {
        println(it)
    }

    println("//////////////// ReplaySubject /////////////")
    val replaySubject = ReplaySubject.create<Int>()

    replaySubject.onNext(1)
    replaySubject.onNext(2)
    replaySubject.subscribe {
        println(it)
    }
    replaySubject.onNext(3)
    replaySubject.onNext(4)

    println("//////////////// BehaviorSubject /////////////")
    val behaviorSubject = BehaviorSubject.create<Int>()

    behaviorSubject.onNext(1)
    behaviorSubject.onNext(2)
    behaviorSubject.subscribe {
        println(it)
    }
    behaviorSubject.onNext(3)
    behaviorSubject.onNext(4)
}