// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d4;

import S3.h;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import Y3.m;
import java.util.Map;
import java.util.HashMap;
import V3.k;
import java.util.Comparator;

public class c implements n
{
    public static Comparator r;
    public final c o;
    public final n p;
    public String q;
    
    static {
        c.r = new Comparator() {
            public int a(final d4.b b, final d4.b b2) {
                return b.h(b2);
            }
        };
    }
    
    public c() {
        this.q = null;
        this.o = c.a.c(c.r);
        this.p = d4.r.a();
    }
    
    public c(final c o, final n p2) {
        this.q = null;
        if (o.isEmpty() && !p2.isEmpty()) {
            throw new IllegalArgumentException("Can't create empty ChildrenNode with priority!");
        }
        this.p = p2;
        this.o = o;
    }
    
    public static void s(final StringBuilder sb, final int n) {
        for (int i = 0; i < n; ++i) {
            sb.append(" ");
        }
    }
    
    @Override
    public n A(final k k) {
        final d4.b z = k.Z();
        if (z == null) {
            return this;
        }
        return this.v(z).A(k.c0());
    }
    
    @Override
    public boolean B() {
        return false;
    }
    
    public int D(final n n) {
        if (this.isEmpty()) {
            if (n.isEmpty()) {
                return 0;
            }
            return -1;
        }
        else {
            if (n.B()) {
                return 1;
            }
            if (n.isEmpty()) {
                return 1;
            }
            if (n == n.l) {
                return -1;
            }
            return 0;
        }
    }
    
    @Override
    public int E() {
        return this.o.size();
    }
    
    @Override
    public d4.b I(final d4.b b) {
        return (d4.b)this.o.k(b);
    }
    
    @Override
    public n J(final n n) {
        if (this.o.isEmpty()) {
            return g.W();
        }
        return new c(this.o, n);
    }
    
    @Override
    public Object L(final boolean b) {
        if (this.isEmpty()) {
            return null;
        }
        final HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        final Iterator iterator = this.o.iterator();
        final int n = 0;
        int n2 = 1;
        int intValue;
        int n3 = intValue = 0;
        while (iterator.hasNext()) {
            final Map.Entry<d4.b, V> entry = iterator.next();
            final String e = entry.getKey().e();
            hashMap.put(e, ((n)entry.getValue()).L(b));
            final int n4 = ++n3;
            if (n2 != 0) {
                if (e.length() <= 1 || e.charAt(0) != '0') {
                    final Integer k = m.k(e);
                    if (k != null && k >= 0) {
                        n3 = n4;
                        if (k > intValue) {
                            intValue = k;
                            n3 = n4;
                            continue;
                        }
                        continue;
                    }
                }
                n2 = 0;
                n3 = n4;
            }
        }
        if (!b && n2 != 0 && intValue < n3 * 2) {
            final ArrayList list = new ArrayList<Object>(intValue + 1);
            for (int i = n; i <= intValue; ++i) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(i);
                list.add(hashMap.get(sb.toString()));
            }
            return list;
        }
        if (b && !this.p.isEmpty()) {
            hashMap.put(".priority", this.p.getValue());
        }
        return hashMap;
    }
    
    public void M(final c c) {
        this.S(c, false);
    }
    
    @Override
    public n N(final d4.b b, final n n) {
        if (b.s()) {
            return this.J(n);
        }
        c c2;
        final c c = c2 = this.o;
        if (c.a(b)) {
            c2 = c.D(b);
        }
        c s = c2;
        if (!n.isEmpty()) {
            s = c2.s(b, n);
        }
        if (s.isEmpty()) {
            return g.W();
        }
        return new c(s, this.p);
    }
    
    @Override
    public String O(final b b) {
        final b o = n.b.o;
        if (b == o) {
            final StringBuilder sb = new StringBuilder();
            if (!this.p.isEmpty()) {
                sb.append("priority:");
                sb.append(this.p.O(o));
                sb.append(":");
            }
            final ArrayList<d4.m> list = new ArrayList<d4.m>();
            final Iterator iterator = this.iterator();
            int n = 0;
        Label_0072:
            while (true) {
                n = 0;
                while (iterator.hasNext()) {
                    final d4.m m = iterator.next();
                    list.add(m);
                    if (n == 0 && m.d().t().isEmpty()) {
                        continue Label_0072;
                    }
                    n = 1;
                }
                break;
            }
            if (n != 0) {
                Collections.sort((List<Object>)list, d4.q.j());
            }
            for (final d4.m i : list) {
                final String r = i.d().R();
                if (!r.equals("")) {
                    sb.append(":");
                    sb.append(i.c().e());
                    sb.append(":");
                    sb.append(r);
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Hashes on children nodes only supported for V1");
    }
    
    @Override
    public Iterator P() {
        return new d(this.o.P());
    }
    
    @Override
    public boolean Q(final d4.b b) {
        return this.v(b).isEmpty() ^ true;
    }
    
    @Override
    public String R() {
        if (this.q == null) {
            final String o = this.O(b.o);
            String i;
            if (o.isEmpty()) {
                i = "";
            }
            else {
                i = m.i(o);
            }
            this.q = i;
        }
        return this.q;
    }
    
    public void S(final c c, final boolean b) {
        if (b && !this.t().isEmpty()) {
            this.o.q(new h.b() {
                public boolean a = false;
                
                public void b(final b b, final n n) {
                    if (!this.a && b.h(b.o()) > 0) {
                        this.a = true;
                        c.b(b.o(), d4.c.this.t());
                    }
                    c.b(b, n);
                }
            });
            return;
        }
        this.o.q(c);
    }
    
    public d4.b T() {
        return (d4.b)this.o.i();
    }
    
    public d4.b U() {
        return (d4.b)this.o.g();
    }
    
    public final void V(final StringBuilder sb, final int n) {
        String str;
        if (this.o.isEmpty() && this.p.isEmpty()) {
            str = "{ }";
        }
        else {
            sb.append("{\n");
            for (final Map.Entry<d4.b, V> entry : this.o) {
                final int n2 = n + 2;
                s(sb, n2);
                sb.append(entry.getKey().e());
                sb.append("=");
                final boolean b = entry.getValue() instanceof c;
                final V value = entry.getValue();
                if (b) {
                    ((c)value).V(sb, n2);
                }
                else {
                    sb.append(((c)value).toString());
                }
                sb.append("\n");
            }
            if (!this.p.isEmpty()) {
                s(sb, n + 2);
                sb.append(".priority=");
                sb.append(this.p.toString());
                sb.append("\n");
            }
            s(sb, n);
            str = "}";
        }
        sb.append(str);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        if (!this.t().equals(c.t())) {
            return false;
        }
        if (this.o.size() != c.o.size()) {
            return false;
        }
        final Iterator iterator = this.o.iterator();
        final Iterator iterator2 = c.o.iterator();
        while (iterator.hasNext() && iterator2.hasNext()) {
            final Map.Entry<d4.b, V> entry = iterator.next();
            final Map.Entry<K, Object> entry2 = iterator2.next();
            if (!entry.getKey().equals(entry2.getKey()) || !((n)entry.getValue()).equals(entry2.getValue())) {
                return false;
            }
        }
        if (!iterator.hasNext() && !iterator2.hasNext()) {
            return true;
        }
        throw new IllegalStateException("Something went wrong internally.");
    }
    
    @Override
    public Object getValue() {
        return this.L(false);
    }
    
    @Override
    public int hashCode() {
        final Iterator iterator = this.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final d4.m m = iterator.next();
            n = (n * 31 + m.c().hashCode()) * 17 + m.d().hashCode();
        }
        return n;
    }
    
    @Override
    public boolean isEmpty() {
        return this.o.isEmpty();
    }
    
    @Override
    public Iterator iterator() {
        return new d(this.o.iterator());
    }
    
    @Override
    public n t() {
        return this.p;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        this.V(sb, 0);
        return sb.toString();
    }
    
    @Override
    public n v(final d4.b b) {
        if (b.s() && !this.p.isEmpty()) {
            return this.p;
        }
        if (this.o.a(b)) {
            return (n)this.o.d(b);
        }
        return g.W();
    }
    
    @Override
    public n y(final k k, final n n) {
        final d4.b z = k.Z();
        if (z == null) {
            return n;
        }
        if (z.s()) {
            m.f(d4.r.b(n));
            return this.J(n);
        }
        return this.N(z, this.v(z).y(k.c0(), n));
    }
    
    public abstract static class c extends h.b
    {
        public abstract void b(final b p0, final n p1);
        
        public void c(final b b, final n n) {
            this.b(b, n);
        }
    }
    
    public static class d implements Iterator
    {
        public final Iterator o;
        
        public d(final Iterator o) {
            this.o = o;
        }
        
        public d4.m b() {
            final Map.Entry<d4.b, n> entry = this.o.next();
            return new d4.m(entry.getKey(), entry.getValue());
        }
        
        @Override
        public boolean hasNext() {
            return this.o.hasNext();
        }
        
        @Override
        public void remove() {
            this.o.remove();
        }
    }
}
