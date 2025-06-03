/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.yandex.metrica.coreutils.logger;

import androidx.annotation.NonNull;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class WordBreakFinder {
    private final Pattern goodLineEndPattern = Pattern.compile((String)"[\\p{Space},;]");

    private int findLastIndex(@NonNull Matcher matcher, int n) {
        block0: {
            int n3 = matcher.start();
            n = this.findLastIndex(matcher, n3 + 1, n);
            if (n != -1) break block0;
            n = n3;
        }
        return n;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int findLastIndex(@NonNull Matcher matcher, int n, int n3) {
        if (n3 < n) return -1;
        int n4 = (n3 - n) / 2 + n;
        matcher.region(n4, n3);
        if (matcher.find()) {
            return this.findLastIndex(matcher, n3);
        }
        matcher.region(n, n4);
        if (!matcher.find()) return -1;
        return this.findLastIndex(matcher, n4);
    }

    public int find(@NonNull String string2, int n, int n3) {
        return this.findLastIndex(this.goodLineEndPattern.matcher((CharSequence)string2), n, n3);
    }
}

