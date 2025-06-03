package ga;

import android.net.Uri;
import ga.d;
import java.net.URL;
import java.util.Map;

/* loaded from: classes.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final ea.b f6129a;

    /* renamed from: b, reason: collision with root package name */
    public final ub.h f6130b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6131c = "firebase-settings.crashlytics.com";

    public f(ea.b bVar, ub.h hVar) {
        this.f6129a = bVar;
        this.f6130b = hVar;
    }

    public static final URL b(f fVar) {
        fVar.getClass();
        return new URL(new Uri.Builder().scheme("https").authority(fVar.f6131c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(fVar.f6129a.f4860a).appendPath("settings").appendQueryParameter("build_version", fVar.f6129a.f.f4857c).appendQueryParameter("display_version", fVar.f6129a.f.f4856b).build().toString());
    }

    @Override // ga.a
    public final Object a(Map map, d.b bVar, d.c cVar, d.a aVar) {
        Object z02 = x6.b.z0(aVar, this.f6130b, new e(this, map, bVar, cVar, null));
        return z02 == vb.a.f16085a ? z02 : rb.h.f13851a;
    }
}
