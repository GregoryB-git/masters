// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import android.view.View;
import android.content.Context;
import java.util.Iterator;
import android.os.Bundle;
import java.util.concurrent.CopyOnWriteArrayList;

public class m
{
    public final CopyOnWriteArrayList a;
    public final n b;
    
    public m(final n b) {
        this.a = new CopyOnWriteArrayList();
        this.b = b;
    }
    
    public void a(final Fragment fragment, final Bundle bundle, final boolean b) {
        final Fragment v0 = this.b.v0();
        if (v0 != null) {
            v0.F().u0().a(fragment, bundle, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.a(this.b, fragment, bundle);
            }
        }
    }
    
    public void b(final Fragment fragment, final boolean b) {
        final Context i = this.b.s0().i();
        final Fragment v0 = this.b.v0();
        if (v0 != null) {
            v0.F().u0().b(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.b(this.b, fragment, i);
            }
        }
    }
    
    public void c(final Fragment fragment, final Bundle bundle, final boolean b) {
        final Fragment v0 = this.b.v0();
        if (v0 != null) {
            v0.F().u0().c(fragment, bundle, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.c(this.b, fragment, bundle);
            }
        }
    }
    
    public void d(final Fragment fragment, final boolean b) {
        final Fragment v0 = this.b.v0();
        if (v0 != null) {
            v0.F().u0().d(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.d(this.b, fragment);
            }
        }
    }
    
    public void e(final Fragment fragment, final boolean b) {
        final Fragment v0 = this.b.v0();
        if (v0 != null) {
            v0.F().u0().e(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.e(this.b, fragment);
            }
        }
    }
    
    public void f(final Fragment fragment, final boolean b) {
        final Fragment v0 = this.b.v0();
        if (v0 != null) {
            v0.F().u0().f(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.f(this.b, fragment);
            }
        }
    }
    
    public void g(final Fragment fragment, final boolean b) {
        final Context i = this.b.s0().i();
        final Fragment v0 = this.b.v0();
        if (v0 != null) {
            v0.F().u0().g(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.g(this.b, fragment, i);
            }
        }
    }
    
    public void h(final Fragment fragment, final Bundle bundle, final boolean b) {
        final Fragment v0 = this.b.v0();
        if (v0 != null) {
            v0.F().u0().h(fragment, bundle, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.h(this.b, fragment, bundle);
            }
        }
    }
    
    public void i(final Fragment fragment, final boolean b) {
        final Fragment v0 = this.b.v0();
        if (v0 != null) {
            v0.F().u0().i(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.i(this.b, fragment);
            }
        }
    }
    
    public void j(final Fragment fragment, final Bundle bundle, final boolean b) {
        final Fragment v0 = this.b.v0();
        if (v0 != null) {
            v0.F().u0().j(fragment, bundle, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.j(this.b, fragment, bundle);
            }
        }
    }
    
    public void k(final Fragment fragment, final boolean b) {
        final Fragment v0 = this.b.v0();
        if (v0 != null) {
            v0.F().u0().k(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.k(this.b, fragment);
            }
        }
    }
    
    public void l(final Fragment fragment, final boolean b) {
        final Fragment v0 = this.b.v0();
        if (v0 != null) {
            v0.F().u0().l(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.l(this.b, fragment);
            }
        }
    }
    
    public void m(final Fragment fragment, final View view, final Bundle bundle, final boolean b) {
        final Fragment v0 = this.b.v0();
        if (v0 != null) {
            v0.F().u0().m(fragment, view, bundle, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.m(this.b, fragment, view, bundle);
            }
        }
    }
    
    public void n(final Fragment fragment, final boolean b) {
        final Fragment v0 = this.b.v0();
        if (v0 != null) {
            v0.F().u0().n(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.n(this.b, fragment);
            }
        }
    }
    
    public void o(final n.l l, final boolean b) {
        this.a.add(new a(l, b));
    }
    
    public void p(final n.l l) {
        while (true) {
            final CopyOnWriteArrayList a = this.a;
            // monitorenter(a)
            while (true) {
                int n = 0;
                Label_0067: {
                    while (true) {
                        try {
                            final int size = this.a.size();
                            n = 0;
                            if (n < size) {
                                if (((a)this.a.get(n)).a != l) {
                                    break Label_0067;
                                }
                                this.a.remove(n);
                            }
                            // monitorexit(a)
                            return;
                            // monitorexit(a)
                            throw l;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                ++n;
                continue;
            }
        }
    }
    
    public static final class a
    {
        public final n.l a;
        public final boolean b;
        
        public a(final n.l a, final boolean b) {
            this.a = a;
            this.b = b;
        }
    }
}
