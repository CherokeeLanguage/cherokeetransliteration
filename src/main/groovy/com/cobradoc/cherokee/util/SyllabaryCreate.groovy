package com.cobradoc.cherokee.util

/**
 * This file was to create rows of syllabary so I could use them in transliteration integration tests
 * @author torr
 * @since 6/20/13
 */


def formVoltron(letter) {
    def sb = new StringBuffer();
    ['a','e','i','o','u','v'].each {
        sb << "$letter$it"
    }

    println sb
}

formVoltron('m')
formVoltron('n')
formVoltron('qu')
formVoltron('s')
formVoltron('d')
formVoltron('t')
formVoltron('w')
formVoltron('y')
