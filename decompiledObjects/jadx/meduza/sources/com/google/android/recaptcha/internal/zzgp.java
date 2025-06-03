package com.google.android.recaptcha.internal;

import java.util.Collection;
import sb.k;
import sb.q;

/* loaded from: classes.dex */
public final class zzgp implements zzgx {
    public static final zzgp zza = new zzgp();

    private zzgp() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i10, zzgd zzgdVar, zzue... zzueVarArr) {
        String p10;
        String str;
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        int i11 = 0;
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Object)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzce(4, 5, null);
        }
        if (zza2 instanceof int[]) {
            int[] iArr = (int[]) zza2;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((CharSequence) "[");
            int length = iArr.length;
            int i12 = 0;
            while (i11 < length) {
                int i13 = iArr[i11];
                i12++;
                if (i12 > 1) {
                    sb2.append((CharSequence) ",");
                }
                sb2.append((CharSequence) String.valueOf(i13));
                i11++;
            }
            sb2.append((CharSequence) "]");
            p10 = sb2.toString();
        } else {
            if (zza2 instanceof byte[]) {
                str = new String((byte[]) zza2, lc.a.f9829a);
            } else if (zza2 instanceof long[]) {
                long[] jArr = (long[]) zza2;
                StringBuilder sb3 = new StringBuilder();
                sb3.append((CharSequence) "[");
                int length2 = jArr.length;
                int i14 = 0;
                while (i11 < length2) {
                    long j10 = jArr[i11];
                    i14++;
                    if (i14 > 1) {
                        sb3.append((CharSequence) ",");
                    }
                    sb3.append((CharSequence) String.valueOf(j10));
                    i11++;
                }
                sb3.append((CharSequence) "]");
                p10 = sb3.toString();
            } else if (zza2 instanceof short[]) {
                short[] sArr = (short[]) zza2;
                StringBuilder sb4 = new StringBuilder();
                sb4.append((CharSequence) "[");
                int length3 = sArr.length;
                int i15 = 0;
                while (i11 < length3) {
                    short s10 = sArr[i11];
                    i15++;
                    if (i15 > 1) {
                        sb4.append((CharSequence) ",");
                    }
                    sb4.append((CharSequence) String.valueOf((int) s10));
                    i11++;
                }
                sb4.append((CharSequence) "]");
                p10 = sb4.toString();
            } else if (zza2 instanceof float[]) {
                float[] fArr = (float[]) zza2;
                StringBuilder sb5 = new StringBuilder();
                sb5.append((CharSequence) "[");
                int length4 = fArr.length;
                int i16 = 0;
                while (i11 < length4) {
                    float f = fArr[i11];
                    i16++;
                    if (i16 > 1) {
                        sb5.append((CharSequence) ",");
                    }
                    sb5.append((CharSequence) String.valueOf(f));
                    i11++;
                }
                sb5.append((CharSequence) "]");
                p10 = sb5.toString();
            } else if (zza2 instanceof double[]) {
                double[] dArr = (double[]) zza2;
                StringBuilder sb6 = new StringBuilder();
                sb6.append((CharSequence) "[");
                int length5 = dArr.length;
                int i17 = 0;
                while (i11 < length5) {
                    double d10 = dArr[i11];
                    i17++;
                    if (i17 > 1) {
                        sb6.append((CharSequence) ",");
                    }
                    sb6.append((CharSequence) String.valueOf(d10));
                    i11++;
                }
                sb6.append((CharSequence) "]");
                p10 = sb6.toString();
            } else if (zza2 instanceof char[]) {
                str = new String((char[]) zza2);
            } else if (zza2 instanceof Object[]) {
                p10 = k.p((Object[]) zza2, ",", "[", "]", 56);
            } else {
                if (!(zza2 instanceof Collection)) {
                    throw new zzce(4, 5, null);
                }
                p10 = q.p((Iterable) zza2, ",", "[", "]", null, 56);
            }
            p10 = str;
        }
        zzgdVar.zzc().zze(i10, p10);
    }
}
