/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 *  java.util.Objects
 */
package L5;

import E5.d;
import L5.E;
import L5.a;
import L5.z;
import Q3.p;
import Q3.s;
import java.util.Map;
import java.util.Objects;

public class b
implements d.d {
    public final p a;
    public final z b;
    public s c;
    public Q3.a d;

    public b(p p8, z z8) {
        this.a = p8;
        this.b = z8;
    }

    @Override
    public void a(Object object) {
        this.b.run();
        object = this.c;
        if (object != null) {
            this.a.D((s)object);
            this.c = null;
        }
        if ((object = this.d) != null) {
            this.a.C((Q3.a)object);
            this.d = null;
        }
    }

    @Override
    public void b(Object object, d.b b8) {
        object = ((Map)object).get((Object)"eventType");
        Objects.requireNonNull((Object)object);
        object = (String)object;
        if ("value".equals(object)) {
            this.c = object = new E(b8);
            this.a.c((s)object);
            return;
        }
        this.d = object = new a(b8, (String)object);
        this.a.a((Q3.a)object);
    }
}

