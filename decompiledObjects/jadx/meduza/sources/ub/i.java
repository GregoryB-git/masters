package ub;

import dc.p;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.Serializable;
import ub.h;

/* loaded from: classes.dex */
public final class i implements h, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final i f15164a = new i();

    @Override // ub.h
    public final <R> R fold(R r10, p<? super R, ? super h.b, ? extends R> pVar) {
        ec.i.e(pVar, "operation");
        return r10;
    }

    @Override // ub.h
    public final <E extends h.b> E get(h.c<E> cVar) {
        ec.i.e(cVar, Constants.KEY);
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // ub.h
    public final h minusKey(h.c<?> cVar) {
        ec.i.e(cVar, Constants.KEY);
        return this;
    }

    @Override // ub.h
    public final h plus(h hVar) {
        ec.i.e(hVar, "context");
        return hVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
