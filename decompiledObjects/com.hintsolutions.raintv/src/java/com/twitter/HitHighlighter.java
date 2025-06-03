/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.text.StringCharacterIterator
 *  java.util.List
 */
package com.twitter;

import java.text.StringCharacterIterator;
import java.util.List;

public class HitHighlighter {
    public static final String DEFAULT_HIGHLIGHT_TAG = "em";
    public String highlightTag = "em";

    public String getHighlightTag() {
        return this.highlightTag;
    }

    public String highlight(String string22, List<List<Integer>> list) {
        String string3 = string22;
        if (list != null) {
            if (list.isEmpty()) {
                string3 = string22;
            } else {
                string3 = new StringBuilder(string22.length());
                StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(string22);
                char c = stringCharacterIterator.first();
                boolean bl = false;
                int n = 0;
                boolean bl2 = true;
                while (c != '\uffff') {
                    boolean bl3;
                    for (String string22 : list) {
                        if ((Integer)string22.get(0) == n) {
                            string3.append(this.tag(false));
                            bl = true;
                            continue;
                        }
                        if ((Integer)string22.get(1) != n) continue;
                        string3.append(this.tag(true));
                        bl = false;
                    }
                    if (c == '<') {
                        bl3 = false;
                    } else {
                        bl3 = bl2;
                        if (c == '>') {
                            bl3 = bl2;
                            if (!bl2) {
                                bl3 = true;
                            }
                        }
                    }
                    int n2 = n;
                    if (bl3) {
                        n2 = n + 1;
                    }
                    string3.append(c);
                    c = stringCharacterIterator.next();
                    bl2 = bl3;
                    n = n2;
                }
                if (bl) {
                    string3.append(this.tag(true));
                }
                string3 = string3.toString();
            }
        }
        return string3;
    }

    public void setHighlightTag(String string2) {
        this.highlightTag = string2;
    }

    public String tag(boolean bl) {
        StringBuilder stringBuilder = new StringBuilder(this.highlightTag.length() + 3);
        stringBuilder.append("<");
        if (bl) {
            stringBuilder.append("/");
        }
        return z2.s(stringBuilder, this.highlightTag, ">");
    }
}

