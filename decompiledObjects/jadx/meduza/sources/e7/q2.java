package e7;

import com.google.android.gms.measurement.internal.zzig;

/* loaded from: classes.dex */
public final class q2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4582b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4583c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f4584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzig f4585e;

    public q2(zzig zzigVar, String str, String str2, String str3, long j10) {
        this.f4581a = str;
        this.f4582b = str2;
        this.f4583c = str3;
        this.f4584d = j10;
        this.f4585e = zzigVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f4581a;
        if (str == null) {
            i6 i6Var = this.f4585e.f2908a;
            String str2 = this.f4582b;
            i6Var.zzl().l();
            String str3 = i6Var.O;
            if (str3 == null || str3.equals(str2)) {
                i6Var.O = str2;
                i6Var.N = null;
                return;
            }
            return;
        }
        q4 q4Var = new q4(this.f4584d, this.f4583c, str);
        i6 i6Var2 = this.f4585e.f2908a;
        String str4 = this.f4582b;
        i6Var2.zzl().l();
        String str5 = i6Var2.O;
        if (str5 != null) {
            str5.equals(str4);
        }
        i6Var2.O = str4;
        i6Var2.N = q4Var;
    }
}
