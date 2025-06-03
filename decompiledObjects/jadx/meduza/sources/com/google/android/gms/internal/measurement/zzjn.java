package com.google.android.gms.internal.measurement;

import defpackage.f;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzjn extends zziv {
    private static final Logger zzb = Logger.getLogger(zzjn.class.getName());
    private static final boolean zzc = zzmz.zzc();
    public zzjp zza;

    public static class zza extends IOException {
        public zza() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zza(int i10, int i11, int i12, Throwable th) {
            this(i10, i11, i12, th);
        }

        private zza(long j10, long j11, int i10, Throwable th) {
            this(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10)), th);
        }

        private zza(String str, Throwable th) {
            super(f.j("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }

        public zza(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    public static class zzb extends zzjn {
        private final byte[] zzb;
        private final int zzc;
        private int zzd;

        public zzb(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if ((i11 | 0 | (bArr.length - i11)) < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i11)));
            }
            this.zzb = bArr;
            this.zzd = 0;
            this.zzc = i11;
        }

        private final void zzc(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.zzb, this.zzd, i11);
                this.zzd += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new zza(this.zzd, this.zzc, i11, (Throwable) e10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final int zza() {
            return this.zzc - this.zzd;
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void zza(byte b10) {
            int i10;
            int i11 = this.zzd;
            try {
                i10 = i11 + 1;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
            }
            try {
                this.zzb[i11] = b10;
                this.zzd = i10;
            } catch (IndexOutOfBoundsException e11) {
                e = e11;
                i11 = i10;
                throw new zza(i11, this.zzc, 1, (Throwable) e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zziv
        public final void zza(byte[] bArr, int i10, int i11) {
            zzc(bArr, i10, i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void zzb(int i10, zzlm zzlmVar) {
            zzj(1, 3);
            zzk(2, i10);
            zzj(3, 2);
            zzc(zzlmVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void zzb(int i10, String str) {
            zzj(i10, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void zzb(int i10, boolean z10) {
            zzj(i10, 0);
            zza(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void zzb(zziy zziyVar) {
            zzk(zziyVar.zzb());
            zziyVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void zzb(String str) {
            int i10 = this.zzd;
            try {
                int zzg = zzjn.zzg(str.length() * 3);
                int zzg2 = zzjn.zzg(str.length());
                if (zzg2 != zzg) {
                    zzk(zzna.zza(str));
                    this.zzd = zzna.zza(str, this.zzb, this.zzd, zza());
                    return;
                }
                int i11 = i10 + zzg2;
                this.zzd = i11;
                int zza = zzna.zza(str, this.zzb, i11, zza());
                this.zzd = i10;
                zzk((zza - i10) - zzg2);
                this.zzd = zza;
            } catch (zznd e10) {
                this.zzd = i10;
                zza(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new zza(e11);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void zzb(byte[] bArr, int i10, int i11) {
            zzk(i11);
            zzc(bArr, 0, i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void zzc(int i10, zziy zziyVar) {
            zzj(i10, 2);
            zzb(zziyVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void zzc(int i10, zzlm zzlmVar, zzme zzmeVar) {
            zzj(i10, 2);
            zzk(((zzio) zzlmVar).zza(zzmeVar));
            zzmeVar.zza((zzme) zzlmVar, (zznl) this.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void zzc(zzlm zzlmVar) {
            zzk(zzlmVar.zzcf());
            zzlmVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void zzd(int i10, zziy zziyVar) {
            zzj(1, 3);
            zzk(2, i10);
            zzc(3, zziyVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void zzf(int i10, long j10) {
            zzj(i10, 1);
            zzf(j10);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void zzf(long j10) {
            int i10 = this.zzd;
            try {
                byte[] bArr = this.zzb;
                bArr[i10] = (byte) j10;
                bArr[i10 + 1] = (byte) (j10 >> 8);
                bArr[i10 + 2] = (byte) (j10 >> 16);
                bArr[i10 + 3] = (byte) (j10 >> 24);
                bArr[i10 + 4] = (byte) (j10 >> 32);
                bArr[i10 + 5] = (byte) (j10 >> 40);
                bArr[i10 + 6] = (byte) (j10 >> 48);
                bArr[i10 + 7] = (byte) (j10 >> 56);
                this.zzd = i10 + 8;
            } catch (IndexOutOfBoundsException e10) {
                throw new zza(i10, this.zzc, 8, (Throwable) e10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void zzg(int i10, int i11) {
            zzj(i10, 5);
            zzh(i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void zzh(int i10) {
            int i11 = this.zzd;
            try {
                byte[] bArr = this.zzb;
                bArr[i11] = (byte) i10;
                bArr[i11 + 1] = (byte) (i10 >> 8);
                bArr[i11 + 2] = (byte) (i10 >> 16);
                bArr[i11 + 3] = i10 >> 24;
                this.zzd = i11 + 4;
            } catch (IndexOutOfBoundsException e10) {
                throw new zza(i11, this.zzc, 4, (Throwable) e10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void zzh(int i10, int i11) {
            zzj(i10, 0);
            zzi(i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void zzh(int i10, long j10) {
            zzj(i10, 0);
            zzh(j10);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void zzh(long j10) {
            int i10;
            int i11 = this.zzd;
            if (!zzjn.zzc || zza() < 10) {
                while ((j10 & (-128)) != 0) {
                    try {
                        int i12 = i11 + 1;
                        try {
                            this.zzb[i11] = (byte) (((int) j10) | 128);
                            j10 >>>= 7;
                            i11 = i12;
                        } catch (IndexOutOfBoundsException e10) {
                            e = e10;
                            i11 = i12;
                            throw new zza(i11, this.zzc, 1, (Throwable) e);
                        }
                    } catch (IndexOutOfBoundsException e11) {
                        e = e11;
                    }
                }
                i10 = i11 + 1;
                try {
                    this.zzb[i11] = (byte) j10;
                } catch (IndexOutOfBoundsException e12) {
                    e = e12;
                    i11 = i10;
                    throw new zza(i11, this.zzc, 1, (Throwable) e);
                }
            } else {
                while ((j10 & (-128)) != 0) {
                    zzmz.zza(this.zzb, i11, (byte) (((int) j10) | 128));
                    j10 >>>= 7;
                    i11++;
                }
                i10 = i11 + 1;
                zzmz.zza(this.zzb, i11, (byte) j10);
            }
            this.zzd = i10;
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void zzi(int i10) {
            if (i10 >= 0) {
                zzk(i10);
            } else {
                zzh(i10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void zzj(int i10, int i11) {
            zzk((i10 << 3) | i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void zzk(int i10) {
            int i11;
            int i12 = this.zzd;
            while ((i10 & (-128)) != 0) {
                try {
                    i11 = i12 + 1;
                    try {
                        this.zzb[i12] = (byte) (i10 | 128);
                        i10 >>>= 7;
                        i12 = i11;
                    } catch (IndexOutOfBoundsException e10) {
                        e = e10;
                        i12 = i11;
                        throw new zza(i12, this.zzc, 1, (Throwable) e);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    e = e11;
                    throw new zza(i12, this.zzc, 1, (Throwable) e);
                }
            }
            i11 = i12 + 1;
            this.zzb[i12] = (byte) i10;
            this.zzd = i11;
        }

        @Override // com.google.android.gms.internal.measurement.zzjn
        public final void zzk(int i10, int i11) {
            zzj(i10, 0);
            zzk(i11);
        }
    }

    private zzjn() {
    }

    public static int zza(double d10) {
        return 8;
    }

    public static int zza(float f) {
        return 4;
    }

    public static int zza(int i10) {
        return zze(i10);
    }

    public static int zza(int i10, double d10) {
        return zzg(i10 << 3) + 8;
    }

    public static int zza(int i10, float f) {
        return zzg(i10 << 3) + 4;
    }

    public static int zza(int i10, int i11) {
        return zze(i11) + zzg(i10 << 3);
    }

    public static int zza(int i10, long j10) {
        return zzg(i10 << 3) + 8;
    }

    public static int zza(int i10, zziy zziyVar) {
        int zzg = zzg(i10 << 3);
        int zzb2 = zziyVar.zzb();
        return zzg(zzb2) + zzb2 + zzg;
    }

    public static int zza(int i10, zzku zzkuVar) {
        return zzb(3, zzkuVar) + zzf(2, i10) + (zzg(8) << 1);
    }

    public static int zza(int i10, zzlm zzlmVar) {
        return zzb(zzlmVar) + zzg(24) + zzf(2, i10) + (zzg(8) << 1);
    }

    @Deprecated
    public static int zza(int i10, zzlm zzlmVar, zzme zzmeVar) {
        return ((zzio) zzlmVar).zza(zzmeVar) + (zzg(i10 << 3) << 1);
    }

    public static int zza(int i10, String str) {
        return zza(str) + zzg(i10 << 3);
    }

    public static int zza(int i10, boolean z10) {
        return zzg(i10 << 3) + 1;
    }

    public static int zza(long j10) {
        return 8;
    }

    public static int zza(zziy zziyVar) {
        int zzb2 = zziyVar.zzb();
        return zzg(zzb2) + zzb2;
    }

    public static int zza(zzku zzkuVar) {
        int zza2 = zzkuVar.zza();
        return zzg(zza2) + zza2;
    }

    @Deprecated
    public static int zza(zzlm zzlmVar) {
        return zzlmVar.zzcf();
    }

    public static int zza(zzlm zzlmVar, zzme zzmeVar) {
        int zza2 = ((zzio) zzlmVar).zza(zzmeVar);
        return zzg(zza2) + zza2;
    }

    public static int zza(String str) {
        int length;
        try {
            length = zzna.zza(str);
        } catch (zznd unused) {
            length = str.getBytes(zzkj.zza).length;
        }
        return zzg(length) + length;
    }

    public static int zza(boolean z10) {
        return 1;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzg(length) + length;
    }

    public static int zzb(int i10) {
        return 4;
    }

    public static int zzb(int i10, int i11) {
        return zzg(i10 << 3) + 4;
    }

    public static int zzb(int i10, long j10) {
        return zze(j10) + zzg(i10 << 3);
    }

    public static int zzb(int i10, zziy zziyVar) {
        return zza(3, zziyVar) + zzf(2, i10) + (zzg(8) << 1);
    }

    public static int zzb(int i10, zzku zzkuVar) {
        int zzg = zzg(i10 << 3);
        int zza2 = zzkuVar.zza();
        return zzg(zza2) + zza2 + zzg;
    }

    public static int zzb(int i10, zzlm zzlmVar, zzme zzmeVar) {
        return zza(zzlmVar, zzmeVar) + zzg(i10 << 3);
    }

    public static int zzb(long j10) {
        return zze(j10);
    }

    public static int zzb(zzlm zzlmVar) {
        int zzcf = zzlmVar.zzcf();
        return zzg(zzcf) + zzcf;
    }

    public static zzjn zzb(byte[] bArr) {
        return new zzb(bArr, 0, bArr.length);
    }

    public static int zzc(int i10) {
        return zze(i10);
    }

    public static int zzc(int i10, int i11) {
        return zze(i11) + zzg(i10 << 3);
    }

    public static int zzc(int i10, long j10) {
        return zzg(i10 << 3) + 8;
    }

    public static int zzc(long j10) {
        return 8;
    }

    public static int zzd(int i10) {
        return 4;
    }

    public static int zzd(int i10, int i11) {
        return zzg(i10 << 3) + 4;
    }

    public static int zzd(int i10, long j10) {
        return zze(zzi(j10)) + zzg(i10 << 3);
    }

    public static int zzd(long j10) {
        return zze(zzi(j10));
    }

    public static int zze(int i10) {
        return zzg(zzl(i10));
    }

    public static int zze(int i10, int i11) {
        return zzg(zzl(i11)) + zzg(i10 << 3);
    }

    public static int zze(int i10, long j10) {
        return zze(j10) + zzg(i10 << 3);
    }

    public static int zze(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int zzf(int i10) {
        return zzg(i10 << 3);
    }

    public static int zzf(int i10, int i11) {
        return zzg(i11) + zzg(i10 << 3);
    }

    public static int zzg(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    private static long zzi(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    private static int zzl(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b10);

    public final void zza(String str, zznd zzndVar) {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzndVar);
        byte[] bytes = str.getBytes(zzkj.zza);
        try {
            zzk(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zza(e10);
        }
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzb(double d10) {
        zzf(Double.doubleToRawLongBits(d10));
    }

    public final void zzb(float f) {
        zzh(Float.floatToRawIntBits(f));
    }

    public final void zzb(int i10, double d10) {
        zzf(i10, Double.doubleToRawLongBits(d10));
    }

    public final void zzb(int i10, float f) {
        zzg(i10, Float.floatToRawIntBits(f));
    }

    public abstract void zzb(int i10, zzlm zzlmVar);

    public abstract void zzb(int i10, String str);

    public abstract void zzb(int i10, boolean z10);

    public abstract void zzb(zziy zziyVar);

    public abstract void zzb(String str);

    public final void zzb(boolean z10) {
        zza(z10 ? (byte) 1 : (byte) 0);
    }

    public abstract void zzb(byte[] bArr, int i10, int i11);

    public abstract void zzc(int i10, zziy zziyVar);

    public abstract void zzc(int i10, zzlm zzlmVar, zzme zzmeVar);

    public abstract void zzc(zzlm zzlmVar);

    public abstract void zzd(int i10, zziy zziyVar);

    public abstract void zzf(int i10, long j10);

    public abstract void zzf(long j10);

    public abstract void zzg(int i10, int i11);

    public final void zzg(int i10, long j10) {
        zzh(i10, zzi(j10));
    }

    public final void zzg(long j10) {
        zzh(zzi(j10));
    }

    public abstract void zzh(int i10);

    public abstract void zzh(int i10, int i11);

    public abstract void zzh(int i10, long j10);

    public abstract void zzh(long j10);

    public abstract void zzi(int i10);

    public final void zzi(int i10, int i11) {
        zzk(i10, zzl(i11));
    }

    public final void zzj(int i10) {
        zzk(zzl(i10));
    }

    public abstract void zzj(int i10, int i11);

    public abstract void zzk(int i10);

    public abstract void zzk(int i10, int i11);
}
