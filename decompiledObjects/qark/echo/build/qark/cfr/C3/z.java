/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.Executor
 */
package C3;

import C3.A;
import java.util.concurrent.Executor;

public abstract class z {
    public static Executor a() {
        return a.o;
    }

    public static Executor b(Executor executor) {
        return new A(executor);
    }

    public static final class a
    extends Enum
    implements Executor {
        public static final /* enum */ a o;
        public static final /* synthetic */ a[] p;

        static {
            a a8;
            o = a8 = new a();
            p = new a[]{a8};
        }

        public static a valueOf(String string2) {
            return (a)Enum.valueOf(a.class, (String)string2);
        }

        public static a[] values() {
            return (a[])p.clone();
        }

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

}

