package x3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import x3.f;

/* loaded from: classes.dex */
public final class c0 implements f {

    /* renamed from: b, reason: collision with root package name */
    public int f16933b;

    /* renamed from: c, reason: collision with root package name */
    public float f16934c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f16935d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public f.a f16936e;
    public f.a f;

    /* renamed from: g, reason: collision with root package name */
    public f.a f16937g;

    /* renamed from: h, reason: collision with root package name */
    public f.a f16938h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16939i;

    /* renamed from: j, reason: collision with root package name */
    public b0 f16940j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f16941k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f16942l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f16943m;

    /* renamed from: n, reason: collision with root package name */
    public long f16944n;

    /* renamed from: o, reason: collision with root package name */
    public long f16945o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16946p;

    public c0() {
        f.a aVar = f.a.f16968e;
        this.f16936e = aVar;
        this.f = aVar;
        this.f16937g = aVar;
        this.f16938h = aVar;
        ByteBuffer byteBuffer = f.f16967a;
        this.f16941k = byteBuffer;
        this.f16942l = byteBuffer.asShortBuffer();
        this.f16943m = byteBuffer;
        this.f16933b = -1;
    }

    @Override // x3.f
    public final ByteBuffer a() {
        int i10;
        b0 b0Var = this.f16940j;
        if (b0Var != null && (i10 = b0Var.f16920m * b0Var.f16910b * 2) > 0) {
            if (this.f16941k.capacity() < i10) {
                ByteBuffer order = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
                this.f16941k = order;
                this.f16942l = order.asShortBuffer();
            } else {
                this.f16941k.clear();
                this.f16942l.clear();
            }
            ShortBuffer shortBuffer = this.f16942l;
            int min = Math.min(shortBuffer.remaining() / b0Var.f16910b, b0Var.f16920m);
            shortBuffer.put(b0Var.f16919l, 0, b0Var.f16910b * min);
            int i11 = b0Var.f16920m - min;
            b0Var.f16920m = i11;
            short[] sArr = b0Var.f16919l;
            int i12 = b0Var.f16910b;
            System.arraycopy(sArr, min * i12, sArr, 0, i11 * i12);
            this.f16945o += i10;
            this.f16941k.limit(i10);
            this.f16943m = this.f16941k;
        }
        ByteBuffer byteBuffer = this.f16943m;
        this.f16943m = f.f16967a;
        return byteBuffer;
    }

    @Override // x3.f
    public final void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            b0 b0Var = this.f16940j;
            b0Var.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f16944n += remaining;
            int remaining2 = asShortBuffer.remaining();
            int i10 = b0Var.f16910b;
            int i11 = remaining2 / i10;
            short[] b10 = b0Var.b(b0Var.f16917j, b0Var.f16918k, i11);
            b0Var.f16917j = b10;
            asShortBuffer.get(b10, b0Var.f16918k * b0Var.f16910b, ((i10 * i11) * 2) / 2);
            b0Var.f16918k += i11;
            b0Var.e();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // x3.f
    public final void c() {
        int i10;
        b0 b0Var = this.f16940j;
        if (b0Var != null) {
            int i11 = b0Var.f16918k;
            float f = b0Var.f16911c;
            float f10 = b0Var.f16912d;
            int i12 = b0Var.f16920m + ((int) ((((i11 / (f / f10)) + b0Var.f16922o) / (b0Var.f16913e * f10)) + 0.5f));
            b0Var.f16917j = b0Var.b(b0Var.f16917j, i11, (b0Var.f16915h * 2) + i11);
            int i13 = 0;
            while (true) {
                i10 = b0Var.f16915h * 2;
                int i14 = b0Var.f16910b;
                if (i13 >= i10 * i14) {
                    break;
                }
                b0Var.f16917j[(i14 * i11) + i13] = 0;
                i13++;
            }
            b0Var.f16918k = i10 + b0Var.f16918k;
            b0Var.e();
            if (b0Var.f16920m > i12) {
                b0Var.f16920m = i12;
            }
            b0Var.f16918k = 0;
            b0Var.f16925r = 0;
            b0Var.f16922o = 0;
        }
        this.f16946p = true;
    }

    @Override // x3.f
    public final boolean d() {
        b0 b0Var;
        return this.f16946p && ((b0Var = this.f16940j) == null || (b0Var.f16920m * b0Var.f16910b) * 2 == 0);
    }

    @Override // x3.f
    public final f.a e(f.a aVar) {
        if (aVar.f16971c != 2) {
            throw new f.b(aVar);
        }
        int i10 = this.f16933b;
        if (i10 == -1) {
            i10 = aVar.f16969a;
        }
        this.f16936e = aVar;
        f.a aVar2 = new f.a(i10, aVar.f16970b, 2);
        this.f = aVar2;
        this.f16939i = true;
        return aVar2;
    }

    @Override // x3.f
    public final void flush() {
        if (isActive()) {
            f.a aVar = this.f16936e;
            this.f16937g = aVar;
            f.a aVar2 = this.f;
            this.f16938h = aVar2;
            if (this.f16939i) {
                this.f16940j = new b0(aVar.f16969a, aVar.f16970b, this.f16934c, this.f16935d, aVar2.f16969a);
            } else {
                b0 b0Var = this.f16940j;
                if (b0Var != null) {
                    b0Var.f16918k = 0;
                    b0Var.f16920m = 0;
                    b0Var.f16922o = 0;
                    b0Var.f16923p = 0;
                    b0Var.f16924q = 0;
                    b0Var.f16925r = 0;
                    b0Var.f16926s = 0;
                    b0Var.t = 0;
                    b0Var.f16927u = 0;
                    b0Var.f16928v = 0;
                }
            }
        }
        this.f16943m = f.f16967a;
        this.f16944n = 0L;
        this.f16945o = 0L;
        this.f16946p = false;
    }

    @Override // x3.f
    public final boolean isActive() {
        return this.f.f16969a != -1 && (Math.abs(this.f16934c - 1.0f) >= 1.0E-4f || Math.abs(this.f16935d - 1.0f) >= 1.0E-4f || this.f.f16969a != this.f16936e.f16969a);
    }

    @Override // x3.f
    public final void reset() {
        this.f16934c = 1.0f;
        this.f16935d = 1.0f;
        f.a aVar = f.a.f16968e;
        this.f16936e = aVar;
        this.f = aVar;
        this.f16937g = aVar;
        this.f16938h = aVar;
        ByteBuffer byteBuffer = f.f16967a;
        this.f16941k = byteBuffer;
        this.f16942l = byteBuffer.asShortBuffer();
        this.f16943m = byteBuffer;
        this.f16933b = -1;
        this.f16939i = false;
        this.f16940j = null;
        this.f16944n = 0L;
        this.f16945o = 0L;
        this.f16946p = false;
    }
}
