/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.List
 */
package A2;

import A2.S;
import A2.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class m {
    public static boolean a(Object object, Object object2) {
        boolean bl = true;
        if (object != object2) {
            if (object != null) {
                if (object.equals(object2)) {
                    return true;
                }
                return false;
            }
            bl = false;
        }
        return bl;
    }

    public static /* varargs */ int b(Object ... arrobject) {
        return Arrays.hashCode((Object[])arrobject);
    }

    public static a c(Object object) {
        return new a(object, null);
    }

    public static final class a {
        public final List a;
        public final Object b;

        public /* synthetic */ a(Object object, S s8) {
            n.i(object);
            this.b = object;
            this.a = new ArrayList();
        }

        public a a(String string2, Object object) {
            List list = this.a;
            n.i(string2);
            object = String.valueOf((Object)object);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("=");
            stringBuilder.append((String)object);
            list.add((Object)stringBuilder.toString());
            return this;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(100);
            stringBuilder.append(this.b.getClass().getSimpleName());
            stringBuilder.append('{');
            int n8 = this.a.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                stringBuilder.append((String)this.a.get(i8));
                if (i8 >= n8 - 1) continue;
                stringBuilder.append(", ");
            }
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

}

