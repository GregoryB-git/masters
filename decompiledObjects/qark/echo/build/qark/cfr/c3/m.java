/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.GeneralSecurityException
 */
package c3;

import c3.l;
import c3.x;
import java.security.GeneralSecurityException;

public abstract class m {
    public static l a(String string2) {
        l l8 = (l)x.i().get((Object)string2);
        if (l8 != null) {
            return l8;
        }
        l8 = new StringBuilder();
        l8.append("cannot find key template: ");
        l8.append(string2);
        throw new GeneralSecurityException(l8.toString());
    }
}

