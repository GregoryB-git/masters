package e7;

import android.os.Bundle;
import java.util.Iterator;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final /* synthetic */ class o3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4546a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Bundle f4547b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ k3 f4548c;

    public /* synthetic */ o3(k3 k3Var, Bundle bundle, int i10) {
        this.f4546a = i10;
        this.f4548c = k3Var;
        this.f4547b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        boolean z10;
        switch (this.f4546a) {
            case 0:
                k3 k3Var = this.f4548c;
                Bundle bundle2 = this.f4547b;
                if (bundle2.isEmpty()) {
                    bundle = bundle2;
                } else {
                    bundle = new Bundle(k3Var.j().I.a());
                    for (String str : bundle2.keySet()) {
                        Object obj = bundle2.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            k3Var.k();
                            if (r6.T(obj)) {
                                k3Var.k();
                                r6.M(k3Var.F, null, 27, null, null, 0);
                            }
                            k3Var.zzj().t.d("Invalid default event parameter type. Name, value", str, obj);
                        } else if (r6.r0(str)) {
                            k3Var.zzj().t.c("Invalid default event parameter name. Name", str);
                        } else if (obj == null) {
                            bundle.remove(str);
                        } else if (k3Var.k().W("param", str, k3Var.h().n(null, false), obj)) {
                            k3Var.k().E(bundle, str, obj);
                        }
                    }
                    k3Var.k();
                    int i10 = k3Var.h().k().b0(201500000) ? 100 : 25;
                    if (bundle.size() <= i10) {
                        z10 = false;
                    } else {
                        Iterator it = new TreeSet(bundle.keySet()).iterator();
                        int i11 = 0;
                        while (true) {
                            z10 = true;
                            if (it.hasNext()) {
                                String str2 = (String) it.next();
                                i11++;
                                if (i11 > i10) {
                                    bundle.remove(str2);
                                }
                            }
                        }
                    }
                    if (z10) {
                        k3Var.k();
                        r6.M(k3Var.F, null, 26, null, null, 0);
                        k3Var.zzj().t.b("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                }
                k3Var.j().I.b(bundle);
                if (!bundle2.isEmpty() || k3Var.h().x(null, h0.Z0)) {
                    w4 q10 = k3Var.q();
                    q10.l();
                    q10.t();
                    q10.x(new x2(q10, q10.I(false), bundle));
                    break;
                }
                break;
            default:
                k3 k3Var2 = this.f4548c;
                Bundle bundle3 = this.f4547b;
                k3Var2.l();
                k3Var2.t();
                m6.j.i(bundle3);
                String string = bundle3.getString("name");
                String string2 = bundle3.getString("origin");
                m6.j.e(string);
                m6.j.e(string2);
                m6.j.i(bundle3.get("value"));
                if (!((j2) k3Var2.f3407b).d()) {
                    k3Var2.zzj().f4067w.b("Conditional property not set since app measurement is disabled");
                    break;
                } else {
                    q6 q6Var = new q6(string, string2, bundle3.getLong("triggered_timestamp"), bundle3.get("value"));
                    try {
                        r6 k10 = k3Var2.k();
                        bundle3.getString("app_id");
                        f0 y10 = k10.y(bundle3.getString("triggered_event_name"), bundle3.getBundle("triggered_event_params"), string2, 0L, true);
                        r6 k11 = k3Var2.k();
                        bundle3.getString("app_id");
                        f0 y11 = k11.y(bundle3.getString("timed_out_event_name"), bundle3.getBundle("timed_out_event_params"), string2, 0L, true);
                        r6 k12 = k3Var2.k();
                        bundle3.getString("app_id");
                        k3Var2.q().v(new f(bundle3.getString("app_id"), string2, q6Var, bundle3.getLong("creation_timestamp"), false, bundle3.getString("trigger_event_name"), y11, bundle3.getLong("trigger_timeout"), y10, bundle3.getLong("time_to_live"), k12.y(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), string2, 0L, true)));
                        break;
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
        }
    }
}
