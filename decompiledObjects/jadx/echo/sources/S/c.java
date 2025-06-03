package S;

import e6.k;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import p6.I;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f5809a = new c();

    public static final class a extends l implements g6.a {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ g6.a f5810o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g6.a aVar) {
            super(0);
            this.f5810o = aVar;
        }

        @Override // g6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            String k7;
            File file = (File) this.f5810o.invoke();
            k7 = k.k(file);
            h hVar = h.f5815a;
            if (Intrinsics.a(k7, hVar.f())) {
                return file;
            }
            throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: " + hVar.f()).toString());
        }
    }

    public final P.f a(Q.b bVar, List migrations, I scope, g6.a produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return new b(P.g.f4111a.a(h.f5815a, bVar, migrations, scope, new a(produceFile)));
    }
}
