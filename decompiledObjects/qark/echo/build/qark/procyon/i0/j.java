// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i0;

import java.io.IOException;

public abstract class j
{
    public static void a(final g g) {
        if (g == null) {
            return;
        }
        try {
            g.close();
        }
        catch (IOException ex) {}
    }
}
