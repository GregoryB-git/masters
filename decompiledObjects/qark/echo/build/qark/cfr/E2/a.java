/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.Signature
 *  java.lang.Object
 *  java.lang.String
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 */
package E2;

import G2.d;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class a {
    public static byte[] a(Context context, String messageDigest) {
        context = d.a(context).e((String)messageDigest, 64);
        messageDigest = context.signatures;
        if (messageDigest != null && messageDigest.length == 1 && (messageDigest = a.b("SHA1")) != null) {
            return messageDigest.digest(context.signatures[0].toByteArray());
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MessageDigest b(String string2) {
        int n8 = 0;
        while (n8 < 2) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance((String)string2);
                if (messageDigest != null) {
                    return messageDigest;
                }
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {}
            ++n8;
        }
        return null;
    }
}

