package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import j6.f;

/* loaded from: classes.dex */
public final class zzadu {
    private static Boolean zza;

    public static boolean zza(Context context) {
        if (zza == null) {
            int c10 = f.f8490b.c(context, 12451000);
            zza = Boolean.valueOf(c10 == 0 || c10 == 2);
        }
        return zza.booleanValue();
    }
}
