package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzmx {
    private static final zzmx zza = new zzmx(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzmx() {
        this(0, new int[8], new Object[8], true);
    }

    private zzmx(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzmx zza(zzmx zzmxVar, zzmx zzmxVar2) {
        int i10 = zzmxVar.zzb + zzmxVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzmxVar.zzc, i10);
        System.arraycopy(zzmxVar2.zzc, 0, copyOf, zzmxVar.zzb, zzmxVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzmxVar.zzd, i10);
        System.arraycopy(zzmxVar2.zzd, 0, copyOf2, zzmxVar.zzb, zzmxVar2.zzb);
        return new zzmx(i10, copyOf, copyOf2, true);
    }

    private final void zza(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    private static void zza(int i10, Object obj, zznl zznlVar) {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            zznlVar.zzb(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 1) {
            zznlVar.zza(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 2) {
            zznlVar.zza(i11, (zziy) obj);
            return;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new RuntimeException(zzkp.zza());
            }
            zznlVar.zzb(i11, ((Integer) obj).intValue());
        } else if (zznlVar.zza() == 1) {
            zznlVar.zzb(i11);
            ((zzmx) obj).zzb(zznlVar);
            zznlVar.zza(i11);
        } else {
            zznlVar.zza(i11);
            ((zzmx) obj).zzb(zznlVar);
            zznlVar.zzb(i11);
        }
    }

    public static zzmx zzc() {
        return zza;
    }

    public static zzmx zzd() {
        return new zzmx();
    }

    private final void zzf() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzmx)) {
            return false;
        }
        zzmx zzmxVar = (zzmx) obj;
        int i10 = this.zzb;
        if (i10 == zzmxVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzmxVar.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    z10 = true;
                    break;
                }
                if (iArr[i11] != iArr2[i11]) {
                    z10 = false;
                    break;
                }
                i11++;
            }
            if (z10) {
                Object[] objArr = this.zzd;
                Object[] objArr2 = zzmxVar.zzd;
                int i12 = this.zzb;
                int i13 = 0;
                while (true) {
                    if (i13 >= i12) {
                        z11 = true;
                        break;
                    }
                    if (!objArr[i13].equals(objArr2[i13])) {
                        z11 = false;
                        break;
                    }
                    i13++;
                }
                if (z11) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.zzc;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.zzd;
        int i16 = this.zzb;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public final int zza() {
        int zze;
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            int i13 = this.zzc[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 == 0) {
                zze = zzjn.zze(i14, ((Long) this.zzd[i12]).longValue());
            } else if (i15 == 1) {
                zze = zzjn.zza(i14, ((Long) this.zzd[i12]).longValue());
            } else if (i15 == 2) {
                zze = zzjn.zza(i14, (zziy) this.zzd[i12]);
            } else if (i15 == 3) {
                i11 = ((zzmx) this.zzd[i12]).zza() + (zzjn.zzf(i14) << 1) + i11;
            } else {
                if (i15 != 5) {
                    throw new IllegalStateException(zzkp.zza());
                }
                zze = zzjn.zzb(i14, ((Integer) this.zzd[i12]).intValue());
            }
            i11 = zze + i11;
        }
        this.zze = i11;
        return i11;
    }

    public final zzmx zza(zzmx zzmxVar) {
        if (zzmxVar.equals(zza)) {
            return this;
        }
        zzf();
        int i10 = this.zzb + zzmxVar.zzb;
        zza(i10);
        System.arraycopy(zzmxVar.zzc, 0, this.zzc, this.zzb, zzmxVar.zzb);
        System.arraycopy(zzmxVar.zzd, 0, this.zzd, this.zzb, zzmxVar.zzb);
        this.zzb = i10;
        return this;
    }

    public final void zza(int i10, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    public final void zza(zznl zznlVar) {
        if (zznlVar.zza() == 2) {
            for (int i10 = this.zzb - 1; i10 >= 0; i10--) {
                zznlVar.zza(this.zzc[i10] >>> 3, this.zzd[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zznlVar.zza(this.zzc[i11] >>> 3, this.zzd[i11]);
        }
    }

    public final void zza(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzlr.zza(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            i11 += zzjn.zzb(this.zzc[i12] >>> 3, (zziy) this.zzd[i12]);
        }
        this.zze = i11;
        return i11;
    }

    public final void zzb(zznl zznlVar) {
        if (this.zzb == 0) {
            return;
        }
        if (zznlVar.zza() == 1) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                zza(this.zzc[i10], this.zzd[i10], zznlVar);
            }
            return;
        }
        for (int i11 = this.zzb - 1; i11 >= 0; i11--) {
            zza(this.zzc[i11], this.zzd[i11], zznlVar);
        }
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }
}
