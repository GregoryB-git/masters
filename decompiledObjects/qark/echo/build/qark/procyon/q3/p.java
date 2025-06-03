// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q3;

import java.security.SecureRandom;

public abstract class p
{
    public static final ThreadLocal a;
    
    static {
        a = new ThreadLocal() {
            public SecureRandom a() {
                return b();
            }
        };
    }
    
    public static SecureRandom b() {
        final SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
    
    public static byte[] c(final int n) {
        final byte[] bytes = new byte[n];
        p.a.get().nextBytes(bytes);
        return bytes;
    }
}
