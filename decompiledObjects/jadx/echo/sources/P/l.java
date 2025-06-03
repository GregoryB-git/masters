package P;

import V5.t;
import g6.p;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import p6.AbstractC1852i;
import p6.I;
import p6.InterfaceC1869q0;
import r6.g;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final I f4114a;

    /* renamed from: b, reason: collision with root package name */
    public final p f4115b;

    /* renamed from: c, reason: collision with root package name */
    public final r6.d f4116c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicInteger f4117d;

    public static final class a extends kotlin.jvm.internal.l implements g6.l {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ g6.l f4118o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ l f4119p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ p f4120q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g6.l lVar, l lVar2, p pVar) {
            super(1);
            this.f4118o = lVar;
            this.f4119p = lVar2;
            this.f4120q = pVar;
        }

        public final void a(Throwable th) {
            t tVar;
            this.f4118o.invoke(th);
            this.f4119p.f4116c.b(th);
            do {
                Object d7 = r6.g.d(this.f4119p.f4116c.c());
                if (d7 == null) {
                    tVar = null;
                } else {
                    this.f4120q.invoke(d7, th);
                    tVar = t.f6803a;
                }
            } while (tVar != null);
        }

        @Override // g6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return t.f6803a;
        }
    }

    public static final class b extends Z5.k implements p {

        /* renamed from: o, reason: collision with root package name */
        public Object f4121o;

        /* renamed from: p, reason: collision with root package name */
        public int f4122p;

        public b(X5.d dVar) {
            super(2, dVar);
        }

        @Override // Z5.a
        public final X5.d create(Object obj, X5.d dVar) {
            return l.this.new b(dVar);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0055 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:6:0x0062). Please report as a decompilation issue!!! */
        @Override // Z5.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = Y5.b.c()
                int r1 = r5.f4122p
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                V5.o.b(r6)
                goto L62
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f4121o
                g6.p r1 = (g6.p) r1
                V5.o.b(r6)
                goto L56
            L22:
                V5.o.b(r6)
                P.l r6 = P.l.this
                java.util.concurrent.atomic.AtomicInteger r6 = P.l.c(r6)
                int r6 = r6.get()
                if (r6 <= 0) goto L33
                r6 = r3
                goto L34
            L33:
                r6 = 0
            L34:
                if (r6 == 0) goto L71
            L36:
                P.l r6 = P.l.this
                p6.I r6 = P.l.d(r6)
                p6.J.b(r6)
                P.l r6 = P.l.this
                g6.p r1 = P.l.a(r6)
                P.l r6 = P.l.this
                r6.d r6 = P.l.b(r6)
                r5.f4121o = r1
                r5.f4122p = r3
                java.lang.Object r6 = r6.a(r5)
                if (r6 != r0) goto L56
                return r0
            L56:
                r4 = 0
                r5.f4121o = r4
                r5.f4122p = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L62
                return r0
            L62:
                P.l r6 = P.l.this
                java.util.concurrent.atomic.AtomicInteger r6 = P.l.c(r6)
                int r6 = r6.decrementAndGet()
                if (r6 != 0) goto L36
                V5.t r6 = V5.t.f6803a
                return r6
            L71:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: P.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // g6.p
        public final Object invoke(I i7, X5.d dVar) {
            return ((b) create(i7, dVar)).invokeSuspend(t.f6803a);
        }
    }

    public l(I scope, g6.l onComplete, p onUndeliveredElement, p consumeMessage) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        this.f4114a = scope;
        this.f4115b = consumeMessage;
        this.f4116c = r6.f.b(Integer.MAX_VALUE, null, null, 6, null);
        this.f4117d = new AtomicInteger(0);
        InterfaceC1869q0 interfaceC1869q0 = (InterfaceC1869q0) scope.f().b(InterfaceC1869q0.f18550n);
        if (interfaceC1869q0 == null) {
            return;
        }
        interfaceC1869q0.e(new a(onComplete, this, onUndeliveredElement));
    }

    public final void e(Object obj) {
        Object d7 = this.f4116c.d(obj);
        if (d7 instanceof g.a) {
            Throwable c7 = r6.g.c(d7);
            if (c7 != null) {
                throw c7;
            }
            throw new r6.k("Channel was closed normally");
        }
        if (!r6.g.f(d7)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.f4117d.getAndIncrement() == 0) {
            AbstractC1852i.d(this.f4114a, null, null, new b(null), 3, null);
        }
    }
}
