package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import defpackage.f;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f3247a;

    /* renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    public static class C0055a {

        /* renamed from: d, reason: collision with root package name */
        public static final long f3248d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a, reason: collision with root package name */
        public final String f3249a;

        /* renamed from: b, reason: collision with root package name */
        public final String f3250b;

        /* renamed from: c, reason: collision with root package name */
        public final long f3251c;

        public C0055a(long j10, String str, String str2) {
            this.f3249a = str;
            this.f3250b = str2;
            this.f3251c = j10;
        }

        public static String a(long j10, String str, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put(Constants.TIMESTAMP, j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
                return null;
            }
        }

        public static C0055a b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new C0055a(0L, str, null);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C0055a(jSONObject.getLong(Constants.TIMESTAMP), jSONObject.getString("token"), jSONObject.getString("appVersion"));
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
                return null;
            }
        }
    }

    public a(Context context) {
        boolean isEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f3247a = sharedPreferences;
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
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder l10 = f.l("Error creating file in no backup dir: ");
                l10.append(e10.getMessage());
                Log.d("FirebaseMessaging", l10.toString());
            }
        }
    }

    public static String a(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }
}
