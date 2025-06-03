package i0;

import android.net.Uri;
import g0.AbstractC1297a;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class x implements g {

    /* renamed from: a, reason: collision with root package name */
    public final g f14734a;

    /* renamed from: b, reason: collision with root package name */
    public long f14735b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f14736c = Uri.EMPTY;

    /* renamed from: d, reason: collision with root package name */
    public Map f14737d = Collections.emptyMap();

    public x(g gVar) {
        this.f14734a = (g) AbstractC1297a.e(gVar);
    }

    @Override // i0.g
    public void c(y yVar) {
        AbstractC1297a.e(yVar);
        this.f14734a.c(yVar);
    }

    @Override // i0.g
    public void close() {
        this.f14734a.close();
    }

    @Override // i0.g
    public long e(k kVar) {
        this.f14736c = kVar.f14652a;
        this.f14737d = Collections.emptyMap();
        long e7 = this.f14734a.e(kVar);
        this.f14736c = (Uri) AbstractC1297a.e(k());
        this.f14737d = g();
        return e7;
    }

    @Override // i0.g
    public Map g() {
        return this.f14734a.g();
    }

    @Override // i0.g
    public Uri k() {
        return this.f14734a.k();
    }

    public long q() {
        return this.f14735b;
    }

    public Uri r() {
        return this.f14736c;
    }

    @Override // d0.InterfaceC1186i
    public int read(byte[] bArr, int i7, int i8) {
        int read = this.f14734a.read(bArr, i7, i8);
        if (read != -1) {
            this.f14735b += read;
        }
        return read;
    }

    public Map s() {
        return this.f14737d;
    }

    public void t() {
        this.f14735b = 0L;
    }
}
