// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package j5;

import android.content.res.Configuration;
import java.math.BigInteger;
import javax.security.auth.x500.X500Principal;
import android.security.keystore.KeyGenParameterSpec$Builder;
import java.security.cert.Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.KeyStore;
import java.security.KeyPairGenerator;
import java.util.Calendar;
import java.util.Locale;
import java.security.PrivateKey;
import javax.crypto.Cipher;
import java.security.PublicKey;
import java.security.Key;
import android.content.Context;

public class f implements a
{
    public final String a;
    public final Context b;
    
    public f(final Context b) {
        this.b = b;
        this.a = this.c();
        this.e(b);
    }
    
    @Override
    public byte[] a(final Key key) {
        final PublicKey h = this.h();
        final Cipher i = this.i();
        i.init(3, h, this.f());
        return i.wrap(key);
    }
    
    @Override
    public Key b(final byte[] wrappedKey, final String wrappedKeyAlgorithm) {
        final PrivateKey g = this.g();
        final Cipher i = this.i();
        i.init(4, g, this.f());
        return i.unwrap(wrappedKey, wrappedKeyAlgorithm, 3);
    }
    
    public String c() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b.getPackageName());
        sb.append(".FlutterSecureStoragePluginKey");
        return sb.toString();
    }
    
    public final void d(final Context context) {
        final Locale default1 = Locale.getDefault();
        try {
            this.k(Locale.ENGLISH);
            final Calendar instance = Calendar.getInstance();
            final Calendar instance2 = Calendar.getInstance();
            instance2.add(1, 25);
            final KeyPairGenerator instance3 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            instance3.initialize(this.j(context, instance, instance2));
            instance3.generateKeyPair();
        }
        finally {
            this.k(default1);
        }
    }
    
    public final void e(final Context context) {
        final KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load(null);
        if (instance.getKey(this.a, null) == null) {
            this.d(context);
        }
    }
    
    public AlgorithmParameterSpec f() {
        return null;
    }
    
    public final PrivateKey g() {
        final KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load(null);
        final Key key = instance.getKey(this.a, null);
        if (key == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("No key found under alias: ");
            sb.append(this.a);
            throw new Exception(sb.toString());
        }
        if (key instanceof PrivateKey) {
            return (PrivateKey)key;
        }
        throw new Exception("Not an instance of a PrivateKey");
    }
    
    public final PublicKey h() {
        final KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load(null);
        final Certificate certificate = instance.getCertificate(this.a);
        if (certificate == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("No certificate found under alias: ");
            sb.append(this.a);
            throw new Exception(sb.toString());
        }
        final PublicKey publicKey = certificate.getPublicKey();
        if (publicKey != null) {
            return publicKey;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("No key found under alias: ");
        sb2.append(this.a);
        throw new Exception(sb2.toString());
    }
    
    public Cipher i() {
        return Cipher.getInstance("RSA/ECB/PKCS1Padding", "AndroidKeyStoreBCWorkaround");
    }
    
    public AlgorithmParameterSpec j(final Context context, final Calendar calendar, final Calendar calendar2) {
        final KeyGenParameterSpec$Builder keyGenParameterSpec$Builder = new KeyGenParameterSpec$Builder(this.a, 3);
        final StringBuilder sb = new StringBuilder();
        sb.append("CN=");
        sb.append(this.a);
        return (AlgorithmParameterSpec)keyGenParameterSpec$Builder.setCertificateSubject(new X500Principal(sb.toString())).setDigests(new String[] { "SHA-256" }).setBlockModes(new String[] { "ECB" }).setEncryptionPaddings(new String[] { "PKCS1Padding" }).setCertificateSerialNumber(BigInteger.valueOf(1L)).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
    }
    
    public final void k(final Locale locale) {
        Locale.setDefault(locale);
        final Configuration configuration = this.b.getResources().getConfiguration();
        configuration.setLocale(locale);
        this.b.createConfigurationContext(configuration);
    }
}
