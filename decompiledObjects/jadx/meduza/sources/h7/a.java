package h7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import k6.e;

/* loaded from: classes.dex */
public final class a extends com.google.android.gms.common.internal.c<e> implements g7.f {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f7171e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7172a;

    /* renamed from: b, reason: collision with root package name */
    public final m6.a f7173b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f7174c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f7175d;

    public a(Context context, Looper looper, m6.a aVar, Bundle bundle, e.a aVar2, e.b bVar) {
        super(context, looper, 44, aVar, aVar2, bVar);
        this.f7172a = true;
        this.f7173b = aVar;
        this.f7174c = bundle;
        this.f7175d = aVar.f10246h;
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof e ? (e) queryLocalInterface : new e(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f7173b.f10244e)) {
            this.f7174c.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f7173b.f10244e);
        }
        return this.f7174c;
    }

    @Override // com.google.android.gms.common.internal.a, k6.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.a, k6.a.f
    public final boolean requiresSignIn() {
        return this.f7172a;
    }
}
