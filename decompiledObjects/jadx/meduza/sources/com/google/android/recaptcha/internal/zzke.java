package com.google.android.recaptcha.internal;

import defpackage.f;

/* loaded from: classes.dex */
final class zzke extends zzkg {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzke(java.lang.String r2, java.lang.String r3, java.lang.Character r4) {
        /*
            r1 = this;
            com.google.android.recaptcha.internal.zzkd r0 = new com.google.android.recaptcha.internal.zzkd
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r1.<init>(r0, r4)
            char[] r2 = com.google.android.recaptcha.internal.zzkd.zze(r0)
            int r2 = r2.length
            r3 = 64
            if (r2 != r3) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            com.google.android.recaptcha.internal.zzjf.zza(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzke.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
    }

    @Override // com.google.android.recaptcha.internal.zzkg, com.google.android.recaptcha.internal.zzkh
    public final int zza(byte[] bArr, CharSequence charSequence) {
        CharSequence zze = zze(charSequence);
        if (!this.zza.zzc(zze.length())) {
            throw new zzkf(f.h("Invalid input length ", zze.length()));
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < zze.length()) {
            int i12 = i10 + 1;
            int i13 = i11 + 1;
            int zzb = (this.zza.zzb(zze.charAt(i10)) << 18) | (this.zza.zzb(zze.charAt(i12)) << 12);
            bArr[i11] = (byte) (zzb >>> 16);
            int i14 = i12 + 1;
            if (i14 < zze.length()) {
                int i15 = i14 + 1;
                int zzb2 = zzb | (this.zza.zzb(zze.charAt(i14)) << 6);
                i11 = i13 + 1;
                bArr[i13] = (byte) ((zzb2 >>> 8) & 255);
                if (i15 < zze.length()) {
                    bArr[i11] = (byte) ((zzb2 | this.zza.zzb(zze.charAt(i15))) & 255);
                    i11++;
                    i10 = i15 + 1;
                } else {
                    i10 = i15;
                }
            } else {
                i10 = i14;
                i11 = i13;
            }
        }
        return i11;
    }

    @Override // com.google.android.recaptcha.internal.zzkg, com.google.android.recaptcha.internal.zzkh
    public final void zzb(Appendable appendable, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        zzjf.zzd(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = i12 + 1;
            int i15 = bArr[i12] & 255;
            int i16 = bArr[i14] & 255;
            int i17 = i14 + 1;
            int i18 = (i15 << 16) | (i16 << 8) | (bArr[i17] & 255);
            appendable.append(this.zza.zza(i18 >>> 18));
            appendable.append(this.zza.zza((i18 >>> 12) & 63));
            appendable.append(this.zza.zza((i18 >>> 6) & 63));
            appendable.append(this.zza.zza(i18 & 63));
            i12 = i17 + 1;
        }
        if (i12 < i11) {
            zzf(appendable, bArr, i12, i11 - i12);
        }
    }
}
