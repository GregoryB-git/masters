package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import k6.a;
import k6.d;
import l6.n;
import l6.q;
import m6.j;

/* loaded from: classes.dex */
public final class zzr extends d {
    private static final a.g zza;
    private static final a.AbstractC0130a zzb;
    private static final a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new a("SmsCodeAutofill.API", zznVar, gVar);
    }

    public zzr(Activity activity) {
        super(activity, (a<a.d.c>) zzc, a.d.f9096j, d.a.f9097c);
    }

    public zzr(Context context) {
        super(context, (a<a.d.c>) zzc, a.d.f9096j, d.a.f9097c);
    }

    public final Task<Integer> checkPermissionState() {
        q.a aVar = new q.a();
        aVar.f9716c = new j6.d[]{zzac.zza};
        aVar.f9714a = new n() { // from class: com.google.android.gms.internal.auth-api-phone.zzk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l6.n
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzc(new zzp(zzr.this, (TaskCompletionSource) obj2));
            }
        };
        aVar.f9717d = 1564;
        return doRead(aVar.a());
    }

    public final Task<Boolean> hasOngoingSmsRequest(final String str) {
        j.i(str);
        j.a("The package name cannot be empty.", !str.isEmpty());
        q.a aVar = new q.a();
        aVar.f9716c = new j6.d[]{zzac.zza};
        aVar.f9714a = new n() { // from class: com.google.android.gms.internal.auth-api-phone.zzl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l6.n
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzd(str, new zzq(zzr.this, (TaskCompletionSource) obj2));
            }
        };
        aVar.f9717d = 1565;
        return doRead(aVar.a());
    }

    public final Task<Void> startSmsCodeRetriever() {
        q.a aVar = new q.a();
        aVar.f9716c = new j6.d[]{zzac.zza};
        aVar.f9714a = new n() { // from class: com.google.android.gms.internal.auth-api-phone.zzm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l6.n
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zze(new zzo(zzr.this, (TaskCompletionSource) obj2));
            }
        };
        aVar.f9717d = 1563;
        return doWrite(aVar.a());
    }
}
