package l6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import k6.g;

/* loaded from: classes.dex */
public final class s implements g.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f9721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f9722b;

    public s(u uVar, com.google.android.gms.common.api.internal.a aVar) {
        this.f9722b = uVar;
        this.f9721a = aVar;
    }

    @Override // k6.g.a
    public final void a(Status status) {
        this.f9722b.f9728a.remove(this.f9721a);
    }
}
