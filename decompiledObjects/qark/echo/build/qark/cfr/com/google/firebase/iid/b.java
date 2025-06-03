/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.text.TextUtils
 *  android.util.Log
 *  java.io.File
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Map
 *  java.util.concurrent.TimeUnit
 *  org.json.JSONException
 *  org.json.JSONObject
 */
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

public class b {
    public final SharedPreferences a;
    public final Context b;
    public final Map c = new t.a();

    public b(Context context) {
        this.b = context;
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.a("com.google.android.gms.appid-no-backup");
    }

    public static String b(String string2, String string3) {
        string3 = new StringBuilder(String.valueOf((Object)string2).length() + 6);
        string3.append(string2);
        string3.append("|S|cre");
        return string3.toString();
    }

    public final void a(String string2) {
        block4 : {
            string2 = new File(x.a.f(this.b), "com.google.android.gms.appid-no-backup");
            if (string2.exists()) {
                return;
            }
            try {
                if (string2.createNewFile() && !this.h()) {
                    Log.i((String)"FirebaseInstanceId", (String)"App restored, clearing state");
                    this.d();
                    return;
                }
            }
            catch (IOException iOException) {
                if (!Log.isLoggable((String)"FirebaseInstanceId", (int)3)) break block4;
                String string3 = String.valueOf((Object)iOException.getMessage());
                string3 = string3.length() != 0 ? "Error creating file in no backup dir: ".concat(string3) : new String("Error creating file in no backup dir: ");
                Log.d((String)"FirebaseInstanceId", (String)string3);
            }
        }
    }

    public final String c(String string2, String string3, String string4) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf((Object)string2).length() + 4 + String.valueOf((Object)string3).length() + String.valueOf((Object)string4).length());
        stringBuilder.append(string2);
        stringBuilder.append("|T|");
        stringBuilder.append(string3);
        stringBuilder.append("|");
        stringBuilder.append(string4);
        return stringBuilder.toString();
    }

    public void d() {
        synchronized (this) {
            this.c.clear();
            this.a.edit().clear().commit();
            return;
        }
    }

    public void e(String string2, String string3, String string4) {
        synchronized (this) {
            string2 = this.c(string2, string3, string4);
            string3 = this.a.edit();
            string3.remove(string2);
            string3.commit();
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final long f(String string2) {
        if ((string2 = this.a.getString(b.b(string2, "cre"), null)) == null) return 0L;
        try {
            return Long.parseLong((String)string2);
        }
        catch (NumberFormatException numberFormatException) {
            return 0L;
        }
    }

    public a g(String object, String string2, String string3) {
        synchronized (this) {
            object = a.d(this.a.getString(this.c((String)object, string2, string3), null));
            return object;
        }
    }

    public boolean h() {
        synchronized (this) {
            boolean bl = this.a.getAll().isEmpty();
            return bl;
        }
    }

    public void i(String string2, String string3, String string4, String string5, String string6) {
        synchronized (this) {
            block4 : {
                string5 = a.a(string5, string6, System.currentTimeMillis());
                if (string5 != null) break block4;
                return;
            }
            string6 = this.a.edit();
            string6.putString(this.c(string2, string3, string4), string5);
            string6.commit();
            return;
        }
    }

    public long j(String string2) {
        synchronized (this) {
            long l8 = this.k(string2);
            this.c.put((Object)string2, (Object)l8);
            return l8;
        }
    }

    public final long k(String string2) {
        long l8 = System.currentTimeMillis();
        String string3 = b.b(string2, "cre");
        if (!this.a.contains(string3)) {
            string3 = this.a.edit();
            string3.putString(b.b(string2, "cre"), String.valueOf((long)l8));
            string3.commit();
            return l8;
        }
        return this.f(string2);
    }

    public static class a {
        public static final long d = TimeUnit.DAYS.toMillis(7L);
        public final String a;
        public final String b;
        public final long c;

        public a(String string2, String string3, long l8) {
            this.a = string2;
            this.b = string3;
            this.c = l8;
        }

        public static String a(String string2, String string3, long l8) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", (Object)string2);
                jSONObject.put("appVersion", (Object)string3);
                jSONObject.put("timestamp", l8);
                string2 = jSONObject.toString();
                return string2;
            }
            catch (JSONException jSONException) {
                String string4 = String.valueOf((Object)jSONException);
                string3 = new StringBuilder(string4.length() + 24);
                string3.append("Failed to encode token: ");
                string3.append(string4);
                Log.w((String)"FirebaseInstanceId", (String)string3.toString());
                return null;
            }
        }

        public static String b(a a8) {
            if (a8 == null) {
                return null;
            }
            return a8.a;
        }

        public static a d(String object) {
            if (TextUtils.isEmpty((CharSequence)object)) {
                return null;
            }
            if (object.startsWith("{")) {
                try {
                    object = new JSONObject((String)object);
                    object = new a(object.getString("token"), object.getString("appVersion"), object.getLong("timestamp"));
                    return object;
                }
                catch (JSONException jSONException) {
                    String string2 = String.valueOf((Object)jSONException);
                    StringBuilder stringBuilder = new StringBuilder(string2.length() + 23);
                    stringBuilder.append("Failed to parse token: ");
                    stringBuilder.append(string2);
                    Log.w((String)"FirebaseInstanceId", (String)stringBuilder.toString());
                    return null;
                }
            }
            return new a((String)object, null, 0L);
        }

        public boolean c(String string2) {
            if (System.currentTimeMillis() <= this.c + d && string2.equals((Object)this.b)) {
                return false;
            }
            return true;
        }
    }

}

