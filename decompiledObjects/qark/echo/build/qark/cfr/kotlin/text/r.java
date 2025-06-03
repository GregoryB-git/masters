/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a;
import kotlin.text.q;
import kotlin.text.s;
import l6.d;

public class r
extends q {
    public static final boolean j(String string2, String string3, boolean bl) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        Intrinsics.checkNotNullParameter(string3, "suffix");
        if (!bl) {
            return string2.endsWith(string3);
        }
        return r.m(string2, string2.length() - string3.length(), string3, 0, string3.length(), true);
    }

    public static /* synthetic */ boolean k(String string2, String string3, boolean bl, int n8, Object object) {
        if ((n8 & 2) != 0) {
            bl = false;
        }
        return r.j(string2, string3, bl);
    }

    public static boolean l(String string2, String string3, boolean bl) {
        if (string2 == null) {
            if (string3 == null) {
                return true;
            }
            return false;
        }
        if (!bl) {
            return string2.equals((Object)string3);
        }
        return string2.equalsIgnoreCase(string3);
    }

    public static final boolean m(String string2, int n8, String string3, int n9, int n10, boolean bl) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        Intrinsics.checkNotNullParameter(string3, "other");
        if (!bl) {
            return string2.regionMatches(n8, string3, n9, n10);
        }
        return string2.regionMatches(bl, n8, string3, n9, n10);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final String n(String string2, char c8, char c9, boolean bl) {
        Object object;
        Intrinsics.checkNotNullParameter(string2, "<this>");
        if (!bl) {
            string2 = string2.replace(c8, c9);
            object = "replace(...)";
        } else {
            object = new StringBuilder(string2.length());
            for (int i8 = 0; i8 < string2.length(); ++i8) {
                char c10;
                char c11 = c10 = string2.charAt(i8);
                if (a.d(c10, c8, bl)) {
                    c11 = c9;
                }
                object.append(c11);
            }
            string2 = object.toString();
            object = "toString(...)";
        }
        Intrinsics.checkNotNullExpressionValue(string2, (String)object);
        return string2;
    }

    public static final String o(String string2, String string3, String string4, boolean bl) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        Intrinsics.checkNotNullParameter(string3, "oldValue");
        Intrinsics.checkNotNullParameter(string4, "newValue");
        int n8 = 0;
        int n9 = s.z(string2, string3, 0, bl);
        if (n9 < 0) {
            return string2;
        }
        int n10 = string3.length();
        int n11 = d.a(n10, 1);
        int n12 = string2.length() - n10 + string4.length();
        if (n12 >= 0) {
            int n13;
            StringBuilder stringBuilder = new StringBuilder(n12);
            do {
                stringBuilder.append((CharSequence)string2, n8, n9);
                stringBuilder.append(string4);
                n12 = n9 + n10;
                if (n9 >= string2.length()) break;
                n13 = s.z(string2, string3, n9 + n11, bl);
                n8 = n12;
                n9 = n13;
            } while (n13 > 0);
            stringBuilder.append((CharSequence)string2, n12, string2.length());
            string2 = stringBuilder.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return string2;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String p(String string2, char c8, char c9, boolean bl, int n8, Object object) {
        if ((n8 & 4) != 0) {
            bl = false;
        }
        return r.n(string2, c8, c9, bl);
    }

    public static /* synthetic */ String q(String string2, String string3, String string4, boolean bl, int n8, Object object) {
        if ((n8 & 4) != 0) {
            bl = false;
        }
        return r.o(string2, string3, string4, bl);
    }

    public static final boolean r(String string2, String string3, boolean bl) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        Intrinsics.checkNotNullParameter(string3, "prefix");
        if (!bl) {
            return string2.startsWith(string3);
        }
        return r.m(string2, 0, string3, 0, string3.length(), bl);
    }

    public static /* synthetic */ boolean s(String string2, String string3, boolean bl, int n8, Object object) {
        if ((n8 & 2) != 0) {
            bl = false;
        }
        return r.r(string2, string3, bl);
    }
}

