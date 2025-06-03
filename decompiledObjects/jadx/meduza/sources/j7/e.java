package j7;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class e extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f8532a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.f8532a = taskCompletionSource;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        this.f8532a.trySetResult(null);
    }
}
