/*
* Copyright cobradoc.com
* LGPL license
* You are free to use this software, sell it, trade it, burn it, or even use it to change the world...but we're not responsible for any badness.
* You must include this disclaimer in your usages along with the email of the original creator of this software: cobradoc@gmail.com
*
* Enjoy!  And don't do bad stuff.
*/
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
" " : " "};

var syllabaryMap2 = {
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
" " : " "};

var latinMap = {
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
};

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
        if (charat == '.' || charat == '?' || charat == '-' || charat == ',') {
            returnValue += charat;
        } else {
            var tmp = syllabaryMap['' + charat];
            returnValue += tmp;
        }
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
    data = data.replace(/hle/g, 'tle');
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

function tsalagiToSyllabary(data) {
    data = data.toLowerCase();
    data = replace(data);

    for (var key in syllabaryMap2) {
        if (syllabaryMap2.hasOwnProperty(key)) {
            var re = new RegExp(key,"g");
            data = data.replace(re, syllabaryMap2[key]);
        }
    }

    for (var key in latinMap) {
        if (latinMap.hasOwnProperty(key)) {
            var re = new RegExp(key,"g");
            data = data.replace(re, "##");
        }
    }

    return data;
}