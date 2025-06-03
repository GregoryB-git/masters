/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package X5;

import X5.g;
import X5.h;
import g6.p;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.t;

public final class c
implements g,
Serializable {
    public final g o;
    public final g.b p;

    public c(g g8, g.b b8) {
        Intrinsics.checkNotNullParameter(g8, "left");
        Intrinsics.checkNotNullParameter(b8, "element");
        this.o = g8;
        this.p = b8;
    }

    private final Object writeReplace() {
        int n8 = this.g();
        final g[] arrg = new g[n8];
        final t t8 = new t();
        this.u(V5.t.a, new p(){

            public final void a(V5.t arrg2, g.b b8) {
                Intrinsics.checkNotNullParameter(arrg2, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(b8, "element");
                arrg2 = arrg;
                t t82 = t8;
                int n8 = t82.o;
                t82.o = n8 + 1;
                arrg2[n8] = b8;
            }
        });
        if (t8.o == n8) {
            return new a(arrg);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override
    public g.b b(g.c c8) {
        Intrinsics.checkNotNullParameter(c8, "key");
        g g8 = this;
        do {
            g.b b8;
            if ((b8 = g8.p.b(c8)) == null) continue;
            return b8;
        } while ((g8 = g8.o) instanceof c);
        return g8.b(c8);
    }

    public final boolean d(g.b b8) {
        return Intrinsics.a(this.b(b8.getKey()), b8);
    }

    public boolean equals(Object object) {
        if (!(this == object || object instanceof c && (object = (c)object).g() == this.g() && object.f(this))) {
            return false;
        }
        return true;
    }

    public final boolean f(c g8) {
        do {
            if (this.d(g8.p)) continue;
            return false;
        } while ((g8 = g8.o) instanceof c);
        Intrinsics.c(g8, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
        return this.d((g.b)g8);
    }

    public final int g() {
        int n8 = 2;
        g g8 = this;
        do {
            if (!((g8 = g8.o) instanceof c)) {
                g8 = null;
            }
            if (g8 == null) {
                return n8;
            }
            ++n8;
        } while (true);
    }

    public int hashCode() {
        return this.o.hashCode() + this.p.hashCode();
    }

    @Override
    public g k(g g8) {
        return g.a.a(this, g8);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        stringBuilder.append((String)this.u("", .o));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    @Override
    public Object u(Object object, p p8) {
        Intrinsics.checkNotNullParameter(p8, "operation");
        return p8.invoke(this.o.u(object, p8), this.p);
    }

    @Override
    public g x(g.c object) {
        Intrinsics.checkNotNullParameter(object, "key");
        if (this.p.b((g.c)object) != null) {
            return this.o;
        }
        if ((object = this.o.x((g.c)object)) == this.o) {
            return this;
        }
        if (object == h.o) {
            return this.p;
        }
        return new c((g)object, this.p);
    }

    public static final class X5.c$a
    implements Serializable {
        public static final a p = new a(null);
        private static final long serialVersionUID = 0L;
        public final g[] o;

        public X5.c$a(g[] arrg) {
            Intrinsics.checkNotNullParameter(arrg, "elements");
            this.o = arrg;
        }

        private final Object readResolve() {
            g[] arrg = this.o;
            g g8 = h.o;
            int n8 = arrg.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                g8 = g8.k(arrg[i8]);
            }
            return g8;
        }

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g g8) {
                this();
            }
        }

    }

}

