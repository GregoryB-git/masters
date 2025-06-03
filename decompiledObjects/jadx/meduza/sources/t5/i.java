package t5;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import v3.a1;

/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: e, reason: collision with root package name */
    public n f14509e;
    public byte[] f;

    /* renamed from: g, reason: collision with root package name */
    public int f14510g;

    /* renamed from: h, reason: collision with root package name */
    public int f14511h;

    public i() {
        super(false);
    }

    @Override // t5.k
    public final long a(n nVar) {
        q(nVar);
        this.f14509e = nVar;
        Uri uri = nVar.f14547a;
        String scheme = uri.getScheme();
        x6.b.o("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i10 = v5.e0.f15881a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw new a1("Unexpected URI format: " + uri, null, true, 0);
        }
        String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw new a1(defpackage.g.d("Error while parsing Base64 encoded string: ", str), e10, true, 0);
            }
        } else {
            this.f = v5.e0.B(URLDecoder.decode(str, n7.d.f11282a.name()));
        }
        long j10 = nVar.f;
        byte[] bArr = this.f;
        if (j10 > bArr.length) {
            this.f = null;
            throw new l(2008);
        }
        int i11 = (int) j10;
        this.f14510g = i11;
        int length = bArr.length - i11;
        this.f14511h = length;
        long j11 = nVar.f14552g;
        if (j11 != -1) {
            this.f14511h = (int) Math.min(length, j11);
        }
        r(nVar);
        long j12 = nVar.f14552g;
        return j12 != -1 ? j12 : this.f14511h;
    }

    @Override // t5.k
    public final void close() {
        if (this.f != null) {
            this.f = null;
            p();
        }
        this.f14509e = null;
    }

    @Override // t5.k
    public final Uri l() {
        n nVar = this.f14509e;
        if (nVar != null) {
            return nVar.f14547a;
        }
        return null;
    }

    @Override // t5.h
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f14511h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        byte[] bArr2 = this.f;
        int i13 = v5.e0.f15881a;
        System.arraycopy(bArr2, this.f14510g, bArr, i10, min);
        this.f14510g += min;
        this.f14511h -= min;
        o(min);
        return min;
    }
}
