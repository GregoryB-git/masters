package n7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n7.c;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final c f11300a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11301b;

    /* renamed from: c, reason: collision with root package name */
    public final b f11302c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11303d;

    public static abstract class a extends n7.b<String> {

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f11304c;

        /* renamed from: d, reason: collision with root package name */
        public final c f11305d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f11306e;
        public int f = 0;

        /* renamed from: o, reason: collision with root package name */
        public int f11307o;

        public a(o oVar, CharSequence charSequence) {
            this.f11305d = oVar.f11300a;
            this.f11306e = oVar.f11301b;
            this.f11307o = oVar.f11303d;
            this.f11304c = charSequence;
        }
    }

    public interface b {
    }

    public o(b bVar, boolean z10, c.AbstractC0171c abstractC0171c, int i10) {
        this.f11302c = bVar;
        this.f11301b = z10;
        this.f11300a = abstractC0171c;
        this.f11303d = i10;
    }

    public static o a(char c10) {
        return new o(new n(new c.b(c10)), false, c.d.f11279b, Integer.MAX_VALUE);
    }

    public final List<String> b(CharSequence charSequence) {
        charSequence.getClass();
        n nVar = (n) this.f11302c;
        nVar.getClass();
        m mVar = new m(nVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (mVar.hasNext()) {
            arrayList.add(mVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
