/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.regex.Pattern
 */
package B0;

import A0.y;
import d0.q;
import d0.z;
import i0.k;
import java.util.regex.Pattern;

public abstract class g {
    public abstract k a(k var1);

    public static final abstract class a {
        public static final Pattern a = Pattern.compile((String)".*-.*");

        public static String b(y y8) {
            int n8;
            boolean bl = y8 != null;
            g0.a.a(bl);
            int n9 = n8 = z.k(y8.m().n);
            if (n8 == -1) {
                n9 = z.k(y8.m().m);
            }
            if (n9 == 1) {
                return "a";
            }
            if (n9 == 2) {
                return "v";
            }
            return null;
        }

        public abstract g a();

        public abstract a c(long var1);

        public abstract a d(String var1);

        public abstract a e(String var1);

        public abstract a f(String var1);
    }

}

