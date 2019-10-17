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
        assertTrue ('ᎠᎡᎢᎣᎤᎥᎦ' == SyllabaryUtil.tsalagiToSyllabary('aeiouvga'))
        assertTrue ('ᎧᎨᎩᎪᎫᎬ' == SyllabaryUtil.tsalagiToSyllabary('kagegigogugv'))
        assertTrue ('ᎳᎴᎵᎶᎷᎸ' == SyllabaryUtil.tsalagiToSyllabary('lalelilolulv'))
        assertTrue ('ᎹᎺᎻᎼᎽ' == SyllabaryUtil.tsalagiToSyllabary('mamemimomu'))
        assertTrue ('ᎿᏀ' == SyllabaryUtil.tsalagiToSyllabary('hnanah'))
        assertTrue ('Ꮝ' == SyllabaryUtil.tsalagiToSyllabary('s'))
        assertTrue ('ᎾᏁᏂᏃᏄᏅ' == SyllabaryUtil.tsalagiToSyllabary('naneninonunv'))
        assertTrue ('Ꮎ' == SyllabaryUtil.tsalagiToSyllabary('na'))
        assertTrue ('ᏆᏇᏈᏉᏊᏋ' == SyllabaryUtil.tsalagiToSyllabary('quaquequiquoquuquv'))
        assertTrue ('ᏌᏎᏏᏐᏑᏒ' == SyllabaryUtil.tsalagiToSyllabary('sasesisosusv'))
        assertTrue ('ᏓᏕᏗᏙᏚᏛ' == SyllabaryUtil.tsalagiToSyllabary('dadedidodudv'))
        //variation of 'du' and 'dv'
        assertTrue ('ᏚᏛ' == SyllabaryUtil.tsalagiToSyllabary('tutv'))
        assertTrue ('ᏔᏖᏘ' == SyllabaryUtil.tsalagiToSyllabary('tateti'))
        assertTrue ('ᏣᏤᏥᏦᏧᏨ' == SyllabaryUtil.tsalagiToSyllabary('jajejijojujv'))
        assertTrue ('Ꮬ' == SyllabaryUtil.tsalagiToSyllabary('dla'))
        assertTrue ('ᏝᏞᏟᏠᏡᏢ' == SyllabaryUtil.tsalagiToSyllabary('tlatletlitlotlutlv'))
        assertTrue ('ᏩᏪᏫᏬᏭᏮ' == SyllabaryUtil.tsalagiToSyllabary('wawewiwowuwv'))
        assertTrue ('ᏯᏰᏱᏲᏳᏴ' == SyllabaryUtil.tsalagiToSyllabary('yayeyiyoyuyv'))
        assertTrue('ᏀᎿᏀ' == SyllabaryUtil.tsalagiToSyllabary('nahhnanah'))
        assertTrue('ᎿᏀᎿ' == SyllabaryUtil.tsalagiToSyllabary('hnanahhna'))

        assertTrue('ᎿᏀᎿ' == SyllabaryUtil.parseHyphen('hna-nah-hna'));

        assertTrue('ᏣᎳᎩ' == SyllabaryUtil.tsalagiToSyllabary("tsalagi"))
        assertTrue('ᎠᏆᏚᎵᎭ' == SyllabaryUtil.tsalagiToSyllabary("aquaduliha"))

        assertTrue('ᏣᎳᎩ' == SyllabaryUtil.tsalagiToSyllabary("jalagi"))
        assertTrue('ᎠᏆᏚᎵᎭ' == SyllabaryUtil.tsalagiToSyllabary("agwaduliha"))

        assertTrue('ᏞᏟᏠᏡᏢ' == SyllabaryUtil.tsalagiToSyllabary("tletlitlotlutlv"))
        assertTrue('ᏞᏟᏠᏡᏢ' == SyllabaryUtil.tsalagiToSyllabary("dledlidlodludlv"))
        assertTrue SyllabaryUtil.tsalagiToSyllabary("tletlitlotlutlv")  == SyllabaryUtil.tsalagiToSyllabary("dledlidlodludlv")
        assertTrue('ᏓᏩᏙᎠ' == SyllabaryUtil.tsalagiToSyllabary("dawatoa"))
        assertTrue('ᏓᏩᏙᎠ' == SyllabaryUtil.tsalagiToSyllabary("dawadoa"))
        assertTrue(SyllabaryUtil.tsalagiToSyllabary("dawadoa") == SyllabaryUtil.tsalagiToSyllabary("dawatoa"))

        assertTrue('ᏓᏩᏙᎠ' == SyllabaryUtil.parseHyphen('da-wa-to-a'));

        assertTrue('ᏒᎦᏔ' == SyllabaryUtil.tsalagiToSyllabary('svgata'))
        assertTrue('Ꮢnot a valid letterᏔ' == SyllabaryUtil.tsalagiToSyllabary('svkta'))
        assertTrue('ᏒᏍᏒᎪ' == SyllabaryUtil.tsalagiToSyllabary('svssvgo'))
    }

    public void testPhrases() {
        assertTrue('ᏣᎳᎩ' == SyllabaryUtil.tsalagiToSyllabary('jalagi'))
        assertTrue('ᏣᎳᎩᏍᎩ' == SyllabaryUtil.tsalagiToSyllabary('jalagisgi'));
        assertTrue('ᏙᎾᏓᎪᎲᎢ' == SyllabaryUtil.tsalagiToSyllabary('donadagohvi'));
        assertTrue('ᏙᏓᏓᎪᎲᎢ' == SyllabaryUtil.tsalagiToSyllabary('dodadagohvi'));
    }

    public void testSyllabaryParsing() {
        assertTrue('tletlitlotlutlv' == SyllabaryUtil.parseSyllabary('ᏞᏟᏠᏡᏢ'));
    }

    public void testSentences() {
        def TEXT = 'saquu ayotli agikaha.'
        assertTrue('ᏌᏊ ᎠᏲᏟ ᎠᎩᎧᎭ.' == SyllabaryUtil.tsalagiToSyllabary(TEXT));
        assertTrue('ᏌᏊ ᎠᏲᏟ ᎠᎩᎧᎭ.' == SyllabaryUtil.tsalagiToSyllabary('sa-quu a-yo-tli a-gi-ka-ha.'))

    }

    public void testBadInput() {
        assertTrue('not a valid letter' == SyllabaryUtil.tsalagiToSyllabary('k'))
        assertTrue('not a valid letter' == SyllabaryUtil.tsalagiToSyllabary('l'))
        assertTrue("not a valid letter" == SyllabaryUtil.tsalagiToSyllabary('m'))
        assertTrue("not a valid letter" == SyllabaryUtil.tsalagiToSyllabary('n'))
        assertTrue("not a valid letter" == SyllabaryUtil.tsalagiToSyllabary('q'))
        assertTrue("not a valid letter" == SyllabaryUtil.tsalagiToSyllabary('t'))
        assertTrue("not a valid letter" == SyllabaryUtil.tsalagiToSyllabary("w"))


        assertTrue("not a valid letternot a valid letter" == SyllabaryUtil.tsalagiToSyllabary('ly'))
        assertTrue("not a valid letternot a valid letter" == SyllabaryUtil.tsalagiToSyllabary('my'))
        assertTrue("not a valid letternot a valid letter" == SyllabaryUtil.tsalagiToSyllabary('ny'))
        assertTrue("not a valid letternot a valid letter" == SyllabaryUtil.tsalagiToSyllabary('qy'))
        assertTrue("not a valid letternot a valid letter" == SyllabaryUtil.tsalagiToSyllabary('tl'))
        assertTrue("not a valid letternot a valid letter" == SyllabaryUtil.tsalagiToSyllabary("ty"))
        assertTrue("not a valid letterᏍ" == SyllabaryUtil.tsalagiToSyllabary("ts"))
        assertTrue("not a valid letternot a valid letter" == SyllabaryUtil.tsalagiToSyllabary("wy"))
        assertTrue("not a valid letternot a valid letter" == SyllabaryUtil.tsalagiToSyllabary("yy"))


        assertTrue("not a valid letterᏍnot a valid letter" == SyllabaryUtil.tsalagiToSyllabary("tsy"))

        assertTrue("not a valid letternot a valid letternot a valid letter" == SyllabaryUtil.tsalagiToSyllabary('tly'))
        assertTrue("not a valid letterᎤnot a valid letter" == SyllabaryUtil.tsalagiToSyllabary('quy'))
    }

    public void testReverseReplace() {
        assertTrue("gwa" == SyllabaryUtil.reverseReplace("qua"))

        assertTrue("gwe" == SyllabaryUtil.reverseReplace("que"))
        assertTrue("gwi" == SyllabaryUtil.reverseReplace("qui"))
        assertTrue("gwo" == SyllabaryUtil.reverseReplace("quo"))
        assertTrue("gwu" == SyllabaryUtil.reverseReplace("quu"))
        assertTrue("gwv" == SyllabaryUtil.reverseReplace("quv"))
        assertTrue("ja" == SyllabaryUtil.reverseReplace("tsa"))
        assertTrue("je" == SyllabaryUtil.reverseReplace("tse"))
        assertTrue("ji" == SyllabaryUtil.reverseReplace("tsi"))
        assertTrue("jo" == SyllabaryUtil.reverseReplace("tso"))
        assertTrue("ju" == SyllabaryUtil.reverseReplace("tsu"))
        assertTrue("jv" == SyllabaryUtil.reverseReplace("tsv"))
        assertTrue("tle" == SyllabaryUtil.reverseReplace("dle"))
        assertTrue("tli" == SyllabaryUtil.reverseReplace("dli"))
        assertTrue("tlo" == SyllabaryUtil.reverseReplace("dlo"))
        assertTrue("tlu" == SyllabaryUtil.reverseReplace("dlu"))
        assertTrue("tlv" == SyllabaryUtil.reverseReplace("dlv"))
    }

    public void testReplace() {
        assertTrue("wado" == SyllabaryUtil.replace("wa-do", true));
    }

    public void testCH() {
        assertTrue("jv" == SyllabaryUtil.reverseReplace("chv"));
        assertTrue("ᎠᏂᏨᏯ" == SyllabaryUtil.tsalagiToSyllabary("anichvya"));
    }

    public void testDurbinFeelingSpellings() {
        assertTrue("ᏯᏖᎾ" == SyllabaryUtil.tsalagiToSyllabary("hyahtena"));
        assertTrue("ᏯᏙᏟ" == SyllabaryUtil.tsalagiToSyllabary("hyahtohli"));
        assertTrue("ᏰᎦᏟ" == SyllabaryUtil.tsalagiToSyllabary("hyehgahli"));
        assertTrue("ᎢᎦᎷᎦ" == SyllabaryUtil.tsalagiToSyllabary("igaluhga"));
        assertTrue("ᏗᏰᎦᏟ" == SyllabaryUtil.tsalagiToSyllabary("dihyehgahli"));
        assertTrue("ᎥᎤᎷᏨᎢ,ᎤᎷᏨᎢ" == SyllabaryUtil.tsalagiToSyllabary("vuluhjvi,uluhjvi"));

//        assertTrue("ᎯᎩᏍᎪ ᎢᎳᏏᏗ ᎢᎦᏅᎯᏓ ᏍᏕᏱᏓ ᎤᏮᏔᏅ ᏩᎦ ᎠᎩᎾ ᎠᏍᎳᏗᏍᎬᎢ." == SyllabaryUtil.tsalagiToSyllabary("Hiksgo ilasihdi iganvhida sdeyida uwhtanv wahga agina asladisgvi."));
        assertTrue("ᎯᎳ ᎢᎩᏓ ᎠᎵᏍᏇᏚᏬ ᎭᎵᏍᏇᏚᎲᏍᎩ?" == SyllabaryUtil.tsalagiToSyllabary("Hila ikida alisgwetuwo halisgwetuhvsgi?"));
        assertTrue("ᏍᎪᎯ ᎢᎳᏏᏗ ᏂᎦᏅᎭ" == SyllabaryUtil.tsalagiToSyllabary("Sgohi ilasihdi niganvha"));
        assertTrue("ᎢᎸᎯᏳᎢᏍ ᎢᎾᏓ ᏣᎦᏟᏨᎢ" == SyllabaryUtil.tsalagiToSyllabary("Ilvhiyuis inada tsagahlijvi"));
        assertTrue("ᎢᎸᏍᎩ ᎢᏳᏟᎶᏓ ᎡᎳᏗ ᎤᏂᎩᏒᎢ ᎩᎳ ᎤᏓᏣᏁᎸᎢ" == SyllabaryUtil.tsalagiToSyllabary("Ilvsgi iyuhliloda eladi uhnigisvi kila udajanelvi"));
    }


    public void testSyllabaryParse() {
        def value = "ᎠᏕᎳᎰᎯᏍᏗ (w) ᎬᏕᎳᏦᎯᏍᏙᏗ  (e)"
        assertEquals("adelahohisdi (w) gvdelatsohisdodi  (e)", SyllabaryUtil.parseSyllabaryWithPunctuationAndLatin(value))

        value = "ᎠᏕᎳᎰᎯᏍᏗ/ᎬᏕᎳᏦᎯᏍᏙᏗ"
        assertEquals("adelahohisdi/gvdelatsohisdodi", SyllabaryUtil.parseSyllabaryWithPunctuationAndLatin(value))

        value = "ᎠᏕᎳᎰᎯᏍᏗ,ᎬᏕᎳᏦᎯᏍᏙᏗ"
        assertEquals("adelahohisdi,gvdelatsohisdodi", SyllabaryUtil.parseSyllabaryWithPunctuationAndLatin(value))
    }

    public void testTsJ() {
        def value = "ᏥᏍᏆ"
        assertEquals(value, SyllabaryUtil.tsalagiToSyllabary("tsisqua"))
        assertEquals(value, SyllabaryUtil.tsalagiToSyllabary("tsisgwa"))
        assertEquals(value, SyllabaryUtil.tsalagiToSyllabary("jisqua"))
        assertEquals(value, SyllabaryUtil.tsalagiToSyllabary("jisgwa"))
        assertEquals(value, SyllabaryUtil.tsalagiToSyllabary("Tsisqua"))
        assertEquals(value, SyllabaryUtil.tsalagiToSyllabary("Tsisgwa"))
        assertEquals(value, SyllabaryUtil.tsalagiToSyllabary("Jisqua"))
        assertEquals(value, SyllabaryUtil.tsalagiToSyllabary("Jisgwa"))

        assertEquals(value, SyllabaryUtil.tsalagiToSyllabary(SyllabaryUtil.replace("Jisgwa".toLowerCase())))
        assertEquals(value, SyllabaryUtil.tsalagiToSyllabary(SyllabaryUtil.replace("jisqua")))
    }

    public void testMixed() {
        def su = new SyllabaryUtil()
        def value = "achuja ani<e>Ridge <e>Baltimore"
        assertEquals("ᎠᏧᏣ ᎠᏂRidge Baltimore", SyllabaryUtil.mixedTransliteration(value).trim())
    }

    public void testNewLine() {
        def text = """Sogwo gola usvhi atsehi etsodv, anigayotli unenai ani<e>Ridge 
anisgaya, Ugidatlinvya geli unadadasgisane atsvsdv gasgilv,
unega goweli unisae, udelada unisdayide kanohedv datsohisdv,
uninadinvsele amayeli nigada tsalagiyi ayeli gado, anelisge osda
adalenisgv, yuninohelvna, getsikahiyvsdi, atsehi yuwiyasdi nahna
gesv. Unadadasgv unisdayidona goweli, sogwo nuwese, Gelisgvno
igvsa igadahisdodi idisdayidv. Udohiyuhe nuwesv.<br/>
Kanohedv datsohisdv gowelanv, adanetlasge unenai aniyvwiya
unadaniyasdigwo, tsunisgwanigododigwo duniniyvhv - gado
nole daninigilv nole anihutsa duninasav - amayeli anehi
iyanalisdisgi. Osiyu nigesvna. Ayano gesv osigwo agiyelvhv, Geli
nole U gidatlinvya dvnadaniyi <e>Cranshaw, nole nav edohv Geli duga
aginehv, yeligwo gohosdi ulisdodi,, udanvdo dvwanvhisani.
Unega didanelv wulutsa kanohedv datsohisdv, ulisgasedane
tsegisini, gesdi gilo asuyagidv yigi udvne. Nigada aniyvwiya
unenvsdi udulisge, gesdi gohosdi yelisge iyunena gesv ale
iyuninega gesv, uwowelagise sginana adanetlv .<br/>
Agayvli utsetsisdi usgwadone tsanela tsudetiyvda, ulenvhe
uwasa ehv <e>Nashville doye, osda uyelvhe uwoyeni gvti yuselidola
nigvnadv gado, nasgwo ulvnidisgv. <e>Van <e>Buren usdawadvse
tsegisini ayelisv aniyvwiya tsunalasidodi, nasgiya adawosgi
tsuniyisgo ganahugisgv.<br/>
Udetiyvsadisv yanilugvna aniyosgi, ani<e>Ridge unadadasgv
unalenvhe danihiyasgv tsunanesgedv disdosdi, digasosdodi
tsiyu, dunadananv nole ditsoosdodi, wudeligv itsa anege, gayotli
dunatinvse anihutsa duninasav, wunvgvdv ohani unenvsdi. Igada
unega uninegali unenai aniyvwiya unadanvtele unatelagisdi
anitsalagi, unadasuyodi aniyuwanega, aseno dudatsohisdv
tsatsiya, daniniyisge tsunaligidv, asegwo nigav yvwiya giga
uninehi, danigahiyvsge wudeligv itsa, tsudugodanedi iyusdi
nigegvnehe.<br/>
Gunadalegi nole anineli amo edohi tsiyu unanigese, utlisda
nole gohosdi yinigalisdisgvna, <e>Boudinot nole awina <e>Ridge nole
tsunadali ulihelisdi nunvnele anegv."""
        def translit = SyllabaryUtil.mixedTransliteration(text)
//        println translit
    }

    public void testDurbinFeelingSpellingsNew() {
        assertTrue("ᏯᏖᎾ" == SyllabaryUtil.newTsalagiToSyllabary("hyahtena", false));
        assertTrue("ᏯᏙᏟ" == SyllabaryUtil.newTsalagiToSyllabary("hyahtohli", false));
        assertTrue("ᏰᎦᏟ" == SyllabaryUtil.newTsalagiToSyllabary("hyehgahli", false));
        assertTrue("ᎢᎦᎷᎦ" == SyllabaryUtil.newTsalagiToSyllabary("igaluhga", false));
        assertTrue("ᏗᏰᎦᏟ" == SyllabaryUtil.newTsalagiToSyllabary("dihyehgahli", false));
        assertTrue("ᎥᎤᎷᏨᎢ,ᎤᎷᏨᎢ" == SyllabaryUtil.newTsalagiToSyllabary("vuluhjvi,uluhjvi", false));

        assertTrue("ᎯᎳ ᎢᎩᏓ ᎠᎵᏍᏇᏚᏬ ᎭᎵᏍᏇᏚᎲᏍᎩ?" == SyllabaryUtil.newTsalagiToSyllabary("Hila ikida alisgwetuwo halisgwetuhvsgi?", false));
        assertTrue("ᏍᎪᎯ ᎢᎳᏏᏗ ᏂᎦᏅᎭ" == SyllabaryUtil.newTsalagiToSyllabary("Sgohi ilasihdi niganvha", false));
        assertTrue("ᎢᎸᎯᏳᎢᏍ ᎢᎾᏓ ᏣᎦᏟᏨᎢ" == SyllabaryUtil.newTsalagiToSyllabary("Ilvhiyuis inada tsagahlijvi", false));
        assertTrue("ᎢᎸᏍᎩ ᎢᏳᏟᎶᏓ ᎡᎳᏗ ᎤᏂᎩᏒᎢ ᎩᎳ ᎤᏓᏣᏁᎸᎢ" == SyllabaryUtil.newTsalagiToSyllabary("Ilvsgi iyuhliloda eladi uhnigisvi kila udajanelvi", false));
    }
}
