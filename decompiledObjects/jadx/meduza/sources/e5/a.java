package e5;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import t5.l0;

/* loaded from: classes.dex */
public final class a implements t5.k {

    /* renamed from: a, reason: collision with root package name */
    public final t5.k f3933a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f3934b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f3935c;

    /* renamed from: d, reason: collision with root package name */
    public CipherInputStream f3936d;

    public a(t5.k kVar, byte[] bArr, byte[] bArr2) {
        this.f3933a = kVar;
        this.f3934b = bArr;
        this.f3935c = bArr2;
    }

    @Override // t5.k
    public final long a(t5.n nVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f3934b, "AES"), new IvParameterSpec(this.f3935c));
                t5.m mVar = new t5.m(this.f3933a, nVar);
                this.f3936d = new CipherInputStream(mVar, cipher);
                mVar.f();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // t5.k
    public final void close() {
        if (this.f3936d != null) {
            this.f3936d = null;
            this.f3933a.close();
        }
    }

    @Override // t5.k
    public final void f(l0 l0Var) {
        l0Var.getClass();
        this.f3933a.f(l0Var);
    }

    @Override // t5.k
    public final Map<String, List<String>> h() {
        return this.f3933a.h();
    }

    @Override // t5.k
    public final Uri l() {
        return this.f3933a.l();
    }

    @Override // t5.h
    public final int read(byte[] bArr, int i10, int i11) {
        this.f3936d.getClass();
        int read = this.f3936d.read(bArr, i10, i11);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
