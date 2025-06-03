package p7;

import defpackage.f;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import p2.m0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final c f13018a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: p7.a$a, reason: collision with other inner class name */
    public static final class C0195a {

        /* renamed from: a, reason: collision with root package name */
        public final String f13019a;

        /* renamed from: b, reason: collision with root package name */
        public final char[] f13020b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13021c;

        /* renamed from: d, reason: collision with root package name */
        public final int f13022d;

        /* renamed from: e, reason: collision with root package name */
        public final int f13023e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final byte[] f13024g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean[] f13025h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f13026i;

        public C0195a(String str, char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i10 = 0; i10 < cArr.length; i10++) {
                char c10 = cArr[i10];
                if (!(c10 < 128)) {
                    throw new IllegalArgumentException(m0.X("Non-ASCII character: %s", Character.valueOf(c10)));
                }
                if (!(bArr[c10] == -1)) {
                    throw new IllegalArgumentException(m0.X("Duplicate character: %s", Character.valueOf(c10)));
                }
                bArr[c10] = (byte) i10;
            }
            this.f13019a = str;
            this.f13020b = cArr;
            try {
                int b10 = q7.b.b(cArr.length, RoundingMode.UNNECESSARY);
                this.f13022d = b10;
                int numberOfTrailingZeros = Integer.numberOfTrailingZeros(b10);
                int i11 = 1 << (3 - numberOfTrailingZeros);
                this.f13023e = i11;
                this.f = b10 >> numberOfTrailingZeros;
                this.f13021c = cArr.length - 1;
                this.f13024g = bArr;
                boolean[] zArr = new boolean[i11];
                for (int i12 = 0; i12 < this.f; i12++) {
                    zArr[q7.b.a(i12 * 8, this.f13022d, RoundingMode.CEILING)] = true;
                }
                this.f13025h = zArr;
                this.f13026i = false;
            } catch (ArithmeticException e10) {
                StringBuilder l10 = f.l("Illegal alphabet length ");
                l10.append(cArr.length);
                throw new IllegalArgumentException(l10.toString(), e10);
            }
        }

        public final int a(char c10) {
            if (c10 > 127) {
                StringBuilder l10 = f.l("Unrecognized character: 0x");
                l10.append(Integer.toHexString(c10));
                throw new d(l10.toString());
            }
            byte b10 = this.f13024g[c10];
            if (b10 != -1) {
                return b10;
            }
            if (c10 <= ' ' || c10 == 127) {
                StringBuilder l11 = f.l("Unrecognized character: 0x");
                l11.append(Integer.toHexString(c10));
                throw new d(l11.toString());
            }
            throw new d("Unrecognized character: " + c10);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C0195a)) {
                return false;
            }
            C0195a c0195a = (C0195a) obj;
            return this.f13026i == c0195a.f13026i && Arrays.equals(this.f13020b, c0195a.f13020b);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f13020b) + (this.f13026i ? 1231 : 1237);
        }

        public final String toString() {
            return this.f13019a;
        }
    }

    public static final class b extends e {

        /* renamed from: d, reason: collision with root package name */
        public final char[] f13027d;

        public b(C0195a c0195a) {
            super(c0195a, null);
            this.f13027d = new char[512];
            x6.b.t(c0195a.f13020b.length == 16);
            for (int i10 = 0; i10 < 256; i10++) {
                char[] cArr = this.f13027d;
                char[] cArr2 = c0195a.f13020b;
                cArr[i10] = cArr2[i10 >>> 4];
                cArr[i10 | 256] = cArr2[i10 & 15];
            }
        }

        @Override // p7.a.e, p7.a
        public final int b(byte[] bArr, CharSequence charSequence) {
            if (charSequence.length() % 2 == 1) {
                StringBuilder l10 = f.l("Invalid input length ");
                l10.append(charSequence.length());
                throw new d(l10.toString());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequence.length()) {
                bArr[i11] = (byte) ((this.f13028b.a(charSequence.charAt(i10)) << 4) | this.f13028b.a(charSequence.charAt(i10 + 1)));
                i10 += 2;
                i11++;
            }
            return i11;
        }

        @Override // p7.a.e, p7.a
        public final void d(StringBuilder sb2, byte[] bArr, int i10) {
            x6.b.E(0, 0 + i10, bArr.length);
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = bArr[0 + i11] & 255;
                sb2.append(this.f13027d[i12]);
                sb2.append(this.f13027d[i12 | 256]);
            }
        }

        @Override // p7.a.e
        public final a g(C0195a c0195a) {
            return new b(c0195a);
        }
    }

    public static final class c extends e {
        public c(String str, String str2, Character ch) {
            this(new C0195a(str, str2.toCharArray()), ch);
        }

        public c(C0195a c0195a, Character ch) {
            super(c0195a, ch);
            x6.b.t(c0195a.f13020b.length == 64);
        }

        @Override // p7.a.e, p7.a
        public final int b(byte[] bArr, CharSequence charSequence) {
            CharSequence e10 = e(charSequence);
            C0195a c0195a = this.f13028b;
            if (!c0195a.f13025h[e10.length() % c0195a.f13023e]) {
                StringBuilder l10 = f.l("Invalid input length ");
                l10.append(e10.length());
                throw new d(l10.toString());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < e10.length()) {
                int i12 = i10 + 1;
                int i13 = i12 + 1;
                int a10 = (this.f13028b.a(e10.charAt(i10)) << 18) | (this.f13028b.a(e10.charAt(i12)) << 12);
                int i14 = i11 + 1;
                bArr[i11] = (byte) (a10 >>> 16);
                if (i13 < e10.length()) {
                    int i15 = i13 + 1;
                    int a11 = a10 | (this.f13028b.a(e10.charAt(i13)) << 6);
                    i11 = i14 + 1;
                    bArr[i14] = (byte) ((a11 >>> 8) & 255);
                    if (i15 < e10.length()) {
                        i13 = i15 + 1;
                        i14 = i11 + 1;
                        bArr[i11] = (byte) ((a11 | this.f13028b.a(e10.charAt(i15))) & 255);
                    } else {
                        i10 = i15;
                    }
                }
                i11 = i14;
                i10 = i13;
            }
            return i11;
        }

        @Override // p7.a.e, p7.a
        public final void d(StringBuilder sb2, byte[] bArr, int i10) {
            int i11 = 0;
            int i12 = 0 + i10;
            x6.b.E(0, i12, bArr.length);
            while (i10 >= 3) {
                int i13 = i11 + 1;
                int i14 = i13 + 1;
                int i15 = ((bArr[i11] & 255) << 16) | ((bArr[i13] & 255) << 8);
                int i16 = i15 | (bArr[i14] & 255);
                sb2.append(this.f13028b.f13020b[i16 >>> 18]);
                sb2.append(this.f13028b.f13020b[(i16 >>> 12) & 63]);
                sb2.append(this.f13028b.f13020b[(i16 >>> 6) & 63]);
                sb2.append(this.f13028b.f13020b[i16 & 63]);
                i10 -= 3;
                i11 = i14 + 1;
            }
            if (i11 < i12) {
                f(sb2, bArr, i11, i12 - i11);
            }
        }

        @Override // p7.a.e
        public final a g(C0195a c0195a) {
            return new c(c0195a, null);
        }
    }

    public static final class d extends IOException {
        public d(String str) {
            super(str);
        }
    }

    public static class e extends a {

        /* renamed from: b, reason: collision with root package name */
        public final C0195a f13028b;

        /* renamed from: c, reason: collision with root package name */
        public final Character f13029c;

        public e(String str, String str2, Character ch) {
            this(new C0195a(str, str2.toCharArray()), ch);
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        
            if ((r2 < r5.length && r5[r2] != -1) == false) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public e(p7.a.C0195a r5, java.lang.Character r6) {
            /*
                r4 = this;
                r4.<init>()
                r5.getClass()
                r4.f13028b = r5
                r0 = 0
                r1 = 1
                if (r6 == 0) goto L1f
                char r2 = r6.charValue()
                byte[] r5 = r5.f13024g
                int r3 = r5.length
                if (r2 >= r3) goto L1c
                r5 = r5[r2]
                r2 = -1
                if (r5 == r2) goto L1c
                r5 = r1
                goto L1d
            L1c:
                r5 = r0
            L1d:
                if (r5 != 0) goto L20
            L1f:
                r0 = r1
            L20:
                java.lang.String r5 = "Padding character %s was already in alphabet"
                x6.b.n(r6, r5, r0)
                r4.f13029c = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p7.a.e.<init>(p7.a$a, java.lang.Character):void");
        }

        @Override // p7.a
        public int b(byte[] bArr, CharSequence charSequence) {
            C0195a c0195a;
            CharSequence e10 = e(charSequence);
            C0195a c0195a2 = this.f13028b;
            if (!c0195a2.f13025h[e10.length() % c0195a2.f13023e]) {
                StringBuilder l10 = f.l("Invalid input length ");
                l10.append(e10.length());
                throw new d(l10.toString());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < e10.length()) {
                long j10 = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    c0195a = this.f13028b;
                    if (i12 >= c0195a.f13023e) {
                        break;
                    }
                    j10 <<= c0195a.f13022d;
                    if (i10 + i12 < e10.length()) {
                        j10 |= this.f13028b.a(e10.charAt(i13 + i10));
                        i13++;
                    }
                    i12++;
                }
                int i14 = c0195a.f;
                int i15 = (i14 * 8) - (i13 * c0195a.f13022d);
                int i16 = (i14 - 1) * 8;
                while (i16 >= i15) {
                    bArr[i11] = (byte) ((j10 >>> i16) & 255);
                    i16 -= 8;
                    i11++;
                }
                i10 += this.f13028b.f13023e;
            }
            return i11;
        }

        @Override // p7.a
        public void d(StringBuilder sb2, byte[] bArr, int i10) {
            x6.b.E(0, 0 + i10, bArr.length);
            int i11 = 0;
            while (i11 < i10) {
                f(sb2, bArr, 0 + i11, Math.min(this.f13028b.f, i10 - i11));
                i11 += this.f13028b.f;
            }
        }

        @Override // p7.a
        public final CharSequence e(CharSequence charSequence) {
            Character ch = this.f13029c;
            if (ch == null) {
                return charSequence;
            }
            char charValue = ch.charValue();
            int length = charSequence.length();
            do {
                length--;
                if (length < 0) {
                    break;
                }
            } while (charSequence.charAt(length) == charValue);
            return charSequence.subSequence(0, length + 1);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f13028b.equals(eVar.f13028b) && Objects.equals(this.f13029c, eVar.f13029c);
        }

        public final void f(StringBuilder sb2, byte[] bArr, int i10, int i11) {
            x6.b.E(i10, i10 + i11, bArr.length);
            int i12 = 0;
            x6.b.t(i11 <= this.f13028b.f);
            long j10 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                j10 = (j10 | (bArr[i10 + i13] & 255)) << 8;
            }
            int i14 = ((i11 + 1) * 8) - this.f13028b.f13022d;
            while (i12 < i11 * 8) {
                C0195a c0195a = this.f13028b;
                sb2.append(c0195a.f13020b[((int) (j10 >>> (i14 - i12))) & c0195a.f13021c]);
                i12 += this.f13028b.f13022d;
            }
            if (this.f13029c != null) {
                while (i12 < this.f13028b.f * 8) {
                    sb2.append(this.f13029c.charValue());
                    i12 += this.f13028b.f13022d;
                }
            }
        }

        public a g(C0195a c0195a) {
            return new e(c0195a, null);
        }

        public final int hashCode() {
            return this.f13028b.hashCode() ^ Objects.hashCode(this.f13029c);
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("BaseEncoding.");
            sb2.append(this.f13028b);
            if (8 % this.f13028b.f13022d != 0) {
                if (this.f13029c == null) {
                    str = ".omitPadding()";
                } else {
                    sb2.append(".withPadChar('");
                    sb2.append(this.f13029c);
                    str = "')";
                }
                sb2.append(str);
            }
            return sb2.toString();
        }
    }

    static {
        new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        new b(new C0195a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public final byte[] a(String str) {
        try {
            int length = (int) (((((e) this).f13028b.f13022d * r6.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int b10 = b(bArr, e(str));
            if (b10 == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[b10];
            System.arraycopy(bArr, 0, bArr2, 0, b10);
            return bArr2;
        } catch (d e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract int b(byte[] bArr, CharSequence charSequence);

    public final String c(byte[] bArr) {
        int length = bArr.length;
        x6.b.E(0, length + 0, bArr.length);
        C0195a c0195a = ((e) this).f13028b;
        StringBuilder sb2 = new StringBuilder(q7.b.a(length, c0195a.f, RoundingMode.CEILING) * c0195a.f13023e);
        try {
            d(sb2, bArr, length);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public abstract void d(StringBuilder sb2, byte[] bArr, int i10);

    public abstract CharSequence e(CharSequence charSequence);
}
