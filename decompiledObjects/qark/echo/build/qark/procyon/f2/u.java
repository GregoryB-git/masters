// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f2;

import c2.h;
import android.content.Context;
import c2.b;
import java.util.Collections;
import java.util.Set;
import m2.r;
import l2.e;
import p2.a;

public class u implements t
{
    public static volatile v e;
    public final a a;
    public final a b;
    public final e c;
    public final r d;
    
    public u(final a a, final a b, final e c, final r d, final m2.v v) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        v.c();
    }
    
    public static u c() {
        final v e = u.e;
        if (e != null) {
            return e.b();
        }
        throw new IllegalStateException("Not initialized!");
    }
    
    public static Set d(final f f) {
        if (f instanceof g) {
            return Collections.unmodifiableSet((Set<?>)((g)f).a());
        }
        return Collections.singleton(b.b("proto"));
    }
    
    public static void f(final Context context) {
        if (u.e == null) {
            // monitorenter(u.class)
            while (true) {
                try {
                    if (u.e == null) {
                        u.e = f2.e.c().b(context).a();
                    }
                    // monitorexit(u.class)
                    return;
                    // monitorexit(u.class)
                    return;
                }
                finally {}
                continue;
            }
        }
    }
    
    @Override
    public void a(final o o, final h h) {
        this.c.a(o.f().f(o.c().c()), this.b(o), h);
    }
    
    public final i b(final o o) {
        return i.a().i(this.a.a()).k(this.b.a()).j(o.g()).h(new f2.h(o.b(), o.d())).g(o.c().a()).d();
    }
    
    public r e() {
        return this.d;
    }
    
    public c2.g g(final f f) {
        return new q(d(f), p.a().b(f.d()).c(f.r()).a(), this);
    }
}
