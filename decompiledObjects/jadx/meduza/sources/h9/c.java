package h9;

import java.math.RoundingMode;
import ma.h;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final f f7194a = new f();

    /* renamed from: b, reason: collision with root package name */
    public final a f7195b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final b f7196c = new b();

    public class a extends m.e {
        public a() {
            super(5);
        }

        @Override // m.e
        public final void p(h hVar) {
            f fVar = c.this.f7194a;
            fVar.getClass();
            for (int i10 = 0; i10 < hVar.size(); i10++) {
                fVar.b(hVar.i(i10));
            }
            fVar.d((byte) 0);
            fVar.d((byte) 1);
        }

        @Override // m.e
        public final void q(double d10) {
            f fVar = c.this.f7194a;
            fVar.getClass();
            long doubleToLongBits = Double.doubleToLongBits(d10);
            long j10 = doubleToLongBits ^ (doubleToLongBits < 0 ? -1L : Long.MIN_VALUE);
            int a10 = e.a(64 - Long.numberOfLeadingZeros(j10), 8, RoundingMode.UP);
            fVar.a(a10 + 1);
            byte[] bArr = fVar.f7201a;
            int i10 = fVar.f7202b;
            int i11 = i10 + 1;
            fVar.f7202b = i11;
            bArr[i10] = (byte) a10;
            int i12 = i11 + a10;
            while (true) {
                i12--;
                int i13 = fVar.f7202b;
                if (i12 < i13) {
                    fVar.f7202b = i13 + a10;
                    return;
                } else {
                    fVar.f7201a[i12] = (byte) (255 & j10);
                    j10 >>>= 8;
                }
            }
        }

        @Override // m.e
        public final void r() {
            f fVar = c.this.f7194a;
            fVar.d((byte) -1);
            fVar.d((byte) -1);
        }

        @Override // m.e
        public final void t(long j10) {
            c.this.f7194a.f(j10);
        }

        @Override // m.e
        public final void u(String str) {
            int i10;
            int i11;
            f fVar = c.this.f7194a;
            fVar.getClass();
            int length = str.length();
            int i12 = 0;
            while (i12 < length) {
                int charAt = str.charAt(i12);
                if (charAt >= 128) {
                    if (charAt < 2048) {
                        i11 = (charAt >>> 6) | 960;
                    } else {
                        if (charAt < 55296 || 57343 < charAt) {
                            i10 = (charAt >>> 12) | 480;
                        } else {
                            charAt = Character.codePointAt(str, i12);
                            i12++;
                            fVar.b((byte) ((charAt >>> 18) | 240));
                            i10 = ((charAt >>> 12) & 63) | 128;
                        }
                        fVar.b((byte) i10);
                        i11 = ((charAt >>> 6) & 63) | 128;
                    }
                    fVar.b((byte) i11);
                    charAt = (charAt & 63) | 128;
                }
                fVar.b((byte) charAt);
                i12++;
            }
            fVar.d((byte) 0);
            fVar.d((byte) 1);
        }
    }

    public class b extends m.e {
        public b() {
            super(5);
        }

        @Override // m.e
        public final void p(h hVar) {
            f fVar = c.this.f7194a;
            fVar.getClass();
            for (int i10 = 0; i10 < hVar.size(); i10++) {
                fVar.c(hVar.i(i10));
            }
            fVar.e((byte) 0);
            fVar.e((byte) 1);
        }

        @Override // m.e
        public final void q(double d10) {
            f fVar = c.this.f7194a;
            fVar.getClass();
            long doubleToLongBits = Double.doubleToLongBits(d10);
            long j10 = doubleToLongBits ^ (doubleToLongBits < 0 ? -1L : Long.MIN_VALUE);
            int a10 = e.a(64 - Long.numberOfLeadingZeros(j10), 8, RoundingMode.UP);
            fVar.a(a10 + 1);
            byte[] bArr = fVar.f7201a;
            int i10 = fVar.f7202b;
            int i11 = i10 + 1;
            fVar.f7202b = i11;
            bArr[i10] = (byte) (~a10);
            int i12 = i11 + a10;
            while (true) {
                i12--;
                int i13 = fVar.f7202b;
                if (i12 < i13) {
                    fVar.f7202b = i13 + a10;
                    return;
                } else {
                    fVar.f7201a[i12] = (byte) (~(255 & j10));
                    j10 >>>= 8;
                }
            }
        }

        @Override // m.e
        public final void r() {
            f fVar = c.this.f7194a;
            fVar.e((byte) -1);
            fVar.e((byte) -1);
        }

        @Override // m.e
        public final void t(long j10) {
            c.this.f7194a.f(~j10);
        }

        @Override // m.e
        public final void u(String str) {
            int i10;
            int i11;
            f fVar = c.this.f7194a;
            fVar.getClass();
            int length = str.length();
            int i12 = 0;
            while (i12 < length) {
                int charAt = str.charAt(i12);
                if (charAt >= 128) {
                    if (charAt < 2048) {
                        i11 = (charAt >>> 6) | 960;
                    } else {
                        if (charAt < 55296 || 57343 < charAt) {
                            i10 = (charAt >>> 12) | 480;
                        } else {
                            charAt = Character.codePointAt(str, i12);
                            i12++;
                            fVar.c((byte) ((charAt >>> 18) | 240));
                            i10 = ((charAt >>> 12) & 63) | 128;
                        }
                        fVar.c((byte) i10);
                        i11 = ((charAt >>> 6) & 63) | 128;
                    }
                    fVar.c((byte) i11);
                    charAt = (charAt & 63) | 128;
                }
                fVar.c((byte) charAt);
                i12++;
            }
            fVar.e((byte) 0);
            fVar.e((byte) 1);
        }
    }

    public final m.e a(int i10) {
        if (i10 != 0) {
            return i10 == 2 ? this.f7196c : this.f7195b;
        }
        throw null;
    }
}
