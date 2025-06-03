// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c3;

import java.security.GeneralSecurityException;

public abstract class m
{
    public static l a(final String str) {
        final l l = x.i().get(str);
        if (l != null) {
            return l;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("cannot find key template: ");
        sb.append(str);
        throw new GeneralSecurityException(sb.toString());
    }
}
