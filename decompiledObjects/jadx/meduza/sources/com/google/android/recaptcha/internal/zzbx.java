package com.google.android.recaptcha.internal;

import b.z;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import nc.j0;
import nc.r;
import nc.s;

/* loaded from: classes.dex */
public final class zzbx {
    public static final j0 zza(Task task) {
        final s b10 = z.b();
        task.addOnCompleteListener(zzbv.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                r rVar = r.this;
                Exception exception = task2.getException();
                if (exception != null) {
                    rVar.h0(exception);
                } else if (task2.isCanceled()) {
                    rVar.cancel((CancellationException) null);
                } else {
                    rVar.i0(task2.getResult());
                }
            }
        });
        return new zzbw(b10);
    }
}
