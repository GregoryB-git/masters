package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
final class zzku {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i10, zzkt zzktVar) {
        int zzi = zzi(bArr, i10, zzktVar);
        int i11 = zzktVar.zza;
        if (i11 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - zzi) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            zzktVar.zzc = zzle.zzb;
            return zzi;
        }
        zzktVar.zzc = zzle.zzk(bArr, zzi, i11);
        return zzi + i11;
    }

    public static int zzb(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static int zzc(zzow zzowVar, byte[] bArr, int i10, int i11, int i12, zzkt zzktVar) {
        Object zze = zzowVar.zze();
        int zzm = zzm(zze, zzowVar, bArr, i10, i11, i12, zzktVar);
        zzowVar.zzf(zze);
        zzktVar.zzc = zze;
        return zzm;
    }

    public static int zzd(zzow zzowVar, byte[] bArr, int i10, int i11, zzkt zzktVar) {
        Object zze = zzowVar.zze();
        int zzn = zzn(zze, zzowVar, bArr, i10, i11, zzktVar);
        zzowVar.zzf(zze);
        zzktVar.zzc = zze;
        return zzn;
    }

    public static int zze(zzow zzowVar, int i10, byte[] bArr, int i11, int i12, zznk zznkVar, zzkt zzktVar) {
        int zzd = zzd(zzowVar, bArr, i11, i12, zzktVar);
        while (true) {
            zznkVar.add(zzktVar.zzc);
            if (zzd >= i12) {
                break;
            }
            int zzi = zzi(bArr, zzd, zzktVar);
            if (i10 != zzktVar.zza) {
                break;
            }
            zzd = zzd(zzowVar, bArr, zzi, i12, zzktVar);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i10, zznk zznkVar, zzkt zzktVar) {
        zzne zzneVar = (zzne) zznkVar;
        int zzi = zzi(bArr, i10, zzktVar);
        int i11 = zzktVar.zza + zzi;
        while (zzi < i11) {
            zzi = zzi(bArr, zzi, zzktVar);
            zzneVar.zzh(zzktVar.zza);
        }
        if (zzi == i11) {
            return zzi;
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzg(byte[] bArr, int i10, zzkt zzktVar) {
        int zzi = zzi(bArr, i10, zzktVar);
        int i11 = zzktVar.zza;
        if (i11 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 == 0) {
            zzktVar.zzc = "";
            return zzi;
        }
        zzktVar.zzc = new String(bArr, zzi, i11, zznl.zza);
        return zzi + i11;
    }

    public static int zzh(int i10, byte[] bArr, int i11, int i12, zzpm zzpmVar, zzkt zzktVar) {
        if ((i10 >>> 3) == 0) {
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int zzl = zzl(bArr, i11, zzktVar);
            zzpmVar.zzj(i10, Long.valueOf(zzktVar.zzb));
            return zzl;
        }
        if (i13 == 1) {
            zzpmVar.zzj(i10, Long.valueOf(zzp(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int zzi = zzi(bArr, i11, zzktVar);
            int i14 = zzktVar.zza;
            if (i14 < 0) {
                throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - zzi) {
                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            zzpmVar.zzj(i10, i14 == 0 ? zzle.zzb : zzle.zzk(bArr, zzi, i14));
            return zzi + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new zznn("Protocol message contained an invalid tag (zero).");
            }
            zzpmVar.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzpm zzf = zzpm.zzf();
        int i16 = zzktVar.zze + 1;
        zzktVar.zze = i16;
        zzq(i16);
        int i17 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int zzi2 = zzi(bArr, i11, zzktVar);
            i17 = zzktVar.zza;
            if (i17 == i15) {
                i11 = zzi2;
                break;
            }
            i11 = zzh(i17, bArr, zzi2, i12, zzf, zzktVar);
        }
        zzktVar.zze--;
        if (i11 > i12 || i17 != i15) {
            throw new zznn("Failed to parse the message.");
        }
        zzpmVar.zzj(i10, zzf);
        return i11;
    }

    public static int zzi(byte[] bArr, int i10, zzkt zzktVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzj(b10, bArr, i11, zzktVar);
        }
        zzktVar.zza = b10;
        return i11;
    }

    public static int zzj(int i10, byte[] bArr, int i11, zzkt zzktVar) {
        int i12;
        int i13;
        byte b10 = bArr[i11];
        int i14 = i11 + 1;
        int i15 = i10 & 127;
        if (b10 < 0) {
            int i16 = i15 | ((b10 & Byte.MAX_VALUE) << 7);
            int i17 = i14 + 1;
            byte b11 = bArr[i14];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i15 = i16 | ((b11 & Byte.MAX_VALUE) << 14);
                i14 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i15 | ((b12 & Byte.MAX_VALUE) << 21);
                    i17 = i14 + 1;
                    byte b13 = bArr[i14];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        int i18 = i16 | ((b13 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] >= 0) {
                                zzktVar.zza = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            zzktVar.zza = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        zzktVar.zza = i15 | i13;
        return i14;
    }

    public static int zzk(int i10, byte[] bArr, int i11, int i12, zznk zznkVar, zzkt zzktVar) {
        zzne zzneVar = (zzne) zznkVar;
        int zzi = zzi(bArr, i11, zzktVar);
        while (true) {
            zzneVar.zzh(zzktVar.zza);
            if (zzi >= i12) {
                break;
            }
            int zzi2 = zzi(bArr, zzi, zzktVar);
            if (i10 != zzktVar.zza) {
                break;
            }
            zzi = zzi(bArr, zzi2, zzktVar);
        }
        return zzi;
    }

    public static int zzl(byte[] bArr, int i10, zzkt zzktVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzktVar.zzb = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= (b11 & Byte.MAX_VALUE) << i13;
            i12 = i14;
            b10 = b11;
        }
        zzktVar.zzb = j11;
        return i12;
    }

    public static int zzm(Object obj, zzow zzowVar, byte[] bArr, int i10, int i11, int i12, zzkt zzktVar) {
        zzol zzolVar = (zzol) zzowVar;
        int i13 = zzktVar.zze + 1;
        zzktVar.zze = i13;
        zzq(i13);
        int zzc = zzolVar.zzc(obj, bArr, i10, i11, i12, zzktVar);
        zzktVar.zze--;
        zzktVar.zzc = obj;
        return zzc;
    }

    public static int zzn(Object obj, zzow zzowVar, byte[] bArr, int i10, int i11, zzkt zzktVar) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zzj(i13, bArr, i12, zzktVar);
            i13 = zzktVar.zza;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = zzktVar.zze + 1;
        zzktVar.zze = i15;
        zzq(i15);
        int i16 = i13 + i14;
        zzowVar.zzi(obj, bArr, i14, i16, zzktVar);
        zzktVar.zze--;
        zzktVar.zzc = obj;
        return i16;
    }

    public static int zzo(int i10, byte[] bArr, int i11, int i12, zzkt zzktVar) {
        if ((i10 >>> 3) == 0) {
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return zzl(bArr, i11, zzktVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return zzi(bArr, i11, zzktVar) + zzktVar.zza;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = zzi(bArr, i11, zzktVar);
            i15 = zzktVar.zza;
            if (i15 == i14) {
                break;
            }
            i11 = zzo(i15, bArr, i11, i12, zzktVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw new zznn("Failed to parse the message.");
        }
        return i11;
    }

    public static long zzp(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }

    private static void zzq(int i10) {
        if (i10 >= zzb) {
            throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
