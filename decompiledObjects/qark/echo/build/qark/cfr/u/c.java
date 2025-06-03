/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.concurrent.Executor
 *  java.util.concurrent.TimeUnit
 */
package u;

import b3.e;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public abstract class c {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static e a(c object) {
        d d8;
        a a8 = new a();
        a8.b = d8 = new d(a8);
        a8.a = object.getClass();
        object = object.a(a8);
        if (object == null) return d8;
        try {
            a8.a = object;
            return d8;
        }
        catch (Exception exception) {
            d8.d((Throwable)exception);
        }
        return d8;
    }

    public static final class a {
        public Object a;
        public d b;
        public u.d c = u.d.G();
        public boolean d;

        public void a() {
            this.a = null;
            this.b = null;
            this.c.z(null);
        }

        public boolean b(Object object) {
            boolean bl = true;
            this.d = true;
            d d8 = this.b;
            if (d8 == null || !d8.b(object)) {
                bl = false;
            }
            if (bl) {
                this.d();
            }
            return bl;
        }

        public boolean c() {
            boolean bl = true;
            this.d = true;
            d d8 = this.b;
            if (d8 == null || !d8.a(true)) {
                bl = false;
            }
            if (bl) {
                this.d();
            }
            return bl;
        }

        public final void d() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        public boolean e(Throwable throwable) {
            boolean bl = true;
            this.d = true;
            d d8 = this.b;
            if (d8 == null || !d8.d(throwable)) {
                bl = false;
            }
            if (bl) {
                this.d();
            }
            return bl;
        }

        public void finalize() {
            d d8 = this.b;
            if (d8 != null && !d8.isDone()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
                stringBuilder.append(this.a);
                d8.d(new b(stringBuilder.toString()));
            }
            if (!this.d && (d8 = this.c) != null) {
                d8.z(null);
            }
        }
    }

    public static final class b
    extends Throwable {
        public b(String string2) {
            super(string2);
        }

        /*
         * Enabled aggressive block sorting
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public Throwable fillInStackTrace() {
            // MONITORENTER : this
            // MONITOREXIT : this
            return this;
        }
    }

    public static interface c {
        public Object a(a var1);
    }

    public static final class d
    implements e {
        public final WeakReference o;
        public final u.a p;

        public d(a a8) {
            this.p = new u.a(){

                @Override
                public String u() {
                    a a8 = (a)d.this.o.get();
                    if (a8 == null) {
                        return "Completer object has been garbage collected, future will fail soon";
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("tag=[");
                    stringBuilder.append(a8.a);
                    stringBuilder.append("]");
                    return stringBuilder.toString();
                }
            };
            this.o = new WeakReference((Object)a8);
        }

        public boolean a(boolean bl) {
            return this.p.cancel(bl);
        }

        public boolean b(Object object) {
            return this.p.z(object);
        }

        @Override
        public void c(Runnable runnable, Executor executor) {
            this.p.c(runnable, executor);
        }

        public boolean cancel(boolean bl) {
            a a8 = (a)this.o.get();
            if ((bl = this.p.cancel(bl)) && a8 != null) {
                a8.a();
            }
            return bl;
        }

        public boolean d(Throwable throwable) {
            return this.p.C(throwable);
        }

        public Object get() {
            return this.p.get();
        }

        public Object get(long l8, TimeUnit timeUnit) {
            return this.p.get(l8, timeUnit);
        }

        public boolean isCancelled() {
            return this.p.isCancelled();
        }

        public boolean isDone() {
            return this.p.isDone();
        }

        public String toString() {
            return this.p.toString();
        }

    }

}

