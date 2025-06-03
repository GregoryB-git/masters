package n6;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class f extends e {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f18066a;

        public a(Iterator it) {
            this.f18066a = it;
        }

        @Override // n6.b
        public Iterator iterator() {
            return this.f18066a;
        }
    }

    public static b a(Iterator it) {
        b b7;
        Intrinsics.checkNotNullParameter(it, "<this>");
        b7 = b(new a(it));
        return b7;
    }

    public static b b(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return bVar instanceof n6.a ? bVar : new n6.a(bVar);
    }
}
