package androidx.window.layout.adapter.sidecar;

import android.app.Activity;
import androidx.window.layout.adapter.sidecar.a;
import ec.i;
import i2.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import rb.h;
import sb.s;
import w.g;

/* loaded from: classes.dex */
public final class b implements j2.a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile b f1416c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f1417d = new ReentrantLock();

    /* renamed from: a, reason: collision with root package name */
    public androidx.window.layout.adapter.sidecar.a f1418a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<C0022b> f1419b = new CopyOnWriteArrayList<>();

    public final class a implements a.InterfaceC0021a {
        public a() {
        }

        @Override // androidx.window.layout.adapter.sidecar.a.InterfaceC0021a
        public final void a(Activity activity, k kVar) {
            i.e(activity, "activity");
            Iterator<C0022b> it = b.this.f1419b.iterator();
            while (it.hasNext()) {
                C0022b next = it.next();
                if (i.a(next.f1421a, activity)) {
                    next.f1424d = kVar;
                    next.f1422b.execute(new g(6, next, kVar));
                }
            }
        }
    }

    /* renamed from: androidx.window.layout.adapter.sidecar.b$b, reason: collision with other inner class name */
    public static final class C0022b {

        /* renamed from: a, reason: collision with root package name */
        public final Activity f1421a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f1422b;

        /* renamed from: c, reason: collision with root package name */
        public final d0.a<k> f1423c;

        /* renamed from: d, reason: collision with root package name */
        public k f1424d;

        public C0022b(Activity activity, m1.b bVar, x0.k kVar) {
            this.f1421a = activity;
            this.f1422b = bVar;
            this.f1423c = kVar;
        }
    }

    public b(SidecarCompat sidecarCompat) {
        this.f1418a = sidecarCompat;
        androidx.window.layout.adapter.sidecar.a aVar = this.f1418a;
        if (aVar != null) {
            aVar.c(new a());
        }
    }

    @Override // j2.a
    public final void a(Activity activity, m1.b bVar, x0.k kVar) {
        C0022b c0022b;
        i.e(activity, "context");
        ReentrantLock reentrantLock = f1417d;
        reentrantLock.lock();
        try {
            androidx.window.layout.adapter.sidecar.a aVar = this.f1418a;
            if (aVar == null) {
                kVar.accept(new k(s.f14324a));
                return;
            }
            CopyOnWriteArrayList<C0022b> copyOnWriteArrayList = this.f1419b;
            boolean z10 = false;
            if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                Iterator<C0022b> it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (i.a(it.next().f1421a, activity)) {
                        z10 = true;
                        break;
                    }
                }
            }
            C0022b c0022b2 = new C0022b(activity, bVar, kVar);
            this.f1419b.add(c0022b2);
            if (z10) {
                Iterator<C0022b> it2 = this.f1419b.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        c0022b = null;
                        break;
                    } else {
                        c0022b = it2.next();
                        if (i.a(activity, c0022b.f1421a)) {
                            break;
                        }
                    }
                }
                C0022b c0022b3 = c0022b;
                k kVar2 = c0022b3 != null ? c0022b3.f1424d : null;
                if (kVar2 != null) {
                    c0022b2.f1424d = kVar2;
                    c0022b2.f1422b.execute(new g(6, c0022b2, kVar2));
                }
            } else {
                aVar.a(activity);
            }
            h hVar = h.f13851a;
            reentrantLock.unlock();
            if (h.f13851a == null) {
                kVar.accept(new k(s.f14324a));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // j2.a
    public final void b(d0.a<k> aVar) {
        androidx.window.layout.adapter.sidecar.a aVar2;
        i.e(aVar, "callback");
        synchronized (f1417d) {
            if (this.f1418a == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<C0022b> it = this.f1419b.iterator();
            while (it.hasNext()) {
                C0022b next = it.next();
                if (next.f1423c == aVar) {
                    arrayList.add(next);
                }
            }
            this.f1419b.removeAll(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Activity activity = ((C0022b) it2.next()).f1421a;
                CopyOnWriteArrayList<C0022b> copyOnWriteArrayList = this.f1419b;
                boolean z10 = false;
                if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                    Iterator<C0022b> it3 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        } else if (i.a(it3.next().f1421a, activity)) {
                            z10 = true;
                            break;
                        }
                    }
                }
                if (!z10 && (aVar2 = this.f1418a) != null) {
                    aVar2.b(activity);
                }
            }
            h hVar = h.f13851a;
        }
    }
}
