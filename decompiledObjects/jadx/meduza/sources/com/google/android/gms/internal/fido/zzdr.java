package com.google.android.gms.internal.fido;

import a0.j;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class zzdr implements Comparable {
    private final zzdr zzc(Class cls) {
        if (cls.isInstance(this)) {
            return (zzdr) cls.cast(this);
        }
        throw new zzdq(j.k("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }

    public static int zzd(byte b10) {
        return (b10 >> 5) & 7;
    }

    public static zzdm zzg(long j10) {
        return new zzdm(j10);
    }

    public static zzdp zzi(String str) {
        return new zzdp(str);
    }

    public static zzdr zzj(byte... bArr) {
        bArr.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length));
        return zzds.zza(byteArrayInputStream, new zzdu(byteArrayInputStream));
    }

    public static zzdr zzk(InputStream inputStream) {
        return zzds.zza(inputStream, new zzdu(inputStream));
    }

    public abstract int zza();

    public int zzb() {
        return 0;
    }

    public final zzdk zze() {
        return (zzdk) zzc(zzdk.class);
    }

    public final zzdm zzf() {
        return (zzdm) zzc(zzdm.class);
    }

    public final zzdo zzh() {
        return (zzdo) zzc(zzdo.class);
    }
}
