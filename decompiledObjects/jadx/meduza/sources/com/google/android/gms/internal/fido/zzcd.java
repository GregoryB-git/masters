package com.google.android.gms.internal.fido;

import defpackage.f;
import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzcd {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzcd(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r0 = 128(0x80, float:1.794E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = r3
        La:
            int r5 = r11.length
            if (r4 >= r5) goto L2b
            char r5 = r11[r4]
            r6 = 1
            if (r5 >= r0) goto L14
            r7 = r6
            goto L15
        L14:
            r7 = r3
        L15:
            java.lang.String r8 = "Non-ASCII character: %s"
            com.google.android.gms.internal.fido.zzap.zzd(r7, r8, r5)
            r7 = r1[r5]
            if (r7 != r2) goto L1f
            goto L20
        L1f:
            r6 = r3
        L20:
            java.lang.String r7 = "Duplicate character: %s"
            com.google.android.gms.internal.fido.zzap.zzd(r6, r7, r5)
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto La
        L2b:
            r9.<init>(r10, r11, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzcd.<init>(java.lang.String, char[]):void");
    }

    private zzcd(String str, char[] cArr, byte[] bArr, boolean z10) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zzb = zzcj.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = zzb;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(zzb);
            int i10 = 1 << (3 - numberOfTrailingZeros);
            this.zzc = i10;
            this.zzd = zzb >> numberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.zzd; i11++) {
                zArr[zzcj.zza(i11 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = z10;
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException(f.h("Illegal alphabet length ", cArr.length), e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcd) {
            zzcd zzcdVar = (zzcd) obj;
            if (this.zzh == zzcdVar.zzh && Arrays.equals(this.zzf, zzcdVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzh ? 1237 : 1231);
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i10) {
        return this.zzf[i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15 */
    public final zzcd zzb() {
        int i10;
        boolean z10;
        for (char c10 : this.zzf) {
            if (zzad.zza(c10)) {
                char[] cArr = this.zzf;
                int length = cArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z10 = false;
                        break;
                    }
                    char c11 = cArr[i11];
                    if (c11 >= 'A' && c11 <= 'Z') {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
                if (!(!z10)) {
                    throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                }
                char[] cArr2 = new char[this.zzf.length];
                int i12 = 0;
                while (true) {
                    char[] cArr3 = this.zzf;
                    if (i12 >= cArr3.length) {
                        break;
                    }
                    char c12 = cArr3[i12];
                    if (zzad.zza(c12)) {
                        c12 ^= 32;
                    }
                    cArr2[i12] = (char) c12;
                    i12++;
                }
                zzcd zzcdVar = new zzcd(this.zze.concat(".upperCase()"), cArr2);
                if (!this.zzh || zzcdVar.zzh) {
                    return zzcdVar;
                }
                byte[] bArr = zzcdVar.zzg;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                for (i10 = 65; i10 <= 90; i10++) {
                    int i13 = i10 | 32;
                    byte[] bArr2 = zzcdVar.zzg;
                    byte b10 = bArr2[i10];
                    byte b11 = bArr2[i13];
                    if (b10 == -1) {
                        copyOf[i10] = b11;
                    } else {
                        char c13 = (char) i10;
                        char c14 = (char) i13;
                        if (b11 != -1) {
                            throw new IllegalStateException(zzaq.zza("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c13), Character.valueOf(c14)));
                        }
                        copyOf[i13] = b10;
                    }
                }
                return new zzcd(zzcdVar.zze.concat(".ignoreCase()"), zzcdVar.zzf, copyOf, true);
            }
        }
        return this;
    }

    public final boolean zzc(char c10) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }
}
