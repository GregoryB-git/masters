package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import b.a0;
import c8.b0;
import c8.b1;
import c8.c1;
import c8.d1;
import c8.f0;
import c8.p;
import c8.u0;
import c8.v0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zza;
import com.google.android.gms.internal.p002firebaseauthapi.zzadq;
import com.google.android.gms.internal.p002firebaseauthapi.zzads;
import com.google.android.gms.internal.p002firebaseauthapi.zzadv;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import com.google.android.gms.internal.p002firebaseauthapi.zzaic;
import com.google.android.gms.internal.p002firebaseauthapi.zzaj;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import f1.a;
import io.flutter.plugins.firebase.auth.Constants;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import l6.t;
import m6.j;
import org.json.JSONException;
import org.json.JSONObject;
import t9.b;
import u7.f;
import x0.m;

/* loaded from: classes.dex */
public class GenericIdpActivity extends m implements zzads {

    /* renamed from: b, reason: collision with root package name */
    public static long f3104b;

    /* renamed from: c, reason: collision with root package name */
    public static final u0 f3105c = u0.f2524c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3106a = false;

    public final Uri.Builder h(Uri.Builder builder, Intent intent, String str, String str2) {
        String jSONObject;
        String str3;
        String str4;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String join = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        Bundle bundleExtra = intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            jSONObject = null;
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                for (String str5 : bundleExtra.keySet()) {
                    String string = bundleExtra.getString(str5);
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject2.put(str5, string);
                    }
                }
            } catch (JSONException unused) {
                Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
            }
            jSONObject = jSONObject2.toString();
        }
        String uuid = UUID.randomUUID().toString();
        String zza = zzadv.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        b1 b1Var = b1.f2412a;
        Context applicationContext = getApplicationContext();
        synchronized (b1Var) {
            j.e(str);
            j.e(uuid);
            j.e(zza);
            j.e(stringExtra4);
            SharedPreferences a10 = b1.a(applicationContext, str);
            b1.b(a10);
            SharedPreferences.Editor edit = a10.edit();
            str3 = jSONObject;
            str4 = join;
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", uuid), zza);
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", uuid), action);
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", uuid), stringExtra2);
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", uuid), stringExtra4);
            edit.putString("com.google.firebase.auth.api.gms.config.tenant.id", stringExtra3);
            edit.apply();
        }
        String b10 = c1.a(getApplicationContext(), f.f(stringExtra4).g()).b();
        if (TextUtils.isEmpty(b10)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            i(p.a("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        }
        if (zza == null) {
            return null;
        }
        builder.appendQueryParameter("eid", "p").appendQueryParameter("v", "X" + stringExtra5).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter(Constants.PROVIDER_ID, stringExtra2).appendQueryParameter("sessionId", zza).appendQueryParameter("eventId", uuid).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", b10);
        if (!TextUtils.isEmpty(str4)) {
            builder.appendQueryParameter("scopes", str4);
        }
        if (!TextUtils.isEmpty(str3)) {
            builder.appendQueryParameter("customParameters", str3);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            builder.appendQueryParameter("tid", stringExtra3);
        }
        return builder;
    }

    public final void i(Status status) {
        f3104b = 0L;
        this.f3106a = false;
        Intent intent = new Intent();
        HashMap hashMap = v0.f2529a;
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (a.a(this).b(intent)) {
            f3105c.a(this);
        } else {
            f0.a(getApplicationContext(), status);
        }
        finish();
    }

    public final void j() {
        f3104b = 0L;
        this.f3106a = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (a.a(this).b(intent)) {
            f3105c.a(this);
        } else {
            f0.a(this, p.a("WEB_CONTEXT_CANCELED"));
        }
        finish();
    }

    @Override // x0.m, b.j, u.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("GenericIdpActivity", "Could not do operation - unknown action: " + action);
            j();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f3104b < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        f3104b = currentTimeMillis;
        if (bundle != null) {
            this.f3106a = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
        }
    }

    @Override // b.j, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // x0.m, android.app.Activity
    public final void onResume() {
        d1 d1Var;
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.f3106a) {
                j();
                return;
            }
            String packageName = getPackageName();
            try {
                String lowerCase = a0.o(v6.a.a(this, packageName)).toLowerCase(Locale.US);
                f f = f.f(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(f);
                if (zzafm.zza(f)) {
                    f.a();
                    zza(h(Uri.parse(zzafm.zza(f.f15086c.f15096a)).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.f3076v);
                } else {
                    new zzadq(packageName, lowerCase, getIntent(), f, this).executeOnExecutor(firebaseAuth.f3079y, new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName + " " + String.valueOf(e10));
                zzadv.zzb(this, packageName);
            }
            this.f3106a = true;
            return;
        }
        Intent intent = getIntent();
        if (intent.hasExtra("firebaseError")) {
            i(v0.a(intent.getStringExtra("firebaseError")));
            return;
        }
        if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
            j();
            return;
        }
        String stringExtra = intent.getStringExtra("link");
        String stringExtra2 = intent.getStringExtra("eventId");
        String packageName2 = getPackageName();
        boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
        synchronized (b1.f2412a) {
            j.e(packageName2);
            j.e(stringExtra2);
            SharedPreferences a10 = b1.a(this, packageName2);
            String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", stringExtra2);
            String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", stringExtra2);
            String format3 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", stringExtra2);
            String format4 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", stringExtra2);
            String string = a10.getString(format, null);
            String string2 = a10.getString(format2, null);
            String string3 = a10.getString(format3, null);
            String string4 = a10.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
            String string5 = a10.getString(format4, null);
            SharedPreferences.Editor edit = a10.edit();
            edit.remove(format);
            edit.remove(format2);
            edit.remove(format3);
            edit.remove(format4);
            edit.apply();
            d1Var = (string == null || string2 == null || string3 == null) ? null : new d1(string, string2, string3, string4, string5);
        }
        if (d1Var == null) {
            j();
        }
        if (booleanExtra) {
            stringExtra = c1.a(getApplicationContext(), f.f(d1Var.f2429e).g()).c(stringExtra);
        }
        zzaic zzaicVar = new zzaic(d1Var, stringExtra);
        String str = d1Var.f2428d;
        String str2 = d1Var.f2426b;
        zzaicVar.zzb(str);
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(str2) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(str2) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(str2)) {
            Log.e("GenericIdpActivity", "unsupported operation: " + str2);
            j();
            return;
        }
        f3104b = 0L;
        this.f3106a = false;
        Intent intent2 = new Intent();
        Parcel obtain = Parcel.obtain();
        zzaicVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent2.putExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", marshall);
        intent2.putExtra("com.google.firebase.auth.internal.OPERATION", str2);
        intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (a.a(this).b(intent2)) {
            f3105c.a(this);
        } else {
            Context applicationContext = getApplicationContext();
            zzaj<String> zzajVar = f0.f2444c;
            SharedPreferences.Editor edit2 = applicationContext.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
            Parcel obtain2 = Parcel.obtain();
            zzaicVar.writeToParcel(obtain2, 0);
            byte[] marshall2 = obtain2.marshall();
            obtain2.recycle();
            edit2.putString("verifyAssertionRequest", marshall2 != null ? Base64.encodeToString(marshall2, 10) : null);
            edit2.putString("operation", str2);
            edit2.putString("tenantId", str);
            edit2.putLong(io.flutter.plugins.firebase.crashlytics.Constants.TIMESTAMP, System.currentTimeMillis());
            edit2.commit();
        }
        finish();
    }

    @Override // b.j, u.j, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f3106a);
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
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzads
    public final void zza(Uri uri, String str, b<a8.a> bVar) {
        a8.a aVar = bVar.get();
        (aVar != null ? aVar.a().continueWith(new b0(uri, 0)) : Tasks.forResult(uri)).addOnCompleteListener(new t(this, str));
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
