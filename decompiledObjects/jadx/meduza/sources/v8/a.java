package v8;

import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.firebase.dynamiclinks.internal.b;
import io.flutter.plugins.firebase.analytics.Constants;
import u7.f;

@Deprecated
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.dynamiclinks.internal.b f16004a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f16005b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f16006c;

    public a(com.google.firebase.dynamiclinks.internal.b bVar) {
        this.f16004a = bVar;
        Bundle bundle = new Bundle();
        this.f16005b = bundle;
        f fVar = bVar.f3122c;
        fVar.a();
        bundle.putString("apiKey", fVar.f15086c.f15096a);
        Bundle bundle2 = new Bundle();
        this.f16006c = bundle2;
        bundle.putBundle(Constants.PARAMETERS, bundle2);
    }

    @Deprecated
    public final Task<d> a(int i10) {
        if (this.f16005b.getString("apiKey") == null) {
            throw new IllegalArgumentException("Missing API key. Set with setApiKey().");
        }
        this.f16005b.putInt("suffix", i10);
        com.google.firebase.dynamiclinks.internal.b bVar = this.f16004a;
        Bundle bundle = this.f16005b;
        bVar.getClass();
        com.google.firebase.dynamiclinks.internal.b.d(bundle);
        return bVar.f3120a.doWrite(new b.c(bundle));
    }
}
