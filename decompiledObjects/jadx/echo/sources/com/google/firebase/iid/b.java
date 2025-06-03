package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import t.C1958a;
import x.AbstractC2112a;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f11592a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f11593b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f11594c = new C1958a();

    public static class a {

        /* renamed from: d, reason: collision with root package name */
        public static final long f11595d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a, reason: collision with root package name */
        public final String f11596a;

        /* renamed from: b, reason: collision with root package name */
        public final String f11597b;

        /* renamed from: c, reason: collision with root package name */
        public final long f11598c;

        public a(String str, String str2, long j7) {
            this.f11596a = str;
            this.f11597b = str2;
            this.f11598c = j7;
        }

        public static String a(String str, String str2, long j7) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j7);
                return jSONObject.toString();
            } catch (JSONException e7) {
                String valueOf = String.valueOf(e7);
                StringBuilder sb = new StringBuilder(valueOf.length() + 24);
                sb.append("Failed to encode token: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        public static String b(a aVar) {
            if (aVar == null) {
                return null;
            }
            return aVar.f11596a;
        }

        public static a d(String str) {
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
                String valueOf = String.valueOf(e7);
                StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                sb.append("Failed to parse token: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        public boolean c(String str) {
            return System.currentTimeMillis() > this.f11598c + f11595d || !str.equals(this.f11597b);
        }
    }

    public b(Context context) {
        this.f11593b = context;
        this.f11592a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a("com.google.android.gms.appid-no-backup");
    }

    public static String b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
        sb.append(str);
        sb.append("|S|cre");
        return sb.toString();
    }

    public final void a(String str) {
        File file = new File(AbstractC2112a.f(this.f11593b), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || h()) {
                return;
            }
            Log.i("FirebaseInstanceId", "App restored, clearing state");
            d();
        } catch (IOException e7) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e7.getMessage());
                Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    public final String c(String str, String str2, String str3) {
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    public synchronized void d() {
        this.f11594c.clear();
        this.f11592a.edit().clear().commit();
    }

    public synchronized void e(String str, String str2, String str3) {
        String c7 = c(str, str2, str3);
        SharedPreferences.Editor edit = this.f11592a.edit();
        edit.remove(c7);
        edit.commit();
    }

    public final long f(String str) {
        String string = this.f11592a.getString(b(str, "cre"), null);
        if (string == null) {
            return 0L;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public synchronized a g(String str, String str2, String str3) {
        return a.d(this.f11592a.getString(c(str, str2, str3), null));
    }

    public synchronized boolean h() {
        return this.f11592a.getAll().isEmpty();
    }

    public synchronized void i(String str, String str2, String str3, String str4, String str5) {
        String a7 = a.a(str4, str5, System.currentTimeMillis());
        if (a7 == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f11592a.edit();
        edit.putString(c(str, str2, str3), a7);
        edit.commit();
    }

    public synchronized long j(String str) {
        long k7;
        k7 = k(str);
        this.f11594c.put(str, Long.valueOf(k7));
        return k7;
    }

    public final long k(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f11592a.contains(b(str, "cre"))) {
            return f(str);
        }
        SharedPreferences.Editor edit = this.f11592a.edit();
        edit.putString(b(str, "cre"), String.valueOf(currentTimeMillis));
        edit.commit();
        return currentTimeMillis;
    }
}
