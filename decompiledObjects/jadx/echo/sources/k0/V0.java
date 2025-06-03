package k0;

import android.os.Looper;
import d0.AbstractC1170I;
import g0.AbstractC1297a;
import g0.InterfaceC1299c;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class V0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f15652a;

    /* renamed from: b, reason: collision with root package name */
    public final a f15653b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1299c f15654c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1170I f15655d;

    /* renamed from: e, reason: collision with root package name */
    public int f15656e;

    /* renamed from: f, reason: collision with root package name */
    public Object f15657f;

    /* renamed from: g, reason: collision with root package name */
    public Looper f15658g;

    /* renamed from: h, reason: collision with root package name */
    public int f15659h;

    /* renamed from: i, reason: collision with root package name */
    public long f15660i = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public boolean f15661j = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15662k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15663l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15664m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f15665n;

    public interface a {
        void c(V0 v02);
    }

    public interface b {
        void t(int i7, Object obj);
    }

    public V0(a aVar, b bVar, AbstractC1170I abstractC1170I, int i7, InterfaceC1299c interfaceC1299c, Looper looper) {
        this.f15653b = aVar;
        this.f15652a = bVar;
        this.f15655d = abstractC1170I;
        this.f15658g = looper;
        this.f15654c = interfaceC1299c;
        this.f15659h = i7;
    }

    public synchronized boolean a(long j7) {
        boolean z7;
        try {
            AbstractC1297a.f(this.f15662k);
            AbstractC1297a.f(this.f15658g.getThread() != Thread.currentThread());
            long b7 = this.f15654c.b() + j7;
            while (true) {
                z7 = this.f15664m;
                if (z7 || j7 <= 0) {
                    break;
                }
                this.f15654c.f();
                wait(j7);
                j7 = b7 - this.f15654c.b();
            }
            if (!z7) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f15663l;
    }

    public boolean b() {
        return this.f15661j;
    }

    public Looper c() {
        return this.f15658g;
    }

    public int d() {
        return this.f15659h;
    }

    public Object e() {
        return this.f15657f;
    }

    public long f() {
        return this.f15660i;
    }

    public b g() {
        return this.f15652a;
    }

    public AbstractC1170I h() {
        return this.f15655d;
    }

    public int i() {
        return this.f15656e;
    }

    public synchronized boolean j() {
        return this.f15665n;
    }

    public synchronized void k(boolean z7) {
        this.f15663l = z7 | this.f15663l;
        this.f15664m = true;
        notifyAll();
    }

    public V0 l() {
        AbstractC1297a.f(!this.f15662k);
        if (this.f15660i == -9223372036854775807L) {
            AbstractC1297a.a(this.f15661j);
        }
        this.f15662k = true;
        this.f15653b.c(this);
        return this;
    }

    public V0 m(Object obj) {
        AbstractC1297a.f(!this.f15662k);
        this.f15657f = obj;
        return this;
    }

    public V0 n(int i7) {
        AbstractC1297a.f(!this.f15662k);
        this.f15656e = i7;
        return this;
    }
}
