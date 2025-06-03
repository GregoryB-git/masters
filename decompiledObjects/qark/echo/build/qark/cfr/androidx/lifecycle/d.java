/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.atomic.AtomicReference
 */
package androidx.lifecycle;

import androidx.lifecycle.g;
import java.util.concurrent.atomic.AtomicReference;

public abstract class d {
    public AtomicReference a = new AtomicReference();

    public abstract void a(g var1);

    public abstract c b();

    public abstract void c(g var1);

    public static final class b
    extends Enum {
        private static final /* synthetic */ b[] $VALUES;
        public static final /* enum */ b ON_ANY;
        public static final /* enum */ b ON_CREATE;
        public static final /* enum */ b ON_DESTROY;
        public static final /* enum */ b ON_PAUSE;
        public static final /* enum */ b ON_RESUME;
        public static final /* enum */ b ON_START;
        public static final /* enum */ b ON_STOP;

        static {
            b b8;
            b b9;
            b b10;
            b b11;
            b b12;
            b b13;
            b b14;
            ON_CREATE = b10 = new b();
            ON_START = b12 = new b();
            ON_RESUME = b13 = new b();
            ON_PAUSE = b9 = new b();
            ON_STOP = b8 = new b();
            ON_DESTROY = b14 = new b();
            ON_ANY = b11 = new b();
            $VALUES = new b[]{b10, b12, b13, b9, b8, b14, b11};
        }

        public static b c(c c8) {
            int n8 = .a[c8.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        return null;
                    }
                    return ON_PAUSE;
                }
                return ON_STOP;
            }
            return ON_DESTROY;
        }

        public static b h(c c8) {
            int n8 = .a[c8.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 5) {
                        return null;
                    }
                    return ON_CREATE;
                }
                return ON_RESUME;
            }
            return ON_START;
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])$VALUES.clone();
        }

        public c e() {
            switch (.b[this.ordinal()]) {
                default: {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((Object)this);
                    stringBuilder.append(" has no target state");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                case 6: {
                    return c.o;
                }
                case 5: {
                    return c.s;
                }
                case 3: 
                case 4: {
                    return c.r;
                }
                case 1: 
                case 2: 
            }
            return c.q;
        }
    }

    public static final class c
    extends Enum {
        public static final /* enum */ c o;
        public static final /* enum */ c p;
        public static final /* enum */ c q;
        public static final /* enum */ c r;
        public static final /* enum */ c s;
        public static final /* synthetic */ c[] t;

        static {
            c c8;
            c c9;
            c c10;
            c c11;
            c c12;
            o = c12 = new c();
            p = c10 = new c();
            q = c11 = new c();
            r = c9 = new c();
            s = c8 = new c();
            t = new c[]{c12, c10, c11, c9, c8};
        }

        public static c valueOf(String string2) {
            return (c)Enum.valueOf(c.class, (String)string2);
        }

        public static c[] values() {
            return (c[])t.clone();
        }

        public boolean c(c c8) {
            if (this.compareTo((Enum)c8) >= 0) {
                return true;
            }
            return false;
        }
    }

}

