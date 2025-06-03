/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.List
 */
package V3;

import V3.k;
import V3.x;
import d4.n;
import java.util.ArrayList;
import java.util.List;

public abstract class E {
    public abstract E a(d4.b var1);

    public abstract n b();

    public static class a
    extends E {
        public final x a;
        public final k b;

        public a(x x8, k k8) {
            this.a = x8;
            this.b = k8;
        }

        @Override
        public E a(d4.b object) {
            object = this.b.U((d4.b)object);
            return new a(this.a, (k)object);
        }

        @Override
        public n b() {
            return this.a.J(this.b, (List)new ArrayList());
        }
    }

    public static class b
    extends E {
        public final n a;

        public b(n n8) {
            this.a = n8;
        }

        @Override
        public E a(d4.b b8) {
            return new b(this.a.v(b8));
        }

        @Override
        public n b() {
            return this.a;
        }
    }

}

