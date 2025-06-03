package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public abstract class zzjk {
    private static volatile int zzd = 100;
    public int zza;
    public int zzb;
    public zzjl zzc;
    private int zze;

    private zzjk() {
        this.zze = zzd;
    }

    public static long zza(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static zzjk zza(byte[] bArr, int i10, int i11, boolean z10) {
        zzjj zzjjVar = new zzjj(bArr, i11);
        try {
            zzjjVar.zza(i11);
            return zzjjVar;
        } catch (zzkp e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int zze(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public abstract double zza();

    public abstract int zza(int i10);

    public abstract float zzb();

    public abstract void zzb(int i10);

    public abstract int zzc();

    public abstract void zzc(int i10);

    public abstract int zzd();

    public abstract boolean zzd(int i10);

    public abstract int zze();

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

    public abstract zziy zzq();

    public abstract String zzr();

    public abstract String zzs();

    public abstract boolean zzt();

    public abstract boolean zzu();

    public final void zzv() {
        if (this.zza + this.zzb >= this.zze) {
            throw zzkp.zzh();
        }
    }
}
