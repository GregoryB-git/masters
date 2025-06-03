package q3;

import java.security.SecureRandom;

/* renamed from: q3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1900p {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f18887a = new a();

    /* renamed from: q3.p$a */
    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SecureRandom initialValue() {
            return AbstractC1900p.b();
        }
    }

    public static SecureRandom b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] c(int i7) {
        byte[] bArr = new byte[i7];
        ((SecureRandom) f18887a.get()).nextBytes(bArr);
        return bArr;
    }
}
