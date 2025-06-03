// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x2;

import java.util.concurrent.Callable;

public final class M extends O
{
    public final Callable f = f;
    
    @Override
    public final String a() {
        try {
            return this.f.call();
        }
        catch (Exception cause) {
            throw new RuntimeException(cause);
        }
    }
}
