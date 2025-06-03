package lc;

/* loaded from: classes.dex */
public class h extends g {
    public static final boolean k0(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final boolean l0(int i10, int i11, int i12, String str, String str2, boolean z10) {
        ec.i.e(str, "<this>");
        ec.i.e(str2, "other");
        return !z10 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static String m0(String str, String str2, String str3) {
        ec.i.e(str, "<this>");
        ec.i.e(str3, "newValue");
        int q02 = k.q0(0, str, str2, false);
        if (q02 < 0) {
            return str;
        }
        int length = str2.length();
        int i10 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        int i11 = 0;
        do {
            sb2.append((CharSequence) str, i11, q02);
            sb2.append(str3);
            i11 = q02 + length;
            if (q02 >= str.length()) {
                break;
            }
            q02 = k.q0(q02 + i10, str, str2, false);
        } while (q02 > 0);
        sb2.append((CharSequence) str, i11, str.length());
        String sb3 = sb2.toString();
        ec.i.d(sb3, "toString(...)");
        return sb3;
    }

    public static boolean n0(String str, String str2) {
        ec.i.e(str, "<this>");
        ec.i.e(str2, "prefix");
        return str.startsWith(str2);
    }
}
