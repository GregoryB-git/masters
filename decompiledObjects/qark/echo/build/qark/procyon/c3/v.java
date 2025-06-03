// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c3;

import q3.k;
import java.util.Arrays;
import p3.z;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import k3.o;
import k3.i;
import p3.I;
import p3.C;
import n3.a;
import java.util.concurrent.ConcurrentMap;

public final class v
{
    public final ConcurrentMap a;
    public c b;
    public final Class c;
    public final a d;
    public final boolean e;
    
    public v(final ConcurrentMap a, final c b, final a d, final Class c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = false;
    }
    
    public static c b(final Object o, final Object o2, final C.c c, final ConcurrentMap concurrentMap) {
        Integer value = c.a0();
        if (c.b0() == I.s) {
            value = null;
        }
        final c c2 = new c(o, o2, c3.d.a(c), c.c0(), c.b0(), c.a0(), c.Z().a0(), i.a().d(o.b(c.Z().a0(), c.Z().b0(), c.Z().Z(), c.b0(), value), f.a()));
        final ArrayList<c> list = new ArrayList<c>();
        list.add(c2);
        final d d = new d(c2.b(), null);
        final List<Object> list2 = concurrentMap.put(d, Collections.unmodifiableList((List<?>)list));
        if (list2 != null) {
            final ArrayList<c> list3 = new ArrayList<c>();
            list3.addAll((Collection<?>)list2);
            list3.add(c2);
            concurrentMap.put(d, Collections.unmodifiableList((List<?>)list3));
        }
        return c2;
    }
    
    public static b j(final Class clazz) {
        return new b(clazz, null);
    }
    
    public Collection c() {
        return this.a.values();
    }
    
    public a d() {
        return this.d;
    }
    
    public c e() {
        return this.b;
    }
    
    public List f(final byte[] array) {
        final List list = (List)this.a.get(new d(array, null));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }
    
    public Class g() {
        return this.c;
    }
    
    public List h() {
        return this.f(c3.d.a);
    }
    
    public boolean i() {
        return this.d.b().isEmpty() ^ true;
    }
    
    public static class b
    {
        public final Class a;
        public ConcurrentMap b;
        public c c;
        public a d;
        
        public b(final Class a) {
            this.b = new ConcurrentHashMap();
            this.a = a;
            this.d = a.b;
        }
        
        public b a(final Object o, final Object o2, final C.c c) {
            return this.c(o, o2, c, false);
        }
        
        public b b(final Object o, final Object o2, final C.c c) {
            return this.c(o, o2, c, true);
        }
        
        public final b c(final Object o, final Object o2, final C.c c, final boolean b) {
            if (this.b == null) {
                throw new IllegalStateException("addPrimitive cannot be called after build");
            }
            if (o == null && o2 == null) {
                throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
            }
            if (c.c0() != z.q) {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            final c a = b(o, o2, c, this.b);
            if (!b) {
                return this;
            }
            if (this.c == null) {
                this.c = a;
                return this;
            }
            throw new IllegalStateException("you cannot set two primary primitives");
        }
        
        public v d() {
            final ConcurrentMap b = this.b;
            if (b != null) {
                final v v = new v(b, this.c, this.d, this.a, null);
                this.b = null;
                return v;
            }
            throw new IllegalStateException("build cannot be called twice");
        }
        
        public b e(final a d) {
            if (this.b != null) {
                this.d = d;
                return this;
            }
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
    }
    
    public static final class c
    {
        public final Object a;
        public final Object b;
        public final byte[] c;
        public final z d;
        public final I e;
        public final int f;
        public final String g;
        public final g h;
        
        public c(final Object a, final Object b, final byte[] original, final z d, final I e, final int f, final String g, final g h) {
            this.a = a;
            this.b = b;
            this.c = Arrays.copyOf(original, original.length);
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
        }
        
        public Object a() {
            return this.a;
        }
        
        public final byte[] b() {
            final byte[] c = this.c;
            if (c == null) {
                return null;
            }
            return Arrays.copyOf(c, c.length);
        }
        
        public g c() {
            return this.h;
        }
        
        public int d() {
            return this.f;
        }
        
        public String e() {
            return this.g;
        }
        
        public I f() {
            return this.e;
        }
        
        public Object g() {
            return this.b;
        }
        
        public z h() {
            return this.d;
        }
    }
    
    public static class d implements Comparable
    {
        public final byte[] o;
        
        public d(final byte[] original) {
            this.o = Arrays.copyOf(original, original.length);
        }
        
        public int c(final d d) {
            final byte[] o = this.o;
            final int length = o.length;
            final byte[] o2 = d.o;
            if (length != o2.length) {
                return o.length - o2.length;
            }
            int n = 0;
            while (true) {
                final byte[] o3 = this.o;
                if (n >= o3.length) {
                    return 0;
                }
                final byte b = o3[n];
                final byte b2 = d.o[n];
                if (b != b2) {
                    return b - b2;
                }
                ++n;
            }
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof d && Arrays.equals(this.o, ((d)o).o);
        }
        
        @Override
        public int hashCode() {
            return Arrays.hashCode(this.o);
        }
        
        @Override
        public String toString() {
            return k.b(this.o);
        }
    }
}
