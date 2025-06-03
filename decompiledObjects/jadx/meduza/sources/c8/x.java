package c8;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class x implements OnFailureListener, OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f2537a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2538b;

    public /* synthetic */ x(TaskCompletionSource taskCompletionSource, Context context) {
        this.f2537a = taskCompletionSource;
        this.f2538b = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f2537a.setException(exc);
        w.c(this.f2538b);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        this.f2537a.setResult((b8.g) obj);
        w.c(this.f2538b);
    }
}
