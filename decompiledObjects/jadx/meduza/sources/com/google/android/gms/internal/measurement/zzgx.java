package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzgx implements zzgy {
    private final AtomicBoolean zza = new AtomicBoolean();
    private HashMap<String, String> zzb = null;
    private final HashMap<String, Boolean> zzc = new HashMap<>(16, 1.0f);
    private final HashMap<String, Integer> zzd = new HashMap<>(16, 1.0f);
    private final HashMap<String, Long> zze = new HashMap<>(16, 1.0f);
    private final HashMap<String, Float> zzf = new HashMap<>(16, 1.0f);
    private Object zzg = null;
    private boolean zzh = false;
    private String[] zzi = new String[0];
    private final zzhe zzj = new zzhc();

    @Override // com.google.android.gms.internal.measurement.zzgy
    public final String zza(ContentResolver contentResolver, String str, String str2) {
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (this) {
            if (this.zzb == null) {
                this.zza.set(false);
                this.zzb = new HashMap<>(16, 1.0f);
                this.zzg = new Object();
                contentResolver.registerContentObserver(zzgw.zza, true, new zzgz(this, null));
            } else if (this.zza.getAndSet(false)) {
                this.zzb.clear();
                this.zzc.clear();
                this.zzd.clear();
                this.zze.clear();
                this.zzf.clear();
                this.zzg = new Object();
                this.zzh = false;
            }
            Object obj = this.zzg;
            if (this.zzb.containsKey(str)) {
                String str3 = this.zzb.get(str);
                return str3 != null ? str3 : null;
            }
            for (String str4 : this.zzi) {
                if (str.startsWith(str4)) {
                    if (!this.zzh) {
                        try {
                            HashMap<String, String> hashMap = (HashMap) this.zzj.zza(contentResolver, this.zzi, new zzhb() { // from class: com.google.android.gms.internal.measurement.zzha
                                @Override // com.google.android.gms.internal.measurement.zzhb
                                public final Map zza(int i10) {
                                    return new HashMap(i10, 1.0f);
                                }
                            });
                            if (!hashMap.isEmpty()) {
                                Set<String> keySet = hashMap.keySet();
                                keySet.removeAll(this.zzc.keySet());
                                keySet.removeAll(this.zzd.keySet());
                                keySet.removeAll(this.zze.keySet());
                                keySet.removeAll(this.zzf.keySet());
                            }
                            if (!hashMap.isEmpty()) {
                                if (this.zzb.isEmpty()) {
                                    this.zzb = hashMap;
                                } else {
                                    this.zzb.putAll(hashMap);
                                }
                            }
                            this.zzh = true;
                        } catch (zzhd unused) {
                        }
                        if (this.zzb.containsKey(str)) {
                            String str5 = this.zzb.get(str);
                            return str5 != null ? str5 : null;
                        }
                    }
                    return null;
                }
            }
            try {
                String zza = this.zzj.zza(contentResolver, str);
                if (zza != null && zza.equals(null)) {
                    zza = null;
                }
                synchronized (this) {
                    if (obj == this.zzg) {
                        this.zzb.put(str, zza);
                    }
                }
                if (zza != null) {
                    return zza;
                }
                return null;
            } catch (zzhd unused2) {
                return null;
            }
        }
    }
}
