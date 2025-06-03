package com.google.android.gms.internal.p000authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.b;
import d6.c;
import d6.d0;
import d6.e;
import d6.f;
import d6.j;
import d6.k;
import java.util.Iterator;
import java.util.Set;
import k6.a;
import k6.d;
import l6.n;
import l6.q;

/* loaded from: classes.dex */
public final class zbaq extends d implements j {
    private static final a.g zba;
    private static final a.AbstractC0130a zbb;
    private static final a zbc;
    private final String zbd;

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbal zbalVar = new zbal();
        zbb = zbalVar;
        zbc = new a("Auth.Api.Identity.SignIn.API", zbalVar, gVar);
    }

    public zbaq(Activity activity, d0 d0Var) {
        super(activity, (a<d0>) zbc, d0Var, d.a.f9097c);
        this.zbd = zbat.zba();
    }

    public zbaq(Context context, d0 d0Var) {
        super(context, (a<d0>) zbc, d0Var, d.a.f9097c);
        this.zbd = zbat.zba();
    }

    @Override // d6.j
    public final Task<c> beginSignIn(b bVar) {
        m6.j.i(bVar);
        new b.d(false);
        new b.a(false, null, null, true, null, null, false);
        new b.c(false, null, null);
        new b.C0063b(null, false);
        b.a aVar = bVar.f3540b;
        m6.j.i(aVar);
        b.d dVar = bVar.f3539a;
        m6.j.i(dVar);
        b.c cVar = bVar.f;
        m6.j.i(cVar);
        b.C0063b c0063b = bVar.f3544o;
        m6.j.i(c0063b);
        final b bVar2 = new b(dVar, aVar, this.zbd, bVar.f3542d, bVar.f3543e, cVar, c0063b);
        q.a aVar2 = new q.a();
        aVar2.f9716c = new j6.d[]{zbas.zba};
        aVar2.f9714a = new n() { // from class: com.google.android.gms.internal.auth-api.zbaj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l6.n
            public final void accept(Object obj, Object obj2) {
                zbam zbamVar = new zbam(zbaq.this, (TaskCompletionSource) obj2);
                zbw zbwVar = (zbw) ((zbar) obj).getService();
                b bVar3 = bVar2;
                m6.j.i(bVar3);
                zbwVar.zbc(zbamVar, bVar3);
            }
        };
        aVar2.f9715b = false;
        aVar2.f9717d = 1553;
        return doRead(aVar2.a());
    }

    public final String getPhoneNumberFromIntent(Intent intent) {
        if (intent == null) {
            throw new k6.b(Status.f2813o);
        }
        Status status = (Status) n6.d.a(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new k6.b(Status.f2815q);
        }
        if (!status.D()) {
            throw new k6.b(status);
        }
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new k6.b(Status.f2813o);
    }

    public final Task<PendingIntent> getPhoneNumberHintIntent(final e eVar) {
        m6.j.i(eVar);
        q.a aVar = new q.a();
        aVar.f9716c = new j6.d[]{zbas.zbh};
        aVar.f9714a = new n() { // from class: com.google.android.gms.internal.auth-api.zbah
            @Override // l6.n
            public final void accept(Object obj, Object obj2) {
                zbaq.this.zba(eVar, (zbar) obj, (TaskCompletionSource) obj2);
            }
        };
        aVar.f9717d = 1653;
        return doRead(aVar.a());
    }

    public final k getSignInCredentialFromIntent(Intent intent) {
        if (intent == null) {
            throw new k6.b(Status.f2813o);
        }
        Status status = (Status) n6.d.a(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new k6.b(Status.f2815q);
        }
        if (!status.D()) {
            throw new k6.b(status);
        }
        k kVar = (k) n6.d.a(intent, "sign_in_credential", k.CREATOR);
        if (kVar != null) {
            return kVar;
        }
        throw new k6.b(Status.f2813o);
    }

    @Override // d6.j
    public final Task<PendingIntent> getSignInIntent(f fVar) {
        m6.j.i(fVar);
        String str = fVar.f3559a;
        m6.j.i(str);
        final f fVar2 = new f(str, fVar.f3560b, this.zbd, fVar.f3562d, fVar.f3563e, fVar.f);
        q.a aVar = new q.a();
        aVar.f9716c = new j6.d[]{zbas.zbf};
        aVar.f9714a = new n() { // from class: com.google.android.gms.internal.auth-api.zbak
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l6.n
            public final void accept(Object obj, Object obj2) {
                zbao zbaoVar = new zbao(zbaq.this, (TaskCompletionSource) obj2);
                zbw zbwVar = (zbw) ((zbar) obj).getService();
                f fVar3 = fVar2;
                m6.j.i(fVar3);
                zbwVar.zbe(zbaoVar, fVar3);
            }
        };
        aVar.f9717d = 1555;
        return doRead(aVar.a());
    }

    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = k6.e.f9100a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((k6.e) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        synchronized (l6.d.f9643z) {
            l6.d dVar = l6.d.A;
            if (dVar != null) {
                dVar.f9651q.incrementAndGet();
                zau zauVar = dVar.f9655v;
                zauVar.sendMessageAtFrontOfQueue(zauVar.obtainMessage(10));
            }
        }
        q.a aVar = new q.a();
        aVar.f9716c = new j6.d[]{zbas.zbb};
        aVar.f9714a = new n() { // from class: com.google.android.gms.internal.auth-api.zbai
            @Override // l6.n
            public final void accept(Object obj, Object obj2) {
                zbaq.this.zbb((zbar) obj, (TaskCompletionSource) obj2);
            }
        };
        aVar.f9715b = false;
        aVar.f9717d = 1554;
        return doWrite(aVar.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zba(e eVar, zbar zbarVar, TaskCompletionSource taskCompletionSource) {
        ((zbw) zbarVar.getService()).zbd(new zbap(this, taskCompletionSource), eVar, this.zbd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zbb(zbar zbarVar, TaskCompletionSource taskCompletionSource) {
        ((zbw) zbarVar.getService()).zbf(new zban(this, taskCompletionSource), this.zbd);
    }
}
