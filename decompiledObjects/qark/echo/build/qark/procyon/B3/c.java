// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B3;

import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public final class c
{
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final h f;
    public final Set g;
    
    public c(final String a, final Set s, final Set s2, final int d, final int e, final h f, final Set s3) {
        this.a = a;
        this.b = Collections.unmodifiableSet((Set<?>)s);
        this.c = Collections.unmodifiableSet((Set<?>)s2);
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = Collections.unmodifiableSet((Set<?>)s3);
    }
    
    public static b c(final F f) {
        return new b(f, new F[0], null);
    }
    
    public static b d(final F f, final F... array) {
        return new b(f, array, null);
    }
    
    public static b e(final Class clazz) {
        return new b(clazz, new Class[0], null);
    }
    
    public static b f(final Class clazz, final Class... array) {
        return new b(clazz, array, null);
    }
    
    public static c l(final Object o, final Class clazz) {
        return m(clazz).f(new a(o)).d();
    }
    
    public static b m(final Class clazz) {
        return e(clazz).g();
    }
    
    public static c s(final Object o, final Class clazz, final Class... array) {
        return f(clazz, array).f(new B3.b(o)).d();
    }
    
    public Set g() {
        return this.c;
    }
    
    public h h() {
        return this.f;
    }
    
    public String i() {
        return this.a;
    }
    
    public Set j() {
        return this.b;
    }
    
    public Set k() {
        return this.g;
    }
    
    public boolean n() {
        return this.d == 1;
    }
    
    public boolean o() {
        return this.d == 2;
    }
    
    public boolean p() {
        return this.e == 0;
    }
    
    public c t(final h h) {
        return new c(this.a, this.b, this.c, this.d, this.e, h, this.g);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.b.toArray()));
        sb.append(">{");
        sb.append(this.d);
        sb.append(", type=");
        sb.append(this.e);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.c.toArray()));
        sb.append("}");
        return sb.toString();
    }
    
    public static class b
    {
        public String a;
        public final Set b;
        public final Set c;
        public int d;
        public int e;
        public h f;
        public final Set g;
        
        public b(final F f, final F... elements) {
            this.a = null;
            final HashSet<F> b = new HashSet<F>();
            this.b = b;
            this.c = new HashSet();
            int i = 0;
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            E.c(f, "Null interface");
            b.add(f);
            while (i < elements.length) {
                E.c(elements[i], "Null interface");
                ++i;
            }
            Collections.addAll(this.b, elements);
        }
        
        public b(Class clazz, final Class... array) {
            this.a = null;
            final HashSet<F> b = new HashSet<F>();
            this.b = b;
            this.c = new HashSet();
            int i = 0;
            this.d = 0;
            this.e = 0;
            this.g = new HashSet();
            E.c(clazz, "Null interface");
            b.add(F.b(clazz));
            while (i < array.length) {
                clazz = array[i];
                E.c(clazz, "Null interface");
                this.b.add(F.b(clazz));
                ++i;
            }
        }
        
        public b b(final r r) {
            E.c(r, "Null dependency");
            this.j(r.c());
            this.c.add(r);
            return this;
        }
        
        public b c() {
            return this.i(1);
        }
        
        public c d() {
            E.d(this.f != null, "Missing required property: factory.");
            return new c(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g, null);
        }
        
        public b e() {
            return this.i(2);
        }
        
        public b f(final h h) {
            this.f = (h)E.c(h, "Null factory");
            return this;
        }
        
        public final b g() {
            this.e = 1;
            return this;
        }
        
        public b h(final String a) {
            this.a = a;
            return this;
        }
        
        public final b i(final int d) {
            E.d(this.d == 0, "Instantiation type has already been set.");
            this.d = d;
            return this;
        }
        
        public final void j(final F f) {
            E.a(this.b.contains(f) ^ true, "Components are not allowed to depend on interfaces they themselves provide.");
        }
    }
}
