package q3;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* renamed from: q3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1894j {

    /* renamed from: q3.j$a */
    public static class a implements InterfaceC1894j {
        @Override // q3.InterfaceC1894j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Cipher a(String str, Provider provider) {
            return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
        }
    }

    /* renamed from: q3.j$b */
    public static class b implements InterfaceC1894j {
        @Override // q3.InterfaceC1894j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public KeyAgreement a(String str, Provider provider) {
            return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
        }
    }

    /* renamed from: q3.j$c */
    public static class c implements InterfaceC1894j {
        @Override // q3.InterfaceC1894j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public KeyFactory a(String str, Provider provider) {
            return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
        }
    }

    /* renamed from: q3.j$d */
    public static class d implements InterfaceC1894j {
        @Override // q3.InterfaceC1894j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public KeyPairGenerator a(String str, Provider provider) {
            return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
        }
    }

    /* renamed from: q3.j$e */
    public static class e implements InterfaceC1894j {
        @Override // q3.InterfaceC1894j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Mac a(String str, Provider provider) {
            return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
        }
    }

    /* renamed from: q3.j$f */
    public static class f implements InterfaceC1894j {
        @Override // q3.InterfaceC1894j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MessageDigest a(String str, Provider provider) {
            return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    /* renamed from: q3.j$g */
    public static class g implements InterfaceC1894j {
        @Override // q3.InterfaceC1894j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Signature a(String str, Provider provider) {
            return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    Object a(String str, Provider provider);
}
