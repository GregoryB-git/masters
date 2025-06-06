package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.io.InputStream;
import java.util.TreeMap;

/* loaded from: classes.dex */
final class zzds {
    public static final zzdr zza(InputStream inputStream, zzdu zzduVar) {
        try {
            return zzb(inputStream, zzduVar);
        } finally {
            try {
                zzduVar.close();
            } catch (IOException unused) {
            }
        }
    }

    private static final zzdr zzb(InputStream inputStream, zzdu zzduVar) {
        try {
            zzdt zzd = zzduVar.zzd();
            if (zzd == null) {
                throw new zzdl("Parser being asked to parse an empty input stream");
            }
            try {
                byte zza = zzd.zza();
                byte zzb = zzd.zzb();
                int i10 = 0;
                if (zzb == Byte.MIN_VALUE) {
                    long zza2 = zzduVar.zza();
                    if (zza2 > 1000) {
                        throw new zzdl("Parser being asked to read a large CBOR array");
                    }
                    zzc(zza, zza2, inputStream, zzduVar);
                    zzdr[] zzdrVarArr = new zzdr[(int) zza2];
                    while (i10 < zza2) {
                        zzdrVarArr[i10] = zzb(inputStream, zzduVar);
                        i10++;
                    }
                    return new zzdi(zzaz.zzi(zzdrVarArr));
                }
                if (zzb != -96) {
                    if (zzb == -64) {
                        throw new zzdl("Tags are currently unsupported");
                    }
                    if (zzb == -32) {
                        return new zzdj(zzduVar.zzf());
                    }
                    if (zzb == 0 || zzb == 32) {
                        long zzb2 = zzduVar.zzb();
                        zzc(zza, zzb2 > 0 ? zzb2 : ~zzb2, inputStream, zzduVar);
                        return new zzdm(zzb2);
                    }
                    if (zzb == 64) {
                        byte[] zzg = zzduVar.zzg();
                        int length = zzg.length;
                        zzc(zza, length, inputStream, zzduVar);
                        return new zzdk(zzcz.zzl(zzg, 0, length));
                    }
                    if (zzb == 96) {
                        String zze = zzduVar.zze();
                        zzc(zza, zze.length(), inputStream, zzduVar);
                        return new zzdp(zze);
                    }
                    throw new zzdl("Unidentifiable major type: " + zzd.zzc());
                }
                long zzc = zzduVar.zzc();
                if (zzc > 1000) {
                    throw new zzdl("Parser being asked to read a large CBOR map");
                }
                zzc(zza, zzc, inputStream, zzduVar);
                int i11 = (int) zzc;
                zzdn[] zzdnVarArr = new zzdn[i11];
                zzdr zzdrVar = null;
                int i12 = 0;
                while (i12 < zzc) {
                    zzdr zzb3 = zzb(inputStream, zzduVar);
                    if (zzdrVar != null && zzb3.compareTo(zzdrVar) <= 0) {
                        throw new zzdh(String.format("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: %s\nCurrent key: %s", zzdrVar.toString(), zzb3.toString()));
                    }
                    zzdnVarArr[i12] = new zzdn(zzb3, zzb(inputStream, zzduVar));
                    i12++;
                    zzdrVar = zzb3;
                }
                TreeMap treeMap = new TreeMap();
                while (i10 < i11) {
                    zzdn zzdnVar = zzdnVarArr[i10];
                    if (treeMap.containsKey(zzdnVar.zza())) {
                        throw new zzdh("Attempted to add duplicate key to canonical CBOR Map.");
                    }
                    treeMap.put(zzdnVar.zza(), zzdnVar.zzb());
                    i10++;
                }
                return new zzdo(zzbg.zzf(treeMap));
            } catch (IOException | RuntimeException e10) {
                throw new zzdl("Error in decoding CborValue from bytes", e10);
            }
        } catch (IOException e11) {
            throw new zzdl("Error in decoding CborValue from bytes", e11);
        }
    }

    private static final void zzc(byte b10, long j10, InputStream inputStream, zzdu zzduVar) {
        switch (b10) {
            case 24:
                if (j10 >= 24) {
                    return;
                }
                throw new zzdh("Integer value " + j10 + " after add info could have been represented in 0 additional bytes, but used 1");
            case 25:
                if (j10 >= 256) {
                    return;
                }
                throw new zzdh("Integer value " + j10 + " after add info could have been represented in 0-1 additional bytes, but used 2");
            case 26:
                if (j10 >= 65536) {
                    return;
                }
                throw new zzdh("Integer value " + j10 + " after add info could have been represented in 0-2 additional bytes, but used 4");
            case 27:
                if (j10 >= 4294967296L) {
                    return;
                }
                throw new zzdh("Integer value " + j10 + " after add info could have been represented in 0-4 additional bytes, but used 8");
            default:
                return;
        }
    }
}
