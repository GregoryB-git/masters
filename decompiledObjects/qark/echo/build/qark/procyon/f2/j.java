// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f2;

import java.util.concurrent.Executors;
import java.util.concurrent.Executor;

public abstract class j
{
    public static Executor a() {
        return new n(Executors.newSingleThreadExecutor());
    }
}
