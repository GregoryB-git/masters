/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package V5;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public abstract class n
implements Serializable {
    public static final a o = new a(null);

    public static Object a(Object object) {
        return object;
    }

    public static final Throwable b(Object object) {
        if (object instanceof b) {
            return ((b)object).o;
        }
        return null;
    }

    public static final boolean c(Object object) {
        return object instanceof b;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

    public static final class b
    implements Serializable {
        public final Throwable o;

        public b(Throwable throwable) {
            Intrinsics.checkNotNullParameter((Object)throwable, "exception");
            this.o = throwable;
        }

        public boolean equals(Object object) {
            if (object instanceof b && Intrinsics.a((Object)this.o, (Object)((b)object).o)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.o.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failure(");
            stringBuilder.append((Object)this.o);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

}

