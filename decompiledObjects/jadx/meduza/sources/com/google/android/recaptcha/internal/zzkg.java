package com.google.android.recaptcha.internal;

import defpackage.f;
import java.math.RoundingMode;
import java.util.Objects;

/* loaded from: classes.dex */
class zzkg extends zzkh {
    public final zzkd zza;
    public final Character zzb;

    public zzkg(zzkd zzkdVar, Character ch) {
        this.zza = zzkdVar;
        if (ch != null) {
            ch.charValue();
            if (zzkdVar.zzd('=')) {
                throw new IllegalArgumentException(zzji.zza("Padding character %s was already in alphabet", ch));
            }
        }
        this.zzb = ch;
    }

    public zzkg(String str, String str2, Character ch) {
        this(new zzkd(str, str2.toCharArray()), ch);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzkg) {
            zzkg zzkgVar = (zzkg) obj;
            if (this.zza.equals(zzkgVar.zza) && Objects.equals(this.zzb, zzkgVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzb;
        return Objects.hashCode(ch) ^ this.zza.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.zza);
        if (8 % this.zza.zzb != 0) {
            if (this.zzb == null) {
                str = ".omitPadding()";
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.zzb);
                str = "')";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public int zza(byte[] bArr, CharSequence charSequence) {
        zzkd zzkdVar;
        CharSequence zze = zze(charSequence);
        if (!this.zza.zzc(zze.length())) {
            throw new zzkf(f.h("Invalid input length ", zze.length()));
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < zze.length()) {
            long j10 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                zzkdVar = this.zza;
                if (i12 >= zzkdVar.zzc) {
                    break;
                }
                j10 <<= zzkdVar.zzb;
                if (i10 + i12 < zze.length()) {
                    j10 |= this.zza.zzb(zze.charAt(i13 + i10));
                    i13++;
                }
                i12++;
            }
            int i14 = zzkdVar.zzd;
            int i15 = i13 * zzkdVar.zzb;
            int i16 = (i14 - 1) * 8;
            while (i16 >= (i14 * 8) - i15) {
                bArr[i11] = (byte) ((j10 >>> i16) & 255);
                i16 -= 8;
                i11++;
            }
            i10 += this.zza.zzc;
        }
        return i11;
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public void zzb(Appendable appendable, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        zzjf.zzd(0, i11, bArr.length);
        while (i12 < i11) {
            zzf(appendable, bArr, i12, Math.min(this.zza.zzd, i11 - i12));
            i12 += this.zza.zzd;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final int zzc(int i10) {
        return (int) (((this.zza.zzb * i10) + 7) / 8);
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final int zzd(int i10) {
        zzkd zzkdVar = this.zza;
        return zzkdVar.zzc * zzkj.zza(i10, zzkdVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    public final CharSequence zze(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.zzb;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final void zzf(Appendable appendable, byte[] bArr, int i10, int i11) {
        zzjf.zzd(i10, i10 + i11, bArr.length);
        int i12 = 0;
        zzjf.zza(i11 <= this.zza.zzd);
        long j10 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j10 = (j10 | (bArr[i10 + i13] & 255)) << 8;
        }
        int i14 = (i11 + 1) * 8;
        zzkd zzkdVar = this.zza;
        while (i12 < i11 * 8) {
            long j11 = j10 >>> ((i14 - zzkdVar.zzb) - i12);
            zzkd zzkdVar2 = this.zza;
            appendable.append(zzkdVar2.zza(((int) j11) & zzkdVar2.zza));
            i12 += this.zza.zzb;
        }
        if (this.zzb != null) {
            while (i12 < this.zza.zzd * 8) {
                this.zzb.charValue();
                appendable.append('=');
                i12 += this.zza.zzb;
            }
        }
    }
}
