/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.concurrent.Executor
 *  java.util.concurrent.Executors
 */
package f2;

import f2.n;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public abstract class j {
    public static Executor a() {
        return new n((Executor)Executors.newSingleThreadExecutor());
    }
}

