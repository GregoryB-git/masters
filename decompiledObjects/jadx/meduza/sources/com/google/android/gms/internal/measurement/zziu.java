package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkg;

/* loaded from: classes.dex */
final class zziu {
    private static volatile int zza = 100;

    public static double zza(byte[] bArr, int i10) {
        return Double.longBitsToDouble(zzd(bArr, i10));
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, zzit zzitVar) {
        if ((i10 >>> 3) == 0) {
            throw zzkp.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return zzd(bArr, i11, zzitVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return zzc(bArr, i11, zzitVar) + zzitVar.zza;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw zzkp.zzc();
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = zzc(bArr, i11, zzitVar);
            i15 = zzitVar.zza;
            if (i15 == i14) {
                break;
            }
            i11 = zza(i15, bArr, i11, i12, zzitVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw zzkp.zzg();
        }
        return i11;
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, zzkm<?> zzkmVar, zzit zzitVar) {
        zzkh zzkhVar = (zzkh) zzkmVar;
        int zzc = zzc(bArr, i11, zzitVar);
        while (true) {
            zzkhVar.zzd(zzitVar.zza);
            if (zzc >= i12) {
                break;
            }
            int zzc2 = zzc(bArr, zzc, zzitVar);
            if (i10 != zzitVar.zza) {
                break;
            }
            zzc = zzc(bArr, zzc2, zzitVar);
        }
        return zzc;
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, zzmx zzmxVar, zzit zzitVar) {
        if ((i10 >>> 3) == 0) {
            throw zzkp.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int zzd = zzd(bArr, i11, zzitVar);
            zzmxVar.zza(i10, Long.valueOf(zzitVar.zzb));
            return zzd;
        }
        if (i13 == 1) {
            zzmxVar.zza(i10, Long.valueOf(zzd(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int zzc = zzc(bArr, i11, zzitVar);
            int i14 = zzitVar.zza;
            if (i14 < 0) {
                throw zzkp.zzf();
            }
            if (i14 > bArr.length - zzc) {
                throw zzkp.zzi();
            }
            zzmxVar.zza(i10, i14 == 0 ? zziy.zza : zziy.zza(bArr, zzc, i14));
            return zzc + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzkp.zzc();
            }
            zzmxVar.zza(i10, Integer.valueOf(zzc(bArr, i11)));
            return i11 + 4;
        }
        zzmx zzd2 = zzmx.zzd();
        int i15 = (i10 & (-8)) | 4;
        int i16 = 0;
        int i17 = zzitVar.zze + 1;
        zzitVar.zze = i17;
        zza(i17);
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int zzc2 = zzc(bArr, i11, zzitVar);
            int i18 = zzitVar.zza;
            i16 = i18;
            if (i18 == i15) {
                i11 = zzc2;
                break;
            }
            int zza2 = zza(i16, bArr, zzc2, i12, zzd2, zzitVar);
            i16 = i18;
            i11 = zza2;
        }
        zzitVar.zze--;
        if (i11 > i12 || i16 != i15) {
            throw zzkp.zzg();
        }
        zzmxVar.zza(i10, zzd2);
        return i11;
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, Object obj, zzlm zzlmVar, zzmu<zzmx, zzmx> zzmuVar, zzit zzitVar) {
        if (zzitVar.zzd.zza(zzlmVar, i10 >>> 3) == null) {
            return zza(i10, bArr, i11, i12, zzlq.zzc(obj), zzitVar);
        }
        zzkg.zzb zzbVar = (zzkg.zzb) obj;
        zzbVar.zza();
        zzjw<zzkg.zze> zzjwVar = zzbVar.zzc;
        throw new NoSuchMethodError();
    }

    public static int zza(int i10, byte[] bArr, int i11, zzit zzitVar) {
        int i12;
        int i13;
        int i14 = i10 & 127;
        int i15 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 < 0) {
            int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 7);
            int i17 = i15 + 1;
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i14 = i16 | ((b11 & Byte.MAX_VALUE) << 14);
                i15 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i14 | ((b12 & Byte.MAX_VALUE) << 21);
                    i17 = i15 + 1;
                    byte b13 = bArr[i15];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        int i18 = i16 | ((b13 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] >= 0) {
                                zzitVar.zza = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            zzitVar.zza = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        zzitVar.zza = i14 | i13;
        return i15;
    }

    public static int zza(zzme<?> zzmeVar, int i10, byte[] bArr, int i11, int i12, zzkm<Object> zzkmVar, zzit zzitVar) {
        int i13 = (i10 & (-8)) | 4;
        int zza2 = zza(zzmeVar, bArr, i11, i12, i13, zzitVar);
        while (true) {
            zzkmVar.add(zzitVar.zzc);
            if (zza2 >= i12) {
                break;
            }
            int zzc = zzc(bArr, zza2, zzitVar);
            if (i10 != zzitVar.zza) {
                break;
            }
            zza2 = zza(zzmeVar, bArr, zzc, i12, i13, zzitVar);
        }
        return zza2;
    }

    private static <T> int zza(zzme<T> zzmeVar, byte[] bArr, int i10, int i11, int i12, zzit zzitVar) {
        T zza2 = zzmeVar.zza();
        int zza3 = zza(zza2, zzmeVar, bArr, i10, i11, i12, zzitVar);
        zzmeVar.zzd(zza2);
        zzitVar.zzc = zza2;
        return zza3;
    }

    public static <T> int zza(zzme<T> zzmeVar, byte[] bArr, int i10, int i11, zzit zzitVar) {
        T zza2 = zzmeVar.zza();
        int zza3 = zza(zza2, zzmeVar, bArr, i10, i11, zzitVar);
        zzmeVar.zzd(zza2);
        zzitVar.zzc = zza2;
        return zza3;
    }

    public static <T> int zza(Object obj, zzme<T> zzmeVar, byte[] bArr, int i10, int i11, int i12, zzit zzitVar) {
        zzlq zzlqVar = (zzlq) zzmeVar;
        int i13 = zzitVar.zze + 1;
        zzitVar.zze = i13;
        zza(i13);
        int zza2 = zzlqVar.zza((zzlq) obj, bArr, i10, i11, i12, zzitVar);
        zzitVar.zze--;
        zzitVar.zzc = obj;
        return zza2;
    }

    public static <T> int zza(Object obj, zzme<T> zzmeVar, byte[] bArr, int i10, int i11, zzit zzitVar) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zza(i13, bArr, i12, zzitVar);
            i13 = zzitVar.zza;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw zzkp.zzi();
        }
        int i15 = zzitVar.zze + 1;
        zzitVar.zze = i15;
        zza(i15);
        int i16 = i13 + i14;
        zzmeVar.zza(obj, bArr, i14, i16, zzitVar);
        zzitVar.zze--;
        zzitVar.zzc = obj;
        return i16;
    }

    public static int zza(byte[] bArr, int i10, zzit zzitVar) {
        int zzc = zzc(bArr, i10, zzitVar);
        int i11 = zzitVar.zza;
        if (i11 < 0) {
            throw zzkp.zzf();
        }
        if (i11 > bArr.length - zzc) {
            throw zzkp.zzi();
        }
        if (i11 == 0) {
            zzitVar.zzc = zziy.zza;
            return zzc;
        }
        zzitVar.zzc = zziy.zza(bArr, zzc, i11);
        return zzc + i11;
    }

    public static int zza(byte[] bArr, int i10, zzkm<?> zzkmVar, zzit zzitVar) {
        zzkh zzkhVar = (zzkh) zzkmVar;
        int zzc = zzc(bArr, i10, zzitVar);
        int i11 = zzitVar.zza + zzc;
        while (zzc < i11) {
            zzc = zzc(bArr, zzc, zzitVar);
            zzkhVar.zzd(zzitVar.zza);
        }
        if (zzc == i11) {
            return zzc;
        }
        throw zzkp.zzi();
    }

    private static void zza(int i10) {
        if (i10 >= zza) {
            throw zzkp.zzh();
        }
    }

    public static float zzb(byte[] bArr, int i10) {
        return Float.intBitsToFloat(zzc(bArr, i10));
    }

    public static int zzb(zzme<?> zzmeVar, int i10, byte[] bArr, int i11, int i12, zzkm<?> zzkmVar, zzit zzitVar) {
        int zza2 = zza(zzmeVar, bArr, i11, i12, zzitVar);
        while (true) {
            zzkmVar.add(zzitVar.zzc);
            if (zza2 >= i12) {
                break;
            }
            int zzc = zzc(bArr, zza2, zzitVar);
            if (i10 != zzitVar.zza) {
                break;
            }
            zza2 = zza(zzmeVar, bArr, zzc, i12, zzitVar);
        }
        return zza2;
    }

    public static int zzb(byte[] bArr, int i10, zzit zzitVar) {
        int zzc = zzc(bArr, i10, zzitVar);
        int i11 = zzitVar.zza;
        if (i11 < 0) {
            throw zzkp.zzf();
        }
        if (i11 == 0) {
            zzitVar.zzc = "";
            return zzc;
        }
        zzitVar.zzc = zzna.zzb(bArr, zzc, i11);
        return zzc + i11;
    }

    public static int zzc(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int zzc(byte[] bArr, int i10, zzit zzitVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zza(b10, bArr, i11, zzitVar);
        }
        zzitVar.zza = b10;
        return i11;
    }

    public static int zzd(byte[] bArr, int i10, zzit zzitVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            zzitVar.zzb = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (r10 & Byte.MAX_VALUE) << i13;
            b10 = bArr[i12];
            i12 = i14;
        }
        zzitVar.zzb = j11;
        return i12;
    }

    public static long zzd(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }
}
