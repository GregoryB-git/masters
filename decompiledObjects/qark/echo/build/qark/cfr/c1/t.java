/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package c1;

import c1.k;
import d0.q;
import g0.g;

public interface t {
    public k a(byte[] var1, int var2, int var3);

    public void b();

    public void c(byte[] var1, int var2, int var3, b var4, g var5);

    public int d();

    public static interface a {
        public static final a a = new a(){

            @Override
            public boolean a(q q8) {
                return false;
            }

            @Override
            public t b(q q8) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }

            @Override
            public int c(q q8) {
                return 1;
            }
        };

        public boolean a(q var1);

        public t b(q var1);

        public int c(q var1);

    }

    public static class b {
        public static final b c = new b(-9223372036854775807L, false);
        public final long a;
        public final boolean b;

        public b(long l8, boolean bl) {
            this.a = l8;
            this.b = bl;
        }

        public static /* synthetic */ b a() {
            return c;
        }

        public static b b() {
            return c;
        }

        public static b c(long l8) {
            return new b(l8, true);
        }
    }

}

