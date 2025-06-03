/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ThreadFactory
 */
package F2;

import A2.n;
import F2.b;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class a
implements ThreadFactory {
    public final String a;
    public final ThreadFactory b = Executors.defaultThreadFactory();

    public a(String string2) {
        n.j(string2, "Name must not be null");
        this.a = string2;
    }

    public final Thread newThread(Runnable runnable) {
        runnable = this.b.newThread((Runnable)new b(runnable, 0));
        runnable.setName(this.a);
        return runnable;
    }
}

