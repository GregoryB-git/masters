package m0;

import e0.InterfaceC1240b;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class f0 extends e0.d {

    /* renamed from: i, reason: collision with root package name */
    public int f17549i;

    /* renamed from: j, reason: collision with root package name */
    public int f17550j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17551k;

    /* renamed from: l, reason: collision with root package name */
    public int f17552l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f17553m = g0.M.f14266f;

    /* renamed from: n, reason: collision with root package name */
    public int f17554n;

    /* renamed from: o, reason: collision with root package name */
    public long f17555o;

    @Override // e0.d, e0.InterfaceC1240b
    public boolean c() {
        return super.c() && this.f17554n == 0;
    }

    @Override // e0.d, e0.InterfaceC1240b
    public ByteBuffer d() {
        int i7;
        if (super.c() && (i7 = this.f17554n) > 0) {
            m(i7).put(this.f17553m, 0, this.f17554n).flip();
            this.f17554n = 0;
        }
        return super.d();
    }

    @Override // e0.InterfaceC1240b
    public void f(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        if (i7 == 0) {
            return;
        }
        int min = Math.min(i7, this.f17552l);
        this.f17555o += min / this.f13682b.f13680d;
        this.f17552l -= min;
        byteBuffer.position(position + min);
        if (this.f17552l > 0) {
            return;
        }
        int i8 = i7 - min;
        int length = (this.f17554n + i8) - this.f17553m.length;
        ByteBuffer m7 = m(length);
        int p7 = g0.M.p(length, 0, this.f17554n);
        m7.put(this.f17553m, 0, p7);
        int p8 = g0.M.p(length - p7, 0, i8);
        byteBuffer.limit(byteBuffer.position() + p8);
        m7.put(byteBuffer);
        byteBuffer.limit(limit);
        int i9 = i8 - p8;
        int i10 = this.f17554n - p7;
        this.f17554n = i10;
        byte[] bArr = this.f17553m;
        System.arraycopy(bArr, p7, bArr, 0, i10);
        byteBuffer.get(this.f17553m, this.f17554n, i9);
        this.f17554n += i9;
        m7.flip();
    }

    @Override // e0.d
    public InterfaceC1240b.a i(InterfaceC1240b.a aVar) {
        if (aVar.f13679c != 2) {
            throw new InterfaceC1240b.C0195b(aVar);
        }
        this.f17551k = true;
        return (this.f17549i == 0 && this.f17550j == 0) ? InterfaceC1240b.a.f13676e : aVar;
    }

    @Override // e0.d
    public void j() {
        if (this.f17551k) {
            this.f17551k = false;
            int i7 = this.f17550j;
            int i8 = this.f13682b.f13680d;
            this.f17553m = new byte[i7 * i8];
            this.f17552l = this.f17549i * i8;
        }
        this.f17554n = 0;
    }

    @Override // e0.d
    public void k() {
        if (this.f17551k) {
            if (this.f17554n > 0) {
                this.f17555o += r0 / this.f13682b.f13680d;
            }
            this.f17554n = 0;
        }
    }

    @Override // e0.d
    public void l() {
        this.f17553m = g0.M.f14266f;
    }

    public long n() {
        return this.f17555o;
    }

    public void o() {
        this.f17555o = 0L;
    }

    public void p(int i7, int i8) {
        this.f17549i = i7;
        this.f17550j = i8;
    }
}
