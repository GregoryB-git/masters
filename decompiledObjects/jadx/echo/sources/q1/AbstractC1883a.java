package q1;

import V5.o;
import V5.t;
import Z5.k;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import b3.InterfaceFutureC0796e;
import g6.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;
import p1.AbstractC1790b;
import p6.AbstractC1852i;
import p6.I;
import p6.J;
import p6.P;
import p6.W;
import r1.AbstractC1913a;
import r1.n;

/* renamed from: q1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1883a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f18804a = new b(null);

    /* renamed from: q1.a$a, reason: collision with other inner class name */
    public static final class C0251a extends AbstractC1883a {

        /* renamed from: b, reason: collision with root package name */
        public final n f18805b;

        /* renamed from: q1.a$a$a, reason: collision with other inner class name */
        public static final class C0252a extends k implements p {

            /* renamed from: o, reason: collision with root package name */
            public int f18806o;

            public C0252a(AbstractC1913a abstractC1913a, X5.d dVar) {
                super(2, dVar);
            }

            @Override // Z5.a
            public final X5.d create(Object obj, X5.d dVar) {
                return C0251a.this.new C0252a(null, dVar);
            }

            @Override // Z5.a
            public final Object invokeSuspend(Object obj) {
                Object c7;
                c7 = Y5.d.c();
                int i7 = this.f18806o;
                if (i7 == 0) {
                    o.b(obj);
                    n nVar = C0251a.this.f18805b;
                    this.f18806o = 1;
                    if (nVar.a(null, this) == c7) {
                        return c7;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return t.f6803a;
            }

            @Override // g6.p
            public final Object invoke(I i7, X5.d dVar) {
                return ((C0252a) create(i7, dVar)).invokeSuspend(t.f6803a);
            }
        }

        /* renamed from: q1.a$a$b */
        public static final class b extends k implements p {

            /* renamed from: o, reason: collision with root package name */
            public int f18808o;

            public b(X5.d dVar) {
                super(2, dVar);
            }

            @Override // Z5.a
            public final X5.d create(Object obj, X5.d dVar) {
                return C0251a.this.new b(dVar);
            }

            @Override // Z5.a
            public final Object invokeSuspend(Object obj) {
                Object c7;
                c7 = Y5.d.c();
                int i7 = this.f18808o;
                if (i7 == 0) {
                    o.b(obj);
                    n nVar = C0251a.this.f18805b;
                    this.f18808o = 1;
                    obj = nVar.b(this);
                    if (obj == c7) {
                        return c7;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return obj;
            }

            @Override // g6.p
            public final Object invoke(I i7, X5.d dVar) {
                return ((b) create(i7, dVar)).invokeSuspend(t.f6803a);
            }
        }

        /* renamed from: q1.a$a$c */
        public static final class c extends k implements p {

            /* renamed from: o, reason: collision with root package name */
            public int f18810o;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ Uri f18812q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ InputEvent f18813r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Uri uri, InputEvent inputEvent, X5.d dVar) {
                super(2, dVar);
                this.f18812q = uri;
                this.f18813r = inputEvent;
            }

            @Override // Z5.a
            public final X5.d create(Object obj, X5.d dVar) {
                return C0251a.this.new c(this.f18812q, this.f18813r, dVar);
            }

            @Override // Z5.a
            public final Object invokeSuspend(Object obj) {
                Object c7;
                c7 = Y5.d.c();
                int i7 = this.f18810o;
                if (i7 == 0) {
                    o.b(obj);
                    n nVar = C0251a.this.f18805b;
                    Uri uri = this.f18812q;
                    InputEvent inputEvent = this.f18813r;
                    this.f18810o = 1;
                    if (nVar.c(uri, inputEvent, this) == c7) {
                        return c7;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return t.f6803a;
            }

            @Override // g6.p
            public final Object invoke(I i7, X5.d dVar) {
                return ((c) create(i7, dVar)).invokeSuspend(t.f6803a);
            }
        }

        /* renamed from: q1.a$a$d */
        public static final class d extends k implements p {

            /* renamed from: o, reason: collision with root package name */
            public int f18814o;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ Uri f18816q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Uri uri, X5.d dVar) {
                super(2, dVar);
                this.f18816q = uri;
            }

            @Override // Z5.a
            public final X5.d create(Object obj, X5.d dVar) {
                return C0251a.this.new d(this.f18816q, dVar);
            }

            @Override // Z5.a
            public final Object invokeSuspend(Object obj) {
                Object c7;
                c7 = Y5.d.c();
                int i7 = this.f18814o;
                if (i7 == 0) {
                    o.b(obj);
                    n nVar = C0251a.this.f18805b;
                    Uri uri = this.f18816q;
                    this.f18814o = 1;
                    if (nVar.d(uri, this) == c7) {
                        return c7;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return t.f6803a;
            }

            @Override // g6.p
            public final Object invoke(I i7, X5.d dVar) {
                return ((d) create(i7, dVar)).invokeSuspend(t.f6803a);
            }
        }

        /* renamed from: q1.a$a$e */
        public static final class e extends k implements p {

            /* renamed from: o, reason: collision with root package name */
            public int f18817o;

            public e(r1.o oVar, X5.d dVar) {
                super(2, dVar);
            }

            @Override // Z5.a
            public final X5.d create(Object obj, X5.d dVar) {
                return C0251a.this.new e(null, dVar);
            }

            @Override // Z5.a
            public final Object invokeSuspend(Object obj) {
                Object c7;
                c7 = Y5.d.c();
                int i7 = this.f18817o;
                if (i7 == 0) {
                    o.b(obj);
                    n nVar = C0251a.this.f18805b;
                    this.f18817o = 1;
                    if (nVar.e(null, this) == c7) {
                        return c7;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return t.f6803a;
            }

            @Override // g6.p
            public final Object invoke(I i7, X5.d dVar) {
                return ((e) create(i7, dVar)).invokeSuspend(t.f6803a);
            }
        }

        /* renamed from: q1.a$a$f */
        public static final class f extends k implements p {

            /* renamed from: o, reason: collision with root package name */
            public int f18819o;

            public f(r1.p pVar, X5.d dVar) {
                super(2, dVar);
            }

            @Override // Z5.a
            public final X5.d create(Object obj, X5.d dVar) {
                return C0251a.this.new f(null, dVar);
            }

            @Override // Z5.a
            public final Object invokeSuspend(Object obj) {
                Object c7;
                c7 = Y5.d.c();
                int i7 = this.f18819o;
                if (i7 == 0) {
                    o.b(obj);
                    n nVar = C0251a.this.f18805b;
                    this.f18819o = 1;
                    if (nVar.f(null, this) == c7) {
                        return c7;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return t.f6803a;
            }

            @Override // g6.p
            public final Object invoke(I i7, X5.d dVar) {
                return ((f) create(i7, dVar)).invokeSuspend(t.f6803a);
            }
        }

        public C0251a(n mMeasurementManager) {
            Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
            this.f18805b = mMeasurementManager;
        }

        @Override // q1.AbstractC1883a
        @NotNull
        public InterfaceFutureC0796e b() {
            P b7;
            b7 = AbstractC1852i.b(J.a(W.a()), null, null, new b(null), 3, null);
            return AbstractC1790b.c(b7, null, 1, null);
        }

        @Override // q1.AbstractC1883a
        @NotNull
        public InterfaceFutureC0796e c(@NotNull Uri trigger) {
            P b7;
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            b7 = AbstractC1852i.b(J.a(W.a()), null, null, new d(trigger, null), 3, null);
            return AbstractC1790b.c(b7, null, 1, null);
        }

        @NotNull
        public InterfaceFutureC0796e e(@NotNull AbstractC1913a deletionRequest) {
            P b7;
            Intrinsics.checkNotNullParameter(deletionRequest, "deletionRequest");
            b7 = AbstractC1852i.b(J.a(W.a()), null, null, new C0252a(deletionRequest, null), 3, null);
            return AbstractC1790b.c(b7, null, 1, null);
        }

        @NotNull
        public InterfaceFutureC0796e f(@NotNull Uri attributionSource, InputEvent inputEvent) {
            P b7;
            Intrinsics.checkNotNullParameter(attributionSource, "attributionSource");
            b7 = AbstractC1852i.b(J.a(W.a()), null, null, new c(attributionSource, inputEvent, null), 3, null);
            return AbstractC1790b.c(b7, null, 1, null);
        }

        @NotNull
        public InterfaceFutureC0796e g(@NotNull r1.o request) {
            P b7;
            Intrinsics.checkNotNullParameter(request, "request");
            b7 = AbstractC1852i.b(J.a(W.a()), null, null, new e(request, null), 3, null);
            return AbstractC1790b.c(b7, null, 1, null);
        }

        @NotNull
        public InterfaceFutureC0796e h(@NotNull r1.p request) {
            P b7;
            Intrinsics.checkNotNullParameter(request, "request");
            b7 = AbstractC1852i.b(J.a(W.a()), null, null, new f(request, null), 3, null);
            return AbstractC1790b.c(b7, null, 1, null);
        }
    }

    /* renamed from: q1.a$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final AbstractC1883a a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            n a7 = n.f19075a.a(context);
            if (a7 != null) {
                return new C0251a(a7);
            }
            return null;
        }
    }

    public static final AbstractC1883a a(Context context) {
        return f18804a.a(context);
    }

    public abstract InterfaceFutureC0796e b();

    public abstract InterfaceFutureC0796e c(Uri uri);
}
