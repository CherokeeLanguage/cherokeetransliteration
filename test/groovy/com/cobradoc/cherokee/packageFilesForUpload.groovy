package com.cobradoc.cherokee

for (int i = 1; i <= 100; i++) {
    def f = new File("page${i}.txt").getText("UTF-8")
    def text = f.replaceAll("<en>", "");
    new File("page${i}_latin.txt").write(text)
}