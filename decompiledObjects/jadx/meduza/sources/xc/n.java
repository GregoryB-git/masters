package xc;

import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class n implements y {

    /* renamed from: a, reason: collision with root package name */
    public final h f17271a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f17272b;

    /* renamed from: c, reason: collision with root package name */
    public int f17273c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17274d;

    public n(s sVar, Inflater inflater) {
        this.f17271a = sVar;
        this.f17272b = inflater;
    }

    @Override // xc.y
    public final z c() {
        return this.f17271a.c();
    }

    @Override // xc.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f17274d) {
            return;
        }
        this.f17272b.end();
        this.f17274d = true;
        this.f17271a.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096 A[SYNTHETIC] */
    @Override // xc.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e0(xc.f r9, long r10) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xc.n.e0(xc.f, long):long");
    }
}
