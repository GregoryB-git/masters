/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package r6;

import kotlin.jvm.internal.Intrinsics;

public abstract class g {
    public static final b a = new b(null);
    public static final c b = new c();

    public static Object b(Object object) {
        return object;
    }

    public static final Throwable c(Object object) {
        boolean bl = object instanceof a;
        Throwable throwable = null;
        object = bl ? (a)object : null;
        if (object != null) {
            throwable = object.a;
        }
        return throwable;
    }

    public static final Object d(Object object) {
        if (!(object instanceof c)) {
            return object;
        }
        return null;
    }

    public static final boolean e(Object object) {
        return object instanceof a;
    }

    public static final boolean f(Object object) {
        return object instanceof c ^ true;
    }

    public static final class a
    extends c {
        public final Throwable a;

        public a(Throwable throwable) {
            this.a = throwable;
        }

        public boolean equals(Object object) {
            if (object instanceof a && Intrinsics.a((Object)this.a, (Object)((a)object).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            Throwable throwable = this.a;
            if (throwable != null) {
                return throwable.hashCode();
            }
            return 0;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Closed(");
            stringBuilder.append((Object)this.a);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g g8) {
            this();
        }

        public final Object a(Throwable throwable) {
            return g.b(new a(throwable));
        }

        public final Object b() {
            return g.b(b);
        }

        public final Object c(Object object) {
            return g.b(object);
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

}

