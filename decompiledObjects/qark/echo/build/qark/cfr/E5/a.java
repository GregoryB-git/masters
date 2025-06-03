/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 */
package E5;

import E5.c;
import E5.i;
import java.nio.ByteBuffer;

public final class a {
    public final E5.c a;
    public final String b;
    public final i c;
    public final c.c d;

    public a(E5.c c8, String string2, i i8) {
        this(c8, string2, i8, null);
    }

    public a(E5.c c8, String string2, i i8, c.c c9) {
        this.a = c8;
        this.b = string2;
        this.c = i8;
        this.d = c9;
    }

    public void c(Object object) {
        this.d(object, null);
    }

    public void d(Object object, e e8) {
        E5.c c8 = this.a;
        String string2 = this.b;
        ByteBuffer byteBuffer = this.c.a(object);
        object = null;
        if (e8 != null) {
            object = new c(e8, null);
        }
        c8.f(string2, byteBuffer, (c.b)object);
    }

    public void e(d object) {
        Object object2 = this.d;
        E5.c c8 = null;
        E5.c c9 = null;
        if (object2 != null) {
            c8 = this.a;
            object2 = this.b;
            object = object == null ? c9 : new Object((d)object, null);
            c8.h((String)object2, (c.a)object, this.d);
            return;
        }
        c9 = this.a;
        object2 = this.b;
        object = object == null ? c8 : new Object((d)object, null);
        c9.c((String)object2, (c.a)object);
    }

    public final class b
    implements c.a {
        public final d a;

        public b(d d8) {
            this.a = d8;
        }

        public /* synthetic */ b(d d8, E5.a$a a9) {
            this(d8);
        }

        @Override
        public void a(ByteBuffer byteBuffer, final c.b b8) {
            try {
                this.a.a(a.this.c.b(byteBuffer), new e(){

                    @Override
                    public void a(Object object) {
                        b8.a(a.this.c.a(object));
                    }
                });
                return;
            }
            catch (RuntimeException runtimeException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("BasicMessageChannel#");
                stringBuilder.append(a.this.b);
                t5.b.c(stringBuilder.toString(), "Failed to handle message", (Throwable)runtimeException);
                b8.a(null);
                return;
            }
        }

    }

    public final class c
    implements c.b {
        public final e a;

        public c(e e8) {
            this.a = e8;
        }

        public /* synthetic */ c(e e8,  a9) {
            this(e8);
        }

        @Override
        public void a(ByteBuffer byteBuffer) {
            try {
                this.a.a(a.this.c.b(byteBuffer));
                return;
            }
            catch (RuntimeException runtimeException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("BasicMessageChannel#");
                stringBuilder.append(a.this.b);
                t5.b.c(stringBuilder.toString(), "Failed to handle message reply", (Throwable)runtimeException);
                return;
            }
        }
    }

    public static interface d {
        public void a(Object var1, e var2);
    }

    public static interface e {
        public void a(Object var1);
    }

}

