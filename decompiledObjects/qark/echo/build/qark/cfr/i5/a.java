/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.security.keystore.KeyGenParameterSpec
 *  android.security.keystore.KeyGenParameterSpec$Builder
 *  android.util.Base64
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.nio.charset.StandardCharsets
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package i5;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Log;
import j5.i;
import j5.m;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import s1.a;
import s1.c;

public class a {
    public final String a = "SecureStorageAndroid";
    public final Charset b;
    public final Context c;
    public String d = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg";
    public Map e;
    public String f = "FlutterSecureStorage";
    public SharedPreferences g;
    public i h;
    public m i;
    public Boolean j = Boolean.FALSE;

    public a(Context context) {
        this.c = context.getApplicationContext();
        this.b = StandardCharsets.UTF_8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        try {
            Iterator iterator = sharedPreferences.getAll().entrySet().iterator();
            do {
                if (!iterator.hasNext()) {
                    sharedPreferences = sharedPreferences.edit();
                    this.i.d((SharedPreferences.Editor)sharedPreferences);
                    sharedPreferences.apply();
                    return;
                }
                Object object = (Map.Entry)iterator.next();
                Object object2 = object.getValue();
                object = (String)object.getKey();
                if (!(object2 instanceof String) || !object.contains((CharSequence)this.d)) continue;
                object2 = this.c((String)object2);
                sharedPreferences2.edit().putString((String)object, (String)object2).apply();
                sharedPreferences.edit().remove((String)object).apply();
            } while (true);
        }
        catch (Exception exception) {}
        Log.e((String)"SecureStorageAndroid", (String)"Data migration failed", (Throwable)exception);
    }

    public boolean b(String string2) {
        this.f();
        return this.g.contains(string2);
    }

    public final String c(String arrby) {
        if (arrby == null) {
            return null;
        }
        arrby = Base64.decode((String)arrby, (int)0);
        return new String(this.h.b(arrby), this.b);
    }

    public void d(String string2) {
        this.f();
        SharedPreferences.Editor editor = this.g.edit();
        editor.remove(string2);
        editor.apply();
    }

    public void e() {
        this.f();
        SharedPreferences.Editor editor = this.g.edit();
        editor.clear();
        if (!this.h()) {
            this.i.f(editor);
        }
        editor.apply();
    }

    public final void f() {
        if (this.e.containsKey((Object)"sharedPreferencesName") && !((String)this.e.get((Object)"sharedPreferencesName")).isEmpty()) {
            this.f = (String)this.e.get((Object)"sharedPreferencesName");
        }
        if (this.e.containsKey((Object)"preferencesKeyPrefix") && !((String)this.e.get((Object)"preferencesKeyPrefix")).isEmpty()) {
            this.d = (String)this.e.get((Object)"preferencesKeyPrefix");
        }
        SharedPreferences sharedPreferences = this.c.getSharedPreferences(this.f, 0);
        if (this.h == null) {
            try {
                this.i(sharedPreferences);
            }
            catch (Exception exception) {
                Log.e((String)"SecureStorageAndroid", (String)"StorageCipher initialization failed", (Throwable)exception);
            }
        }
        if (this.h()) {
            try {
                SharedPreferences sharedPreferences2;
                this.g = sharedPreferences2 = this.j(this.c);
                this.a(sharedPreferences, sharedPreferences2);
                return;
            }
            catch (Exception exception) {
                Log.e((String)"SecureStorageAndroid", (String)"EncryptedSharedPreferences initialization failed", (Throwable)exception);
                this.g = sharedPreferences;
                this.j = Boolean.TRUE;
                return;
            }
        }
        this.g = sharedPreferences;
    }

    public boolean g() {
        if (this.e.containsKey((Object)"resetOnError") && this.e.get((Object)"resetOnError").equals((Object)"true")) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        boolean bl = this.j;
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        bl = bl2;
        if (this.e.containsKey((Object)"encryptedSharedPreferences")) {
            bl = bl2;
            if (this.e.get((Object)"encryptedSharedPreferences").equals((Object)"true")) {
                bl = true;
            }
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void i(SharedPreferences object) {
        this.i = new m((SharedPreferences)object, this.e);
        if (this.h()) {
            object = this.i.c(this.c);
        } else {
            if (this.i.e()) {
                this.k(this.i, (SharedPreferences)object);
                return;
            }
            object = this.i.a(this.c);
        }
        this.h = object;
    }

    public final SharedPreferences j(Context context) {
        c c8 = new c.a(context).b(new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setEncryptionPaddings(new String[]{"NoPadding"}).setBlockModes(new String[]{"GCM"}).setKeySize(256).build()).a();
        return s1.a.a(context, this.f, c8, a.d.p, a.e.p);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k(m m8, SharedPreferences sharedPreferences) {
        try {
            byte[] arrby;
            this.h = m8.c(this.c);
            HashMap hashMap = new HashMap();
            Iterator iterator = sharedPreferences.getAll().entrySet().iterator();
            while (iterator.hasNext()) {
                Object object = (Map.Entry)iterator.next();
                arrby = object.getValue();
                object = (String)object.getKey();
                if (!(arrby instanceof String) || !object.contains((CharSequence)this.d)) continue;
                hashMap.put(object, (Object)this.c((String)arrby));
            }
            this.h = m8.a(this.c);
            sharedPreferences = sharedPreferences.edit();
            hashMap = hashMap.entrySet().iterator();
            do {
                if (!hashMap.hasNext()) {
                    m8.f((SharedPreferences.Editor)sharedPreferences);
                    sharedPreferences.apply();
                    return;
                }
                iterator = (Map.Entry)hashMap.next();
                arrby = this.h.a(((String)iterator.getValue()).getBytes(this.b));
                sharedPreferences.putString((String)iterator.getKey(), Base64.encodeToString((byte[])arrby, (int)0));
            } while (true);
        }
        catch (Exception exception) {}
        Log.e((String)"SecureStorageAndroid", (String)"re-encryption failed", (Throwable)exception);
        this.h = m8.c(this.c);
    }

    public String l(String string2) {
        this.f();
        string2 = this.g.getString(string2, null);
        if (this.h()) {
            return string2;
        }
        return this.c(string2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Map m() {
        this.f();
        Object object = this.g.getAll();
        HashMap hashMap = new HashMap();
        Iterator iterator = object.entrySet().iterator();
        while (iterator.hasNext()) {
            object = (Map.Entry)iterator.next();
            if (!((String)object.getKey()).contains((CharSequence)this.d)) continue;
            String string2 = (String)object.getKey();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.d);
            stringBuilder.append('_');
            string2 = string2.replaceFirst(stringBuilder.toString(), "");
            boolean bl = this.h();
            object = (String)object.getValue();
            if (!bl) {
                object = this.c((String)object);
            }
            hashMap.put((Object)string2, object);
        }
        return hashMap;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void n(String string2, String string3) {
        this.f();
        SharedPreferences.Editor editor = this.g.edit();
        if (!this.h()) {
            string3 = Base64.encodeToString((byte[])this.h.a(string3.getBytes(this.b)), (int)0);
        }
        editor.putString(string2, string3);
        editor.apply();
    }
}

