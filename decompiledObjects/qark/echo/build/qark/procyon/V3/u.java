// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V3;

import java.util.HashMap;
import d4.c;
import java.util.Iterator;
import d4.b;
import java.util.Map;
import d4.n;

public class u
{
    public n a;
    public Map b;
    
    public u() {
        this.a = null;
        this.b = null;
    }
    
    public void a(final c c) {
        final Map b = this.b;
        if (b != null) {
            for (final Map.Entry<b, V> entry : b.entrySet()) {
                c.a(entry.getKey(), (u)entry.getValue());
            }
        }
    }
    
    public void b(final k k, final d d) {
        final n a = this.a;
        if (a != null) {
            d.a(k, a);
            return;
        }
        this.a((c)new c() {
            @Override
            public void a(final b b, final u u) {
                u.b(k.U(b), d);
            }
        });
    }
    
    public boolean c(k c0) {
        if (c0.isEmpty()) {
            this.a = null;
            this.b = null;
            return true;
        }
        final n a = this.a;
        if (a != null) {
            if (a.B()) {
                return false;
            }
            final d4.c c2 = (d4.c)this.a;
            this.a = null;
            c2.M((d4.c.c)new d4.c.c() {
                @Override
                public void b(final b b, final n n) {
                    u.this.d(c0.U(b), n);
                }
            });
            return this.c(c0);
        }
        else {
            if (this.b == null) {
                return true;
            }
            final b z = c0.Z();
            c0 = c0.c0();
            if (this.b.containsKey(z) && ((u)this.b.get(z)).c(c0)) {
                this.b.remove(z);
            }
            if (this.b.isEmpty()) {
                this.b = null;
                return true;
            }
            return false;
        }
    }
    
    public void d(final k k, final n a) {
        if (k.isEmpty()) {
            this.a = a;
            this.b = null;
            return;
        }
        final n a2 = this.a;
        if (a2 != null) {
            this.a = a2.y(k, a);
            return;
        }
        if (this.b == null) {
            this.b = new HashMap();
        }
        final b z = k.Z();
        if (!this.b.containsKey(z)) {
            this.b.put(z, new u());
        }
        ((u)this.b.get(z)).d(k.c0(), a);
    }
    
    public interface c
    {
        void a(final b p0, final u p1);
    }
    
    public interface d
    {
        void a(final k p0, final n p1);
    }
}
