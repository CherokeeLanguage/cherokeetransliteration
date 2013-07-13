/*
* Copyright cobradoc.com
* LGPL license
* You are free to use this software, sell it, trade it, burn it, or even use it to change the world...but we're not responsible for any badness.
* You must include this disclaimer in your usages along with the email of the original creator of this software: cobradoc@gmail.com
*
* Enjoy!  And don't do bad stuff.
*/
package com.cobradoc.cherokee

/**
 *
 * @author torr
 * @since 6/20/13
 */
class SyllabaryTest extends GroovyTestCase {
    public void testSyllabary() {
        def su = new SyllabaryUtil();
        assertTrue ('ᎠᎡᎢᎣᎤᎥᎦ' == su.tsalagiToSyllabary('aeiouvga'))
        assertTrue ('ᎧᎨᎩᎪᎫᎬ' == su.tsalagiToSyllabary('kagegigogugv'))
        assertTrue ('ᎳᎴᎵᎶᎷᎸ' == su.tsalagiToSyllabary('lalelilolulv'))
        assertTrue ('ᎹᎺᎻᎼᎽ' == su.tsalagiToSyllabary('mamemimomu'))
        assertTrue ('ᎿᏀ' == su.tsalagiToSyllabary('hnanah'))
        assertTrue ('Ꮝ' == su.tsalagiToSyllabary('s'))
        assertTrue ('ᎾᏁᏂᏃᏄᏅ' == su.tsalagiToSyllabary('naneninonunv'))
        assertTrue ('ᏆᏇᏈᏉᏊᏋ' == su.tsalagiToSyllabary('quaquequiquoquuquv'))
        assertTrue ('ᏌᏎᏏᏐᏑᏒ' == su.tsalagiToSyllabary('sasesisosusv'))
        assertTrue ('ᏓᏕᏗᏙᏚᏛ' == su.tsalagiToSyllabary('dadedidodudv'))
        assertTrue ('ᏔᏖᏘ' == su.tsalagiToSyllabary('tateti'))
        assertTrue ('ᏣᏤᏥᏦᏧᏨ' == su.tsalagiToSyllabary('jajejijojujv'))
        assertTrue ('Ꮬ' == su.tsalagiToSyllabary('dla'))
        assertTrue ('ᏝᏞᏟᏠᏡᏢ' == su.tsalagiToSyllabary('tlatletlitlotlutlv'))
        assertTrue ('ᏩᏪᏫᏬᏭᏮ' == su.tsalagiToSyllabary('wawewiwowuwv'))
        assertTrue ('ᏯᏰᏱᏲᏳᏴ' == su.tsalagiToSyllabary('yayeyiyoyuyv'))
        assertTrue('ᏀᎿᏀ' == su.tsalagiToSyllabary('nahhnanah'))
        assertTrue('ᎿᏀᎿ' == su.tsalagiToSyllabary('hnanahhna'))

        assertTrue('ᎿᏀᎿ' == su.parseHyphen('hna-nah-hna'));

        assertTrue('ᏣᎳᎩ' == su.tsalagiToSyllabary("tsalagi"))
        assertTrue('ᎠᏆᏚᎵᎭ' == su.tsalagiToSyllabary("aquaduliha"))

        assertTrue('ᏣᎳᎩ' == su.tsalagiToSyllabary("jalagi"))
        assertTrue('ᎠᏆᏚᎵᎭ' == su.tsalagiToSyllabary("agwaduliha"))

        assertTrue('ᏞᏟᏠᏡᏢ' == su.tsalagiToSyllabary("tletlitlotlutlv"))
        assertTrue('ᏞᏟᏠᏡᏢ' == su.tsalagiToSyllabary("dledlidlodludlv"))
        assertTrue su.tsalagiToSyllabary("tletlitlotlutlv")  == su.tsalagiToSyllabary("dledlidlodludlv")
        assertTrue('ᏓᏩᏙᎠ' == su.tsalagiToSyllabary("dawatoa"))
        assertTrue('ᏓᏩᏙᎠ' == su.tsalagiToSyllabary("dawadoa"))
        assertTrue(su.tsalagiToSyllabary("dawadoa") == su.tsalagiToSyllabary("dawatoa"))

        assertTrue('ᏓᏩᏙᎠ' == su.parseHyphen('da-wa-to-a'));
    }

    public void testPhrases() {
        def su = new SyllabaryUtil();
        assertTrue('ᏣᎳᎩ' == su.tsalagiToSyllabary('jalagi'))
        assertTrue('ᏣᎳᎩᏍᎩ' == su.tsalagiToSyllabary('jalagisgi'));
        assertTrue('ᏙᎾᏓᎪᎲᎢ' == su.tsalagiToSyllabary('donadagohvi'));
        assertTrue('ᏙᏓᏓᎪᎲᎢ' == su.tsalagiToSyllabary('dodadagohvi'));
    }

    public void testSyllabaryParsing() {
        def su = new SyllabaryUtil();
        assertTrue('tletlitlotlutlv' == su.parseSyllabary('ᏞᏟᏠᏡᏢ'));
    }

    public void testSentences() {
        def su = new SyllabaryUtil();
        assertTrue('ᏌᏊ  ᎠᏲᏟ  ᎠᎩᎧᎭ.' == su.tsalagiToSyllabary('saquu ayotli agikaha.'));
    }
}
