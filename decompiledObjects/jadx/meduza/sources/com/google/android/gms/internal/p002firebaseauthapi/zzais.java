package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;

/* loaded from: classes.dex */
final class zzais {
    private static volatile int zza = 100;

    public static double zza(byte[] bArr, int i10) {
        return Double.longBitsToDouble(zzd(bArr, i10));
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, zzaiv zzaivVar) {
        if ((i10 >>> 3) == 0) {
            throw zzakm.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return zzd(bArr, i11, zzaivVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return zzc(bArr, i11, zzaivVar) + zzaivVar.zza;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw zzakm.zzc();
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = zzc(bArr, i11, zzaivVar);
            i15 = zzaivVar.zza;
            if (i15 == i14) {
                break;
            }
            i11 = zza(i15, bArr, i11, i12, zzaivVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw zzakm.zzg();
        }
        return i11;
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, zzakn<?> zzaknVar, zzaiv zzaivVar) {
        zzakj zzakjVar = (zzakj) zzaknVar;
        int zzc = zzc(bArr, i11, zzaivVar);
        while (true) {
            zzakjVar.zzc(zzaivVar.zza);
            if (zzc >= i12) {
                break;
            }
            int zzc2 = zzc(bArr, zzc, zzaivVar);
            if (i10 != zzaivVar.zza) {
                break;
            }
            zzc = zzc(bArr, zzc2, zzaivVar);
        }
        return zzc;
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, zzamy zzamyVar, zzaiv zzaivVar) {
        if ((i10 >>> 3) == 0) {
            throw zzakm.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int zzd = zzd(bArr, i11, zzaivVar);
            zzamyVar.zza(i10, Long.valueOf(zzaivVar.zzb));
            return zzd;
        }
        if (i13 == 1) {
            zzamyVar.zza(i10, Long.valueOf(zzd(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int zzc = zzc(bArr, i11, zzaivVar);
            int i14 = zzaivVar.zza;
            if (i14 < 0) {
                throw zzakm.zzf();
            }
            if (i14 > bArr.length - zzc) {
                throw zzakm.zzj();
            }
            zzamyVar.zza(i10, i14 == 0 ? zzaiw.zza : zzaiw.zza(bArr, zzc, i14));
            return zzc + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzakm.zzc();
            }
            zzamyVar.zza(i10, Integer.valueOf(zzc(bArr, i11)));
            return i11 + 4;
        }
        zzamy zzd2 = zzamy.zzd();
        int i15 = (i10 & (-8)) | 4;
        int i16 = 0;
        int i17 = zzaivVar.zze + 1;
        zzaivVar.zze = i17;
        zza(i17);
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int zzc2 = zzc(bArr, i11, zzaivVar);
            int i18 = zzaivVar.zza;
            i16 = i18;
            if (i18 == i15) {
                i11 = zzc2;
                break;
            }
            int zza2 = zza(i16, bArr, zzc2, i12, zzd2, zzaivVar);
            i16 = i18;
            i11 = zza2;
        }
        zzaivVar.zze--;
        if (i11 > i12 || i16 != i15) {
            throw zzakm.zzg();
        }
        zzamyVar.zza(i10, zzd2);
        return i11;
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, Object obj, zzaln zzalnVar, zzamv<zzamy, zzamy> zzamvVar, zzaiv zzaivVar) {
        if (zzaivVar.zzd.zza(zzalnVar, i10 >>> 3) == null) {
            return zza(i10, bArr, i11, i12, zzalr.zzc(obj), zzaivVar);
        }
        zzakg.zzd zzdVar = (zzakg.zzd) obj;
        zzdVar.zza();
        zzajy<zzakg.zzc> zzajyVar = zzdVar.zzc;
        throw new NoSuchMethodError();
    }

    public static int zza(int i10, byte[] bArr, int i11, zzaiv zzaivVar) {
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
                                zzaivVar.zza = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            zzaivVar.zza = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        zzaivVar.zza = i14 | i13;
        return i15;
    }

    public static int zza(zzamc<?> zzamcVar, int i10, byte[] bArr, int i11, int i12, zzakn<Object> zzaknVar, zzaiv zzaivVar) {
        int i13 = (i10 & (-8)) | 4;
        int zza2 = zza(zzamcVar, bArr, i11, i12, i13, zzaivVar);
        while (true) {
            zzaknVar.add(zzaivVar.zzc);
            if (zza2 >= i12) {
                break;
            }
            int zzc = zzc(bArr, zza2, zzaivVar);
            if (i10 != zzaivVar.zza) {
                break;
            }
            zza2 = zza(zzamcVar, bArr, zzc, i12, i13, zzaivVar);
        }
        return zza2;
    }

    private static <T> int zza(zzamc<T> zzamcVar, byte[] bArr, int i10, int i11, int i12, zzaiv zzaivVar) {
        T zza2 = zzamcVar.zza();
        int zza3 = zza(zza2, zzamcVar, bArr, i10, i11, i12, zzaivVar);
        zzamcVar.zzd(zza2);
        zzaivVar.zzc = zza2;
        return zza3;
    }

    public static <T> int zza(zzamc<T> zzamcVar, byte[] bArr, int i10, int i11, zzaiv zzaivVar) {
        T zza2 = zzamcVar.zza();
        int zza3 = zza(zza2, zzamcVar, bArr, i10, i11, zzaivVar);
        zzamcVar.zzd(zza2);
        zzaivVar.zzc = zza2;
        return zza3;
    }

    public static <T> int zza(Object obj, zzamc<T> zzamcVar, byte[] bArr, int i10, int i11, int i12, zzaiv zzaivVar) {
        zzalr zzalrVar = (zzalr) zzamcVar;
        int i13 = zzaivVar.zze + 1;
        zzaivVar.zze = i13;
        zza(i13);
        int zza2 = zzalrVar.zza((zzalr) obj, bArr, i10, i11, i12, zzaivVar);
        zzaivVar.zze--;
        zzaivVar.zzc = obj;
        return zza2;
    }

    public static <T> int zza(Object obj, zzamc<T> zzamcVar, byte[] bArr, int i10, int i11, zzaiv zzaivVar) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zza(i13, bArr, i12, zzaivVar);
            i13 = zzaivVar.zza;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw zzakm.zzj();
        }
        int i15 = zzaivVar.zze + 1;
        zzaivVar.zze = i15;
        zza(i15);
        int i16 = i13 + i14;
        zzamcVar.zza(obj, bArr, i14, i16, zzaivVar);
        zzaivVar.zze--;
        zzaivVar.zzc = obj;
        return i16;
    }

    public static int zza(byte[] bArr, int i10, zzaiv zzaivVar) {
        int zzc = zzc(bArr, i10, zzaivVar);
        int i11 = zzaivVar.zza;
        if (i11 < 0) {
            throw zzakm.zzf();
        }
        if (i11 > bArr.length - zzc) {
            throw zzakm.zzj();
        }
        if (i11 == 0) {
            zzaivVar.zzc = zzaiw.zza;
            return zzc;
        }
        zzaivVar.zzc = zzaiw.zza(bArr, zzc, i11);
        return zzc + i11;
    }

    public static int zza(byte[] bArr, int i10, zzakn<?> zzaknVar, zzaiv zzaivVar) {
        zzakj zzakjVar = (zzakj) zzaknVar;
        int zzc = zzc(bArr, i10, zzaivVar);
        int i11 = zzaivVar.zza + zzc;
        while (zzc < i11) {
            zzc = zzc(bArr, zzc, zzaivVar);
            zzakjVar.zzc(zzaivVar.zza);
        }
        if (zzc == i11) {
            return zzc;
        }
        throw zzakm.zzj();
    }

    private static void zza(int i10) {
        if (i10 >= zza) {
            throw zzakm.zzh();
        }
    }

    public static float zzb(byte[] bArr, int i10) {
        return Float.intBitsToFloat(zzc(bArr, i10));
    }

    public static int zzb(zzamc<?> zzamcVar, int i10, byte[] bArr, int i11, int i12, zzakn<?> zzaknVar, zzaiv zzaivVar) {
        int zza2 = zza(zzamcVar, bArr, i11, i12, zzaivVar);
        while (true) {
            zzaknVar.add(zzaivVar.zzc);
            if (zza2 >= i12) {
                break;
            }
            int zzc = zzc(bArr, zza2, zzaivVar);
            if (i10 != zzaivVar.zza) {
                break;
            }
            zza2 = zza(zzamcVar, bArr, zzc, i12, zzaivVar);
        }
        return zza2;
    }

    public static int zzb(byte[] bArr, int i10, zzaiv zzaivVar) {
        int zzc = zzc(bArr, i10, zzaivVar);
        int i11 = zzaivVar.zza;
        if (i11 < 0) {
            throw zzakm.zzf();
        }
        if (i11 == 0) {
            zzaivVar.zzc = "";
            return zzc;
        }
        zzaivVar.zzc = zzanb.zzb(bArr, zzc, i11);
        return zzc + i11;
    }

    public static int zzc(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int zzc(byte[] bArr, int i10, zzaiv zzaivVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zza(b10, bArr, i11, zzaivVar);
        }
        zzaivVar.zza = b10;
        return i11;
    }

    public static int zzd(byte[] bArr, int i10, zzaiv zzaivVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            zzaivVar.zzb = j10;
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
        zzaivVar.zzb = j11;
        return i12;
    }

    public static long zzd(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }
}
