package e0;

import e0.InterfaceC1240b;
import g0.AbstractC1297a;
import g0.M;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public class f implements InterfaceC1240b {

    /* renamed from: b, reason: collision with root package name */
    public int f13711b;

    /* renamed from: c, reason: collision with root package name */
    public float f13712c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f13713d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1240b.a f13714e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC1240b.a f13715f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1240b.a f13716g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1240b.a f13717h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13718i;

    /* renamed from: j, reason: collision with root package name */
    public e f13719j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f13720k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f13721l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f13722m;

    /* renamed from: n, reason: collision with root package name */
    public long f13723n;

    /* renamed from: o, reason: collision with root package name */
    public long f13724o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13725p;

    public f() {
        InterfaceC1240b.a aVar = InterfaceC1240b.a.f13676e;
        this.f13714e = aVar;
        this.f13715f = aVar;
        this.f13716g = aVar;
        this.f13717h = aVar;
        ByteBuffer byteBuffer = InterfaceC1240b.f13675a;
        this.f13720k = byteBuffer;
        this.f13721l = byteBuffer.asShortBuffer();
        this.f13722m = byteBuffer;
        this.f13711b = -1;
    }

    @Override // e0.InterfaceC1240b
    public final boolean a() {
        return this.f13715f.f13677a != -1 && (Math.abs(this.f13712c - 1.0f) >= 1.0E-4f || Math.abs(this.f13713d - 1.0f) >= 1.0E-4f || this.f13715f.f13677a != this.f13714e.f13677a);
    }

    @Override // e0.InterfaceC1240b
    public final void b() {
        this.f13712c = 1.0f;
        this.f13713d = 1.0f;
        InterfaceC1240b.a aVar = InterfaceC1240b.a.f13676e;
        this.f13714e = aVar;
        this.f13715f = aVar;
        this.f13716g = aVar;
        this.f13717h = aVar;
        ByteBuffer byteBuffer = InterfaceC1240b.f13675a;
        this.f13720k = byteBuffer;
        this.f13721l = byteBuffer.asShortBuffer();
        this.f13722m = byteBuffer;
        this.f13711b = -1;
        this.f13718i = false;
        this.f13719j = null;
        this.f13723n = 0L;
        this.f13724o = 0L;
        this.f13725p = false;
    }

    @Override // e0.InterfaceC1240b
    public final boolean c() {
        e eVar;
        return this.f13725p && ((eVar = this.f13719j) == null || eVar.k() == 0);
    }

    @Override // e0.InterfaceC1240b
    public final ByteBuffer d() {
        int k7;
        e eVar = this.f13719j;
        if (eVar != null && (k7 = eVar.k()) > 0) {
            if (this.f13720k.capacity() < k7) {
                ByteBuffer order = ByteBuffer.allocateDirect(k7).order(ByteOrder.nativeOrder());
                this.f13720k = order;
                this.f13721l = order.asShortBuffer();
            } else {
                this.f13720k.clear();
                this.f13721l.clear();
            }
            eVar.j(this.f13721l);
            this.f13724o += k7;
            this.f13720k.limit(k7);
            this.f13722m = this.f13720k;
        }
        ByteBuffer byteBuffer = this.f13722m;
        this.f13722m = InterfaceC1240b.f13675a;
        return byteBuffer;
    }

    @Override // e0.InterfaceC1240b
    public final void e() {
        e eVar = this.f13719j;
        if (eVar != null) {
            eVar.s();
        }
        this.f13725p = true;
    }

    @Override // e0.InterfaceC1240b
    public final void f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            e eVar = (e) AbstractC1297a.e(this.f13719j);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f13723n += remaining;
            eVar.t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // e0.InterfaceC1240b
    public final void flush() {
        if (a()) {
            InterfaceC1240b.a aVar = this.f13714e;
            this.f13716g = aVar;
            InterfaceC1240b.a aVar2 = this.f13715f;
            this.f13717h = aVar2;
            if (this.f13718i) {
                this.f13719j = new e(aVar.f13677a, aVar.f13678b, this.f13712c, this.f13713d, aVar2.f13677a);
            } else {
                e eVar = this.f13719j;
                if (eVar != null) {
                    eVar.i();
                }
            }
        }
        this.f13722m = InterfaceC1240b.f13675a;
        this.f13723n = 0L;
        this.f13724o = 0L;
        this.f13725p = false;
    }

    @Override // e0.InterfaceC1240b
    public final InterfaceC1240b.a g(InterfaceC1240b.a aVar) {
        if (aVar.f13679c != 2) {
            throw new InterfaceC1240b.C0195b(aVar);
        }
        int i7 = this.f13711b;
        if (i7 == -1) {
            i7 = aVar.f13677a;
        }
        this.f13714e = aVar;
        InterfaceC1240b.a aVar2 = new InterfaceC1240b.a(i7, aVar.f13678b, 2);
        this.f13715f = aVar2;
        this.f13718i = true;
        return aVar2;
    }

    public final long h(long j7) {
        if (this.f13724o < 1024) {
            return (long) (this.f13712c * j7);
        }
        long l7 = this.f13723n - ((e) AbstractC1297a.e(this.f13719j)).l();
        int i7 = this.f13717h.f13677a;
        int i8 = this.f13716g.f13677a;
        return i7 == i8 ? M.W0(j7, l7, this.f13724o) : M.W0(j7, l7 * i7, this.f13724o * i8);
    }

    public final void i(float f7) {
        if (this.f13713d != f7) {
            this.f13713d = f7;
            this.f13718i = true;
        }
    }

    public final void j(float f7) {
        if (this.f13712c != f7) {
            this.f13712c = f7;
            this.f13718i = true;
        }
    }
}
