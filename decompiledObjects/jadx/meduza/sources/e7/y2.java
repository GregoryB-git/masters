package e7;

import com.google.android.gms.measurement.internal.zzig;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class y2 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k6 f4779b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4780c;

    public /* synthetic */ y2(Object obj, k6 k6Var, int i10) {
        this.f4778a = i10;
        this.f4779b = k6Var;
        this.f4780c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f4778a) {
            case 0:
                ((zzig) this.f4780c).f2908a.c0();
                return new n(((zzig) this.f4780c).f2908a.c(this.f4779b.f4437a));
            default:
                i6 i6Var = (i6) this.f4780c;
                String str = this.f4779b.f4437a;
                m6.j.i(str);
                if (i6Var.H(str).p() && e3.l(this.f4779b.C).p()) {
                    return ((i6) this.f4780c).e(this.f4779b).g();
                }
                ((i6) this.f4780c).zzj().f4067w.b("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }
}
