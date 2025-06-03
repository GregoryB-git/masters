// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package b3;

import java.util.concurrent.Future;

public abstract class g
{
    public static Object a(final Future future) {
        final boolean b = false;
        try {
            return future.get();
        }
        catch (InterruptedException ex) {
            goto Label_0034;
        }
        finally {
            if (b) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
