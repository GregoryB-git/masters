/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.Objects
 */
package K0;

import F0.B;
import F0.e;
import F0.f;
import F0.s;
import F0.y;
import K0.a;
import java.util.Objects;

public final class b
extends e {
    public b(B b8, int n8, long l8, long l9) {
        Objects.requireNonNull((Object)b8);
        super(new a(b8), new b(b8, n8, null), b8.f(), 0L, b8.j, l8, l9, b8.d(), Math.max((int)6, (int)b8.c));
    }

    public static final class b
    implements e.f {
        public final B a;
        public final int b;
        public final y.a c;

        public b(B b8, int n8) {
            this.a = b8;
            this.b = n8;
            this.c = new y.a();
        }

        public /* synthetic */ b(B b8, int n8,  a8) {
            this(b8, n8);
        }

        @Override
        public e.e a(s s8, long l8) {
            long l9 = s8.p();
            long l10 = this.c(s8);
            long l11 = s8.m();
            s8.o(Math.max((int)6, (int)this.a.c));
            long l12 = this.c(s8);
            long l13 = s8.m();
            if (l10 <= l8 && l12 > l8) {
                return e.e.e(l11);
            }
            if (l12 <= l8) {
                return e.e.f(l12, l13);
            }
            return e.e.d(l10, l9);
        }

        @Override
        public /* synthetic */ void b() {
            f.a(this);
        }

        public final long c(s s8) {
            while (s8.m() < s8.a() - 6L && !y.h(s8, this.a, this.b, this.c)) {
                s8.o(1);
            }
            if (s8.m() >= s8.a() - 6L) {
                s8.o((int)(s8.a() - s8.m()));
                return this.a.j;
            }
            return this.c.a;
        }
    }

}

