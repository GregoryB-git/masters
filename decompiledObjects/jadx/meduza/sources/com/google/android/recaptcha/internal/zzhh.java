package com.google.android.recaptcha.internal;

import ic.e;
import ic.f;
import ic.g;
import java.util.ArrayList;
import java.util.Iterator;
import sb.m;
import sb.q;
import sb.w;

/* loaded from: classes.dex */
public final class zzhh implements zzgx {
    public static final zzhh zza = new zzhh();

    private zzhh() {
    }

    private final Object zzb(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        boolean z12 = obj instanceof Byte;
        if ((z12 && (obj2 instanceof Byte)) || ((((z10 = obj instanceof Short)) && (obj2 instanceof Short)) || (((z11 = obj instanceof Integer)) && (obj2 instanceof Integer)))) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z13 = obj instanceof Long;
        if (z13 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj).longValue() % ((Number) obj2).longValue());
        }
        boolean z14 = obj instanceof Float;
        if (z14 && (obj2 instanceof Float)) {
            return Float.valueOf(((Number) obj).floatValue() % ((Number) obj2).floatValue());
        }
        boolean z15 = obj instanceof Double;
        if (z15 && (obj2 instanceof Double)) {
            return Double.valueOf(((Number) obj).doubleValue() % ((Number) obj2).doubleValue());
        }
        int i10 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(lc.a.f9829a);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i10 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i10] % ((Number) obj2).intValue())));
                    i10++;
                }
                return new String(q.r(arrayList), lc.a.f9829a);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i10 < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i10] % ((Number) obj2).intValue()));
                    i10++;
                }
                return q.t(arrayList2);
            }
        }
        if (z12 && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b10 : bArr) {
                arrayList3.add(Integer.valueOf(b10 % ((Number) obj).intValue()));
            }
            return arrayList3.toArray(new Integer[0]);
        }
        if (z10 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s10 : sArr) {
                arrayList4.add(Integer.valueOf(s10 % ((Number) obj).intValue()));
            }
            return arrayList4.toArray(new Integer[0]);
        }
        if (z11 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i11 : iArr) {
                arrayList5.add(Integer.valueOf(i11 % ((Number) obj).intValue()));
            }
            return arrayList5.toArray(new Integer[0]);
        }
        if (z13 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j10 : jArr) {
                arrayList6.add(Long.valueOf(j10 % ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        }
        if (z14 && (obj2 instanceof float[])) {
            float[] fArr = (float[]) obj2;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            for (float f : fArr) {
                arrayList7.add(Float.valueOf(f % ((Number) obj).floatValue()));
            }
            return arrayList7.toArray(new Float[0]);
        }
        if (z15 && (obj2 instanceof double[])) {
            double[] dArr = (double[]) obj2;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            for (double d10 : dArr) {
                arrayList8.add(Double.valueOf(d10 % ((Number) obj).doubleValue()));
            }
            return arrayList8.toArray(new Double[0]);
        }
        boolean z16 = obj instanceof byte[];
        if (z16 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList9 = new ArrayList(bArr2.length);
            for (byte b11 : bArr2) {
                arrayList9.add(Integer.valueOf(b11 % ((Number) obj2).intValue()));
            }
            return arrayList9.toArray(new Integer[0]);
        }
        boolean z17 = obj instanceof short[];
        if (z17 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList10 = new ArrayList(sArr2.length);
            for (short s11 : sArr2) {
                arrayList10.add(Integer.valueOf(s11 % ((Number) obj2).intValue()));
            }
            return arrayList10.toArray(new Integer[0]);
        }
        boolean z18 = obj instanceof int[];
        if (z18 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            int length3 = iArr2.length;
            ArrayList arrayList11 = new ArrayList(length3);
            while (i10 < length3) {
                arrayList11.add(Integer.valueOf(iArr2[i10] % ((Number) obj2).intValue()));
                i10++;
            }
            return q.t(arrayList11);
        }
        boolean z19 = obj instanceof long[];
        if (z19 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            ArrayList arrayList12 = new ArrayList(jArr2.length);
            for (long j11 : jArr2) {
                arrayList12.add(Long.valueOf(j11 % ((Number) obj2).longValue()));
            }
            return arrayList12.toArray(new Long[0]);
        }
        boolean z20 = obj instanceof float[];
        if (z20 && (obj2 instanceof Float)) {
            float[] fArr2 = (float[]) obj;
            ArrayList arrayList13 = new ArrayList(fArr2.length);
            for (float f10 : fArr2) {
                arrayList13.add(Float.valueOf(f10 % ((Number) obj2).floatValue()));
            }
            return arrayList13.toArray(new Float[0]);
        }
        boolean z21 = obj instanceof double[];
        if (z21 && (obj2 instanceof Double)) {
            double[] dArr2 = (double[]) obj;
            ArrayList arrayList14 = new ArrayList(dArr2.length);
            for (double d11 : dArr2) {
                arrayList14.add(Double.valueOf(d11 % ((Number) obj2).doubleValue()));
            }
            return arrayList14.toArray(new Double[0]);
        }
        if (z16 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length4 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzgw.zza(this, length4, bArr4.length);
            f O = g.O(0, length4);
            ArrayList arrayList15 = new ArrayList(m.j(O));
            Iterator<Integer> it = O.iterator();
            while (((e) it).f7959c) {
                int nextInt = ((w) it).nextInt();
                arrayList15.add(Integer.valueOf(bArr3[nextInt] % bArr4[nextInt]));
            }
            return arrayList15.toArray(new Integer[0]);
        }
        if (z17 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length5 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzgw.zza(this, length5, sArr4.length);
            f O2 = g.O(0, length5);
            ArrayList arrayList16 = new ArrayList(m.j(O2));
            Iterator<Integer> it2 = O2.iterator();
            while (((e) it2).f7959c) {
                int nextInt2 = ((w) it2).nextInt();
                arrayList16.add(Integer.valueOf(sArr3[nextInt2] % sArr4[nextInt2]));
            }
            return arrayList16.toArray(new Integer[0]);
        }
        if (z18 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length6 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzgw.zza(this, length6, iArr4.length);
            f O3 = g.O(0, length6);
            ArrayList arrayList17 = new ArrayList(m.j(O3));
            Iterator<Integer> it3 = O3.iterator();
            while (((e) it3).f7959c) {
                int nextInt3 = ((w) it3).nextInt();
                arrayList17.add(Integer.valueOf(iArr3[nextInt3] % iArr4[nextInt3]));
            }
            return arrayList17.toArray(new Integer[0]);
        }
        if (z19 && (obj2 instanceof long[])) {
            long[] jArr3 = (long[]) obj;
            int length7 = jArr3.length;
            long[] jArr4 = (long[]) obj2;
            zzgw.zza(this, length7, jArr4.length);
            f O4 = g.O(0, length7);
            ArrayList arrayList18 = new ArrayList(m.j(O4));
            Iterator<Integer> it4 = O4.iterator();
            while (((e) it4).f7959c) {
                int nextInt4 = ((w) it4).nextInt();
                arrayList18.add(Long.valueOf(jArr3[nextInt4] % jArr4[nextInt4]));
            }
            return arrayList18.toArray(new Long[0]);
        }
        if (z20 && (obj2 instanceof float[])) {
            float[] fArr3 = (float[]) obj;
            int length8 = fArr3.length;
            float[] fArr4 = (float[]) obj2;
            zzgw.zza(this, length8, fArr4.length);
            f O5 = g.O(0, length8);
            ArrayList arrayList19 = new ArrayList(m.j(O5));
            Iterator<Integer> it5 = O5.iterator();
            while (((e) it5).f7959c) {
                int nextInt5 = ((w) it5).nextInt();
                arrayList19.add(Float.valueOf(fArr3[nextInt5] % fArr4[nextInt5]));
            }
            return arrayList19.toArray(new Float[0]);
        }
        if (!z21 || !(obj2 instanceof double[])) {
            throw new zzce(4, 5, null);
        }
        double[] dArr3 = (double[]) obj;
        int length9 = dArr3.length;
        double[] dArr4 = (double[]) obj2;
        zzgw.zza(this, length9, dArr4.length);
        f O6 = g.O(0, length9);
        ArrayList arrayList20 = new ArrayList(m.j(O6));
        Iterator<Integer> it6 = O6.iterator();
        while (((e) it6).f7959c) {
            int nextInt6 = ((w) it6).nextInt();
            arrayList20.add(Double.valueOf(dArr3[nextInt6] % dArr4[nextInt6]));
        }
        return arrayList20.toArray(new Double[0]);
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i10, zzgd zzgdVar, zzue... zzueVarArr) {
        if (zzueVarArr.length != 2) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Object)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzce(4, 5, null);
        }
        Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (zza3 instanceof Object)) {
            zza3 = null;
        }
        if (zza3 == null) {
            throw new zzce(4, 5, null);
        }
        try {
            zzgdVar.zzc().zze(i10, zzb(zza2, zza3));
        } catch (ArithmeticException e10) {
            throw new zzce(4, 6, e10);
        }
    }
}
