package kotlin.text;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class r extends q {
    public static final boolean j(String str, String suffix, boolean z7) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return !z7 ? str.endsWith(suffix) : m(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    public static /* synthetic */ boolean k(String str, String str2, boolean z7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        return j(str, str2, z7);
    }

    public static boolean l(String str, String str2, boolean z7) {
        return str == null ? str2 == null : !z7 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final boolean m(String str, int i7, String other, int i8, int i9, boolean z7) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return !z7 ? str.regionMatches(i7, other, i8, i9) : str.regionMatches(z7, i7, other, i8, i9);
    }

    public static final String n(String str, char c7, char c8, boolean z7) {
        String sb;
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (z7) {
            StringBuilder sb2 = new StringBuilder(str.length());
            for (int i7 = 0; i7 < str.length(); i7++) {
                char charAt = str.charAt(i7);
                if (a.d(charAt, c7, z7)) {
                    charAt = c8;
                }
                sb2.append(charAt);
            }
            sb = sb2.toString();
            str2 = "toString(...)";
        } else {
            sb = str.replace(c7, c8);
            str2 = "replace(...)";
        }
        Intrinsics.checkNotNullExpressionValue(sb, str2);
        return sb;
    }

    public static final String o(String str, String oldValue, String newValue, boolean z7) {
        int a7;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        int i7 = 0;
        int z8 = s.z(str, oldValue, 0, z7);
        if (z8 < 0) {
            return str;
        }
        int length = oldValue.length();
        a7 = l6.f.a(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i7, z8);
            sb.append(newValue);
            i7 = z8 + length;
            if (z8 >= str.length()) {
                break;
            }
            z8 = s.z(str, oldValue, z8 + a7, z7);
        } while (z8 > 0);
        sb.append((CharSequence) str, i7, str.length());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static /* synthetic */ String p(String str, char c7, char c8, boolean z7, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z7 = false;
        }
        return n(str, c7, c8, z7);
    }

    public static /* synthetic */ String q(String str, String str2, String str3, boolean z7, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            z7 = false;
        }
        return o(str, str2, str3, z7);
    }

    public static final boolean r(String str, String prefix, boolean z7) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return !z7 ? str.startsWith(prefix) : m(str, 0, prefix, 0, prefix.length(), z7);
    }

    public static /* synthetic */ boolean s(String str, String str2, boolean z7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        return r(str, str2, z7);
    }
}
