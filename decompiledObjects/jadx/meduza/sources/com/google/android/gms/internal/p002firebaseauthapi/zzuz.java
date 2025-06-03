package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class zzuz extends zzakg<zzuz, zza> implements zzalp {
    private static final zzuz zzc;
    private static volatile zzalw<zzuz> zzd;
    private int zze;
    private zzaiw zzf = zzaiw.zza;
    private zzwo zzg;

    public static final class zza extends zzakg.zzb<zzuz, zza> implements zzalp {
        private zza() {
            super(zzuz.zzc);
        }

        public final zza zza() {
            zzg();
            zzuz.zza((zzuz) this.zza);
            return this;
        }

        public final zza zza(zzaiw zzaiwVar) {
            zzg();
            zzuz.zza((zzuz) this.zza, zzaiwVar);
            return this;
        }

        public final zza zza(zzwo zzwoVar) {
            zzg();
            zzuz.zza((zzuz) this.zza, zzwoVar);
            return this;
        }
    }

    static {
        zzuz zzuzVar = new zzuz();
        zzc = zzuzVar;
        zzakg.zza((Class<zzuz>) zzuz.class, zzuzVar);
    }

    private zzuz() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public static zzuz zza(InputStream inputStream, zzajv zzajvVar) {
        return (zzuz) zzakg.zza(zzc, inputStream, zzajvVar);
    }

    public static /* synthetic */ void zza(zzuz zzuzVar) {
        zzuzVar.zzg = null;
        zzuzVar.zze &= -2;
    }

    public static /* synthetic */ void zza(zzuz zzuzVar, zzaiw zzaiwVar) {
        zzaiwVar.getClass();
        zzuzVar.zzf = zzaiwVar;
    }

    public static /* synthetic */ void zza(zzuz zzuzVar, zzwo zzwoVar) {
        zzwoVar.getClass();
        zzuzVar.zzg = zzwoVar;
        zzuzVar.zze |= 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zzuy.zza[i10 - 1]) {
            case 1:
                return new zzuz();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzuz> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzuz.class) {
                        zzalwVar = zzd;
                        if (zzalwVar == null) {
                            zzalwVar = new zzakg.zza<>(zzc);
                            zzd = zzalwVar;
                        }
                    }
                }
                return zzalwVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public final zzaiw zzc() {
        return this.zzf;
    }
}
