/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package V3;

import V3.k;
import d4.b;
import d4.c;
import d4.n;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class u {
    public n a = null;
    public Map b = null;

    public void a(c c8) {
        Map map = this.b;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c8.a((b)entry.getKey(), (u)entry.getValue());
            }
        }
    }

    public void b(final k k8, final d d8) {
        n n8 = this.a;
        if (n8 != null) {
            d8.a(k8, n8);
            return;
        }
        this.a(new c(){

            @Override
            public void a(b b8, u u8) {
                u8.b(k8.U(b8), d8);
            }
        });
    }

    public boolean c(final k k8) {
        if (k8.isEmpty()) {
            this.a = null;
            this.b = null;
            return true;
        }
        Object object = this.a;
        if (object != null) {
            if (object.B()) {
                return false;
            }
            object = (d4.c)this.a;
            this.a = null;
            object.M(new c.c(){

                @Override
                public void b(b b8, n n8) {
                    u.this.d(k8.U(b8), n8);
                }
            });
            return this.c(k8);
        }
        if (this.b != null) {
            object = k8.Z();
            k8 = k8.c0();
            if (this.b.containsKey(object) && ((u)this.b.get(object)).c(k8)) {
                this.b.remove(object);
            }
            if (this.b.isEmpty()) {
                this.b = null;
                return true;
            }
            return false;
        }
        return true;
    }

    public void d(k k8, n n8) {
        if (k8.isEmpty()) {
            this.a = n8;
            this.b = null;
            return;
        }
        Object object = this.a;
        if (object != null) {
            this.a = object.y(k8, n8);
            return;
        }
        if (this.b == null) {
            this.b = new HashMap();
        }
        if (!this.b.containsKey(object = k8.Z())) {
            this.b.put(object, (Object)new u());
        }
        ((u)this.b.get(object)).d(k8.c0(), n8);
    }

    public static interface c {
        public void a(b var1, u var2);
    }

    public static interface d {
        public void a(k var1, n var2);
    }

}

