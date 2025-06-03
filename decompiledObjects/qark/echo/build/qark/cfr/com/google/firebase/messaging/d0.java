/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.google.firebase.messaging;

import A2.m;
import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class d0 {
    public static final Pattern d = Pattern.compile((String)"[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    public d0(String string2, String string3) {
        this.a = d0.d(string3, string2);
        this.b = string2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append("!");
        stringBuilder.append(string3);
        this.c = stringBuilder.toString();
    }

    public static d0 a(String arrstring) {
        if (TextUtils.isEmpty((CharSequence)arrstring)) {
            return null;
        }
        if ((arrstring = arrstring.split("!", -1)).length != 2) {
            return null;
        }
        return new d0(arrstring[0], arrstring[1]);
    }

    public static String d(String string2, String string3) {
        String string4 = string2;
        if (string2 != null) {
            string4 = string2;
            if (string2.startsWith("/topics/")) {
                Log.w((String)"FirebaseMessaging", (String)String.format((String)"Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", (Object[])new Object[]{string3}));
                string4 = string2.substring(8);
            }
        }
        if (string4 != null && d.matcher((CharSequence)string4).matches()) {
            return string4;
        }
        throw new IllegalArgumentException(String.format((String)"Invalid topic name: %s does not match the allowed format %s.", (Object[])new Object[]{string4, "[a-zA-Z0-9-_.~%]{1,900}"}));
    }

    public static d0 f(String string2) {
        return new d0("S", string2);
    }

    public static d0 g(String string2) {
        return new d0("U", string2);
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof d0;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        object = (d0)object;
        bl = bl2;
        if (this.a.equals((Object)object.a)) {
            bl = bl2;
            if (this.b.equals((Object)object.b)) {
                bl = true;
            }
        }
        return bl;
    }

    public int hashCode() {
        return m.b(this.b, this.a);
    }
}

