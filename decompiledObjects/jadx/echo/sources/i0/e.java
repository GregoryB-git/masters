package i0;

import android.net.Uri;
import android.util.Base64;
import d0.C1162A;
import g0.AbstractC1297a;
import g0.M;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: e, reason: collision with root package name */
    public k f14641e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f14642f;

    /* renamed from: g, reason: collision with root package name */
    public int f14643g;

    /* renamed from: h, reason: collision with root package name */
    public int f14644h;

    public e() {
        super(false);
    }

    @Override // i0.g
    public void close() {
        if (this.f14642f != null) {
            this.f14642f = null;
            r();
        }
        this.f14641e = null;
    }

    @Override // i0.g
    public long e(k kVar) {
        s(kVar);
        this.f14641e = kVar;
        Uri normalizeScheme = kVar.f14652a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        AbstractC1297a.b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] b12 = M.b1(normalizeScheme.getSchemeSpecificPart(), ",");
        if (b12.length != 2) {
            throw C1162A.b("Unexpected URI format: " + normalizeScheme, null);
        }
        String str = b12[1];
        if (b12[0].contains(";base64")) {
            try {
                this.f14642f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e7) {
                throw C1162A.b("Error while parsing Base64 encoded string: " + str, e7);
            }
        } else {
            this.f14642f = M.r0(URLDecoder.decode(str, W2.e.f6819a.name()));
        }
        long j7 = kVar.f14658g;
        byte[] bArr = this.f14642f;
        if (j7 > bArr.length) {
            this.f14642f = null;
            throw new h(2008);
        }
        int i7 = (int) j7;
        this.f14643g = i7;
        int length = bArr.length - i7;
        this.f14644h = length;
        long j8 = kVar.f14659h;
        if (j8 != -1) {
            this.f14644h = (int) Math.min(length, j8);
        }
        t(kVar);
        long j9 = kVar.f14659h;
        return j9 != -1 ? j9 : this.f14644h;
    }

    @Override // i0.g
    public Uri k() {
        k kVar = this.f14641e;
        if (kVar != null) {
            return kVar.f14652a;
        }
        return null;
    }

    @Override // d0.InterfaceC1186i
    public int read(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.f14644h;
        if (i9 == 0) {
            return -1;
        }
        int min = Math.min(i8, i9);
        System.arraycopy(M.i(this.f14642f), this.f14643g, bArr, i7, min);
        this.f14643g += min;
        this.f14644h -= min;
        q(min);
        return min;
    }
}
