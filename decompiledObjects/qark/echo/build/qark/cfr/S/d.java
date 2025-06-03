/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package S;

import W5.C;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public abstract class d {
    public abstract Map a();

    public abstract Object b(a var1);

    public final S.a c() {
        return new S.a(C.o(this.a()), false);
    }

    public final d d() {
        return new S.a(C.o(this.a()), true);
    }

    public static final class a {
        public final String a;

        public a(String string2) {
            Intrinsics.checkNotNullParameter(string2, "name");
            this.a = string2;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object object) {
            if (object instanceof a) {
                return Intrinsics.a(this.a, ((a)object).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return this.a;
        }
    }

    public static final abstract class b {
    }

}

