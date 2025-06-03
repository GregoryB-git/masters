package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class zzajk extends zzaji {
    private final InputStream zzd;
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    private zzajk(InputStream inputStream, int i10) {
        super();
        this.zzk = Integer.MAX_VALUE;
        zzaki.zza(inputStream, "input");
        this.zzd = inputStream;
        this.zze = new byte[4096];
        this.zzf = 0;
        this.zzh = 0;
        this.zzj = 0;
    }

    private static int zza(InputStream inputStream) {
        try {
            return inputStream.available();
        } catch (zzakm e10) {
            e10.zzk();
            throw e10;
        }
    }

    private static int zza(InputStream inputStream, byte[] bArr, int i10, int i11) {
        try {
            return inputStream.read(bArr, i10, i11);
        } catch (zzakm e10) {
            e10.zzk();
            throw e10;
        }
    }

    private static long zza(InputStream inputStream, long j10) {
        try {
            return inputStream.skip(j10);
        } catch (zzakm e10) {
            e10.zzk();
            throw e10;
        }
    }

    private final byte[] zza(int i10, boolean z10) {
        byte[] zzj = zzj(i10);
        if (zzj != null) {
            return zzj;
        }
        int i11 = this.zzh;
        int i12 = this.zzf;
        int i13 = i12 - i11;
        this.zzj += i12;
        this.zzh = 0;
        this.zzf = 0;
        List<byte[]> zzf = zzf(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zze, i11, bArr, 0, i13);
        for (byte[] bArr2 : zzf) {
            System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
            i13 += bArr2.length;
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzaa() {
        /*
            r5 = this;
            int r0 = r5.zzh
            int r1 = r5.zzf
            if (r1 == r0) goto L6b
            byte[] r2 = r5.zze
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L11
            r5.zzh = r3
            return r0
        L11:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6b
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L22
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L68
        L22:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L2f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2d:
            r1 = r3
            goto L68
        L2f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L68
        L3d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6b
        L68:
            r5.zzh = r1
            return r0
        L6b:
            long r0 = r5.zzm()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzajk.zzaa():int");
    }

    private final long zzab() {
        int i10 = this.zzh;
        if (this.zzf - i10 < 8) {
            zzg(8);
            i10 = this.zzh;
        }
        byte[] bArr = this.zze;
        this.zzh = i10 + 8;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b0, code lost:
    
        if (r2[r0] >= 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long zzac() {
        /*
            Method dump skipped, instructions count: 189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzajk.zzac():long");
    }

    private final void zzad() {
        int i10 = this.zzf + this.zzg;
        this.zzf = i10;
        int i11 = this.zzj + i10;
        int i12 = this.zzk;
        if (i11 <= i12) {
            this.zzg = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzg = i13;
        this.zzf = i10 - i13;
    }

    private final List<byte[]> zzf(int i10) {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int min = Math.min(i10, 4096);
            byte[] bArr = new byte[min];
            int i11 = 0;
            while (i11 < min) {
                int read = this.zzd.read(bArr, i11, min - i11);
                if (read == -1) {
                    throw zzakm.zzj();
                }
                this.zzj += read;
                i11 += read;
            }
            i10 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzg(int i10) {
        if (zzi(i10)) {
            return;
        }
        if (i10 <= (this.zzb - this.zzj) - this.zzh) {
            throw zzakm.zzj();
        }
        throw zzakm.zzi();
    }

    private final void zzh(int i10) {
        int i11 = this.zzf;
        int i12 = this.zzh;
        if (i10 <= i11 - i12 && i10 >= 0) {
            this.zzh = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw zzakm.zzf();
        }
        int i13 = this.zzj;
        int i14 = i13 + i12 + i10;
        int i15 = this.zzk;
        if (i14 > i15) {
            zzh((i15 - i13) - i12);
            throw zzakm.zzj();
        }
        this.zzj = i13 + i12;
        int i16 = i11 - i12;
        this.zzf = 0;
        this.zzh = 0;
        while (i16 < i10) {
            try {
                long j10 = i10 - i16;
                long zza = zza(this.zzd, j10);
                if (zza >= 0 && zza <= j10) {
                    if (zza == 0) {
                        break;
                    } else {
                        i16 += (int) zza;
                    }
                } else {
                    throw new IllegalStateException(String.valueOf(this.zzd.getClass()) + "#skip returned invalid result: " + zza + "\nThe InputStream implementation is buggy.");
                }
            } finally {
                this.zzj += i16;
                zzad();
            }
        }
        if (i16 >= i10) {
            return;
        }
        int i17 = this.zzf;
        int i18 = i17 - this.zzh;
        this.zzh = i17;
        while (true) {
            zzg(1);
            int i19 = i10 - i18;
            int i20 = this.zzf;
            if (i19 <= i20) {
                this.zzh = i19;
                return;
            } else {
                i18 += i20;
                this.zzh = i20;
            }
        }
    }

    private final boolean zzi(int i10) {
        do {
            int i11 = this.zzh;
            int i12 = i11 + i10;
            int i13 = this.zzf;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.zzb;
            int i15 = this.zzj;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.zzk) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.zze;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.zzj += i11;
                this.zzf -= i11;
                this.zzh = 0;
            }
            InputStream inputStream = this.zzd;
            byte[] bArr2 = this.zze;
            int i16 = this.zzf;
            int zza = zza(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.zzb - this.zzj) - i16));
            if (zza == 0 || zza < -1 || zza > this.zze.length) {
                throw new IllegalStateException(String.valueOf(this.zzd.getClass()) + "#read(byte[]) returned invalid result: " + zza + "\nThe InputStream implementation is buggy.");
            }
            if (zza <= 0) {
                return false;
            }
            this.zzf += zza;
            zzad();
        } while (this.zzf < i10);
        return true;
    }

    private final byte[] zzj(int i10) {
        if (i10 == 0) {
            return zzaki.zzb;
        }
        if (i10 < 0) {
            throw zzakm.zzf();
        }
        int i11 = this.zzj;
        int i12 = this.zzh;
        int i13 = i11 + i12 + i10;
        if (i13 - this.zzb > 0) {
            throw zzakm.zzi();
        }
        int i14 = this.zzk;
        if (i13 > i14) {
            zzh((i14 - i11) - i12);
            throw zzakm.zzj();
        }
        int i15 = this.zzf - i12;
        int i16 = i10 - i15;
        if (i16 >= 4096 && i16 > zza(this.zzd)) {
            return null;
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zze, this.zzh, bArr, 0, i15);
        this.zzj += this.zzf;
        this.zzh = 0;
        this.zzf = 0;
        while (i15 < i10) {
            int zza = zza(this.zzd, bArr, i15, i10 - i15);
            if (zza == -1) {
                throw zzakm.zzj();
            }
            this.zzj += zza;
            i15 += zza;
        }
        return bArr;
    }

    private final byte zzy() {
        if (this.zzh == this.zzf) {
            zzg(1);
        }
        byte[] bArr = this.zze;
        int i10 = this.zzh;
        this.zzh = i10 + 1;
        return bArr[i10];
    }

    private final int zzz() {
        int i10 = this.zzh;
        if (this.zzf - i10 < 4) {
            zzg(4);
            i10 = this.zzh;
        }
        byte[] bArr = this.zze;
        this.zzh = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final double zza() {
        return Double.longBitsToDouble(zzab());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final float zzb() {
        return Float.intBitsToFloat(zzz());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final int zzb(int i10) {
        if (i10 < 0) {
            throw zzakm.zzf();
        }
        int i11 = this.zzj + this.zzh + i10;
        if (i11 < 0) {
            throw zzakm.zzg();
        }
        int i12 = this.zzk;
        if (i11 > i12) {
            throw zzakm.zzj();
        }
        this.zzk = i11;
        zzad();
        return i12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final int zzc() {
        return this.zzj + this.zzh;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final void zzc(int i10) {
        if (this.zzi != i10) {
            throw zzakm.zzb();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final int zzd() {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final void zzd(int i10) {
        this.zzk = i10;
        zzad();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final int zze() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final boolean zze(int i10) {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzf - this.zzh < 10) {
                while (i12 < 10) {
                    if (zzy() < 0) {
                        i12++;
                    }
                }
                throw zzakm.zze();
            }
            while (i12 < 10) {
                byte[] bArr = this.zze;
                int i13 = this.zzh;
                this.zzh = i13 + 1;
                if (bArr[i13] < 0) {
                    i12++;
                }
            }
            throw zzakm.zze();
            return true;
        }
        if (i11 == 1) {
            zzh(8);
            return true;
        }
        if (i11 == 2) {
            zzh(zzaa());
            return true;
        }
        if (i11 == 3) {
            zzv();
            zzc(((i10 >>> 3) << 3) | 4);
            return true;
        }
        if (i11 == 4) {
            zzu();
            return false;
        }
        if (i11 != 5) {
            throw zzakm.zza();
        }
        zzh(4);
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final int zzf() {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final int zzg() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final int zzh() {
        return zzaji.zza(zzaa());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final int zzi() {
        if (zzw()) {
            this.zzi = 0;
            return 0;
        }
        int zzaa = zzaa();
        this.zzi = zzaa;
        if ((zzaa >>> 3) != 0) {
            return zzaa;
        }
        throw zzakm.zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final int zzj() {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final long zzk() {
        return zzab();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final long zzl() {
        return zzac();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final long zzm() {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            j10 |= (r3 & Byte.MAX_VALUE) << i10;
            if ((zzy() & 128) == 0) {
                return j10;
            }
        }
        throw zzakm.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final long zzn() {
        return zzab();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final long zzo() {
        return zzaji.zza(zzac());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final long zzp() {
        return zzac();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final zzaiw zzq() {
        int zzaa = zzaa();
        int i10 = this.zzf;
        int i11 = this.zzh;
        if (zzaa <= i10 - i11 && zzaa > 0) {
            zzaiw zza = zzaiw.zza(this.zze, i11, zzaa);
            this.zzh += zzaa;
            return zza;
        }
        if (zzaa == 0) {
            return zzaiw.zza;
        }
        if (zzaa < 0) {
            throw zzakm.zzf();
        }
        byte[] zzj = zzj(zzaa);
        if (zzj != null) {
            return zzaiw.zza(zzj);
        }
        int i12 = this.zzh;
        int i13 = this.zzf;
        int i14 = i13 - i12;
        this.zzj += i13;
        this.zzh = 0;
        this.zzf = 0;
        List<byte[]> zzf = zzf(zzaa - i14);
        byte[] bArr = new byte[zzaa];
        System.arraycopy(this.zze, i12, bArr, 0, i14);
        for (byte[] bArr2 : zzf) {
            System.arraycopy(bArr2, 0, bArr, i14, bArr2.length);
            i14 += bArr2.length;
        }
        return zzaiw.zzb(bArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final String zzr() {
        int zzaa = zzaa();
        if (zzaa > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (zzaa <= i10 - i11) {
                String str = new String(this.zze, i11, zzaa, zzaki.zza);
                this.zzh += zzaa;
                return str;
            }
        }
        if (zzaa == 0) {
            return "";
        }
        if (zzaa < 0) {
            throw zzakm.zzf();
        }
        if (zzaa > this.zzf) {
            return new String(zza(zzaa, false), zzaki.zza);
        }
        zzg(zzaa);
        String str2 = new String(this.zze, this.zzh, zzaa, zzaki.zza);
        this.zzh += zzaa;
        return str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final String zzs() {
        byte[] zza;
        int zzaa = zzaa();
        int i10 = this.zzh;
        int i11 = this.zzf;
        if (zzaa <= i11 - i10 && zzaa > 0) {
            zza = this.zze;
            this.zzh = i10 + zzaa;
        } else {
            if (zzaa == 0) {
                return "";
            }
            if (zzaa < 0) {
                throw zzakm.zzf();
            }
            if (zzaa <= i11) {
                zzg(zzaa);
                zza = this.zze;
                this.zzh = zzaa;
            } else {
                zza = zza(zzaa, false);
            }
            i10 = 0;
        }
        return zzanb.zzb(zza, i10, zzaa);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final boolean zzw() {
        return this.zzh == this.zzf && !zzi(1);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final boolean zzx() {
        return zzac() != 0;
    }
}
