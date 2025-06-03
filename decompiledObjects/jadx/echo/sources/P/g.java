package P;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p6.I;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f4111a = new g();

    public final f a(k serializer, Q.b bVar, List migrations, I scope, g6.a produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return new m(produceFile, serializer, W5.n.b(e.f4094a.b(migrations)), new Q.a(), scope);
    }
}
