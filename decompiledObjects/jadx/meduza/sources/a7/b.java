package a7;

import android.app.PendingIntent;
import b.a0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.fido.zzq;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class b extends zzq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f236a;

    public b(TaskCompletionSource taskCompletionSource) {
        this.f236a = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.fido.zzr
    public final void zzb(Status status, PendingIntent pendingIntent) {
        a0.K(status, pendingIntent, this.f236a);
    }
}
