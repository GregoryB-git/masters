// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y3;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import V3.k;
import java.util.Comparator;
import S3.l;
import d4.b;
import S3.c;

public final class d implements Iterable
{
    public static final S3.c q;
    public static final d r;
    public final Object o;
    public final S3.c p;
    
    static {
        r = new d(null, q = S3.c.a.c(l.b(b.class)));
    }
    
    public d(final Object o) {
        this(o, d.q);
    }
    
    public d(final Object o, final S3.c p2) {
        this.o = o;
        this.p = p2;
    }
    
    public static d d() {
        return d.r;
    }
    
    public d D(final b b) {
        final d d = (d)this.p.d(b);
        if (d != null) {
            return d;
        }
        return d();
    }
    
    public S3.c M() {
        return this.p;
    }
    
    public Object S(final k k) {
        return this.T(k, i.a);
    }
    
    public Object T(final k k, final i i) {
        final Object o = this.o;
        Object o2;
        if (o != null && i.a(o)) {
            o2 = this.o;
        }
        else {
            o2 = null;
        }
        final Iterator iterator = k.iterator();
        d d = this;
        while (iterator.hasNext()) {
            final d d2 = (d)d.p.d(iterator.next());
            if (d2 == null) {
                return o2;
            }
            final Object o3 = d2.o;
            d = d2;
            if (o3 == null) {
                continue;
            }
            d = d2;
            if (!i.a(o3)) {
                continue;
            }
            o2 = d2.o;
            d = d2;
        }
        return o2;
    }
    
    public d U(final k k) {
        if (k.isEmpty()) {
            if (this.p.isEmpty()) {
                return d();
            }
            return new d(null, this.p);
        }
        else {
            final b z = k.Z();
            final d d = (d)this.p.d(z);
            if (d == null) {
                return this;
            }
            final d u = d.U(k.c0());
            S3.c c;
            if (u.isEmpty()) {
                c = this.p.D(z);
            }
            else {
                c = this.p.s(z, u);
            }
            if (this.o == null && c.isEmpty()) {
                return d();
            }
            return new d(this.o, c);
        }
    }
    
    public Object V(final k k, final i i) {
        final Object o = this.o;
        if (o != null && i.a(o)) {
            return this.o;
        }
        final Iterator iterator = k.iterator();
        d d = this;
        while (iterator.hasNext()) {
            final d d2 = (d)d.p.d(iterator.next());
            if (d2 == null) {
                return null;
            }
            final Object o2 = d2.o;
            d = d2;
            if (o2 == null) {
                continue;
            }
            d = d2;
            if (i.a(o2)) {
                return d2.o;
            }
        }
        return null;
    }
    
    public d W(final k k, final Object o) {
        if (k.isEmpty()) {
            return new d(o, this.p);
        }
        final b z = k.Z();
        d d;
        if ((d = (d)this.p.d(z)) == null) {
            d = d();
        }
        return new d(this.o, this.p.s(z, d.W(k.c0(), o)));
    }
    
    public d X(final k k, final d d) {
        if (k.isEmpty()) {
            return d;
        }
        final b z = k.Z();
        d d2;
        if ((d2 = (d)this.p.d(z)) == null) {
            d2 = d();
        }
        final d x = d2.X(k.c0(), d);
        S3.c c;
        if (x.isEmpty()) {
            c = this.p.D(z);
        }
        else {
            c = this.p.s(z, x);
        }
        return new d(this.o, c);
    }
    
    public d Y(final k k) {
        if (k.isEmpty()) {
            return this;
        }
        final d d = (d)this.p.d(k.Z());
        if (d != null) {
            return d.Y(k.c0());
        }
        return d();
    }
    
    public Collection Z() {
        final ArrayList list = new ArrayList();
        this.q((c)new c() {
            public Void b(final k k, final Object e, final Void void1) {
                list.add(e);
                return null;
            }
        });
        return list;
    }
    
    public boolean a(final i i) {
        final Object o = this.o;
        if (o != null && i.a(o)) {
            return true;
        }
        final Iterator iterator = this.p.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue().a(i)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (d.class != o.getClass()) {
            return false;
        }
        final d d = (d)o;
        final S3.c p = this.p;
        if (p != null) {
            if (!p.equals(d.p)) {
                return false;
            }
        }
        else if (d.p != null) {
            return false;
        }
        final Object o2 = this.o;
        o = d.o;
        if (o2 != null) {
            if (!o2.equals(o)) {
                return false;
            }
        }
        else if (o != null) {
            return false;
        }
        return true;
    }
    
    public k f(k f, final i i) {
        final Object o = this.o;
        if (o != null && i.a(o)) {
            return k.Y();
        }
        if (f.isEmpty()) {
            return null;
        }
        final b z = f.Z();
        final d d = (d)this.p.d(z);
        if (d != null) {
            f = d.f(f.c0(), i);
            if (f != null) {
                return new k(new b[] { z }).T(f);
            }
        }
        return null;
    }
    
    public k g(final k k) {
        return this.f(k, i.a);
    }
    
    public Object getValue() {
        return this.o;
    }
    
    @Override
    public int hashCode() {
        final Object o = this.o;
        int hashCode = 0;
        int hashCode2;
        if (o != null) {
            hashCode2 = o.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final S3.c p = this.p;
        if (p != null) {
            hashCode = p.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    public final Object i(final k k, final c c, Object i) {
        for (final Map.Entry<K, d> entry : this.p) {
            i = entry.getValue().i(k.U((b)entry.getKey()), c, i);
        }
        final Object o = this.o;
        Object a = i;
        if (o != null) {
            a = c.a(k, o, i);
        }
        return a;
    }
    
    public boolean isEmpty() {
        return this.o == null && this.p.isEmpty();
    }
    
    @Override
    public Iterator iterator() {
        final ArrayList list = new ArrayList();
        this.q((c)new c() {
            public Void b(final k key, final Object value, final Void void1) {
                list.add(new AbstractMap.SimpleImmutableEntry<k, Object>(key, value));
                return null;
            }
        });
        return list.iterator();
    }
    
    public Object k(final Object o, final c c) {
        return this.i(k.Y(), c, o);
    }
    
    public void q(final c c) {
        this.i(k.Y(), c, null);
    }
    
    public Object s(final k k) {
        if (k.isEmpty()) {
            return this.o;
        }
        final d d = (d)this.p.d(k.Z());
        if (d != null) {
            return d.s(k.c0());
        }
        return null;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ImmutableTree { value=");
        sb.append(this.getValue());
        sb.append(", children={");
        for (final Map.Entry<b, V> entry : this.p) {
            sb.append(entry.getKey().e());
            sb.append("=");
            sb.append(entry.getValue());
        }
        sb.append("} }");
        return sb.toString();
    }
    
    public interface c
    {
        Object a(final k p0, final Object p1, final Object p2);
    }
}
