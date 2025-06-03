package j3;

import android.util.Log;
import c3.InterfaceC0823a;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: j3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1372b implements InterfaceC0823a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f15446b = "b";

    /* renamed from: a, reason: collision with root package name */
    public final SecretKey f15447a;

    public C1372b(String str, KeyStore keyStore) {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.f15447a = secretKey;
        if (secretKey != null) {
            return;
        }
        throw new InvalidKeyException("Keystore cannot load the key with ID: " + str);
    }

    public static void e() {
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
    }

    @Override // c3.InterfaceC0823a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            return d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e7) {
            Log.w(f15446b, "encountered a potentially transient KeyStore error, will wait and retry", e7);
            e();
            return d(bArr, bArr2);
        }
    }

    @Override // c3.InterfaceC0823a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        try {
            return c(bArr, bArr2);
        } catch (ProviderException e7) {
            e = e7;
            Log.w(f15446b, "encountered a potentially transient KeyStore error, will wait and retry", e);
            e();
            return c(bArr, bArr2);
        } catch (AEADBadTagException e8) {
            throw e8;
        } catch (GeneralSecurityException e9) {
            e = e9;
            Log.w(f15446b, "encountered a potentially transient KeyStore error, will wait and retry", e);
            e();
            return c(bArr, bArr2);
        }
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, this.f15447a, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }

    public final byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.f15447a);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        return bArr3;
    }
}
