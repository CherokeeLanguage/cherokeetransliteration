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

function tsalagiToSyllabary(data) {
    data = data.toLowerCase();
    var returnValue = [];

    data = replace(data);

    var datasize = data.length;

    for (var counter = 0; counter < datasize; counter++) {
        var it = data.charAt(counter);

        //legal characters are
        //	\'-. ,!?[];:;aeiouvgkhlmnqsdtwyj
        //Verify legal character
        if(
           !(it=='a'||it=='e'||it=='i'||
             it=='o'||it=='u'||it=='v'||
             it=='g'||it=='k'||it=='h'||
             it=='l'||it=='m'||it=='n'||
             it=='q'||it=='s'||it=='d'||
             it=='t'||it=='w'||it=='y'||
             it=='\''||it=='-'||it==' '||
             it==','||it=='.'||it=='!'||
             it=='?'||it=='['||it=='];'||
             it==':'||it==';'||it=='~'||
             it=='('||it==')'||it=='j'||
             it=='\n'
            )) {
            returnValue += "data is invalid";
        }

        if (it == '\n') {
            returnValue += "NEWLINE";
        }

        if (it == '.' || it == ':' || it == ';' || it == '?' || it == '/' || it == ' ' || it == ',' || it == '-') {
            returnValue += it;
        }

        if (it == 'a') {
            returnValue += syllabaryMap2.a;
        } else if (it == 'e') {
            returnValue += syllabaryMap2.e;
        } else if (it == 'i') {
            returnValue += syllabaryMap2.i;
        } else if (it == 'o') {
            returnValue += syllabaryMap2.o;
        } else if (it == 'u') {
            returnValue += syllabaryMap2.u;
        } else if (it == 'v') {
            returnValue += syllabaryMap2.v;
        }

        if (it == 'd') {
            if (counter + 1 < datasize) {
                //it++ this is the charater at 'it' plus 1
                var itt = data.charAt(counter + 1);
                if (itt == 'a') {
                    returnValue += syllabaryMap2.da;
                    counter++;
                } else if (itt == 'e') {
                    returnValue += syllabaryMap2.de;
                    counter++;
                } else if (itt == "i") {
                    returnValue += syllabaryMap2.di;
                    counter++;
                } else if (itt == "o") {
                    returnValue += syllabaryMap2.do;
                    counter++;
                } else if (itt == "u") {
                    returnValue += syllabaryMap2.du;
                    counter++;
                } else if (itt == "v") {
                    returnValue += syllabaryMap2.dv;
                    counter++;
                }  else if (itt == "l") {
                    if (counter + 2 < datasize) {
                        var ittt = data.charAt(counter + 2);
                        if (ittt == 'a') {
                            returnValue += syllabaryMap2.dla;
                            counter += 2;
                        }
                    } else {
                        returnValue += "not a valid letter";
                    }
                } else {
                    returnValue += "not a valid letter";
                }
            } else {
                returnValue += "not a valid letter";
            }
        }

        if (it == 'g') {
            if (counter + 1 < datasize) {
                //it++ this is the charater at 'it' plus 1
                var itt = data.charAt(counter + 1);
                if (itt == 'a') {
                    returnValue += syllabaryMap2.ga;
                    counter++;
                } else if (itt == 'e') {
                    returnValue += syllabaryMap2.ge;
                    counter++;
                } else if (itt == "i") {
                    returnValue += syllabaryMap2.gi;
                    counter++;
                } else if (itt == "o") {
                    returnValue += syllabaryMap2.go;
                    counter++;
                } else if (itt == "u") {
                    returnValue += syllabaryMap2.gu;
                    counter++;
                } else if (itt == "v") {
                    returnValue += syllabaryMap2.gv;
                    counter++;
                } else if (itt == "w") {
                    if (counter + 2 < datasize) {
                        var ittt = data.charAt(counter + 2);
                        if (ittt == 'a') {
                            returnValue += syllabaryMap2.qua;
                            counter += 3;
                        } else if (ittt == 'e') {
                            returnValue += syllabaryMap2.que;
                            counter += 3;
                        } else if (ittt == 'i') {
                            returnValue += syllabaryMap2.qui;
                            counter += 3;
                        } else if (ittt == 'o') {
                            returnValue += syllabaryMap2.quo;
                            counter += 3;
                        } else if (ittt == 'u') {
                            returnValue += syllabaryMap2.quu;
                            counter += 3;
                        } else if (ittt == 'v') {
                            returnValue += syllabaryMap2.quv;
                            counter += 3;
                        } else {
                            returnValue += "not a valid letter";
                        }
                    } else {
                        returnValue += "not a valid letter";
                    }
                } else {
                    returnValue += "not a valid letter";
                }
            } else {
                returnValue += "not a valid letter";
            }
        }

        if (it == 'h') {
            if (counter + 1 < datasize) {
                //it++ this is the charater at 'it' plus 1
                var itt = data.charAt(counter + 1);
                if (itt == 'a') {
                    returnValue += syllabaryMap2.ha;
                    counter++;
                } else if (itt == 'e') {
                    returnValue += syllabaryMap2.he;
                    counter++;
                } else if (itt == "i") {
                    returnValue += syllabaryMap2.hi;
                    counter++;
                } else if (itt == "o") {
                    returnValue += syllabaryMap2.ho;
                    counter++;
                } else if (itt == "u") {
                    returnValue += syllabaryMap2.hu;
                    counter++;
                } else if (itt == "v") {
                    returnValue += syllabaryMap2.hv;
                    counter++;
                } else if (itt == "n") {
                    var ittt = data.charAt(counter + 2);
                    if (ittt == 'a') {
                        returnValue += syllabaryMap2.hna;
                        counter += 2;
                    }
                } else {
                    returnValue += "not a valid letter";
                }
            } else {
                returnValue += "not a valid letter";
            }
        }

        if (it == 'k') {
            if (counter + 1 < datasize) {
                //it++ this is the charater at 'it' plus 1
                var itt = data.charAt(counter + 1);
                if (itt == 'a') {
                    returnValue += syllabaryMap2.ka;
                    counter++;
                } else {
                    //should this really be 'ga' or return not a valid letter?
                    returnValue += "not a valid letter";
                }
            } else {
                returnValue += "not a valid letter";
            }
        }

        if (it == 'l') {
            if (counter + 1 < datasize) {
                //it++ this is the charater at 'it' plus 1
                var itt = data.charAt(counter + 1);
                if (itt == 'a') {
                    returnValue += syllabaryMap2.la;
                    counter++;
                } else if (itt == 'e') {
                    returnValue += syllabaryMap2.le;
                    counter++;
                } else if (itt == "i") {
                    returnValue += syllabaryMap2.li;
                    counter++;
                } else if (itt == "o") {
                    returnValue += syllabaryMap2.lo;
                    counter++;
                } else if (itt == "u") {
                    returnValue += syllabaryMap2.lu;
                    counter++;
                } else if (itt == "v") {
                    returnValue += syllabaryMap2.lv;
                    counter++;
                } else {
                    returnValue += "not a valid letter";
                }
            } else {
                returnValue += "not a valid letter";
            }
        }

        if (it == 'm') {
            if (counter + 1 < datasize) {
                //it++ this is the charater at 'it' plus 1
                var itt = data.charAt(counter + 1);
                if (itt == 'a') {
                    returnValue += syllabaryMap2.ma;
                    counter++;
                } else if (itt == 'e') {
                    returnValue += syllabaryMap2.me;
                    counter++;
                } else if (itt == "i") {
                    returnValue += syllabaryMap2.mi;
                    counter++;
                } else if (itt == "o") {
                    returnValue += syllabaryMap2.mo;
                    counter++;
                } else if (itt == "u") {
                    returnValue += syllabaryMap2.mu;
                    counter++;
                } else {
                    returnValue += "not a valid letter";
                }
            } else {
                returnValue += "not a valid letter";
            }
        }

        if (it == 'n') {
            if (counter + 1 < datasize) {
                //it++ this is the charater at 'it' plus 1
                var itt = data.charAt(counter + 1);
                if (itt == 'a') {
                    if (counter + 2 < datasize) {
                        var ittt = data.charAt(counter + 2);
                        if (ittt == 'h') {
                            returnValue += syllabaryMap2.nah;
                            counter += 2;
                        } else {
                            returnValue += syllabaryMap2.na;
                            counter++;
                        }
                    } else {
                        returnValue += syllabaryMap2.na;
                        counter++;
                    }
                } else if (itt == 'e') {
                    returnValue += syllabaryMap2.ne;
                    counter++;
                } else if (itt == "i") {
                    returnValue += syllabaryMap2.ni;
                    counter++;
                } else if (itt == "o") {
                    returnValue += syllabaryMap2.no;
                    counter++;
                } else if (itt == "u") {
                    returnValue += syllabaryMap2.nu;
                    counter++;
                } else if (itt == "v") {
                    returnValue += syllabaryMap2.nv;
                    counter++;
                } else {
                    returnValue += "not a valid letter";
                }
            } else {
                returnValue += "not a valid letter";
            }
        }

        if (it == 'q') {
            if (counter + 1 < datasize) {
                //it++ this is the charater at 'it' plus 1
                var itt = data.charAt(counter + 1);
                if (itt == 'u') {
                    var ittt = data.charAt(counter + 2);

                    if (ittt == 'a') {
                        returnValue += syllabaryMap2.qua;
                        counter += 2;
                    } else if (ittt == 'e') {
                        returnValue += syllabaryMap2.que;
                        counter += 2;
                    } else if (ittt == "i") {
                        returnValue += syllabaryMap2.qui;
                        counter += 2;
                    } else if (ittt == "o") {
                        returnValue += syllabaryMap2.quo;
                        counter += 2;
                    } else if (ittt == "u") {
                        returnValue += syllabaryMap2.quu;
                        counter += 2;
                    } else if (ittt == "v") {
                        returnValue += syllabaryMap2.quv;
                        counter += 2;
                    } else {
                        returnValue += "not a valid letter";
                    }
                }
            } else {
                returnValue += "not a valid letter";
            }
        }

        if (it == 's') {
            if (counter + 1 < datasize) {
                //it++ this is the charater at 'it' plus 1
                var itt = data.charAt(counter + 1);
                if (itt == 'a') {
                    returnValue += syllabaryMap2.sa;
                    counter++;
                } else if (itt == 'e') {
                    returnValue += syllabaryMap2.se;
                    counter++;
                } else if (itt == "i") {
                    returnValue += syllabaryMap2.si;
                    counter++;
                } else if (itt == "o") {
                    returnValue += syllabaryMap2.so;
                    counter++;
                } else if (itt == "u") {
                    returnValue += syllabaryMap2.su;
                    counter++;
                } else if (itt == "v") {
                    returnValue += syllabaryMap2.sv;
                    counter++;
                } else {
                    // returnValue += "not a valid letter";
                    //TODO: make sure it's right-- extensive testing
                    returnValue += syllabaryMap2.s;
                }
            } else {
                returnValue += syllabaryMap2.s;
                // returnValue += "not a valid letter";
            }
        }

        if (it == 't') {
            if (counter + 1 < datasize) {
                //it++ this is the charater at 'it' plus 1
                var itt = data.charAt(counter + 1);
                if (itt == 'a') {
                    returnValue += syllabaryMap2.ta;
                    counter++;
                } else if (itt == 'e') {
                    returnValue += syllabaryMap2.te;
                    counter++;
                } else if (itt == "i") {
                    returnValue += syllabaryMap2.ti;
                    counter++;
                } else if (itt == "o") {
                    returnValue += syllabaryMap2.to;
                    counter++;
                } else if (itt == "u") {
                    returnValue += syllabaryMap2.tu;
                    counter++;
                } else if (itt == "v") {
                    returnValue += syllabaryMap2.tv;
                    counter++;
                } else if (itt == "l") {
                    if (counter + 2 < datasize) {
                        var ittt = data.charAt(counter + 2);
                        if (ittt == 'a') {
                            returnValue += syllabaryMap2.tla;
                            counter += 2;
                        } else if (ittt == 'e') {
                            returnValue += syllabaryMap2.tle;
                            counter += 2;
                        } else if (ittt == "i") {
                            returnValue += syllabaryMap2.tli;
                            counter += 2;
                        } else if (ittt == "o") {
                            returnValue += syllabaryMap2.tlo;
                            counter += 2;
                        } else if (ittt == "u") {
                            returnValue += syllabaryMap2.tlu;
                            counter += 2;
                        } else if (ittt == "v") {
                            returnValue += syllabaryMap2.tlv;
                            counter += 2;
                        } else {
                            returnValue += "not a valid letter";
                        }
                    } else {
                        returnValue += "not a valid letter";
                    }
                } else if (itt == "s") {
                    if (counter + 2 < datasize) {
                        var ittt = data.charAt(counter + 2);
                        if (ittt == 'a') {
                            returnValue += syllabaryMap2.tsa;
                            counter += 2;
                        } else if (ittt == 'e') {
                            returnValue += syllabaryMap2.tse;
                            counter += 2;
                        } else if (ittt == "i") {
                            returnValue += syllabaryMap2.tsi;
                            counter += 2;
                        } else if (ittt == "o") {
                            returnValue += syllabaryMap2.tso;
                            counter += 2;
                        } else if (ittt == "u") {
                            returnValue += syllabaryMap2.tsu;
                            counter += 2;
                        } else if (ittt == "v") {
                            returnValue += syllabaryMap2.tsv;
                            counter += 2;
                        } else {
                            returnValue += "not a valid letter";
                        }
                    } else {
                        returnValue += "not a valid letter";
                    }
                } else {
                    returnValue += "not a valid letter";
                }
            } else {
                returnValue += "not a valid letter";
            }
        }

        if (it == 'w') {
            if (counter + 1 < datasize) {
                //it++ this is the charater at 'it' plus 1
                var itt = data.charAt(counter + 1);
                if (itt == 'a') {
                    returnValue += syllabaryMap2.wa;
                    counter++;
                } else if (itt == 'e') {
                    returnValue += syllabaryMap2.we;
                    counter++;
                } else if (itt == "i") {
                    returnValue += syllabaryMap2.wi;
                    counter++;
                } else if (itt == "o") {
                    returnValue += syllabaryMap2.wo;
                    counter++;
                } else if (itt == "u") {
                    returnValue += syllabaryMap2.wu;
                    counter++;
                } else if (itt == "v") {
                    returnValue += syllabaryMap2.wv;
                    counter++;
                } else {
                    returnValue += "not a valid letter";
                }
            } else {
                returnValue += "not a valid letter";
            }
        }

        if (it == 'y') {
            if (counter + 1 < datasize) {
                //it++ this is the charater at 'it' plus 1
                var itt = data.charAt(counter + 1);
                if (itt == 'a') {
                    returnValue += syllabaryMap2.ya;
                    counter++;
                } else if (itt == 'e') {
                    returnValue += syllabaryMap2.ye;
                    counter++;
                } else if (itt == "i") {
                    returnValue += syllabaryMap2.yi;
                    counter++;
                } else if (itt == "o") {
                    returnValue += syllabaryMap2.yo;
                    counter++;
                } else if (itt == "u") {
                    returnValue += syllabaryMap2.yu;
                    counter++;
                } else if (itt == "v") {
                    returnValue += syllabaryMap2.yv;
                    counter++;
                } else {
                    returnValue += "not a valid letter";
                }
            } else {
                returnValue += "not a valid letter";
            }
        }
    }

    returnValue = returnValue.replace(/NEWLINE/g, "\n");

    return returnValue;
}