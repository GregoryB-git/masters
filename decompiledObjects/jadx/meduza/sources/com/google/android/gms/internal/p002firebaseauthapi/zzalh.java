package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzalh<K, V> extends LinkedHashMap<K, V> {
    private static final zzalh<?, ?> zza;
    private boolean zzb;

    static {
        zzalh<?, ?> zzalhVar = new zzalh<>();
        zza = zzalhVar;
        ((zzalh) zzalhVar).zzb = false;
    }

    private zzalh() {
        this.zzb = true;
    }

    private zzalh(Map<K, V> map) {
        super(map);
        this.zzb = true;
    }

    private static int zza(Object obj) {
        if (obj instanceof byte[]) {
            return zzaki.zza((byte[]) obj);
        }
        if (obj instanceof zzakl) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static <K, V> zzalh<K, V> zza() {
        return (zzalh<K, V>) zza;
    }

    private final void zze() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zze();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005c A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L5d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L59
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L16
        L14:
            r7 = r1
            goto L5a
        L16:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L35
            goto L14
        L35:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L52
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L52
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L56
        L52:
            boolean r3 = r4.equals(r3)
        L56:
            if (r3 != 0) goto L1e
            goto L14
        L59:
            r7 = r0
        L5a:
            if (r7 == 0) goto L5d
            return r0
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalh.equals(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i10 += zza(entry.getValue()) ^ zza(entry.getKey());
        }
        return i10;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        zze();
        zzaki.zza(k10);
        zzaki.zza(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        zze();
        for (K k10 : map.keySet()) {
            zzaki.zza(k10);
            zzaki.zza(map.get(k10));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        zze();
        return (V) super.remove(obj);
    }

    public final void zza(zzalh<K, V> zzalhVar) {
        zze();
        if (zzalhVar.isEmpty()) {
            return;
        }
        putAll(zzalhVar);
    }

    public final zzalh<K, V> zzb() {
        return isEmpty() ? new zzalh<>() : new zzalh<>(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final boolean zzd() {
        return this.zzb;
    }
}
