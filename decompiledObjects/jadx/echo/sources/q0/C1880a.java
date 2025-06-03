package q0;

import android.net.Uri;
import g0.AbstractC1297a;
import i0.y;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1880a implements i0.g {

    /* renamed from: a, reason: collision with root package name */
    public final i0.g f18603a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f18604b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f18605c;

    /* renamed from: d, reason: collision with root package name */
    public CipherInputStream f18606d;

    public C1880a(i0.g gVar, byte[] bArr, byte[] bArr2) {
        this.f18603a = gVar;
        this.f18604b = bArr;
        this.f18605c = bArr2;
    }

    @Override // i0.g
    public final void c(y yVar) {
        AbstractC1297a.e(yVar);
        this.f18603a.c(yVar);
    }

    @Override // i0.g
    public void close() {
        if (this.f18606d != null) {
            this.f18606d = null;
            this.f18603a.close();
        }
    }

    @Override // i0.g
    public final long e(i0.k kVar) {
        try {
            Cipher q7 = q();
            try {
                q7.init(2, new SecretKeySpec(this.f18604b, "AES"), new IvParameterSpec(this.f18605c));
                i0.i iVar = new i0.i(this.f18603a, kVar);
                this.f18606d = new CipherInputStream(iVar, q7);
                iVar.b();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e7) {
                throw new RuntimeException(e7);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // i0.g
    public final Map g() {
        return this.f18603a.g();
    }

    @Override // i0.g
    public final Uri k() {
        return this.f18603a.k();
    }

    public Cipher q() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // d0.InterfaceC1186i
    public final int read(byte[] bArr, int i7, int i8) {
        AbstractC1297a.e(this.f18606d);
        int read = this.f18606d.read(bArr, i7, i8);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
