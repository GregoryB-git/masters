/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package Y3;

import Y3.l;
import Y3.m;
import java.util.Map;
import java.util.Set;

public class k {
    public d4.b a;
    public k b;
    public l c;

    public k() {
        this(null, null, new l());
    }

    public k(d4.b b8, k k8, l l8) {
        this.a = b8;
        this.b = k8;
        this.c = l8;
    }

    public boolean a(b b8) {
        return this.b(b8, false);
    }

    public boolean b(b b8, boolean bl) {
        k k8 = bl ? this : this.b;
        while (k8 != null) {
            if (b8.a(k8)) {
                return true;
            }
            k8 = k8.b;
        }
        return false;
    }

    public void c(c c8) {
        Object[] arrobject = this.c.a.entrySet().toArray();
        for (int i8 = 0; i8 < arrobject.length; ++i8) {
            Map.Entry entry = (Map.Entry)arrobject[i8];
            c8.a(new k((d4.b)entry.getKey(), this, (l)entry.getValue()));
        }
    }

    public void d(c c8) {
        this.e(c8, false, false);
    }

    public void e(final c c8, boolean bl, final boolean bl2) {
        if (bl && !bl2) {
            c8.a(this);
        }
        this.c(new c(){

            @Override
            public void a(k k8) {
                k8.e(c8, true, bl2);
            }
        });
        if (bl && bl2) {
            c8.a(this);
        }
    }

    public V3.k f() {
        boolean bl = false;
        if (this.b != null) {
            if (this.a != null) {
                bl = true;
            }
            m.f(bl);
            return this.b.f().U(this.a);
        }
        if (this.a != null) {
            return new V3.k(this.a);
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
        l l8 = this.c;
        if (l8.b == null && l8.a.isEmpty()) {
            return true;
        }
        return false;
    }

    public void j(Object object) {
        this.c.b = object;
        this.n();
    }

    public k k(V3.k k8) {
        d4.b b8 = k8.Z();
        k k9 = this;
        while (b8 != null) {
            l l8 = k9.c.a.containsKey((Object)b8) ? (l)k9.c.a.get((Object)b8) : new l();
            k9 = new k(b8, k9, l8);
            k8 = k8.c0();
            b8 = k8.Z();
        }
        return k9;
    }

    public String l(String string2) {
        Object object = this.a;
        object = object == null ? "<anon>" : object.e();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append((String)object);
        stringBuilder.append("\n");
        object = this.c;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(string2);
        stringBuilder2.append("\t");
        stringBuilder.append(object.a(stringBuilder2.toString()));
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void m(d4.b b8, k k8) {
        block4 : {
            block3 : {
                boolean bl;
                boolean bl2;
                block2 : {
                    bl2 = k8.i();
                    bl = this.c.a.containsKey((Object)b8);
                    if (!bl2 || !bl) break block2;
                    this.c.a.remove((Object)b8);
                    break block3;
                }
                if (bl2 || bl) break block4;
                this.c.a.put((Object)b8, (Object)k8.c);
            }
            this.n();
            return;
        }
    }

    public final void n() {
        k k8 = this.b;
        if (k8 != null) {
            k8.m(this.a, this);
        }
    }

    public String toString() {
        return this.l("");
    }

    public static interface b {
        public boolean a(k var1);
    }

    public static interface c {
        public void a(k var1);
    }

}

