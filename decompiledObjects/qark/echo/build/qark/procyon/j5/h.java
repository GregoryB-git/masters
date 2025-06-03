// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package j5;

import android.content.SharedPreferences$Editor;
import javax.crypto.spec.IvParameterSpec;
import java.security.spec.AlgorithmParameterSpec;
import android.content.SharedPreferences;
import javax.crypto.spec.SecretKeySpec;
import android.util.Log;
import android.util.Base64;
import android.content.Context;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.Cipher;

public class h implements i
{
    public final Cipher a;
    public final SecureRandom b;
    public Key c;
    
    public h(Context edit, final a a) {
        this.b = new SecureRandom();
        final String c = this.c();
        final SharedPreferences sharedPreferences = edit.getSharedPreferences("FlutterSecureKeyStorage", 0);
        edit = (Context)sharedPreferences.edit();
        final String string = sharedPreferences.getString(c, (String)null);
        this.a = this.d();
        if (string != null) {
            try {
                this.c = a.b(Base64.decode(string, 0), "AES");
                return;
            }
            catch (Exception ex) {
                Log.e("StorageCipher18Impl", "unwrap key failed", (Throwable)ex);
            }
        }
        final byte[] array = new byte[16];
        this.b.nextBytes(array);
        final SecretKeySpec c2 = new SecretKeySpec(array, "AES");
        this.c = c2;
        ((SharedPreferences$Editor)edit).putString(c, Base64.encodeToString(a.a(c2), 0));
        ((SharedPreferences$Editor)edit).apply();
    }
    
    @Override
    public byte[] a(byte[] doFinal) {
        final int e = this.e();
        final byte[] bytes = new byte[e];
        this.b.nextBytes(bytes);
        this.a.init(1, this.c, this.f(bytes));
        doFinal = this.a.doFinal(doFinal);
        final byte[] array = new byte[doFinal.length + e];
        System.arraycopy(bytes, 0, array, 0, e);
        System.arraycopy(doFinal, 0, array, e, doFinal.length);
        return array;
    }
    
    @Override
    public byte[] b(final byte[] array) {
        final int e = this.e();
        final byte[] array2 = new byte[e];
        System.arraycopy(array, 0, array2, 0, e);
        final AlgorithmParameterSpec f = this.f(array2);
        final int n = array.length - this.e();
        final byte[] input = new byte[n];
        System.arraycopy(array, e, input, 0, n);
        this.a.init(2, this.c, f);
        return this.a.doFinal(input);
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
    
    public AlgorithmParameterSpec f(final byte[] iv) {
        return new IvParameterSpec(iv);
    }
}
