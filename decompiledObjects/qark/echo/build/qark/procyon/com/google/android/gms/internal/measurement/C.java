// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.concurrent.Callable;

public final class C
{
    public final F1 a;
    public f3 b;
    public d c;
    public final b d;
    
    public C() {
        this(new F1());
    }
    
    public C(final F1 a) {
        this.a = a;
        this.b = a.b.d();
        this.c = new d();
        this.d = new b();
        a.b("internal.registerCallback", new a(this));
        a.b("internal.eventLogger", new D0(this));
    }
    
    public final d a() {
        return this.c;
    }
    
    public final void b(final q2 q2) {
        try {
            this.b = this.a.b.d();
            if (!(this.a.a(this.b, (r2[])q2.I().toArray(new r2[0])) instanceof l)) {
                String h = null;
                Label_0234: {
                    Label_0206: {
                        for (final p2 p : q2.G().I()) {
                            final List i = p.I();
                            h = p.H();
                            final Iterator<r2> iterator2 = i.iterator();
                            while (iterator2.hasNext()) {
                                final s a = this.a.a(this.b, iterator2.next());
                                if (!(a instanceof r)) {
                                    throw new IllegalArgumentException("Invalid rule definition");
                                }
                                final f3 b = this.b;
                                n n;
                                if (!b.g(h)) {
                                    n = null;
                                }
                                else {
                                    final s c = b.c(h);
                                    if (!(c instanceof n)) {
                                        break Label_0234;
                                    }
                                    n = (n)c;
                                }
                                if (n == null) {
                                    break Label_0206;
                                }
                                n.b(this.b, Collections.singletonList(a));
                            }
                        }
                        return;
                    }
                    final StringBuilder sb = new StringBuilder("Rule function is undefined: ");
                    sb.append(h);
                    throw new IllegalStateException(sb.toString());
                }
                final StringBuilder sb2 = new StringBuilder("Invalid function name: ");
                sb2.append(h);
                throw new IllegalStateException(sb2.toString());
            }
            throw new IllegalStateException("Program loading failed");
        }
        finally {
            final Throwable t;
            throw new d0(t);
        }
    }
    
    public final void c(final String s, final Callable callable) {
        this.a.b(s, callable);
    }
    
    public final boolean d(final e e) {
        try {
            this.c.b(e);
            this.a.c.h("runtime.counter", new k(0.0));
            this.d.b(this.b.d(), this.c);
            if (!this.g()) {
                if (!this.f()) {
                    return false;
                }
            }
        }
        finally {
            final Throwable t;
            throw new d0(t);
        }
        return true;
    }
    
    public final boolean f() {
        return !this.c.f().isEmpty();
    }
    
    public final boolean g() {
        return !this.c.d().equals(this.c.a());
    }
}
