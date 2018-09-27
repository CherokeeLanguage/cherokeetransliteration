package com.cobradoc.cherokee
def su = new SyllabaryUtil();
def i = 10


def f = new File("page${i}.txt")
def frl = f.readLines();

def sb = new StringBuffer();
frl.each {
    def words = it.split(" ")
    words.each {
        if (!it.startsWith("<e>") && !it.contains("<e>")) {
            sb << su.tsalagiToSyllabary(it, false);
        } else {
            //temp fix for hybrid words thst start with cherokee and have english in them
            if (it.startsWith("<e>")) {
                sb << it
            } else if (it.contains("<e>")) {
                def word = it.split("<e>")
                def sb2 = new StringBuilder()
                word.eachWithIndex {str, idx ->
                    if (idx == 0) {
                        sb2 << su.tsalagiToSyllabary(str, false)
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
}

//remove all of the <en> and </en> tags to clean up the syllabary
sb = sb.replaceAll("<e>", "")

def f2 = new File("page${i}_syll.txt")
f2.write(sb.toString(), "UTF-8")