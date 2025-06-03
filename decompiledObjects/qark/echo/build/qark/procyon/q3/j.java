// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q3;

import java.security.Signature;
import java.security.MessageDigest;
import javax.crypto.Mac;
import java.security.KeyPairGenerator;
import java.security.KeyFactory;
import javax.crypto.KeyAgreement;
import javax.crypto.Cipher;
import java.security.Provider;

public interface j
{
    Object a(final String p0, final Provider p1);
    
    public static class a implements j
    {
        public Cipher b(final String s, final Provider provider) {
            if (provider == null) {
                return Cipher.getInstance(s);
            }
            return Cipher.getInstance(s, provider);
        }
    }
    
    public static class b implements j
    {
        public KeyAgreement b(final String s, final Provider provider) {
            if (provider == null) {
                return KeyAgreement.getInstance(s);
            }
            return KeyAgreement.getInstance(s, provider);
        }
    }
    
    public static class c implements j
    {
        public KeyFactory b(final String s, final Provider provider) {
            if (provider == null) {
                return KeyFactory.getInstance(s);
            }
            return KeyFactory.getInstance(s, provider);
        }
    }
    
    public static class d implements j
    {
        public KeyPairGenerator b(final String s, final Provider provider) {
            if (provider == null) {
                return KeyPairGenerator.getInstance(s);
            }
            return KeyPairGenerator.getInstance(s, provider);
        }
    }
    
    public static class e implements j
    {
        public Mac b(final String s, final Provider provider) {
            if (provider == null) {
                return Mac.getInstance(s);
            }
            return Mac.getInstance(s, provider);
        }
    }
    
    public static class f implements j
    {
        public MessageDigest b(final String s, final Provider provider) {
            if (provider == null) {
                return MessageDigest.getInstance(s);
            }
            return MessageDigest.getInstance(s, provider);
        }
    }
    
    public static class g implements j
    {
        public Signature b(final String s, final Provider provider) {
            if (provider == null) {
                return Signature.getInstance(s);
            }
            return Signature.getInstance(s, provider);
        }
    }
}
