package x3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import x3.f;

/* loaded from: classes.dex */
public abstract class q implements f {

    /* renamed from: b, reason: collision with root package name */
    public f.a f17030b;

    /* renamed from: c, reason: collision with root package name */
    public f.a f17031c;

    /* renamed from: d, reason: collision with root package name */
    public f.a f17032d;

    /* renamed from: e, reason: collision with root package name */
    public f.a f17033e;
    public ByteBuffer f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f17034g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17035h;

    public q() {
        ByteBuffer byteBuffer = f.f16967a;
        this.f = byteBuffer;
        this.f17034g = byteBuffer;
        f.a aVar = f.a.f16968e;
        this.f17032d = aVar;
        this.f17033e = aVar;
        this.f17030b = aVar;
        this.f17031c = aVar;
    }

    @Override // x3.f
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f17034g;
        this.f17034g = f.f16967a;
        return byteBuffer;
    }

    @Override // x3.f
    public final void c() {
        this.f17035h = true;
        h();
    }

    @Override // x3.f
    public boolean d() {
        return this.f17035h && this.f17034g == f.f16967a;
    }

    @Override // x3.f
    public final f.a e(f.a aVar) {
        this.f17032d = aVar;
        this.f17033e = f(aVar);
        return isActive() ? this.f17033e : f.a.f16968e;
    }

    public abstract f.a f(f.a aVar);

    @Override // x3.f
    public final void flush() {
        this.f17034g = f.f16967a;
        this.f17035h = false;
        this.f17030b = this.f17032d;
        this.f17031c = this.f17033e;
        g();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }

    @Override // x3.f
    public boolean isActive() {
        return this.f17033e != f.a.f16968e;
    }

    public final ByteBuffer j(int i10) {
        if (this.f.capacity() < i10) {
            this.f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.f17034g = byteBuffer;
        return byteBuffer;
    }

    @Override // x3.f
    public final void reset() {
        flush();
        this.f = f.f16967a;
        f.a aVar = f.a.f16968e;
        this.f17032d = aVar;
        this.f17033e = aVar;
        this.f17030b = aVar;
        this.f17031c = aVar;
        i();
    }
}
