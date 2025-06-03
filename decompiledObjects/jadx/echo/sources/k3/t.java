package k3;

import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Objects;
import r3.C1919a;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f16192a = Charset.forName("UTF-8");

    public static Integer a() {
        if (b()) {
            return AbstractC1463a.a();
        }
        return null;
    }

    public static boolean b() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    public static int c() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i7 = 0;
        while (i7 == 0) {
            secureRandom.nextBytes(bArr);
            i7 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i7;
    }

    public static final byte d(char c7) {
        if (c7 >= '!' && c7 <= '~') {
            return (byte) c7;
        }
        throw new s("Not a printable ASCII character: " + c7);
    }

    public static final C1919a e(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i7 = 0; i7 < str.length(); i7++) {
            bArr[i7] = d(str.charAt(i7));
        }
        return C1919a.a(bArr);
    }
}
