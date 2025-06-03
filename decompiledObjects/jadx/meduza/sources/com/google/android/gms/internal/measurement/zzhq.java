package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import x6.b;

/* loaded from: classes.dex */
final class zzhq implements zzhl {
    private static zzhq zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzhq() {
        this.zzb = null;
        this.zzc = null;
    }

    private zzhq(Context context) {
        this.zzb = context;
        zzhs zzhsVar = new zzhs(this, null);
        this.zzc = zzhsVar;
        context.getContentResolver().registerContentObserver(zzgw.zza, true, zzhsVar);
    }

    public static zzhq zza(Context context) {
        zzhq zzhqVar;
        synchronized (zzhq.class) {
            if (zza == null) {
                zza = b.F(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzhq(context) : new zzhq();
            }
            zzhqVar = zza;
        }
        return zzhqVar;
    }

    public static synchronized void zza() {
        Context context;
        synchronized (zzhq.class) {
            zzhq zzhqVar = zza;
            if (zzhqVar != null && (context = zzhqVar.zzb) != null && zzhqVar.zzc != null) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzhl
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final String zza(final String str) {
        Context context = this.zzb;
        if (context != null && !zzhg.zza(context)) {
            try {
                return (String) zzho.zza(new zzhn() { // from class: com.google.android.gms.internal.measurement.zzhp
                    @Override // com.google.android.gms.internal.measurement.zzhn
                    public final Object zza() {
                        String zza2;
                        zza2 = zzgt.zza(zzhq.this.zzb.getContentResolver(), str, null);
                        return zza2;
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e10);
            }
        }
        return null;
    }
}
