/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package Q3;

import V3.C;
import V3.k;
import V3.t;
import Y3.n;
import Z3.a;
import d4.b;
import d4.o;

public class m {
    public final t a;
    public final k b;

    public m(t t8, k k8) {
        this.a = t8;
        this.b = k8;
        C.g(k8, this.c());
    }

    public m(d4.n n8) {
        this(new t(n8), new k(""));
    }

    public String a() {
        if (this.b.X() != null) {
            return this.b.X().e();
        }
        return null;
    }

    public d4.n b() {
        return this.a.a(this.b);
    }

    public Object c() {
        return this.b().getValue();
    }

    public void d(Object object) {
        C.g(this.b, object);
        object = a.b(object);
        n.k(object);
        this.a.c(this.b, o.a(object));
    }

    public boolean equals(Object object) {
        if (object instanceof m) {
            t t8 = this.a;
            object = (m)object;
            if (t8.equals((Object)object.a) && this.b.equals(object.b)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        Object object = this.b.Z();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MutableData { key = ");
        object = object != null ? object.e() : "<none>";
        stringBuilder.append((String)object);
        stringBuilder.append(", value = ");
        stringBuilder.append(this.a.b().L(true));
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}

