// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E2;

import android.util.Base64;

public abstract class c
{
    public static String a(final byte[] array) {
        if (array == null) {
            return null;
        }
        return Base64.encodeToString(array, 11);
    }
}
