// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T2;

import android.os.BaseBundle;
import android.os.IInterface;
import android.os.IBinder;
import A2.c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import android.accounts.Account;
import android.os.RemoteException;
import A2.I;
import android.app.PendingIntent;
import x2.b;
import android.util.Log;
import A2.G;
import A2.n;
import android.os.Parcelable;
import android.os.Looper;
import android.content.Context;
import android.os.Bundle;
import A2.d;
import S2.e;
import A2.g;

public class a extends g implements e
{
    public final boolean I;
    public final d J;
    public final Bundle K;
    public final Integer L;
    
    public a(final Context context, final Looper looper, final boolean b, final d j, final Bundle k, final y2.e.a a, final e.b b2) {
        super(context, looper, 44, j, a, b2);
        this.I = true;
        this.J = j;
        this.K = k;
        this.L = j.g();
    }
    
    public static Bundle l0(final d d) {
        d.f();
        final Integer g = d.g();
        final Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", (Parcelable)d.a());
        if (g != null) {
            ((BaseBundle)bundle).putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", (int)g);
        }
        ((BaseBundle)bundle).putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        ((BaseBundle)bundle).putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        ((BaseBundle)bundle).putString("com.google.android.gms.signin.internal.serverClientId", (String)null);
        ((BaseBundle)bundle).putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        ((BaseBundle)bundle).putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        ((BaseBundle)bundle).putString("com.google.android.gms.signin.internal.hostedDomain", (String)null);
        ((BaseBundle)bundle).putString("com.google.android.gms.signin.internal.logSessionId", (String)null);
        ((BaseBundle)bundle).putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }
    
    @Override
    public final Bundle A() {
        if (!this.y().getPackageName().equals(this.J.d())) {
            ((BaseBundle)this.K).putString("com.google.android.gms.signin.internal.realClientPackageName", this.J.d());
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
    
    @Override
    public final void d(final T2.f ex) {
        while (true) {
            A2.n.j(ex, "Expecting a valid ISignInCallbacks");
            while (true) {
                Label_0137: {
                    while (true) {
                        try {
                            final Account b = this.J.b();
                            if ("<<default account>>".equals(b.name)) {
                                final GoogleSignInAccount b2 = u2.a.a(this.y()).b();
                                ((g)this.D()).Z0(new j(1, new G(b, (int)A2.n.i(this.L), b2)), (T2.f)ex);
                                return;
                            }
                            break Label_0137;
                            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
                            try {
                                ((T2.f)ex).K(new l(1, new b(8, null), null));
                                return;
                                final RemoteException ex2;
                                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", (Throwable)ex2);
                                return;
                            }
                            catch (RemoteException ex) {}
                        }
                        catch (RemoteException ex2) {
                            continue;
                        }
                        break;
                    }
                }
                final GoogleSignInAccount b2 = null;
                continue;
            }
        }
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
        this.p((c)new d());
    }
}
