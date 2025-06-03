package E2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public abstract class a {
    public static byte[] a(Context context, String str) {
        MessageDigest b7;
        PackageInfo e7 = G2.d.a(context).e(str, 64);
        Signature[] signatureArr = e7.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b7 = b("SHA1")) == null) {
            return null;
        }
        return b7.digest(e7.signatures[0].toByteArray());
    }

    public static MessageDigest b(String str) {
        MessageDigest messageDigest;
        for (int i7 = 0; i7 < 2; i7++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
