// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y3;

import java.util.Map;
import d4.b;

public class k
{
    public d4.b a;
    public k b;
    public l c;
    
    public k() {
        this(null, null, new l());
    }
    
    public k(final d4.b a, final k b, final l c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public boolean a(final b b) {
        return this.b(b, false);
    }
    
    public boolean b(final b b, final boolean b2) {
        k k;
        if (b2) {
            k = this;
        }
        else {
            k = this.b;
        }
        while (k != null) {
            if (b.a(k)) {
                return true;
            }
            k = k.b;
        }
        return false;
    }
    
    public void c(final c c) {
        final Object[] array = this.c.a.entrySet().toArray();
        for (int i = 0; i < array.length; ++i) {
            final Map.Entry entry = (Map.Entry)array[i];
            c.a(new k(entry.getKey(), this, entry.getValue()));
        }
    }
    
    public void d(final c c) {
        this.e(c, false, false);
    }
    
    public void e(final c c, final boolean b, final boolean b2) {
        if (b && !b2) {
            c.a(this);
        }
        this.c((c)new c() {
            @Override
            public void a(final k k) {
                k.e(c, true, b2);
            }
        });
        if (b && b2) {
            c.a(this);
        }
    }
    
    public V3.k f() {
        boolean b = false;
        if (this.b != null) {
            if (this.a != null) {
                b = true;
            }
            m.f(b);
            return this.b.f().U(this.a);
        }
        if (this.a != null) {
            return new V3.k(new d4.b[] { this.a });
        }
        return V3.k.Y();
    }
    
    public Object g() {
        return this.c.b;
    }
    
    public boolean h() {
        return this.c.a.isEmpty() ^ true;
    }
    
    public boolean i() {
        final l c = this.c;
        return c.b == null && c.a.isEmpty();
    }
    
    public void j(final Object b) {
        this.c.b = b;
        this.n();
    }
    
    public k k(V3.k c0) {
        d4.b b = c0.Z();
        k k = this;
        while (b != null) {
            l l;
            if (k.c.a.containsKey(b)) {
                l = k.c.a.get(b);
            }
            else {
                l = new l();
            }
            k = new k(b, k, l);
            c0 = c0.c0();
            b = c0.Z();
        }
        return k;
    }
    
    public String l(final String s) {
        final d4.b a = this.a;
        String e;
        if (a == null) {
            e = "<anon>";
        }
        else {
            e = a.e();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(e);
        sb.append("\n");
        final l c = this.c;
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(s);
        sb2.append("\t");
        sb.append(c.a(sb2.toString()));
        return sb.toString();
    }
    
    public final void m(final d4.b b, final k k) {
        final boolean i = k.i();
        final boolean containsKey = this.c.a.containsKey(b);
        if (i && containsKey) {
            this.c.a.remove(b);
        }
        else {
            if (i || containsKey) {
                return;
            }
            this.c.a.put(b, k.c);
        }
        this.n();
    }
    
    public final void n() {
        final k b = this.b;
        if (b != null) {
            b.m(this.a, this);
        }
    }
    
    @Override
    public String toString() {
        return this.l("");
    }
    
    public interface b
    {
        boolean a(final k p0);
    }
    
    public interface c
    {
        void a(final k p0);
    }
}
