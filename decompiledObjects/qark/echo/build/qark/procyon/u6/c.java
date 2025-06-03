// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u6;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.lang.reflect.Method;

public abstract class c
{
    public static final Method a;
    
    static {
    Label_0021_Outer:
        while (true) {
            while (true) {
                try {
                    Method method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
                    while (true) {
                        a = method;
                        return;
                        method = null;
                        continue Label_0021_Outer;
                    }
                }
                finally {}
                continue;
            }
        }
    }
    
    public static final boolean a(final Executor executor) {
        Block_0: {
            break Block_0;
        Label_0048:
            while (true) {
                Throwable obj;
                do {
                    Label_0015: {
                        break Label_0015;
                        try {
                            if (executor instanceof ScheduledThreadPoolExecutor) {
                                final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor)executor;
                                continue Label_0048;
                            }
                            break Label_0015;
                            final Method a = c.a;
                            // iftrue(Label_0025:, a != null)
                            Label_0025: {
                                a.invoke(obj, Boolean.TRUE);
                            }
                            return true;
                        }
                        finally {
                            return false;
                        }
                    }
                    obj = null;
                    continue Label_0048;
                } while (obj != null);
                break;
            }
        }
        return false;
    }
}
