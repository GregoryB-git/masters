/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.concurrent.ThreadFactory
 */
package g0;

import g0.M;
import java.util.concurrent.ThreadFactory;

public final class L
implements ThreadFactory {
    public final /* synthetic */ String a;

    public /* synthetic */ L(String string2) {
        this.a = string2;
    }

    public final Thread newThread(Runnable runnable) {
        return M.a(this.a, runnable);
    }
}

