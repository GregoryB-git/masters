/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Float
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package k1;

import d0.A;
import g0.M;
import g0.z;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k1.e;

public abstract class h {
    public static final Pattern a = Pattern.compile((String)"^NOTE([ \t].*)?$");

    public static Matcher a(z z8) {
        String string2;
        while ((string2 = z8.r()) != null) {
            if (a.matcher((CharSequence)string2).matches()) {
                while ((string2 = z8.r()) != null && !string2.isEmpty()) {
                }
                continue;
            }
            if (!(string2 = e.a.matcher((CharSequence)string2)).matches()) continue;
            return string2;
        }
        return null;
    }

    public static boolean b(z object) {
        if ((object = object.r()) != null && object.startsWith("WEBVTT")) {
            return true;
        }
        return false;
    }

    public static float c(String string2) {
        if (string2.endsWith("%")) {
            return Float.parseFloat((String)string2.substring(0, string2.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String arrstring) {
        long l8;
        arrstring = M.c1((String)arrstring, "\\.");
        String[] arrstring2 = M.b1(arrstring[0], ":");
        int n8 = arrstring2.length;
        long l9 = 0L;
        for (int i8 = 0; i8 < n8; ++i8) {
            l9 = l9 * 60L + Long.parseLong((String)arrstring2[i8]);
        }
        l9 = l8 = l9 * 1000L;
        if (arrstring.length == 2) {
            l9 = l8 + Long.parseLong((String)arrstring[1]);
        }
        return l9 * 1000L;
    }

    public static void e(z z8) {
        int n8 = z8.f();
        if (h.b(z8)) {
            return;
        }
        z8.T(n8);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected WEBVTT. Got ");
        stringBuilder.append(z8.r());
        throw A.a(stringBuilder.toString(), null);
    }
}

