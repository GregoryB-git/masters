package com.google.android.recaptcha.internal;

import java.math.BigInteger;

/* loaded from: classes.dex */
public final class zzhv {
    private static final zzhu zza = new zzhu(11, ((long) Math.pow(2.0d, 32.0d)) ^ 20919936621L, (long) Math.pow(2.0d, 48.0d));
    private final zzhu zzb;
    private long zzc;

    public zzhv(long j10, long j11, zzhu zzhuVar) {
        this.zzb = zzhuVar;
        this.zzc = Math.abs(j10);
    }

    public final long zza() {
        zzhu zzhuVar = this.zzb;
        long longValue = (BigInteger.valueOf(zzhuVar.zzb()).multiply(BigInteger.valueOf(this.zzc)).mod(BigInteger.valueOf(zzhuVar.zza())).longValue() + 11) % this.zzb.zza();
        this.zzc = longValue;
        return longValue % 255;
    }
}
