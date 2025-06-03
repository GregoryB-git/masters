package s0;

import java.util.Iterator;
import java.util.Map;
import s0.r;

/* loaded from: classes.dex */
public final class e1 extends f1<Object, Object> {
    public e1(int i10) {
        super(i10);
    }

    @Override // s0.f1
    public final void h() {
        if (!this.f13970d) {
            for (int i10 = 0; i10 < e(); i10++) {
                ((r.a) d(i10).getKey()).b();
            }
            Iterator<Map.Entry<Object, Object>> it = f().iterator();
            while (it.hasNext()) {
                ((r.a) it.next().getKey()).b();
            }
        }
        super.h();
    }

    @Override // s0.f1, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((r.a) obj, obj2);
    }
}
