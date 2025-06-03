package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import b1.o;
import b1.x;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import d1.a;
import d1.b;
import h6.s;
import java.lang.reflect.Modifier;
import java.util.Set;
import k6.e;
import x0.m;

/* loaded from: classes.dex */
public class SignInHubActivity extends m {
    public static boolean f = false;

    /* renamed from: a, reason: collision with root package name */
    public boolean f2802a = false;

    /* renamed from: b, reason: collision with root package name */
    public SignInConfiguration f2803b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2804c;

    /* renamed from: d, reason: collision with root package name */
    public int f2805d;

    /* renamed from: e, reason: collision with root package name */
    public Intent f2806e;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void h() {
        a supportLoaderManager = getSupportLoaderManager();
        s sVar = new s(this);
        b bVar = (b) supportLoaderManager;
        if (bVar.f3333b.f3342e) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        b.a aVar = (b.a) bVar.f3333b.f3341d.c(0, null);
        if (aVar == null) {
            try {
                bVar.f3333b.f3342e = true;
                Set set = e.f9100a;
                synchronized (set) {
                }
                h6.e eVar = new h6.e(this, set);
                if (h6.e.class.isMemberClass() && !Modifier.isStatic(h6.e.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + eVar);
                }
                b.a aVar2 = new b.a(eVar);
                bVar.f3333b.f3341d.d(0, aVar2);
                bVar.f3333b.f3342e = false;
                o oVar = bVar.f3332a;
                b.C0060b<D> c0060b = new b.C0060b<>(aVar2.f3336c, sVar);
                aVar2.observe(oVar, c0060b);
                x xVar = aVar2.f3338e;
                if (xVar != null) {
                    aVar2.removeObserver(xVar);
                }
                aVar2.f3337d = oVar;
                aVar2.f3338e = c0060b;
            } catch (Throwable th) {
                bVar.f3333b.f3342e = false;
                throw th;
            }
        } else {
            o oVar2 = bVar.f3332a;
            b.C0060b<D> c0060b2 = new b.C0060b<>(aVar.f3336c, sVar);
            aVar.observe(oVar2, c0060b2);
            x xVar2 = aVar.f3338e;
            if (xVar2 != null) {
                aVar.removeObserver(xVar2);
            }
            aVar.f3337d = oVar2;
            aVar.f3338e = c0060b2;
        }
        f = false;
    }

    public final void i(int i10) {
        Status status = new Status(i10, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f = false;
    }

    @Override // x0.m, b.j, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f2802a) {
            return;
        }
        setResult(0);
        if (i10 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f2798b) != null) {
                h6.o a10 = h6.o.a(this);
                GoogleSignInOptions googleSignInOptions = this.f2803b.f2801b;
                synchronized (a10) {
                    a10.f7167a.d(googleSignInAccount, googleSignInOptions);
                    a10.f7168b = googleSignInAccount;
                    a10.f7169c = googleSignInOptions;
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f2804c = true;
                this.f2805d = i11;
                this.f2806e = intent;
                h();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                i(intExtra);
                return;
            }
        }
        i(8);
    }

    @Override // x0.m, b.j, u.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            i(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        bundleExtra.getClass();
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f2803b = signInConfiguration;
        if (bundle != null) {
            boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
            this.f2804c = z10;
            if (z10) {
                this.f2805d = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                intent2.getClass();
                this.f2806e = intent2;
                h();
                return;
            }
            return;
        }
        if (f) {
            setResult(0);
            i(12502);
            return;
        }
        f = true;
        Intent intent3 = new Intent(action);
        intent3.setPackage(action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") ? "com.google.android.gms" : getPackageName());
        intent3.putExtra("config", this.f2803b);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f2802a = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            i(17);
        }
    }

    @Override // x0.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f = false;
    }

    @Override // b.j, u.j, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f2804c);
        if (this.f2804c) {
            bundle.putInt("signInResultCode", this.f2805d);
            bundle.putParcelable("signInResultData", this.f2806e);
        }
    }
}
