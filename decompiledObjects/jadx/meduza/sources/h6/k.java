package h6;

import com.google.android.gms.auth.api.signin.internal.zba;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class k extends zba {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f7164a;

    public k(l lVar) {
        this.f7164a = lVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, h6.p
    public final void o1(Status status) {
        this.f7164a.setResult((l) status);
    }
}
