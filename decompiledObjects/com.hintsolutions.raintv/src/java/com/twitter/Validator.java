/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.text.Normalizer
 *  java.text.Normalizer$Form
 */
package com.twitter;

import com.twitter.Extractor;
import java.text.Normalizer;

public class Validator {
    public static final int MAX_TWEET_LENGTH = 140;
    private Extractor extractor = new Extractor();
    public int shortUrlLength = 23;
    public int shortUrlLengthHttps = 23;

    public int getShortUrlLength() {
        return this.shortUrlLength;
    }

    public int getShortUrlLengthHttps() {
        return this.shortUrlLengthHttps;
    }

    public int getTweetLength(String object2) {
        object2 = Normalizer.normalize((CharSequence)object2, (Normalizer.Form)Normalizer.Form.NFC);
        int n = object2.codePointCount(0, object2.length());
        for (Object object2 : this.extractor.extractURLsWithIndices((String)object2)) {
            int n2 = ((Extractor.Entity)object2).start;
            int n3 = ((Extractor.Entity)object2).end;
            int n4 = ((Extractor.Entity)object2).value.toLowerCase().startsWith("https://") ? this.shortUrlLengthHttps : this.shortUrlLength;
            n = n4 + (n2 - n3 + n);
        }
        return n;
    }

    public boolean isValidTweet(String string2) {
        boolean bl;
        boolean bl2 = bl = false;
        if (string2 != null) {
            if (string2.length() == 0) {
                bl2 = bl;
            } else {
                for (char c : string2.toCharArray()) {
                    if (c != '\ufffe' && c != '\ufeff' && c != '\uffff' && (c < '\u202a' || c > '\u202e')) {
                        continue;
                    }
                    return false;
                }
                bl2 = bl;
                if (this.getTweetLength(string2) <= 140) {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }

    public void setShortUrlLength(int n) {
        this.shortUrlLength = n;
    }

    public void setShortUrlLengthHttps(int n) {
        this.shortUrlLengthHttps = n;
    }
}

