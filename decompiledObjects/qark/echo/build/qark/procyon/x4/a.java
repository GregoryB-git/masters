// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x4;

import android.os.BaseBundle;
import s3.b;
import android.os.Bundle;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Build$VERSION;
import n4.c;
import android.content.SharedPreferences;
import android.content.Context;

public class a
{
    public final Context a;
    public final SharedPreferences b;
    public final c c;
    public boolean d;
    
    public a(Context a, final String str, final c c) {
        a = a(a);
        this.a = a;
        final StringBuilder sb = new StringBuilder();
        sb.append("com.google.firebase.common.prefs:");
        sb.append(str);
        this.b = a.getSharedPreferences(sb.toString(), 0);
        this.c = c;
        this.d = this.c();
    }
    
    public static Context a(final Context context) {
        if (Build$VERSION.SDK_INT < 24) {
            return context;
        }
        return x.a.b(context);
    }
    
    public boolean b() {
        synchronized (this) {
            return this.d;
        }
    }
    
    public final boolean c() {
        if (this.b.contains("firebase_data_collection_default_enabled")) {
            return this.b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return this.d();
    }
    
    public final boolean d() {
        try {
            final PackageManager packageManager = this.a.getPackageManager();
            if (packageManager != null) {
                final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.a.getPackageName(), 128);
                if (applicationInfo != null) {
                    final Bundle metaData = applicationInfo.metaData;
                    if (metaData != null && ((BaseBundle)metaData).containsKey("firebase_data_collection_default_enabled")) {
                        return ((BaseBundle)applicationInfo.metaData).getBoolean("firebase_data_collection_default_enabled");
                    }
                }
            }
            return true;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return true;
        }
    }
    
    public void e(final Boolean obj) {
        // monitorenter(this)
        Label_0040: {
            if (obj != null) {
                break Label_0040;
            }
            while (true) {
                try {
                    this.b.edit().remove("firebase_data_collection_default_enabled").apply();
                    boolean b = this.d();
                    while (true) {
                        this.f(b);
                        return;
                        throw;
                        b = Boolean.TRUE.equals(obj);
                        this.b.edit().putBoolean("firebase_data_collection_default_enabled", b).apply();
                        continue;
                    }
                }
                // monitorexit(this)
                // monitorexit(this)
                finally {
                    continue;
                }
                break;
            }
        }
    }
    
    public final void f(final boolean d) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0051: {
            try {
                if (this.d != d) {
                    this.d = d;
                    this.c.a(new n4.a(b.class, new b(d)));
                }
            }
            finally {
                break Label_0051;
            }
            return;
        }
    }
    // monitorexit(this)
}
