package com.cobradoc.cherokee
def su = new SyllabaryUtil();

def pageTotal = 100;

def textFiles = []
def syllabaryFiles = []

def startTime = System.currentTimeMillis()

for (def i = 0; i < pageTotal; i++) {
        def f = new File("page${i + 1}.txt")
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

        //remove all of the <e> tags to clean up the latin texts
        sb = sb.replaceAll("<e>", "")

        def f2 = new File("page${i+1}_syll.txt")
        f2.write(sb.toString(), "UTF-8")

        textFiles << f
        syllabaryFiles << f2
}

println (System.currentTimeMillis() - startTime)