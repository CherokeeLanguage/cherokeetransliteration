/*
* Copyright cobradoc.com
* LGPL license
* You are free to use this software, sell it, trade it, burn it, or even use it to change the world...but we're not responsible for any badness.
* You must include this disclaimer in your usages along with the email of the original creator of this software: cobradoc@gmail.com
*
* Enjoy!  And don't do bad stuff.
*/
$(function() {
    function appender(value) {
        $('#transliteration').append(value);
        $('#transliteration').append('<br/>');
    }

    /**
     * This should match what's in the SyllabaryTest
     */
    function runTests() {
        appender('ᎠᎡᎢᎣᎤᎥᎦ' == SyllabaryUtil.tsalagiToSyllabary('aeiouvga'));
        appender('ᎧᎨᎩᎪᎫᎬ' == SyllabaryUtil.tsalagiToSyllabary('kagegigogugv'));
        appender('ᎳᎴᎵᎶᎷᎸ' == SyllabaryUtil.tsalagiToSyllabary('lalelilolulv'));
        appender('ᎹᎺᎻᎼᎽ' == SyllabaryUtil.tsalagiToSyllabary('mamemimomu'));
        appender('ᎿᏀ' == SyllabaryUtil.tsalagiToSyllabary('hnanah'));
        appender('Ꮝ' == SyllabaryUtil.tsalagiToSyllabary('s'));
        appender('ᎾᏁᏂᏃᏄᏅ' == SyllabaryUtil.tsalagiToSyllabary('naneninonunv'));
        appender('ᏆᏇᏈᏉᏊᏋ' == SyllabaryUtil.tsalagiToSyllabary('quaquequiquoquuquv'));
        appender('ᏌᏎᏏᏐᏑᏒ' == SyllabaryUtil.tsalagiToSyllabary('sasesisosusv'));
        appender('ᏓᏕᏗᏙᏚᏛ' == SyllabaryUtil.tsalagiToSyllabary('dadedidodudv'));
        appender('ᏔᏖᏘ' == SyllabaryUtil.tsalagiToSyllabary('tateti'));
        appender('ᏣᏤᏥᏦᏧᏨ' == SyllabaryUtil.tsalagiToSyllabary('jajejijojujv'));
        appender('Ꮬ' == SyllabaryUtil.tsalagiToSyllabary('dla'));
        appender('ᏝᏞᏟᏠᏡᏢ' == SyllabaryUtil.tsalagiToSyllabary('tlatletlitlotlutlv'));
        appender('ᏩᏪᏫᏬᏭᏮ' == SyllabaryUtil.tsalagiToSyllabary('wawewiwowuwv'));
        appender('ᏯᏰᏱᏲᏳᏴ' == SyllabaryUtil.tsalagiToSyllabary('yayeyiyoyuyv'));
        appender('ᏀᎿᏀ' == SyllabaryUtil.tsalagiToSyllabary('nahhnanah'));
        appender('ᎿᏀᎿ' == SyllabaryUtil.tsalagiToSyllabary('hnanahhna'));


        appender('ᎿᏀᎿ' == SyllabaryUtil.parseHyphen('hna-nah-hna'));

        appender('ᏣᎳᎩ' == SyllabaryUtil.tsalagiToSyllabary("tsalagi"));
        appender('ᎠᏆᏚᎵᎭ' == SyllabaryUtil.tsalagiToSyllabary("aquaduliha"));

        appender('ᏣᎳᎩ' == SyllabaryUtil.tsalagiToSyllabary("jalagi"));
        appender('ᎠᏆᏚᎵᎭ' == SyllabaryUtil.tsalagiToSyllabary("agwaduliha"));

        appender('ᏞᏟᏠᏡᏢ' == SyllabaryUtil.tsalagiToSyllabary("tletlitlotlutlv"));
        appender('ᏞᏟᏠᏡᏢ' == SyllabaryUtil.tsalagiToSyllabary("dledlidlodludlv"));
        appender(SyllabaryUtil.tsalagiToSyllabary("tletlitlotlutlv")  == SyllabaryUtil.tsalagiToSyllabary("dledlidlodludlv"));

        appender('ᏒᎦᏔ' == SyllabaryUtil.tsalagiToSyllabary('svgata'));
        appender('Ꮢnot a valid letterᏔ' == SyllabaryUtil.tsalagiToSyllabary('svkta'));
        appender('ᏒᏍᏒᎪ' == SyllabaryUtil.tsalagiToSyllabary('svssvgo'));

        testCH();
    }

    function testCH() {
        appender('jv' == SyllabaryUtil.tsalagiToSyllabary('chv'));
        appender('ᎠᏂᏨᏯ' == SyllabaryUtil.tsalagiToSyllabary('anichvya'));
    }

    runTests();
});