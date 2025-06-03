package w5;

import android.view.Surface;
import j8.s;
import j8.v;
import v5.e0;
import w5.n;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16416a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16417b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16418c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16419d;

    public /* synthetic */ l(s sVar, long j10, String str) {
        this.f16418c = sVar;
        this.f16417b = j10;
        this.f16419d = str;
    }

    public /* synthetic */ l(n.a aVar, Surface surface, long j10) {
        this.f16418c = aVar;
        this.f16419d = surface;
        this.f16417b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16416a) {
            case 0:
                n.a aVar = (n.a) this.f16418c;
                Object obj = this.f16419d;
                long j10 = this.f16417b;
                n nVar = aVar.f16425b;
                int i10 = e0.f15881a;
                nVar.l(obj, j10);
                break;
            default:
                s sVar = (s) this.f16418c;
                long j11 = this.f16417b;
                String str = (String) this.f16419d;
                j8.n nVar2 = sVar.f8631h;
                v vVar = nVar2.f8605n;
                if (!(vVar != null && vVar.f8650e.get())) {
                    nVar2.f8600i.f9766b.c(str, j11);
                    break;
                }
                break;
        }
    }
}
