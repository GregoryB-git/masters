/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.TimeUnit
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package s4;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u4.d;
import w4.a;
import w4.b;

public final class q {
    public static final long b = TimeUnit.HOURS.toSeconds(1L);
    public static final Pattern c = Pattern.compile((String)"\\AA[\\w-]{38}\\z");
    public static q d;
    public final a a;

    public q(a a8) {
        this.a = a8;
    }

    public static q c() {
        return q.d(b.b());
    }

    public static q d(a a8) {
        if (d == null) {
            d = new q(a8);
        }
        return d;
    }

    public static boolean g(String string2) {
        return c.matcher((CharSequence)string2).matches();
    }

    public static boolean h(String string2) {
        return string2.contains((CharSequence)":");
    }

    public long a() {
        return this.a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(this.a());
    }

    public long e() {
        return (long)(Math.random() * 1000.0);
    }

    public boolean f(d d8) {
        if (TextUtils.isEmpty((CharSequence)d8.b())) {
            return true;
        }
        if (d8.h() + d8.c() < this.b() + b) {
            return true;
        }
        return false;
    }
}

