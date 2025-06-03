package com.google.android.recaptcha.internal;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzmt {
    private static final zzmt zzb = new zzmt(true);
    public final zzpe zza = new zzoz();
    private boolean zzc;
    private boolean zzd;

    private zzmt() {
    }

    private zzmt(boolean z10) {
        zzg();
        zzg();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zza(zzms zzmsVar, Object obj) {
        long longValue;
        int intValue;
        int zza;
        int intValue2;
        zzpw zzd = zzmsVar.zzd();
        int zza2 = zzmsVar.zza();
        zzmsVar.zzg();
        int zzA = zzln.zzA(zza2 << 3);
        if (zzd == zzpw.zzj) {
            zzoi zzoiVar = (zzoi) obj;
            Charset charset = zznl.zza;
            if (zzoiVar instanceof zzkp) {
                throw null;
            }
            zzA += zzA;
        }
        zzpx zzpxVar = zzpx.INT;
        int i10 = 4;
        switch (zzd.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                i10 = 8;
                return zzA + i10;
            case 1:
                ((Float) obj).floatValue();
                return zzA + i10;
            case 2:
            case 3:
                longValue = ((Long) obj).longValue();
                i10 = zzln.zzB(longValue);
                return zzA + i10;
            case 4:
                intValue = ((Integer) obj).intValue();
                longValue = intValue;
                i10 = zzln.zzB(longValue);
                return zzA + i10;
            case 5:
            case 15:
                ((Long) obj).longValue();
                i10 = 8;
                return zzA + i10;
            case 6:
            case 14:
                ((Integer) obj).intValue();
                return zzA + i10;
            case 7:
                ((Boolean) obj).booleanValue();
                i10 = 1;
                return zzA + i10;
            case 8:
                if (!(obj instanceof zzle)) {
                    i10 = zzln.zzz((String) obj);
                    return zzA + i10;
                }
                zza = ((zzle) obj).zzd();
                i10 = zzln.zzA(zza) + zza;
                return zzA + i10;
            case 9:
                i10 = ((zzoi) obj).zzo();
                return zzA + i10;
            case 10:
                if (!(obj instanceof zzns)) {
                    i10 = zzln.zzx((zzoi) obj);
                    return zzA + i10;
                }
                zza = ((zzns) obj).zza();
                i10 = zzln.zzA(zza) + zza;
                return zzA + i10;
            case 11:
                if (!(obj instanceof zzle)) {
                    zza = ((byte[]) obj).length;
                    i10 = zzln.zzA(zza) + zza;
                    return zzA + i10;
                }
                zza = ((zzle) obj).zzd();
                i10 = zzln.zzA(zza) + zza;
                return zzA + i10;
            case 12:
                intValue2 = ((Integer) obj).intValue();
                i10 = zzln.zzA(intValue2);
                return zzA + i10;
            case 13:
                if (obj instanceof zznf) {
                    intValue = ((zznf) obj).zza();
                    longValue = intValue;
                    i10 = zzln.zzB(longValue);
                    return zzA + i10;
                }
                intValue = ((Integer) obj).intValue();
                longValue = intValue;
                i10 = zzln.zzB(longValue);
                return zzA + i10;
            case 16:
                int intValue3 = ((Integer) obj).intValue();
                intValue2 = (intValue3 >> 31) ^ (intValue3 + intValue3);
                i10 = zzln.zzA(intValue2);
                return zzA + i10;
            case 17:
                long longValue2 = ((Long) obj).longValue();
                longValue = (longValue2 >> 63) ^ (longValue2 + longValue2);
                i10 = zzln.zzB(longValue);
                return zzA + i10;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static zzmt zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzon) {
            return ((zzon) obj).zzd();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzm(Map.Entry entry) {
        zzms zzmsVar = (zzms) entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof zzns;
        zzmsVar.zzg();
        if (zzmsVar.zze() != zzpx.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zzmsVar, zzl(value));
            return;
        }
        Object zze = zze(zzmsVar);
        if (zze == null) {
            this.zza.put(zzmsVar, zzl(value));
            if (z10) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z10) {
            throw null;
        }
        this.zza.put(zzmsVar, zze instanceof zzon ? zzmsVar.zzc((zzon) zze, (zzon) value) : zzmsVar.zzb(((zzoi) zze).zzae(), (zzoi) value).zzk());
    }

    private static boolean zzn(Map.Entry entry) {
        zzms zzmsVar = (zzms) entry.getKey();
        if (zzmsVar.zze() != zzpx.MESSAGE) {
            return true;
        }
        zzmsVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzoj) {
            return ((zzoj) value).zzp();
        }
        if (value instanceof zzns) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        zzms zzmsVar = (zzms) entry.getKey();
        Object value = entry.getValue();
        if (zzmsVar.zze() != zzpx.MESSAGE) {
            return zza(zzmsVar, value);
        }
        zzmsVar.zzg();
        zzmsVar.zzf();
        boolean z10 = value instanceof zzns;
        int zza = ((zzms) entry.getKey()).zza();
        if (!z10) {
            int zzA = zzln.zzA(8);
            int zzA2 = zzln.zzA(zza) + zzln.zzA(16);
            return zzA + zzA + zzA2 + zzln.zzx((zzoi) value) + zzln.zzA(24);
        }
        int zzA3 = zzln.zzA(8);
        int zzA4 = zzln.zzA(zza) + zzln.zzA(16);
        int zzA5 = zzln.zzA(24);
        int zza2 = ((zzns) value).zza();
        return zzA3 + zzA3 + zzA4 + zzln.zzA(zza2) + zza2 + zzA5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmt) {
            return this.zza.equals(((zzmt) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int zzc = this.zza.zzc();
        int i10 = 0;
        for (int i11 = 0; i11 < zzc; i11++) {
            i10 += zzo(this.zza.zzg(i11));
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            i10 += zzo((Map.Entry) it.next());
        }
        return i10;
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzmt clone() {
        zzmt zzmtVar = new zzmt();
        int zzc = this.zza.zzc();
        for (int i10 = 0; i10 < zzc; i10++) {
            Map.Entry zzg = this.zza.zzg(i10);
            zzmtVar.zzi((zzms) ((zzpa) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzmtVar.zzi((zzms) entry.getKey(), entry.getValue());
        }
        zzmtVar.zzd = this.zzd;
        return zzmtVar;
    }

    public final Object zze(zzms zzmsVar) {
        Object obj = this.zza.get(zzmsVar);
        if (!(obj instanceof zzns)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzf() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zznq(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        int zzc = this.zza.zzc();
        for (int i10 = 0; i10 < zzc; i10++) {
            Object value = this.zza.zzg(i10).getValue();
            if (value instanceof zznd) {
                ((zznd) value).zzG();
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zznd) {
                ((zznd) value2).zzG();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzmt zzmtVar) {
        int zzc = zzmtVar.zza.zzc();
        for (int i10 = 0; i10 < zzc; i10++) {
            zzm(zzmtVar.zza.zzg(i10));
        }
        Iterator it = zzmtVar.zza.zzd().iterator();
        while (it.hasNext()) {
            zzm((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if ((r7 instanceof com.google.android.recaptcha.internal.zznf) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if ((r7 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if ((r7 instanceof com.google.android.recaptcha.internal.zzns) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(com.google.android.recaptcha.internal.zzms r6, java.lang.Object r7) {
        /*
            r5 = this;
            r6.zzg()
            com.google.android.recaptcha.internal.zzpw r0 = r6.zzd()
            java.nio.charset.Charset r1 = com.google.android.recaptcha.internal.zznl.zza
            r7.getClass()
            com.google.android.recaptcha.internal.zzpw r1 = com.google.android.recaptcha.internal.zzpw.zza
            com.google.android.recaptcha.internal.zzpx r1 = com.google.android.recaptcha.internal.zzpx.INT
            com.google.android.recaptcha.internal.zzpx r0 = r0.zza()
            int r0 = r0.ordinal()
            r1 = 1
            switch(r0) {
                case 0: goto L47;
                case 1: goto L44;
                case 2: goto L41;
                case 3: goto L3e;
                case 4: goto L3b;
                case 5: goto L38;
                case 6: goto L2f;
                case 7: goto L26;
                case 8: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L57
        L1d:
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzoi
            if (r0 != 0) goto L4b
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzns
            if (r0 == 0) goto L57
            goto L4b
        L26:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 != 0) goto L4b
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zznf
            if (r0 == 0) goto L57
            goto L4b
        L2f:
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzle
            if (r0 != 0) goto L4b
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L57
            goto L4b
        L38:
            boolean r0 = r7 instanceof java.lang.String
            goto L49
        L3b:
            boolean r0 = r7 instanceof java.lang.Boolean
            goto L49
        L3e:
            boolean r0 = r7 instanceof java.lang.Double
            goto L49
        L41:
            boolean r0 = r7 instanceof java.lang.Float
            goto L49
        L44:
            boolean r0 = r7 instanceof java.lang.Long
            goto L49
        L47:
            boolean r0 = r7 instanceof java.lang.Integer
        L49:
            if (r0 == 0) goto L57
        L4b:
            boolean r0 = r7 instanceof com.google.android.recaptcha.internal.zzns
            if (r0 == 0) goto L51
            r5.zzd = r1
        L51:
            com.google.android.recaptcha.internal.zzpe r0 = r5.zza
            r0.put(r6, r7)
            return
        L57:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            int r4 = r6.zza()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            com.google.android.recaptcha.internal.zzpw r6 = r6.zzd()
            com.google.android.recaptcha.internal.zzpx r6 = r6.zza()
            r2[r1] = r6
            r6 = 2
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            r2[r6] = r7
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r2)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzmt.zzi(com.google.android.recaptcha.internal.zzms, java.lang.Object):void");
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        int zzc = this.zza.zzc();
        for (int i10 = 0; i10 < zzc; i10++) {
            if (!zzn(this.zza.zzg(i10))) {
                return false;
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            if (!zzn((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }
}
