// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B3;

import r4.a;
import r4.b;
import java.util.Iterator;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class G implements e
{
    public final Set a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final Set f;
    public final e g;
    
    public G(final c c, final e g) {
        final HashSet<F> s = new HashSet<F>();
        final HashSet<F> s2 = new HashSet<F>();
        final HashSet<F> s3 = new HashSet<F>();
        final HashSet<F> s4 = new HashSet<F>();
        final HashSet<F> s5 = new HashSet<F>();
        for (final r r : c.g()) {
            if (r.e()) {
                final boolean g2 = r.g();
                final F c2 = r.c();
                if (g2) {
                    s4.add(c2);
                }
                else {
                    s.add(c2);
                }
            }
            else if (r.d()) {
                s3.add(r.c());
            }
            else {
                final boolean g3 = r.g();
                final F c3 = r.c();
                if (g3) {
                    s5.add(c3);
                }
                else {
                    s2.add(c3);
                }
            }
        }
        if (!c.k().isEmpty()) {
            s.add(F.b(n4.c.class));
        }
        this.a = Collections.unmodifiableSet((Set<?>)s);
        this.b = Collections.unmodifiableSet((Set<?>)s2);
        this.c = Collections.unmodifiableSet((Set<?>)s3);
        this.d = Collections.unmodifiableSet((Set<?>)s4);
        this.e = Collections.unmodifiableSet((Set<?>)s5);
        this.f = c.k();
        this.g = g;
    }
    
    @Override
    public Object a(final Class clazz) {
        if (!this.a.contains(F.b(clazz))) {
            throw new t(String.format("Attempting to request an undeclared dependency %s.", clazz));
        }
        final Object a = this.g.a(clazz);
        if (!clazz.equals(n4.c.class)) {
            return a;
        }
        return new a(this.f, (n4.c)a);
    }
    
    @Override
    public b b(final F f) {
        if (this.b.contains(f)) {
            return this.g.b(f);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<%s>.", f));
    }
    
    @Override
    public r4.a d(final F f) {
        if (this.c.contains(f)) {
            return this.g.d(f);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Deferred<%s>.", f));
    }
    
    @Override
    public Set e(final F f) {
        if (this.d.contains(f)) {
            return this.g.e(f);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Set<%s>.", f));
    }
    
    @Override
    public b f(final F f) {
        if (this.e.contains(f)) {
            return this.g.f(f);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", f));
    }
    
    @Override
    public b g(final Class clazz) {
        return this.b(F.b(clazz));
    }
    
    @Override
    public Object h(final F f) {
        if (this.a.contains(f)) {
            return this.g.h(f);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", f));
    }
    
    @Override
    public r4.a i(final Class clazz) {
        return this.d(F.b(clazz));
    }
    
    public static class a implements c
    {
        public final Set a;
        public final c b;
        
        public a(final Set a, final c b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public void a(final n4.a a) {
            if (this.a.contains(a.b())) {
                this.b.a(a);
                return;
            }
            throw new t(String.format("Attempting to publish an undeclared event %s.", a));
        }
    }
}
