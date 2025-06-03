/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.List
 */
package w2;

import E2.l;
import G2.d;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.List;

public final class x {
    public final Context a;
    public int b;
    public int c = 0;

    public x(Context context) {
        this.a = context;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final int a() {
        block6 : {
            String string2;
            block7 : {
                // MONITORENTER : this
                if (this.b != 0) break block6;
                string2 = d.a(this.a).e("com.google.android.gms", 0);
                break block7;
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    string2 = String.valueOf((Object)nameNotFoundException);
                    StringBuilder stringBuilder = new StringBuilder(string2.length() + 23);
                    stringBuilder.append("Failed to find package ");
                    stringBuilder.append(string2);
                    Log.w((String)"Metadata", (String)stringBuilder.toString());
                    string2 = null;
                }
            }
            if (string2 != null) {
                this.b = string2.versionCode;
            }
        }
        int n8 = this.b;
        // MONITOREXIT : this
        return n8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int b() {
        synchronized (this) {
            Throwable throwable2;
            block11 : {
                int n8;
                PackageManager packageManager;
                Intent intent;
                block10 : {
                    block9 : {
                        try {
                            n8 = this.c;
                            if (n8 == 0) break block9;
                        }
                        catch (Throwable throwable2) {}
                        return n8;
                    }
                    packageManager = this.a.getPackageManager();
                    if (d.a(this.a).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                        Log.e((String)"Metadata", (String)"Google Play services missing or without correct permission.");
                        return 0;
                    }
                    break block10;
                    break block11;
                }
                boolean bl = l.h();
                n8 = 1;
                if (!bl) {
                    intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent.setPackage("com.google.android.gms");
                    intent = packageManager.queryIntentServices(intent, 0);
                    if (intent != null && intent.size() > 0) {
                        this.c = 1;
                        return 1;
                    }
                }
                intent = new Intent("com.google.iid.TOKEN_REQUEST");
                intent.setPackage("com.google.android.gms");
                packageManager = packageManager.queryBroadcastReceivers(intent, 0);
                if (packageManager != null && packageManager.size() > 0) {
                    this.c = 2;
                    return 2;
                }
                Log.w((String)"Metadata", (String)"Failed to resolve IID implementation package, falling back");
                if (l.h()) {
                    this.c = 2;
                    return 2;
                }
                this.c = 1;
                return n8;
            }
            throw throwable2;
        }
    }
}

