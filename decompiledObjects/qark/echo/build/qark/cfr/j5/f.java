/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.security.keystore.KeyGenParameterSpec
 *  android.security.keystore.KeyGenParameterSpec$Builder
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.math.BigInteger
 *  java.security.Key
 *  java.security.KeyPair
 *  java.security.KeyPairGenerator
 *  java.security.KeyStore
 *  java.security.KeyStore$LoadStoreParameter
 *  java.security.PrivateKey
 *  java.security.PublicKey
 *  java.security.cert.Certificate
 *  java.security.spec.AlgorithmParameterSpec
 *  java.util.Calendar
 *  java.util.Date
 *  java.util.Locale
 *  javax.crypto.Cipher
 *  javax.security.auth.x500.X500Principal
 */
package j5;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.security.keystore.KeyGenParameterSpec;
import j5.a;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.security.auth.x500.X500Principal;

public class f
implements a {
    public final String a;
    public final Context b;

    public f(Context context) {
        this.b = context;
        this.a = this.c();
        this.e(context);
    }

    @Override
    public byte[] a(Key key) {
        PublicKey publicKey = this.h();
        Cipher cipher = this.i();
        cipher.init(3, (Key)publicKey, this.f());
        return cipher.wrap(key);
    }

    @Override
    public Key b(byte[] arrby, String string2) {
        PrivateKey privateKey = this.g();
        Cipher cipher = this.i();
        cipher.init(4, (Key)privateKey, this.f());
        return cipher.unwrap(arrby, string2, 3);
    }

    public String c() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b.getPackageName());
        stringBuilder.append(".FlutterSecureStoragePluginKey");
        return stringBuilder.toString();
    }

    public final void d(Context context) {
        Locale locale = Locale.getDefault();
        try {
            this.k(Locale.ENGLISH);
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 25);
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance((String)"RSA", (String)"AndroidKeyStore");
            keyPairGenerator.initialize(this.j(context, calendar, calendar2));
            keyPairGenerator.generateKeyPair();
            return;
        }
        finally {
            this.k(locale);
        }
    }

    public final void e(Context context) {
        KeyStore keyStore = KeyStore.getInstance((String)"AndroidKeyStore");
        keyStore.load(null);
        if (keyStore.getKey(this.a, null) == null) {
            this.d(context);
        }
    }

    public AlgorithmParameterSpec f() {
        return null;
    }

    public final PrivateKey g() {
        KeyStore keyStore = KeyStore.getInstance((String)"AndroidKeyStore");
        keyStore.load(null);
        keyStore = keyStore.getKey(this.a, null);
        if (keyStore != null) {
            if (keyStore instanceof PrivateKey) {
                return (PrivateKey)keyStore;
            }
            throw new Exception("Not an instance of a PrivateKey");
        }
        keyStore = new StringBuilder();
        keyStore.append("No key found under alias: ");
        keyStore.append(this.a);
        throw new Exception(keyStore.toString());
    }

    public final PublicKey h() {
        KeyStore keyStore = KeyStore.getInstance((String)"AndroidKeyStore");
        keyStore.load(null);
        keyStore = keyStore.getCertificate(this.a);
        if (keyStore != null) {
            if ((keyStore = keyStore.getPublicKey()) != null) {
                return keyStore;
            }
            keyStore = new StringBuilder();
            keyStore.append("No key found under alias: ");
            keyStore.append(this.a);
            throw new Exception(keyStore.toString());
        }
        keyStore = new StringBuilder();
        keyStore.append("No certificate found under alias: ");
        keyStore.append(this.a);
        throw new Exception(keyStore.toString());
    }

    public Cipher i() {
        return Cipher.getInstance((String)"RSA/ECB/PKCS1Padding", (String)"AndroidKeyStoreBCWorkaround");
    }

    public AlgorithmParameterSpec j(Context context, Calendar calendar, Calendar calendar2) {
        context = new KeyGenParameterSpec.Builder(this.a, 3);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CN=");
        stringBuilder.append(this.a);
        return context.setCertificateSubject(new X500Principal(stringBuilder.toString())).setDigests(new String[]{"SHA-256"}).setBlockModes(new String[]{"ECB"}).setEncryptionPaddings(new String[]{"PKCS1Padding"}).setCertificateSerialNumber(BigInteger.valueOf((long)1L)).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
    }

    public final void k(Locale locale) {
        Locale.setDefault((Locale)locale);
        Configuration configuration = this.b.getResources().getConfiguration();
        configuration.setLocale(locale);
        this.b.createConfigurationContext(configuration);
    }
}

