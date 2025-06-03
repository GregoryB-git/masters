package c8;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class v implements OnFailureListener, OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f2527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2528b;

    public /* synthetic */ v(TaskCompletionSource taskCompletionSource, Context context) {
        this.f2527a = taskCompletionSource;
        this.f2528b = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f2527a.setException(exc);
        w.c(this.f2528b);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        this.f2527a.setResult((b8.g) obj);
        w.c(this.f2528b);
    }
}
