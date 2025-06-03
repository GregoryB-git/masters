package l6;

import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.a;
import java.util.Set;
import k6.a;

/* loaded from: classes.dex */
public final class g0 implements a.c, r0 {

    /* renamed from: a, reason: collision with root package name */
    public final a.f f9680a;

    /* renamed from: b, reason: collision with root package name */
    public final a f9681b;

    /* renamed from: c, reason: collision with root package name */
    public IAccountAccessor f9682c = null;

    /* renamed from: d, reason: collision with root package name */
    public Set f9683d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9684e = false;
    public final /* synthetic */ d f;

    public g0(d dVar, a.f fVar, a aVar) {
        this.f = dVar;
        this.f9680a = fVar;
        this.f9681b = aVar;
    }

    @Override // com.google.android.gms.common.internal.a.c
    public final void a(j6.b bVar) {
        this.f.f9655v.post(new f0(this, bVar));
    }

    public final void b(j6.b bVar) {
        d0 d0Var = (d0) this.f.f9652r.get(this.f9681b);
        if (d0Var != null) {
            d0Var.p(bVar);
        }
    }
}
