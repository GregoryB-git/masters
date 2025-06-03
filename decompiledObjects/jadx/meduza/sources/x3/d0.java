package x3;

import java.nio.ByteBuffer;
import v5.e0;
import x3.f;

/* loaded from: classes.dex */
public final class d0 extends q {

    /* renamed from: i, reason: collision with root package name */
    public int f16954i;

    /* renamed from: j, reason: collision with root package name */
    public int f16955j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16956k;

    /* renamed from: l, reason: collision with root package name */
    public int f16957l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f16958m = e0.f;

    /* renamed from: n, reason: collision with root package name */
    public int f16959n;

    /* renamed from: o, reason: collision with root package name */
    public long f16960o;

    @Override // x3.q, x3.f
    public final ByteBuffer a() {
        int i10;
        if (super.d() && (i10 = this.f16959n) > 0) {
            j(i10).put(this.f16958m, 0, this.f16959n).flip();
            this.f16959n = 0;
        }
        return super.a();
    }

    @Override // x3.f
    public final void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 == 0) {
            return;
        }
        int min = Math.min(i10, this.f16957l);
        this.f16960o += min / this.f17030b.f16972d;
        this.f16957l -= min;
        byteBuffer.position(position + min);
        if (this.f16957l > 0) {
            return;
        }
        int i11 = i10 - min;
        int length = (this.f16959n + i11) - this.f16958m.length;
        ByteBuffer j10 = j(length);
        int i12 = e0.i(length, 0, this.f16959n);
        j10.put(this.f16958m, 0, i12);
        int i13 = e0.i(length - i12, 0, i11);
        byteBuffer.limit(byteBuffer.position() + i13);
        j10.put(byteBuffer);
        byteBuffer.limit(limit);
        int i14 = i11 - i13;
        int i15 = this.f16959n - i12;
        this.f16959n = i15;
        byte[] bArr = this.f16958m;
        System.arraycopy(bArr, i12, bArr, 0, i15);
        byteBuffer.get(this.f16958m, this.f16959n, i14);
        this.f16959n += i14;
        j10.flip();
    }

    @Override // x3.q, x3.f
    public final boolean d() {
        return super.d() && this.f16959n == 0;
    }

    @Override // x3.q
    public final f.a f(f.a aVar) {
        if (aVar.f16971c != 2) {
            throw new f.b(aVar);
        }
        this.f16956k = true;
        return (this.f16954i == 0 && this.f16955j == 0) ? f.a.f16968e : aVar;
    }

    @Override // x3.q
    public final void g() {
        if (this.f16956k) {
            this.f16956k = false;
            int i10 = this.f16955j;
            int i11 = this.f17030b.f16972d;
            this.f16958m = new byte[i10 * i11];
            this.f16957l = this.f16954i * i11;
        }
        this.f16959n = 0;
    }

    @Override // x3.q
    public final void h() {
        if (this.f16956k) {
            if (this.f16959n > 0) {
                this.f16960o += r0 / this.f17030b.f16972d;
            }
            this.f16959n = 0;
        }
    }

    @Override // x3.q
    public final void i() {
        this.f16958m = e0.f;
    }
}
