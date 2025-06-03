/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  java.lang.Object
 *  java.lang.String
 */
package E2;

import android.util.Base64;

public abstract class c {
    public static String a(byte[] arrby) {
        if (arrby == null) {
            return null;
        }
        return Base64.encodeToString((byte[])arrby, (int)11);
    }
}

