package e0;

import e0.InterfaceC1240b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class d implements InterfaceC1240b {

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1240b.a f13682b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1240b.a f13683c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1240b.a f13684d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1240b.a f13685e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f13686f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f13687g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13688h;

    public d() {
        ByteBuffer byteBuffer = InterfaceC1240b.f13675a;
        this.f13686f = byteBuffer;
        this.f13687g = byteBuffer;
        InterfaceC1240b.a aVar = InterfaceC1240b.a.f13676e;
        this.f13684d = aVar;
        this.f13685e = aVar;
        this.f13682b = aVar;
        this.f13683c = aVar;
    }

    @Override // e0.InterfaceC1240b
    public boolean a() {
        return this.f13685e != InterfaceC1240b.a.f13676e;
    }

    @Override // e0.InterfaceC1240b
    public final void b() {
        flush();
        this.f13686f = InterfaceC1240b.f13675a;
        InterfaceC1240b.a aVar = InterfaceC1240b.a.f13676e;
        this.f13684d = aVar;
        this.f13685e = aVar;
        this.f13682b = aVar;
        this.f13683c = aVar;
        l();
    }

    @Override // e0.InterfaceC1240b
    public boolean c() {
        return this.f13688h && this.f13687g == InterfaceC1240b.f13675a;
    }

    @Override // e0.InterfaceC1240b
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.f13687g;
        this.f13687g = InterfaceC1240b.f13675a;
        return byteBuffer;
    }

    @Override // e0.InterfaceC1240b
    public final void e() {
        this.f13688h = true;
        k();
    }

    @Override // e0.InterfaceC1240b
    public final void flush() {
        this.f13687g = InterfaceC1240b.f13675a;
        this.f13688h = false;
        this.f13682b = this.f13684d;
        this.f13683c = this.f13685e;
        j();
    }

    @Override // e0.InterfaceC1240b
    public final InterfaceC1240b.a g(InterfaceC1240b.a aVar) {
        this.f13684d = aVar;
        this.f13685e = i(aVar);
        return a() ? this.f13685e : InterfaceC1240b.a.f13676e;
    }

    public final boolean h() {
        return this.f13687g.hasRemaining();
    }

    public abstract InterfaceC1240b.a i(InterfaceC1240b.a aVar);

    public final ByteBuffer m(int i7) {
        if (this.f13686f.capacity() < i7) {
            this.f13686f = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        } else {
            this.f13686f.clear();
        }
        ByteBuffer byteBuffer = this.f13686f;
        this.f13687g = byteBuffer;
        return byteBuffer;
    }

    public void j() {
    }

    public void k() {
    }

    public void l() {
    }
}
