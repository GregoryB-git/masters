package e7;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdz;

/* loaded from: classes.dex */
public final class i3 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4317a;

    /* renamed from: b, reason: collision with root package name */
    public String f4318b;

    /* renamed from: c, reason: collision with root package name */
    public String f4319c;

    /* renamed from: d, reason: collision with root package name */
    public String f4320d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f4321e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public zzdz f4322g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4323h;

    /* renamed from: i, reason: collision with root package name */
    public Long f4324i;

    /* renamed from: j, reason: collision with root package name */
    public String f4325j;

    public i3(Context context, zzdz zzdzVar, Long l10) {
        this.f4323h = true;
        m6.j.i(context);
        Context applicationContext = context.getApplicationContext();
        m6.j.i(applicationContext);
        this.f4317a = applicationContext;
        this.f4324i = l10;
        if (zzdzVar != null) {
            this.f4322g = zzdzVar;
            this.f4318b = zzdzVar.zzf;
            this.f4319c = zzdzVar.zze;
            this.f4320d = zzdzVar.zzd;
            this.f4323h = zzdzVar.zzc;
            this.f = zzdzVar.zzb;
            this.f4325j = zzdzVar.zzh;
            Bundle bundle = zzdzVar.zzg;
            if (bundle != null) {
                this.f4321e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
