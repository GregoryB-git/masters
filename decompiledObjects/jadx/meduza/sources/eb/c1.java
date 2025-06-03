package eb;

import eb.d1;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class c1 implements Comparator<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1.a f5059a;

    public c1(d1.a aVar) {
        this.f5059a = aVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int b10 = this.f5059a.b(obj) - this.f5059a.b(obj2);
        return b10 != 0 ? b10 : obj.getClass().getName().compareTo(obj2.getClass().getName());
    }
}
