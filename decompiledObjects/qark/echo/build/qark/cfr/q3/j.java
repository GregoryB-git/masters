/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.security.KeyFactory
 *  java.security.KeyPairGenerator
 *  java.security.MessageDigest
 *  java.security.Provider
 *  java.security.Signature
 *  javax.crypto.Cipher
 *  javax.crypto.KeyAgreement
 *  javax.crypto.Mac
 */
package q3;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

public interface j {
    public Object a(String var1, Provider var2);

    public static class a
    implements j {
        public Cipher b(String string2, Provider provider) {
            if (provider == null) {
                return Cipher.getInstance((String)string2);
            }
            return Cipher.getInstance((String)string2, (Provider)provider);
        }
    }

    public static class b
    implements j {
        public KeyAgreement b(String string2, Provider provider) {
            if (provider == null) {
                return KeyAgreement.getInstance((String)string2);
            }
            return KeyAgreement.getInstance((String)string2, (Provider)provider);
        }
    }

    public static class c
    implements j {
        public KeyFactory b(String string2, Provider provider) {
            if (provider == null) {
                return KeyFactory.getInstance((String)string2);
            }
            return KeyFactory.getInstance((String)string2, (Provider)provider);
        }
    }

    public static class d
    implements j {
        public KeyPairGenerator b(String string2, Provider provider) {
            if (provider == null) {
                return KeyPairGenerator.getInstance((String)string2);
            }
            return KeyPairGenerator.getInstance((String)string2, (Provider)provider);
        }
    }

    public static class e
    implements j {
        public Mac b(String string2, Provider provider) {
            if (provider == null) {
                return Mac.getInstance((String)string2);
            }
            return Mac.getInstance((String)string2, (Provider)provider);
        }
    }

    public static class f
    implements j {
        public MessageDigest b(String string2, Provider provider) {
            if (provider == null) {
                return MessageDigest.getInstance((String)string2);
            }
            return MessageDigest.getInstance((String)string2, (Provider)provider);
        }
    }

    public static class g
    implements j {
        public Signature b(String string2, Provider provider) {
            if (provider == null) {
                return Signature.getInstance((String)string2);
            }
            return Signature.getInstance((String)string2, (Provider)provider);
        }
    }

}

