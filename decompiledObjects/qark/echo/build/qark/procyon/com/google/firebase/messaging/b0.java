// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.concurrent.TimeUnit;
import android.content.SharedPreferences$Editor;
import java.io.IOException;
import android.util.Log;
import java.io.File;
import x.a;
import android.content.Context;
import android.content.SharedPreferences;

public class b0
{
    public final SharedPreferences a;
    
    public b0(final Context context) {
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.a(context, "com.google.android.gms.appid-no-backup");
    }
    
    public final void a(final Context context, final String child) {
        final File file = new File(x.a.f(context), child);
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile() && !this.f()) {
                Log.i("FirebaseMessaging", "App restored, clearing state");
                this.c();
            }
        }
        catch (IOException ex) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Error creating file in no backup dir: ");
                sb.append(ex.getMessage());
                Log.d("FirebaseMessaging", sb.toString());
            }
        }
    }
    
    public final String b(final String str, final String str2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append("*");
        return sb.toString();
    }
    
    public void c() {
        synchronized (this) {
            this.a.edit().clear().commit();
        }
    }
    
    public void d(String b, final String s) {
        synchronized (this) {
            b = this.b(b, s);
            final SharedPreferences$Editor edit = this.a.edit();
            edit.remove(b);
            edit.commit();
        }
    }
    
    public a e(final String s, final String s2) {
        synchronized (this) {
            return b0.a.c(this.a.getString(this.b(s, s2), (String)null));
        }
    }
    
    public boolean f() {
        synchronized (this) {
            return this.a.getAll().isEmpty();
        }
    }
    
    public void g(final String s, final String s2, String a, final String s3) {
        synchronized (this) {
            a = b0.a.a(a, s3, System.currentTimeMillis());
            if (a == null) {
                return;
            }
            final SharedPreferences$Editor edit = this.a.edit();
            edit.putString(this.b(s, s2), a);
            edit.commit();
        }
    }
    
    public static class a
    {
        public static final long d;
        public final String a;
        public final String b;
        public final long c;
        
        static {
            d = TimeUnit.DAYS.toMillis(7L);
        }
        
        public a(final String a, final String b, final long c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public static String a(String string, final String s, final long n) {
            try {
                final JSONObject jsonObject = new JSONObject();
                jsonObject.put("token", (Object)string);
                jsonObject.put("appVersion", (Object)s);
                jsonObject.put("timestamp", n);
                string = jsonObject.toString();
                return string;
            }
            catch (JSONException obj) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Failed to encode token: ");
                sb.append(obj);
                Log.w("FirebaseMessaging", sb.toString());
                return null;
            }
        }
        
        public static a c(final String s) {
            if (TextUtils.isEmpty((CharSequence)s)) {
                return null;
            }
            if (s.startsWith("{")) {
                try {
                    final JSONObject jsonObject = new JSONObject(s);
                    return new a(jsonObject.getString("token"), jsonObject.getString("appVersion"), jsonObject.getLong("timestamp"));
                }
                catch (JSONException obj) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to parse token: ");
                    sb.append(obj);
                    Log.w("FirebaseMessaging", sb.toString());
                    return null;
                }
            }
            return new a(s, null, 0L);
        }
        
        public boolean b(final String s) {
            return System.currentTimeMillis() > this.c + b0.a.d || !s.equals(this.b);
        }
    }
}
