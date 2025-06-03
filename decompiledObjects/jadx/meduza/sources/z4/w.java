package z4;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import v3.x0;
import z4.t;
import z4.w;

/* loaded from: classes.dex */
public interface w {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f17740a;

        /* renamed from: b, reason: collision with root package name */
        public final t.b f17741b;

        /* renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0268a> f17742c;

        /* renamed from: d, reason: collision with root package name */
        public final long f17743d;

        /* renamed from: z4.w$a$a, reason: collision with other inner class name */
        public static final class C0268a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f17744a;

            /* renamed from: b, reason: collision with root package name */
            public w f17745b;

            public C0268a(Handler handler, w wVar) {
                this.f17744a = handler;
                this.f17745b = wVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public a(CopyOnWriteArrayList<C0268a> copyOnWriteArrayList, int i10, t.b bVar, long j10) {
            this.f17742c = copyOnWriteArrayList;
            this.f17740a = i10;
            this.f17741b = bVar;
            this.f17743d = j10;
        }

        public final long a(long j10) {
            long R = v5.e0.R(j10);
            if (R == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f17743d + R;
        }

        public final void b(int i10, v3.i0 i0Var, int i11, Object obj, long j10) {
            c(new q(1, i10, i0Var, i11, obj, a(j10), -9223372036854775807L));
        }

        public final void c(q qVar) {
            Iterator<C0268a> it = this.f17742c.iterator();
            while (it.hasNext()) {
                C0268a next = it.next();
                v5.e0.M(next.f17744a, new x0(this, next.f17745b, qVar, 1));
            }
        }

        public final void d(n nVar, int i10) {
            e(nVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public final void e(n nVar, int i10, int i11, v3.i0 i0Var, int i12, Object obj, long j10, long j11) {
            f(nVar, new q(i10, i11, i0Var, i12, obj, a(j10), a(j11)));
        }

        public final void f(n nVar, q qVar) {
            Iterator<C0268a> it = this.f17742c.iterator();
            while (it.hasNext()) {
                C0268a next = it.next();
                v5.e0.M(next.f17744a, new u(this, next.f17745b, nVar, qVar, 1));
            }
        }

        public final void g(n nVar, int i10) {
            h(nVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public final void h(n nVar, int i10, int i11, v3.i0 i0Var, int i12, Object obj, long j10, long j11) {
            i(nVar, new q(i10, i11, i0Var, i12, obj, a(j10), a(j11)));
        }

        public final void i(n nVar, q qVar) {
            Iterator<C0268a> it = this.f17742c.iterator();
            while (it.hasNext()) {
                C0268a next = it.next();
                v5.e0.M(next.f17744a, new p2.v(this, next.f17745b, nVar, qVar, 2));
            }
        }

        public final void j(n nVar, int i10, int i11, v3.i0 i0Var, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            l(nVar, new q(i10, i11, i0Var, i12, obj, a(j10), a(j11)), iOException, z10);
        }

        public final void k(n nVar, int i10, IOException iOException, boolean z10) {
            j(nVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
        }

        public final void l(final n nVar, final q qVar, final IOException iOException, final boolean z10) {
            Iterator<C0268a> it = this.f17742c.iterator();
            while (it.hasNext()) {
                C0268a next = it.next();
                final w wVar = next.f17745b;
                v5.e0.M(next.f17744a, new Runnable() { // from class: z4.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a aVar = w.a.this;
                        wVar.f0(aVar.f17740a, aVar.f17741b, nVar, qVar, iOException, z10);
                    }
                });
            }
        }

        public final void m(n nVar, int i10) {
            n(nVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public final void n(n nVar, int i10, int i11, v3.i0 i0Var, int i12, Object obj, long j10, long j11) {
            o(nVar, new q(i10, i11, i0Var, i12, obj, a(j10), a(j11)));
        }

        public final void o(n nVar, q qVar) {
            Iterator<C0268a> it = this.f17742c.iterator();
            while (it.hasNext()) {
                C0268a next = it.next();
                v5.e0.M(next.f17744a, new u(this, next.f17745b, nVar, qVar, 0));
            }
        }

        public final void p(q qVar) {
            t.b bVar = this.f17741b;
            bVar.getClass();
            Iterator<C0268a> it = this.f17742c.iterator();
            while (it.hasNext()) {
                C0268a next = it.next();
                v5.e0.M(next.f17744a, new p3.a(this, next.f17745b, bVar, qVar, 1));
            }
        }
    }

    void M(int i10, t.b bVar, n nVar, q qVar);

    void V(int i10, t.b bVar, q qVar);

    void f0(int i10, t.b bVar, n nVar, q qVar, IOException iOException, boolean z10);

    void h0(int i10, t.b bVar, n nVar, q qVar);

    void n0(int i10, t.b bVar, n nVar, q qVar);

    void o0(int i10, t.b bVar, q qVar);
}
