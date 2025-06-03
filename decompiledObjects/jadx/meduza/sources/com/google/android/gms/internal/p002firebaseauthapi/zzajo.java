package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.f;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzajo extends zzaix {
    private static final Logger zzb = Logger.getLogger(zzajo.class.getName());
    private static final boolean zzc = zzana.zzc();
    public zzajq zza;

    public static class zza extends zzajo {
        private final byte[] zzb;
        private final int zzc;
        private int zzd;

        public zza(byte[] bArr, int i10, int i11) {
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
                throw new zzd(this.zzd, this.zzc, i11, (Throwable) e10);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final int zza() {
            return this.zzc - this.zzd;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
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
                throw new zzd(i11, this.zzc, 1, (Throwable) e);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaix
        public final void zza(byte[] bArr, int i10, int i11) {
            zzc(bArr, i10, i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(int i10, zzaln zzalnVar) {
            zzj(1, 3);
            zzk(2, i10);
            zzj(3, 2);
            zzc(zzalnVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(int i10, String str) {
            zzj(i10, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(int i10, boolean z10) {
            zzj(i10, 0);
            zza(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(zzaiw zzaiwVar) {
            zzl(zzaiwVar.zzb());
            zzaiwVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(zzaln zzalnVar, zzamc zzamcVar) {
            zzl(((zzain) zzalnVar).zza(zzamcVar));
            zzamcVar.zza((zzamc) zzalnVar, (zzanm) this.zza);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(String str) {
            int i10 = this.zzd;
            try {
                int zzh = zzajo.zzh(str.length() * 3);
                int zzh2 = zzajo.zzh(str.length());
                if (zzh2 != zzh) {
                    zzl(zzanb.zza(str));
                    this.zzd = zzanb.zza(str, this.zzb, this.zzd, zza());
                    return;
                }
                int i11 = i10 + zzh2;
                this.zzd = i11;
                int zza = zzanb.zza(str, this.zzb, i11, zza());
                this.zzd = i10;
                zzl((zza - i10) - zzh2);
                this.zzd = zza;
            } catch (zzane e10) {
                this.zzd = i10;
                zza(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new zzd(e11);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(byte[] bArr, int i10, int i11) {
            zzl(i11);
            zzc(bArr, 0, i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzc() {
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzc(int i10, zzaiw zzaiwVar) {
            zzj(i10, 2);
            zzb(zzaiwVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzc(int i10, zzaln zzalnVar, zzamc zzamcVar) {
            zzj(i10, 2);
            zzl(((zzain) zzalnVar).zza(zzamcVar));
            zzamcVar.zza((zzamc) zzalnVar, (zzanm) this.zza);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzc(zzaln zzalnVar) {
            zzl(zzalnVar.zzl());
            zzalnVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzd(int i10, zzaiw zzaiwVar) {
            zzj(1, 3);
            zzk(2, i10);
            zzc(3, zzaiwVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzf(int i10, long j10) {
            zzj(i10, 1);
            zzf(j10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
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
                throw new zzd(i10, this.zzc, 8, (Throwable) e10);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzg(int i10, int i11) {
            zzj(i10, 5);
            zzi(i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzh(int i10, int i11) {
            zzj(i10, 0);
            zzj(i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzh(int i10, long j10) {
            zzj(i10, 0);
            zzh(j10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzh(long j10) {
            int i10;
            int i11 = this.zzd;
            if (!zzajo.zzc || zza() < 10) {
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
                            throw new zzd(i11, this.zzc, 1, (Throwable) e);
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
                    throw new zzd(i11, this.zzc, 1, (Throwable) e);
                }
            } else {
                while ((j10 & (-128)) != 0) {
                    zzana.zza(this.zzb, i11, (byte) (((int) j10) | 128));
                    j10 >>>= 7;
                    i11++;
                }
                i10 = i11 + 1;
                zzana.zza(this.zzb, i11, (byte) j10);
            }
            this.zzd = i10;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzi(int i10) {
            int i11 = this.zzd;
            try {
                byte[] bArr = this.zzb;
                bArr[i11] = (byte) i10;
                bArr[i11 + 1] = (byte) (i10 >> 8);
                bArr[i11 + 2] = (byte) (i10 >> 16);
                bArr[i11 + 3] = i10 >> 24;
                this.zzd = i11 + 4;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzd(i11, this.zzc, 4, (Throwable) e10);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzj(int i10) {
            if (i10 >= 0) {
                zzl(i10);
            } else {
                zzh(i10);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzj(int i10, int i11) {
            zzl((i10 << 3) | i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzk(int i10, int i11) {
            zzj(i10, 0);
            zzl(i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzl(int i10) {
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
                        throw new zzd(i12, this.zzc, 1, (Throwable) e);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    e = e11;
                    throw new zzd(i12, this.zzc, 1, (Throwable) e);
                }
            }
            i11 = i12 + 1;
            this.zzb[i12] = (byte) i10;
            this.zzd = i11;
        }
    }

    public static abstract class zzb extends zzajo {
        public final byte[] zzb;
        public final int zzc;
        public int zzd;
        public int zze;

        public zzb(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.zzb = bArr;
            this.zzc = bArr.length;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final int zza() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        public final void zzb(byte b10) {
            int i10 = this.zzd;
            this.zzb[i10] = b10;
            this.zzd = i10 + 1;
            this.zze++;
        }

        public final void zzi(long j10) {
            int i10 = this.zzd;
            byte[] bArr = this.zzb;
            int i11 = i10 + 1;
            bArr[i10] = (byte) j10;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (j10 >> 8);
            int i13 = i12 + 1;
            bArr[i12] = (byte) (j10 >> 16);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (j10 >> 24);
            int i15 = i14 + 1;
            bArr[i14] = (byte) (j10 >> 32);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (j10 >> 40);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (j10 >> 48);
            bArr[i17] = (byte) (j10 >> 56);
            this.zzd = i17 + 1;
            this.zze += 8;
        }

        public final void zzj(long j10) {
            if (!zzajo.zzc) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i10 = this.zzd;
                    this.zzd = i10 + 1;
                    bArr[i10] = (byte) (((int) j10) | 128);
                    this.zze++;
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i11 = this.zzd;
                this.zzd = i11 + 1;
                bArr2[i11] = (byte) j10;
                this.zze++;
                return;
            }
            long j11 = this.zzd;
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.zzb;
                int i12 = this.zzd;
                this.zzd = i12 + 1;
                zzana.zza(bArr3, i12, (byte) (((int) j10) | 128));
                j10 >>>= 7;
            }
            byte[] bArr4 = this.zzb;
            int i13 = this.zzd;
            this.zzd = i13 + 1;
            zzana.zza(bArr4, i13, (byte) j10);
            this.zze += (int) (this.zzd - j11);
        }

        public final void zzl(int i10, int i11) {
            zzn((i10 << 3) | i11);
        }

        public final void zzm(int i10) {
            int i11 = this.zzd;
            byte[] bArr = this.zzb;
            int i12 = i11 + 1;
            bArr[i11] = (byte) i10;
            int i13 = i12 + 1;
            bArr[i12] = (byte) (i10 >> 8);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (i10 >> 16);
            bArr[i14] = i10 >> 24;
            this.zzd = i14 + 1;
            this.zze += 4;
        }

        public final void zzn(int i10) {
            if (!zzajo.zzc) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i11 = this.zzd;
                    this.zzd = i11 + 1;
                    bArr[i11] = (byte) (i10 | 128);
                    this.zze++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i12 = this.zzd;
                this.zzd = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.zze++;
                return;
            }
            long j10 = this.zzd;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.zzb;
                int i13 = this.zzd;
                this.zzd = i13 + 1;
                zzana.zza(bArr3, i13, (byte) (i10 | 128));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.zzb;
            int i14 = this.zzd;
            this.zzd = i14 + 1;
            zzana.zza(bArr4, i14, (byte) i10);
            this.zze += (int) (this.zzd - j10);
        }
    }

    public static final class zzc extends zzb {
        private final OutputStream zzf;

        public zzc(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.zzf = outputStream;
        }

        private final void zzc(byte[] bArr, int i10, int i11) {
            int i12 = this.zzc;
            int i13 = this.zzd;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.zzb, i13, i11);
                this.zzd += i11;
            } else {
                int i14 = i12 - i13;
                System.arraycopy(bArr, i10, this.zzb, i13, i14);
                int i15 = i10 + i14;
                i11 -= i14;
                this.zzd = this.zzc;
                this.zze += i14;
                zze();
                if (i11 <= this.zzc) {
                    System.arraycopy(bArr, i15, this.zzb, 0, i11);
                    this.zzd = i11;
                } else {
                    this.zzf.write(bArr, i15, i11);
                }
            }
            this.zze += i11;
        }

        private final void zze() {
            this.zzf.write(this.zzb, 0, this.zzd);
            this.zzd = 0;
        }

        private final void zzo(int i10) {
            if (this.zzc - this.zzd < i10) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zza(byte b10) {
            if (this.zzd == this.zzc) {
                zze();
            }
            zzb(b10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaix
        public final void zza(byte[] bArr, int i10, int i11) {
            zzc(bArr, i10, i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(int i10, zzaln zzalnVar) {
            zzj(1, 3);
            zzk(2, i10);
            zzj(3, 2);
            zzc(zzalnVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(int i10, String str) {
            zzj(i10, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(int i10, boolean z10) {
            zzo(11);
            zzl(i10, 0);
            zzb(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(zzaiw zzaiwVar) {
            zzl(zzaiwVar.zzb());
            zzaiwVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(zzaln zzalnVar, zzamc zzamcVar) {
            zzl(((zzain) zzalnVar).zza(zzamcVar));
            zzamcVar.zza((zzamc) zzalnVar, (zzanm) this.zza);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(String str) {
            int zza;
            try {
                int length = str.length() * 3;
                int zzh = zzajo.zzh(length);
                int i10 = zzh + length;
                int i11 = this.zzc;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int zza2 = zzanb.zza(str, bArr, 0, length);
                    zzl(zza2);
                    zza(bArr, 0, zza2);
                    return;
                }
                if (i10 > i11 - this.zzd) {
                    zze();
                }
                int zzh2 = zzajo.zzh(str.length());
                int i12 = this.zzd;
                try {
                    if (zzh2 == zzh) {
                        int i13 = i12 + zzh2;
                        this.zzd = i13;
                        int zza3 = zzanb.zza(str, this.zzb, i13, this.zzc - i13);
                        this.zzd = i12;
                        zza = (zza3 - i12) - zzh2;
                        zzn(zza);
                        this.zzd = zza3;
                    } else {
                        zza = zzanb.zza(str);
                        zzn(zza);
                        this.zzd = zzanb.zza(str, this.zzb, this.zzd, zza);
                    }
                    this.zze += zza;
                } catch (zzane e10) {
                    this.zze -= this.zzd - i12;
                    this.zzd = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new zzd(e11);
                }
            } catch (zzane e12) {
                zza(str, e12);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzb(byte[] bArr, int i10, int i11) {
            zzl(i11);
            zzc(bArr, 0, i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzc() {
            if (this.zzd > 0) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzc(int i10, zzaiw zzaiwVar) {
            zzj(i10, 2);
            zzb(zzaiwVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzc(int i10, zzaln zzalnVar, zzamc zzamcVar) {
            zzj(i10, 2);
            zzb(zzalnVar, zzamcVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzc(zzaln zzalnVar) {
            zzl(zzalnVar.zzl());
            zzalnVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzd(int i10, zzaiw zzaiwVar) {
            zzj(1, 3);
            zzk(2, i10);
            zzc(3, zzaiwVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzf(int i10, long j10) {
            zzo(18);
            zzl(i10, 1);
            zzi(j10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzf(long j10) {
            zzo(8);
            zzi(j10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzg(int i10, int i11) {
            zzo(14);
            zzl(i10, 5);
            zzm(i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzh(int i10, int i11) {
            zzo(20);
            zzl(i10, 0);
            if (i11 >= 0) {
                zzn(i11);
            } else {
                zzj(i11);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzh(int i10, long j10) {
            zzo(20);
            zzl(i10, 0);
            zzj(j10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzh(long j10) {
            zzo(10);
            zzj(j10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzi(int i10) {
            zzo(4);
            zzm(i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzj(int i10) {
            if (i10 >= 0) {
                zzl(i10);
            } else {
                zzh(i10);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzj(int i10, int i11) {
            zzl((i10 << 3) | i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzk(int i10, int i11) {
            zzo(20);
            zzl(i10, 0);
            zzn(i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajo
        public final void zzl(int i10) {
            zzo(5);
            zzn(i10);
        }
    }

    public static class zzd extends IOException {
        public zzd() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzd(int i10, int i11, int i12, Throwable th) {
            this(i10, i11, i12, th);
        }

        private zzd(long j10, long j11, int i10, Throwable th) {
            this(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10)), th);
        }

        private zzd(String str, Throwable th) {
            super(f.j("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }

        public zzd(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private zzajo() {
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
        return zzh(i10 << 3) + 8;
    }

    public static int zza(int i10, float f) {
        return zzh(i10 << 3) + 4;
    }

    public static int zza(int i10, int i11) {
        return zze(i11) + zzh(i10 << 3);
    }

    public static int zza(int i10, long j10) {
        return zzh(i10 << 3) + 8;
    }

    public static int zza(int i10, zzaiw zzaiwVar) {
        int zzh = zzh(i10 << 3);
        int zzb2 = zzaiwVar.zzb();
        return zzh(zzb2) + zzb2 + zzh;
    }

    public static int zza(int i10, zzakv zzakvVar) {
        return zzb(3, zzakvVar) + zzf(2, i10) + (zzh(8) << 1);
    }

    public static int zza(int i10, zzaln zzalnVar) {
        return zzb(zzalnVar) + zzh(24) + zzf(2, i10) + (zzh(8) << 1);
    }

    @Deprecated
    public static int zza(int i10, zzaln zzalnVar, zzamc zzamcVar) {
        return ((zzain) zzalnVar).zza(zzamcVar) + (zzh(i10 << 3) << 1);
    }

    public static int zza(int i10, String str) {
        return zza(str) + zzh(i10 << 3);
    }

    public static int zza(int i10, boolean z10) {
        return zzh(i10 << 3) + 1;
    }

    public static int zza(long j10) {
        return 8;
    }

    public static int zza(zzaiw zzaiwVar) {
        int zzb2 = zzaiwVar.zzb();
        return zzh(zzb2) + zzb2;
    }

    public static int zza(zzakv zzakvVar) {
        int zza2 = zzakvVar.zza();
        return zzh(zza2) + zza2;
    }

    @Deprecated
    public static int zza(zzaln zzalnVar) {
        return zzalnVar.zzl();
    }

    public static int zza(zzaln zzalnVar, zzamc zzamcVar) {
        int zza2 = ((zzain) zzalnVar).zza(zzamcVar);
        return zzh(zza2) + zza2;
    }

    public static int zza(String str) {
        int length;
        try {
            length = zzanb.zza(str);
        } catch (zzane unused) {
            length = str.getBytes(zzaki.zza).length;
        }
        return zzh(length) + length;
    }

    public static int zza(boolean z10) {
        return 1;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzh(length) + length;
    }

    public static zzajo zza(OutputStream outputStream, int i10) {
        return new zzc(outputStream, i10);
    }

    public static int zzb(int i10) {
        return 4;
    }

    public static int zzb(int i10, int i11) {
        return zzh(i10 << 3) + 4;
    }

    public static int zzb(int i10, long j10) {
        return zze(j10) + zzh(i10 << 3);
    }

    public static int zzb(int i10, zzaiw zzaiwVar) {
        return zza(3, zzaiwVar) + zzf(2, i10) + (zzh(8) << 1);
    }

    public static int zzb(int i10, zzakv zzakvVar) {
        int zzh = zzh(i10 << 3);
        int zza2 = zzakvVar.zza();
        return zzh(zza2) + zza2 + zzh;
    }

    public static int zzb(int i10, zzaln zzalnVar, zzamc zzamcVar) {
        return zza(zzalnVar, zzamcVar) + zzh(i10 << 3);
    }

    public static int zzb(long j10) {
        return zze(j10);
    }

    public static int zzb(zzaln zzalnVar) {
        int zzl = zzalnVar.zzl();
        return zzh(zzl) + zzl;
    }

    public static zzajo zzb(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public static int zzc(int i10) {
        return zze(i10);
    }

    public static int zzc(int i10, int i11) {
        return zze(i11) + zzh(i10 << 3);
    }

    public static int zzc(int i10, long j10) {
        return zzh(i10 << 3) + 8;
    }

    public static int zzc(long j10) {
        return 8;
    }

    public static int zzd(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int zzd(int i10, int i11) {
        return zzh(i10 << 3) + 4;
    }

    public static int zzd(int i10, long j10) {
        return zze(zzi(j10)) + zzh(i10 << 3);
    }

    public static int zzd(long j10) {
        return zze(zzi(j10));
    }

    public static int zze(int i10) {
        return 4;
    }

    public static int zze(int i10, int i11) {
        return zzh(zzm(i11)) + zzh(i10 << 3);
    }

    public static int zze(int i10, long j10) {
        return zze(j10) + zzh(i10 << 3);
    }

    public static int zze(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int zzf(int i10) {
        return zzh(zzm(i10));
    }

    public static int zzf(int i10, int i11) {
        return zzh(i11) + zzh(i10 << 3);
    }

    public static int zzg(int i10) {
        return zzh(i10 << 3);
    }

    public static int zzh(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    private static long zzi(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    private static int zzm(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b10);

    public final void zza(String str, zzane zzaneVar) {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzaneVar);
        byte[] bytes = str.getBytes(zzaki.zza);
        try {
            zzl(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzd(e10);
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
        zzi(Float.floatToRawIntBits(f));
    }

    public final void zzb(int i10, double d10) {
        zzf(i10, Double.doubleToRawLongBits(d10));
    }

    public final void zzb(int i10, float f) {
        zzg(i10, Float.floatToRawIntBits(f));
    }

    public abstract void zzb(int i10, zzaln zzalnVar);

    public abstract void zzb(int i10, String str);

    public abstract void zzb(int i10, boolean z10);

    public abstract void zzb(zzaiw zzaiwVar);

    public abstract void zzb(zzaln zzalnVar, zzamc zzamcVar);

    public abstract void zzb(String str);

    public final void zzb(boolean z10) {
        zza(z10 ? (byte) 1 : (byte) 0);
    }

    public abstract void zzb(byte[] bArr, int i10, int i11);

    public abstract void zzc();

    public abstract void zzc(int i10, zzaiw zzaiwVar);

    public abstract void zzc(int i10, zzaln zzalnVar, zzamc zzamcVar);

    public abstract void zzc(zzaln zzalnVar);

    public abstract void zzd(int i10, zzaiw zzaiwVar);

    public abstract void zzf(int i10, long j10);

    public abstract void zzf(long j10);

    public abstract void zzg(int i10, int i11);

    public final void zzg(int i10, long j10) {
        zzh(i10, zzi(j10));
    }

    public final void zzg(long j10) {
        zzh(zzi(j10));
    }

    public abstract void zzh(int i10, int i11);

    public abstract void zzh(int i10, long j10);

    public abstract void zzh(long j10);

    public abstract void zzi(int i10);

    public final void zzi(int i10, int i11) {
        zzk(i10, zzm(i11));
    }

    public abstract void zzj(int i10);

    public abstract void zzj(int i10, int i11);

    public final void zzk(int i10) {
        zzl(zzm(i10));
    }

    public abstract void zzk(int i10, int i11);

    public abstract void zzl(int i10);
}
