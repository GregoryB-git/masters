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
package b3;

import java.util.concurrent.Executor;

public final class a
extends Enum
implements Executor {
    public static final /* enum */ a o = new a();
    public static final /* synthetic */ a[] p;

    static {
        p = a.c();
    }

    public static /* synthetic */ a[] c() {
        return new a[]{o};
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

    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}

