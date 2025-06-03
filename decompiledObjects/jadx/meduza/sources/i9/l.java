package i9;

import android.database.Cursor;
import i9.j1;
import i9.q;
import ma.h;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements n9.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7723b;

    public /* synthetic */ l(Object obj, int i10) {
        this.f7722a = i10;
        this.f7723b = obj;
    }

    @Override // n9.d
    public final void accept(Object obj) {
        switch (this.f7722a) {
            case 0:
                ((f) this.f7723b).a((j9.k) obj);
                break;
            case 1:
                q.d dVar = (q.d) this.f7723b;
                int i10 = q.f7769e;
                dVar.a(Long.valueOf(((m1) obj).f7736c));
                break;
            case 2:
                w0 w0Var = (w0) this.f7723b;
                w0Var.getClass();
                byte[] blob = ((Cursor) obj).getBlob(0);
                h.C0164h c0164h = ma.h.f10961b;
                w0Var.f = ma.h.m(blob, 0, blob.length);
                break;
            default:
                j1.a aVar = (j1.a) this.f7723b;
                aVar.f7715a = aVar.f7715a.a(new j9.i(p2.m0.x(((Cursor) obj).getString(0))));
                break;
        }
    }
}
