/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.security.GeneralSecurityException
 */
package c3;

import java.security.GeneralSecurityException;

public final class y {
    public static final y a = new y();

    public static y a() {
        return a;
    }

    public static y b(y y8) {
        if (y8 != null) {
            return y8;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}

