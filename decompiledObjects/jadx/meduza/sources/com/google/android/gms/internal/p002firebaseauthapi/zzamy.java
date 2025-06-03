package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzamy {
    private static final zzamy zza = new zzamy(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzamy() {
        this(0, new int[8], new Object[8], true);
    }

    private zzamy(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzamy zza(zzamy zzamyVar, zzamy zzamyVar2) {
        int i10 = zzamyVar.zzb + zzamyVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzamyVar.zzc, i10);
        System.arraycopy(zzamyVar2.zzc, 0, copyOf, zzamyVar.zzb, zzamyVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzamyVar.zzd, i10);
        System.arraycopy(zzamyVar2.zzd, 0, copyOf2, zzamyVar.zzb, zzamyVar2.zzb);
        return new zzamy(i10, copyOf, copyOf2, true);
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

    private static void zza(int i10, Object obj, zzanm zzanmVar) {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            zzanmVar.zzb(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 1) {
            zzanmVar.zza(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 2) {
            zzanmVar.zza(i11, (zzaiw) obj);
            return;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new RuntimeException(zzakm.zza());
            }
            zzanmVar.zzb(i11, ((Integer) obj).intValue());
        } else if (zzanmVar.zza() == 1) {
            zzanmVar.zzb(i11);
            ((zzamy) obj).zzb(zzanmVar);
            zzanmVar.zza(i11);
        } else {
            zzanmVar.zza(i11);
            ((zzamy) obj).zzb(zzanmVar);
            zzanmVar.zzb(i11);
        }
    }

    public static zzamy zzc() {
        return zza;
    }

    public static zzamy zzd() {
        return new zzamy();
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
        if (obj == null || !(obj instanceof zzamy)) {
            return false;
        }
        zzamy zzamyVar = (zzamy) obj;
        int i10 = this.zzb;
        if (i10 == zzamyVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzamyVar.zzc;
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
                Object[] objArr2 = zzamyVar.zzd;
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
                zze = zzajo.zze(i14, ((Long) this.zzd[i12]).longValue());
            } else if (i15 == 1) {
                zze = zzajo.zza(i14, ((Long) this.zzd[i12]).longValue());
            } else if (i15 == 2) {
                zze = zzajo.zza(i14, (zzaiw) this.zzd[i12]);
            } else if (i15 == 3) {
                i11 = ((zzamy) this.zzd[i12]).zza() + (zzajo.zzg(i14) << 1) + i11;
            } else {
                if (i15 != 5) {
                    throw new IllegalStateException(zzakm.zza());
                }
                zze = zzajo.zzb(i14, ((Integer) this.zzd[i12]).intValue());
            }
            i11 = zze + i11;
        }
        this.zze = i11;
        return i11;
    }

    public final zzamy zza(zzamy zzamyVar) {
        if (zzamyVar.equals(zza)) {
            return this;
        }
        zzf();
        int i10 = this.zzb + zzamyVar.zzb;
        zza(i10);
        System.arraycopy(zzamyVar.zzc, 0, this.zzc, this.zzb, zzamyVar.zzb);
        System.arraycopy(zzamyVar.zzd, 0, this.zzd, this.zzb, zzamyVar.zzb);
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

    public final void zza(zzanm zzanmVar) {
        if (zzanmVar.zza() == 2) {
            for (int i10 = this.zzb - 1; i10 >= 0; i10--) {
                zzanmVar.zza(this.zzc[i10] >>> 3, this.zzd[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzanmVar.zza(this.zzc[i11] >>> 3, this.zzd[i11]);
        }
    }

    public final void zza(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzalo.zza(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            i11 += zzajo.zzb(this.zzc[i12] >>> 3, (zzaiw) this.zzd[i12]);
        }
        this.zze = i11;
        return i11;
    }

    public final void zzb(zzanm zzanmVar) {
        if (this.zzb == 0) {
            return;
        }
        if (zzanmVar.zza() == 1) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                zza(this.zzc[i10], this.zzd[i10], zzanmVar);
            }
            return;
        }
        for (int i11 = this.zzb - 1; i11 >= 0; i11--) {
            zza(this.zzc[i11], this.zzd[i11], zzanmVar);
        }
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }
}
