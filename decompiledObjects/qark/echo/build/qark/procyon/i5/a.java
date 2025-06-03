// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i5;

import java.util.HashMap;
import android.security.keystore.KeyGenParameterSpec$Builder;
import s1.c;
import android.util.Base64;
import android.content.SharedPreferences$Editor;
import java.util.Iterator;
import android.util.Log;
import java.nio.charset.StandardCharsets;
import j5.m;
import j5.i;
import android.content.SharedPreferences;
import java.util.Map;
import android.content.Context;
import java.nio.charset.Charset;

public class a
{
    public final String a;
    public final Charset b;
    public final Context c;
    public String d;
    public Map e;
    public String f;
    public SharedPreferences g;
    public i h;
    public m i;
    public Boolean j;
    
    public a(final Context context) {
        this.a = "SecureStorageAndroid";
        this.d = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg";
        this.f = "FlutterSecureStorage";
        this.j = Boolean.FALSE;
        this.c = context.getApplicationContext();
        this.b = StandardCharsets.UTF_8;
    }
    
    public final void a(final SharedPreferences sharedPreferences, final SharedPreferences sharedPreferences2) {
        while (true) {
            try {
                for (final Map.Entry<K, Object> entry : sharedPreferences.getAll().entrySet()) {
                    final String value = entry.getValue();
                    final String s = (String)entry.getKey();
                    if (value instanceof String && s.contains(this.d)) {
                        sharedPreferences2.edit().putString(s, this.c(value)).apply();
                        sharedPreferences.edit().remove(s).apply();
                    }
                }
                final SharedPreferences$Editor edit = sharedPreferences.edit();
                this.i.d(edit);
                edit.apply();
                return;
                final Exception ex;
                Log.e("SecureStorageAndroid", "Data migration failed", (Throwable)ex);
            }
            catch (Exception ex) {
                continue;
            }
            break;
        }
    }
    
    public boolean b(final String s) {
        this.f();
        return this.g.contains(s);
    }
    
    public final String c(final String s) {
        if (s == null) {
            return null;
        }
        return new String(this.h.b(Base64.decode(s, 0)), this.b);
    }
    
    public void d(final String s) {
        this.f();
        final SharedPreferences$Editor edit = this.g.edit();
        edit.remove(s);
        edit.apply();
    }
    
    public void e() {
        this.f();
        final SharedPreferences$Editor edit = this.g.edit();
        edit.clear();
        if (!this.h()) {
            this.i.f(edit);
        }
        edit.apply();
    }
    
    public final void f() {
        if (this.e.containsKey("sharedPreferencesName") && !this.e.get("sharedPreferencesName").isEmpty()) {
            this.f = this.e.get("sharedPreferencesName");
        }
        if (this.e.containsKey("preferencesKeyPrefix") && !this.e.get("preferencesKeyPrefix").isEmpty()) {
            this.d = this.e.get("preferencesKeyPrefix");
        }
        final SharedPreferences sharedPreferences = this.c.getSharedPreferences(this.f, 0);
        if (this.h == null) {
            try {
                this.i(sharedPreferences);
            }
            catch (Exception ex) {
                Log.e("SecureStorageAndroid", "StorageCipher initialization failed", (Throwable)ex);
            }
        }
        if (this.h()) {
            try {
                this.a(sharedPreferences, this.g = this.j(this.c));
                return;
            }
            catch (Exception ex2) {
                Log.e("SecureStorageAndroid", "EncryptedSharedPreferences initialization failed", (Throwable)ex2);
                this.g = sharedPreferences;
                this.j = Boolean.TRUE;
                return;
            }
        }
        this.g = sharedPreferences;
    }
    
    public boolean g() {
        return this.e.containsKey("resetOnError") && this.e.get("resetOnError").equals("true");
    }
    
    public final boolean h() {
        final boolean booleanValue = this.j;
        final boolean b = false;
        if (booleanValue) {
            return false;
        }
        boolean b2 = b;
        if (this.e.containsKey("encryptedSharedPreferences")) {
            b2 = b;
            if (this.e.get("encryptedSharedPreferences").equals("true")) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final void i(final SharedPreferences sharedPreferences) {
        this.i = new m(sharedPreferences, this.e);
        i h;
        if (this.h()) {
            h = this.i.c(this.c);
        }
        else {
            if (this.i.e()) {
                this.k(this.i, sharedPreferences);
                return;
            }
            h = this.i.a(this.c);
        }
        this.h = h;
    }
    
    public final SharedPreferences j(final Context context) {
        return s1.a.a(context, this.f, new c.a(context).b(new KeyGenParameterSpec$Builder("_androidx_security_master_key_", 3).setEncryptionPaddings(new String[] { "NoPadding" }).setBlockModes(new String[] { "GCM" }).setKeySize(256).build()).a(), s1.a.d.p, s1.a.e.p);
    }
    
    public final void k(final m m, final SharedPreferences sharedPreferences) {
        while (true) {
            try {
                this.h = m.c(this.c);
                final HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
                for (final Map.Entry<K, Object> entry : sharedPreferences.getAll().entrySet()) {
                    final String value = entry.getValue();
                    final String s = (String)entry.getKey();
                    if (value instanceof String && s.contains(this.d)) {
                        hashMap.put(s, this.c(value));
                    }
                }
                this.h = m.a(this.c);
                final SharedPreferences$Editor edit = sharedPreferences.edit();
                for (final Map.Entry<String, String> entry2 : hashMap.entrySet()) {
                    edit.putString((String)entry2.getKey(), Base64.encodeToString(this.h.a(entry2.getValue().getBytes(this.b)), 0));
                }
                m.f(edit);
                edit.apply();
                return;
                final Exception ex;
                Log.e("SecureStorageAndroid", "re-encryption failed", (Throwable)ex);
                this.h = m.c(this.c);
            }
            catch (Exception ex) {
                continue;
            }
            break;
        }
    }
    
    public String l(String string) {
        this.f();
        string = this.g.getString(string, (String)null);
        if (this.h()) {
            return string;
        }
        return this.c(string);
    }
    
    public Map m() {
        this.f();
        final Map all = this.g.getAll();
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        for (final Map.Entry<String, V> entry : all.entrySet()) {
            if (entry.getKey().contains(this.d)) {
                final String s = entry.getKey();
                final StringBuilder sb = new StringBuilder();
                sb.append(this.d);
                sb.append('_');
                final String replaceFirst = s.replaceFirst(sb.toString(), "");
                final boolean h = this.h();
                String c = (String)entry.getValue();
                if (!h) {
                    c = this.c(c);
                }
                hashMap.put(replaceFirst, c);
            }
        }
        return hashMap;
    }
    
    public void n(final String s, String encodeToString) {
        this.f();
        final SharedPreferences$Editor edit = this.g.edit();
        if (!this.h()) {
            encodeToString = Base64.encodeToString(this.h.a(encodeToString.getBytes(this.b)), 0);
        }
        edit.putString(s, encodeToString);
        edit.apply();
    }
}
