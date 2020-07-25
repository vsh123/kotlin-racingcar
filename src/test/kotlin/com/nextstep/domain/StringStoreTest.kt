package com.nextstep.domain

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException

internal class StringStoreTest {
    @Test
    fun `짝수번째 인덱스가 숫자가 아니라면 에러를 발생한다`() {
        val string = "a + 2"

        Assertions.assertThrows(
            NumberFormatException::class.java
        ) { StringStore(string) }
    }

    @Test
    fun `홀수번째 인덱스가 연산자가 아니라면 에러를 발생한다`() {
        val string = "1 asd 2"

        Assertions.assertThrows(
            IllegalArgumentException::class.java
        ) { StringStore(string) }
    }

    @Test
    fun `split한 문자열이 홀수개가 아닐경우 에러를 발생한다`() {
        val string = "1 + "

        Assertions.assertThrows(
            IllegalArgumentException::class.java
        ) { StringStore(string) }
    }
}
