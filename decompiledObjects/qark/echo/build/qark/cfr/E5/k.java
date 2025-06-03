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
import E5.e;
import E5.j;
import E5.l;
import E5.q;
import java.nio.ByteBuffer;

public class k {
    public final E5.c a;
    public final String b;
    public final l c;
    public final c.c d;

    public k(E5.c c8, String string2) {
        this(c8, string2, q.b);
    }

    public k(E5.c c8, String string2, l l8) {
        this(c8, string2, l8, null);
    }

    public k(E5.c c8, String string2, l l8, c.c c9) {
        this.a = c8;
        this.b = string2;
        this.c = l8;
        this.d = c9;
    }

    public void c(String string2, Object object) {
        this.d(string2, object, null);
    }

    public void d(String object, Object object2, d d8) {
        E5.c c8 = this.a;
        String string2 = this.b;
        object2 = this.c.c(new j((String)object, object2));
        object = d8 == null ? null : new b(d8);
        c8.f(string2, (ByteBuffer)object2, (c.b)object);
    }

    public void e(c object) {
        Object object2 = this.d;
        E5.c c8 = null;
        E5.c c9 = null;
        if (object2 != null) {
            c8 = this.a;
            object2 = this.b;
            object = object == null ? c9 : new Object((c)object);
            c8.h((String)object2, (c.a)object, this.d);
            return;
        }
        c9 = this.a;
        object2 = this.b;
        object = object == null ? c8 : new Object((c)object);
        c9.c((String)object2, (c.a)object);
    }

    public final class a
    implements c.a {
        public final c a;

        public a(c c8) {
            this.a = c8;
        }

        @Override
        public void a(ByteBuffer object, final c.b b8) {
            object = k.this.c.e((ByteBuffer)object);
            try {
                this.a.onMethodCall((j)object, new d(){

                    @Override
                    public void a(Object object) {
                        b8.a(k.this.c.a(object));
                    }

                    @Override
                    public void b(String string2, String string3, Object object) {
                        b8.a(k.this.c.d(string2, string3, object));
                    }

                    @Override
                    public void c() {
                        b8.a(null);
                    }
                });
                return;
            }
            catch (RuntimeException runtimeException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("MethodChannel#");
                stringBuilder.append(k.this.b);
                t5.b.c(stringBuilder.toString(), "Failed to handle method call", (Throwable)runtimeException);
                b8.a(k.this.c.b("error", runtimeException.getMessage(), null, t5.b.d((Throwable)runtimeException)));
                return;
            }
        }

    }

    public final class b
    implements c.b {
        public final d a;

        public b(d d8) {
            this.a = d8;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void a(ByteBuffer byteBuffer) {
            RuntimeException runtimeException2;
            if (byteBuffer == null) {
                try {
                    this.a.c();
                    return;
                }
                catch (RuntimeException runtimeException2) {}
            } else {
                try {
                    this.a.a(k.this.c.f(byteBuffer));
                    return;
                }
                catch (e e8) {
                    this.a.b(e8.o, e8.getMessage(), e8.p);
                    return;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MethodChannel#");
            stringBuilder.append(k.this.b);
            t5.b.c(stringBuilder.toString(), "Failed to handle method call result", (Throwable)runtimeException2);
        }
    }

    public static interface c {
        public void onMethodCall(j var1, d var2);
    }

    public static interface d {
        public void a(Object var1);

        public void b(String var1, String var2, Object var3);

        public void c();
    }

}

