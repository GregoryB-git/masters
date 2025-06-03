package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import b.a0;
import m6.j;
import v6.a;

/* loaded from: classes.dex */
public final class zzaey {
    private final String zza;
    private final String zzb;

    public zzaey(Context context) {
        this(context, context.getPackageName());
    }

    private zzaey(Context context, String str) {
        j.i(context);
        j.e(str);
        this.zza = str;
        try {
            byte[] a10 = a.a(context, str);
            if (a10 != null) {
                this.zzb = a0.o(a10);
                return;
            }
            Log.e("FBA-PackageInfo", "single cert required: " + str);
            this.zzb = null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: " + str);
            this.zzb = null;
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
