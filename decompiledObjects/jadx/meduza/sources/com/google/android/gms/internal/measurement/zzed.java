package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import b.z;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import d7.a;
import e7.f2;
import e7.h3;
import e7.j3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import m6.j;
import v6.b;

/* loaded from: classes.dex */
public class zzed {
    private static volatile zzed zzb;
    public final b zza;
    private final String zzc;
    private final ExecutorService zzd;
    private final a zze;
    private final List<Pair<j3, zzd>> zzf;
    private int zzg;
    private boolean zzh;
    private String zzi;
    private volatile zzdl zzj;

    public static class zza extends zzdv {
        private final h3 zza;

        public zza(h3 h3Var) {
            this.zza = h3Var;
        }

        @Override // com.google.android.gms.internal.measurement.zzdw
        public final int zza() {
            return System.identityHashCode(this.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzdw
        public final void zza(String str, String str2, Bundle bundle, long j10) {
            ((AppMeasurementDynamiteService.a) this.zza).a(str, str2, bundle, j10);
        }
    }

    public abstract class zzb implements Runnable {
        public final long zza;
        public final long zzb;
        private final boolean zzc;

        public zzb(zzed zzedVar) {
            this(true);
        }

        public zzb(boolean z10) {
            ((z) zzed.this.zza).getClass();
            this.zza = System.currentTimeMillis();
            ((z) zzed.this.zza).getClass();
            this.zzb = SystemClock.elapsedRealtime();
            this.zzc = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (zzed.this.zzh) {
                zzb();
                return;
            }
            try {
                zza();
            } catch (Exception e10) {
                zzed.this.zza(e10, false, this.zzc);
                zzb();
            }
        }

        public abstract void zza();

        public void zzb() {
        }
    }

    public class zzc implements Application.ActivityLifecycleCallbacks {
        public zzc() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            zzed.this.zza((zzb) new zzfq(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            zzed.this.zza((zzb) new zzfv(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            zzed.this.zza((zzb) new zzfr(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            zzed.this.zza((zzb) new zzfs(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            zzdm zzdmVar = new zzdm();
            zzed.this.zza((zzb) new zzft(this, activity, zzdmVar));
            Bundle zza = zzdmVar.zza(50L);
            if (zza != null) {
                bundle.putAll(zza);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            zzed.this.zza((zzb) new zzfp(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            zzed.this.zza((zzb) new zzfu(this, activity));
        }
    }

    public static class zzd extends zzdv {
        private final j3 zza;

        public zzd(j3 j3Var) {
            this.zza = j3Var;
        }

        @Override // com.google.android.gms.internal.measurement.zzdw
        public final int zza() {
            return System.identityHashCode(this.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzdw
        public final void zza(String str, String str2, Bundle bundle, long j10) {
            this.zza.a(str, str2, bundle, j10);
        }
    }

    private zzed(Context context, String str, String str2, String str3, Bundle bundle) {
        this.zzc = (str == null || !zzc(str2, str3)) ? "FA" : str;
        this.zza = z.f1662p;
        this.zzd = zzde.zza().zza(new zzep(this), 1);
        this.zze = new a(this);
        this.zzf = new ArrayList();
        if (!(!zzb(context) || zzk())) {
            this.zzi = null;
            this.zzh = true;
            Log.w(this.zzc, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (zzc(str2, str3)) {
            this.zzi = str2;
        } else {
            this.zzi = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.zzc, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.zzc, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            }
        }
        zza((zzb) new zzeg(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.zzc, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new zzc());
        }
    }

    public static zzed zza(Context context) {
        return zza(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    public static zzed zza(Context context, String str, String str2, String str3, Bundle bundle) {
        j.i(context);
        if (zzb == null) {
            synchronized (zzed.class) {
                if (zzb == null) {
                    zzb = new zzed(context, str, str2, str3, bundle);
                }
            }
        }
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzb zzbVar) {
        this.zzd.execute(zzbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(Exception exc, boolean z10, boolean z11) {
        this.zzh |= z10;
        if (z10) {
            Log.w(this.zzc, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            zza(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        Log.w(this.zzc, "Error with data collection. Data lost.", exc);
    }

    private final void zza(String str, String str2, Bundle bundle, boolean z10, boolean z11, Long l10) {
        zza((zzb) new zzfn(this, l10, str, str2, bundle, z10, z11));
    }

    private static boolean zzb(Context context) {
        String str;
        try {
            String a10 = f2.a(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(a10)) {
                a10 = f2.a(context);
            }
            int identifier = resources.getIdentifier("google_app_id", "string", a10);
            str = null;
            if (identifier != 0) {
                try {
                    str = resources.getString(identifier);
                } catch (Resources.NotFoundException unused) {
                }
            }
        } catch (IllegalStateException unused2) {
        }
        return str != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzc(String str, String str2) {
        return (str2 == null || str == null || zzk()) ? false : true;
    }

    private final boolean zzk() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final int zza(String str) {
        zzdm zzdmVar = new zzdm();
        zza((zzb) new zzfg(this, str, zzdmVar));
        Integer num = (Integer) zzdm.zza(zzdmVar.zza(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long zza() {
        zzdm zzdmVar = new zzdm();
        zza((zzb) new zzex(this, zzdmVar));
        Long zzb2 = zzdmVar.zzb(500L);
        if (zzb2 != null) {
            return zzb2.longValue();
        }
        long nanoTime = System.nanoTime();
        ((z) this.zza).getClass();
        long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
        int i10 = this.zzg + 1;
        this.zzg = i10;
        return nextLong + i10;
    }

    public final Bundle zza(Bundle bundle, boolean z10) {
        zzdm zzdmVar = new zzdm();
        zza((zzb) new zzfd(this, bundle, zzdmVar));
        if (z10) {
            return zzdmVar.zza(5000L);
        }
        return null;
    }

    public final zzdl zza(Context context, boolean z10) {
        try {
            return zzdo.asInterface(DynamiteModule.c(context, DynamiteModule.f2861b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e10) {
            zza((Exception) e10, true, false);
            return null;
        }
    }

    public final Object zza(int i10) {
        zzdm zzdmVar = new zzdm();
        zza((zzb) new zzfh(this, zzdmVar, i10));
        return zzdm.zza(zzdmVar.zza(15000L), Object.class);
    }

    public final List<Bundle> zza(String str, String str2) {
        zzdm zzdmVar = new zzdm();
        zza((zzb) new zzek(this, str, str2, zzdmVar));
        List<Bundle> list = (List) zzdm.zza(zzdmVar.zza(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map<String, Object> zza(String str, String str2, boolean z10) {
        zzdm zzdmVar = new zzdm();
        zza((zzb) new zzfc(this, str, str2, z10, zzdmVar));
        Bundle zza2 = zzdmVar.zza(5000L);
        if (zza2 == null || zza2.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(zza2.size());
        for (String str3 : zza2.keySet()) {
            Object obj = zza2.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void zza(int i10, String str, Object obj, Object obj2, Object obj3) {
        zza((zzb) new zzfe(this, false, 5, str, obj, null, null));
    }

    public final void zza(long j10) {
        zza((zzb) new zzes(this, j10));
    }

    public final void zza(Activity activity, String str, String str2) {
        zza((zzb) new zzem(this, zzeb.zza(activity), str, str2));
    }

    public final void zza(Intent intent) {
        zza((zzb) new zzfm(this, intent));
    }

    public final void zza(Bundle bundle) {
        zza((zzb) new zzei(this, bundle));
    }

    public final void zza(h3 h3Var) {
        zza zzaVar = new zza(h3Var);
        if (this.zzj != null) {
            try {
                this.zzj.setEventInterceptor(zzaVar);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w(this.zzc, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        zza((zzb) new zzfb(this, zzaVar));
    }

    public final void zza(j3 j3Var) {
        j.i(j3Var);
        synchronized (this.zzf) {
            for (int i10 = 0; i10 < this.zzf.size(); i10++) {
                if (j3Var.equals(this.zzf.get(i10).first)) {
                    Log.w(this.zzc, "OnEventListener already registered.");
                    return;
                }
            }
            zzd zzdVar = new zzd(j3Var);
            this.zzf.add(new Pair<>(j3Var, zzdVar));
            if (this.zzj != null) {
                try {
                    this.zzj.registerOnMeasurementEventListener(zzdVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.zzc, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zza((zzb) new zzfl(this, zzdVar));
        }
    }

    public final void zza(Boolean bool) {
        zza((zzb) new zzel(this, bool));
    }

    public final void zza(Runnable runnable) {
        zza((zzb) new zzet(this, runnable));
    }

    public final void zza(String str, Bundle bundle) {
        zza(null, str, bundle, false, true, null);
    }

    public final void zza(String str, String str2, Bundle bundle) {
        zza((zzb) new zzeh(this, str, str2, bundle));
    }

    public final void zza(String str, String str2, Bundle bundle, long j10) {
        zza(str, str2, bundle, true, false, Long.valueOf(j10));
    }

    public final void zza(String str, String str2, Object obj, boolean z10) {
        zza((zzb) new zzef(this, str, str2, obj, z10));
    }

    public final void zza(boolean z10) {
        zza((zzb) new zzfk(this, z10));
    }

    public final a zzb() {
        return this.zze;
    }

    public final void zzb(Bundle bundle) {
        zza((zzb) new zzeo(this, bundle));
    }

    public final void zzb(j3 j3Var) {
        Pair<j3, zzd> pair;
        j.i(j3Var);
        synchronized (this.zzf) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.zzf.size()) {
                    pair = null;
                    break;
                } else {
                    if (j3Var.equals(this.zzf.get(i10).first)) {
                        pair = this.zzf.get(i10);
                        break;
                    }
                    i10++;
                }
            }
            if (pair == null) {
                Log.w(this.zzc, "OnEventListener had not been registered.");
                return;
            }
            this.zzf.remove(pair);
            zzd zzdVar = (zzd) pair.second;
            if (this.zzj != null) {
                try {
                    this.zzj.unregisterOnMeasurementEventListener(zzdVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.zzc, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zza((zzb) new zzfo(this, zzdVar));
        }
    }

    public final void zzb(String str) {
        zza((zzb) new zzer(this, str));
    }

    public final void zzb(String str, String str2) {
        zza((String) null, str, (Object) str2, false);
    }

    public final void zzb(String str, String str2, Bundle bundle) {
        zza(str, str2, bundle, true, true, null);
    }

    public final Long zzc() {
        zzdm zzdmVar = new zzdm();
        zza((zzb) new zzfi(this, zzdmVar));
        return zzdmVar.zzb(120000L);
    }

    public final void zzc(Bundle bundle) {
        zza((zzb) new zzen(this, bundle));
    }

    public final void zzc(String str) {
        zza((zzb) new zzeu(this, str));
    }

    public final String zzd() {
        return this.zzi;
    }

    public final void zzd(Bundle bundle) {
        zza((zzb) new zzfj(this, bundle));
    }

    public final void zzd(String str) {
        zza((zzb) new zzej(this, str));
    }

    public final String zze() {
        zzdm zzdmVar = new zzdm();
        zza((zzb) new zzff(this, zzdmVar));
        return zzdmVar.zzc(120000L);
    }

    public final String zzf() {
        zzdm zzdmVar = new zzdm();
        zza((zzb) new zzey(this, zzdmVar));
        return zzdmVar.zzc(50L);
    }

    public final String zzg() {
        zzdm zzdmVar = new zzdm();
        zza((zzb) new zzez(this, zzdmVar));
        return zzdmVar.zzc(500L);
    }

    public final String zzh() {
        zzdm zzdmVar = new zzdm();
        zza((zzb) new zzfa(this, zzdmVar));
        return zzdmVar.zzc(500L);
    }

    public final String zzi() {
        zzdm zzdmVar = new zzdm();
        zza((zzb) new zzev(this, zzdmVar));
        return zzdmVar.zzc(500L);
    }

    public final void zzj() {
        zza((zzb) new zzeq(this));
    }
}
