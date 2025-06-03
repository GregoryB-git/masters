/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.atomic.AtomicInteger
 *  kotlinx.coroutines.ThreadPoolDispatcherKt
 */
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.ThreadPoolDispatcherKt;

public final class r4
implements ThreadFactory {
    public final int a;
    public final String b;
    public final AtomicInteger c;

    public /* synthetic */ r4(int n3, String string2, AtomicInteger atomicInteger) {
        this.a = n3;
        this.b = string2;
        this.c = atomicInteger;
    }

    public final Thread newThread(Runnable runnable) {
        return ThreadPoolDispatcherKt.a((int)this.a, (String)this.b, (AtomicInteger)this.c, (Runnable)runnable);
    }
}

