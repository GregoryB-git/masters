// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.iid;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.concurrent.TimeUnit;
import android.content.SharedPreferences$Editor;
import java.io.IOException;
import android.util.Log;
import java.io.File;
import t.a;
import java.util.Map;
import android.content.Context;
import android.content.SharedPreferences;

public class b
{
    public final SharedPreferences a;
    public final Context b;
    public final Map c;
    
    public b(final Context b) {
        this.c = new t.a();
        this.b = b;
        this.a = b.getSharedPreferences("com.google.android.gms.appid", 0);
        this.a("com.google.android.gms.appid-no-backup");
    }
    
    public static String b(final String s, final String s2) {
        final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 6);
        sb.append(s);
        sb.append("|S|cre");
        return sb.toString();
    }
    
    public final void a(String str) {
        final File file = new File(x.a.f(this.b), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile() && !this.h()) {
                Log.i("FirebaseInstanceId", "App restored, clearing state");
                this.d();
            }
        }
        catch (IOException ex) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                str = String.valueOf(ex.getMessage());
                if (str.length() != 0) {
                    str = "Error creating file in no backup dir: ".concat(str);
                }
                else {
                    str = new String("Error creating file in no backup dir: ");
                }
                Log.d("FirebaseInstanceId", str);
            }
        }
    }
    
    public final String c(final String s, final String s2, final String s3) {
        final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 4 + String.valueOf(s2).length() + String.valueOf(s3).length());
        sb.append(s);
        sb.append("|T|");
        sb.append(s2);
        sb.append("|");
        sb.append(s3);
        return sb.toString();
    }
    
    public void d() {
        synchronized (this) {
            this.c.clear();
            this.a.edit().clear().commit();
        }
    }
    
    public void e(String c, final String s, final String s2) {
        synchronized (this) {
            c = this.c(c, s, s2);
            final SharedPreferences$Editor edit = this.a.edit();
            edit.remove(c);
            edit.commit();
        }
    }
    
    public final long f(String string) {
        string = this.a.getString(b(string, "cre"), (String)null);
        if (string == null) {
            return 0L;
        }
        try {
            return Long.parseLong(string);
        }
        catch (NumberFormatException ex) {
            return 0L;
        }
    }
    
    public a g(final String s, final String s2, final String s3) {
        synchronized (this) {
            return com.google.firebase.iid.b.a.d(this.a.getString(this.c(s, s2, s3), (String)null));
        }
    }
    
    public boolean h() {
        synchronized (this) {
            return this.a.getAll().isEmpty();
        }
    }
    
    public void i(final String s, final String s2, final String s3, String a, final String s4) {
        synchronized (this) {
            a = com.google.firebase.iid.b.a.a(a, s4, System.currentTimeMillis());
            if (a == null) {
                return;
            }
            final SharedPreferences$Editor edit = this.a.edit();
            edit.putString(this.c(s, s2, s3), a);
            edit.commit();
        }
    }
    
    public long j(final String s) {
        synchronized (this) {
            final long k = this.k(s);
            this.c.put(s, k);
            return k;
        }
    }
    
    public final long k(final String s) {
        final long currentTimeMillis = System.currentTimeMillis();
        if (!this.a.contains(b(s, "cre"))) {
            final SharedPreferences$Editor edit = this.a.edit();
            edit.putString(b(s, "cre"), String.valueOf(currentTimeMillis));
            edit.commit();
            return currentTimeMillis;
        }
        return this.f(s);
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
        
        public static String a(String str, final String s, final long n) {
            try {
                final JSONObject jsonObject = new JSONObject();
                jsonObject.put("token", (Object)str);
                jsonObject.put("appVersion", (Object)s);
                jsonObject.put("timestamp", n);
                str = jsonObject.toString();
                return str;
            }
            catch (JSONException obj) {
                str = String.valueOf(obj);
                final StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Failed to encode token: ");
                sb.append(str);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }
        
        public static String b(final a a) {
            if (a == null) {
                return null;
            }
            return a.a;
        }
        
        public static a d(String value) {
            if (TextUtils.isEmpty((CharSequence)value)) {
                return null;
            }
            if (value.startsWith("{")) {
                try {
                    final JSONObject jsonObject = new JSONObject(value);
                    return new a(jsonObject.getString("token"), jsonObject.getString("appVersion"), jsonObject.getLong("timestamp"));
                }
                catch (JSONException obj) {
                    value = String.valueOf(obj);
                    final StringBuilder sb = new StringBuilder(value.length() + 23);
                    sb.append("Failed to parse token: ");
                    sb.append(value);
                    Log.w("FirebaseInstanceId", sb.toString());
                    return null;
                }
            }
            return new a(value, null, 0L);
        }
        
        public boolean c(final String s) {
            return System.currentTimeMillis() > this.c + com.google.firebase.iid.b.a.d || !s.equals(this.b);
        }
    }
}
