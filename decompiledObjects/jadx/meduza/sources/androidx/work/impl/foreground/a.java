package androidx.work.impl.foreground;

import android.content.Context;
import android.content.Intent;
import b.a0;
import defpackage.f;
import ec.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import nc.j1;
import o2.j;
import p2.k0;
import p2.r;
import p2.x;
import t2.b;
import t2.d;
import t2.e;
import x2.l;
import x2.s;
import y2.t;

/* loaded from: classes.dex */
public final class a implements d, p2.d {

    /* renamed from: r, reason: collision with root package name */
    public static final String f1529r = j.f("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public k0 f1530a;

    /* renamed from: b, reason: collision with root package name */
    public final a3.b f1531b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1532c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public l f1533d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f1534e;
    public final HashMap f;

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f1535o;

    /* renamed from: p, reason: collision with root package name */
    public final e f1536p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC0026a f1537q;

    /* renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    public interface InterfaceC0026a {
    }

    public a(Context context) {
        k0 d10 = k0.d(context);
        this.f1530a = d10;
        this.f1531b = d10.f12880d;
        this.f1533d = null;
        this.f1534e = new LinkedHashMap();
        this.f1535o = new HashMap();
        this.f = new HashMap();
        this.f1536p = new e(this.f1530a.f12885j);
        this.f1530a.f.a(this);
    }

    public static Intent b(Context context, l lVar, o2.d dVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", dVar.f11712a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", dVar.f11713b);
        intent.putExtra("KEY_NOTIFICATION", dVar.f11714c);
        intent.putExtra("KEY_WORKSPEC_ID", lVar.f16820a);
        intent.putExtra("KEY_GENERATION", lVar.f16821b);
        return intent;
    }

    public static Intent c(Context context, l lVar, o2.d dVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", lVar.f16820a);
        intent.putExtra("KEY_GENERATION", lVar.f16821b);
        intent.putExtra("KEY_NOTIFICATION_ID", dVar.f11712a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", dVar.f11713b);
        intent.putExtra("KEY_NOTIFICATION", dVar.f11714c);
        return intent;
    }

    @Override // p2.d
    public final void a(l lVar, boolean z10) {
        Map.Entry entry;
        synchronized (this.f1532c) {
            j1 j1Var = ((s) this.f.remove(lVar)) != null ? (j1) this.f1535o.remove(lVar) : null;
            if (j1Var != null) {
                j1Var.cancel((CancellationException) null);
            }
        }
        o2.d dVar = (o2.d) this.f1534e.remove(lVar);
        if (lVar.equals(this.f1533d)) {
            if (this.f1534e.size() > 0) {
                Iterator it = this.f1534e.entrySet().iterator();
                do {
                    entry = (Map.Entry) it.next();
                } while (it.hasNext());
                this.f1533d = (l) entry.getKey();
                if (this.f1537q != null) {
                    o2.d dVar2 = (o2.d) entry.getValue();
                    InterfaceC0026a interfaceC0026a = this.f1537q;
                    SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC0026a;
                    systemForegroundService.f1525b.post(new b(systemForegroundService, dVar2.f11712a, dVar2.f11714c, dVar2.f11713b));
                    SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f1537q;
                    systemForegroundService2.f1525b.post(new w2.d(systemForegroundService2, dVar2.f11712a));
                }
            } else {
                this.f1533d = null;
            }
        }
        InterfaceC0026a interfaceC0026a2 = this.f1537q;
        if (dVar == null || interfaceC0026a2 == null) {
            return;
        }
        j d10 = j.d();
        String str = f1529r;
        StringBuilder l10 = f.l("Removing Notification (id: ");
        l10.append(dVar.f11712a);
        l10.append(", workSpecId: ");
        l10.append(lVar);
        l10.append(", notificationType: ");
        l10.append(dVar.f11713b);
        d10.a(str, l10.toString());
        SystemForegroundService systemForegroundService3 = (SystemForegroundService) interfaceC0026a2;
        systemForegroundService3.f1525b.post(new w2.d(systemForegroundService3, dVar.f11712a));
    }

    @Override // t2.d
    public final void d(s sVar, t2.b bVar) {
        if (bVar instanceof b.C0227b) {
            String str = sVar.f16830a;
            j.d().a(f1529r, "Constraints unmet for WorkSpec " + str);
            k0 k0Var = this.f1530a;
            l s10 = a0.s(sVar);
            a3.b bVar2 = k0Var.f12880d;
            r rVar = k0Var.f;
            x xVar = new x(s10);
            i.e(rVar, "processor");
            bVar2.d(new t(rVar, xVar, true, -512));
        }
    }

    public final void e() {
        this.f1537q = null;
        synchronized (this.f1532c) {
            Iterator it = this.f1535o.values().iterator();
            while (it.hasNext()) {
                ((j1) it.next()).cancel((CancellationException) null);
            }
        }
        r rVar = this.f1530a.f;
        synchronized (rVar.f12953k) {
            rVar.f12952j.remove(this);
        }
    }
}
