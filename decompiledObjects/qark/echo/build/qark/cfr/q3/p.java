/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.ThreadLocal
 *  java.security.SecureRandom
 */
package q3;

import java.security.SecureRandom;

public abstract class p {
    public static final ThreadLocal a = new ThreadLocal(){

        public SecureRandom a() {
            return p.b();
        }
    };

    public static SecureRandom b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] c(int n8) {
        byte[] arrby = new byte[n8];
        ((SecureRandom)a.get()).nextBytes(arrby);
        return arrby;
    }

}

