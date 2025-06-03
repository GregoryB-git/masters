package A2;

import android.content.Context;
import android.util.SparseIntArray;
import x2.C2197k;
import y2.C2270a;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final SparseIntArray f374a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    public C2197k f375b;

    public E(C2197k c2197k) {
        AbstractC0328n.i(c2197k);
        this.f375b = c2197k;
    }

    public final int a(Context context, int i7) {
        return this.f374a.get(i7, -1);
    }

    public final int b(Context context, C2270a.f fVar) {
        AbstractC0328n.i(context);
        AbstractC0328n.i(fVar);
        int i7 = 0;
        if (!fVar.g()) {
            return 0;
        }
        int h7 = fVar.h();
        int a7 = a(context, h7);
        if (a7 == -1) {
            int i8 = 0;
            while (true) {
                if (i8 >= this.f374a.size()) {
                    i7 = -1;
                    break;
                }
                int keyAt = this.f374a.keyAt(i8);
                if (keyAt > h7 && this.f374a.get(keyAt) == 0) {
                    break;
                }
                i8++;
            }
            a7 = i7 == -1 ? this.f375b.h(context, h7) : i7;
            this.f374a.put(h7, a7);
        }
        return a7;
    }

    public final void c() {
        this.f374a.clear();
    }
}
