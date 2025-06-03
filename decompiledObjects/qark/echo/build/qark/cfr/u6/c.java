/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ScheduledThreadPoolExecutor
 */
package u6;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public abstract class c {
    public static final Method a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Method method;
        block2 : {
            try {
                method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE});
                break block2;
            }
            catch (Throwable throwable) {}
            method = null;
        }
        a = method;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean a(Executor executor) {
        Method method;
        block3 : {
            try {
                if (!(executor instanceof ScheduledThreadPoolExecutor)) return false;
                executor = (ScheduledThreadPoolExecutor)executor;
                if (executor == null) return false;
                method = a;
                if (method != null) break block3;
                return false;
            }
            catch (Throwable throwable) {
                return false;
            }
        }
        method.invoke((Object)executor, new Object[]{Boolean.TRUE});
        return true;
    }
}

