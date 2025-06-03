package com.google.android.gms.internal.p002firebaseauthapi;

import a0.j;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class zzcj {
    static {
        Logger.getLogger(zzcj.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(zzbe.class);
        hashSet.add(zzbk.class);
        hashSet.add(zzcl.class);
        hashSet.add(zzbm.class);
        hashSet.add(zzbj.class);
        hashSet.add(zzcd.class);
        hashSet.add(zzrx.class);
        hashSet.add(zzch.class);
        hashSet.add(zzck.class);
        Collections.unmodifiableSet(hashSet);
    }

    private zzcj() {
    }

    @Deprecated
    public static zzwb zza(String str, zzaiw zzaiwVar) {
        zzbn<?> zza = zzna.zza().zza(str);
        if (zza instanceof zzci) {
            return ((zzci) zza).zzc(zzaiwVar);
        }
        throw new GeneralSecurityException(j.j("manager for key type ", str, " is not a PrivateKeyManager"));
    }

    public static Class<?> zza(Class<?> cls) {
        try {
            return zzon.zza().zza(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static <B, P> P zza(zzpg<B> zzpgVar, Class<P> cls) {
        return (P) zzon.zza().zza(zzpgVar, cls);
    }

    public static <P> P zza(zzwb zzwbVar, Class<P> cls) {
        String zzf = zzwbVar.zzf();
        return zzna.zza().zza(zzf, cls).zzb(zzwbVar.zze());
    }
}
