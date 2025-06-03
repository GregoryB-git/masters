package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzht;
import defpackage.g;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import n7.a;
import n7.e;
import n7.h;
import n7.q;
import n7.r;
import n7.s;
import x6.b;

/* loaded from: classes.dex */
public abstract class zzhx<T> {
    private static final Object zza = new Object();
    private static volatile zzie zzb = null;
    private static volatile boolean zzc = false;
    private static zzii zzd;
    private static final AtomicInteger zze;
    private final zzif zzf;
    private final String zzg;
    private Object zzh;
    private volatile int zzi;
    private volatile T zzj;
    private final boolean zzk;
    private volatile boolean zzl;

    static {
        new AtomicReference();
        zzd = new zzii(new zzil() { // from class: com.google.android.gms.internal.measurement.zzhy
            @Override // com.google.android.gms.internal.measurement.zzil
            public final boolean zza() {
                return zzhx.zzd();
            }
        });
        zze = new AtomicInteger();
    }

    private zzhx(zzif zzifVar, String str, T t, boolean z10) {
        this.zzi = -1;
        String str2 = zzifVar.zza;
        if (str2 == null && zzifVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && zzifVar.zzb != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzf = zzifVar;
        this.zzg = str;
        this.zzh = t;
        this.zzk = z10;
        this.zzl = false;
    }

    public static /* synthetic */ zzhx zza(zzif zzifVar, String str, Boolean bool, boolean z10) {
        return new zzia(zzifVar, str, bool, true);
    }

    public static /* synthetic */ zzhx zza(zzif zzifVar, String str, Double d10, boolean z10) {
        return new zzid(zzifVar, str, d10, true);
    }

    public static /* synthetic */ zzhx zza(zzif zzifVar, String str, Long l10, boolean z10) {
        return new zzib(zzifVar, str, l10, true);
    }

    public static /* synthetic */ zzhx zza(zzif zzifVar, String str, String str2, boolean z10) {
        return new zzic(zzifVar, str, str2, true);
    }

    private final T zza(zzie zzieVar) {
        e<Context, Boolean> eVar;
        zzif zzifVar = this.zzf;
        if (!zzifVar.zze && ((eVar = zzifVar.zzh) == null || eVar.apply(zzieVar.zza()).booleanValue())) {
            zzhq zza2 = zzhq.zza(zzieVar.zza());
            zzif zzifVar2 = this.zzf;
            Object zza3 = zza2.zza(zzifVar2.zze ? null : zza(zzifVar2.zzc));
            if (zza3 != null) {
                return zza(zza3);
            }
        }
        return null;
    }

    private final T zzb(zzie zzieVar) {
        Object zza2;
        zzhl zza3 = this.zzf.zzb != null ? zzhv.zza(zzieVar.zza(), this.zzf.zzb) ? this.zzf.zzg ? zzhi.zza(zzieVar.zza().getContentResolver(), zzhu.zza(zzhu.zza(zzieVar.zza(), this.zzf.zzb.getLastPathSegment())), new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhw
            @Override // java.lang.Runnable
            public final void run() {
                zzhx.zzc();
            }
        }) : zzhi.zza(zzieVar.zza().getContentResolver(), this.zzf.zzb, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhw
            @Override // java.lang.Runnable
            public final void run() {
                zzhx.zzc();
            }
        }) : null : zzig.zza(zzieVar.zza(), this.zzf.zza, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhw
            @Override // java.lang.Runnable
            public final void run() {
                zzhx.zzc();
            }
        });
        if (zza3 == null || (zza2 = zza3.zza(zzb())) == null) {
            return null;
        }
        return zza(zza2);
    }

    public static void zzb(final Context context) {
        if (zzb != null || context == null) {
            return;
        }
        Object obj = zza;
        synchronized (obj) {
            if (zzb == null) {
                synchronized (obj) {
                    zzie zzieVar = zzb;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (zzieVar == null || zzieVar.zza() != context) {
                        if (zzieVar != null) {
                            zzhi.zzb();
                            zzig.zza();
                            zzhq.zza();
                        }
                        q qVar = new q() { // from class: com.google.android.gms.internal.measurement.zzhz
                            @Override // n7.q
                            public final Object get() {
                                h zza2;
                                zza2 = zzht.zza.zza(context);
                                return zza2;
                            }
                        };
                        if (!(qVar instanceof s) && !(qVar instanceof r)) {
                            qVar = qVar instanceof Serializable ? new r(qVar) : new s(qVar);
                        }
                        zzb = new zzhf(context, qVar);
                        zze.incrementAndGet();
                    }
                }
            }
        }
    }

    public static void zzc() {
        zze.incrementAndGet();
    }

    public static /* synthetic */ boolean zzd() {
        return true;
    }

    private final T zze() {
        return (T) this.zzh;
    }

    public final T zza() {
        T zzb2;
        if (!this.zzk) {
            b.I(zzd.zza(this.zzg), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i10 = zze.get();
        if (this.zzi < i10) {
            synchronized (this) {
                if (this.zzi < i10) {
                    zzie zzieVar = zzb;
                    h<zzhr> hVar = a.f11274a;
                    String str = null;
                    if (zzieVar != null) {
                        hVar = zzieVar.zzb().get();
                        if (hVar.b()) {
                            zzhr a10 = hVar.a();
                            zzif zzifVar = this.zzf;
                            str = a10.zza(zzifVar.zzb, zzifVar.zza, zzifVar.zzd, this.zzg);
                        }
                    }
                    b.I(zzieVar != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                    if (!this.zzf.zzf ? (zzb2 = zzb(zzieVar)) == null && (zzb2 = zza(zzieVar)) == null : (zzb2 = zza(zzieVar)) == null && (zzb2 = zzb(zzieVar)) == null) {
                        zzb2 = zze();
                    }
                    if (hVar.b()) {
                        zzb2 = str == null ? zze() : zza((Object) str);
                    }
                    this.zzj = zzb2;
                    this.zzi = i10;
                }
            }
        }
        return this.zzj;
    }

    public abstract T zza(Object obj);

    public final String zzb() {
        return zza(this.zzf.zzd);
    }

    private final String zza(String str) {
        return (str == null || !str.isEmpty()) ? g.d(str, this.zzg) : this.zzg;
    }
}
