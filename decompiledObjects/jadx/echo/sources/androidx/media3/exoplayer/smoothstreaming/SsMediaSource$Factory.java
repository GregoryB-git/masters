package androidx.media3.exoplayer.smoothstreaming;

import B0.k;
import B0.m;
import g0.AbstractC1297a;
import i0.g;
import p0.C1780l;
import p0.InterfaceC1767A;
import w0.C2073a;
import w0.b;
import x0.C2132m;
import x0.InterfaceC2129j;
import x0.InterfaceC2142x;

/* loaded from: classes.dex */
public final class SsMediaSource$Factory implements InterfaceC2142x.a {

    /* renamed from: a, reason: collision with root package name */
    public final b f9917a;

    /* renamed from: b, reason: collision with root package name */
    public final g.a f9918b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC2129j f9919c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1767A f9920d;

    /* renamed from: e, reason: collision with root package name */
    public m f9921e;

    /* renamed from: f, reason: collision with root package name */
    public long f9922f;

    public SsMediaSource$Factory(g.a aVar) {
        this(new C2073a(aVar), aVar);
    }

    public SsMediaSource$Factory a(boolean z7) {
        this.f9917a.a(z7);
        return this;
    }

    public SsMediaSource$Factory(b bVar, g.a aVar) {
        this.f9917a = (b) AbstractC1297a.e(bVar);
        this.f9918b = aVar;
        this.f9920d = new C1780l();
        this.f9921e = new k();
        this.f9922f = 30000L;
        this.f9919c = new C2132m();
        a(true);
    }
}
