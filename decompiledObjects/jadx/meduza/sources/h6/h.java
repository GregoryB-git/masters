package h6;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000authapi.zbc;
import k6.a;

/* loaded from: classes.dex */
public final class h extends m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f7161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GoogleSignInOptions f7162b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k6.e eVar, Context context, GoogleSignInOptions googleSignInOptions) {
        super(eVar);
        this.f7161a = context;
        this.f7162b = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ k6.j createFailedResult(Status status) {
        return new g6.b(null, status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final void doExecute(a.b bVar) {
        q qVar = (q) ((f) bVar).getService();
        g gVar = new g(this);
        GoogleSignInOptions googleSignInOptions = this.f7162b;
        Parcel zba = qVar.zba();
        zbc.zbd(zba, gVar);
        zbc.zbc(zba, googleSignInOptions);
        qVar.zbb(101, zba);
    }
}
