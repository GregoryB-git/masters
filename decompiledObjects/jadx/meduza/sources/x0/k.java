package x0;

import android.content.res.Configuration;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements d0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16697a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16698b;

    public /* synthetic */ k(Object obj, int i10) {
        this.f16697a = i10;
        this.f16698b = obj;
    }

    @Override // d0.a
    public final void accept(Object obj) {
        switch (this.f16697a) {
            case 0:
                ((m) this.f16698b).lambda$init$1((Configuration) obj);
                break;
            case 1:
                y yVar = (y) this.f16698b;
                Integer num = (Integer) obj;
                if (yVar.N() && num.intValue() == 80) {
                    yVar.n(false);
                    break;
                }
                break;
            default:
                ((pc.q) this.f16698b).l((i2.k) obj);
                break;
        }
    }
}
