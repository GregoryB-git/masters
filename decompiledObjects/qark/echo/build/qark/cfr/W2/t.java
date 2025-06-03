/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.Void
 */
package W2;

import W2.j;
import W2.k;
import W2.m;
import W2.s;
import W2.u;
import java.io.Serializable;

public abstract class t {
    public static s a(s s8) {
        if (!(s8 instanceof b)) {
            if (s8 instanceof a) {
                return s8;
            }
            if (s8 instanceof Serializable) {
                return new a(s8);
            }
            return new b(s8);
        }
        return s8;
    }

    public static s b(Object object) {
        return new c(object);
    }

    public static class a
    implements s,
    Serializable {
        private static final long serialVersionUID = 0L;
        public final s o;
        public volatile transient boolean p;
        public transient Object q;

        public a(s s8) {
            this.o = (s)m.j(s8);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public Object get() {
            if (this.p) return j.a(this.q);
            synchronized (this) {
                try {
                    Object object;
                    if (this.p) return j.a(this.q);
                    this.q = object = this.o.get();
                    this.p = true;
                    return object;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        public String toString() {
            Object object;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Suppliers.memoize(");
            if (this.p) {
                object = new StringBuilder();
                object.append("<supplier that returned ");
                object.append(this.q);
                object.append(">");
                object = object.toString();
            } else {
                object = this.o;
            }
            stringBuilder.append(object);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    public static class b
    implements s {
        public static final s q = new u();
        public volatile s o;
        public Object p;

        public b(s s8) {
            this.o = (s)m.j(s8);
        }

        public static /* synthetic */ Void a() {
            return b.b();
        }

        public static /* synthetic */ Void b() {
            throw new IllegalStateException();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public Object get() {
            Object object = this.o;
            s s8 = q;
            if (object == s8) return j.a(this.p);
            synchronized (this) {
                try {
                    if (this.o == s8) return j.a(this.p);
                    this.p = object = this.o.get();
                    this.o = s8;
                    return object;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        public String toString() {
            s s8 = this.o;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Suppliers.memoize(");
            Object object = s8;
            if (s8 == q) {
                object = new StringBuilder();
                object.append("<supplier that returned ");
                object.append(this.p);
                object.append(">");
                object = object.toString();
            }
            stringBuilder.append(object);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    public static class c
    implements s,
    Serializable {
        private static final long serialVersionUID = 0L;
        public final Object o;

        public c(Object object) {
            this.o = object;
        }

        public boolean equals(Object object) {
            if (object instanceof c) {
                object = (c)object;
                return k.a(this.o, object.o);
            }
            return false;
        }

        @Override
        public Object get() {
            return this.o;
        }

        public int hashCode() {
            return k.b(this.o);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Suppliers.ofInstance(");
            stringBuilder.append(this.o);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

}

