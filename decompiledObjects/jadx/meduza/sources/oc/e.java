package oc;

import dc.l;
import ec.j;

/* loaded from: classes.dex */
public final class e extends j implements l<Throwable, rb.h> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f12143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f12144b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, d dVar) {
        super(1);
        this.f12143a = fVar;
        this.f12144b = dVar;
    }

    @Override // dc.l
    public final rb.h invoke(Throwable th) {
        this.f12143a.f12145c.removeCallbacks(this.f12144b);
        return rb.h.f13851a;
    }
}
