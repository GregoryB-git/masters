package com.google.android.gms.internal.p001authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e6.a;
import j6.d;
import l6.n;
import l6.q;

/* loaded from: classes.dex */
public final class zzab extends a {
    public zzab(Activity activity) {
        super(activity);
    }

    public zzab(Context context) {
        super(context);
    }

    @Override // e6.a
    public final Task<Void> startSmsRetriever() {
        q.a aVar = new q.a();
        aVar.f9714a = new n() { // from class: com.google.android.gms.internal.auth-api-phone.zzx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l6.n
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzg(new zzz(zzab.this, (TaskCompletionSource) obj2));
            }
        };
        aVar.f9716c = new d[]{zzac.zzc};
        aVar.f9717d = 1567;
        return doWrite(aVar.a());
    }

    @Override // e6.a
    public final Task<Void> startSmsUserConsent(final String str) {
        q.a aVar = new q.a();
        aVar.f9714a = new n() { // from class: com.google.android.gms.internal.auth-api-phone.zzy
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l6.n
            public final void accept(Object obj, Object obj2) {
                ((zzh) ((zzw) obj).getService()).zzh(str, new zzaa(zzab.this, (TaskCompletionSource) obj2));
            }
        };
        aVar.f9716c = new d[]{zzac.zzd};
        aVar.f9717d = 1568;
        return doWrite(aVar.a());
    }
}
