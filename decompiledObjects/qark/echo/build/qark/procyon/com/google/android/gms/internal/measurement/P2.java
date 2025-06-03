// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import t.a;

public abstract class P2
{
    public static final a a;
    
    static {
        a = new a();
    }
    
    public static Uri a(final String s) {
        // monitorenter(P2.class)
        // monitorexit(P2.class)
        Label_0070: {
            Object str;
            try {
                final a a = P2.a;
                if ((str = a.get(s)) == null) {
                    str = Uri.encode(s);
                    final StringBuilder sb = new StringBuilder("content://com.google.android.gms.phenotype/");
                    sb.append((String)str);
                    str = Uri.parse(sb.toString());
                    a.put(s, str);
                }
            }
            finally {
                break Label_0070;
            }
            return (Uri)str;
        }
    }
    // monitorexit(P2.class)
    
    public static String b(final Context context, final String s) {
        if (!s.contains("#")) {
            final String packageName = context.getPackageName();
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append("#");
            sb.append("");
            sb.append(packageName);
            return sb.toString();
        }
        final StringBuilder sb2 = new StringBuilder("The passed in package cannot already have a subpackage: ");
        sb2.append(s);
        throw new IllegalArgumentException(sb2.toString());
    }
}
