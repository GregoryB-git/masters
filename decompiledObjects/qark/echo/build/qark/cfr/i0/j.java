/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 */
package i0;

import i0.g;
import java.io.IOException;

public abstract class j {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(g g8) {
        if (g8 == null) return;
        try {
            g8.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }
}

