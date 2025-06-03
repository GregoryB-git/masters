package com.google.android.gms.internal.auth;

import android.app.Activity;
import android.content.Context;
import b6.b;
import b6.c;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import f6.a;
import k6.d;
import l6.n;
import l6.q;

/* loaded from: classes.dex */
public final class zzbo extends d {
    public zzbo(Activity activity, c cVar) {
        super(activity, b.f1910a, cVar == null ? c.f1911b : cVar, d.a.f9097c);
    }

    public zzbo(Context context, c cVar) {
        super(context, b.f1910a, cVar == null ? c.f1911b : cVar, d.a.f9097c);
    }

    public final Task<String> getSpatulaHeader() {
        q.a aVar = new q.a();
        aVar.f9714a = new n() { // from class: com.google.android.gms.internal.auth.zzbk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l6.n
            public final void accept(Object obj, Object obj2) {
                ((zzbh) ((zzbe) obj).getService()).zzd(new zzbn(zzbo.this, (TaskCompletionSource) obj2));
            }
        };
        aVar.f9717d = 1520;
        return doRead(aVar.a());
    }

    public final Task<f6.b> performProxyRequest(final a aVar) {
        q.a aVar2 = new q.a();
        aVar2.f9714a = new n() { // from class: com.google.android.gms.internal.auth.zzbl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l6.n
            public final void accept(Object obj, Object obj2) {
                zzbo zzboVar = zzbo.this;
                a aVar3 = aVar;
                ((zzbh) ((zzbe) obj).getService()).zze(new zzbm(zzboVar, (TaskCompletionSource) obj2), aVar3);
            }
        };
        aVar2.f9717d = 1518;
        return doWrite(aVar2.a());
    }
}
