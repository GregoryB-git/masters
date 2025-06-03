package p1;

import V5.t;
import b3.InterfaceFutureC0796e;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import p6.P;
import u.AbstractC1998c;

/* renamed from: p1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1790b {

    /* renamed from: p1.b$a */
    public static final class a extends l implements g6.l {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ AbstractC1998c.a f18352o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ P f18353p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC1998c.a aVar, P p7) {
            super(1);
            this.f18352o = aVar;
            this.f18353p = p7;
        }

        public final void a(Throwable th) {
            if (th == null) {
                this.f18352o.b(this.f18353p.c());
            } else if (th instanceof CancellationException) {
                this.f18352o.c();
            } else {
                this.f18352o.e(th);
            }
        }

        @Override // g6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return t.f6803a;
        }
    }

    public static final InterfaceFutureC0796e b(final P p7, final Object obj) {
        Intrinsics.checkNotNullParameter(p7, "<this>");
        InterfaceFutureC0796e a7 = AbstractC1998c.a(new AbstractC1998c.InterfaceC0275c() { // from class: p1.a
            @Override // u.AbstractC1998c.InterfaceC0275c
            public final Object a(AbstractC1998c.a aVar) {
                Object d7;
                d7 = AbstractC1790b.d(P.this, obj, aVar);
                return d7;
            }
        });
        Intrinsics.checkNotNullExpressionValue(a7, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return a7;
    }

    public static /* synthetic */ InterfaceFutureC0796e c(P p7, Object obj, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(p7, obj);
    }

    public static final Object d(P this_asListenableFuture, Object obj, AbstractC1998c.a completer) {
        Intrinsics.checkNotNullParameter(this_asListenableFuture, "$this_asListenableFuture");
        Intrinsics.checkNotNullParameter(completer, "completer");
        this_asListenableFuture.e(new a(completer, this_asListenableFuture));
        return obj;
    }
}
