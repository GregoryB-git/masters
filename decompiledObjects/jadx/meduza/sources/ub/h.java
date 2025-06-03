package ub;

import dc.p;
import io.flutter.plugins.firebase.crashlytics.Constants;
import ub.f;
import ub.h;

/* loaded from: classes.dex */
public interface h {

    public static final class a {
        public static h a(h hVar, h hVar2) {
            ec.i.e(hVar2, "context");
            return hVar2 == i.f15164a ? hVar : (h) hVar2.fold(hVar, new p() { // from class: ub.g
                @Override // dc.p
                public final Object invoke(Object obj, Object obj2) {
                    d dVar;
                    h hVar3 = (h) obj;
                    h.b bVar = (h.b) obj2;
                    ec.i.e(hVar3, "acc");
                    ec.i.e(bVar, "element");
                    h minusKey = hVar3.minusKey(bVar.getKey());
                    i iVar = i.f15164a;
                    if (minusKey == iVar) {
                        return bVar;
                    }
                    int i10 = f.f15162n;
                    f.a aVar = f.a.f15163a;
                    f fVar = (f) minusKey.get(aVar);
                    if (fVar == null) {
                        dVar = new d(bVar, minusKey);
                    } else {
                        h minusKey2 = minusKey.minusKey(aVar);
                        if (minusKey2 == iVar) {
                            return new d(fVar, bVar);
                        }
                        dVar = new d(fVar, new d(bVar, minusKey2));
                    }
                    return dVar;
                }
            });
        }
    }

    public interface b extends h {

        public static final class a {
            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E a(b bVar, c<E> cVar) {
                ec.i.e(cVar, Constants.KEY);
                if (ec.i.a(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            public static h b(b bVar, c<?> cVar) {
                ec.i.e(cVar, Constants.KEY);
                return ec.i.a(bVar.getKey(), cVar) ? i.f15164a : bVar;
            }
        }

        @Override // ub.h
        <R> R fold(R r10, p<? super R, ? super b, ? extends R> pVar);

        @Override // ub.h
        <E extends b> E get(c<E> cVar);

        c<?> getKey();

        @Override // ub.h
        h minusKey(c<?> cVar);
    }

    public interface c<E extends b> {
    }

    <R> R fold(R r10, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    h minusKey(c<?> cVar);

    h plus(h hVar);
}
