package P;

import V5.t;
import g6.p;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4094a = new a(null);

    public static final class a {

        /* renamed from: P.e$a$a, reason: collision with other inner class name */
        public static final class C0074a extends Z5.k implements p {

            /* renamed from: o, reason: collision with root package name */
            public int f4095o;

            /* renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f4096p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ List f4097q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0074a(List list, X5.d dVar) {
                super(2, dVar);
                this.f4097q = list;
            }

            @Override // g6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i iVar, X5.d dVar) {
                return ((C0074a) create(iVar, dVar)).invokeSuspend(t.f6803a);
            }

            @Override // Z5.a
            public final X5.d create(Object obj, X5.d dVar) {
                C0074a c0074a = new C0074a(this.f4097q, dVar);
                c0074a.f4096p = obj;
                return c0074a;
            }

            @Override // Z5.a
            public final Object invokeSuspend(Object obj) {
                Object c7;
                c7 = Y5.d.c();
                int i7 = this.f4095o;
                if (i7 == 0) {
                    V5.o.b(obj);
                    i iVar = (i) this.f4096p;
                    a aVar = e.f4094a;
                    List list = this.f4097q;
                    this.f4095o = 1;
                    if (aVar.c(list, iVar, this) == c7) {
                        return c7;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V5.o.b(obj);
                }
                return t.f6803a;
            }
        }

        public static final class b extends Z5.d {

            /* renamed from: o, reason: collision with root package name */
            public Object f4098o;

            /* renamed from: p, reason: collision with root package name */
            public Object f4099p;

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f4100q;

            /* renamed from: s, reason: collision with root package name */
            public int f4102s;

            public b(X5.d dVar) {
                super(dVar);
            }

            @Override // Z5.a
            public final Object invokeSuspend(Object obj) {
                this.f4100q = obj;
                this.f4102s |= Integer.MIN_VALUE;
                return a.this.c(null, null, this);
            }
        }

        public static final class c extends Z5.k implements p {

            /* renamed from: o, reason: collision with root package name */
            public Object f4103o;

            /* renamed from: p, reason: collision with root package name */
            public Object f4104p;

            /* renamed from: q, reason: collision with root package name */
            public Object f4105q;

            /* renamed from: r, reason: collision with root package name */
            public int f4106r;

            /* renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f4107s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ List f4108t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ List f4109u;

            /* renamed from: P.e$a$c$a, reason: collision with other inner class name */
            public static final class C0075a extends Z5.k implements g6.l {

                /* renamed from: o, reason: collision with root package name */
                public int f4110o;

                public C0075a(d dVar, X5.d dVar2) {
                    super(1, dVar2);
                }

                @Override // g6.l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(X5.d dVar) {
                    return ((C0075a) create(dVar)).invokeSuspend(t.f6803a);
                }

                @Override // Z5.a
                public final X5.d create(X5.d dVar) {
                    return new C0075a(null, dVar);
                }

                @Override // Z5.a
                public final Object invokeSuspend(Object obj) {
                    Y5.d.c();
                    int i7 = this.f4110o;
                    if (i7 == 0) {
                        V5.o.b(obj);
                        this.f4110o = 1;
                        throw null;
                    }
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V5.o.b(obj);
                    return t.f6803a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List list, List list2, X5.d dVar) {
                super(2, dVar);
                this.f4108t = list;
                this.f4109u = list2;
            }

            @Override // g6.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Object obj, X5.d dVar) {
                return ((c) create(obj, dVar)).invokeSuspend(t.f6803a);
            }

            @Override // Z5.a
            public final X5.d create(Object obj, X5.d dVar) {
                c cVar = new c(this.f4108t, this.f4109u, dVar);
                cVar.f4107s = obj;
                return cVar;
            }

            @Override // Z5.a
            public final Object invokeSuspend(Object obj) {
                List list;
                Iterator it;
                Y5.d.c();
                int i7 = this.f4106r;
                if (i7 == 0) {
                    V5.o.b(obj);
                    obj = this.f4107s;
                    List list2 = this.f4108t;
                    list = this.f4109u;
                    it = list2.iterator();
                } else if (i7 == 1) {
                    Object obj2 = this.f4105q;
                    android.support.v4.media.a.a(this.f4104p);
                    Iterator it2 = (Iterator) this.f4103o;
                    List list3 = (List) this.f4107s;
                    V5.o.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        list3.add(new C0075a(null, null));
                        this.f4107s = list3;
                        this.f4103o = it2;
                        this.f4104p = null;
                        this.f4105q = null;
                        this.f4106r = 2;
                        throw null;
                    }
                    obj = obj2;
                    it = it2;
                    list = list3;
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.f4103o;
                    list = (List) this.f4107s;
                    V5.o.b(obj);
                }
                if (!it.hasNext()) {
                    return obj;
                }
                android.support.v4.media.a.a(it.next());
                this.f4107s = list;
                this.f4103o = it;
                this.f4104p = null;
                this.f4105q = obj;
                this.f4106r = 1;
                throw null;
            }
        }

        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final p b(List migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            return new C0074a(migrations, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0088 -> B:13:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008b -> B:13:0x006b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object c(java.util.List r7, P.i r8, X5.d r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof P.e.a.b
                if (r0 == 0) goto L13
                r0 = r9
                P.e$a$b r0 = (P.e.a.b) r0
                int r1 = r0.f4102s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f4102s = r1
                goto L18
            L13:
                P.e$a$b r0 = new P.e$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f4100q
                java.lang.Object r1 = Y5.b.c()
                int r2 = r0.f4102s
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r7 = r0.f4099p
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f4098o
                kotlin.jvm.internal.u r8 = (kotlin.jvm.internal.u) r8
                V5.o.b(r9)     // Catch: java.lang.Throwable -> L34
                goto L6b
            L34:
                r9 = move-exception
                goto L84
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                java.lang.Object r7 = r0.f4098o
                java.util.List r7 = (java.util.List) r7
                V5.o.b(r9)
                goto L60
            L46:
                V5.o.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                P.e$a$c r2 = new P.e$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f4098o = r9
                r0.f4102s = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L5f
                return r1
            L5f:
                r7 = r9
            L60:
                kotlin.jvm.internal.u r8 = new kotlin.jvm.internal.u
                r8.<init>()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L6b:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L96
                java.lang.Object r9 = r7.next()
                g6.l r9 = (g6.l) r9
                r0.f4098o = r8     // Catch: java.lang.Throwable -> L34
                r0.f4099p = r7     // Catch: java.lang.Throwable -> L34
                r0.f4102s = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                if (r9 != r1) goto L6b
                return r1
            L84:
                java.lang.Object r2 = r8.f16230o
                if (r2 != 0) goto L8b
                r8.f16230o = r9
                goto L6b
            L8b:
                kotlin.jvm.internal.Intrinsics.b(r2)
                java.lang.Object r2 = r8.f16230o
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                V5.a.a(r2, r9)
                goto L6b
            L96:
                java.lang.Object r7 = r8.f16230o
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9f
                V5.t r7 = V5.t.f6803a
                return r7
            L9f:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: P.e.a.c(java.util.List, P.i, X5.d):java.lang.Object");
        }
    }
}
