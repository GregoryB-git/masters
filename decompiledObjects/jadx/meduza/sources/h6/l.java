package h6;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000authapi.zbc;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import k6.a;

/* loaded from: classes.dex */
public final class l extends m {
    public l(k6.e eVar) {
        super(eVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ k6.j createFailedResult(Status status) {
        return status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.a
    public final void doExecute(a.b bVar) {
        f fVar = (f) bVar;
        q qVar = (q) fVar.getService();
        k kVar = new k(this);
        GoogleSignInOptions googleSignInOptions = fVar.f7159a;
        Parcel zba = qVar.zba();
        zbc.zbd(zba, kVar);
        zbc.zbc(zba, googleSignInOptions);
        qVar.zbb(R.styleable.AppCompatTheme_textAppearanceListItem, zba);
    }
}
