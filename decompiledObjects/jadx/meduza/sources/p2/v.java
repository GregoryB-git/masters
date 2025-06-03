package p2;

import android.util.Pair;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import v3.z0;
import z4.t;
import z4.w;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12959a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12960b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12961c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12963e;

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f12959a = i10;
        this.f12960b = obj;
        this.f12961c = obj2;
        this.f12962d = obj3;
        this.f12963e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12959a) {
            case 0:
                List list = (List) this.f12960b;
                x2.l lVar = (x2.l) this.f12961c;
                androidx.work.a aVar = (androidx.work.a) this.f12962d;
                WorkDatabase workDatabase = (WorkDatabase) this.f12963e;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((t) it.next()).c(lVar.f16820a);
                }
                w.b(aVar, workDatabase, list);
                break;
            case 1:
                z0.a aVar2 = (z0.a) this.f12960b;
                Pair pair = (Pair) this.f12961c;
                aVar2.f15836b.f15830h.M(((Integer) pair.first).intValue(), (t.b) pair.second, (z4.n) this.f12962d, (z4.q) this.f12963e);
                break;
            default:
                w.a aVar3 = (w.a) this.f12960b;
                ((z4.w) this.f12961c).n0(aVar3.f17740a, aVar3.f17741b, (z4.n) this.f12962d, (z4.q) this.f12963e);
                break;
        }
    }
}
