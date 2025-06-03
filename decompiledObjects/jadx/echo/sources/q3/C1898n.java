package q3;

import h3.AbstractC1336b;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import o3.InterfaceC1755a;

/* renamed from: q3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1898n implements InterfaceC1755a {

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC1336b.EnumC0213b f18879e = AbstractC1336b.EnumC0213b.f14585p;

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f18880a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18881b;

    /* renamed from: c, reason: collision with root package name */
    public final Key f18882c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18883d;

    /* renamed from: q3.n$a */
    public class a extends ThreadLocal {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mac initialValue() {
            try {
                Mac mac = (Mac) C1893i.f18865c.a(C1898n.this.f18881b);
                mac.init(C1898n.this.f18882c);
                return mac;
            } catch (GeneralSecurityException e7) {
                throw new IllegalStateException(e7);
            }
        }
    }

    public C1898n(String str, Key key) {
        int i7;
        a aVar = new a();
        this.f18880a = aVar;
        if (!f18879e.c()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f18881b = str;
        this.f18882c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.hashCode();
        switch (str) {
            case "HMACSHA1":
                i7 = 20;
                break;
            case "HMACSHA224":
                i7 = 28;
                break;
            case "HMACSHA256":
                i7 = 32;
                break;
            case "HMACSHA384":
                i7 = 48;
                break;
            case "HMACSHA512":
                i7 = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        this.f18883d = i7;
        aVar.get();
    }

    @Override // o3.InterfaceC1755a
    public byte[] a(byte[] bArr, int i7) {
        if (i7 > this.f18883d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.f18880a.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.f18880a.get()).doFinal(), i7);
    }
}
