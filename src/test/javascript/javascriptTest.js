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

        appender('ᏣᎳᎩ' == tsalagiToSyllabary(reverseReplace("tsalagi")))
        appender('ᎠᏆᏚᎵᎭ' == tsalagiToSyllabary(reverseReplace("aquaduliha")))

        appender('ᏣᎳᎩ' == tsalagiToSyllabary(replace("jalagi")))
        appender('ᎠᏆᏚᎵᎭ' == tsalagiToSyllabary(replace("agwaduliha")))

        appender('ᏞᏟᏠᏡᏢ' == tsalagiToSyllabary(replace("tletlitlotlutlv")))
        appender('ᏞᏟᏠᏡᏢ' == tsalagiToSyllabary(replace("dledlidlodludlv")))
        appender(tsalagiToSyllabary(replace("tletlitlotlutlv"))  == tsalagiToSyllabary(replace("dledlidlodludlv")))
    }

    runTests();
});