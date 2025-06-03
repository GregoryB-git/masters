package ea;

import android.content.Context;
import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import r0.d;

/* loaded from: classes.dex */
public final class w implements v {

    /* renamed from: e, reason: collision with root package name */
    public static final c f4977e = new c();
    public static final q0.c f = p2.m0.Y(u.f4975a, new p0.a(b.f4985a), 12);

    /* renamed from: a, reason: collision with root package name */
    public final Context f4978a;

    /* renamed from: b, reason: collision with root package name */
    public final ub.h f4979b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference<p> f4980c = new AtomicReference<>();

    /* renamed from: d, reason: collision with root package name */
    public final f f4981d;

    @wb.e(c = "com.google.firebase.sessions.SessionDatastoreImpl$1", f = "SessionDatastore.kt", l = {R.styleable.AppCompatTheme_listPreferredItemPaddingEnd}, m = "invokeSuspend")
    public static final class a extends wb.i implements dc.p<nc.d0, ub.e<? super rb.h>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f4982a;

        /* renamed from: ea.w$a$a, reason: collision with other inner class name */
        public static final class C0071a<T> implements qc.f {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ w f4984a;

            public C0071a(w wVar) {
                this.f4984a = wVar;
            }

            @Override // qc.f
            public final Object emit(Object obj, ub.e eVar) {
                this.f4984a.f4980c.set((p) obj);
                return rb.h.f13851a;
            }
        }

        public a(ub.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // wb.a
        public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
            return w.this.new a(eVar);
        }

        @Override // dc.p
        public final Object invoke(nc.d0 d0Var, ub.e<? super rb.h> eVar) {
            return ((a) create(d0Var, eVar)).invokeSuspend(rb.h.f13851a);
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            vb.a aVar = vb.a.f16085a;
            int i10 = this.f4982a;
            if (i10 == 0) {
                rb.f.b(obj);
                w wVar = w.this;
                f fVar = wVar.f4981d;
                C0071a c0071a = new C0071a(wVar);
                this.f4982a = 1;
                if (fVar.collect(c0071a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rb.f.b(obj);
            }
            return rb.h.f13851a;
        }
    }

    public static final class b extends ec.j implements dc.l<o0.a, r0.d> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4985a = new b();

        public b() {
            super(1);
        }

        @Override // dc.l
        public final r0.d invoke(o0.a aVar) {
            o0.a aVar2 = aVar;
            ec.i.e(aVar2, "ex");
            Log.w("FirebaseSessionsRepo", "CorruptionException in sessions DataStore in " + t.b() + '.', aVar2);
            return new r0.a(true, 1);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ jc.h<Object>[] f4986a;

        static {
            ec.p pVar = new ec.p(c.class);
            ec.t.f5273a.getClass();
            f4986a = new jc.h[]{pVar};
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d.a<String> f4987a = x6.b.u0("session_id");
    }

    @wb.e(c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", f = "SessionDatastore.kt", l = {R.styleable.AppCompatTheme_listDividerAlertDialog}, m = "invokeSuspend")
    public static final class e extends wb.i implements dc.q<qc.f<? super r0.d>, Throwable, ub.e<? super rb.h>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f4988a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ qc.f f4989b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Throwable f4990c;

        public e(ub.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // dc.q
        public final Object f(qc.f fVar, Object obj, Object obj2) {
            e eVar = new e((ub.e) obj2);
            eVar.f4989b = fVar;
            eVar.f4990c = (Throwable) obj;
            return eVar.invokeSuspend(rb.h.f13851a);
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            vb.a aVar = vb.a.f16085a;
            int i10 = this.f4988a;
            if (i10 == 0) {
                rb.f.b(obj);
                qc.f fVar = this.f4989b;
                Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f4990c);
                r0.a aVar2 = new r0.a(true, 1);
                this.f4989b = null;
                this.f4988a = 1;
                if (fVar.emit(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rb.f.b(obj);
            }
            return rb.h.f13851a;
        }
    }

    public static final class f implements qc.e<p> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qc.e f4991a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w f4992b;

        public static final class a<T> implements qc.f {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ qc.f f4993a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f4994b;

            @wb.e(c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2", f = "SessionDatastore.kt", l = {223}, m = "emit")
            /* renamed from: ea.w$f$a$a, reason: collision with other inner class name */
            public static final class C0072a extends wb.c {

                /* renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f4995a;

                /* renamed from: b, reason: collision with root package name */
                public int f4996b;

                public C0072a(ub.e eVar) {
                    super(eVar);
                }

                @Override // wb.a
                public final Object invokeSuspend(Object obj) {
                    this.f4995a = obj;
                    this.f4996b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(qc.f fVar, w wVar) {
                this.f4993a = fVar;
                this.f4994b = wVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // qc.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r6, ub.e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof ea.w.f.a.C0072a
                    if (r0 == 0) goto L13
                    r0 = r7
                    ea.w$f$a$a r0 = (ea.w.f.a.C0072a) r0
                    int r1 = r0.f4996b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f4996b = r1
                    goto L18
                L13:
                    ea.w$f$a$a r0 = new ea.w$f$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f4995a
                    vb.a r1 = vb.a.f16085a
                    int r2 = r0.f4996b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    rb.f.b(r7)
                    goto L53
                L27:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L2f:
                    rb.f.b(r7)
                    qc.f r7 = r5.f4993a
                    r0.d r6 = (r0.d) r6
                    ea.w r2 = r5.f4994b
                    ea.w$c r4 = ea.w.f4977e
                    r2.getClass()
                    ea.p r2 = new ea.p
                    r0.d$a<java.lang.String> r4 = ea.w.d.f4987a
                    java.lang.Object r6 = r6.b(r4)
                    java.lang.String r6 = (java.lang.String) r6
                    r2.<init>(r6)
                    r0.f4996b = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L53
                    return r1
                L53:
                    rb.h r6 = rb.h.f13851a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: ea.w.f.a.emit(java.lang.Object, ub.e):java.lang.Object");
            }
        }

        public f(qc.i iVar, w wVar) {
            this.f4991a = iVar;
            this.f4992b = wVar;
        }

        @Override // qc.e
        public final Object collect(qc.f<? super p> fVar, ub.e eVar) {
            Object collect = this.f4991a.collect(new a(fVar, this.f4992b), eVar);
            return collect == vb.a.f16085a ? collect : rb.h.f13851a;
        }
    }

    @wb.e(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", f = "SessionDatastore.kt", l = {R.styleable.AppCompatTheme_popupMenuStyle}, m = "invokeSuspend")
    public static final class g extends wb.i implements dc.p<nc.d0, ub.e<? super rb.h>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f4998a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f5000c;

        @wb.e(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", f = "SessionDatastore.kt", l = {}, m = "invokeSuspend")
        public static final class a extends wb.i implements dc.p<r0.a, ub.e<? super rb.h>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f5001a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f5002b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, ub.e<? super a> eVar) {
                super(2, eVar);
                this.f5002b = str;
            }

            @Override // wb.a
            public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
                a aVar = new a(this.f5002b, eVar);
                aVar.f5001a = obj;
                return aVar;
            }

            @Override // dc.p
            public final Object invoke(r0.a aVar, ub.e<? super rb.h> eVar) {
                return ((a) create(aVar, eVar)).invokeSuspend(rb.h.f13851a);
            }

            @Override // wb.a
            public final Object invokeSuspend(Object obj) {
                vb.a aVar = vb.a.f16085a;
                rb.f.b(obj);
                r0.a aVar2 = (r0.a) this.f5001a;
                d.a<String> aVar3 = d.f4987a;
                aVar2.d(d.f4987a, this.f5002b);
                return rb.h.f13851a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, ub.e<? super g> eVar) {
            super(2, eVar);
            this.f5000c = str;
        }

        @Override // wb.a
        public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
            return w.this.new g(this.f5000c, eVar);
        }

        @Override // dc.p
        public final Object invoke(nc.d0 d0Var, ub.e<? super rb.h> eVar) {
            return ((g) create(d0Var, eVar)).invokeSuspend(rb.h.f13851a);
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            vb.a aVar = vb.a.f16085a;
            int i10 = this.f4998a;
            try {
                if (i10 == 0) {
                    rb.f.b(obj);
                    c cVar = w.f4977e;
                    Context context = w.this.f4978a;
                    cVar.getClass();
                    r0.b a10 = w.f.a(context, c.f4986a[0]);
                    a aVar2 = new a(this.f5000c, null);
                    this.f4998a = 1;
                    if (r0.e.a(a10, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rb.f.b(obj);
                }
            } catch (IOException e10) {
                Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e10);
            }
            return rb.h.f13851a;
        }
    }

    public w(Context context, ub.h hVar) {
        this.f4978a = context;
        this.f4979b = hVar;
        f4977e.getClass();
        this.f4981d = new f(new qc.i(f.a(context, c.f4986a[0]).getData(), new e(null)), this);
        x6.b.g0(nc.e0.a(hVar), null, new a(null), 3);
    }

    @Override // ea.v
    public final String a() {
        p pVar = this.f4980c.get();
        if (pVar != null) {
            return pVar.f4960a;
        }
        return null;
    }

    @Override // ea.v
    public final void b(String str) {
        ec.i.e(str, "sessionId");
        x6.b.g0(nc.e0.a(this.f4979b), null, new g(str, null), 3);
    }
}
