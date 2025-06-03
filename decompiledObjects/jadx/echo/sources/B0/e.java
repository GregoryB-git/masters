package B0;

import B0.e;
import android.os.Handler;
import g0.AbstractC1297a;
import i0.y;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface e {

    public interface a {

        /* renamed from: B0.e$a$a, reason: collision with other inner class name */
        public static final class C0007a {

            /* renamed from: a, reason: collision with root package name */
            public final CopyOnWriteArrayList f580a = new CopyOnWriteArrayList();

            /* renamed from: B0.e$a$a$a, reason: collision with other inner class name */
            public static final class C0008a {

                /* renamed from: a, reason: collision with root package name */
                public final Handler f581a;

                /* renamed from: b, reason: collision with root package name */
                public final a f582b;

                /* renamed from: c, reason: collision with root package name */
                public boolean f583c;

                public C0008a(Handler handler, a aVar) {
                    this.f581a = handler;
                    this.f582b = aVar;
                }

                public void d() {
                    this.f583c = true;
                }
            }

            public static /* synthetic */ void d(C0008a c0008a, int i7, long j7, long j8) {
                c0008a.f582b.c0(i7, j7, j8);
            }

            public void b(Handler handler, a aVar) {
                AbstractC1297a.e(handler);
                AbstractC1297a.e(aVar);
                e(aVar);
                this.f580a.add(new C0008a(handler, aVar));
            }

            public void c(final int i7, final long j7, final long j8) {
                Iterator it = this.f580a.iterator();
                while (it.hasNext()) {
                    final C0008a c0008a = (C0008a) it.next();
                    if (!c0008a.f583c) {
                        c0008a.f581a.post(new Runnable() { // from class: B0.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                e.a.C0007a.d(e.a.C0007a.C0008a.this, i7, j7, j8);
                            }
                        });
                    }
                }
            }

            public void e(a aVar) {
                Iterator it = this.f580a.iterator();
                while (it.hasNext()) {
                    C0008a c0008a = (C0008a) it.next();
                    if (c0008a.f582b == aVar) {
                        c0008a.d();
                        this.f580a.remove(c0008a);
                    }
                }
            }
        }

        void c0(int i7, long j7, long j8);
    }

    y a();

    long b();

    void c(a aVar);

    long d();

    void i(Handler handler, a aVar);
}
