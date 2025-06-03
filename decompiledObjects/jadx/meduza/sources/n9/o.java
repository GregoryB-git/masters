package n9;

import b.z;
import com.google.firebase.firestore.f;
import eb.e1;
import eb.f1;
import java.security.SecureRandom;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final r3.j f11373a;

    static {
        new SecureRandom();
        f11373a = new r3.j(18);
    }

    public static <T> T a(Iterator<T> it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static int b(byte[] bArr, byte[] bArr2) {
        int min = Math.min(bArr.length, bArr2.length);
        for (int i10 = 0; i10 < min; i10++) {
            int i11 = bArr[i10] & 255;
            int i12 = bArr2[i10] & 255;
            if (i11 < i12) {
                return -1;
            }
            if (i11 > i12) {
                return 1;
            }
        }
        return d(bArr.length, bArr2.length);
    }

    public static int c(ma.h hVar, ma.h hVar2) {
        int min = Math.min(hVar.size(), hVar2.size());
        for (int i10 = 0; i10 < min; i10++) {
            int i11 = hVar.i(i10) & 255;
            int i12 = hVar2.i(i10) & 255;
            if (i11 < i12) {
                return -1;
            }
            if (i11 > i12) {
                return 1;
            }
        }
        return d(hVar.size(), hVar2.size());
    }

    public static int d(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public static int e(double d10, long j10) {
        if (Double.isNaN(d10) || d10 < -9.223372036854776E18d) {
            return -1;
        }
        if (d10 >= 9.223372036854776E18d) {
            return 1;
        }
        int compare = Long.compare((long) d10, j10);
        return compare != 0 ? compare : z.j(d10, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0020, code lost:
    
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> void f(java.util.Iterator<T> r6, java.util.Iterator<T> r7, java.util.Comparator<? super T> r8, n9.d<T> r9, n9.d<T> r10) {
        /*
        L0:
            java.lang.Object r0 = a(r6)
        L4:
            java.lang.Object r1 = a(r7)
        L8:
            if (r0 != 0) goto Le
            if (r1 == 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L20
            if (r1 == 0) goto L20
            int r4 = r8.compare(r0, r1)
            if (r4 >= 0) goto L1b
            goto L26
        L1b:
            if (r4 <= 0) goto L1e
            goto L23
        L1e:
            r3 = r2
            goto L26
        L20:
            if (r0 == 0) goto L23
            goto L26
        L23:
            r5 = r3
            r3 = r2
            r2 = r5
        L26:
            if (r2 == 0) goto L2c
            r9.accept(r1)
            goto L4
        L2c:
            if (r3 == 0) goto L0
            r10.accept(r0)
            java.lang.Object r0 = a(r6)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.o.f(java.util.Iterator, java.util.Iterator, java.util.Comparator, n9.d, n9.d):void");
    }

    public static com.google.firebase.firestore.f g(e1 e1Var) {
        e1Var.getClass();
        f1 f1Var = new f1(e1Var);
        return new com.google.firebase.firestore.f(f1Var.getMessage(), f.a.f3171u.get(e1Var.f5081a.f5098a, f.a.UNKNOWN), f1Var);
    }

    public static StringBuilder h(CharSequence charSequence, int i10, String str) {
        StringBuilder sb2 = new StringBuilder();
        if (i10 != 0) {
            sb2.append(charSequence);
            for (int i11 = 1; i11 < i10; i11++) {
                sb2.append((CharSequence) str);
                sb2.append(charSequence);
            }
        }
        return sb2;
    }

    public static String i(ma.h hVar) {
        int size = hVar.size();
        StringBuilder sb2 = new StringBuilder(size * 2);
        for (int i10 = 0; i10 < size; i10++) {
            int i11 = hVar.i(i10) & 255;
            sb2.append(Character.forDigit(i11 >>> 4, 16));
            sb2.append(Character.forDigit(i11 & 15, 16));
        }
        return sb2.toString();
    }

    public static String j(Object obj) {
        return obj == null ? "null" : obj.getClass().getName();
    }
}
