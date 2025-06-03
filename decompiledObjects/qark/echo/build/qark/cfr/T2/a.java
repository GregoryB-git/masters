/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.os.RemoteException
 *  android.util.Log
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package T2;

import A2.G;
import A2.I;
import A2.c;
import A2.d;
import A2.n;
import T2.f;
import T2.g;
import T2.j;
import T2.l;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import x2.b;
import y2.e;

public class a
extends A2.g
implements S2.e {
    public static final /* synthetic */ int M = 0;
    public final boolean I = true;
    public final d J;
    public final Bundle K;
    public final Integer L;

    public a(Context context, Looper looper, boolean bl, d d8, Bundle bundle, e.a a8, e.b b8) {
        super(context, looper, 44, d8, a8, b8);
        this.J = d8;
        this.K = bundle;
        this.L = d8.g();
    }

    public static Bundle l0(d d8) {
        d8.f();
        Integer n8 = d8.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", (Parcelable)d8.a());
        if (n8 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", n8.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override
    public final Bundle A() {
        String string2 = this.J.d();
        if (!this.y().getPackageName().equals((Object)string2)) {
            this.K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.J.d());
        }
        return this.K;
    }

    @Override
    public final String E() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override
    public final String F() {
        return "com.google.android.gms.signin.service.START";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d(f f8) {
        Account account;
        B2.a a82;
        n.j(f8, "Expecting a valid ISignInCallbacks");
        try {
            account = this.J.b();
            B2.a a82 = "<<default account>>".equals((Object)account.name) ? u2.a.a(this.y()).b() : null;
        }
        catch (RemoteException remoteException) {}
        Log.w((String)"SignInClientImpl", (String)"Remote service probably died when signIn is called");
        try {
            f8.K(new l(1, new b(8, null), null));
            return;
        }
        catch (RemoteException remoteException) {}
        Log.wtf((String)"SignInClientImpl", (String)"ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", (Throwable)remoteException);
        return;
        a82 = new G(account, (Integer)n.i((Object)this.L), (GoogleSignInAccount)a82);
        ((g)this.D()).Z0(new j(1, (G)a82), f8);
    }

    @Override
    public final int h() {
        return 12451000;
    }

    @Override
    public final boolean m() {
        return this.I;
    }

    @Override
    public final void n() {
        this.p(new c.d((c)this));
    }

    @Override
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (iInterface instanceof g) {
            return (g)iInterface;
        }
        return new g(iBinder);
    }
}

