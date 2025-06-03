package m6;

import android.app.PendingIntent;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class a0 extends k0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f10251d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f10252e;
    public final /* synthetic */ com.google.android.gms.common.internal.a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.google.android.gms.common.internal.a aVar, int i10, Bundle bundle) {
        super(aVar, Boolean.TRUE);
        this.f = aVar;
        this.f10251d = i10;
        this.f10252e = bundle;
    }

    @Override // m6.k0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.f10251d != 0) {
            this.f.zzp(1, null);
            Bundle bundle = this.f10252e;
            c(new j6.b(this.f10251d, bundle != null ? (PendingIntent) bundle.getParcelable(com.google.android.gms.common.internal.a.KEY_PENDING_INTENT) : null));
        } else {
            if (d()) {
                return;
            }
            this.f.zzp(1, null);
            c(new j6.b(8, null));
        }
    }

    @Override // m6.k0
    public final void b() {
    }

    public abstract void c(j6.b bVar);

    public abstract boolean d();
}
