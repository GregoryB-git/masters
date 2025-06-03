package m0;

import e0.InterfaceC1240b;
import g0.AbstractC1297a;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class d0 extends e0.d {

    /* renamed from: i, reason: collision with root package name */
    public final float f17525i;

    /* renamed from: j, reason: collision with root package name */
    public final short f17526j;

    /* renamed from: k, reason: collision with root package name */
    public final int f17527k;

    /* renamed from: l, reason: collision with root package name */
    public final long f17528l;

    /* renamed from: m, reason: collision with root package name */
    public final long f17529m;

    /* renamed from: n, reason: collision with root package name */
    public int f17530n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f17531o;

    /* renamed from: p, reason: collision with root package name */
    public int f17532p;

    /* renamed from: q, reason: collision with root package name */
    public long f17533q;

    /* renamed from: r, reason: collision with root package name */
    public int f17534r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f17535s;

    /* renamed from: t, reason: collision with root package name */
    public int f17536t;

    /* renamed from: u, reason: collision with root package name */
    public int f17537u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f17538v;

    public d0() {
        this(100000L, 0.2f, 2000000L, 10, (short) 1024);
    }

    public static void D(byte[] bArr, int i7, int i8) {
        if (i8 >= 32767) {
            bArr[i7] = -1;
            bArr[i7 + 1] = Byte.MAX_VALUE;
        } else if (i8 <= -32768) {
            bArr[i7] = 0;
            bArr[i7 + 1] = Byte.MIN_VALUE;
        } else {
            bArr[i7] = (byte) (i8 & 255);
            bArr[i7 + 1] = (byte) (i8 >> 8);
        }
    }

    public static int G(byte b7, byte b8) {
        return (b7 << 8) | (b8 & 255);
    }

    public final void A(boolean z7) {
        int length;
        int r7;
        int i7 = this.f17537u;
        byte[] bArr = this.f17535s;
        if (i7 == bArr.length || z7) {
            if (this.f17534r == 0) {
                if (z7) {
                    B(i7, 3);
                    length = i7;
                } else {
                    AbstractC1297a.f(i7 >= bArr.length / 2);
                    length = this.f17535s.length / 2;
                    B(length, 0);
                }
                r7 = length;
            } else if (z7) {
                int length2 = i7 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int r8 = r(length2) + (this.f17535s.length / 2);
                B(r8, 2);
                r7 = r8;
                length = length3;
            } else {
                length = i7 - (bArr.length / 2);
                r7 = r(length);
                B(r7, 1);
            }
            AbstractC1297a.g(length % this.f17530n == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            AbstractC1297a.f(i7 >= r7);
            this.f17537u -= length;
            int i8 = this.f17536t + length;
            this.f17536t = i8;
            this.f17536t = i8 % this.f17535s.length;
            this.f17534r = this.f17534r + (r7 / this.f17530n);
            this.f17533q += (length - r7) / r2;
        }
    }

    public final void B(int i7, int i8) {
        if (i7 == 0) {
            return;
        }
        AbstractC1297a.a(this.f17537u >= i7);
        if (i8 == 2) {
            int i9 = this.f17536t;
            int i10 = this.f17537u;
            int i11 = i9 + i10;
            byte[] bArr = this.f17535s;
            if (i11 <= bArr.length) {
                System.arraycopy(bArr, (i9 + i10) - i7, this.f17538v, 0, i7);
            } else {
                int length = i10 - (bArr.length - i9);
                if (length >= i7) {
                    System.arraycopy(bArr, length - i7, this.f17538v, 0, i7);
                } else {
                    int i12 = i7 - length;
                    System.arraycopy(bArr, bArr.length - i12, this.f17538v, 0, i12);
                    System.arraycopy(this.f17535s, 0, this.f17538v, i12, length);
                }
            }
        } else {
            int i13 = this.f17536t;
            int i14 = i13 + i7;
            byte[] bArr2 = this.f17535s;
            if (i14 <= bArr2.length) {
                System.arraycopy(bArr2, i13, this.f17538v, 0, i7);
            } else {
                int length2 = bArr2.length - i13;
                System.arraycopy(bArr2, i13, this.f17538v, 0, length2);
                System.arraycopy(this.f17535s, 0, this.f17538v, length2, i7 - length2);
            }
        }
        AbstractC1297a.b(i7 % this.f17530n == 0, "sizeToOutput is not aligned to frame size: " + i7);
        AbstractC1297a.f(this.f17536t < this.f17535s.length);
        z(this.f17538v, i7, i8);
    }

    public final void C(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f17535s.length));
        int t7 = t(byteBuffer);
        if (t7 == byteBuffer.position()) {
            this.f17532p = 1;
        } else {
            byteBuffer.limit(Math.min(t7, byteBuffer.capacity()));
            y(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    public void E(boolean z7) {
        this.f17531o = z7;
    }

    public final void F(ByteBuffer byteBuffer) {
        int i7;
        int i8;
        AbstractC1297a.f(this.f17536t < this.f17535s.length);
        int limit = byteBuffer.limit();
        int u7 = u(byteBuffer);
        int position = u7 - byteBuffer.position();
        int i9 = this.f17536t;
        int i10 = this.f17537u;
        int i11 = i9 + i10;
        byte[] bArr = this.f17535s;
        if (i11 < bArr.length) {
            i7 = bArr.length - (i10 + i9);
            i8 = i9 + i10;
        } else {
            int length = i10 - (bArr.length - i9);
            i7 = i9 - length;
            i8 = length;
        }
        boolean z7 = u7 < limit;
        int min = Math.min(position, i7);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f17535s, i8, min);
        int i12 = this.f17537u + min;
        this.f17537u = i12;
        AbstractC1297a.f(i12 <= this.f17535s.length);
        boolean z8 = z7 && position < i7;
        A(z8);
        if (z8) {
            this.f17532p = 0;
            this.f17534r = 0;
        }
        byteBuffer.limit(limit);
    }

    @Override // e0.d, e0.InterfaceC1240b
    public boolean a() {
        return super.a() && this.f17531o;
    }

    @Override // e0.InterfaceC1240b
    public void f(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !h()) {
            int i7 = this.f17532p;
            if (i7 == 0) {
                C(byteBuffer);
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException();
                }
                F(byteBuffer);
            }
        }
    }

    @Override // e0.d
    public InterfaceC1240b.a i(InterfaceC1240b.a aVar) {
        if (aVar.f13679c == 2) {
            return aVar.f13677a == -1 ? InterfaceC1240b.a.f13676e : aVar;
        }
        throw new InterfaceC1240b.C0195b(aVar);
    }

    @Override // e0.d
    public void j() {
        if (a()) {
            this.f17530n = this.f13682b.f13678b * 2;
            int o7 = o(s(this.f17528l) / 2) * 2;
            if (this.f17535s.length != o7) {
                this.f17535s = new byte[o7];
                this.f17538v = new byte[o7];
            }
        }
        this.f17532p = 0;
        this.f17533q = 0L;
        this.f17534r = 0;
        this.f17536t = 0;
        this.f17537u = 0;
    }

    @Override // e0.d
    public void k() {
        if (this.f17537u > 0) {
            A(true);
            this.f17534r = 0;
        }
    }

    @Override // e0.d
    public void l() {
        this.f17531o = false;
        byte[] bArr = g0.M.f14266f;
        this.f17535s = bArr;
        this.f17538v = bArr;
    }

    public final int n(float f7) {
        return o((int) f7);
    }

    public final int o(int i7) {
        int i8 = this.f17530n;
        return (i7 / i8) * i8;
    }

    public final int p(int i7, int i8) {
        int i9 = this.f17527k;
        return i9 + ((((100 - i9) * (i7 * 1000)) / i8) / 1000);
    }

    public final int q(int i7, int i8) {
        return (((this.f17527k - 100) * ((i7 * 1000) / i8)) / 1000) + 100;
    }

    public final int r(int i7) {
        int s7 = ((s(this.f17529m) - this.f17534r) * this.f17530n) - (this.f17535s.length / 2);
        AbstractC1297a.f(s7 >= 0);
        return n(Math.min((i7 * this.f17525i) + 0.5f, s7));
    }

    public final int s(long j7) {
        return (int) ((j7 * this.f13682b.f13677a) / 1000000);
    }

    public final int t(ByteBuffer byteBuffer) {
        for (int limit = byteBuffer.limit() - 1; limit >= byteBuffer.position(); limit -= 2) {
            if (w(byteBuffer.get(limit), byteBuffer.get(limit - 1))) {
                int i7 = this.f17530n;
                return ((limit / i7) * i7) + i7;
            }
        }
        return byteBuffer.position();
    }

    public final int u(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (w(byteBuffer.get(position), byteBuffer.get(position - 1))) {
                int i7 = this.f17530n;
                return i7 * (position / i7);
            }
        }
        return byteBuffer.limit();
    }

    public long v() {
        return this.f17533q;
    }

    public final boolean w(byte b7, byte b8) {
        return Math.abs(G(b7, b8)) > this.f17526j;
    }

    public final void x(byte[] bArr, int i7, int i8) {
        if (i8 == 3) {
            return;
        }
        for (int i9 = 0; i9 < i7; i9 += 2) {
            D(bArr, i9, (G(bArr[i9 + 1], bArr[i9]) * (i8 == 0 ? q(i9, i7 - 1) : i8 == 2 ? p(i9, i7 - 1) : this.f17527k)) / 100);
        }
    }

    public final void y(ByteBuffer byteBuffer) {
        m(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    public final void z(byte[] bArr, int i7, int i8) {
        AbstractC1297a.b(i7 % this.f17530n == 0, "byteOutput size is not aligned to frame size " + i7);
        x(bArr, i7, i8);
        m(i7).put(bArr, 0, i7).flip();
    }

    public d0(long j7, float f7, long j8, int i7, short s7) {
        boolean z7 = false;
        this.f17534r = 0;
        this.f17536t = 0;
        this.f17537u = 0;
        if (f7 >= 0.0f && f7 <= 1.0f) {
            z7 = true;
        }
        AbstractC1297a.a(z7);
        this.f17528l = j7;
        this.f17525i = f7;
        this.f17529m = j8;
        this.f17527k = i7;
        this.f17526j = s7;
        byte[] bArr = g0.M.f14266f;
        this.f17535s = bArr;
        this.f17538v = bArr;
    }
}
