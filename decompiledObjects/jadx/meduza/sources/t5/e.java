package t5;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface e {

    public interface a {

        /* renamed from: t5.e$a$a, reason: collision with other inner class name */
        public static final class C0228a {

            /* renamed from: a, reason: collision with root package name */
            public final CopyOnWriteArrayList<C0229a> f14484a = new CopyOnWriteArrayList<>();

            /* renamed from: t5.e$a$a$a, reason: collision with other inner class name */
            public static final class C0229a {

                /* renamed from: a, reason: collision with root package name */
                public final Handler f14485a;

                /* renamed from: b, reason: collision with root package name */
                public final a f14486b;

                /* renamed from: c, reason: collision with root package name */
                public boolean f14487c;

                public C0229a(Handler handler, w3.a aVar) {
                    this.f14485a = handler;
                    this.f14486b = aVar;
                }
            }

            public final void a(w3.a aVar) {
                Iterator<C0229a> it = this.f14484a.iterator();
                while (it.hasNext()) {
                    C0229a next = it.next();
                    if (next.f14486b == aVar) {
                        next.f14487c = true;
                        this.f14484a.remove(next);
                    }
                }
            }
        }

        void Q(int i10, long j10, long j11);
    }

    void b(w3.a aVar);

    void c();

    void e(Handler handler, w3.a aVar);

    q f();

    long g();
}
