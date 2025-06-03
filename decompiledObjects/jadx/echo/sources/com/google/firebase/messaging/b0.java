package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import x.AbstractC2112a;

/* loaded from: classes.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f11729a;

    public static class a {

        /* renamed from: d, reason: collision with root package name */
        public static final long f11730d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a, reason: collision with root package name */
        public final String f11731a;

        /* renamed from: b, reason: collision with root package name */
        public final String f11732b;

        /* renamed from: c, reason: collision with root package name */
        public final long f11733c;

        public a(String str, String str2, long j7) {
            this.f11731a = str;
            this.f11732b = str2;
            this.f11733c = j7;
        }

        public static String a(String str, String str2, long j7) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j7);
                return jSONObject.toString();
            } catch (JSONException e7) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e7);
                return null;
            }
        }

        public static a c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e7) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e7);
                return null;
            }
        }

        public boolean b(String str) {
            return System.currentTimeMillis() > this.f11733c + f11730d || !str.equals(this.f11732b);
        }
    }

    public b0(Context context) {
        this.f11729a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a(context, "com.google.android.gms.appid-no-backup");
    }

    public final void a(Context context, String str) {
        File file = new File(AbstractC2112a.f(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || f()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            c();
        } catch (IOException e7) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e7.getMessage());
            }
        }
    }

    public final String b(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public synchronized void c() {
        this.f11729a.edit().clear().commit();
    }

    public synchronized void d(String str, String str2) {
        String b7 = b(str, str2);
        SharedPreferences.Editor edit = this.f11729a.edit();
        edit.remove(b7);
        edit.commit();
    }

    public synchronized a e(String str, String str2) {
        return a.c(this.f11729a.getString(b(str, str2), null));
    }

    public synchronized boolean f() {
        return this.f11729a.getAll().isEmpty();
    }

    public synchronized void g(String str, String str2, String str3, String str4) {
        String a7 = a.a(str3, str4, System.currentTimeMillis());
        if (a7 == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f11729a.edit();
        edit.putString(b(str, str2), a7);
        edit.commit();
    }
}
