/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 */
package Q5;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public abstract class i {
    public static ArrayList a(Throwable throwable) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add((Object)throwable.toString());
        arrayList.add((Object)throwable.getClass().getSimpleName());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cause: ");
        stringBuilder.append((Object)throwable.getCause());
        stringBuilder.append(", Stacktrace: ");
        stringBuilder.append(Log.getStackTraceString((Throwable)throwable));
        arrayList.add((Object)stringBuilder.toString());
        return arrayList;
    }

    public static interface a {
        public String a();

        public String b();

        public String c();

        public List d();

        public String e();

        public List f(b var1);

        public String g();
    }

    public static final class b
    extends Enum {
        public static final /* synthetic */ b[] A;
        public static final /* enum */ b p = new b(0);
        public static final /* enum */ b q = new b(1);
        public static final /* enum */ b r = new b(2);
        public static final /* enum */ b s = new b(3);
        public static final /* enum */ b t = new b(4);
        public static final /* enum */ b u = new b(5);
        public static final /* enum */ b v = new b(6);
        public static final /* enum */ b w = new b(7);
        public static final /* enum */ b x = new b(8);
        public static final /* enum */ b y = new b(9);
        public static final /* enum */ b z = new b(10);
        public final int o;

        static {
            A = b.c();
        }

        public b(int n9) {
            this.o = n9;
        }

        public static /* synthetic */ b[] c() {
            return new b[]{p, q, r, s, t, u, v, w, x, y, z};
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])A.clone();
        }
    }

}

