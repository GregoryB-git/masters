/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package X3;

import V3.k;
import Y3.d;
import Y3.i;
import d4.b;

public class g {
    public static final i b = new i(){

        public boolean b(Boolean bl) {
            return bl ^ true;
        }
    };
    public static final i c = new i(){

        public boolean b(Boolean bl) {
            return bl;
        }
    };
    public static final d d = new d((Object)Boolean.TRUE);
    public static final d e = new d((Object)Boolean.FALSE);
    public final d a;

    public g() {
        this.a = d.d();
    }

    public g(d d8) {
        this.a = d8;
    }

    public g a(b object) {
        d d8 = this.a.D((b)object);
        if (d8 == null) {
            object = new d((Object)((Boolean)this.a.getValue()));
        } else {
            object = d8;
            if (d8.getValue() == null) {
                object = d8;
                if (this.a.getValue() != null) {
                    object = d8.W(k.Y(), (Object)((Boolean)this.a.getValue()));
                }
            }
        }
        return new g((d)object);
    }

    public Object b(Object object, final d.c c8) {
        return this.a.k(object, new d.c(){

            public Object b(k k8, Boolean bl, Object object) {
                if (!bl.booleanValue()) {
                    return c8.a(k8, null, object);
                }
                return object;
            }
        });
    }

    public g c(k k8) {
        if (this.a.V(k8, b) != null) {
            return this;
        }
        return new g(this.a.X(k8, e));
    }

    public g d(k k8) {
        if (this.a.V(k8, b) == null) {
            if (this.a.V(k8, c) != null) {
                return this;
            }
            return new g(this.a.X(k8, d));
        }
        throw new IllegalArgumentException("Can't prune path that was kept previously!");
    }

    public boolean e() {
        return this.a.a(c);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof g)) {
            return false;
        }
        object = (g)object;
        if (!this.a.equals(object.a)) {
            return false;
        }
        return true;
    }

    public boolean f(k k8) {
        if ((k8 = (Boolean)this.a.S(k8)) != null && !k8.booleanValue()) {
            return true;
        }
        return false;
    }

    public boolean g(k k8) {
        if ((k8 = (Boolean)this.a.S(k8)) != null && k8.booleanValue()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{PruneForest:");
        stringBuilder.append(this.a.toString());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

}

