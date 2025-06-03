// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import A2.m;
import android.util.Log;
import android.text.TextUtils;
import java.util.regex.Pattern;

public final class d0
{
    public static final Pattern d;
    public final String a;
    public final String b;
    public final String c;
    
    static {
        d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    }
    
    public d0(final String s, final String str) {
        this.a = d(str, s);
        this.b = s;
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("!");
        sb.append(str);
        this.c = sb.toString();
    }
    
    public static d0 a(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return null;
        }
        final String[] split = s.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new d0(split[0], split[1]);
    }
    
    public static String d(final String s, final String s2) {
        String substring = s;
        if (s != null) {
            substring = s;
            if (s.startsWith("/topics/")) {
                Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", s2));
                substring = s.substring(8);
            }
        }
        if (substring != null && d0.d.matcher(substring).matches()) {
            return substring;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", substring, "[a-zA-Z0-9-_.~%]{1,900}"));
    }
    
    public static d0 f(final String s) {
        return new d0("S", s);
    }
    
    public static d0 g(final String s) {
        return new d0("U", s);
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
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof d0;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final d0 d0 = (d0)o;
        boolean b3 = b2;
        if (this.a.equals(d0.a)) {
            b3 = b2;
            if (this.b.equals(d0.b)) {
                b3 = true;
            }
        }
        return b3;
    }
    
    @Override
    public int hashCode() {
        return m.b(this.b, this.a);
    }
}
