package g9;

import android.content.Context;
import g9.f;
import i9.k1;
import i9.q;
import i9.q.a;
import i9.y0;

/* loaded from: classes.dex */
public final class i0 extends b0 {
    public i0(com.google.firebase.firestore.g gVar) {
        super(gVar);
    }

    @Override // g9.b0, g9.f
    public final k1 b(f.a aVar) {
        e9.a aVar2 = this.f5933c;
        x6.b.a0(aVar2, "persistence not initialized yet", new Object[0]);
        i9.q qVar = ((y0) aVar2).f7848g.f7824d;
        n9.a aVar3 = aVar.f5940b;
        i9.n h10 = h();
        qVar.getClass();
        return qVar.new a(aVar3, h10);
    }

    @Override // g9.b0, g9.f
    public final i9.e c(f.a aVar) {
        e9.a aVar2 = this.f5933c;
        x6.b.a0(aVar2, "persistence not initialized yet", new Object[0]);
        return new i9.e(aVar2, aVar.f5940b, h());
    }

    @Override // g9.b0, g9.f
    public final e9.a e(f.a aVar) {
        m9.e0 e0Var = this.f5932b.f10757b;
        x6.b.a0(e0Var, "remoteSerializer not initialized yet", new Object[0]);
        i9.i iVar = new i9.i(e0Var);
        q.b bVar = new q.b(this.f5931a.a());
        Context context = aVar.f5939a;
        h hVar = aVar.f5941c;
        return new y0(context, hVar.f5965b, hVar.f5964a, iVar, bVar);
    }
}
