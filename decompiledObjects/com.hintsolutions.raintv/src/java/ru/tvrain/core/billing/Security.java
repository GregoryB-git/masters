/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Base64
 *  android.util.Log
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.security.InvalidKeyException
 *  java.security.KeyFactory
 *  java.security.NoSuchAlgorithmException
 *  java.security.PublicKey
 *  java.security.Signature
 *  java.security.SignatureException
 *  java.security.spec.InvalidKeySpecException
 *  java.security.spec.KeySpec
 *  java.security.spec.X509EncodedKeySpec
 */
package ru.tvrain.core.billing;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;

public class Security {
    private static final String KEY_FACTORY_ALGORITHM = "RSA";
    private static final String SIGNATURE_ALGORITHM = "SHA1withRSA";
    private static final String TAG = "IABUtil/Security";

    public static PublicKey generatePublicKey(String string2) throws IOException {
        try {
            byte[] byArray = Base64.decode((String)string2, (int)0);
            KeyFactory keyFactory = KeyFactory.getInstance((String)KEY_FACTORY_ALGORITHM);
            string2 = new X509EncodedKeySpec(byArray);
            string2 = keyFactory.generatePublic((KeySpec)string2);
            return string2;
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid key specification: ");
            stringBuilder.append((Object)invalidKeySpecException);
            String string3 = stringBuilder.toString();
            Log.w((String)TAG, (String)string3);
            throw new IOException(string3);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException((Throwable)noSuchAlgorithmException);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean verify(PublicKey publicKey, String string2, String object) {
        try {
            object = Base64.decode((String)object, (int)0);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            Log.w((String)TAG, (String)"Base64 decoding failed.");
            return false;
        }
        try {
            Signature signature = Signature.getInstance((String)SIGNATURE_ALGORITHM);
            signature.initVerify(publicKey);
            signature.update(string2.getBytes());
            if (signature.verify((byte[])object)) return true;
            Log.w((String)TAG, (String)"Signature verification failed.");
            return false;
        }
        catch (SignatureException signatureException) {
            Log.w((String)TAG, (String)"Signature exception.");
            return false;
        }
        catch (InvalidKeyException invalidKeyException) {
            Log.w((String)TAG, (String)"Invalid key specification.");
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException((Throwable)noSuchAlgorithmException);
        }
        return false;
    }

    public static boolean verifyPurchase(String string2, String string3, String string4) throws IOException {
        if (!(TextUtils.isEmpty((CharSequence)string3) || TextUtils.isEmpty((CharSequence)string2) || TextUtils.isEmpty((CharSequence)string4))) {
            return Security.verify(Security.generatePublicKey(string2), string3, string4);
        }
        Log.w((String)TAG, (String)"Purchase verification failed: missing data.");
        return false;
    }
}

