package a4;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import v5.e0;
import z4.t;

/* loaded from: classes.dex */
public interface g {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f180a;

        /* renamed from: b, reason: collision with root package name */
        public final t.b f181b;

        /* renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0005a> f182c;

        /* renamed from: a4.g$a$a, reason: collision with other inner class name */
        public static final class C0005a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f183a;

            /* renamed from: b, reason: collision with root package name */
            public g f184b;

            public C0005a(Handler handler, g gVar) {
                this.f183a = handler;
                this.f184b = gVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public a(CopyOnWriteArrayList<C0005a> copyOnWriteArrayList, int i10, t.b bVar) {
            this.f182c = copyOnWriteArrayList;
            this.f180a = i10;
            this.f181b = bVar;
        }

        public final void a() {
            Iterator<C0005a> it = this.f182c.iterator();
            while (it.hasNext()) {
                C0005a next = it.next();
                e0.M(next.f183a, new f(this, next.f184b, 1));
            }
        }

        public final void b() {
            Iterator<C0005a> it = this.f182c.iterator();
            while (it.hasNext()) {
                C0005a next = it.next();
                e0.M(next.f183a, new w.g(10, this, next.f184b));
            }
        }

        public final void c() {
            Iterator<C0005a> it = this.f182c.iterator();
            while (it.hasNext()) {
                C0005a next = it.next();
                e0.M(next.f183a, new x0.f(10, this, next.f184b));
            }
        }

        public final void d(int i10) {
            Iterator<C0005a> it = this.f182c.iterator();
            while (it.hasNext()) {
                C0005a next = it.next();
                e0.M(next.f183a, new p.s(this, next.f184b, i10, 3));
            }
        }

        public final void e(Exception exc) {
            Iterator<C0005a> it = this.f182c.iterator();
            while (it.hasNext()) {
                C0005a next = it.next();
                e0.M(next.f183a, new x0.d(this, next.f184b, exc, 3));
            }
        }

        public final void f() {
            Iterator<C0005a> it = this.f182c.iterator();
            while (it.hasNext()) {
                C0005a next = it.next();
                e0.M(next.f183a, new f(this, next.f184b, 0));
            }
        }
    }

    @Deprecated
    void B();

    void E(int i10, t.b bVar);

    void H(int i10, t.b bVar);

    void O(int i10, t.b bVar);

    void P(int i10, t.b bVar, Exception exc);

    void U(int i10, t.b bVar, int i11);

    void j0(int i10, t.b bVar);
}
