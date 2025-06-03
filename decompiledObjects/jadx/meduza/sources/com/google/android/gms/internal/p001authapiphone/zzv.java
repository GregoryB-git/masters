package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import k6.a;
import k6.d;
import l6.n;
import l6.q;

/* loaded from: classes.dex */
public final class zzv extends d {
    private static final a.g zza;
    private static final a.AbstractC0130a zzb;
    private static final a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzt zztVar = new zzt();
        zzb = zztVar;
        zzc = new a("SmsCodeBrowser.API", zztVar, gVar);
    }

    public zzv(Activity activity) {
        super(activity, (a<a.d.c>) zzc, a.d.f9096j, d.a.f9097c);
    }

    public zzv(Context context) {
        super(context, (a<a.d.c>) zzc, a.d.f9096j, d.a.f9097c);
    }

    public final Task<Void> startSmsCodeRetriever() {
        q.a aVar = new q.a();
        aVar.f9716c = new j6.d[]{zzac.zzb};
        aVar.f9714a = new n() { // from class: com.google.android.gms.internal.auth-api-phone.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l6.n
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzf(new zzu(zzv.this, (TaskCompletionSource) obj2));
            }
        };
        aVar.f9717d = 1566;
        return doWrite(aVar.a());
    }
}
