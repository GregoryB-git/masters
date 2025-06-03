package va;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f16009a = new String[0];

    public static final tb.g a(tb.g gVar) {
        tb.c<E, ?> cVar = gVar.f14741a;
        cVar.c();
        cVar.f14729u = true;
        if (cVar.f14726q <= 0) {
            ec.i.c(tb.c.f14718v, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        return gVar.f14741a.f14726q > 0 ? gVar : tb.g.f14740b;
    }

    public static final void b(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static b8.h c(java.lang.String r7, java.lang.String r8) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L7
            goto L32
        L7:
            com.google.android.gms.internal.firebase-auth-api.zzan<java.lang.String, java.lang.Integer> r0 = b8.d.f2065d
            m6.j.e(r8)
            b8.d r0 = new b8.d     // Catch: java.lang.IllegalArgumentException -> L12
            r0.<init>(r8)     // Catch: java.lang.IllegalArgumentException -> L12
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L32
            com.google.android.gms.internal.firebase-auth-api.zzan<java.lang.String, java.lang.Integer> r1 = b8.d.f2065d
            java.lang.String r2 = r0.f2067b
            boolean r2 = r1.containsKey(r2)
            if (r2 == 0) goto L2c
            java.lang.String r0 = r0.f2067b
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L2d
        L2c:
            r0 = 3
        L2d:
            r1 = 4
            if (r0 != r1) goto L32
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            if (r0 == 0) goto L41
            b8.h r0 = new b8.h
            r3 = 0
            r5 = 0
            r6 = 0
            r1 = r0
            r2 = r7
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        L41:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Given link is not a valid email link. Please use FirebaseAuth#isSignInWithEmailLink(String) to determine this before calling this function"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: va.a.c(java.lang.String, java.lang.String):b8.h");
    }

    public static final int d(List list) {
        ec.i.e(list, "<this>");
        return list.size() - 1;
    }

    public static final int e(int i10, int i11, int i12) {
        if (i12 > 0) {
            if (i10 >= i11) {
                return i11;
            }
            int i13 = i11 % i12;
            if (i13 < 0) {
                i13 += i12;
            }
            int i14 = i10 % i12;
            if (i14 < 0) {
                i14 += i12;
            }
            int i15 = (i13 - i14) % i12;
            if (i15 < 0) {
                i15 += i12;
            }
            return i11 - i15;
        }
        if (i12 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i10 <= i11) {
            return i11;
        }
        int i16 = -i12;
        int i17 = i10 % i16;
        if (i17 < 0) {
            i17 += i16;
        }
        int i18 = i11 % i16;
        if (i18 < 0) {
            i18 += i16;
        }
        int i19 = (i17 - i18) % i16;
        if (i19 < 0) {
            i19 += i16;
        }
        return i11 + i19;
    }

    public static final List f(Object obj) {
        List singletonList = Collections.singletonList(obj);
        ec.i.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static final List g(Object... objArr) {
        ec.i.e(objArr, "elements");
        return objArr.length > 0 ? sb.j.j(objArr) : sb.s.f14324a;
    }

    public static int h(int i10) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i11 = 0; i11 < 6; i11++) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            if (i13 == i10) {
                return i12;
            }
        }
        return 1;
    }

    public static String i(String str, String[] strArr, String[] strArr2) {
        int min = Math.min(strArr.length, strArr2.length);
        for (int i10 = 0; i10 < min; i10++) {
            String str2 = strArr[i10];
            if ((str == null && str2 == null) ? true : str == null ? false : str.equals(str2)) {
                return strArr2[i10];
            }
        }
        return null;
    }
}
