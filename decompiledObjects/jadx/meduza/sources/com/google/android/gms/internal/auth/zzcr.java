package com.google.android.gms.internal.auth;

import android.net.Uri;
import r.b;

/* loaded from: classes.dex */
public final class zzcr {
    private static final b zza = new b();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized Uri zza(String str) {
        synchronized (zzcr.class) {
            b bVar = zza;
            Uri uri = (Uri) bVar.getOrDefault("com.google.android.gms.auth_account", null);
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
            bVar.put("com.google.android.gms.auth_account", parse);
            return parse;
        }
    }
}
