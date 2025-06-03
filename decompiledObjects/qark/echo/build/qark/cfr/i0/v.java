/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package i0;

import android.text.TextUtils;
import g0.a;
import g0.o;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class v {
    public static final Pattern a = Pattern.compile((String)"bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    public static final Pattern b = Pattern.compile((String)"bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String a(long l8, long l9) {
        if (l8 == 0L && l9 == -1L) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("bytes=");
        stringBuilder.append(l8);
        stringBuilder.append("-");
        if (l9 != -1L) {
            stringBuilder.append(l8 + l9 - 1L);
        }
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static long b(String string2, String string3) {
        StringBuilder stringBuilder;
        long l8;
        block6 : {
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                try {
                    l8 = Long.parseLong((String)string2);
                    break block6;
                }
                catch (NumberFormatException numberFormatException) {}
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected Content-Length [");
                stringBuilder.append(string2);
                stringBuilder.append("]");
                o.c("HttpUtil", stringBuilder.toString());
            }
            l8 = -1L;
        }
        if (TextUtils.isEmpty((CharSequence)string3)) return l8;
        stringBuilder = a.matcher((CharSequence)string3);
        if (!stringBuilder.matches()) return l8;
        try {
            long l9 = Long.parseLong((String)((String)a.e(stringBuilder.group(2)))) - Long.parseLong((String)((String)a.e(stringBuilder.group(1)))) + 1L;
            if (l8 < 0L) {
                return l9;
            }
            if (l8 == l9) return l8;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Inconsistent headers [");
            stringBuilder.append(string2);
            stringBuilder.append("] [");
            stringBuilder.append(string3);
            stringBuilder.append("]");
            o.h("HttpUtil", stringBuilder.toString());
            return Math.max((long)l8, (long)l9);
        }
        catch (NumberFormatException numberFormatException) {}
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Unexpected Content-Range [");
        stringBuilder2.append(string3);
        stringBuilder2.append("]");
        o.c("HttpUtil", stringBuilder2.toString());
        return l8;
    }

    public static long c(String string2) {
        boolean bl = TextUtils.isEmpty((CharSequence)string2);
        long l8 = -1L;
        if (bl) {
            return -1L;
        }
        if ((string2 = b.matcher((CharSequence)string2)).matches()) {
            l8 = Long.parseLong((String)((String)a.e(string2.group(1))));
        }
        return l8;
    }
}

