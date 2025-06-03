// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c3;

import java.util.Iterator;
import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class s
{
    public static final CopyOnWriteArrayList a;
    
    static {
        a = new CopyOnWriteArrayList();
    }
    
    public static r a(final String str) {
        for (final r r : s.a) {
            if (r.b(str)) {
                return r;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("No KMS client does support: ");
        sb.append(str);
        throw new GeneralSecurityException(sb.toString());
    }
}
