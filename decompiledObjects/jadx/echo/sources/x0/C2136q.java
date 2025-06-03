package x0;

import android.net.Uri;
import g0.AbstractC1297a;
import java.util.Map;

/* renamed from: x0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2136q implements i0.g {

    /* renamed from: a, reason: collision with root package name */
    public final i0.g f20809a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20810b;

    /* renamed from: c, reason: collision with root package name */
    public final a f20811c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f20812d;

    /* renamed from: e, reason: collision with root package name */
    public int f20813e;

    /* renamed from: x0.q$a */
    public interface a {
        void a(g0.z zVar);
    }

    public C2136q(i0.g gVar, int i7, a aVar) {
        AbstractC1297a.a(i7 > 0);
        this.f20809a = gVar;
        this.f20810b = i7;
        this.f20811c = aVar;
        this.f20812d = new byte[1];
        this.f20813e = i7;
    }

    @Override // i0.g
    public void c(i0.y yVar) {
        AbstractC1297a.e(yVar);
        this.f20809a.c(yVar);
    }

    @Override // i0.g
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // i0.g
    public long e(i0.k kVar) {
        throw new UnsupportedOperationException();
    }

    @Override // i0.g
    public Map g() {
        return this.f20809a.g();
    }

    @Override // i0.g
    public Uri k() {
        return this.f20809a.k();
    }

    public final boolean q() {
        if (this.f20809a.read(this.f20812d, 0, 1) == -1) {
            return false;
        }
        int i7 = (this.f20812d[0] & 255) << 4;
        if (i7 == 0) {
            return true;
        }
        byte[] bArr = new byte[i7];
        int i8 = i7;
        int i9 = 0;
        while (i8 > 0) {
            int read = this.f20809a.read(bArr, i9, i8);
            if (read == -1) {
                return false;
            }
            i9 += read;
            i8 -= read;
        }
        while (i7 > 0 && bArr[i7 - 1] == 0) {
            i7--;
        }
        if (i7 > 0) {
            this.f20811c.a(new g0.z(bArr, i7));
        }
        return true;
    }

    @Override // d0.InterfaceC1186i
    public int read(byte[] bArr, int i7, int i8) {
        if (this.f20813e == 0) {
            if (!q()) {
                return -1;
            }
            this.f20813e = this.f20810b;
        }
        int read = this.f20809a.read(bArr, i7, Math.min(this.f20813e, i8));
        if (read != -1) {
            this.f20813e -= read;
        }
        return read;
    }
}
