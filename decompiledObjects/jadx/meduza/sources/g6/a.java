package g6;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import eb.y;
import h6.l;
import h6.n;
import k6.d;
import l6.o;
import l6.p;
import m6.j;
import m6.w;
import p2.m0;
import z4.i;

/* loaded from: classes.dex */
public final class a extends k6.d<GoogleSignInOptions> {

    /* renamed from: a, reason: collision with root package name */
    public static final m0 f5898a = new m0();

    /* renamed from: b, reason: collision with root package name */
    public static int f5899b = 1;

    public a(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, b6.a.f1909a, googleSignInOptions, (o) new i(1));
    }

    public a(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, b6.a.f1909a, googleSignInOptions, new d.a(new i(1), Looper.getMainLooper()));
    }

    public final Intent a() {
        Context applicationContext = getApplicationContext();
        int c10 = c();
        int i10 = c10 - 1;
        if (c10 == 0) {
            throw null;
        }
        if (i10 == 2) {
            GoogleSignInOptions apiOptions = getApiOptions();
            n.f7165a.a("getFallbackSignInIntent()", new Object[0]);
            Intent a10 = n.a(applicationContext, apiOptions);
            a10.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
            return a10;
        }
        if (i10 == 3) {
            return n.a(applicationContext, getApiOptions());
        }
        GoogleSignInOptions apiOptions2 = getApiOptions();
        n.f7165a.a("getNoImplementationSignInIntent()", new Object[0]);
        Intent a11 = n.a(applicationContext, apiOptions2);
        a11.setAction("com.google.android.gms.auth.NO_IMPL");
        return a11;
    }

    public final Task<Void> b() {
        BasePendingResult b10;
        k6.e asGoogleApiClient = asGoogleApiClient();
        Context applicationContext = getApplicationContext();
        boolean z10 = c() == 3;
        n.f7165a.a("Revoking access", new Object[0]);
        String e10 = h6.b.a(applicationContext).e("refreshToken");
        n.b(applicationContext);
        if (!z10) {
            b10 = asGoogleApiClient.b(new l(asGoogleApiClient));
        } else if (e10 == null) {
            p6.a aVar = h6.d.f7154c;
            Status status = new Status(4, null, null, null);
            j.a("Status code must not be SUCCESS", !status.D());
            b10 = new k6.o(status);
            b10.setResult(status);
        } else {
            h6.d dVar = new h6.d(e10);
            new Thread(dVar).start();
            b10 = dVar.f7156b;
        }
        y yVar = new y();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        b10.addStatusListener(new w(b10, taskCompletionSource, yVar));
        return taskCompletionSource.getTask();
    }

    public final synchronized int c() {
        int i10;
        i10 = f5899b;
        if (i10 == 1) {
            Context applicationContext = getApplicationContext();
            j6.e eVar = j6.e.f8488d;
            int c10 = eVar.c(applicationContext, 12451000);
            if (c10 == 0) {
                f5899b = 4;
                i10 = 4;
            } else if (eVar.a(applicationContext, null, c10) != null || DynamiteModule.a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                f5899b = 2;
                i10 = 2;
            } else {
                f5899b = 3;
                i10 = 3;
            }
        }
        return i10;
    }

    public final Task<Void> signOut() {
        BasePendingResult b10;
        k6.e asGoogleApiClient = asGoogleApiClient();
        Context applicationContext = getApplicationContext();
        boolean z10 = c() == 3;
        n.f7165a.a("Signing out", new Object[0]);
        n.b(applicationContext);
        if (z10) {
            Status status = Status.f2812e;
            j.j(status, "Result must not be null");
            b10 = new p(asGoogleApiClient);
            b10.setResult(status);
        } else {
            b10 = asGoogleApiClient.b(new h6.j(asGoogleApiClient));
        }
        y yVar = new y();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        b10.addStatusListener(new w(b10, taskCompletionSource, yVar));
        return taskCompletionSource.getTask();
    }
}
