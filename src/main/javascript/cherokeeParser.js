/*
* Copyright cobradoc.com
* LGPL license
* You are free to use this software, sell it, trade it, burn it, or even use it to change the world...but we're not responsible for any badness.
* You must include this disclaimer in your usages along with the email of the original creator of this software: cobradoc@gmail.com
*
* Enjoy!  And don't do bad stuff.
*/

//TODO: move each letter itaration out to its own method - need to figure out a way to handle it so it will increment correctly
// the idea being that in the end the code will be almost identical for JS and Groovy
var syllabaryMap = {"Ꭰ" : "a",
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
    " " : " "};

var syllabaryMap2 = {"a" : "Ꭰ",
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
    " " : " "};

//does not handle spaces - use parseSentence for spaces
function parseHyphen(value) {
    var returnValue = "";

    //split string by '-'s
    var values = value.split("-");
    for (var i = 0; i < values.length; i++) {
        returnValue += syllabaryMap2[values[i]];
    }

    return returnValue;
}

function parseSyllabary(value) {
    var returnValue = '';
    for (var i = 0; i < value.length; i++) {
        var charat = value.charAt(i);
        var tmp = syllabaryMap['' + charat];
        returnValue += tmp;
    }

        returnValue = replace(returnValue);

    return returnValue;
}

function reverseReplace(data) {
    data = data.replace(/qua/g, 'gwa');
    data = data.replace(/que/g, 'gwe');
    data = data.replace(/qui/g, 'gwi');
    data = data.replace(/quo/g, 'gwo');
    data = data.replace(/quu/g, 'gwu');
    data = data.replace(/quv/g, 'gwv');
    data = data.replace(/tsa/g, 'ja');
    data = data.replace(/tse/g, 'je');
    data = data.replace(/tsi/g, 'ji');
    data = data.replace(/tso/g, 'jo');
    data = data.replace(/tsu/g, 'ju');
    data = data.replace(/tsv/g, 'jv');
    data = data.replace(/cha/g, 'ja');
    data = data.replace(/che/g, 'je');
    data = data.replace(/chi/g, 'ji');
    data = data.replace(/cho/g, 'jo');
    data = data.replace(/chu/g, 'ju');
    data = data.replace(/chv/g, 'jv');
    data = data.replace(/dle/g, 'tle');
    data = data.replace(/dli/g, 'tli');
    data = data.replace(/dlo/g, 'tlo');
    data = data.replace(/dlu/g, 'tlu');
    data = data.replace(/dlv/g, 'tlv');

    /*data = data.replace('do', 'to');*/

    return data;
}

function replace(data) {
    data = data.replace(/gwa/g, 'qua');
    data = data.replace(/gwe/g, 'que');
    data = data.replace(/gwi/g, 'qui');
    data = data.replace(/gwo/g, 'quo');
    data = data.replace(/gwu/g, 'quu');
    data = data.replace(/gwv/g, 'quv');
    data = data.replace(/kwv/g, 'quv');
    data = data.replace(/kwa/g, 'qua');
    data = data.replace(/kwe/g, 'que');
    data = data.replace(/kwi/g, 'qui');
    data = data.replace(/kwo/g, 'quo');
    data = data.replace(/kwu/g, 'quu');
    data = data.replace(/kwv/g, 'quv');
    data = data.replace(/cha/g, 'tsa');
    data = data.replace(/che/g, 'tse');
    data = data.replace(/chi/g, 'tsi');
    data = data.replace(/cho/g, 'tso');
    data = data.replace(/chu/g, 'tsu');
    data = data.replace(/chv/g, 'tsv');
    data = data.replace(/ja/g, 'tsa');
    data = data.replace(/je/g, 'tse');
    data = data.replace(/ji/g, 'tsi');
    data = data.replace(/jo/g, 'tso');
    data = data.replace(/ju/g, 'tsu');
    data = data.replace(/jv/g, 'tsv');
    data = data.replace(/dle/g, 'tle');
    data = data.replace(/dli/g, 'tli');
    data = data.replace(/dlo/g, 'tlo');
    data = data.replace(/dlu/g, 'tlu');
    data = data.replace(/dlv/g, 'tlv');

    //from durbin feeling dictionary
    data = data.replace(/hla/g, 'tla');
    data = data.replace(/hli/g, 'tli');
    data = data.replace(/hyah/g, 'ya');
    data = data.replace(/hya/g, 'ya');
    data = data.replace(/hyeh/g, 'ye');

    data = data.replace(/htsv/g, 'tsv');

    data = data.replace(/ki/g, 'gi');
    data = data.replace(/hga/g, 'ga');
    data = data.replace(/hgi/g, 'gi');
    data = data.replace(/hgo/g, 'go');
    data = data.replace(/hgu/g, 'gu');
    data = data.replace(/hgv/g, 'gv');

    data = data.replace(/l /g, 'li ');
    data = data.replace(/d /g, 'da ');

    data = data.replace(/hwi/g, 'wi');
    data = data.replace(/wh/g, 'wv');
    data = data.replace(/hdi/g, 'di');
    data = data.replace(/hje/g, 'je');
    data = data.replace(/hta/g, 'ta');
//    data = data.replace(/ks/g, 'gis');

//        data = data.replace('to', 'do');

    while (data.indexOf("-") != -1) {
        data = data.replace('-', '');
    }

    return data;
}

function parseSentence(value) {
    var returnValue = "";
    var values = value.split(" ");
    for (var i = 0; i < values.length; i++) {
        returnValue += parseHyphen(values[i]);
        returnValue += " ";
    }

    return returnValue;
}

function mixedTransliteration(data) {
    var sb = "";
    var words = data.split(" ")
    var hasCR = false;
    var crIndex = -1;
    for (it of words) {
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
            sb += tsalagiToSyllabary(it, false);
        } else {
            //temp fix for hybrid words thst start with cherokee and have english in them
            if (it.startsWith("<e>")) {
                sb += it;
            } else if (it.contains("<e>")) {
                var word = it.split("<e>");
                var sb2 = "";
                for (let idx = 0; idx < word.length; idx++) {
                    const str = word[i];

                    if (idx === 0) {
                        sb2 += tsalagiToSyllabary(str, false);
                    } else {
                        sb2 += str;
                    }
                }

                sb += sb2;
            }
        }

        sb += " ";
    }

    sb += "\n";

    //remove all of the <e> tags to clean up the latin texts
    sb = sb.replaceAll("<e>", "").replaceAll("111", "\n").replaceAll("222", "\r");

    return sb
}

//takes the transliteration and replaces older transliterations with newer values
function tsalagiToSyllabaryNormalize(data) {
    var dataLatin = tsalagiToSyllabary(data)
    reverseReplace(dataLatin)
}

function tsalagiToSyllabary(data) {
    return newTsalagiToSyllabary(data, true);
}

//sometimes we don't want all hyphens replaced such as when those are delineating the beginning of lists
function newTsalagiToSyllabary(data, replaceHyphens) {
    data = data.toLowerCase();

    data = replace(data, replaceHyphens);

    data = data.replaceAll(/dla/g, syllabaryMap2.dla)

    data = data.replaceAll(/gwa/g, syllabaryMap2.qua)
    data = data.replaceAll(/gwe/g, syllabaryMap2.que)
    data = data.replaceAll(/gwi/g, syllabaryMap2.qui)
    data = data.replaceAll(/gwo/g, syllabaryMap2.quo)
    data = data.replaceAll(/gwu/g, syllabaryMap2.quu)
    data = data.replaceAll(/gwv/g, syllabaryMap2.quv)

    data = data.replaceAll(/hna/g, syllabaryMap2.hna)

    data = data.replaceAll(/kwa/g, syllabaryMap2.qua)
    data = data.replaceAll(/kwe/g, syllabaryMap2.que)
    data = data.replaceAll(/kwi/g, syllabaryMap2.qui)
    data = data.replaceAll(/kwo/g, syllabaryMap2.quo)
    data = data.replaceAll(/kwu/g, syllabaryMap2.quu)
    data = data.replaceAll(/kwv/g, syllabaryMap2.quv)

    data = data.replaceAll(/qua/g, syllabaryMap2.qua)
    data = data.replaceAll(/que/g, syllabaryMap2.que)
    data = data.replaceAll(/qui/g, syllabaryMap2.qui)
    data = data.replaceAll(/quo/g, syllabaryMap2.quo)
    data = data.replaceAll(/quu/g, syllabaryMap2.quu)
    data = data.replaceAll(/quv/g, syllabaryMap2.quv)

    data = data.replaceAll(/tla/g, syllabaryMap2.tla)
    data = data.replaceAll(/tle/g, syllabaryMap2.tle)
    data = data.replaceAll(/tli/g, syllabaryMap2.tli)
    data = data.replaceAll(/tlo/g, syllabaryMap2.tlo)
    data = data.replaceAll(/tlu/g, syllabaryMap2.tlu)
    data = data.replaceAll(/tlv/g, syllabaryMap2.tlv)

    data = data.replaceAll(/tsa/g, syllabaryMap2.tsa)
    data = data.replaceAll(/tse/g, syllabaryMap2.tse)
    data = data.replaceAll(/tsi/g, syllabaryMap2.tsi)
    data = data.replaceAll(/tso/g, syllabaryMap2.tso)
    data = data.replaceAll(/tsu/g, syllabaryMap2.tsu)
    data = data.replaceAll(/tsv/g, syllabaryMap2.tsv)

    data = data.replaceAll(/da/g, syllabaryMap2.da)
    data = data.replaceAll(/de/g, syllabaryMap2.de)
    data = data.replaceAll(/di/g, syllabaryMap2.di)
    data = data.replaceAll(/do/g, syllabaryMap2.do)
    data = data.replaceAll(/du/g, syllabaryMap2.du)
    data = data.replaceAll(/dv/g, syllabaryMap2.dv)

    data = data.replaceAll(/ga/g, syllabaryMap2.ga)
    data = data.replaceAll(/ge/g, syllabaryMap2.ge)
    data = data.replaceAll(/gi/g, syllabaryMap2.gi)
    data = data.replaceAll(/go/g, syllabaryMap2.go)
    data = data.replaceAll(/gu/g, syllabaryMap2.gu)
    data = data.replaceAll(/gv/g, syllabaryMap2.gv)

    data = data.replaceAll(/ha/g, syllabaryMap2.ha)
    data = data.replaceAll(/he/g, syllabaryMap2.he)
    data = data.replaceAll(/hi/g, syllabaryMap2.hi)
    data = data.replaceAll(/ho/g, syllabaryMap2.ho)
    data = data.replaceAll(/hu/g, syllabaryMap2.hu)
    data = data.replaceAll(/hv/g, syllabaryMap2.hv)

    data = data.replaceAll(/ka/g, syllabaryMap2.ka)

    data = data.replaceAll(/la/g, syllabaryMap2.la)
    data = data.replaceAll(/le/g, syllabaryMap2.le)
    data = data.replaceAll(/li/g, syllabaryMap2.li)
    data = data.replaceAll(/lo/g, syllabaryMap2.lo)
    data = data.replaceAll(/lu/g, syllabaryMap2.lu)
    data = data.replaceAll(/lv/g, syllabaryMap2.lv)

    data = data.replaceAll(/ma/g, syllabaryMap2.ma)
    data = data.replaceAll(/me/g, syllabaryMap2.me)
    data = data.replaceAll(/mi/g, syllabaryMap2.mi)
    data = data.replaceAll(/mo/g, syllabaryMap2.mo)
    data = data.replaceAll(/mu/g, syllabaryMap2.mu)

    data = data.replaceAll(/nah/g, syllabaryMap2.nah)
    data = data.replaceAll(/na/g, syllabaryMap2.na)
    data = data.replaceAll(/ne/g, syllabaryMap2.ne)
    data = data.replaceAll(/ni/g, syllabaryMap2.ni)
    data = data.replaceAll(/no/g, syllabaryMap2.no)
    data = data.replaceAll(/nu/g, syllabaryMap2.nu)
    data = data.replaceAll(/nv/g, syllabaryMap2.nv)

    data = data.replaceAll(/sa/g, syllabaryMap2.sa)
    data = data.replaceAll(/se/g, syllabaryMap2.se)
    data = data.replaceAll(/si/g, syllabaryMap2.si)
    data = data.replaceAll(/so/g, syllabaryMap2.so)
    data = data.replaceAll(/su/g, syllabaryMap2.su)
    data = data.replaceAll(/sv/g, syllabaryMap2.sv)


    data = data.replaceAll(/wa/g, syllabaryMap2.wa)
    data = data.replaceAll(/we/g, syllabaryMap2.we)
    data = data.replaceAll(/wi/g, syllabaryMap2.wi)
    data = data.replaceAll(/wo/g, syllabaryMap2.wo)
    data = data.replaceAll(/wu/g, syllabaryMap2.wu)
    data = data.replaceAll(/wv/g, syllabaryMap2.wv)

    data = data.replaceAll(/ya/g, syllabaryMap2.ya)
    data = data.replaceAll(/ye/g, syllabaryMap2.ye)
    data = data.replaceAll(/yi/g, syllabaryMap2.yi)
    data = data.replaceAll(/yo/g, syllabaryMap2.yo)
    data = data.replaceAll(/yu/g, syllabaryMap2.yu)
    data = data.replaceAll(/yv/g, syllabaryMap2.yv)

    data = data.replaceAll(/ta/g, syllabaryMap2.ta)
    data = data.replaceAll(/te/g, syllabaryMap2.te)
    data = data.replaceAll(/ti/g, syllabaryMap2.ti)
    data = data.replaceAll(/to/g, syllabaryMap2.to)
    data = data.replaceAll(/tu/g, syllabaryMap2.tu)
    data = data.replaceAll(/tv/g, syllabaryMap2.tv)

    data = data.replaceAll(/uh/g, syllabaryMap2.u)

    data = data.replaceAll(/a/g, syllabaryMap2.a)
    data = data.replaceAll(/e/g, syllabaryMap2.e)
    data = data.replaceAll(/i/g, syllabaryMap2.i)
    data = data.replaceAll(/o/g, syllabaryMap2.o)
    data = data.replaceAll(/u/g, syllabaryMap2.u)
    data = data.replaceAll(/v/g, syllabaryMap2.v)
    data = data.replaceAll(/s/g, syllabaryMap2.s)

    data = data.replaceAll(/[a-zA-Z]/g, "not a valid letter")

    return data;
}

