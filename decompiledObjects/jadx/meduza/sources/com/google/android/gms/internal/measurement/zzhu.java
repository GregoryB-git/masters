package com.google.android.gms.internal.measurement;

import a0.j;
import android.content.Context;
import android.net.Uri;
import defpackage.f;
import r.b;

/* loaded from: classes.dex */
public final class zzhu {
    private static final b<String, Uri> zza = new b<>();

    public static synchronized Uri zza(String str) {
        Uri orDefault;
        synchronized (zzhu.class) {
            b<String, Uri> bVar = zza;
            orDefault = bVar.getOrDefault(str, null);
            if (orDefault == null) {
                orDefault = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
                bVar.put(str, orDefault);
            }
        }
        return orDefault;
    }

    public static boolean zza(String str, String str2) {
        if (str.equals("eng") || str.equals("userdebug")) {
            return str2.contains("dev-keys") || str2.contains("test-keys");
        }
        return false;
    }

    public static String zza(Context context, String str) {
        if (!str.contains("#")) {
            return j.k(str, "#", "", context.getPackageName());
        }
        throw new IllegalArgumentException(f.j("The passed in package cannot already have a subpackage: ", str));
    }
}
