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
 *  java.util.concurrent.atomic.AtomicBoolean
 *  java.util.concurrent.atomic.AtomicReference
 */
package E5;

import E5.c;
import E5.j;
import E5.l;
import E5.q;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class d {
    public final E5.c a;
    public final String b;
    public final l c;
    public final c.c d;

    public d(E5.c c8, String string2) {
        this(c8, string2, q.b);
    }

    public d(E5.c c8, String string2, l l8) {
        this(c8, string2, l8, null);
    }

    public d(E5.c c8, String string2, l l8, c.c c9) {
        this.a = c8;
        this.b = string2;
        this.c = l8;
        this.d = c9;
    }

    public void d(d object) {
        Object object2 = this.d;
        E5.c c8 = null;
        E5.c c9 = null;
        if (object2 != null) {
            c8 = this.a;
            object2 = this.b;
            object = object == null ? c9 : new Object((d)object);
            c8.h((String)object2, (c.a)object, this.d);
            return;
        }
        c9 = this.a;
        object2 = this.b;
        object = object == null ? c8 : new Object((d)object);
        c9.c((String)object2, (c.a)object);
    }

    public static interface b {
        public void a(Object var1);

        public void b(String var1, String var2, Object var3);

        public void c();
    }

    public final class c
    implements c.a {
        public final d a;
        public final AtomicReference b;

        public c(d d9) {
            this.b = new AtomicReference((Object)null);
            this.a = d9;
        }

        @Override
        public void a(ByteBuffer object, c.b b8) {
            object = d.this.c.e((ByteBuffer)object);
            if (object.a.equals((Object)"listen")) {
                this.d(object.b, b8);
                return;
            }
            if (object.a.equals((Object)"cancel")) {
                this.c(object.b, b8);
                return;
            }
            b8.a(null);
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public final void c(Object var1_1, c.b var2_3) {
            if ((b)this.b.getAndSet((Object)null) == null) ** GOTO lbl13
            try {
                this.a.a(var1_1);
                var2_3.a(d.a(d.this).a(null));
                return;
            }
            catch (RuntimeException var1_2) {
                block2 : {
                    var3_4 = new StringBuilder();
                    var3_4.append("EventChannel#");
                    var3_4.append(d.b(d.this));
                    t5.b.c(var3_4.toString(), "Failed to close event stream", (Throwable)var1_2);
                    var1_1 = d.a(d.this).d("error", var1_2.getMessage(), null);
                    break block2;
lbl13: // 1 sources:
                    var1_1 = d.a(d.this).d("error", "No active stream to cancel", null);
                }
                var2_3.a((ByteBuffer)var1_1);
                return;
            }
        }

        public final void d(Object object, c.b b8) {
            a a8 = new a(null);
            if ((b)this.b.getAndSet((Object)a8) != null) {
                try {
                    this.a.a(null);
                }
                catch (RuntimeException runtimeException) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("EventChannel#");
                    stringBuilder.append(d.this.b);
                    t5.b.c(stringBuilder.toString(), "Failed to close existing event stream", (Throwable)runtimeException);
                }
            }
            try {
                this.a.b(object, a8);
                b8.a(d.this.c.a(null));
                return;
            }
            catch (RuntimeException runtimeException) {
                this.b.set((Object)null);
                a8 = new StringBuilder();
                a8.append("EventChannel#");
                a8.append(d.this.b);
                t5.b.c(a8.toString(), "Failed to open event stream", (Throwable)runtimeException);
                b8.a(d.this.c.d("error", runtimeException.getMessage(), null));
                return;
            }
        }

        public final class a
        implements b {
            public final AtomicBoolean a;

            public a() {
                this.a = new AtomicBoolean(false);
            }

            public /* synthetic */ a( a8) {
                this();
            }

            @Override
            public void a(Object object) {
                if (!this.a.get()) {
                    if (c.this.b.get() != this) {
                        return;
                    }
                    d.this.a.d(d.this.b, d.this.c.a(object));
                }
            }

            @Override
            public void b(String string2, String string3, Object object) {
                if (!this.a.get()) {
                    if (c.this.b.get() != this) {
                        return;
                    }
                    d.this.a.d(d.this.b, d.this.c.d(string2, string3, object));
                }
            }

            @Override
            public void c() {
                if (!this.a.getAndSet(true)) {
                    if (c.this.b.get() != this) {
                        return;
                    }
                    d.this.a.d(d.this.b, null);
                }
            }
        }

    }

    public static interface d {
        public void a(Object var1);

        public void b(Object var1, b var2);
    }

}

