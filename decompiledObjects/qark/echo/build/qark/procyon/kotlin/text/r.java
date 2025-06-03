// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.text;

import l6.d;
import kotlin.jvm.internal.Intrinsics;

public class r extends q
{
    public static final boolean j(final String s, final String suffix, final boolean b) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!b) {
            return s.endsWith(suffix);
        }
        return m(s, s.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }
    
    public static boolean l(final String s, final String s2, final boolean b) {
        if (s == null) {
            return s2 == null;
        }
        if (!b) {
            return s.equals(s2);
        }
        return s.equalsIgnoreCase(s2);
    }
    
    public static final boolean m(final String s, final int n, final String s2, final int n2, final int n3, final boolean ignoreCase) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(s2, "other");
        if (!ignoreCase) {
            return s.regionMatches(n, s2, n2, n3);
        }
        return s.regionMatches(ignoreCase, n, s2, n2, n3);
    }
    
    public static final String n(String s, final char oldChar, final char newChar, final boolean b) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        String s2;
        if (!b) {
            s = s.replace(oldChar, newChar);
            s2 = "replace(...)";
        }
        else {
            final StringBuilder sb = new StringBuilder(s.length());
            for (int i = 0; i < s.length(); ++i) {
                char char1;
                if (a.d(char1 = s.charAt(i), oldChar, b)) {
                    char1 = newChar;
                }
                sb.append(char1);
            }
            s = sb.toString();
            s2 = "toString(...)";
        }
        Intrinsics.checkNotNullExpressionValue(s, s2);
        return s;
    }
    
    public static final String o(String string, final String s, final String str, final boolean b) {
        Intrinsics.checkNotNullParameter(string, "<this>");
        Intrinsics.checkNotNullParameter(s, "oldValue");
        Intrinsics.checkNotNullParameter(str, "newValue");
        int start = 0;
        int z = s.z(string, s, 0, b);
        if (z < 0) {
            return string;
        }
        final int length = s.length();
        final int a = d.a(length, 1);
        final int capacity = string.length() - length + str.length();
        if (capacity >= 0) {
            final StringBuilder sb = new StringBuilder(capacity);
            int z2;
            int start2;
            do {
                sb.append(string, start, z);
                sb.append(str);
                start2 = z + length;
                if (z >= string.length()) {
                    break;
                }
                z2 = s.z(string, s, z + a, b);
                start = start2;
            } while ((z = z2) > 0);
            sb.append(string, start2, string.length());
            string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        throw new OutOfMemoryError();
    }
    
    public static final boolean r(final String s, final String prefix, final boolean b) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!b) {
            return s.startsWith(prefix);
        }
        return m(s, 0, prefix, 0, prefix.length(), b);
    }
}
