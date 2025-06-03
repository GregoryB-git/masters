package n6;

import W5.n;
import W5.o;
import g6.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class h extends g {

    public static final class a implements Iterable, h6.a {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ b f18067o;

        public a(b bVar) {
            this.f18067o = bVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f18067o.iterator();
        }
    }

    public static Iterable c(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new a(bVar);
    }

    public static b d(b bVar, l transform) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new i(bVar, transform);
    }

    public static List e(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return o.f();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return n.b(next);
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(next);
            if (!it.hasNext()) {
                return arrayList;
            }
            next = it.next();
        }
    }
}
