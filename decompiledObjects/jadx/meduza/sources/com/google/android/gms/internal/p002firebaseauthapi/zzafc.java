package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import b8.f0;
import java.util.Map;
import java.util.concurrent.Executor;
import r.b;

/* loaded from: classes.dex */
public final class zzafc {
    private static final Map<String, zzafe> zza = new b();

    public static f0 zza(String str, f0 f0Var, zzaeg zzaegVar) {
        zza(str, zzaegVar);
        return new zzafb(f0Var, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzaeg zzaegVar) {
        zza.put(str, new zzafe(zzaegVar, System.currentTimeMillis()));
    }

    public static boolean zza(String str, f0 f0Var, Activity activity, Executor executor) {
        Map<String, zzafe> map = zza;
        if (!map.containsKey(str)) {
            zza(str, null);
            return false;
        }
        zzafe zzafeVar = map.get(str);
        if (System.currentTimeMillis() - zzafeVar.zzb >= 120000) {
            zza(str, null);
            return false;
        }
        zzaeg zzaegVar = zzafeVar.zza;
        if (zzaegVar == null) {
            return true;
        }
        zzaegVar.zza(f0Var, activity, executor, str);
        return true;
    }
}
