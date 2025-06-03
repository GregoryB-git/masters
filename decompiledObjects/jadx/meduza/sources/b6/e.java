package b6;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.Collections;
import java.util.List;
import k6.a;
import k6.e;

/* loaded from: classes.dex */
public final class e extends a.AbstractC0130a {
    @Override // k6.a.AbstractC0130a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, m6.a aVar, Object obj, e.a aVar2, e.b bVar) {
        return new h6.f(context, looper, aVar, (GoogleSignInOptions) obj, aVar2, bVar);
    }

    @Override // k6.a.e
    public final /* bridge */ /* synthetic */ List getImpliedScopes(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.D();
    }
}
