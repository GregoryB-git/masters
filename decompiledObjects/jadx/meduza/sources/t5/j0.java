package t5;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j0 implements k {

    /* renamed from: a, reason: collision with root package name */
    public final k f14523a;

    /* renamed from: b, reason: collision with root package name */
    public long f14524b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f14525c;

    /* renamed from: d, reason: collision with root package name */
    public Map<String, List<String>> f14526d;

    public j0(k kVar) {
        kVar.getClass();
        this.f14523a = kVar;
        this.f14525c = Uri.EMPTY;
        this.f14526d = Collections.emptyMap();
    }

    @Override // t5.k
    public final long a(n nVar) {
        this.f14525c = nVar.f14547a;
        this.f14526d = Collections.emptyMap();
        long a10 = this.f14523a.a(nVar);
        Uri l10 = l();
        l10.getClass();
        this.f14525c = l10;
        this.f14526d = h();
        return a10;
    }

    @Override // t5.k
    public final void close() {
        this.f14523a.close();
    }

    @Override // t5.k
    public final void f(l0 l0Var) {
        l0Var.getClass();
        this.f14523a.f(l0Var);
    }

    @Override // t5.k
    public final Map<String, List<String>> h() {
        return this.f14523a.h();
    }

    @Override // t5.k
    public final Uri l() {
        return this.f14523a.l();
    }

    @Override // t5.h
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f14523a.read(bArr, i10, i11);
        if (read != -1) {
            this.f14524b += read;
        }
        return read;
    }
}
