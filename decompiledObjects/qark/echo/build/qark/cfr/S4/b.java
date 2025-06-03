/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package S4;

import kotlin.jvm.internal.Intrinsics;

public interface b {
    public a a();

    public void b(b var1);

    public boolean c();

    public static final class a
    extends Enum {
        public static final /* enum */ a o = new a();
        public static final /* enum */ a p = new a();
        public static final /* enum */ a q = new a();
        public static final /* synthetic */ a[] r;

        static {
            r = a.c();
        }

        public static final /* synthetic */ a[] c() {
            return new a[]{o, p, q};
        }

        public static a valueOf(String string2) {
            return (a)Enum.valueOf(a.class, (String)string2);
        }

        public static a[] values() {
            return (a[])r.clone();
        }
    }

    public static final class b {
        public final String a;

        public b(String string2) {
            Intrinsics.checkNotNullParameter(string2, "sessionId");
            this.a = string2;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof b)) {
                return false;
            }
            object = (b)object;
            if (!Intrinsics.a(this.a, object.a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SessionDetails(sessionId=");
            stringBuilder.append(this.a);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

}

