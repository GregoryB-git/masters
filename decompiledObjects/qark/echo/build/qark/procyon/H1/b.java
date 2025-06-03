// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H1;

import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import W5.I;
import java.util.HashMap;
import W5.C;
import V5.q;
import V5.m;
import kotlin.jvm.internal.g;
import java.util.Map;

public final class b
{
    public static final a m;
    public static final Map n;
    public final H1.a a;
    public final H1.a b;
    public final H1.a c;
    public final H1.a d;
    public final H1.a e;
    public final H1.a f;
    public final H1.a g;
    public final H1.a h;
    public final H1.a i;
    public final H1.a j;
    public final H1.a k;
    public final Map l;
    
    static {
        m = new a(null);
        n = C.e(q.a("embedding.weight", "embed.weight"), q.a("dense1.weight", "fc1.weight"), q.a("dense2.weight", "fc2.weight"), q.a("dense3.weight", "fc3.weight"), q.a("dense1.bias", "fc1.bias"), q.a("dense2.bias", "fc2.bias"), q.a("dense3.bias", "fc3.bias"));
    }
    
    public b(final Map map) {
        final H1.a value = map.get("embed.weight");
        if (value == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.a = value;
        final i a = H1.i.a;
        final H1.a value2 = map.get("convs.0.weight");
        if (value2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.b = H1.i.l(value2);
        final H1.a value3 = map.get("convs.1.weight");
        if (value3 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.c = H1.i.l(value3);
        final H1.a value4 = map.get("convs.2.weight");
        if (value4 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.d = H1.i.l(value4);
        final H1.a value5 = map.get("convs.0.bias");
        if (value5 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.e = value5;
        final H1.a value6 = map.get("convs.1.bias");
        if (value6 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f = value6;
        final H1.a value7 = map.get("convs.2.bias");
        if (value7 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.g = value7;
        final H1.a value8 = map.get("fc1.weight");
        if (value8 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.h = H1.i.k(value8);
        final H1.a value9 = map.get("fc2.weight");
        if (value9 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.i = H1.i.k(value9);
        final H1.a value10 = map.get("fc1.bias");
        if (value10 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.j = value10;
        final H1.a value11 = map.get("fc2.bias");
        if (value11 != null) {
            this.k = value11;
            this.l = new HashMap();
            for (final String s : I.f(H1.f.a.o.e(), H1.f.a.p.e())) {
                final String i = Intrinsics.i(s, ".weight");
                final String j = Intrinsics.i(s, ".bias");
                final H1.a a2 = map.get(i);
                final H1.a a3 = map.get(j);
                if (a2 != null) {
                    this.l.put(i, H1.i.k(a2));
                }
                if (a3 != null) {
                    this.l.put(j, a3);
                }
            }
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
    
    public static final /* synthetic */ Map a() {
        if (T1.a.d(b.class)) {
            return null;
        }
        try {
            return b.n;
        }
        finally {
            final Throwable t;
            T1.a.b(t, b.class);
            return null;
        }
    }
    
    public final H1.a b(H1.a a, final String[] array, final String s) {
        if (T1.a.d(this)) {
            return null;
        }
        Label_0295: {
            try {
                Intrinsics.checkNotNullParameter(a, "dense");
                Intrinsics.checkNotNullParameter(array, "texts");
                Intrinsics.checkNotNullParameter(s, "task");
                final i a2 = H1.i.a;
                final H1.a c = H1.i.c(H1.i.e(array, 128, this.a), this.b);
                H1.i.a(c, this.e);
                H1.i.i(c);
                final H1.a c2 = H1.i.c(c, this.c);
                H1.i.a(c2, this.f);
                H1.i.i(c2);
                final H1.a g = H1.i.g(c2, 2);
                final H1.a c3 = H1.i.c(g, this.d);
                H1.i.a(c3, this.g);
                H1.i.i(c3);
                final H1.a g2 = H1.i.g(c, c.b(1));
                final H1.a g3 = H1.i.g(g, g.b(1));
                final H1.a g4 = H1.i.g(c3, c3.b(1));
                H1.i.f(g2, 1);
                H1.i.f(g3, 1);
                H1.i.f(g4, 1);
                a = H1.i.d(H1.i.b(new H1.a[] { g2, g3, g4, a }), this.h, this.j);
                H1.i.i(a);
                a = H1.i.d(a, this.i, this.k);
                H1.i.i(a);
                final H1.a a3 = this.l.get(Intrinsics.i(s, ".weight"));
                final H1.a a4 = this.l.get(Intrinsics.i(s, ".bias"));
                if (a3 != null) {
                    if (a4 == null) {
                        return null;
                    }
                    a = H1.i.d(a, a3, a4);
                    H1.i.j(a);
                    return a;
                }
            }
            finally {
                break Label_0295;
            }
            return null;
        }
        final Throwable t;
        T1.a.b(t, this);
        return null;
    }
    
    public static final class a
    {
        public final b a(final File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            final Map b = this.b(file);
            if (b == null) {
                return null;
            }
            try {
                return new b(b, null);
            }
            catch (Exception ex) {
                return null;
            }
        }
        
        public final Map b(final File file) {
            final Map c = H1.j.c(file);
            if (c != null) {
                final HashMap<String, Object> hashMap = new HashMap<String, Object>();
                final Map a = H1.b.a();
                for (final Map.Entry<String, V> entry : c.entrySet()) {
                    String s = entry.getKey();
                    if (a.containsKey(entry.getKey()) && (s = a.get(entry.getKey())) == null) {
                        return null;
                    }
                    hashMap.put(s, entry.getValue());
                }
                return hashMap;
            }
            return null;
        }
    }
}
