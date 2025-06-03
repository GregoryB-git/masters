package e7;

import com.google.android.gms.measurement.internal.zzig;

/* loaded from: classes.dex */
public final /* synthetic */ class n2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4503a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ k6 f4504b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ zzig f4505c;

    public /* synthetic */ n2(zzig zzigVar, k6 k6Var, int i10) {
        this.f4503a = i10;
        this.f4505c = zzigVar;
        this.f4504b = k6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4503a) {
            case 0:
                zzig.zzb(this.f4505c, this.f4504b);
                break;
            default:
                this.f4505c.f2908a.c0();
                this.f4505c.f2908a.Q(this.f4504b);
                break;
        }
    }
}
