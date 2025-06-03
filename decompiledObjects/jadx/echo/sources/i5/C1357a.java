package i5;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Log;
import j5.C1390m;
import j5.InterfaceC1386i;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import s1.C1938c;
import s1.SharedPreferencesC1936a;

/* renamed from: i5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1357a {

    /* renamed from: c, reason: collision with root package name */
    public final Context f14870c;

    /* renamed from: e, reason: collision with root package name */
    public Map f14872e;

    /* renamed from: g, reason: collision with root package name */
    public SharedPreferences f14874g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1386i f14875h;

    /* renamed from: i, reason: collision with root package name */
    public C1390m f14876i;

    /* renamed from: a, reason: collision with root package name */
    public final String f14868a = "SecureStorageAndroid";

    /* renamed from: d, reason: collision with root package name */
    public String f14871d = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg";

    /* renamed from: f, reason: collision with root package name */
    public String f14873f = "FlutterSecureStorage";

    /* renamed from: j, reason: collision with root package name */
    public Boolean f14877j = Boolean.FALSE;

    /* renamed from: b, reason: collision with root package name */
    public final Charset f14869b = StandardCharsets.UTF_8;

    public C1357a(Context context) {
        this.f14870c = context.getApplicationContext();
    }

    public final void a(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        try {
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if ((value instanceof String) && key.contains(this.f14871d)) {
                    sharedPreferences2.edit().putString(key, c((String) value)).apply();
                    sharedPreferences.edit().remove(key).apply();
                }
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            this.f14876i.d(edit);
            edit.apply();
        } catch (Exception e7) {
            Log.e("SecureStorageAndroid", "Data migration failed", e7);
        }
    }

    public boolean b(String str) {
        f();
        return this.f14874g.contains(str);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return new String(this.f14875h.b(Base64.decode(str, 0)), this.f14869b);
    }

    public void d(String str) {
        f();
        SharedPreferences.Editor edit = this.f14874g.edit();
        edit.remove(str);
        edit.apply();
    }

    public void e() {
        f();
        SharedPreferences.Editor edit = this.f14874g.edit();
        edit.clear();
        if (!h()) {
            this.f14876i.f(edit);
        }
        edit.apply();
    }

    public final void f() {
        if (this.f14872e.containsKey("sharedPreferencesName") && !((String) this.f14872e.get("sharedPreferencesName")).isEmpty()) {
            this.f14873f = (String) this.f14872e.get("sharedPreferencesName");
        }
        if (this.f14872e.containsKey("preferencesKeyPrefix") && !((String) this.f14872e.get("preferencesKeyPrefix")).isEmpty()) {
            this.f14871d = (String) this.f14872e.get("preferencesKeyPrefix");
        }
        SharedPreferences sharedPreferences = this.f14870c.getSharedPreferences(this.f14873f, 0);
        if (this.f14875h == null) {
            try {
                i(sharedPreferences);
            } catch (Exception e7) {
                Log.e("SecureStorageAndroid", "StorageCipher initialization failed", e7);
            }
        }
        if (!h()) {
            this.f14874g = sharedPreferences;
            return;
        }
        try {
            SharedPreferences j7 = j(this.f14870c);
            this.f14874g = j7;
            a(sharedPreferences, j7);
        } catch (Exception e8) {
            Log.e("SecureStorageAndroid", "EncryptedSharedPreferences initialization failed", e8);
            this.f14874g = sharedPreferences;
            this.f14877j = Boolean.TRUE;
        }
    }

    public boolean g() {
        return this.f14872e.containsKey("resetOnError") && this.f14872e.get("resetOnError").equals("true");
    }

    public final boolean h() {
        return !this.f14877j.booleanValue() && this.f14872e.containsKey("encryptedSharedPreferences") && this.f14872e.get("encryptedSharedPreferences").equals("true");
    }

    public final void i(SharedPreferences sharedPreferences) {
        InterfaceC1386i a7;
        this.f14876i = new C1390m(sharedPreferences, this.f14872e);
        if (h()) {
            a7 = this.f14876i.c(this.f14870c);
        } else {
            if (this.f14876i.e()) {
                k(this.f14876i, sharedPreferences);
                return;
            }
            a7 = this.f14876i.a(this.f14870c);
        }
        this.f14875h = a7;
    }

    public final SharedPreferences j(Context context) {
        return SharedPreferencesC1936a.a(context, this.f14873f, new C1938c.a(context).b(new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setEncryptionPaddings("NoPadding").setBlockModes("GCM").setKeySize(256).build()).a(), SharedPreferencesC1936a.d.AES256_SIV, SharedPreferencesC1936a.e.AES256_GCM);
    }

    public final void k(C1390m c1390m, SharedPreferences sharedPreferences) {
        try {
            this.f14875h = c1390m.c(this.f14870c);
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if ((value instanceof String) && key.contains(this.f14871d)) {
                    hashMap.put(key, c((String) value));
                }
            }
            this.f14875h = c1390m.a(this.f14870c);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                edit.putString((String) entry2.getKey(), Base64.encodeToString(this.f14875h.a(((String) entry2.getValue()).getBytes(this.f14869b)), 0));
            }
            c1390m.f(edit);
            edit.apply();
        } catch (Exception e7) {
            Log.e("SecureStorageAndroid", "re-encryption failed", e7);
            this.f14875h = c1390m.c(this.f14870c);
        }
    }

    public String l(String str) {
        f();
        String string = this.f14874g.getString(str, null);
        return h() ? string : c(string);
    }

    public Map m() {
        f();
        Map<String, ?> all = this.f14874g.getAll();
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (entry.getKey().contains(this.f14871d)) {
                String replaceFirst = entry.getKey().replaceFirst(this.f14871d + '_', "");
                boolean h7 = h();
                String str = (String) entry.getValue();
                if (!h7) {
                    str = c(str);
                }
                hashMap.put(replaceFirst, str);
            }
        }
        return hashMap;
    }

    public void n(String str, String str2) {
        f();
        SharedPreferences.Editor edit = this.f14874g.edit();
        if (!h()) {
            str2 = Base64.encodeToString(this.f14875h.a(str2.getBytes(this.f14869b)), 0);
        }
        edit.putString(str, str2);
        edit.apply();
    }
}
