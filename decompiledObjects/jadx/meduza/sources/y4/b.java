package y4;

import android.net.Uri;
import java.util.List;
import t5.f0;
import t5.m;
import y4.a;

/* loaded from: classes.dex */
public final class b<T extends a<T>> implements f0.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final f0.a<? extends T> f17426a;

    /* renamed from: b, reason: collision with root package name */
    public final List<c> f17427b;

    public b(f0.a<? extends T> aVar, List<c> list) {
        this.f17426a = aVar;
        this.f17427b = list;
    }

    @Override // t5.f0.a
    public final Object a(Uri uri, m mVar) {
        a aVar = (a) this.f17426a.a(uri, mVar);
        List<c> list = this.f17427b;
        return (list == null || list.isEmpty()) ? aVar : (a) aVar.a(this.f17427b);
    }
}
