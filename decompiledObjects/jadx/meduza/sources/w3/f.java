package w3;

import v5.l;
import w3.b;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements l.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16211a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z3.e f16212b;

    public /* synthetic */ f(int i10, b.a aVar, z3.e eVar) {
        this.f16211a = i10;
        this.f16212b = eVar;
    }

    @Override // v5.l.a
    public final void invoke(Object obj) {
        switch (this.f16211a) {
            case 0:
                b bVar = (b) obj;
                bVar.a(this.f16212b);
                bVar.D();
                break;
            default:
                b bVar2 = (b) obj;
                bVar2.y();
                bVar2.D();
                break;
        }
    }
}
