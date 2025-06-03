package xc;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes.dex */
public class i implements Serializable, Comparable<i> {

    /* renamed from: d, reason: collision with root package name */
    public static final i f17259d = new i(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f17260a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f17261b;

    /* renamed from: c, reason: collision with root package name */
    public transient String f17262c;

    public static final class a {
        public static i a(String str) {
            ec.i.e(str, "<this>");
            byte[] bytes = str.getBytes(lc.a.f9829a);
            ec.i.d(bytes, "this as java.lang.String).getBytes(charset)");
            i iVar = new i(bytes);
            iVar.f17262c = str;
            return iVar;
        }
    }

    public i(byte[] bArr) {
        ec.i.e(bArr, "data");
        this.f17260a = bArr;
    }

    public static final i g(String str) {
        if (!(str.length() % 2 == 0)) {
            throw new IllegalArgumentException(defpackage.g.d("Unexpected hex string: ", str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (yc.b.a(str.charAt(i11 + 1)) + (yc.b.a(str.charAt(i11)) << 4));
        }
        return new i(bArr);
    }

    public static final i o(byte... bArr) {
        ec.i.e(bArr, "data");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        ec.i.d(copyOf, "copyOf(this, size)");
        return new i(copyOf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r0 < r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r6 < r7) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        return 1;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compareTo(xc.i r9) {
        /*
            r8 = this;
            xc.i r9 = (xc.i) r9
            java.lang.String r0 = "other"
            ec.i.e(r9, r0)
            int r0 = r8.i()
            int r1 = r9.i()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L15:
            r5 = -1
            if (r4 >= r2) goto L2c
            byte r6 = r8.n(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r7 = r9.n(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r6 != r7) goto L29
            int r4 = r4 + 1
            goto L15
        L29:
            if (r6 >= r7) goto L33
            goto L31
        L2c:
            if (r0 != r1) goto L2f
            goto L34
        L2f:
            if (r0 >= r1) goto L33
        L31:
            r3 = r5
            goto L34
        L33:
            r3 = 1
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: xc.i.compareTo(java.lang.Object):int");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            int i10 = iVar.i();
            byte[] bArr = this.f17260a;
            if (i10 == bArr.length && iVar.p(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        byte[] bArr = this.f17260a;
        byte[] bArr2 = xc.a.f17238a;
        ec.i.e(bArr, "<this>");
        ec.i.e(bArr2, "map");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            int i13 = i12 + 1;
            byte b11 = bArr[i12];
            int i14 = i13 + 1;
            byte b12 = bArr[i13];
            int i15 = i11 + 1;
            bArr3[i11] = bArr2[(b10 & 255) >> 2];
            int i16 = i15 + 1;
            bArr3[i15] = bArr2[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i17 = i16 + 1;
            bArr3[i16] = bArr2[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i11 = i17 + 1;
            bArr3[i17] = bArr2[b12 & 63];
            i10 = i14;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i10];
            int i18 = i11 + 1;
            bArr3[i11] = bArr2[(b13 & 255) >> 2];
            int i19 = i18 + 1;
            bArr3[i18] = bArr2[(b13 & 3) << 4];
            bArr3[i19] = 61;
            bArr3[i19 + 1] = 61;
        } else if (length2 == 2) {
            int i20 = i10 + 1;
            byte b14 = bArr[i10];
            byte b15 = bArr[i20];
            int i21 = i11 + 1;
            bArr3[i11] = bArr2[(b14 & 255) >> 2];
            int i22 = i21 + 1;
            bArr3[i21] = bArr2[((b14 & 3) << 4) | ((b15 & 255) >> 4)];
            bArr3[i22] = bArr2[(b15 & 15) << 2];
            bArr3[i22 + 1] = 61;
        }
        return new String(bArr3, lc.a.f9829a);
    }

    public i h(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f17260a, 0, i());
        byte[] digest = messageDigest.digest();
        ec.i.d(digest, "digestBytes");
        return new i(digest);
    }

    public int hashCode() {
        int i10 = this.f17261b;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = Arrays.hashCode(this.f17260a);
        this.f17261b = hashCode;
        return hashCode;
    }

    public int i() {
        return this.f17260a.length;
    }

    public String l() {
        byte[] bArr = this.f17260a;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = yc.b.f17468a;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public byte[] m() {
        return this.f17260a;
    }

    public byte n(int i10) {
        return this.f17260a[i10];
    }

    public boolean p(int i10, byte[] bArr, int i11, int i12) {
        ec.i.e(bArr, "other");
        if (i10 >= 0) {
            byte[] bArr2 = this.f17260a;
            if (i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && b.a(bArr2, i10, bArr, i11, i12)) {
                return true;
            }
        }
        return false;
    }

    public boolean q(i iVar, int i10) {
        ec.i.e(iVar, "other");
        return iVar.p(0, this.f17260a, 0, i10);
    }

    public i r() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f17260a;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                ec.i.d(copyOf, "copyOf(this, size)");
                copyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                    byte b11 = copyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        copyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new i(copyOf);
            }
            i10++;
        }
    }

    public byte[] s() {
        byte[] bArr = this.f17260a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        ec.i.d(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final String t() {
        String str = this.f17262c;
        if (str != null) {
            return str;
        }
        byte[] m10 = m();
        ec.i.e(m10, "<this>");
        String str2 = new String(m10, lc.a.f9829a);
        this.f17262c = str2;
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e7, code lost:
    
        if (r4 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e0, code lost:
    
        if (r4 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01d3, code lost:
    
        if (r4 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01bd, code lost:
    
        if (r4 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ae, code lost:
    
        if (r4 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x019d, code lost:
    
        if (r4 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x018c, code lost:
    
        if (r4 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0228, code lost:
    
        if (r4 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0142, code lost:
    
        if (r4 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0135, code lost:
    
        if (r4 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0123, code lost:
    
        if (r4 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0114, code lost:
    
        if (r4 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0103, code lost:
    
        if (r4 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x00b5, code lost:
    
        if (r4 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x00aa, code lost:
    
        if (r4 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x009b, code lost:
    
        if (r4 == 64) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x022b, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x022b A[EDGE_INSN: B:156:0x022b->B:62:0x022b BREAK  A[LOOP:0: B:8:0x0014->B:98:0x0014], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x022b A[EDGE_INSN: B:206:0x022b->B:62:0x022b BREAK  A[LOOP:0: B:8:0x0014->B:98:0x0014], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x022b A[EDGE_INSN: B:242:0x022b->B:62:0x022b BREAK  A[LOOP:0: B:8:0x0014->B:98:0x0014], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x022b A[EDGE_INSN: B:268:0x022b->B:62:0x022b BREAK  A[LOOP:0: B:8:0x0014->B:98:0x0014, LOOP_LABEL: LOOP:0: B:8:0x0014->B:98:0x0014], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022b A[EDGE_INSN: B:61:0x022b->B:62:0x022b BREAK  A[LOOP:0: B:8:0x0014->B:98:0x0014], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 753
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xc.i.toString():java.lang.String");
    }

    public void u(f fVar, int i10) {
        ec.i.e(fVar, "buffer");
        fVar.write(this.f17260a, 0, i10);
    }
}
