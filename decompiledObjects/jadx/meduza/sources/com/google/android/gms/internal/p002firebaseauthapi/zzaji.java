package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public abstract class zzaji {
    private static volatile int zzd = 100;
    public int zza;
    public int zzb;
    public zzajm zzc;
    private int zze;
    private int zzf;

    private zzaji() {
        this.zzf = zzd;
        this.zzb = Integer.MAX_VALUE;
    }

    public static int zza(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long zza(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static zzaji zza(byte[] bArr, int i10, int i11, boolean z10) {
        zzajl zzajlVar = new zzajl(bArr, i10, i11, z10);
        try {
            zzajlVar.zzb(i11);
            return zzajlVar;
        } catch (zzakm e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract double zza();

    public abstract float zzb();

    public abstract int zzb(int i10);

    public abstract int zzc();

    public abstract void zzc(int i10);

    public abstract int zzd();

    public abstract void zzd(int i10);

    public abstract int zze();

    public abstract boolean zze(int i10);

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzi();

    public abstract int zzj();

    public abstract long zzk();

    public abstract long zzl();

    public abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract zzaiw zzq();

    public abstract String zzr();

    public abstract String zzs();

    public final void zzt() {
        if (this.zza + this.zze >= this.zzf) {
            throw zzakm.zzh();
        }
    }

    public final void zzu() {
        if (this.zze == 0) {
            zzc(0);
        }
    }

    public final void zzv() {
        int zzi;
        do {
            zzi = zzi();
            if (zzi == 0) {
                return;
            }
            zzt();
            this.zze++;
            this.zze--;
        } while (zze(zzi));
    }

    public abstract boolean zzw();

    public abstract boolean zzx();
}
