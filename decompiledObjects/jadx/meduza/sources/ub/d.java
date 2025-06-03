package ub;

import dc.p;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.Serializable;
import ub.h;

/* loaded from: classes.dex */
public final class d implements h, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final h f15160a;

    /* renamed from: b, reason: collision with root package name */
    public final h.b f15161b;

    public d(h.b bVar, h hVar) {
        ec.i.e(hVar, "left");
        ec.i.e(bVar, "element");
        this.f15160a = hVar;
        this.f15161b = bVar;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this != obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            dVar.getClass();
            int i10 = 2;
            d dVar2 = dVar;
            int i11 = 2;
            while (true) {
                h hVar = dVar2.f15160a;
                dVar2 = hVar instanceof d ? (d) hVar : null;
                if (dVar2 == null) {
                    break;
                }
                i11++;
            }
            d dVar3 = this;
            while (true) {
                h hVar2 = dVar3.f15160a;
                dVar3 = hVar2 instanceof d ? (d) hVar2 : null;
                if (dVar3 == null) {
                    break;
                }
                i10++;
            }
            if (i11 != i10) {
                return false;
            }
            d dVar4 = this;
            while (true) {
                h.b bVar = dVar4.f15161b;
                if (!ec.i.a(dVar.get(bVar.getKey()), bVar)) {
                    z10 = false;
                    break;
                }
                h hVar3 = dVar4.f15160a;
                if (!(hVar3 instanceof d)) {
                    ec.i.c(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    h.b bVar2 = (h.b) hVar3;
                    z10 = ec.i.a(dVar.get(bVar2.getKey()), bVar2);
                    break;
                }
                dVar4 = (d) hVar3;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    @Override // ub.h
    public final <R> R fold(R r10, p<? super R, ? super h.b, ? extends R> pVar) {
        ec.i.e(pVar, "operation");
        return pVar.invoke((Object) this.f15160a.fold(r10, pVar), this.f15161b);
    }

    @Override // ub.h
    public final <E extends h.b> E get(h.c<E> cVar) {
        ec.i.e(cVar, Constants.KEY);
        d dVar = this;
        while (true) {
            E e10 = (E) dVar.f15161b.get(cVar);
            if (e10 != null) {
                return e10;
            }
            h hVar = dVar.f15160a;
            if (!(hVar instanceof d)) {
                return (E) hVar.get(cVar);
            }
            dVar = (d) hVar;
        }
    }

    public final int hashCode() {
        return this.f15161b.hashCode() + this.f15160a.hashCode();
    }

    @Override // ub.h
    public final h minusKey(h.c<?> cVar) {
        ec.i.e(cVar, Constants.KEY);
        if (this.f15161b.get(cVar) != null) {
            return this.f15160a;
        }
        h minusKey = this.f15160a.minusKey(cVar);
        return minusKey == this.f15160a ? this : minusKey == i.f15164a ? this.f15161b : new d(this.f15161b, minusKey);
    }

    @Override // ub.h
    public final h plus(h hVar) {
        return h.a.a(this, hVar);
    }

    public final String toString() {
        return '[' + ((String) fold("", new p() { // from class: ub.c
            @Override // dc.p
            public final Object invoke(Object obj, Object obj2) {
                String str = (String) obj;
                h.b bVar = (h.b) obj2;
                ec.i.e(str, "acc");
                ec.i.e(bVar, "element");
                if (str.length() == 0) {
                    return bVar.toString();
                }
                return str + ", " + bVar;
            }
        })) + ']';
    }
}
