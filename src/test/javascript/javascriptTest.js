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
        appender('ᎠᎡᎢᎣᎤᎥᎦ' == tsalagiToSyllabary('aeiouvga'));
        appender('ᎧᎨᎩᎪᎫᎬ' == tsalagiToSyllabary('kagegigogugv'));
        appender('ᎳᎴᎵᎶᎷᎸ' == tsalagiToSyllabary('lalelilolulv'));
        appender('ᎹᎺᎻᎼᎽ' == tsalagiToSyllabary('mamemimomu'));
        appender('ᎿᏀ' == tsalagiToSyllabary('hnanah'));
        appender('Ꮝ' == tsalagiToSyllabary('s'));
        appender('ᎾᏁᏂᏃᏄᏅ' == tsalagiToSyllabary('naneninonunv'));
        appender('ᏆᏇᏈᏉᏊᏋ' == tsalagiToSyllabary('quaquequiquoquuquv'));
        appender('ᏌᏎᏏᏐᏑᏒ' == tsalagiToSyllabary('sasesisosusv'));
        appender('ᏓᏕᏗᏙᏚᏛ' == tsalagiToSyllabary('dadedidodudv'));
        appender('ᏔᏖᏘ' == tsalagiToSyllabary('tateti'));
        appender('ᏣᏤᏥᏦᏧᏨ' == tsalagiToSyllabary('jajejijojujv'));
        appender('Ꮬ' == tsalagiToSyllabary('dla'));
        appender('ᏝᏞᏟᏠᏡᏢ' == tsalagiToSyllabary('tlatletlitlotlutlv'));
        appender('ᏩᏪᏫᏬᏭᏮ' == tsalagiToSyllabary('wawewiwowuwv'));
        appender('ᏯᏰᏱᏲᏳᏴ' == tsalagiToSyllabary('yayeyiyoyuyv'));
        appender('ᏀᎿᏀ' == tsalagiToSyllabary('nahhnanah'));
        appender('ᎿᏀᎿ' == tsalagiToSyllabary('hnanahhna'));


        appender('ᎿᏀᎿ' == parseHyphen('hna-nah-hna'));

        appender('ᏣᎳᎩ' == tsalagiToSyllabary("tsalagi"));
        appender('ᎠᏆᏚᎵᎭ' == tsalagiToSyllabary("aquaduliha"));

        appender('ᏣᎳᎩ' == tsalagiToSyllabary("jalagi"));
        appender('ᎠᏆᏚᎵᎭ' == tsalagiToSyllabary("agwaduliha"));

        appender('ᏞᏟᏠᏡᏢ' == tsalagiToSyllabary("tletlitlotlutlv"));
        appender('ᏞᏟᏠᏡᏢ' == tsalagiToSyllabary("dledlidlodludlv"));
        appender(tsalagiToSyllabary("tletlitlotlutlv")  == tsalagiToSyllabary("dledlidlodludlv"));

        appender('ᏒᎦᏔ' == tsalagiToSyllabary('svgata'));
        appender('Ꮢnot a valid letterᏔ' == tsalagiToSyllabary('svkta'));
        appender('ᏒᏍᏒᎪ' == tsalagiToSyllabary('svssvgo'));

        testCH();
    }

    function testCH() {
        appender('jv' == tsalagiToSyllabary('chv'));
        appender('ᎠᏂᏨᏯ' == tsalagiToSyllabary('anichvya'));
    }

    runTests();
});