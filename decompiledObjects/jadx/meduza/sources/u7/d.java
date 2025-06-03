package u7;

import android.content.Context;
import d8.u;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements t9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15080c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f15078a = i10;
        this.f15079b = obj;
        this.f15080c = obj2;
    }

    public /* synthetic */ d(Context context, String str) {
        this.f15078a = 2;
        this.f15080c = context;
        this.f15079b = str;
    }

    @Override // t9.b
    public final Object get() {
        switch (this.f15078a) {
            case 0:
                f fVar = (f) this.f15079b;
                return new y9.a((Context) this.f15080c, fVar.g(), (c9.c) fVar.f15087d.get(c9.c.class));
            case 1:
                d8.i iVar = (d8.i) this.f15079b;
                d8.b bVar = (d8.b) this.f15080c;
                iVar.getClass();
                return bVar.f.g(new u(bVar, iVar));
            default:
                return new q9.g((Context) this.f15080c, (String) this.f15079b);
        }
    }
}
