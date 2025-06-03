package n1;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import m9.a;
import p2.m0;
import v5.l;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11180b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11181c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11182d;

    public /* synthetic */ a(Object obj, int i10, Object obj2, int i11) {
        this.f11179a = i11;
        this.f11181c = obj;
        this.f11180b = i10;
        this.f11182d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11179a) {
            case 0:
                ((androidx.profileinstaller.b) this.f11181c).f1137c.b(this.f11180b, this.f11182d);
                break;
            case 1:
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f11181c;
                int i10 = this.f11180b;
                l.a aVar = (l.a) this.f11182d;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    l.c cVar = (l.c) it.next();
                    if (!cVar.f15924d) {
                        if (i10 != -1) {
                            cVar.f15922b.a(i10);
                        }
                        cVar.f15923c = true;
                        aVar.invoke(cVar.f15921a);
                    }
                }
                break;
            default:
                a.c cVar2 = (a.c) this.f11181c;
                int i11 = this.f11180b;
                Object obj = this.f11182d;
                cVar2.getClass();
                if (m0.S()) {
                    m0.y(1, m9.a.this.getClass().getSimpleName(), "(%x) Stream received (%s): %s", Integer.valueOf(System.identityHashCode(m9.a.this)), Integer.valueOf(i11), obj);
                }
                m9.a aVar2 = m9.a.this;
                if (i11 != 1) {
                    aVar2.f(obj);
                    break;
                } else {
                    aVar2.e(obj);
                    break;
                }
        }
    }
}
