package m6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import k6.g;

/* loaded from: classes.dex */
public final class w implements g.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k6.g f10332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f10333b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f10334c;

    public w(k6.g gVar, TaskCompletionSource taskCompletionSource, i iVar) {
        this.f10332a = gVar;
        this.f10333b = taskCompletionSource;
        this.f10334c = iVar;
    }

    @Override // k6.g.a
    public final void a(Status status) {
        if (!status.D()) {
            this.f10333b.setException(b.a0.r(status));
        } else {
            this.f10333b.setResult(this.f10334c.d(this.f10332a.await(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
