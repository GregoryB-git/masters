// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w2;

import java.util.List;
import android.content.pm.PackageManager;
import android.content.Intent;
import E2.l;
import android.content.pm.PackageInfo;
import G2.c;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import G2.d;
import android.content.Context;

public final class x
{
    public final Context a;
    public int b;
    public int c;
    
    public x(final Context a) {
        this.c = 0;
        this.a = a;
    }
    
    public final int a() {
        // monitorenter(this)
        // monitorexit(this)
        Label_0097: {
            Label_0088: {
                PackageInfo packageInfo = null;
                Label_0076: {
                    try {
                        if (this.b == 0) {
                            final x x = this;
                            final Context context = x.a;
                            final c c = d.a(context);
                            final String s = "com.google.android.gms";
                            final int n = 0;
                            c.e(s, n);
                            break Label_0076;
                        }
                        break Label_0088;
                    }
                    finally {
                        final Throwable t;
                        packageInfo = (PackageInfo)t;
                        break Label_0097;
                    }
                    try {
                        final x x = this;
                        final Context context = x.a;
                        final c c = d.a(context);
                        final String s = "com.google.android.gms";
                        final int n = 0;
                        c.e(s, n);
                    }
                    catch (PackageManager$NameNotFoundException obj) {
                        final String value = String.valueOf(obj);
                        final StringBuilder sb = new StringBuilder(value.length() + 23);
                        sb.append("Failed to find package ");
                        sb.append(value);
                        Log.w("Metadata", sb.toString());
                        packageInfo = null;
                    }
                }
                if (packageInfo != null) {
                    this.b = packageInfo.versionCode;
                }
            }
            return this.b;
        }
    }
    // monitorexit(this)
    
    public final int b() {
        // monitorenter(this)
        // monitorexit(this)
        Label_0207: {
            try {
                final int c = this.c;
                if (c != 0) {
                    // monitorexit(this)
                    return c;
                }
                this.a.getPackageManager();
                if (d.a(this.a).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("Metadata", "Google Play services missing or without correct permission.");
                    // monitorexit(this)
                    return 0;
                }
            }
            finally {
                break Label_0207;
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
                        this.c = 1;
                        // monitorexit(this)
                        return 1;
                    }
                }
            }
            final Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent2.setPackage("com.google.android.gms");
            final List queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
            if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                this.c = 2;
                // monitorexit(this)
                return 2;
            }
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (l.h()) {
                this.c = 2;
                n = 2;
            }
            else {
                this.c = 1;
            }
            return n;
        }
    }
    // monitorexit(this)
}
