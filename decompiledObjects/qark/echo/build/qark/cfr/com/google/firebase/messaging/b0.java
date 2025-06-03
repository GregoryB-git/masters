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
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Map
 *  java.util.concurrent.TimeUnit
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.firebase.messaging;

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

public class b0 {
    public final SharedPreferences a;

    public b0(Context context) {
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.a(context, "com.google.android.gms.appid-no-backup");
    }

    public final void a(Context context, String string2) {
        block4 : {
            if ((context = new File(x.a.f(context), string2)).exists()) {
                return;
            }
            try {
                if (context.createNewFile() && !this.f()) {
                    Log.i((String)"FirebaseMessaging", (String)"App restored, clearing state");
                    this.c();
                    return;
                }
            }
            catch (IOException iOException) {
                if (!Log.isLoggable((String)"FirebaseMessaging", (int)3)) break block4;
                string2 = new StringBuilder();
                string2.append("Error creating file in no backup dir: ");
                string2.append(iOException.getMessage());
                Log.d((String)"FirebaseMessaging", (String)string2.toString());
            }
        }
    }

    public final String b(String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append("|T|");
        stringBuilder.append(string3);
        stringBuilder.append("|");
        stringBuilder.append("*");
        return stringBuilder.toString();
    }

    public void c() {
        synchronized (this) {
            this.a.edit().clear().commit();
            return;
        }
    }

    public void d(String string2, String string3) {
        synchronized (this) {
            string2 = this.b(string2, string3);
            string3 = this.a.edit();
            string3.remove(string2);
            string3.commit();
            return;
        }
    }

    public a e(String object, String string2) {
        synchronized (this) {
            object = a.c(this.a.getString(this.b((String)object, string2), null));
            return object;
        }
    }

    public boolean f() {
        synchronized (this) {
            boolean bl = this.a.getAll().isEmpty();
            return bl;
        }
    }

    public void g(String string2, String string3, String string4, String string5) {
        synchronized (this) {
            block4 : {
                string4 = a.a(string4, string5, System.currentTimeMillis());
                if (string4 != null) break block4;
                return;
            }
            string5 = this.a.edit();
            string5.putString(this.b(string2, string3), string4);
            string5.commit();
            return;
        }
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
                string3 = new StringBuilder();
                string3.append("Failed to encode token: ");
                string3.append((Object)jSONException);
                Log.w((String)"FirebaseMessaging", (String)string3.toString());
                return null;
            }
        }

        public static a c(String object) {
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
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed to parse token: ");
                    stringBuilder.append((Object)jSONException);
                    Log.w((String)"FirebaseMessaging", (String)stringBuilder.toString());
                    return null;
                }
            }
            return new a((String)object, null, 0L);
        }

        public boolean b(String string2) {
            if (System.currentTimeMillis() <= this.c + d && string2.equals((Object)this.b)) {
                return false;
            }
            return true;
        }
    }

}

