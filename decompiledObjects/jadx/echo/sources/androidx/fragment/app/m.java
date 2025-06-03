package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.n;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f9441a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final n f9442b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final n.l f9443a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f9444b;

        public a(n.l lVar, boolean z7) {
            this.f9443a = lVar;
            this.f9444b = z7;
        }
    }

    public m(n nVar) {
        this.f9442b = nVar;
    }

    public void a(Fragment fragment, Bundle bundle, boolean z7) {
        Fragment v02 = this.f9442b.v0();
        if (v02 != null) {
            v02.F().u0().a(fragment, bundle, true);
        }
        Iterator it = this.f9441a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z7 || aVar.f9444b) {
                aVar.f9443a.a(this.f9442b, fragment, bundle);
            }
        }
    }

    public void b(Fragment fragment, boolean z7) {
        Context i7 = this.f9442b.s0().i();
        Fragment v02 = this.f9442b.v0();
        if (v02 != null) {
            v02.F().u0().b(fragment, true);
        }
        Iterator it = this.f9441a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z7 || aVar.f9444b) {
                aVar.f9443a.b(this.f9442b, fragment, i7);
            }
        }
    }

    public void c(Fragment fragment, Bundle bundle, boolean z7) {
        Fragment v02 = this.f9442b.v0();
        if (v02 != null) {
            v02.F().u0().c(fragment, bundle, true);
        }
        Iterator it = this.f9441a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z7 || aVar.f9444b) {
                aVar.f9443a.c(this.f9442b, fragment, bundle);
            }
        }
    }

    public void d(Fragment fragment, boolean z7) {
        Fragment v02 = this.f9442b.v0();
        if (v02 != null) {
            v02.F().u0().d(fragment, true);
        }
        Iterator it = this.f9441a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z7 || aVar.f9444b) {
                aVar.f9443a.d(this.f9442b, fragment);
            }
        }
    }

    public void e(Fragment fragment, boolean z7) {
        Fragment v02 = this.f9442b.v0();
        if (v02 != null) {
            v02.F().u0().e(fragment, true);
        }
        Iterator it = this.f9441a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z7 || aVar.f9444b) {
                aVar.f9443a.e(this.f9442b, fragment);
            }
        }
    }

    public void f(Fragment fragment, boolean z7) {
        Fragment v02 = this.f9442b.v0();
        if (v02 != null) {
            v02.F().u0().f(fragment, true);
        }
        Iterator it = this.f9441a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z7 || aVar.f9444b) {
                aVar.f9443a.f(this.f9442b, fragment);
            }
        }
    }

    public void g(Fragment fragment, boolean z7) {
        Context i7 = this.f9442b.s0().i();
        Fragment v02 = this.f9442b.v0();
        if (v02 != null) {
            v02.F().u0().g(fragment, true);
        }
        Iterator it = this.f9441a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z7 || aVar.f9444b) {
                aVar.f9443a.g(this.f9442b, fragment, i7);
            }
        }
    }

    public void h(Fragment fragment, Bundle bundle, boolean z7) {
        Fragment v02 = this.f9442b.v0();
        if (v02 != null) {
            v02.F().u0().h(fragment, bundle, true);
        }
        Iterator it = this.f9441a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z7 || aVar.f9444b) {
                aVar.f9443a.h(this.f9442b, fragment, bundle);
            }
        }
    }

    public void i(Fragment fragment, boolean z7) {
        Fragment v02 = this.f9442b.v0();
        if (v02 != null) {
            v02.F().u0().i(fragment, true);
        }
        Iterator it = this.f9441a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z7 || aVar.f9444b) {
                aVar.f9443a.i(this.f9442b, fragment);
            }
        }
    }

    public void j(Fragment fragment, Bundle bundle, boolean z7) {
        Fragment v02 = this.f9442b.v0();
        if (v02 != null) {
            v02.F().u0().j(fragment, bundle, true);
        }
        Iterator it = this.f9441a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z7 || aVar.f9444b) {
                aVar.f9443a.j(this.f9442b, fragment, bundle);
            }
        }
    }

    public void k(Fragment fragment, boolean z7) {
        Fragment v02 = this.f9442b.v0();
        if (v02 != null) {
            v02.F().u0().k(fragment, true);
        }
        Iterator it = this.f9441a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z7 || aVar.f9444b) {
                aVar.f9443a.k(this.f9442b, fragment);
            }
        }
    }

    public void l(Fragment fragment, boolean z7) {
        Fragment v02 = this.f9442b.v0();
        if (v02 != null) {
            v02.F().u0().l(fragment, true);
        }
        Iterator it = this.f9441a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z7 || aVar.f9444b) {
                aVar.f9443a.l(this.f9442b, fragment);
            }
        }
    }

    public void m(Fragment fragment, View view, Bundle bundle, boolean z7) {
        Fragment v02 = this.f9442b.v0();
        if (v02 != null) {
            v02.F().u0().m(fragment, view, bundle, true);
        }
        Iterator it = this.f9441a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z7 || aVar.f9444b) {
                aVar.f9443a.m(this.f9442b, fragment, view, bundle);
            }
        }
    }

    public void n(Fragment fragment, boolean z7) {
        Fragment v02 = this.f9442b.v0();
        if (v02 != null) {
            v02.F().u0().n(fragment, true);
        }
        Iterator it = this.f9441a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!z7 || aVar.f9444b) {
                aVar.f9443a.n(this.f9442b, fragment);
            }
        }
    }

    public void o(n.l lVar, boolean z7) {
        this.f9441a.add(new a(lVar, z7));
    }

    public void p(n.l lVar) {
        synchronized (this.f9441a) {
            try {
                int size = this.f9441a.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        break;
                    }
                    if (((a) this.f9441a.get(i7)).f9443a == lVar) {
                        this.f9441a.remove(i7);
                        break;
                    }
                    i7++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
