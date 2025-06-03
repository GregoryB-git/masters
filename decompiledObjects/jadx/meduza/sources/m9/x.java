package m9;

import com.google.android.gms.tasks.Tasks;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10900a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f10901b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eb.n0 f10902c;

    public /* synthetic */ x(y yVar, eb.n0 n0Var, int i10) {
        this.f10900a = i10;
        this.f10901b = yVar;
        this.f10902c = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10900a) {
            case 0:
                this.f10901b.b(this.f10902c);
                break;
            default:
                y yVar = this.f10901b;
                eb.n0 n0Var = this.f10902c;
                yVar.getClass();
                n0Var.H();
                yVar.f10903a = Tasks.call(n9.f.f11362c, new w(yVar, 0));
                break;
        }
    }
}
