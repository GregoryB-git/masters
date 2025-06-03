package e7;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgr;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.internal.measurement.zzm;
import com.google.android.gms.internal.measurement.zzr;
import com.google.android.gms.internal.measurement.zzx;
import e7.e3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class w1 extends h6 implements j {

    /* renamed from: e, reason: collision with root package name */
    public final r.b f4720e;
    public final r.b f;

    /* renamed from: o, reason: collision with root package name */
    public final r.b f4721o;

    /* renamed from: p, reason: collision with root package name */
    public final r.b f4722p;

    /* renamed from: q, reason: collision with root package name */
    public final r.b f4723q;

    /* renamed from: r, reason: collision with root package name */
    public final r.b f4724r;

    /* renamed from: s, reason: collision with root package name */
    public final b2 f4725s;
    public final d2.q t;

    /* renamed from: u, reason: collision with root package name */
    public final r.b f4726u;

    /* renamed from: v, reason: collision with root package name */
    public final r.b f4727v;

    /* renamed from: w, reason: collision with root package name */
    public final r.b f4728w;

    public w1(i6 i6Var) {
        super(i6Var);
        this.f4720e = new r.b();
        this.f = new r.b();
        this.f4721o = new r.b();
        this.f4722p = new r.b();
        this.f4723q = new r.b();
        this.f4726u = new r.b();
        this.f4727v = new r.b();
        this.f4728w = new r.b();
        this.f4724r = new r.b();
        this.f4725s = new b2(this);
        this.t = new d2.q(this, 3);
    }

    public static e3.a u(zzgc.zza.zze zzeVar) {
        int i10 = c2.f4131b[zzeVar.ordinal()];
        if (i10 == 1) {
            return e3.a.AD_STORAGE;
        }
        if (i10 == 2) {
            return e3.a.ANALYTICS_STORAGE;
        }
        if (i10 == 3) {
            return e3.a.AD_USER_DATA;
        }
        if (i10 != 4) {
            return null;
        }
        return e3.a.AD_PERSONALIZATION;
    }

    public static r.b w(zzgc.zzd zzdVar) {
        r.b bVar = new r.b();
        if (zzdVar != null) {
            for (zzgc.zzh zzhVar : zzdVar.zzn()) {
                bVar.put(zzhVar.zzb(), zzhVar.zzc());
            }
        }
        return bVar;
    }

    public final int A(String str, String str2) {
        Integer num;
        l();
        L(str);
        Map map = (Map) this.f4724r.getOrDefault(str, null);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final zzgc.zza B(String str) {
        l();
        L(str);
        zzgc.zzd C = C(str);
        if (C == null || !C.zzo()) {
            return null;
        }
        return C.zzd();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzgc.zzd C(String str) {
        p();
        l();
        m6.j.e(str);
        L(str);
        return (zzgc.zzd) this.f4723q.getOrDefault(str, null);
    }

    public final boolean D(String str, e3.a aVar) {
        l();
        L(str);
        zzgc.zza B = B(str);
        if (B == null) {
            return false;
        }
        Iterator<zzgc.zza.zzb> it = B.zzd().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzgc.zza.zzb next = it.next();
            if (aVar == u(next.zzc())) {
                if (next.zzb() == zzgc.zza.zzd.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean E(String str, String str2) {
        Boolean bool;
        l();
        L(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f4722p.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean F(String str, String str2) {
        Boolean bool;
        l();
        L(str);
        if ("1".equals(b(str, "measurement.upload.blacklist_internal")) && r6.r0(str2)) {
            return true;
        }
        if ("1".equals(b(str, "measurement.upload.blacklist_public")) && r6.t0(str2)) {
            return true;
        }
        Map map = (Map) this.f4721o.getOrDefault(str, null);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String G(String str) {
        l();
        L(str);
        return (String) this.f4726u.getOrDefault(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean H(String str) {
        zzgc.zzd zzdVar;
        return (TextUtils.isEmpty(str) || (zzdVar = (zzgc.zzd) this.f4723q.getOrDefault(str, null)) == null || zzdVar.zza() == 0) ? false : true;
    }

    public final boolean I(String str) {
        l();
        L(str);
        zzgc.zza B = B(str);
        return B == null || !B.zzh() || B.zzg();
    }

    public final boolean J(String str) {
        l();
        L(str);
        return this.f.getOrDefault(str, null) != 0 && ((Set) this.f.getOrDefault(str, null)).contains("app_instance_id");
    }

    public final boolean K(String str) {
        l();
        L(str);
        if (this.f.getOrDefault(str, null) != 0) {
            return ((Set) this.f.getOrDefault(str, null)).contains("os_version") || ((Set) this.f.getOrDefault(str, null)).contains("device_info");
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
    
        if (r2 == null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.w1.L(java.lang.String):void");
    }

    @Override // e7.j
    public final String b(String str, String str2) {
        l();
        L(str);
        Map map = (Map) this.f4720e.getOrDefault(str, null);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // e7.h6
    public final boolean r() {
        return false;
    }

    public final long s(String str) {
        String b10 = b(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(b10)) {
            return 0L;
        }
        try {
            return Long.parseLong(b10);
        } catch (NumberFormatException e10) {
            zzj().f4063r.d("Unable to parse timezone offset. appId", a1.p(str), e10);
            return 0L;
        }
    }

    public final zzgc.zzd t(String str, byte[] bArr) {
        if (bArr == null) {
            return zzgc.zzd.zzg();
        }
        try {
            zzgc.zzd zzdVar = (zzgc.zzd) ((zzkg) ((zzgc.zzd.zza) o6.z(zzgc.zzd.zze(), bArr)).zzaj());
            zzj().f4067w.d("Parsed config. version, gmp_app_id", zzdVar.zzr() ? Long.valueOf(zzdVar.zzc()) : null, zzdVar.zzp() ? zzdVar.zzi() : null);
            return zzdVar;
        } catch (zzkp | RuntimeException e10) {
            zzj().f4063r.d("Unable to merge remote config. appId", a1.p(str), e10);
            return zzgc.zzd.zzg();
        }
    }

    public final g3 v(String str, e3.a aVar) {
        g3 g3Var = g3.UNINITIALIZED;
        l();
        L(str);
        zzgc.zza B = B(str);
        if (B == null) {
            return g3Var;
        }
        for (zzgc.zza.zzb zzbVar : B.zzf()) {
            if (u(zzbVar.zzc()) == aVar) {
                int i10 = c2.f4132c[zzbVar.zzb().ordinal()];
                return i10 != 1 ? i10 != 2 ? g3Var : g3.GRANTED : g3.DENIED;
            }
        }
        return g3Var;
    }

    public final void x(String str, zzgc.zzd.zza zzaVar) {
        HashSet hashSet = new HashSet();
        r.b bVar = new r.b();
        r.b bVar2 = new r.b();
        r.b bVar3 = new r.b();
        if (zzaVar != null) {
            Iterator<zzgc.zzb> it = zzaVar.zze().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().zzb());
            }
            for (int i10 = 0; i10 < zzaVar.zza(); i10++) {
                zzgc.zzc.zza zzch = zzaVar.zza(i10).zzch();
                if (zzch.zzb().isEmpty()) {
                    zzj().f4063r.b("EventConfig contained null event name");
                } else {
                    String zzb = zzch.zzb();
                    String i11 = va.a.i(zzch.zzb(), b.a0.f1561b, b.a0.f1565d);
                    if (!TextUtils.isEmpty(i11)) {
                        zzch = zzch.zza(i11);
                        zzaVar.zza(i10, zzch);
                    }
                    if (zzch.zze() && zzch.zzc()) {
                        bVar.put(zzb, Boolean.TRUE);
                    }
                    if (zzch.zzf() && zzch.zzd()) {
                        bVar2.put(zzch.zzb(), Boolean.TRUE);
                    }
                    if (zzch.zzg()) {
                        if (zzch.zza() < 2 || zzch.zza() > 65535) {
                            zzj().f4063r.d("Invalid sampling rate. Event name, sample rate", zzch.zzb(), Integer.valueOf(zzch.zza()));
                        } else {
                            bVar3.put(zzch.zzb(), Integer.valueOf(zzch.zza()));
                        }
                    }
                }
            }
        }
        this.f.put(str, hashSet);
        this.f4721o.put(str, bVar);
        this.f4722p.put(str, bVar2);
        this.f4724r.put(str, bVar3);
    }

    public final void y(final String str, zzgc.zzd zzdVar) {
        if (zzdVar.zza() == 0) {
            this.f4725s.remove(str);
            return;
        }
        zzj().f4067w.c("EES programs found", Integer.valueOf(zzdVar.zza()));
        zzgr.zzc zzcVar = zzdVar.zzm().get(0);
        try {
            zzb zzbVar = new zzb();
            zzbVar.zza("internal.remoteConfig", new Callable() { // from class: e7.y1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzm("internal.remoteConfig", new d2(w1.this, str));
                }
            });
            zzbVar.zza("internal.appMetadata", new Callable() { // from class: e7.x1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzx("internal.appMetadata", new z1(str, 0, w1.this));
                }
            });
            zzbVar.zza("internal.logger", new Callable() { // from class: e7.a2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzr(w1.this.t);
                }
            });
            zzbVar.zza(zzcVar);
            this.f4725s.put(str, zzbVar);
            zzj().f4067w.d("EES program loaded for appId, activities", str, Integer.valueOf(zzcVar.zza().zza()));
            Iterator<zzgr.zzb> it = zzcVar.zza().zzd().iterator();
            while (it.hasNext()) {
                zzj().f4067w.c("EES program activity", it.next().zzb());
            }
        } catch (zzc unused) {
            zzj().f4060o.c("Failed to load EES program. appId", str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0223, code lost:
    
        r4.d(r6, e7.a1.p(r21), java.lang.Integer.valueOf(r5));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean z(java.lang.String r21, java.lang.String r22, java.lang.String r23, byte[] r24) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.w1.z(java.lang.String, java.lang.String, java.lang.String, byte[]):boolean");
    }
}
