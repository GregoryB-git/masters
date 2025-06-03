package lc;

import java.util.ArrayList;
import java.util.List;
import p2.m0;

/* loaded from: classes.dex */
public class k extends h {
    public static final String A0(String str, String str2) {
        ec.i.e(str2, "missingDelimiterValue");
        int lastIndexOf = str.lastIndexOf(46, p0(str));
        if (lastIndexOf == -1) {
            return str2;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        ec.i.d(substring, "substring(...)");
        return substring;
    }

    public static String B0(String str, String str2) {
        int s02 = s0(str, str2, 0, false, 6);
        if (s02 == -1) {
            return str;
        }
        String substring = str.substring(0, s02);
        ec.i.d(substring, "substring(...)");
        return substring;
    }

    public static final CharSequence C0(String str) {
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean W = m0.W(str.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!W) {
                    break;
                }
                length--;
            } else if (W) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i10, length + 1);
    }

    public static boolean o0(CharSequence charSequence, String str) {
        ec.i.e(charSequence, "<this>");
        return s0(charSequence, str, 0, false, 2) >= 0;
    }

    public static final int p0(CharSequence charSequence) {
        ec.i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int q0(int i10, CharSequence charSequence, String str, boolean z10) {
        ec.i.e(charSequence, "<this>");
        ec.i.e(str, "string");
        return (z10 || !(charSequence instanceof String)) ? r0(charSequence, str, i10, charSequence.length(), z10, false) : ((String) charSequence).indexOf(str, i10);
    }

    public static final int r0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        ic.d dVar;
        if (z11) {
            int p02 = p0(charSequence);
            if (i10 > p02) {
                i10 = p02;
            }
            if (i11 < 0) {
                i11 = 0;
            }
            dVar = new ic.d(i10, i11, -1);
        } else {
            if (i10 < 0) {
                i10 = 0;
            }
            int length = charSequence.length();
            if (i11 > length) {
                i11 = length;
            }
            dVar = new ic.f(i10, i11);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int i12 = dVar.f7954a;
            int i13 = dVar.f7955b;
            int i14 = dVar.f7956c;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    String str = (String) charSequence2;
                    if (!h.l0(0, i12, str.length(), str, (String) charSequence, z10)) {
                        if (i12 == i13) {
                            break;
                        }
                        i12 += i14;
                    } else {
                        return i12;
                    }
                }
            }
        } else {
            int i15 = dVar.f7954a;
            int i16 = dVar.f7955b;
            int i17 = dVar.f7956c;
            if ((i17 > 0 && i15 <= i16) || (i17 < 0 && i16 <= i15)) {
                while (!w0(charSequence2, charSequence, i15, charSequence2.length(), z10)) {
                    if (i15 != i16) {
                        i15 += i17;
                    }
                }
                return i15;
            }
        }
        return -1;
    }

    public static /* synthetic */ int s0(CharSequence charSequence, String str, int i10, boolean z10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return q0(i10, charSequence, str, z10);
    }

    public static final boolean t0(CharSequence charSequence) {
        ec.i.e(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!m0.W(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static int u0(String str, String str2, int i10) {
        int p02 = (i10 & 2) != 0 ? p0(str) : 0;
        ec.i.e(str, "<this>");
        ec.i.e(str2, "string");
        return str.lastIndexOf(str2, p02);
    }

    public static String v0(String str, int i10) {
        CharSequence charSequence;
        ec.i.e(str, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(a0.j.h("Desired length ", i10, " is less than zero."));
        }
        if (i10 <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i10);
            sb2.append((CharSequence) str);
            int length = i10 - str.length();
            int i11 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append(' ');
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            charSequence = sb2;
        }
        return charSequence.toString();
    }

    public static final boolean w0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10) {
        ec.i.e(charSequence, "<this>");
        ec.i.e(charSequence2, "other");
        if (i10 < 0 || charSequence.length() - i11 < 0 || i10 > charSequence2.length() - i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!m0.E(charSequence.charAt(0 + i12), charSequence2.charAt(i10 + i12), z10)) {
                return false;
            }
        }
        return true;
    }

    public static final void x0(int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(defpackage.f.h("Limit must be non-negative, but was ", i10).toString());
        }
    }

    public static final List y0(int i10, CharSequence charSequence, String str, boolean z10) {
        x0(i10);
        int i11 = 0;
        int q02 = q0(0, charSequence, str, z10);
        if (q02 == -1 || i10 == 1) {
            return va.a.f(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        int i12 = 10;
        if (z11 && i10 <= 10) {
            i12 = i10;
        }
        ArrayList arrayList = new ArrayList(i12);
        do {
            arrayList.add(charSequence.subSequence(i11, q02).toString());
            i11 = str.length() + q02;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            q02 = q0(i11, charSequence, str, z10);
        } while (q02 != -1);
        arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
        return arrayList;
    }

    public static final String z0(String str, String str2, String str3) {
        ec.i.e(str2, "delimiter");
        ec.i.e(str3, "missingDelimiterValue");
        int s02 = s0(str, str2, 0, false, 6);
        if (s02 == -1) {
            return str3;
        }
        String substring = str.substring(str2.length() + s02, str.length());
        ec.i.d(substring, "substring(...)");
        return substring;
    }
}
