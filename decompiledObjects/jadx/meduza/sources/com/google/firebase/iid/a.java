package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import defpackage.g;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f3214a;

    /* renamed from: b, reason: collision with root package name */
    public final r.b f3215b;

    /* renamed from: com.google.firebase.iid.a$a, reason: collision with other inner class name */
    public static class C0054a {

        /* renamed from: d, reason: collision with root package name */
        public static final long f3216d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a, reason: collision with root package name */
        public final String f3217a;

        /* renamed from: b, reason: collision with root package name */
        public final String f3218b;

        /* renamed from: c, reason: collision with root package name */
        public final long f3219c;

        public C0054a(long j10, String str, String str2) {
            this.f3217a = str;
            this.f3218b = str2;
            this.f3219c = j10;
        }

        public static String a(long j10, String str, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put(Constants.TIMESTAMP, j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 24);
                sb2.append("Failed to encode token: ");
                sb2.append(valueOf);
                Log.w("FirebaseInstanceId", sb2.toString());
                return null;
            }
        }

        public static C0054a b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new C0054a(0L, str, null);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C0054a(jSONObject.getLong(Constants.TIMESTAMP), jSONObject.getString("token"), jSONObject.getString("appVersion"));
            } catch (JSONException e10) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
                sb2.append("Failed to parse token: ");
                sb2.append(valueOf);
                Log.w("FirebaseInstanceId", sb2.toString());
                return null;
            }
        }
    }

    public a(Context context) {
        boolean isEmpty;
        r.b bVar = new r.b();
        this.f3215b = bVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f3214a = sharedPreferences;
        File file = new File(v.a.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseInstanceId", "App restored, clearing state");
                synchronized (this) {
                    bVar.clear();
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e10.getMessage());
                Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    public static String a(String str) {
        return g.f(new StringBuilder(String.valueOf(str).length() + 6), str, "|S|cre");
    }

    public static String b(String str, String str2, String str3) {
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append("|T|");
        sb2.append(str2);
        sb2.append("|");
        sb2.append(str3);
        return sb2.toString();
    }

    public final long c(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f3214a.contains(a(str))) {
            String string = this.f3214a.getString(a(str), null);
            if (string != null) {
                try {
                    return Long.parseLong(string);
                } catch (NumberFormatException unused) {
                }
            }
            return 0L;
        }
        SharedPreferences.Editor edit = this.f3214a.edit();
        edit.putString(a(str), String.valueOf(currentTimeMillis));
        edit.commit();
        return currentTimeMillis;
    }
}
