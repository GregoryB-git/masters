/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.Executor
 */
package C3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class B
extends Enum
implements Executor {
    public static final /* enum */ B o;
    public static final Handler p;
    public static final /* synthetic */ B[] q;

    static {
        B b8;
        o = b8 = new B();
        q = new B[]{b8};
        p = new Handler(Looper.getMainLooper());
    }

    public static B valueOf(String string2) {
        return (B)Enum.valueOf(B.class, (String)string2);
    }

    public static B[] values() {
        return (B[])q.clone();
    }

    public void execute(Runnable runnable) {
        p.post(runnable);
    }
}

