package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaka;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzajy<T extends zzaka<T>> {
    private static final zzajy<?> zzb = new zzajy<>(true);
    public final zzamh<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    private zzajy() {
        this.zza = new zzamg();
    }

    private zzajy(zzamh<T, Object> zzamhVar) {
        this.zza = zzamhVar;
        zze();
    }

    private zzajy(boolean z10) {
        this(new zzamg());
        zze();
    }

    public static int zza(zzaka<?> zzakaVar, Object obj) {
        zzanh zzb2 = zzakaVar.zzb();
        int zza = zzakaVar.zza();
        if (!zzakaVar.zze()) {
            return zza(zzb2, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!zzakaVar.zzd()) {
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
        return zzajo.zzh(i12) + zzajo.zzg(zza) + i12;
    }

    public static int zza(zzanh zzanhVar, int i10, Object obj) {
        int zzg = zzajo.zzg(i10);
        if (zzanhVar == zzanh.zzj) {
            zzaki.zza((zzaln) obj);
            zzg <<= 1;
        }
        return zzg + zza(zzanhVar, obj);
    }

    private static int zza(zzanh zzanhVar, Object obj) {
        switch (zzakb.zzb[zzanhVar.ordinal()]) {
            case 1:
                return zzajo.zza(((Double) obj).doubleValue());
            case 2:
                return zzajo.zza(((Float) obj).floatValue());
            case 3:
                return zzajo.zzb(((Long) obj).longValue());
            case 4:
                return zzajo.zze(((Long) obj).longValue());
            case 5:
                return zzajo.zzc(((Integer) obj).intValue());
            case 6:
                return zzajo.zza(((Long) obj).longValue());
            case 7:
                return zzajo.zzb(((Integer) obj).intValue());
            case 8:
                return zzajo.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzajo.zza((zzaln) obj);
            case 10:
                return obj instanceof zzakr ? zzajo.zza((zzakr) obj) : zzajo.zzb((zzaln) obj);
            case 11:
                return obj instanceof zzaiw ? zzajo.zza((zzaiw) obj) : zzajo.zza((String) obj);
            case 12:
                return obj instanceof zzaiw ? zzajo.zza((zzaiw) obj) : zzajo.zza((byte[]) obj);
            case 13:
                return zzajo.zzh(((Integer) obj).intValue());
            case 14:
                return zzajo.zze(((Integer) obj).intValue());
            case 15:
                return zzajo.zzc(((Long) obj).longValue());
            case 16:
                return zzajo.zzf(((Integer) obj).intValue());
            case 17:
                return zzajo.zzd(((Long) obj).longValue());
            case 18:
                return obj instanceof zzakl ? zzajo.zza(((zzakl) obj).zza()) : zzajo.zza(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() != zzank.MESSAGE || key.zze() || key.zzd()) {
            return zza((zzaka<?>) key, value);
        }
        boolean z10 = value instanceof zzakr;
        int zza = entry.getKey().zza();
        return z10 ? zzajo.zza(zza, (zzakr) value) : zzajo.zza(zza, (zzaln) value);
    }

    private final Object zza(T t) {
        Object obj = this.zza.get(t);
        if (!(obj instanceof zzakr)) {
            return obj;
        }
        throw new NoSuchMethodError();
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzals) {
            return ((zzals) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static void zza(zzajo zzajoVar, zzanh zzanhVar, int i10, Object obj) {
        if (zzanhVar == zzanh.zzj) {
            zzaln zzalnVar = (zzaln) obj;
            zzaki.zza(zzalnVar);
            zzajoVar.zzj(i10, 3);
            zzalnVar.zza(zzajoVar);
            zzajoVar.zzj(i10, 4);
        }
        zzajoVar.zzj(i10, zzanhVar.zza());
        switch (zzakb.zzb[zzanhVar.ordinal()]) {
            case 1:
                zzajoVar.zzb(((Double) obj).doubleValue());
                break;
            case 2:
                zzajoVar.zzb(((Float) obj).floatValue());
                break;
            case 3:
                zzajoVar.zzh(((Long) obj).longValue());
                break;
            case 4:
                zzajoVar.zzh(((Long) obj).longValue());
                break;
            case 5:
                zzajoVar.zzj(((Integer) obj).intValue());
                break;
            case 6:
                zzajoVar.zzf(((Long) obj).longValue());
                break;
            case 7:
                zzajoVar.zzi(((Integer) obj).intValue());
                break;
            case 8:
                zzajoVar.zzb(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzaln) obj).zza(zzajoVar);
                break;
            case 10:
                zzajoVar.zzc((zzaln) obj);
                break;
            case 11:
                if (!(obj instanceof zzaiw)) {
                    zzajoVar.zzb((String) obj);
                    break;
                } else {
                    zzajoVar.zzb((zzaiw) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof zzaiw)) {
                    byte[] bArr = (byte[]) obj;
                    zzajoVar.zzb(bArr, 0, bArr.length);
                    break;
                } else {
                    zzajoVar.zzb((zzaiw) obj);
                    break;
                }
            case 13:
                zzajoVar.zzl(((Integer) obj).intValue());
                break;
            case 14:
                zzajoVar.zzi(((Integer) obj).intValue());
                break;
            case 15:
                zzajoVar.zzf(((Long) obj).longValue());
                break;
            case 16:
                zzajoVar.zzk(((Integer) obj).intValue());
                break;
            case 17:
                zzajoVar.zzg(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof zzakl)) {
                    zzajoVar.zzj(((Integer) obj).intValue());
                    break;
                } else {
                    zzajoVar.zzj(((zzakl) obj).zza());
                    break;
                }
        }
    }

    public static <T extends zzaka<T>> zzajy<T> zzb() {
        return (zzajy<T>) zzb;
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
        if (obj instanceof zzakr) {
            this.zzd = true;
        }
        this.zza.zza((zzamh<T, Object>) t, (T) obj);
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof zzakr;
        if (key.zze()) {
            if (z10) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object zza = zza((zzajy<T>) key);
            List list = (List) value;
            int size = list.size();
            if (zza == null) {
                zza = new ArrayList(size);
            }
            List list2 = (List) zza;
            for (int i10 = 0; i10 < size; i10++) {
                list2.add(zza(list.get(i10)));
            }
            this.zza.zza((zzamh<T, Object>) key, (T) zza);
            return;
        }
        if (key.zzc() != zzank.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.zza((zzamh<T, Object>) key, (T) zza(value));
            return;
        }
        Object zza2 = zza((zzajy<T>) key);
        if (zza2 == null) {
            this.zza.zza((zzamh<T, Object>) key, (T) zza(value));
            if (z10) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z10) {
            throw new NoSuchMethodError();
        }
        this.zza.zza((zzamh<T, Object>) key, (T) (zza2 instanceof zzals ? key.zza((zzals) zza2, (zzals) value) : key.zza(((zzaln) zza2).zzr(), (zzaln) value).zze()));
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzalp) {
            return ((zzalp) obj).zzv();
        }
        if (obj instanceof zzakr) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if ((r6 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzakr) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        if ((r6 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzakl) == false) goto L4;
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
            com.google.android.gms.internal.firebase-auth-api.zzanh r0 = r5.zzb()
            com.google.android.gms.internal.p002firebaseauthapi.zzaki.zza(r6)
            int[] r1 = com.google.android.gms.internal.p002firebaseauthapi.zzakb.zza
            com.google.android.gms.internal.firebase-auth-api.zzank r0 = r0.zzb()
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
            boolean r0 = r6 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzaln
            if (r0 != 0) goto L34
            boolean r0 = r6 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzakr
            if (r0 == 0) goto L18
            goto L34
        L23:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L34
            boolean r0 = r6 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzakl
            if (r0 == 0) goto L18
            goto L34
        L2c:
            boolean r0 = r6 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzaiw
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
            com.google.android.gms.internal.firebase-auth-api.zzanh r5 = r5.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzank r5 = r5.zzb()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzajy.zzc(com.google.android.gms.internal.firebase-auth-api.zzaka, java.lang.Object):void");
    }

    private static <T extends zzaka<T>> boolean zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zzank.MESSAGE) {
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
        zzajy zzajyVar = new zzajy();
        int zzb2 = this.zza.zzb();
        for (int i10 = 0; i10 < zzb2; i10++) {
            Map.Entry<T, Object> zza = this.zza.zza(i10);
            zzajyVar.zzb(zza.getKey(), zza.getValue());
        }
        for (Map.Entry<T, Object> entry : this.zza.zzc()) {
            zzajyVar.zzb(entry.getKey(), entry.getValue());
        }
        zzajyVar.zzd = this.zzd;
        return zzajyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzajy) {
            return this.zza.equals(((zzajy) obj).zza);
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

    public final void zza(zzajy<T> zzajyVar) {
        int zzb2 = zzajyVar.zza.zzb();
        for (int i10 = 0; i10 < zzb2; i10++) {
            zzb((Map.Entry) zzajyVar.zza.zza(i10));
        }
        Iterator<Map.Entry<T, Object>> it = zzajyVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzb((Map.Entry) it.next());
        }
    }

    public final Iterator<Map.Entry<T, Object>> zzc() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzakt(this.zza.zzd().iterator()) : this.zza.zzd().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzakt(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zze() {
        if (this.zzc) {
            return;
        }
        int zzb2 = this.zza.zzb();
        for (int i10 = 0; i10 < zzb2; i10++) {
            Object value = this.zza.zza(i10).getValue();
            if (value instanceof zzakg) {
                ((zzakg) value).zzt();
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            Object value2 = it.next().getValue();
            if (value2 instanceof zzakg) {
                ((zzakg) value2).zzt();
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
