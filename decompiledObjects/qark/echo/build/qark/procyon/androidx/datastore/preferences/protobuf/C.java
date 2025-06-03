// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

public class C extends c implements D, RandomAccess
{
    public static final C q;
    public static final D r;
    public final List p;
    
    static {
        final C c = new C();
        (q = c).j();
        r = c;
    }
    
    public C() {
        this(10);
    }
    
    public C(final int initialCapacity) {
        this(new ArrayList(initialCapacity));
    }
    
    public C(final ArrayList p) {
        this.p = p;
    }
    
    public static String f(final Object o) {
        if (o instanceof String) {
            return (String)o;
        }
        if (o instanceof g) {
            return ((g)o).a0();
        }
        return y.j((byte[])o);
    }
    
    @Override
    public void H(final g g) {
        this.a();
        this.p.add(g);
        ++super.modCount;
    }
    
    @Override
    public boolean addAll(final int n, final Collection collection) {
        this.a();
        List o = (List)collection;
        if (collection instanceof D) {
            o = ((D)collection).o();
        }
        final boolean addAll = this.p.addAll(n, o);
        ++super.modCount;
        return addAll;
    }
    
    @Override
    public boolean addAll(final Collection collection) {
        return this.addAll(this.size(), collection);
    }
    
    @Override
    public void clear() {
        this.a();
        this.p.clear();
        ++super.modCount;
    }
    
    public void d(final int n, final String s) {
        this.a();
        this.p.add(n, s);
        ++super.modCount;
    }
    
    public String g(final int n) {
        final byte[] value = this.p.get(n);
        if (value instanceof String) {
            return (String)(Object)value;
        }
        if (value instanceof g) {
            final g g = (Object)value;
            final String a0 = g.a0();
            if (g.M()) {
                this.p.set(n, a0);
            }
            return a0;
        }
        final byte[] array = value;
        final String j = y.j(array);
        if (y.g(array)) {
            this.p.set(n, j);
        }
        return j;
    }
    
    public C i(final int initialCapacity) {
        if (initialCapacity >= this.size()) {
            final ArrayList list = new ArrayList(initialCapacity);
            list.addAll(this.p);
            return new C(list);
        }
        throw new IllegalArgumentException();
    }
    
    public String k(final int n) {
        this.a();
        final Object remove = this.p.remove(n);
        ++super.modCount;
        return f(remove);
    }
    
    @Override
    public D m() {
        if (this.p()) {
            return new o0(this);
        }
        return this;
    }
    
    @Override
    public Object n(final int n) {
        return this.p.get(n);
    }
    
    @Override
    public List o() {
        return Collections.unmodifiableList((List<?>)this.p);
    }
    
    public String q(final int n, final String s) {
        this.a();
        return f(this.p.set(n, s));
    }
    
    @Override
    public int size() {
        return this.p.size();
    }
}
