package com.google.android.gms.internal.measurement;

import java.util.Map;

/* loaded from: classes.dex */
final class zzkt<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzkq> zza;

    private zzkt(Map.Entry<K, zzkq> entry) {
        this.zza = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.zza.getValue() == null) {
            return null;
        }
        throw new NoSuchMethodError();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzlm) {
            return this.zza.getValue().zza((zzlm) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzkq zza() {
        return this.zza.getValue();
    }
}
