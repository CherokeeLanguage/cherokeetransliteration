# cherokee-transliteration

Transliteration of Cherokee can be difficult.  Some projects use delimiters, such as spaces and hyphens, to delineate syllables in order to provide the display.  This project uses a "natural" transliteration to parse single words (with or without hyphenation) and sentences (with or without hyphenation).

At this time, there is source code available (in Groovy and javascript) and a jar distribution.

There are two ways to run the transliteration code: 1) deploy a jar 2) include the javascript file.

A compiled jar is provided for download, however, if you would like to build yourself the following instructions should help you.

  * Download and install Gradle (http://gradle.org)
  * Download the source for the project
  * Open a CLI to the location of the build.gradle
  * Type: 'gradle jar' to run the build and produce a compiled jar (the jar will be in the build\libs directory)
  * Type: 'gradle test' to run the tests
  * Type: 'gradle check' to run the codenarc tests (the report will be placed in the build\reports\codenarc)
  * Type: 'gradle srcZip' to run the task that zips up the source (the zip will be in the build\distributions directory)

**To use with Java or Groovy:**
```
def su = new SyllabaryUtil();
def value = su.tsalagiToSyllabary("tsalagi");
```

With every transliteration from Tsalagi (the roman alphabet version) to Syllabary you simply run `tsalagiToSyllabary`, as presented above, with your Tsalagi word that you would like to see in Syllabary.

In the test folder there is a **test.html** file that you can play with these settings.  The **test.html** file allows you to transliterate from Tsalagi to Syllabary and from Syllabary to Tsalagi at the click of a button.

```
def su = new SyllabaryUtil();
def value = su.parseSyllabary("ᏓᏩᏙᎠ")
```

The `parseSyllabary` method will take the Syllabary and return Tsalagi.

In order to parse hyphenated values:
```
def su = new SyllabaryUtil();
def value = parseHyphen("do-na-da-go-hv-i");
```

In order to parse a sentence:
```
def su = new SyllabaryUtil();
def value = tsalagiToSyllabary("osiyo, magi.  donadagohvi")
```

**To use with Javascript**

Include the javascript file `cherokeeParser.js` in your HTML.

```
tsalagiToSyllabary("tsalagi")

parseSyllabary("ᏓᏩᏙᎠ")
```

If you would like to run the tests with the javascript file - simply uncomment the `javascriptTest.js` line in the **test.html** file.

**Different ways to parse**

The parser supports three different sets of input:
  * hyphenated syllables (do-na-da-go-hv-i)
  * no hyphens (donadagohvi)
  * full sentences, some punctuation (osiyo, magi.  donadagohvi.)

Acceptable punctuation marks (,-.:;?/) - other punctuation marks simply have not been added at this time.

When you run the 'tsalagiToSyllabary' (or open the index.html file in your browser) there are certain values that are "normalized" i.e. _agwaduliha_ will be "normalized" to _aquaduliha_ before the transliteration process begins.  The use of "normalized" simply means "conversion of one form to another for ease of use."

Here are the values that are replaced:
```
gwa - qua
gwe - que
gwi - qui
gwo - quo
gwu - quu
gwv - quv
ja - tsa
je - tse
ji - tsi
jo - tso
ju - tsu
jv - tsv
dle - tle
dli - tli
dlo - tlo
dlu - tlu
dlv - tlv
hla - tla
hli - tli
hyah - ya
hya - ya
hyeh - ye
htsv - tsv
ki - gi
hga - ga
hgi - gi
hgo - go
hgu - gu
hgv - gv
hwi - wi
wh - wv
hdi - di
hje - je
hta - ta
ks - gis
```

Correct representation of 'do' and 'to' are done through the mapping of the syllabary to the pronunciation of the syllables.  e.g. to = Ꮩ and do = Ꮩ

This representation is unidirectional - if you entered _Dohiju_ then the transliterated value would be ᏙᎯᏧ - as would _tohiju_, _tohitsu_, and _dohitsu_.  However, when you transliterate ᏙᎯᏧ from Syllabary to the romanized version you will always get _tohitsu_.

At some point in the future I may write a version of this program (the index.html transliteration portion) that the user may select preferences for "do vs to," "ju vs tsu," "gwa vs qua," etc.  At this time only the one romanized transliteration is available.

Transliteration is fallible.  If you enter _sukta_ and expect ᏑᎦᏔ - you will be disappointed.  If you enter _sukata_ and expect ᏑᎦᏔ - you will also be disappointed.  In order to use the transliteration process provided you will need to know how to "spell" the Tsalagi (romanized) version to view the Syllabary transliteration.

----
# JAVASCRIPT COMPILATION

To generate the javascript version of the transliteration code run:
gradle convert

you'll need to have the latest javascript files from: https://github.com/chiquitinxx/grooscript/tree/master/src/main/resources/META-INF/resources
The current version included here is from "Apr 27, 2020"

The code in test/javascript/test.html will give you insight into how to include this on your page.

If you want to run the javascript tests to make sure they all work simply uncomment this line:
&lt;!--&lt;script src="javascriptTest.js"&gt;&lt;/script&gt;--&gt;

inside test.html and open the page in your browser.
