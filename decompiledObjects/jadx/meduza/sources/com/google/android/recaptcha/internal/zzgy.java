package com.google.android.recaptcha.internal;

import ec.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sb.k;
import sb.m;
import sb.s;

/* loaded from: classes.dex */
public final class zzgy implements zzgx {
    public static final zzgy zza = new zzgy();

    private zzgy() {
    }

    private static final List zzc(Object obj) {
        List list;
        int i10 = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            i.e(bArr, "<this>");
            int length = bArr.length;
            if (length == 0) {
                return s.f14324a;
            }
            if (length == 1) {
                return va.a.f(Byte.valueOf(bArr[0]));
            }
            ArrayList arrayList = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i10 < length2) {
                arrayList.add(Byte.valueOf(bArr[i10]));
                i10++;
            }
            return arrayList;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            i.e(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 == 0) {
                list = s.f14324a;
            } else {
                if (length3 != 1) {
                    ArrayList arrayList2 = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i10 < length4) {
                        arrayList2.add(Short.valueOf(sArr[i10]));
                        i10++;
                    }
                    return arrayList2;
                }
                list = va.a.f(Short.valueOf(sArr[0]));
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            i.e(iArr, "<this>");
            int length5 = iArr.length;
            if (length5 == 0) {
                list = s.f14324a;
            } else {
                if (length5 != 1) {
                    ArrayList arrayList3 = new ArrayList(iArr.length);
                    int length6 = iArr.length;
                    while (i10 < length6) {
                        arrayList3.add(Integer.valueOf(iArr[i10]));
                        i10++;
                    }
                    return arrayList3;
                }
                list = va.a.f(Integer.valueOf(iArr[0]));
            }
        } else {
            if (obj instanceof long[]) {
                return k.q((long[]) obj);
            }
            if (!(obj instanceof float[])) {
                if (!(obj instanceof double[])) {
                    return null;
                }
                double[] dArr = (double[]) obj;
                i.e(dArr, "<this>");
                int length7 = dArr.length;
                if (length7 == 0) {
                    return s.f14324a;
                }
                if (length7 == 1) {
                    return va.a.f(Double.valueOf(dArr[0]));
                }
                ArrayList arrayList4 = new ArrayList(dArr.length);
                int length8 = dArr.length;
                while (i10 < length8) {
                    arrayList4.add(Double.valueOf(dArr[i10]));
                    i10++;
                }
                return arrayList4;
            }
            float[] fArr = (float[]) obj;
            i.e(fArr, "<this>");
            int length9 = fArr.length;
            if (length9 == 0) {
                list = s.f14324a;
            } else {
                if (length9 != 1) {
                    ArrayList arrayList5 = new ArrayList(fArr.length);
                    int length10 = fArr.length;
                    while (i10 < length10) {
                        arrayList5.add(Float.valueOf(fArr[i10]));
                        i10++;
                    }
                    return arrayList5;
                }
                list = va.a.f(Float.valueOf(fArr[0]));
            }
        }
        return list;
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
        zzgdVar.zzc().zze(i10, zzb(zza2, zza3));
    }

    public final Object zzb(Object obj, Object obj2) {
        List zzc = zzc(obj);
        List zzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (zzc2 != null) {
                ArrayList arrayList = new ArrayList(m.j(zzc2));
                Iterator it = zzc2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (zzc != null && (obj2 instanceof Number)) {
            ArrayList arrayList2 = new ArrayList(m.j(zzc));
            Iterator it2 = zzc.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(Math.pow(((Number) it2.next()).doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        }
        if (zzc == null || zzc2 == null) {
            throw new zzce(4, 5, null);
        }
        zzgw.zza(this, zzc.size(), zzc2.size());
        int size = zzc.size();
        Double[] dArr = new Double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = Double.valueOf(Math.pow(((Number) zzc.get(i10)).doubleValue(), ((Number) zzc2.get(i10)).doubleValue()));
        }
        return dArr;
    }
}
