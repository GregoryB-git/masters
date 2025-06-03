// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E2;

import java.io.IOException;
import java.io.Closeable;

public abstract class k
{
    public static void a(final Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (IOException ex) {}
    }
}
