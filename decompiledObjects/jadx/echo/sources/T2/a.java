package T2;

import A2.AbstractC0317c;
import A2.AbstractC0321g;
import A2.AbstractC0328n;
import A2.C0318d;
import A2.G;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import u2.C2007a;
import x2.AbstractC2200n;
import x2.C2188b;
import y2.e;

/* loaded from: classes.dex */
public class a extends AbstractC0321g implements S2.e {

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f6063M = 0;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f6064I;

    /* renamed from: J, reason: collision with root package name */
    public final C0318d f6065J;

    /* renamed from: K, reason: collision with root package name */
    public final Bundle f6066K;

    /* renamed from: L, reason: collision with root package name */
    public final Integer f6067L;

    public a(Context context, Looper looper, boolean z7, C0318d c0318d, Bundle bundle, e.a aVar, e.b bVar) {
        super(context, looper, 44, c0318d, aVar, bVar);
        this.f6064I = true;
        this.f6065J = c0318d;
        this.f6066K = bundle;
        this.f6067L = c0318d.g();
    }

    public static Bundle l0(C0318d c0318d) {
        c0318d.f();
        Integer g7 = c0318d.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c0318d.a());
        if (g7 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", g7.intValue());
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

    @Override // A2.AbstractC0317c
    public final Bundle A() {
        if (!y().getPackageName().equals(this.f6065J.d())) {
            this.f6066K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f6065J.d());
        }
        return this.f6066K;
    }

    @Override // A2.AbstractC0317c
    public final String E() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // A2.AbstractC0317c
    public final String F() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // S2.e
    public final void d(f fVar) {
        AbstractC0328n.j(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b7 = this.f6065J.b();
            ((g) D()).Z0(new j(1, new G(b7, ((Integer) AbstractC0328n.i(this.f6067L)).intValue(), "<<default account>>".equals(b7.name) ? C2007a.a(y()).b() : null)), fVar);
        } catch (RemoteException e7) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.K(new l(1, new C2188b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e7);
            }
        }
    }

    @Override // A2.AbstractC0317c, y2.C2270a.f
    public final int h() {
        return AbstractC2200n.f21186a;
    }

    @Override // A2.AbstractC0317c, y2.C2270a.f
    public final boolean m() {
        return this.f6064I;
    }

    @Override // S2.e
    public final void n() {
        p(new AbstractC0317c.d());
    }

    @Override // A2.AbstractC0317c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }
}
