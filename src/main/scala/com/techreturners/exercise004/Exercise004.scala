package com.techreturners.exercise004

import java.time.{LocalDate, LocalDateTime}

class Exercise004(var date: LocalDate, var dateTime : LocalDateTime) {

  // Hint take a look at Scala auxiliary constructors
  // https://docs.scala-lang.org/overviews/scala-book/classes-aux-constructors.html

    // Constructs a "LocalDateTime" from a "LocalDate"
    // You might need to default the time to be something like midnight
    def this(date: LocalDate) = {
      this(date,LocalDateTime.of(date.getYear, date.getMonth, date.getDayOfMonth, 0, 0, 0))
    }

    // Constructs a "LocalDate" from a "LocalDateTime" [LocalDate Unused]
    def this(dateTime : LocalDateTime) = {
      this(LocalDate.of(dateTime.getYear, dateTime.getMonth, dateTime.getDayOfMonth),dateTime)
    }

    // GigaSecond = 10^9 (Didnt work! Equivalent scala.math.pow(10,9), Cast from Double toInt)
    def getDateTimeWithGigaSecond: LocalDateTime = dateTime.plusSeconds(scala.math.pow(10,9).toInt)
}
