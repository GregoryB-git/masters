package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import b.a0;
import c8.b0;
import c8.b1;
import c8.c1;
import c8.f0;
import c8.p;
import c8.u0;
import c8.v0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zza;
import com.google.android.gms.internal.p002firebaseauthapi.zzadq;
import com.google.android.gms.internal.p002firebaseauthapi.zzads;
import com.google.android.gms.internal.p002firebaseauthapi.zzadv;
import com.google.android.gms.internal.p002firebaseauthapi.zzaee;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import com.google.android.gms.internal.p002firebaseauthapi.zzaj;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;
import f1.a;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import m6.j;
import p.o;
import t9.b;
import u7.f;
import x0.m;

/* loaded from: classes.dex */
public class RecaptchaActivity extends m implements zzads {

    /* renamed from: b, reason: collision with root package name */
    public static long f3107b;

    /* renamed from: c, reason: collision with root package name */
    public static final u0 f3108c = u0.f2524c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3109a = false;

    public final Uri.Builder h(Uri.Builder builder, Intent intent, String str, String str2) {
        String str3;
        String zza;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        f f = f.f(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(f);
        b1 b1Var = b1.f2412a;
        Context applicationContext = getApplicationContext();
        synchronized (b1Var) {
            j.e(str);
            j.e(uuid);
            SharedPreferences a10 = b1.a(applicationContext, str);
            b1.b(a10);
            SharedPreferences.Editor edit = a10.edit();
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", uuid), "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", uuid), stringExtra3);
            edit.apply();
        }
        String b10 = c1.a(getApplicationContext(), f.g()).b();
        if (TextUtils.isEmpty(b10)) {
            Log.e("RecaptchaActivity", "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            i(p.a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        synchronized (firebaseAuth.f3063h) {
            str3 = firebaseAuth.f3064i;
        }
        if (TextUtils.isEmpty(str3)) {
            zza = zzaee.zza();
        } else {
            synchronized (firebaseAuth.f3063h) {
                zza = firebaseAuth.f3064i;
            }
        }
        builder.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", zza).appendQueryParameter("eventId", uuid).appendQueryParameter("v", "X" + stringExtra2).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", b10);
        return builder;
    }

    public final void i(Status status) {
        f3107b = 0L;
        this.f3109a = false;
        Intent intent = new Intent();
        HashMap hashMap = v0.f2529a;
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        a.a(this).b(intent);
        f3108c.a(this);
        finish();
    }

    public final void j() {
        f3107b = 0L;
        this.f3109a = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        a.a(this).b(intent);
        f3108c.a(this);
        finish();
    }

    @Override // x0.m, b.j, u.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("RecaptchaActivity", "Could not do operation - unknown action: " + action);
            j();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f3107b < 30000) {
            Log.e("RecaptchaActivity", "Could not start operation - already in progress");
            return;
        }
        f3107b = currentTimeMillis;
        if (bundle != null) {
            this.f3109a = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
        }
    }

    @Override // b.j, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // x0.m, android.app.Activity
    public final void onResume() {
        String string;
        boolean isEmpty;
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.f3109a) {
                j();
                return;
            }
            Intent intent = getIntent();
            String packageName = getPackageName();
            try {
                String lowerCase = a0.o(v6.a.a(this, packageName)).toLowerCase(Locale.US);
                f f = f.f(intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(f);
                if (zzafm.zza(f)) {
                    f.a();
                    zza(h(Uri.parse(zzafm.zza(f.f15086c.f15096a)).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.f3076v);
                } else {
                    new zzadq(packageName, lowerCase, intent, f, this).executeOnExecutor(firebaseAuth.f3079y, new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("RecaptchaActivity", "Could not get package signature: " + packageName + " " + String.valueOf(e10));
                zzadv.zzb(this, packageName);
            }
            this.f3109a = true;
            return;
        }
        Intent intent2 = getIntent();
        if (intent2.hasExtra("firebaseError")) {
            i(v0.a(intent2.getStringExtra("firebaseError")));
            return;
        }
        if (!intent2.hasExtra("link") || !intent2.hasExtra("eventId")) {
            j();
            return;
        }
        String stringExtra = intent2.getStringExtra("link");
        b1 b1Var = b1.f2412a;
        Context applicationContext = getApplicationContext();
        String packageName2 = getPackageName();
        String stringExtra2 = intent2.getStringExtra("eventId");
        synchronized (b1Var) {
            j.e(packageName2);
            j.e(stringExtra2);
            SharedPreferences a10 = b1.a(applicationContext, packageName2);
            String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", stringExtra2);
            String string2 = a10.getString(format, null);
            String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", stringExtra2);
            string = a10.getString(format2, null);
            SharedPreferences.Editor edit = a10.edit();
            edit.remove(format);
            edit.remove(format2);
            edit.apply();
            isEmpty = TextUtils.isEmpty(string2);
        }
        String str = isEmpty ? null : string;
        if (TextUtils.isEmpty(str)) {
            Log.e("RecaptchaActivity", "Failed to find registration for this event - failing to prevent session injection.");
            i(p.a("Failed to find registration for this reCAPTCHA event"));
        }
        if (intent2.getBooleanExtra("encryptionEnabled", true)) {
            stringExtra = c1.a(getApplicationContext(), f.f(str).g()).c(stringExtra);
        }
        String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
        f3107b = 0L;
        this.f3109a = false;
        Intent intent3 = new Intent();
        intent3.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
        intent3.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent3.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (a.a(this).b(intent3)) {
            f3108c.a(this);
        } else {
            Context applicationContext2 = getApplicationContext();
            zzaj<String> zzajVar = f0.f2444c;
            SharedPreferences.Editor edit2 = applicationContext2.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
            edit2.putString("recaptchaToken", queryParameter);
            edit2.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            edit2.putLong(Constants.TIMESTAMP, System.currentTimeMillis());
            edit2.commit();
        }
        finish();
    }

    @Override // b.j, u.j, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f3109a);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzads
    public final Context zza() {
        return getApplicationContext();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzads
    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return h(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzads
    public final String zza(String str) {
        return zzafm.zzb(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzads
    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zza.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            zzads.zza.c("Error generating connection", new Object[0]);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzads
    public final void zza(Uri uri, final String str, b<a8.a> bVar) {
        a8.a aVar = bVar.get();
        (aVar != null ? aVar.a().continueWith(new b0(uri, 1)) : Tasks.forResult(uri)).addOnCompleteListener(new OnCompleteListener() { // from class: c8.h0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                RecaptchaActivity recaptchaActivity = RecaptchaActivity.this;
                String str2 = str;
                u0 u0Var = RecaptchaActivity.f3108c;
                boolean z10 = false;
                if (!(recaptchaActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null)) {
                    Log.e("RecaptchaActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                    zzadv.zzb(recaptchaActivity, str2);
                    return;
                }
                List<ResolveInfo> queryIntentServices = recaptchaActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    z10 = true;
                }
                if (z10) {
                    p.o a10 = new o.d().a();
                    a10.f12724a.addFlags(1073741824);
                    a10.f12724a.addFlags(268435456);
                    a10.f12724a.setData((Uri) task.getResult());
                    v.a.startActivity(recaptchaActivity, a10.f12724a, a10.f12725b);
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                intent.putExtra("com.android.browser.application_id", str2);
                intent.addFlags(1073741824);
                intent.addFlags(268435456);
                recaptchaActivity.startActivity(intent);
            }
        });
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzads
    public final void zza(String str, Status status) {
        if (status == null) {
            j();
        } else {
            i(status);
        }
    }
}
