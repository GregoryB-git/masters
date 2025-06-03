package g6;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import k6.j;

/* loaded from: classes.dex */
public final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Status f5900a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleSignInAccount f5901b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f5901b = googleSignInAccount;
        this.f5900a = status;
    }

    @Override // k6.j
    public final Status getStatus() {
        return this.f5900a;
    }
}
