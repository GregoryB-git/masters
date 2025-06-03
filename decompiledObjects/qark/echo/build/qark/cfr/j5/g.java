/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.security.keystore.KeyGenParameterSpec
 *  android.security.keystore.KeyGenParameterSpec$Builder
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.math.BigInteger
 *  java.security.Key
 *  java.security.spec.AlgorithmParameterSpec
 *  java.security.spec.MGF1ParameterSpec
 *  java.util.Calendar
 *  java.util.Date
 *  javax.crypto.Cipher
 *  javax.crypto.spec.OAEPParameterSpec
 *  javax.crypto.spec.PSource
 *  javax.crypto.spec.PSource$PSpecified
 *  javax.security.auth.x500.X500Principal
 */
package j5;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import j5.f;
import java.math.BigInteger;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.util.Calendar;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.security.auth.x500.X500Principal;

public class g
extends f {
    public g(Context context) {
        super(context);
    }

    @Override
    public String c() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b.getPackageName());
        stringBuilder.append(".FlutterSecureStoragePluginKeyOAEP");
        return stringBuilder.toString();
    }

    @Override
    public AlgorithmParameterSpec f() {
        return new OAEPParameterSpec("SHA-256", "MGF1", (AlgorithmParameterSpec)MGF1ParameterSpec.SHA1, (PSource)PSource.PSpecified.DEFAULT);
    }

    @Override
    public Cipher i() {
        return Cipher.getInstance((String)"RSA/ECB/OAEPPadding", (String)"AndroidKeyStoreBCWorkaround");
    }

    @Override
    public AlgorithmParameterSpec j(Context context, Calendar calendar, Calendar calendar2) {
        context = new KeyGenParameterSpec.Builder(this.a, 3);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CN=");
        stringBuilder.append(this.a);
        return context.setCertificateSubject(new X500Principal(stringBuilder.toString())).setDigests(new String[]{"SHA-256"}).setBlockModes(new String[]{"ECB"}).setEncryptionPaddings(new String[]{"OAEPPadding"}).setCertificateSerialNumber(BigInteger.valueOf((long)1L)).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
    }
}

