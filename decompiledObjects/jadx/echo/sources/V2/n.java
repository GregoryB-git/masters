package V2;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final class n implements InterfaceC0651b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Collection f6444a;

    public n(Collection collection) {
        this.f6444a = collection;
    }

    @Override // V2.InterfaceC0651b
    public final /* bridge */ /* synthetic */ Object a(AbstractC0659j abstractC0659j) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f6444a);
        return m.e(arrayList);
    }
}
