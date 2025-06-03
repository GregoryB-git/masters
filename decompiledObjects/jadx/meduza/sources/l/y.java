package l;

import android.view.View;
import l.z;

/* loaded from: classes.dex */
public final class y extends l0 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ z.g f9496r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z f9497s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, View view, z.g gVar) {
        super(view);
        this.f9497s = zVar;
        this.f9496r = gVar;
    }

    @Override // l.l0
    public final k.f b() {
        return this.f9496r;
    }

    @Override // l.l0
    public final boolean c() {
        if (this.f9497s.getInternalPopup().a()) {
            return true;
        }
        z zVar = this.f9497s;
        zVar.f.m(z.c.b(zVar), z.c.a(zVar));
        return true;
    }
}
