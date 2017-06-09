package io.github.dagezi.lambdatest

fun lambdaTest() {
    for (i in 0..1) {
        hoge(Runnable {  })
    }
}

fun hoge(r : Runnable) {
    System.out.println(r)
}