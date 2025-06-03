package h6;

import com.google.android.gms.auth.api.signin.internal.zba;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class i extends zba {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f7163a;

    public i(j jVar) {
        this.f7163a = jVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, h6.p
    public final void I1(Status status) {
        this.f7163a.setResult((j) status);
    }
}
