package gb;

import gb.i2;
import gb.n3;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class g implements i2.a {

    /* renamed from: a, reason: collision with root package name */
    public final d f6379a;

    /* renamed from: b, reason: collision with root package name */
    public final i2.a f6380b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f6381c = new ArrayDeque();

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f6382a;

        public a(int i10) {
            this.f6382a = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.f6380b.d(this.f6382a);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f6384a;

        public b(boolean z10) {
            this.f6384a = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.f6380b.c(this.f6384a);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Throwable f6386a;

        public c(Throwable th) {
            this.f6386a = th;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.f6380b.e(this.f6386a);
        }
    }

    public interface d {
        void f(Runnable runnable);
    }

    public g(k3 k3Var, y0 y0Var) {
        this.f6380b = k3Var;
        this.f6379a = y0Var;
    }

    @Override // gb.i2.a
    public final void a(n3.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            } else {
                this.f6381c.add(next);
            }
        }
    }

    @Override // gb.i2.a
    public final void c(boolean z10) {
        this.f6379a.f(new b(z10));
    }

    @Override // gb.i2.a
    public final void d(int i10) {
        this.f6379a.f(new a(i10));
    }

    @Override // gb.i2.a
    public final void e(Throwable th) {
        this.f6379a.f(new c(th));
    }
}
