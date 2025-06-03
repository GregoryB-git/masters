package e7;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.measurement.internal.zzig;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class l2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4467a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ k6 f4468b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ zzig f4469c;

    public /* synthetic */ l2(zzig zzigVar, k6 k6Var, int i10) {
        this.f4467a = i10;
        this.f4469c = zzigVar;
        this.f4468b = k6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4467a) {
            case 0:
                zzig.zza(this.f4469c, this.f4468b);
                break;
            case 1:
                this.f4469c.f2908a.c0();
                i6 i6Var = this.f4469c.f2908a;
                k6 k6Var = this.f4468b;
                a0.j.q(i6Var);
                m6.j.e(k6Var.f4437a);
                i6Var.e(k6Var);
                break;
            default:
                this.f4469c.f2908a.c0();
                i6 i6Var2 = this.f4469c.f2908a;
                k6 k6Var2 = this.f4468b;
                if (i6Var2.G != null) {
                    ArrayList arrayList = new ArrayList();
                    i6Var2.H = arrayList;
                    arrayList.addAll(i6Var2.G);
                }
                o oVar = i6Var2.f4332c;
                i6.q(oVar);
                String str = k6Var2.f4437a;
                m6.j.i(str);
                m6.j.e(str);
                oVar.l();
                oVar.p();
                try {
                    SQLiteDatabase s10 = oVar.s();
                    String[] strArr = {str};
                    int delete = s10.delete("apps", "app_id=?", strArr) + 0 + s10.delete("events", "app_id=?", strArr) + s10.delete("events_snapshot", "app_id=?", strArr) + s10.delete("user_attributes", "app_id=?", strArr) + s10.delete("conditional_properties", "app_id=?", strArr) + s10.delete("raw_events", "app_id=?", strArr) + s10.delete("raw_events_metadata", "app_id=?", strArr) + s10.delete("queue", "app_id=?", strArr) + s10.delete("audience_filter_values", "app_id=?", strArr) + s10.delete("main_event_params", "app_id=?", strArr) + s10.delete("default_event_params", "app_id=?", strArr) + s10.delete("trigger_uris", "app_id=?", strArr) + s10.delete("upload_queue", "app_id=?", strArr);
                    if (delete > 0) {
                        oVar.zzj().f4067w.d("Reset analytics data. app, records", str, Integer.valueOf(delete));
                    }
                } catch (SQLiteException e10) {
                    oVar.zzj().f4060o.d("Error resetting analytics data. appId, error", a1.p(str), e10);
                }
                if (k6Var2.f4443p) {
                    i6Var2.Q(k6Var2);
                    break;
                }
                break;
        }
    }
}
