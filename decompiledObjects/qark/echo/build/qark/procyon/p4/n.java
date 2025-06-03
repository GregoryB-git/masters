// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p4;

import android.content.pm.PackageManager$NameNotFoundException;
import java.util.List;
import android.content.pm.PackageManager;
import android.content.Intent;
import E2.l;
import android.util.Log;
import android.content.pm.PackageInfo;
import s3.e;
import android.content.Context;

public class n
{
    public final Context a;
    public String b;
    public String c;
    public int d;
    public int e;
    
    public n(final Context a) {
        this.e = 0;
        this.a = a;
    }
    
    public static String c(final e e) {
        final String f = e.r().f();
        if (f != null) {
            return f;
        }
        final String c = e.r().c();
        if (!c.startsWith("1:")) {
            return c;
        }
        final String[] split = c.split(":");
        if (split.length < 2) {
            return null;
        }
        final String s = split[1];
        if (s.isEmpty()) {
            return null;
        }
        return s;
    }
    
    public String a() {
        // monitorenter(this)
        while (true) {
            try {
                if (this.b == null) {
                    this.h();
                }
                // monitorexit(this)
                return this.b;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public String b() {
        // monitorenter(this)
        while (true) {
            try {
                if (this.c == null) {
                    this.h();
                }
                // monitorexit(this)
                return this.c;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public int d() {
        // monitorenter(this)
        while (true) {
            try {
                if (this.d == 0) {
                    final PackageInfo f = this.f("com.google.android.gms");
                    if (f != null) {
                        this.d = f.versionCode;
                    }
                }
                // monitorexit(this)
                return this.d;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public int e() {
        // monitorenter(this)
        // monitorexit(this)
        Label_0201: {
            try {
                final int e = this.e;
                if (e != 0) {
                    // monitorexit(this)
                    return e;
                }
                if (this.a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
                    // monitorexit(this)
                    return 0;
                }
            }
            finally {
                break Label_0201;
            }
            final boolean h = l.h();
            int n = 1;
            final PackageManager packageManager;
            if (!h) {
                final Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                final List queryIntentServices = packageManager.queryIntentServices(intent, 0);
                if (queryIntentServices != null) {
                    if (queryIntentServices.size() > 0) {
                        this.e = 1;
                        // monitorexit(this)
                        return 1;
                    }
                }
            }
            final Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent2.setPackage("com.google.android.gms");
            final List queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
            if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                this.e = 2;
                // monitorexit(this)
                return 2;
            }
            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            if (l.h()) {
                this.e = 2;
                n = 2;
            }
            else {
                this.e = 1;
            }
            return n;
        }
    }
    // monitorexit(this)
    
    public final PackageInfo f(String value) {
        try {
            return this.a.getPackageManager().getPackageInfo(value, 0);
        }
        catch (PackageManager$NameNotFoundException obj) {
            value = String.valueOf(obj);
            final StringBuilder sb = new StringBuilder(value.length() + 23);
            sb.append("Failed to find package ");
            sb.append(value);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }
    
    public boolean g() {
        return this.e() != 0;
    }
    
    public final void h() {
        // monitorenter(this)
        // monitorexit(this)
        Label_0047: {
            try {
                final PackageInfo f = this.f(this.a.getPackageName());
                if (f != null) {
                    this.b = Integer.toString(f.versionCode);
                    this.c = f.versionName;
                    // monitorexit(this)
                    return;
                }
            }
            finally {
                break Label_0047;
            }
            return;
        }
    }
    // monitorexit(this)
}
