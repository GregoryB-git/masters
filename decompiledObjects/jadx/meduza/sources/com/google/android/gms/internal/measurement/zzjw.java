package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzjw<T extends zzjy<T>> {
    private static final zzjw<?> zzb = new zzjw<>(true);
    public final zzmj<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    private zzjw() {
        this.zza = new zzmi();
    }

    private zzjw(zzmj<T, Object> zzmjVar) {
        this.zza = zzmjVar;
        zze();
    }

    private zzjw(boolean z10) {
        this(new zzmi());
        zze();
    }

    public static int zza(zzjy<?> zzjyVar, Object obj) {
        zzng zzb2 = zzjyVar.zzb();
        int zza = zzjyVar.zza();
        if (!zzjyVar.zze()) {
            return zza(zzb2, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!zzjyVar.zzd()) {
            int i11 = 0;
            while (i10 < size) {
                i11 += zza(zzb2, zza, list.get(i10));
                i10++;
            }
            return i11;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i12 = 0;
        while (i10 < size) {
            i12 += zza(zzb2, list.get(i10));
            i10++;
        }
        return zzjn.zzg(i12) + zzjn.zzf(zza) + i12;
    }

    public static int zza(zzng zzngVar, int i10, Object obj) {
        int zzf = zzjn.zzf(i10);
        if (zzngVar == zzng.zzj) {
            zzkj.zza((zzlm) obj);
            zzf <<= 1;
        }
        return zzf + zza(zzngVar, obj);
    }

    private static int zza(zzng zzngVar, Object obj) {
        switch (zzjz.zzb[zzngVar.ordinal()]) {
            case 1:
                return zzjn.zza(((Double) obj).doubleValue());
            case 2:
                return zzjn.zza(((Float) obj).floatValue());
            case 3:
                return zzjn.zzb(((Long) obj).longValue());
            case 4:
                return zzjn.zze(((Long) obj).longValue());
            case 5:
                return zzjn.zzc(((Integer) obj).intValue());
            case 6:
                return zzjn.zza(((Long) obj).longValue());
            case 7:
                return zzjn.zzb(((Integer) obj).intValue());
            case 8:
                return zzjn.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzjn.zza((zzlm) obj);
            case 10:
                return obj instanceof zzkq ? zzjn.zza((zzkq) obj) : zzjn.zzb((zzlm) obj);
            case 11:
                return obj instanceof zziy ? zzjn.zza((zziy) obj) : zzjn.zza((String) obj);
            case 12:
                return obj instanceof zziy ? zzjn.zza((zziy) obj) : zzjn.zza((byte[]) obj);
            case 13:
                return zzjn.zzg(((Integer) obj).intValue());
            case 14:
                return zzjn.zzd(((Integer) obj).intValue());
            case 15:
                return zzjn.zzc(((Long) obj).longValue());
            case 16:
                return zzjn.zze(((Integer) obj).intValue());
            case 17:
                return zzjn.zzd(((Long) obj).longValue());
            case 18:
                return obj instanceof zzki ? zzjn.zza(((zzki) obj).zza()) : zzjn.zza(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() != zznj.MESSAGE || key.zze() || key.zzd()) {
            return zza((zzjy<?>) key, value);
        }
        boolean z10 = value instanceof zzkq;
        int zza = entry.getKey().zza();
        return z10 ? zzjn.zza(zza, (zzkq) value) : zzjn.zza(zza, (zzlm) value);
    }

    private final Object zza(T t) {
        Object obj = this.zza.get(t);
        if (!(obj instanceof zzkq)) {
            return obj;
        }
        throw new NoSuchMethodError();
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzlv) {
            return ((zzlv) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static void zza(zzjn zzjnVar, zzng zzngVar, int i10, Object obj) {
        if (zzngVar == zzng.zzj) {
            zzlm zzlmVar = (zzlm) obj;
            zzkj.zza(zzlmVar);
            zzjnVar.zzj(i10, 3);
            zzlmVar.zza(zzjnVar);
            zzjnVar.zzj(i10, 4);
        }
        zzjnVar.zzj(i10, zzngVar.zza());
        switch (zzjz.zzb[zzngVar.ordinal()]) {
            case 1:
                zzjnVar.zzb(((Double) obj).doubleValue());
                break;
            case 2:
                zzjnVar.zzb(((Float) obj).floatValue());
                break;
            case 3:
                zzjnVar.zzh(((Long) obj).longValue());
                break;
            case 4:
                zzjnVar.zzh(((Long) obj).longValue());
                break;
            case 5:
                zzjnVar.zzi(((Integer) obj).intValue());
                break;
            case 6:
                zzjnVar.zzf(((Long) obj).longValue());
                break;
            case 7:
                zzjnVar.zzh(((Integer) obj).intValue());
                break;
            case 8:
                zzjnVar.zzb(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzlm) obj).zza(zzjnVar);
                break;
            case 10:
                zzjnVar.zzc((zzlm) obj);
                break;
            case 11:
                if (!(obj instanceof zziy)) {
                    zzjnVar.zzb((String) obj);
                    break;
                } else {
                    zzjnVar.zzb((zziy) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof zziy)) {
                    byte[] bArr = (byte[]) obj;
                    zzjnVar.zzb(bArr, 0, bArr.length);
                    break;
                } else {
                    zzjnVar.zzb((zziy) obj);
                    break;
                }
            case 13:
                zzjnVar.zzk(((Integer) obj).intValue());
                break;
            case 14:
                zzjnVar.zzh(((Integer) obj).intValue());
                break;
            case 15:
                zzjnVar.zzf(((Long) obj).longValue());
                break;
            case 16:
                zzjnVar.zzj(((Integer) obj).intValue());
                break;
            case 17:
                zzjnVar.zzg(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof zzki)) {
                    zzjnVar.zzi(((Integer) obj).intValue());
                    break;
                } else {
                    zzjnVar.zzi(((zzki) obj).zza());
                    break;
                }
        }
    }

    public static <T extends zzjy<T>> zzjw<T> zzb() {
        return (zzjw<T>) zzb;
    }

    private final void zzb(T t, Object obj) {
        if (!t.zze()) {
            zzc(t, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                zzc(t, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzkq) {
            this.zzd = true;
        }
        this.zza.zza((zzmj<T, Object>) t, (T) obj);
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof zzkq;
        if (key.zze()) {
            if (z10) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object zza = zza((zzjw<T>) key);
            List list = (List) value;
            int size = list.size();
            if (zza == null) {
                zza = new ArrayList(size);
            }
            List list2 = (List) zza;
            for (int i10 = 0; i10 < size; i10++) {
                list2.add(zza(list.get(i10)));
            }
            this.zza.zza((zzmj<T, Object>) key, (T) zza);
            return;
        }
        if (key.zzc() != zznj.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.zza((zzmj<T, Object>) key, (T) zza(value));
            return;
        }
        Object zza2 = zza((zzjw<T>) key);
        if (zza2 == null) {
            this.zza.zza((zzmj<T, Object>) key, (T) zza(value));
            if (z10) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z10) {
            throw new NoSuchMethodError();
        }
        this.zza.zza((zzmj<T, Object>) key, (T) (zza2 instanceof zzlv ? key.zza((zzlv) zza2, (zzlv) value) : key.zza(((zzlm) zza2).zzcn(), (zzlm) value).zzaj()));
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzlo) {
            return ((zzlo) obj).j_();
        }
        if (obj instanceof zzkq) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if ((r6 instanceof com.google.android.gms.internal.measurement.zzkq) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        if ((r6 instanceof com.google.android.gms.internal.measurement.zzki) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
    
        if ((r6 instanceof byte[]) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzc(T r5, java.lang.Object r6) {
        /*
            com.google.android.gms.internal.measurement.zzng r0 = r5.zzb()
            com.google.android.gms.internal.measurement.zzkj.zza(r6)
            int[] r1 = com.google.android.gms.internal.measurement.zzjz.zza
            com.google.android.gms.internal.measurement.zznj r0 = r0.zzb()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L45;
                case 2: goto L42;
                case 3: goto L3f;
                case 4: goto L3c;
                case 5: goto L39;
                case 6: goto L36;
                case 7: goto L2c;
                case 8: goto L23;
                case 9: goto L1a;
                default: goto L18;
            }
        L18:
            r0 = r2
            goto L47
        L1a:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzlm
            if (r0 != 0) goto L34
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzkq
            if (r0 == 0) goto L18
            goto L34
        L23:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L34
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zzki
            if (r0 == 0) goto L18
            goto L34
        L2c:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.zziy
            if (r0 != 0) goto L34
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L18
        L34:
            r0 = r1
            goto L47
        L36:
            boolean r0 = r6 instanceof java.lang.String
            goto L47
        L39:
            boolean r0 = r6 instanceof java.lang.Boolean
            goto L47
        L3c:
            boolean r0 = r6 instanceof java.lang.Double
            goto L47
        L3f:
            boolean r0 = r6 instanceof java.lang.Float
            goto L47
        L42:
            boolean r0 = r6 instanceof java.lang.Long
            goto L47
        L45:
            boolean r0 = r6 instanceof java.lang.Integer
        L47:
            if (r0 == 0) goto L4a
            return
        L4a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r5.zza()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r2] = r4
            com.google.android.gms.internal.measurement.zzng r5 = r5.zzb()
            com.google.android.gms.internal.measurement.zznj r5 = r5.zzb()
            r3[r1] = r5
            r5 = 2
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r3[r5] = r6
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r3)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjw.zzc(com.google.android.gms.internal.measurement.zzjy, java.lang.Object):void");
    }

    private static <T extends zzjy<T>> boolean zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zznj.MESSAGE) {
            return true;
        }
        boolean zze = key.zze();
        Object value = entry.getValue();
        if (!zze) {
            return zzb(value);
        }
        List list = (List) value;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!zzb(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object clone() {
        zzjw zzjwVar = new zzjw();
        int zzb2 = this.zza.zzb();
        for (int i10 = 0; i10 < zzb2; i10++) {
            Map.Entry<T, Object> zza = this.zza.zza(i10);
            zzjwVar.zzb(zza.getKey(), zza.getValue());
        }
        for (Map.Entry<T, Object> entry : this.zza.zzc()) {
            zzjwVar.zzb(entry.getKey(), entry.getValue());
        }
        zzjwVar.zzd = this.zzd;
        return zzjwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzjw) {
            return this.zza.equals(((zzjw) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zza() {
        int zzb2 = this.zza.zzb();
        int i10 = 0;
        for (int i11 = 0; i11 < zzb2; i11++) {
            i10 += zza((Map.Entry) this.zza.zza(i11));
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            i10 += zza((Map.Entry) it.next());
        }
        return i10;
    }

    public final void zza(zzjw<T> zzjwVar) {
        int zzb2 = zzjwVar.zza.zzb();
        for (int i10 = 0; i10 < zzb2; i10++) {
            zzb((Map.Entry) zzjwVar.zza.zza(i10));
        }
        Iterator<Map.Entry<T, Object>> it = zzjwVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzb((Map.Entry) it.next());
        }
    }

    public final Iterator<Map.Entry<T, Object>> zzc() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzks(this.zza.zzd().iterator()) : this.zza.zzd().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzks(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zze() {
        if (this.zzc) {
            return;
        }
        int zzb2 = this.zza.zzb();
        for (int i10 = 0; i10 < zzb2; i10++) {
            Object value = this.zza.zza(i10).getValue();
            if (value instanceof zzkg) {
                ((zzkg) value).zzco();
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            Object value2 = it.next().getValue();
            if (value2 instanceof zzkg) {
                ((zzkg) value2).zzco();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        int zzb2 = this.zza.zzb();
        for (int i10 = 0; i10 < zzb2; i10++) {
            if (!zzc(this.zza.zza(i10))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzc(it.next())) {
                return false;
            }
        }
        return true;
    }
}
