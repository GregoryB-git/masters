package i6;

import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import e7.e3;
import e7.h0;
import e7.i5;
import e7.i6;
import e7.j1;
import e7.j2;
import e7.k3;
import e7.l1;
import e7.l5;
import e7.m0;
import e7.n0;
import e7.p4;
import e7.q1;
import e7.q6;
import e7.r6;
import e7.t1;
import e7.w1;
import e7.w4;
import e7.x5;
import e7.y6;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7607a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7608b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7609c;

    public /* synthetic */ t(int i10, Object obj, Object obj2) {
        this.f7607a = i10;
        this.f7608b = obj2;
        this.f7609c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 2;
        boolean z10 = true;
        switch (this.f7607a) {
            case 0:
                u uVar = (u) this.f7608b;
                int i11 = ((x) this.f7609c).f7617a;
                synchronized (uVar) {
                    x xVar = (x) uVar.f7614e.get(i11);
                    if (xVar != null) {
                        Log.w("MessengerIpcClient", "Timing out request: " + i11);
                        uVar.f7614e.remove(i11);
                        xVar.c(new z3.f("Timed out waiting for response", (SecurityException) null));
                        uVar.c();
                    }
                }
                return;
            case 1:
                k3 k3Var = (k3) this.f7609c;
                Bundle bundle = (Bundle) this.f7608b;
                k3Var.l();
                k3Var.t();
                m6.j.i(bundle);
                String string = bundle.getString("name");
                m6.j.e(string);
                if (!((j2) k3Var.f3407b).d()) {
                    k3Var.zzj().f4067w.b("Conditional property not cleared since app measurement is disabled");
                    return;
                }
                q6 q6Var = new q6(string, "", 0L, null);
                try {
                    r6 k10 = k3Var.k();
                    bundle.getString("app_id");
                    k3Var.q().v(new e7.f(bundle.getString("app_id"), "", q6Var, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), k10.y(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true)));
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 2:
                l1 j10 = ((k3) this.f7609c).j();
                e7.x xVar2 = (e7.x) this.f7608b;
                j10.l();
                if (e3.i(xVar2.f4744a, j10.x().f4744a)) {
                    SharedPreferences.Editor edit = j10.v().edit();
                    edit.putString("dma_consent_settings", xVar2.f4745b);
                    edit.apply();
                } else {
                    z10 = false;
                }
                if (!z10) {
                    ((k3) this.f7609c).zzj().f4065u.c("Lower precedence consent source ignored, proposed source", Integer.valueOf(((e7.x) this.f7608b).f4744a));
                    return;
                }
                ((k3) this.f7609c).zzj().f4067w.c("Setting DMA consent(FE)", (e7.x) this.f7608b);
                if (!((k3) this.f7609c).q().E()) {
                    ((k3) this.f7609c).q().z(false);
                    return;
                }
                w4 q10 = ((k3) this.f7609c).q();
                q10.l();
                q10.t();
                q10.x(new f(q10, i10));
                return;
            case 3:
                synchronized (((i5) this.f7609c)) {
                    ((i5) this.f7609c).f4327a = false;
                    if (!((i5) this.f7609c).f4329c.C()) {
                        ((i5) this.f7609c).f4329c.zzj().f4067w.b("Connected to service");
                        w4 w4Var = ((i5) this.f7609c).f4329c;
                        n0 n0Var = (n0) this.f7608b;
                        w4Var.l();
                        m6.j.i(n0Var);
                        w4Var.f4735e = n0Var;
                        w4Var.H();
                        w4Var.G();
                    }
                }
                return;
            case 4:
                ((i6) this.f7608b).c0();
                i6 i6Var = (i6) this.f7608b;
                Runnable runnable = (Runnable) this.f7609c;
                i6Var.zzl().l();
                if (i6Var.f4343x == null) {
                    i6Var.f4343x = new ArrayList();
                }
                i6Var.f4343x.add(runnable);
                ((i6) this.f7608b).e0();
                return;
            case 5:
                i6 i6Var2 = (i6) this.f7609c;
                i6Var2.zzl().l();
                i6Var2.f4339s = new t1(i6Var2);
                e7.o oVar = new e7.o(i6Var2);
                oVar.q();
                i6Var2.f4332c = oVar;
                e7.h R = i6Var2.R();
                w1 w1Var = i6Var2.f4330a;
                m6.j.i(w1Var);
                R.f4229e = w1Var;
                l5 l5Var = new l5(i6Var2);
                l5Var.q();
                i6Var2.f4337q = l5Var;
                y6 y6Var = new y6(i6Var2);
                y6Var.q();
                i6Var2.f = y6Var;
                p4 p4Var = new p4(i6Var2);
                p4Var.q();
                i6Var2.f4336p = p4Var;
                x5 x5Var = new x5(i6Var2);
                x5Var.q();
                i6Var2.f4334e = x5Var;
                i6Var2.f4333d = new j1(i6Var2);
                if (i6Var2.f4345z != i6Var2.A) {
                    i6Var2.zzj().f4060o.d("Not all upload components initialized", Integer.valueOf(i6Var2.f4345z), Integer.valueOf(i6Var2.A));
                }
                i6Var2.f4340u = true;
                i6 i6Var3 = (i6) this.f7609c;
                i6Var3.zzl().l();
                e7.o oVar2 = i6Var3.f4332c;
                i6.q(oVar2);
                oVar2.B0();
                e7.o oVar3 = i6Var3.f4332c;
                i6.q(oVar3);
                oVar3.l();
                oVar3.p();
                if (oVar3.Y()) {
                    m0<Long> m0Var = h0.f4268q0;
                    if (m0Var.a(null).longValue() != 0) {
                        SQLiteDatabase s10 = oVar3.s();
                        ((b.z) oVar3.zzb()).getClass();
                        int delete = s10.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(m0Var.a(null))});
                        if (delete > 0) {
                            oVar3.zzj().f4067w.c("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(delete));
                        }
                    }
                }
                if (i6Var3.f4337q.f4473q.a() == 0) {
                    q1 q1Var = i6Var3.f4337q.f4473q;
                    ((b.z) i6Var3.zzb()).getClass();
                    q1Var.b(System.currentTimeMillis());
                }
                i6Var3.F();
                return;
            default:
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(u7.f.f((String) this.f7608b));
                if (firebaseAuth.f != null) {
                    Task<b8.s> d10 = firebaseAuth.d(true);
                    c8.r.f2508g.e("Token refreshing started", new Object[0]);
                    d10.addOnFailureListener(new b1.v(this));
                    return;
                }
                return;
        }
    }

    public t(c8.r rVar, String str) {
        this.f7607a = 6;
        this.f7609c = rVar;
        m6.j.e(str);
        this.f7608b = str;
    }

    public t(i6 i6Var, Runnable runnable) {
        this.f7607a = 4;
        this.f7608b = i6Var;
        this.f7609c = runnable;
    }

    public /* synthetic */ t(u uVar, x xVar) {
        this.f7607a = 0;
        this.f7608b = uVar;
        this.f7609c = xVar;
    }
}
