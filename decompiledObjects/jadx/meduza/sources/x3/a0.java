package x3;

import java.nio.ByteBuffer;
import v5.e0;
import x3.f;

/* loaded from: classes.dex */
public final class a0 extends q {

    /* renamed from: i, reason: collision with root package name */
    public final long f16893i = 150000;

    /* renamed from: j, reason: collision with root package name */
    public final long f16894j = 20000;

    /* renamed from: k, reason: collision with root package name */
    public final short f16895k = 1024;

    /* renamed from: l, reason: collision with root package name */
    public int f16896l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16897m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f16898n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f16899o;

    /* renamed from: p, reason: collision with root package name */
    public int f16900p;

    /* renamed from: q, reason: collision with root package name */
    public int f16901q;

    /* renamed from: r, reason: collision with root package name */
    public int f16902r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f16903s;
    public long t;

    public a0() {
        byte[] bArr = e0.f;
        this.f16898n = bArr;
        this.f16899o = bArr;
    }

    @Override // x3.f
    public final void b(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f17034g.hasRemaining()) {
            int i10 = this.f16900p;
            if (i10 == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f16898n.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.getShort(limit2)) > this.f16895k) {
                        int i11 = this.f16896l;
                        position = ((limit2 / i11) * i11) + i11;
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f16900p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    j(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f16903s = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i10 == 1) {
                int limit3 = byteBuffer.limit();
                int k10 = k(byteBuffer);
                int position2 = k10 - byteBuffer.position();
                byte[] bArr = this.f16898n;
                int length = bArr.length;
                int i12 = this.f16901q;
                int i13 = length - i12;
                if (k10 >= limit3 || position2 >= i13) {
                    int min = Math.min(position2, i13);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f16898n, this.f16901q, min);
                    int i14 = this.f16901q + min;
                    this.f16901q = i14;
                    byte[] bArr2 = this.f16898n;
                    if (i14 == bArr2.length) {
                        if (this.f16903s) {
                            l(bArr2, this.f16902r);
                            this.t += (this.f16901q - (this.f16902r * 2)) / this.f16896l;
                        } else {
                            this.t += (i14 - this.f16902r) / this.f16896l;
                        }
                        m(byteBuffer, this.f16898n, this.f16901q);
                        this.f16901q = 0;
                        this.f16900p = 2;
                    }
                    byteBuffer.limit(limit3);
                } else {
                    l(bArr, i12);
                    this.f16901q = 0;
                    this.f16900p = 0;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int limit4 = byteBuffer.limit();
                int k11 = k(byteBuffer);
                byteBuffer.limit(k11);
                this.t += byteBuffer.remaining() / this.f16896l;
                m(byteBuffer, this.f16899o, this.f16902r);
                if (k11 < limit4) {
                    l(this.f16899o, this.f16902r);
                    this.f16900p = 0;
                    byteBuffer.limit(limit4);
                }
            }
        }
    }

    @Override // x3.q
    public final f.a f(f.a aVar) {
        if (aVar.f16971c == 2) {
            return this.f16897m ? aVar : f.a.f16968e;
        }
        throw new f.b(aVar);
    }

    @Override // x3.q
    public final void g() {
        if (this.f16897m) {
            f.a aVar = this.f17030b;
            int i10 = aVar.f16972d;
            this.f16896l = i10;
            long j10 = this.f16893i;
            int i11 = aVar.f16969a;
            int i12 = ((int) ((j10 * i11) / 1000000)) * i10;
            if (this.f16898n.length != i12) {
                this.f16898n = new byte[i12];
            }
            int i13 = ((int) ((this.f16894j * i11) / 1000000)) * i10;
            this.f16902r = i13;
            if (this.f16899o.length != i13) {
                this.f16899o = new byte[i13];
            }
        }
        this.f16900p = 0;
        this.t = 0L;
        this.f16901q = 0;
        this.f16903s = false;
    }

    @Override // x3.q
    public final void h() {
        int i10 = this.f16901q;
        if (i10 > 0) {
            l(this.f16898n, i10);
        }
        if (this.f16903s) {
            return;
        }
        this.t += this.f16902r / this.f16896l;
    }

    @Override // x3.q
    public final void i() {
        this.f16897m = false;
        this.f16902r = 0;
        byte[] bArr = e0.f;
        this.f16898n = bArr;
        this.f16899o = bArr;
    }

    @Override // x3.q, x3.f
    public final boolean isActive() {
        return this.f16897m;
    }

    public final int k(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f16895k) {
                int i10 = this.f16896l;
                return (position / i10) * i10;
            }
        }
        return byteBuffer.limit();
    }

    public final void l(byte[] bArr, int i10) {
        j(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f16903s = true;
        }
    }

    public final void m(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f16902r);
        int i11 = this.f16902r - min;
        System.arraycopy(bArr, i10 - i11, this.f16899o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f16899o, i11, min);
    }
}
