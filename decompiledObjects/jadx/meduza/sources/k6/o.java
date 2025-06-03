package k6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import k6.j;

/* loaded from: classes.dex */
public final class o<R extends j> extends BasePendingResult<R> {

    /* renamed from: a, reason: collision with root package name */
    public final j f9102a;

    public o(Status status) {
        super((e) null);
        this.f9102a = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        return (R) this.f9102a;
    }
}
