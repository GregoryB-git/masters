package h6;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zba;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class g extends zba {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f7160a;

    public g(h hVar) {
        this.f7160a = hVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, h6.p
    public final void s1(GoogleSignInAccount googleSignInAccount, Status status) {
        if (googleSignInAccount != null) {
            h hVar = this.f7160a;
            o a10 = o.a(hVar.f7161a);
            GoogleSignInOptions googleSignInOptions = hVar.f7162b;
            synchronized (a10) {
                a10.f7167a.d(googleSignInAccount, googleSignInOptions);
                a10.f7168b = googleSignInAccount;
                a10.f7169c = googleSignInOptions;
            }
        }
        this.f7160a.setResult((h) new g6.b(googleSignInAccount, status));
    }
}
