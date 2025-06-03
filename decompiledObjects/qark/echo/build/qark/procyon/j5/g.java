// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package j5;

import java.math.BigInteger;
import javax.security.auth.x500.X500Principal;
import android.security.keystore.KeyGenParameterSpec$Builder;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import android.content.Context;

public class g extends f
{
    public g(final Context context) {
        super(context);
    }
    
    @Override
    public String c() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.b.getPackageName());
        sb.append(".FlutterSecureStoragePluginKeyOAEP");
        return sb.toString();
    }
    
    @Override
    public AlgorithmParameterSpec f() {
        return new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT);
    }
    
    @Override
    public Cipher i() {
        return Cipher.getInstance("RSA/ECB/OAEPPadding", "AndroidKeyStoreBCWorkaround");
    }
    
    @Override
    public AlgorithmParameterSpec j(final Context context, final Calendar calendar, final Calendar calendar2) {
        final KeyGenParameterSpec$Builder keyGenParameterSpec$Builder = new KeyGenParameterSpec$Builder(super.a, 3);
        final StringBuilder sb = new StringBuilder();
        sb.append("CN=");
        sb.append(super.a);
        return (AlgorithmParameterSpec)keyGenParameterSpec$Builder.setCertificateSubject(new X500Principal(sb.toString())).setDigests(new String[] { "SHA-256" }).setBlockModes(new String[] { "ECB" }).setEncryptionPaddings(new String[] { "OAEPPadding" }).setCertificateSerialNumber(BigInteger.valueOf(1L)).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
    }
}
