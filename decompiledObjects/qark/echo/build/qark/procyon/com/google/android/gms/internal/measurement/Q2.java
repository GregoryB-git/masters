// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.content.pm.ProviderInfo;
import android.os.Build$VERSION;
import android.util.Log;
import android.net.Uri;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;
import W2.l;

public abstract class Q2
{
    public static volatile l a;
    public static final Object b;
    
    static {
        Q2.a = l.a();
        b = new Object();
    }
    
    public static boolean a(final Context context) {
        final PackageManager packageManager = context.getPackageManager();
        try {
            return (packageManager.getApplicationInfo("com.google.android.gms", 0).flags & 0x81) != 0x0;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return false;
        }
    }
    
    public static boolean b(final Context context, Uri b) {
        final String authority = b.getAuthority();
        final boolean equals = "com.google.android.gms.phenotype".equals(authority);
        final boolean b2 = false;
        if (!equals) {
            final StringBuilder sb = new StringBuilder();
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            Log.e("PhenotypeClientHelper", sb.toString());
            return false;
        }
        if (!Q2.a.c()) {
            while (true) {
                b = (Uri)Q2.b;
                // monitorenter(b)
                while (true) {
                    Label_0209: {
                        while (true) {
                            try {
                                if (Q2.a.c()) {
                                    // monitorexit(b)
                                    return (boolean)Q2.a.b();
                                }
                                boolean b3 = false;
                                Label_0186: {
                                    if (!"com.google.android.gms".equals(context.getPackageName())) {
                                        Object o = context.getPackageManager();
                                        if (Build$VERSION.SDK_INT >= 29) {
                                            break Label_0209;
                                        }
                                        final int n = 0;
                                        o = ((PackageManager)o).resolveContentProvider("com.google.android.gms.phenotype", n);
                                        b3 = b2;
                                        if (o == null) {
                                            break Label_0186;
                                        }
                                        b3 = b2;
                                        if (!"com.google.android.gms".equals(((ProviderInfo)o).packageName)) {
                                            break Label_0186;
                                        }
                                    }
                                    b3 = b2;
                                    if (a(context)) {
                                        b3 = true;
                                    }
                                }
                                Q2.a = l.d(b3);
                                // monitorexit(b)
                                break;
                                // monitorexit(b)
                                throw context;
                            }
                            finally {
                                continue;
                            }
                            break;
                        }
                    }
                    final int n = 268435456;
                    continue;
                }
            }
        }
        return (boolean)Q2.a.b();
    }
}
