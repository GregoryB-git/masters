package j5;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: j5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1385h implements InterfaceC1386i {

    /* renamed from: a, reason: collision with root package name */
    public final Cipher f15467a;

    /* renamed from: b, reason: collision with root package name */
    public final SecureRandom f15468b = new SecureRandom();

    /* renamed from: c, reason: collision with root package name */
    public Key f15469c;

    public C1385h(Context context, InterfaceC1378a interfaceC1378a) {
        String c7 = c();
        SharedPreferences sharedPreferences = context.getSharedPreferences("FlutterSecureKeyStorage", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String string = sharedPreferences.getString(c7, null);
        this.f15467a = d();
        if (string != null) {
            try {
                this.f15469c = interfaceC1378a.b(Base64.decode(string, 0), "AES");
                return;
            } catch (Exception e7) {
                Log.e("StorageCipher18Impl", "unwrap key failed", e7);
            }
        }
        byte[] bArr = new byte[16];
        this.f15468b.nextBytes(bArr);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f15469c = secretKeySpec;
        edit.putString(c7, Base64.encodeToString(interfaceC1378a.a(secretKeySpec), 0));
        edit.apply();
    }

    @Override // j5.InterfaceC1386i
    public byte[] a(byte[] bArr) {
        int e7 = e();
        byte[] bArr2 = new byte[e7];
        this.f15468b.nextBytes(bArr2);
        this.f15467a.init(1, this.f15469c, f(bArr2));
        byte[] doFinal = this.f15467a.doFinal(bArr);
        byte[] bArr3 = new byte[doFinal.length + e7];
        System.arraycopy(bArr2, 0, bArr3, 0, e7);
        System.arraycopy(doFinal, 0, bArr3, e7, doFinal.length);
        return bArr3;
    }

    @Override // j5.InterfaceC1386i
    public byte[] b(byte[] bArr) {
        int e7 = e();
        byte[] bArr2 = new byte[e7];
        System.arraycopy(bArr, 0, bArr2, 0, e7);
        AlgorithmParameterSpec f7 = f(bArr2);
        int length = bArr.length - e();
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, e7, bArr3, 0, length);
        this.f15467a.init(2, this.f15469c, f7);
        return this.f15467a.doFinal(bArr3);
    }

    public String c() {
        return "VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK";
    }

    public Cipher d() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    public int e() {
        return 16;
    }

    public AlgorithmParameterSpec f(byte[] bArr) {
        return new IvParameterSpec(bArr);
    }
}
