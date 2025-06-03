package i9;

import android.database.Cursor;
import m9.h;

/* loaded from: classes.dex */
public final /* synthetic */ class i1 implements n9.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7698a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7699b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7700c;

    public /* synthetic */ i1(int i10, Object obj, Object obj2) {
        this.f7698a = i10;
        this.f7699b = obj;
        this.f7700c = obj2;
    }

    @Override // n9.d
    public final void accept(Object obj) {
        switch (this.f7698a) {
            case 0:
                j1 j1Var = (j1) this.f7699b;
                n9.d dVar = (n9.d) this.f7700c;
                j1Var.getClass();
                dVar.accept(j1Var.k(((Cursor) obj).getBlob(0)));
                break;
            default:
                m9.h0 h0Var = (m9.h0) this.f7699b;
                n9.a aVar = (n9.a) this.f7700c;
                h0Var.getClass();
                aVar.a(new g.q(20, h0Var, (h.a) obj));
                break;
        }
    }
}
