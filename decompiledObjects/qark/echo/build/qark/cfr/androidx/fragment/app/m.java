/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.concurrent.CopyOnWriteArrayList
 */
package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k;
import androidx.fragment.app.n;
import java.util.concurrent.CopyOnWriteArrayList;

public class m {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final n b;

    public m(n n8) {
        this.b = n8;
    }

    public void a(Fragment fragment, Bundle bundle, boolean bl) {
        Fragment fragment2 = this.b.v0();
        if (fragment2 != null) {
            fragment2.F().u0().a(fragment, bundle, true);
        }
        for (a a8 : this.a) {
            if (bl && !a8.b) continue;
            a8.a.a(this.b, fragment, bundle);
        }
    }

    public void b(Fragment fragment, boolean bl) {
        Context context = this.b.s0().i();
        Fragment fragment2 = this.b.v0();
        if (fragment2 != null) {
            fragment2.F().u0().b(fragment, true);
        }
        for (a a8 : this.a) {
            if (bl && !a8.b) continue;
            a8.a.b(this.b, fragment, context);
        }
    }

    public void c(Fragment fragment, Bundle bundle, boolean bl) {
        Fragment fragment2 = this.b.v0();
        if (fragment2 != null) {
            fragment2.F().u0().c(fragment, bundle, true);
        }
        for (a a8 : this.a) {
            if (bl && !a8.b) continue;
            a8.a.c(this.b, fragment, bundle);
        }
    }

    public void d(Fragment fragment, boolean bl) {
        Fragment fragment2 = this.b.v0();
        if (fragment2 != null) {
            fragment2.F().u0().d(fragment, true);
        }
        for (a a8 : this.a) {
            if (bl && !a8.b) continue;
            a8.a.d(this.b, fragment);
        }
    }

    public void e(Fragment fragment, boolean bl) {
        Fragment fragment2 = this.b.v0();
        if (fragment2 != null) {
            fragment2.F().u0().e(fragment, true);
        }
        for (a a8 : this.a) {
            if (bl && !a8.b) continue;
            a8.a.e(this.b, fragment);
        }
    }

    public void f(Fragment fragment, boolean bl) {
        Fragment fragment2 = this.b.v0();
        if (fragment2 != null) {
            fragment2.F().u0().f(fragment, true);
        }
        for (a a8 : this.a) {
            if (bl && !a8.b) continue;
            a8.a.f(this.b, fragment);
        }
    }

    public void g(Fragment fragment, boolean bl) {
        Context context = this.b.s0().i();
        Fragment fragment2 = this.b.v0();
        if (fragment2 != null) {
            fragment2.F().u0().g(fragment, true);
        }
        for (a a8 : this.a) {
            if (bl && !a8.b) continue;
            a8.a.g(this.b, fragment, context);
        }
    }

    public void h(Fragment fragment, Bundle bundle, boolean bl) {
        Fragment fragment2 = this.b.v0();
        if (fragment2 != null) {
            fragment2.F().u0().h(fragment, bundle, true);
        }
        for (a a8 : this.a) {
            if (bl && !a8.b) continue;
            a8.a.h(this.b, fragment, bundle);
        }
    }

    public void i(Fragment fragment, boolean bl) {
        Fragment fragment2 = this.b.v0();
        if (fragment2 != null) {
            fragment2.F().u0().i(fragment, true);
        }
        for (a a8 : this.a) {
            if (bl && !a8.b) continue;
            a8.a.i(this.b, fragment);
        }
    }

    public void j(Fragment fragment, Bundle bundle, boolean bl) {
        Fragment fragment2 = this.b.v0();
        if (fragment2 != null) {
            fragment2.F().u0().j(fragment, bundle, true);
        }
        for (a a8 : this.a) {
            if (bl && !a8.b) continue;
            a8.a.j(this.b, fragment, bundle);
        }
    }

    public void k(Fragment fragment, boolean bl) {
        Fragment fragment2 = this.b.v0();
        if (fragment2 != null) {
            fragment2.F().u0().k(fragment, true);
        }
        for (a a8 : this.a) {
            if (bl && !a8.b) continue;
            a8.a.k(this.b, fragment);
        }
    }

    public void l(Fragment fragment, boolean bl) {
        Fragment fragment2 = this.b.v0();
        if (fragment2 != null) {
            fragment2.F().u0().l(fragment, true);
        }
        for (a a8 : this.a) {
            if (bl && !a8.b) continue;
            a8.a.l(this.b, fragment);
        }
    }

    public void m(Fragment fragment, View view, Bundle bundle, boolean bl) {
        Fragment fragment2 = this.b.v0();
        if (fragment2 != null) {
            fragment2.F().u0().m(fragment, view, bundle, true);
        }
        for (a a8 : this.a) {
            if (bl && !a8.b) continue;
            a8.a.m(this.b, fragment, view, bundle);
        }
    }

    public void n(Fragment fragment, boolean bl) {
        Fragment fragment2 = this.b.v0();
        if (fragment2 != null) {
            fragment2.F().u0().n(fragment, true);
        }
        for (a a8 : this.a) {
            if (bl && !a8.b) continue;
            a8.a.n(this.b, fragment);
        }
    }

    public void o(n.l l8, boolean bl) {
        this.a.add((Object)new a(l8, bl));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void p(n.l l8) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.a;
        synchronized (copyOnWriteArrayList) {
            int n8;
            int n9;
            block5 : {
                try {
                    n9 = this.a.size();
                    n8 = 0;
                    break block5;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
            while (n8 < n9) {
                if (((a)this.a.get((int)n8)).a == l8) {
                    this.a.remove(n8);
                    return;
                }
                ++n8;
            }
            return;
        }
    }

    public static final class a {
        public final n.l a;
        public final boolean b;

        public a(n.l l8, boolean bl) {
            this.a = l8;
            this.b = bl;
        }
    }

}

