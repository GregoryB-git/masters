package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes.dex */
final class zzajl extends zzaji {
    private final byte[] zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    private zzajl(byte[] bArr, int i10, int i11, boolean z10) {
        super();
        this.zzj = Integer.MAX_VALUE;
        this.zzd = bArr;
        this.zze = i11 + i10;
        this.zzg = i10;
        this.zzh = i10;
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
            int r0 = r5.zzg
            int r1 = r5.zze
            if (r1 == r0) goto L6b
            byte[] r2 = r5.zzd
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L11
            r5.zzg = r3
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
            r5.zzg = r1
            return r0
        L6b:
            long r0 = r5.zzm()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzajl.zzaa():int");
    }

    private final long zzab() {
        int i10 = this.zzg;
        if (this.zze - i10 < 8) {
            throw zzakm.zzj();
        }
        byte[] bArr = this.zzd;
        this.zzg = i10 + 8;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzajl.zzac():long");
    }

    private final void zzad() {
        int i10 = this.zze + this.zzf;
        this.zze = i10;
        int i11 = i10 - this.zzh;
        int i12 = this.zzj;
        if (i11 <= i12) {
            this.zzf = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzf = i13;
        this.zze = i10 - i13;
    }

    private final void zzf(int i10) {
        if (i10 >= 0) {
            int i11 = this.zze;
            int i12 = this.zzg;
            if (i10 <= i11 - i12) {
                this.zzg = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw zzakm.zzj();
        }
        throw zzakm.zzf();
    }

    private final byte zzy() {
        int i10 = this.zzg;
        if (i10 == this.zze) {
            throw zzakm.zzj();
        }
        byte[] bArr = this.zzd;
        this.zzg = i10 + 1;
        return bArr[i10];
    }

    private final int zzz() {
        int i10 = this.zzg;
        if (this.zze - i10 < 4) {
            throw zzakm.zzj();
        }
        byte[] bArr = this.zzd;
        this.zzg = i10 + 4;
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
        int zzc = i10 + zzc();
        if (zzc < 0) {
            throw zzakm.zzg();
        }
        int i11 = this.zzj;
        if (zzc > i11) {
            throw zzakm.zzj();
        }
        this.zzj = zzc;
        zzad();
        return i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final int zzc() {
        return this.zzg - this.zzh;
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
        this.zzj = i10;
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
            if (this.zze - this.zzg < 10) {
                while (i12 < 10) {
                    if (zzy() < 0) {
                        i12++;
                    }
                }
                throw zzakm.zze();
            }
            while (i12 < 10) {
                byte[] bArr = this.zzd;
                int i13 = this.zzg;
                this.zzg = i13 + 1;
                if (bArr[i13] < 0) {
                    i12++;
                }
            }
            throw zzakm.zze();
            return true;
        }
        if (i11 == 1) {
            zzf(8);
            return true;
        }
        if (i11 == 2) {
            zzf(zzaa());
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
        zzf(4);
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
        byte[] bArr;
        int zzaa = zzaa();
        if (zzaa > 0) {
            int i10 = this.zze;
            int i11 = this.zzg;
            if (zzaa <= i10 - i11) {
                zzaiw zza = zzaiw.zza(this.zzd, i11, zzaa);
                this.zzg += zzaa;
                return zza;
            }
        }
        if (zzaa == 0) {
            return zzaiw.zza;
        }
        if (zzaa > 0) {
            int i12 = this.zze;
            int i13 = this.zzg;
            if (zzaa <= i12 - i13) {
                int i14 = zzaa + i13;
                this.zzg = i14;
                bArr = Arrays.copyOfRange(this.zzd, i13, i14);
                return zzaiw.zzb(bArr);
            }
        }
        if (zzaa > 0) {
            throw zzakm.zzj();
        }
        if (zzaa != 0) {
            throw zzakm.zzf();
        }
        bArr = zzaki.zzb;
        return zzaiw.zzb(bArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final String zzr() {
        int zzaa = zzaa();
        if (zzaa > 0) {
            int i10 = this.zze;
            int i11 = this.zzg;
            if (zzaa <= i10 - i11) {
                String str = new String(this.zzd, i11, zzaa, zzaki.zza);
                this.zzg += zzaa;
                return str;
            }
        }
        if (zzaa == 0) {
            return "";
        }
        if (zzaa < 0) {
            throw zzakm.zzf();
        }
        throw zzakm.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final String zzs() {
        int zzaa = zzaa();
        if (zzaa > 0) {
            int i10 = this.zze;
            int i11 = this.zzg;
            if (zzaa <= i10 - i11) {
                String zzb = zzanb.zzb(this.zzd, i11, zzaa);
                this.zzg += zzaa;
                return zzb;
            }
        }
        if (zzaa == 0) {
            return "";
        }
        if (zzaa <= 0) {
            throw zzakm.zzf();
        }
        throw zzakm.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final boolean zzw() {
        return this.zzg == this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaji
    public final boolean zzx() {
        return zzac() != 0;
    }
}
