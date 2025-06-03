package com.google.android.gms.common.api.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.signin.internal.zac;
import g7.f;
import h7.h;
import h7.j;
import java.util.Set;
import k6.e;
import l6.d0;
import l6.g0;
import l6.q0;
import l6.r0;
import m6.x;

/* loaded from: classes.dex */
public final class zact extends zac implements e.a, e.b {

    /* renamed from: v, reason: collision with root package name */
    public static final g7.b f2820v = g7.e.f5905a;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2821a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f2822b;

    /* renamed from: c, reason: collision with root package name */
    public final g7.b f2823c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f2824d;

    /* renamed from: e, reason: collision with root package name */
    public final m6.a f2825e;
    public f f;

    /* renamed from: u, reason: collision with root package name */
    public r0 f2826u;

    public zact(Context context, Handler handler, m6.a aVar) {
        g7.b bVar = f2820v;
        this.f2821a = context;
        this.f2822b = handler;
        this.f2825e = aVar;
        this.f2824d = aVar.f10241b;
        this.f2823c = bVar;
    }

    @Override // com.google.android.gms.signin.internal.zac, h7.d
    public final void L1(j jVar) {
        this.f2822b.post(new q0(0, this, jVar));
    }

    @Override // l6.j
    public final void g(j6.b bVar) {
        ((g0) this.f2826u).b(bVar);
    }

    @Override // l6.c
    public final void r(int i10) {
        g0 g0Var = (g0) this.f2826u;
        d0 d0Var = (d0) g0Var.f.f9652r.get(g0Var.f9681b);
        if (d0Var != null) {
            if (d0Var.f9664w) {
                d0Var.p(new j6.b(17));
            } else {
                d0Var.r(i10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l6.c
    public final void s() {
        h7.a aVar = (h7.a) this.f;
        aVar.getClass();
        try {
            Account account = aVar.f7173b.f10240a;
            if (account == null) {
                account = new Account(com.google.android.gms.common.internal.a.DEFAULT_ACCOUNT, "com.google");
            }
            GoogleSignInAccount b10 = com.google.android.gms.common.internal.a.DEFAULT_ACCOUNT.equals(account.name) ? h6.b.a(aVar.getContext()).b() : null;
            Integer num = aVar.f7175d;
            m6.j.i(num);
            x xVar = new x(2, account, num.intValue(), b10);
            h7.e eVar = (h7.e) aVar.getService();
            h hVar = new h(1, xVar);
            Parcel zaa = eVar.zaa();
            com.google.android.gms.internal.base.zac.zac(zaa, hVar);
            com.google.android.gms.internal.base.zac.zad(zaa, this);
            eVar.zac(12, zaa);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                L1(new j(1, new j6.b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }
}
