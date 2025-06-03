/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 */
package j6;

import b6.b;
import java.io.Serializable;
import kotlin.jvm.internal.g;

public abstract class c {
    public static final a o = new a(null);
    public static final c p = b.a.b();

    public abstract int b(int var1);

    public int c() {
        return this.b(32);
    }

    public static final class j6.c$a
    extends c
    implements Serializable {
        public j6.c$a() {
        }

        public /* synthetic */ j6.c$a(g g8) {
            this();
        }

        private final Object writeReplace() {
            return a.o;
        }

        @Override
        public int b(int n8) {
            return p.b(n8);
        }

        @Override
        public int c() {
            return p.c();
        }

        public static final class a
        implements Serializable {
            public static final a o = new a();
            private static final long serialVersionUID = 0L;

            private final Object readResolve() {
                return c.o;
            }
        }

    }

}

