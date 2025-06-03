package kotlin.text;

import W5.C0680j;
import W5.C0681k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class s extends r {

    public static final class a extends kotlin.jvm.internal.l implements g6.p {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ List f16265o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f16266p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list, boolean z7) {
            super(2);
            this.f16265o = list;
            this.f16266p = z7;
        }

        public final V5.m a(CharSequence $receiver, int i7) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            V5.m w7 = s.w($receiver, this.f16265o, i7, this.f16266p, false);
            if (w7 != null) {
                return V5.q.a(w7.c(), Integer.valueOf(((String) w7.d()).length()));
            }
            return null;
        }

        @Override // g6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    public static final class b extends kotlin.jvm.internal.l implements g6.l {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ CharSequence f16267o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CharSequence charSequence) {
            super(1);
            this.f16267o = charSequence;
        }

        @Override // g6.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(l6.c it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return s.Y(this.f16267o, it);
        }
    }

    public static final int A(CharSequence charSequence, CharSequence charSequence2, int i7, int i8, boolean z7, boolean z8) {
        int b7;
        int a7;
        l6.a f7;
        int a8;
        int b8;
        if (z8) {
            b7 = l6.f.b(i7, x(charSequence));
            a7 = l6.f.a(i8, 0);
            f7 = l6.f.f(b7, a7);
        } else {
            a8 = l6.f.a(i7, 0);
            b8 = l6.f.b(i8, charSequence.length());
            f7 = new l6.c(a8, b8);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int a9 = f7.a();
            int d7 = f7.d();
            int f8 = f7.f();
            if ((f8 <= 0 || a9 > d7) && (f8 >= 0 || d7 > a9)) {
                return -1;
            }
            while (!r.m((String) charSequence2, 0, (String) charSequence, a9, charSequence2.length(), z7)) {
                if (a9 == d7) {
                    return -1;
                }
                a9 += f8;
            }
            return a9;
        }
        int a10 = f7.a();
        int d8 = f7.d();
        int f9 = f7.f();
        if ((f9 <= 0 || a10 > d8) && (f9 >= 0 || d8 > a10)) {
            return -1;
        }
        while (!R(charSequence2, 0, charSequence, a10, charSequence2.length(), z7)) {
            if (a10 == d8) {
                return -1;
            }
            a10 += f9;
        }
        return a10;
    }

    public static /* synthetic */ int B(CharSequence charSequence, CharSequence charSequence2, int i7, int i8, boolean z7, boolean z8, int i9, Object obj) {
        if ((i9 & 16) != 0) {
            z8 = false;
        }
        return A(charSequence, charSequence2, i7, i8, z7, z8);
    }

    public static /* synthetic */ int C(CharSequence charSequence, char c7, int i7, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        return y(charSequence, c7, i7, z7);
    }

    public static /* synthetic */ int D(CharSequence charSequence, String str, int i7, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        return z(charSequence, str, i7, z7);
    }

    public static final int E(CharSequence charSequence, char[] chars, int i7, boolean z7) {
        int a7;
        char q7;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z7 && chars.length == 1 && (charSequence instanceof String)) {
            q7 = C0681k.q(chars);
            return ((String) charSequence).indexOf(q7, i7);
        }
        a7 = l6.f.a(i7, 0);
        int x7 = x(charSequence);
        if (a7 > x7) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(a7);
            for (char c7 : chars) {
                if (kotlin.text.a.d(c7, charAt, z7)) {
                    return a7;
                }
            }
            if (a7 == x7) {
                return -1;
            }
            a7++;
        }
    }

    public static boolean F(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        for (int i7 = 0; i7 < charSequence.length(); i7++) {
            if (!CharsKt__CharJVMKt.b(charSequence.charAt(i7))) {
                return false;
            }
        }
        return true;
    }

    public static final int G(CharSequence charSequence, char c7, int i7, boolean z7) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z7 || !(charSequence instanceof String)) ? K(charSequence, new char[]{c7}, i7, z7) : ((String) charSequence).lastIndexOf(c7, i7);
    }

    public static final int H(CharSequence charSequence, String string, int i7, boolean z7) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z7 || !(charSequence instanceof String)) ? A(charSequence, string, i7, 0, z7, true) : ((String) charSequence).lastIndexOf(string, i7);
    }

    public static /* synthetic */ int I(CharSequence charSequence, char c7, int i7, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = x(charSequence);
        }
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        return G(charSequence, c7, i7, z7);
    }

    public static /* synthetic */ int J(CharSequence charSequence, String str, int i7, boolean z7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = x(charSequence);
        }
        if ((i8 & 4) != 0) {
            z7 = false;
        }
        return H(charSequence, str, i7, z7);
    }

    public static final int K(CharSequence charSequence, char[] chars, int i7, boolean z7) {
        int b7;
        char q7;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z7 && chars.length == 1 && (charSequence instanceof String)) {
            q7 = C0681k.q(chars);
            return ((String) charSequence).lastIndexOf(q7, i7);
        }
        for (b7 = l6.f.b(i7, x(charSequence)); -1 < b7; b7--) {
            char charAt = charSequence.charAt(b7);
            for (char c7 : chars) {
                if (kotlin.text.a.d(c7, charAt, z7)) {
                    return b7;
                }
            }
        }
        return -1;
    }

    public static final n6.b L(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return X(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List M(CharSequence charSequence) {
        List e7;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        e7 = n6.h.e(L(charSequence));
        return e7;
    }

    public static final CharSequence N(CharSequence charSequence, int i7, char c7) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException("Desired length " + i7 + " is less than zero.");
        }
        if (i7 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i7);
        int length = i7 - charSequence.length();
        int i8 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c7);
                if (i8 == length) {
                    break;
                }
                i8++;
            }
        }
        sb.append(charSequence);
        return sb;
    }

    public static String O(String str, int i7, char c7) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return N(str, i7, c7).toString();
    }

    public static final n6.b P(CharSequence charSequence, String[] strArr, int i7, boolean z7, int i8) {
        S(i8);
        return new c(charSequence, i7, i8, new a(C0680j.b(strArr), z7));
    }

    public static /* synthetic */ n6.b Q(CharSequence charSequence, String[] strArr, int i7, boolean z7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        if ((i9 & 8) != 0) {
            i8 = 0;
        }
        return P(charSequence, strArr, i7, z7, i8);
    }

    public static final boolean R(CharSequence charSequence, int i7, CharSequence other, int i8, int i9, boolean z7) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i8 < 0 || i7 < 0 || i7 > charSequence.length() - i9 || i8 > other.length() - i9) {
            return false;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            if (!kotlin.text.a.d(charSequence.charAt(i7 + i10), other.charAt(i8 + i10), z7)) {
                return false;
            }
        }
        return true;
    }

    public static final void S(int i7) {
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i7).toString());
    }

    public static final List T(CharSequence charSequence, String[] delimiters, boolean z7, int i7) {
        Iterable c7;
        int l7;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return U(charSequence, str, z7, i7);
            }
        }
        c7 = n6.h.c(Q(charSequence, delimiters, 0, z7, i7, 2, null));
        l7 = W5.p.l(c7, 10);
        ArrayList arrayList = new ArrayList(l7);
        Iterator it = c7.iterator();
        while (it.hasNext()) {
            arrayList.add(Y(charSequence, (l6.c) it.next()));
        }
        return arrayList;
    }

    public static final List U(CharSequence charSequence, String str, boolean z7, int i7) {
        S(i7);
        int i8 = 0;
        int z8 = z(charSequence, str, 0, z7);
        if (z8 == -1 || i7 == 1) {
            return W5.n.b(charSequence.toString());
        }
        boolean z9 = i7 > 0;
        ArrayList arrayList = new ArrayList(z9 ? l6.f.b(i7, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(i8, z8).toString());
            i8 = str.length() + z8;
            if (z9 && arrayList.size() == i7 - 1) {
                break;
            }
            z8 = z(charSequence, str, i8, z7);
        } while (z8 != -1);
        arrayList.add(charSequence.subSequence(i8, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List V(CharSequence charSequence, String[] strArr, boolean z7, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        if ((i8 & 4) != 0) {
            i7 = 0;
        }
        return T(charSequence, strArr, z7, i7);
    }

    public static final n6.b W(CharSequence charSequence, String[] delimiters, boolean z7, int i7) {
        n6.b d7;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        d7 = n6.h.d(Q(charSequence, delimiters, 0, z7, i7, 2, null), new b(charSequence));
        return d7;
    }

    public static /* synthetic */ n6.b X(CharSequence charSequence, String[] strArr, boolean z7, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        if ((i8 & 4) != 0) {
            i7 = 0;
        }
        return W(charSequence, strArr, z7, i7);
    }

    public static final String Y(CharSequence charSequence, l6.c range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.q().intValue(), range.k().intValue() + 1).toString();
    }

    public static final String Z(String str, char c7, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int C7 = C(str, c7, 0, false, 6, null);
        if (C7 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(C7 + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static final String a0(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int D7 = D(str, delimiter, 0, false, 6, null);
        if (D7 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(D7 + delimiter.length(), str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String b0(String str, char c7, String str2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = str;
        }
        return Z(str, c7, str2);
    }

    public static /* synthetic */ String c0(String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str3 = str;
        }
        return a0(str, str2, str3);
    }

    public static String d0(String str, char c7, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int I6 = I(str, c7, 0, false, 6, null);
        if (I6 == -1) {
            return missingDelimiterValue;
        }
        String substring = str.substring(I6 + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String e0(String str, char c7, String str2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str2 = str;
        }
        return d0(str, c7, str2);
    }

    public static CharSequence f0(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i7 = 0;
        boolean z7 = false;
        while (i7 <= length) {
            boolean b7 = CharsKt__CharJVMKt.b(charSequence.charAt(!z7 ? i7 : length));
            if (z7) {
                if (!b7) {
                    break;
                }
                length--;
            } else if (b7) {
                i7++;
            } else {
                z7 = true;
            }
        }
        return charSequence.subSequence(i7, length + 1);
    }

    public static final boolean u(CharSequence charSequence, CharSequence other, boolean z7) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof String) {
            if (D(charSequence, (String) other, 0, z7, 2, null) < 0) {
                return false;
            }
        } else if (B(charSequence, other, 0, charSequence.length(), z7, false, 16, null) < 0) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean v(CharSequence charSequence, CharSequence charSequence2, boolean z7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        return u(charSequence, charSequence2, z7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        return V5.q.a(java.lang.Integer.valueOf(r12), r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final V5.m w(java.lang.CharSequence r10, java.util.Collection r11, int r12, boolean r13, boolean r14) {
        /*
            r0 = 0
            if (r13 != 0) goto L2f
            int r1 = r11.size()
            r2 = 1
            if (r1 != r2) goto L2f
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.Object r11 = W5.m.B(r11)
            java.lang.String r11 = (java.lang.String) r11
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            if (r14 != 0) goto L1f
            int r10 = kotlin.text.i.D(r1, r2, r3, r4, r5, r6)
            goto L23
        L1f:
            int r10 = kotlin.text.i.J(r1, r2, r3, r4, r5, r6)
        L23:
            if (r10 >= 0) goto L26
            goto L2e
        L26:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            V5.m r0 = V5.q.a(r10, r11)
        L2e:
            return r0
        L2f:
            r1 = 0
            if (r14 != 0) goto L40
            l6.c r14 = new l6.c
            int r12 = l6.d.a(r12, r1)
            int r1 = r10.length()
            r14.<init>(r12, r1)
            goto L4c
        L40:
            int r14 = x(r10)
            int r12 = l6.d.b(r12, r14)
            l6.a r14 = l6.d.f(r12, r1)
        L4c:
            boolean r12 = r10 instanceof java.lang.String
            if (r12 == 0) goto L9b
            int r12 = r14.a()
            int r1 = r14.d()
            int r14 = r14.f()
            if (r14 <= 0) goto L60
            if (r12 <= r1) goto L64
        L60:
            if (r14 >= 0) goto Ldc
            if (r1 > r12) goto Ldc
        L64:
            r2 = r11
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r8 = r2.iterator()
        L6b:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L89
            java.lang.Object r9 = r8.next()
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
            r4 = r10
            java.lang.String r4 = (java.lang.String) r4
            int r6 = r2.length()
            r3 = 0
            r5 = r12
            r7 = r13
            boolean r2 = kotlin.text.r.m(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L6b
            goto L8a
        L89:
            r9 = r0
        L8a:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L97
        L8e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            V5.m r10 = V5.q.a(r10, r9)
            return r10
        L97:
            if (r12 == r1) goto Ldc
            int r12 = r12 + r14
            goto L64
        L9b:
            int r12 = r14.a()
            int r1 = r14.d()
            int r14 = r14.f()
            if (r14 <= 0) goto Lab
            if (r12 <= r1) goto Laf
        Lab:
            if (r14 >= 0) goto Ldc
            if (r1 > r12) goto Ldc
        Laf:
            r2 = r11
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r8 = r2.iterator()
        Lb6:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Ld2
            java.lang.Object r9 = r8.next()
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            int r6 = r2.length()
            r4 = r10
            r5 = r12
            r7 = r13
            boolean r2 = R(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto Lb6
            goto Ld3
        Ld2:
            r9 = r0
        Ld3:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto Ld8
            goto L8e
        Ld8:
            if (r12 == r1) goto Ldc
            int r12 = r12 + r14
            goto Laf
        Ldc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.s.w(java.lang.CharSequence, java.util.Collection, int, boolean, boolean):V5.m");
    }

    public static final int x(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int y(CharSequence charSequence, char c7, int i7, boolean z7) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z7 || !(charSequence instanceof String)) ? E(charSequence, new char[]{c7}, i7, z7) : ((String) charSequence).indexOf(c7, i7);
    }

    public static final int z(CharSequence charSequence, String string, int i7, boolean z7) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z7 || !(charSequence instanceof String)) ? B(charSequence, string, i7, charSequence.length(), z7, false, 16, null) : ((String) charSequence).indexOf(string, i7);
    }
}
