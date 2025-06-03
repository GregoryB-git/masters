package g9;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y extends l {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6100d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y(j9.l r2, ka.d0 r3) {
        /*
            r1 = this;
            g9.l$a r0 = g9.l.a.NOT_IN
            r1.<init>(r2, r0, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f6100d = r2
            java.util.ArrayList r3 = g9.x.h(r0, r3)
            r2.addAll(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.y.<init>(j9.l, ka.d0):void");
    }

    @Override // g9.l, g9.m
    public final boolean d(j9.g gVar) {
        return !this.f6100d.contains(gVar.getKey());
    }
}
