/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twitter.sdk.android.core.models.Tweet
 *  java.lang.CharSequence
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 */
package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.models.Tweet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

final class Utils {
    private Utils() {
    }

    public static CharSequence charSeqOrDefault(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null) {
            charSequence = charSequence2;
        }
        return charSequence;
    }

    public static CharSequence charSeqOrEmpty(CharSequence charSequence) {
        return Utils.charSeqOrDefault(charSequence, "");
    }

    public static Long numberOrDefault(String string2, long l) {
        long l2;
        try {
            l2 = Long.parseLong((String)string2);
        }
        catch (NumberFormatException numberFormatException) {
            return l;
        }
        return l2;
    }

    public static List<Tweet> orderTweets(List<Long> iterator, List<Tweet> iterator22) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Tweet tweet : iterator22) {
            hashMap.put((Object)tweet.id, (Object)tweet);
        }
        for (Iterator iterator22 : iterator) {
            if (!hashMap.containsKey((Object)iterator22)) continue;
            arrayList.add(hashMap.get((Object)iterator22));
        }
        return arrayList;
    }

    public static String stringOrDefault(String string2, String string3) {
        if (string2 == null) {
            string2 = string3;
        }
        return string2;
    }

    public static String stringOrEmpty(String string2) {
        return Utils.stringOrDefault(string2, "");
    }
}

