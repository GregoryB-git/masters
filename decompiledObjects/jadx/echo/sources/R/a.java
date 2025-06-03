package R;

import W5.o;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import p6.I;
import p6.J;
import p6.J0;
import p6.W;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: R.a$a, reason: collision with other inner class name */
    public static final class C0085a extends l implements g6.l {

        /* renamed from: o, reason: collision with root package name */
        public static final C0085a f4496o = new C0085a();

        public C0085a() {
            super(1);
        }

        @Override // g6.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return o.f();
        }
    }

    public static final i6.a a(String name, Q.b bVar, g6.l produceMigrations, I scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new c(name, bVar, produceMigrations, scope);
    }

    public static /* synthetic */ i6.a b(String str, Q.b bVar, g6.l lVar, I i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            bVar = null;
        }
        if ((i8 & 4) != 0) {
            lVar = C0085a.f4496o;
        }
        if ((i8 & 8) != 0) {
            i7 = J.a(W.b().k(J0.b(null, 1, null)));
        }
        return a(str, bVar, lVar, i7);
    }
}
