/*
* Copyright cobradoc.com
* LGPL license
* You are free to use this software, sell it, trade it, burn it, or even use it to change the world...but we're not responsible for any badness.
* You must include this disclaimer in your usages along with the email of the original creator of this software: cobradoc@gmail.com
*
* Enjoy!  And don't do bad stuff.
*/
package com.cobradoc.cherokee;

//TODO: move each letter itaration out to its own method - need to figure out a way to handle it so it will increment correctly
// the idea being that in the end the code will be almost identical for JS and Groovy
public class SyllabaryUtil {
    static def syllabaryMap = ["Ꭰ" : "a",
    "Ꭱ" : "e",
    "Ꭲ" : "i",
    "Ꭳ" : "o",
    "Ꭴ" : "u",
    "Ꭵ" : "v",
    "Ꭶ" : "ga",
    "Ꭷ" : "ka",
    "Ꭸ" : "ge",
    "Ꭹ" : "gi",
    "Ꭺ" : "go",
    "Ꭻ" : "gu",
    "Ꭼ" : "gv",
    "Ꭽ" : "ha",
    "Ꭾ" : "he",
    "Ꭿ" : "hi",
    "Ꮀ" : "ho",
    "Ꮁ" : "hu",
    "Ꮂ" : "hv",
    "Ꮃ" : "la",
    "Ꮄ" : "le",
    "Ꮅ" : "li",
    "Ꮆ" : "lo",
    "Ꮇ" : "lu",
    "Ꮈ" : "lv",
    "Ꮉ" : "ma",
    "Ꮊ" : "me",
    "Ꮋ" : "mi",
    "Ꮌ" : "mo",
    "Ꮍ" : "mu",
    "Ꮎ" : "na",
    "Ꮏ" : "hna",
    "Ꮐ" : "nah",
    "Ꮑ" : "ne",
    "Ꮒ" : "ni",
    "Ꮓ" : "no",
    "Ꮔ" : "nu",
    "Ꮕ" : "nv",
    "Ꮖ" : "qua",
    "Ꮗ" : "que",
    "Ꮘ" : "qui",
    "Ꮙ" : "quo",
    "Ꮚ" : "quu",
    "Ꮛ" : "quv",
    "Ꮜ" : "sa",
    "Ꮝ" : "s",
    "Ꮞ" : "se",
    "Ꮟ" : "si",
    "Ꮠ" : "so",
    "Ꮡ" : "su",
    "Ꮢ" : "sv",
    "Ꮣ" : "da",
    "Ꮤ" : "ta",
    "Ꮥ" : "de",
    "Ꮦ" : "te",
    "Ꮧ" : "di",
    "Ꮨ" : "ti",
    "Ꮩ" : "do",
//    "Ꮩ" : "to",
//    "Ꮪ" : "tu",
    "Ꮪ" : "du",
//    "Ꮫ" : "tv",
    "Ꮫ" : "dv",
    "Ꮬ" : "dla",
    "Ꮭ" : "tla",
    "Ꮮ" : "tle",
    "Ꮯ" : "tli",
    "Ꮰ" : "tlo",
    "Ꮱ" : "tlu",
    "Ꮲ" : "tlv",
    "Ꮳ" : "tsa",
    "Ꮴ" : "tse",
    "Ꮵ" : "tsi",
    "Ꮶ" : "tso",
    "Ꮷ" : "tsu",
    "Ꮸ" : "tsv",
    "Ꮹ" : "wa",
    "Ꮺ" : "we",
    "Ꮻ" : "wi",
    "Ꮼ" : "wo",
    "Ꮽ" : "wu",
    "Ꮾ" : "wv",
    "Ꮿ" : "ya",
    "Ᏸ" : "ye",
    "Ᏹ" : "yi",
    "Ᏺ" : "yo",
    "Ᏻ" : "yu",
    "Ᏼ" : "yv",
    " " : " "];

    static def syllabaryMap2 = ["a" : "Ꭰ",
    "e" : "Ꭱ",
    "i" : "Ꭲ",
    "o" : "Ꭳ",
    "u" : "Ꭴ",
    "v" : "Ꭵ",
    "ga" : "Ꭶ",
    "ka" : "Ꭷ",
    "ge" : "Ꭸ",
    "gi" : "Ꭹ",
    "go" : "Ꭺ",
    "gu" : "Ꭻ",
    "gv" : "Ꭼ",
    "ha" : "Ꭽ",
    "he" : "Ꭾ",
    "hi" : "Ꭿ",
    "ho" : "Ꮀ",
    "hu" : "Ꮁ",
    "hv" : "Ꮂ",
    "la" : "Ꮃ",
    "le" : "Ꮄ",
    "li" : "Ꮅ",
    "lo" : "Ꮆ",
    "lu" : "Ꮇ",
    "lv" : "Ꮈ",
    "ma" : "Ꮉ",
    "me" : "Ꮊ",
    "mi" : "Ꮋ",
    "mo" : "Ꮌ",
    "mu" : "Ꮍ",
    "na" : "Ꮎ",
    "hna" : "Ꮏ",
    "nah" : "Ꮐ",
    "ne" : "Ꮑ",
    "ni" : "Ꮒ",
    "no" : "Ꮓ",
    "nu" : "Ꮔ",
    "nv" : "Ꮕ",
    "qua" : "Ꮖ",
    "que" : "Ꮗ",
    "qui" : "Ꮘ",
    "quo" : "Ꮙ",
    "quu" : "Ꮚ",
    "quv" : "Ꮛ",
    "kwa" : "Ꮖ",
    "kwe" : "Ꮗ",
    "kwi" : "Ꮘ",
    "kwo" : "Ꮙ",
    "kwu" : "Ꮚ",
    "kwv" : "Ꮛ",
    "sa" : "Ꮜ",
    "s" : "Ꮝ",
    "se" : "Ꮞ",
    "si" : "Ꮟ",
    "so" : "Ꮠ",
    "su" : "Ꮡ",
    "sv" : "Ꮢ",
    "da" : "Ꮣ",
    "ta" : "Ꮤ",
    "de" : "Ꮥ",
    "te" : "Ꮦ",
    "di" : "Ꮧ",
    "ti" : "Ꮨ",
    "do" : "Ꮩ",
    "to" : "Ꮩ",
    "du" : "Ꮪ",
    "tu" : "Ꮪ",
    "dv" : "Ꮫ",
    "tv" : "Ꮫ",
    "dla" : "Ꮬ",
    "tla" : "Ꮭ",
    "tle" : "Ꮮ",
    "tli" : "Ꮯ",
    "tlo" : "Ꮰ",
    "tlu" : "Ꮱ",
    "tlv" : "Ꮲ",
    "tsa" : "Ꮳ",
    "tse" : "Ꮴ",
    "tsi" : "Ꮵ",
    "tso" : "Ꮶ",
    "tsu" : "Ꮷ",
    "tsv" : "Ꮸ",
    "wa" : "Ꮹ",
    "we" : "Ꮺ",
    "wi" : "Ꮻ",
    "wo" : "Ꮼ",
    "wu" : "Ꮽ",
    "wv" : "Ꮾ",
    "ya" : "Ꮿ",
    "ye" : "Ᏸ",
    "yi" : "Ᏹ",
    "yo" : "Ᏺ",
    "yu" : "Ᏻ",
    "yv" : "Ᏼ",
    " " : " "];

    //does not handle spaces - use parseSentence for spaces
    static def parseHyphen(value) {
        def returnValue = "";

        //split string by '-'s
        def values = value.split("-");
        for (def i = 0; i < values.size(); i++) {
            returnValue += syllabaryMap2[values[i]];
        }

        return returnValue;
    }

    //some entries in the dictionary contain slashes, commas, spaces, and (w) or (e)
    // these entries need to be processed as is to give an exact transliterated value
    static def parseSyllabaryWithPunctuationAndLatin(value) {
        def returnValue = '';
        for (def i = 0; i < value.length(); i++) {
            def val = value.charAt(i);
            def tmp = syllabaryMap['' + val];
            if (tmp == null) {
                if (val=='a'||val=='e'||val=='i'||
                    val=='o'||val=='u'||val=='v'||
                    val=='g'||val=='k'||val=='h'||
                    val=='l'||val=='m'||val=='n'||
                    val=='q'||val=='s'||val=='d'||
                    val=='t'||val=='w'||val=='y'||
                    val=='\''||val=='-'||val==' '||
                    val==','||val=='.'||val=='!'||
                    val=='?'||val=='['||val=='];'||
                    val==':'||val==';'||val=='~'||
                    val=='('||val==')'||val==" " ||
                    val=="/" || val == "1" || val == "2" || val == "3" || val == "4" || val == "5" || val == "6" || val == "7" || val == "8" || val =="9" || val == "0" || "-") {
                    tmp = val;
                }
            }

            returnValue += tmp
        }

        returnValue = replace(returnValue, true);

        return returnValue;
    }

    static def parseSyllabary(value) {
        def returnValue = '';
        for (def i = 0; i < value.length(); i++) {
            returnValue += syllabaryMap['' + value.charAt(i)];
        }

        returnValue = replace(returnValue);

        return returnValue;
    }

    static def reverseReplace(data) {
        data = data.replace('qua', 'gwa');
        data = data.replace('que', 'gwe');
        data = data.replace('qui', 'gwi');
        data = data.replace('quo', 'gwo');
        data = data.replace('quu', 'gwu');
        data = data.replace('quv', 'gwv');
        data = data.replace('tsa', 'ja');
        data = data.replace('tse', 'je');
        data = data.replace('tsi', 'ji');
        data = data.replace('tso', 'jo');
        data = data.replace('tsu', 'ju');
        data = data.replace('tsv', 'jv');
        data = data.replace('cha', 'ja');
        data = data.replace('che', 'je');
        data = data.replace('chi', 'ji');
        data = data.replace('cho', 'jo');
        data = data.replace('chu', 'ju');
        data = data.replace('chv', 'jv');
        data = data.replace('dle', 'tle');
        data = data.replace('dli', 'tli');
        data = data.replace('dlo', 'tlo');
        data = data.replace('dlu', 'tlu');
        data = data.replace('dlv', 'tlv');

//        data = data.replace('do', 'to');

        return data;
    }

    static def replace(data) {
        return replace(data, true);
    }

    static def replace(data, replaceHyphens) {
        data = data.replace('gwa', 'qua');
        data = data.replace('gwe', 'que');
        data = data.replace('gwi', 'qui');
        data = data.replace('gwo', 'quo');
        data = data.replace('gwu', 'quu');
        data = data.replace('kwv', 'quv');
        data = data.replace('kwa', 'qua');
        data = data.replace('kwe', 'que');
        data = data.replace('kwi', 'qui');
        data = data.replace('kwo', 'quo');
        data = data.replace('kwu', 'quu');
        data = data.replace('kwv', 'quv');

        data = data.replace('cha', 'tsa');
        data = data.replace('che', 'tse');
        data = data.replace('chi', 'tsi');
        data = data.replace('cho', 'tso');
        data = data.replace('chu', 'tsu');
        data = data.replace('chv', 'tsv');
        data = data.replace('ja', 'tsa');
        data = data.replace('je', 'tse');
        data = data.replace('ji', 'tsi');
        data = data.replace('jo', 'tso');
        data = data.replace('ju', 'tsu');
        data = data.replace('jv', 'tsv');
        data = data.replace('dle', 'tle');
        data = data.replace('dli', 'tli');
        data = data.replace('dlo', 'tlo');
        data = data.replace('dlu', 'tlu');
        data = data.replace('dlv', 'tlv');

        //from durbin feeling dictionary
        data = data.replace('hla', 'tla');
        data = data.replace('hli', 'tli');
        data = data.replace('hyah', 'ya');
        data = data.replace('hya', 'ya');
        data = data.replace('hyeh', 'ye');

        data = data.replace('htsv', 'tsv');

        data = data.replace('ki', 'gi');
        data = data.replace('hga', 'ga');
        data = data.replace('hgi', 'gi');
        data = data.replace('hgo', 'go');
        data = data.replace('hgu', 'gu');
        data = data.replace('hgv', 'gv');

        data = data.replace("l ", 'li ');
        data = data.replace("d ", 'da ');

        data = data.replace("hwi", 'wi');
        data = data.replace('wh', 'wv');
        data = data.replace('hdi', 'di');
        data = data.replace('hje', 'je');
        data = data.replace('hta', 'ta');

        //sometimes ks is gis sometimes it's gas
        //same with nh - could be nv or could be ne
//        data = data.replace('ks', 'gis');

//        data = data.replace('to', 'do');

        if (replaceHyphens) {
            while (data.indexOf("-") != -1) {
                data = data.replace('-', '');
            }
        }

        return data;
    }

    static def mixedTransliteration(String data) {
        def sb = new StringBuilder()
        def words = data.split(" ")
        boolean hasCR = false;
        def crIndex = -1;
        words.each {
            if (it.contains("\n") || it.contains("\r")) {
                hasCR = true;
//                crIndex = it.indexOf("\n") != -1 ? it.indexOf("\n") : it.indexOf("\r")
                it = it.replace("\n", "111").replace("\r", "222")
            } else {
                crIndex = -1
            }

            /*if (hasCR) {
                it = it.replace("<br/>", "111")
            }*/

            if (!it.startsWith("<e>") && !it.contains("<e>")) {
                sb << tsalagiToSyllabary(it, false);
            } else {
                //temp fix for hybrid words thst start with cherokee and have english in them
                if (it.startsWith("<e>")) {
                    sb << it
                } else if (it.contains("<e>")) {
                    def word = it.split("<e>")
                    def sb2 = new StringBuilder()
                    word.eachWithIndex {str, idx ->
                        if (idx == 0) {
                            sb2 << tsalagiToSyllabary(str, false)
                        } else {
                            sb2 << str
                        }
                    }

                    sb << sb2
                }
            }

            sb << " "
        }

        sb << "\n"

        //remove all of the <e> tags to clean up the latin texts
        sb = sb.replaceAll("<e>", "").replaceAll("111", "\n").replaceAll("222", "\r");

        return sb
    }

    //takes the transliteration and replaces older transliterations with newer values
    static def tsalagiToSyllabaryNormalize(String data) {
        def dataLatin = tsalagiToSyllabary(data)
        reverseReplace(dataLatin)
    }

    static def tsalagiToSyllabary(String data) {
        return newTsalagiToSyllabary(data, true);
    }

    @Deprecated
    //sometimes we don't want all hyphens replaced such as when those are delineating the beginning of lists
    static def tsalagiToSyllabary(String data, boolean replaceHyphens) {
        return newTsalagiToSyllabary(data, replaceHyphens)
    }


    //sometimes we don't want all hyphens replaced such as when those are delineating the beginning of lists
    static def newTsalagiToSyllabary(String data, boolean replaceHyphens) {
        data = data.toLowerCase();

        data = replace(data, replaceHyphens);

        data = data.replaceAll("dla", syllabaryMap2.dla)

        data = data.replaceAll("gwa", syllabaryMap2.qua)
        data = data.replaceAll("gwe", syllabaryMap2.que)
        data = data.replaceAll("gwi", syllabaryMap2.qui)
        data = data.replaceAll("gwo", syllabaryMap2.quo)
        data = data.replaceAll("gwu", syllabaryMap2.quu)
        data = data.replaceAll("gwv", syllabaryMap2.quv)

        data = data.replaceAll("hna", syllabaryMap2.hna)

        data = data.replaceAll("kwa", syllabaryMap2.qua)
        data = data.replaceAll("kwe", syllabaryMap2.que)
        data = data.replaceAll("kwi", syllabaryMap2.qui)
        data = data.replaceAll("kwo", syllabaryMap2.quo)
        data = data.replaceAll("kwu", syllabaryMap2.quu)
        data = data.replaceAll("kwv", syllabaryMap2.quv)

        data = data.replaceAll("qua", syllabaryMap2.qua)
        data = data.replaceAll("que", syllabaryMap2.que)
        data = data.replaceAll("qui", syllabaryMap2.qui)
        data = data.replaceAll("quo", syllabaryMap2.quo)
        data = data.replaceAll("quu", syllabaryMap2.quu)
        data = data.replaceAll("quv", syllabaryMap2.quv)

        data = data.replaceAll("tla", syllabaryMap2.tla)
        data = data.replaceAll("tle", syllabaryMap2.tle)
        data = data.replaceAll("tli", syllabaryMap2.tli)
        data = data.replaceAll("tlo", syllabaryMap2.tlo)
        data = data.replaceAll("tlu", syllabaryMap2.tlu)
        data = data.replaceAll("tlv", syllabaryMap2.tlv)

        data = data.replaceAll("tsa", syllabaryMap2.tsa)
        data = data.replaceAll("tse", syllabaryMap2.tse)
        data = data.replaceAll("tsi", syllabaryMap2.tsi)
        data = data.replaceAll("tso", syllabaryMap2.tso)
        data = data.replaceAll("tsu", syllabaryMap2.tsu)
        data = data.replaceAll("tsv", syllabaryMap2.tsv)

        data = data.replaceAll("da", syllabaryMap2.da)
        data = data.replaceAll("de", syllabaryMap2.de)
        data = data.replaceAll("di", syllabaryMap2.di)
        data = data.replaceAll("do", syllabaryMap2.do)
        data = data.replaceAll("du", syllabaryMap2.du)
        data = data.replaceAll("dv", syllabaryMap2.dv)

        data = data.replaceAll("ga", syllabaryMap2.ga)
        data = data.replaceAll("ge", syllabaryMap2.ge)
        data = data.replaceAll("gi", syllabaryMap2.gi)
        data = data.replaceAll("go", syllabaryMap2.go)
        data = data.replaceAll("gu", syllabaryMap2.gu)
        data = data.replaceAll("gv", syllabaryMap2.gv)

        data = data.replaceAll("ha", syllabaryMap2.ha)
        data = data.replaceAll("he", syllabaryMap2.he)
        data = data.replaceAll("hi", syllabaryMap2.hi)
        data = data.replaceAll("ho", syllabaryMap2.ho)
        data = data.replaceAll("hu", syllabaryMap2.hu)
        data = data.replaceAll("hv", syllabaryMap2.hv)

        data = data.replaceAll("ka", syllabaryMap2.ka)

        data = data.replaceAll("la", syllabaryMap2.la)
        data = data.replaceAll("le", syllabaryMap2.le)
        data = data.replaceAll("li", syllabaryMap2.li)
        data = data.replaceAll("lo", syllabaryMap2.lo)
        data = data.replaceAll("lu", syllabaryMap2.lu)
        data = data.replaceAll("lv", syllabaryMap2.lv)

        data = data.replaceAll("ma", syllabaryMap2.ma)
        data = data.replaceAll("me", syllabaryMap2.me)
        data = data.replaceAll("mi", syllabaryMap2.mi)
        data = data.replaceAll("mo", syllabaryMap2.mo)
        data = data.replaceAll("mu", syllabaryMap2.mu)

        data = data.replaceAll("nah", syllabaryMap2.nah)
        data = data.replaceAll("na", syllabaryMap2.na)
        data = data.replaceAll("ne", syllabaryMap2.ne)
        data = data.replaceAll("ni", syllabaryMap2.ni)
        data = data.replaceAll("no", syllabaryMap2.no)
        data = data.replaceAll("nu", syllabaryMap2.nu)
        data = data.replaceAll("nv", syllabaryMap2.nv)

        data = data.replaceAll("sa", syllabaryMap2.sa)
        data = data.replaceAll("se", syllabaryMap2.se)
        data = data.replaceAll("si", syllabaryMap2.si)
        data = data.replaceAll("so", syllabaryMap2.so)
        data = data.replaceAll("su", syllabaryMap2.su)
        data = data.replaceAll("sv", syllabaryMap2.sv)


        data = data.replaceAll("wa", syllabaryMap2.wa)
        data = data.replaceAll("we", syllabaryMap2.we)
        data = data.replaceAll("wi", syllabaryMap2.wi)
        data = data.replaceAll("wo", syllabaryMap2.wo)
        data = data.replaceAll("wu", syllabaryMap2.wu)
        data = data.replaceAll("wv", syllabaryMap2.wv)

        data = data.replaceAll("ya", syllabaryMap2.ya)
        data = data.replaceAll("ye", syllabaryMap2.ye)
        data = data.replaceAll("yi", syllabaryMap2.yi)
        data = data.replaceAll("yo", syllabaryMap2.yo)
        data = data.replaceAll("yu", syllabaryMap2.yu)
        data = data.replaceAll("yv", syllabaryMap2.yv)

        data = data.replaceAll("ta", syllabaryMap2.ta)
        data = data.replaceAll("te", syllabaryMap2.te)
        data = data.replaceAll("ti", syllabaryMap2.ti)
        data = data.replaceAll("to", syllabaryMap2.to)
        data = data.replaceAll("tu", syllabaryMap2.tu)
        data = data.replaceAll("tv", syllabaryMap2.tv)

        data = data.replaceAll("uh", syllabaryMap2.u)

        data = data.replaceAll("a", syllabaryMap2.a)
        data = data.replaceAll("e", syllabaryMap2.e)
        data = data.replaceAll("i", syllabaryMap2.i)
        data = data.replaceAll("o", syllabaryMap2.o)
        data = data.replaceAll("u", syllabaryMap2.u)
        data = data.replaceAll("v", syllabaryMap2.v)
        data = data.replaceAll("s", syllabaryMap2.s)

        data = data.replaceAll(/[a-zA-Z]/, "not a valid letter")

        return data;
    }
}