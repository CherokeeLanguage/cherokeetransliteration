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
//TODO: eventually this should all be regex replaces
/**
 * (?:\s|^)table(?=\s).*?(\spool(?:$|\s))(?!table(?:$|\s))
 * 'table pool' will find a match but 'table pool table' will not b/c table follows pool
 * following that logic
 * (lo(?:$|h)(?!i(?:$|)))
 * will match 'lohsga' but not 'lohisga' b/c 'h' is followed by 'i'
 *
 */
public class SyllabaryUtil {
    def syllabaryMap = ["Ꭰ" : "a",
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
    "Ꮏ" : "hna",
    "Ꮐ" : "nah",
    "Ꮎ" : "na",
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
    "Ꮪ" : "tu",
//    "Ꮪ" : "du",
    "Ꮫ" : "tv",
//    "Ꮫ" : "dv",
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

    def syllabaryMap2 = [
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
    "dla" : "Ꮬ",
    "tla" : "Ꮭ",
    "tle" : "Ꮮ",
    "tli" : "Ꮯ",
    "tlo" : "Ꮰ",
    "tlu" : "Ꮱ",
    "tlv" : "Ꮲ",
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

    "hna" : "Ꮏ",
    "nah" : "Ꮐ",
    "na" : "Ꮎ",
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
    "tsa" : "Ꮳ",
    "tse" : "Ꮴ",
    "tsi" : "Ꮵ",
    "tso" : "Ꮶ",
    "tsu" : "Ꮷ",
    "tsv" : "Ꮸ",
    "sa" : "Ꮜ",
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
    "s" : "Ꮝ",
    "a" : "Ꭰ",
    "e" : "Ꭱ",
    "i" : "Ꭲ",
    "o" : "Ꭳ",
    "u" : "Ꭴ",
    "v" : "Ꭵ",
    " " : " "];

    def latinMap = [
        "a" : "a",
        "b" : "b",
        "c" : "c",
        "d" : "d",
        "e" : "e",
        "f" : "f",
        "g" : "g",
        "h" : "h",
        "i" : "i",
        "j" : "j",
        "k" : "k",
        "l" : "l",
        "m" : "m",
        "n" : "n",
        "o" : "o",
        "p" : "p",
        "q" : "q",
        "r" : "r",
        "s" : "s",
        "t" : "t",
        "u" : "u",
        "v" : "v",
        "w" : "w",
        "x" : "x",
        "y" : "y",
        "z" : "z"
    ];

    //does not handle spaces - use parseSentence for spaces
    def parseHyphen(value) {
        def returnValue = "";

        //split string by '-'s
        def values = value.split("-");
        for (def i = 0; i < values.size(); i++) {
            returnValue += syllabaryMap2[values[i]];
        }

        return returnValue;
    }

    def parseSyllabary(value) {
        def returnValue = '';
        for (def i = 0; i < value.length(); i++) {
            def charat = value.charAt(i);
            //TODO: make sure that this doesn't affect anything -- really there should be a parse syllabary and html - which is then regexed or something
            if (charat == '.' || charat == '?' || charat == '-' || charat == ',' || charat == '<' || charat == '>' || charat == 'u' || charat == '/' || charat == '!') {
               returnValue += charat
            } else {
                returnValue += syllabaryMap['' + charat];
            }
        }

        returnValue = replace(returnValue);

        return returnValue;
    }

    def reverseReplace(data) {
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

    def replace(data) {
        data = data.replace('gwa', 'qua');
        data = data.replace('gwe', 'que');
        data = data.replace('gwi', 'qui');
        data = data.replace('gwo', 'quo');
        data = data.replace('gwu', 'quu');
        data = data.replace('gwv', 'quv');
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
        data = data.replace('hle', 'tle');
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

        while (data.indexOf("-") != -1) {
            data = data.replace('-', '');
        }

        return data;
    }

    def tsalagiToSyllabary(String data) {
        data = data.toLowerCase();
        data = replace(data);

        syllabaryMap2.each {
            data = data.replace(it.key, it.value)
        }

        latinMap.each {
            data = data.replace(it.key, "##")
        }

        return data;
    }
}