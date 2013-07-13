package com.cobradoc.cherokee;

//TODO: move each letter itaration out to its own method - need to figure out a way to handle it so it will increment correctly
// the idea being that in the end the code will be almost identical for JS and Groovy
public class SyllabaryUtil {
    //TODO: add support for lettering definitions -- meaning that qua would be gwa, etc
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
    "Ꮩ" : "to",
    "Ꮪ" : "tu",
    "Ꮪ" : "du",
    "Ꮫ" : "tv",
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

    def syllabaryMap2 = ["a" : "Ꭰ",
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
    " " : " "];

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
            returnValue += syllabaryMap['' + value.charAt(i)];
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
//        data = data.replace('to', 'do');

        while (data.indexOf("-") != -1) {
            data = data.replace('-', '');
        }

        return data;
    }

    def parseSentence(value) {
        def returnValue = "";
        def values = value.split(" ");
        for (def i = 0; i < values.length; i++) {
            returnValue += parseHyphen(values[i]);
            returnValue += " ";
        }

        return returnValue;
    }

    def tsalagiToSyllabary(String data) {
        data = data.toLowerCase();
        def returnValue = [];

        data = replace(data);
//        data = reverseReplace(data);

        def datasize = data.length();

        for (def counter = 0; counter < datasize; counter++) {
            def it = data.charAt(counter);

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
                 it=='('||it==')'||it=='j'
                )) {
            //    printf("\nError:  Illegal character %c at %d.",it, counter);
            //    errordisp(counter+1,it,data);
                returnValue += "data is invalid";
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

        //    g(it, counter, data, datasize, syllabaryMap2)
        //    k(it, counter, data, datasize, syllabaryMap2)
        //    l(it, counter, data, datasize, syllabaryMap2)
        //    s(it, counter, data, datasize, syllabaryMap2)
        //    d(it, counter, data, datasize, syllabaryMap2)
        //    y(it, counter, data, datasize, syllabaryMap2)
        //    m(it, counter, data, datasize, syllabaryMap2)
        //    n(it, counter, data, datasize, syllabaryMap2)
        //    t(it, counter, data, datasize, syllabaryMap2)
        //    w(it, counter, data, datasize, syllabaryMap2)
        //    qu(it, counter, data, datasize, syllabaryMap2)
        //    h(it, counter, data, datasize, syllabaryMap2)

            if (it == 'd') {
                if (counter + 1 < datasize) {
                    //it++ this is the charater at 'it' plus 1
                    def itt = data.charAt(counter + 1);
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
                            def ittt = data.charAt(counter + 2);
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
                    def itt = data.charAt(counter + 1);
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
                            def ittt = data.charAt(counter + 2);
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
                    def itt = data.charAt(counter + 1);
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
                        def ittt = data.charAt(counter + 2);
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
                    def itt = data.charAt(counter + 1);
                    if (itt == 'a') {
                        returnValue += syllabaryMap2.ka;
                        counter++;
                    }
                } else {
                    returnValue += "not a valid letter";
                }
            }

            if (it == 'l') {
                if (counter + 1 < datasize) {
                    //it++ this is the charater at 'it' plus 1
                    def itt = data.charAt(counter + 1);
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
                    def itt = data.charAt(counter + 1);
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
                    def itt = data.charAt(counter + 1);
                    if (itt == 'a') {
                        if (counter + 2 < datasize) {
                            def ittt = data.charAt(counter + 2);
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
                    def itt = data.charAt(counter + 1);
                    if (itt == 'u') {
                        def ittt = data.charAt(counter + 2);

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
                    def itt = data.charAt(counter + 1);
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
                    } else if (itt == "s") {
                        returnValue += syllabaryMap2.s;
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
                    def itt = data.charAt(counter + 1);
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
                            def ittt = data.charAt(counter + 2);
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
                            def ittt = data.charAt(counter + 2);
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
                    def itt = data.charAt(counter + 1);
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
                    def itt = data.charAt(counter + 1);
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

        return returnValue.join('');
    }
}