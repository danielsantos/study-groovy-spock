package com.gank

import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class BasicsTests extends Specification {

    def "maximo entre dois numeros - primeira forma"() {
        expect:
        Math.max(a, b) == c

        where:
        a << [3, 5, 9]
        b << [7, 4, 9]
        c << [7, 5, 9]
    }

    def "maximo entre dois numeros - segunda forma"() {
        expect:
        Math.max(a, b) == c

        where:
        a | b | c
        3 | 5 | 5
    }

    def "minimo entre dois numeros"() {
        expect:
        Math.min(a, b) == c

        where:
        a | b || c
        3 | 7 || 3
        5 | 4 || 4
        9 | 9 || 9
    }

    def "#person.name is a #sex.toLowerCase() person"() {
        expect:
        person.getSex() == sex

        where:
        person                    || sex
        new Person(name: "Fred")  || "Male"
        new Person(name: "Wilma") || "Female"
    }

    static class Person {
        String name
        String getSex() {
            name == "Fred" ? "Male" : "Female"
        }
    }

}
