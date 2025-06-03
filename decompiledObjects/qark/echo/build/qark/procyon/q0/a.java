// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q0;

import android.net.Uri;
import java.util.Map;
import javax.crypto.Cipher;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.InvalidAlgorithmParameterException;
import java.io.InputStream;
import i0.i;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import i0.k;
import i0.y;
import javax.crypto.CipherInputStream;
import i0.g;

public class a implements g
{
    public final g a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;
    
    public a(final g a, final byte[] b, final byte[] c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void c(final y y) {
        g0.a.e(y);
        this.a.c(y);
    }
    
    @Override
    public void close() {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }
    
    @Override
    public final long e(k cause) {
        try {
            final Cipher q = this.q();
            final SecretKeySpec key = new SecretKeySpec(this.b, "AES");
            final IvParameterSpec params = new IvParameterSpec(this.c);
            try {
                q.init(2, key, params);
                cause = (InvalidAlgorithmParameterException)new i0.i(this.a, (k)cause);
                this.d = new CipherInputStream((InputStream)cause, q);
                ((i0.i)cause).b();
                return -1L;
            }
            catch (InvalidAlgorithmParameterException cause) {}
            catch (InvalidKeyException ex) {}
            throw new RuntimeException(cause);
        }
        catch (NoSuchPaddingException cause) {}
        catch (NoSuchAlgorithmException ex2) {}
        throw new RuntimeException(cause);
    }
    
    @Override
    public final Map g() {
        return this.a.g();
    }
    
    @Override
    public final Uri k() {
        return this.a.k();
    }
    
    public Cipher q() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }
    
    @Override
    public final int read(final byte[] b, int read, int len) {
        g0.a.e(this.d);
        len = (read = this.d.read(b, read, len));
        if (len < 0) {
            read = -1;
        }
        return read;
    }
}
