package com.google.android.gms.internal.fido;

/* loaded from: classes.dex */
final class zzce extends zzcg {
    public final char[] zza;

    private zzce(zzcd zzcdVar) {
        super(zzcdVar, null);
        char[] cArr;
        this.zza = new char[512];
        cArr = zzcdVar.zzf;
        zzap.zzc(cArr.length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            this.zza[i10] = zzcdVar.zza(i10 >>> 4);
            this.zza[i10 | 256] = zzcdVar.zza(i10 & 15);
        }
    }

    public zzce(String str, String str2) {
        this(new zzcd("base16()", "0123456789ABCDEF".toCharArray()));
    }

    @Override // com.google.android.gms.internal.fido.zzcg
    public final zzch zza(zzcd zzcdVar, Character ch) {
        return new zzce(zzcdVar);
    }

    @Override // com.google.android.gms.internal.fido.zzcg, com.google.android.gms.internal.fido.zzch
    public final void zzb(Appendable appendable, byte[] bArr, int i10, int i11) {
        zzap.zze(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i12] & 255;
            appendable.append(this.zza[i13]);
            appendable.append(this.zza[i13 | 256]);
        }
    }
}
