/*
* Copyright cobradoc.com
* LGPL license
* You are free to use this software, sell it, trade it, burn it, or even use it to change the world...but we're not responsible for any badness.
* You must include this disclaimer in your usages along with the email of the original creator of this software: cobradoc@gmail.com
*
* Enjoy!  And don't do bad stuff.
*/
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