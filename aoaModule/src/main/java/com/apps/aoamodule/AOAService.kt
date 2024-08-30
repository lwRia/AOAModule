package com.apps.aoamodule

import java.util.regex.Matcher
import java.util.regex.Pattern

class AOAService {
    fun isValid(email: String): Boolean {
        val regexPattern: Pattern =
            Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$")
        val regMatcher: Matcher = regexPattern.matcher(email)
        return regMatcher.matches()
    }
}