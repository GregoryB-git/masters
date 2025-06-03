package l1;

import android.net.Uri;
import android.view.InputEvent;
import b.a0;
import dc.p;
import m1.d;
import nc.d0;
import nc.e0;
import nc.r0;
import rb.f;
import rb.h;
import wb.e;
import wb.i;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: l1.a$a, reason: collision with other inner class name */
    public static final class C0141a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final d f9522a;

        @e(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", l = {169}, m = "invokeSuspend")
        /* renamed from: l1.a$a$a, reason: collision with other inner class name */
        public static final class C0142a extends i implements p<d0, ub.e<? super Integer>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f9523a;

            public C0142a(ub.e<? super C0142a> eVar) {
                super(2, eVar);
            }

            @Override // wb.a
            public final ub.e<h> create(Object obj, ub.e<?> eVar) {
                return C0141a.this.new C0142a(eVar);
            }

            @Override // dc.p
            public final Object invoke(d0 d0Var, ub.e<? super Integer> eVar) {
                return ((C0142a) create(d0Var, eVar)).invokeSuspend(h.f13851a);
            }

            @Override // wb.a
            public final Object invokeSuspend(Object obj) {
                vb.a aVar = vb.a.f16085a;
                int i10 = this.f9523a;
                if (i10 == 0) {
                    f.b(obj);
                    d dVar = C0141a.this.f9522a;
                    this.f9523a = 1;
                    obj = dVar.a(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                }
                return obj;
            }
        }

        @e(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {133}, m = "invokeSuspend")
        /* renamed from: l1.a$a$b */
        public static final class b extends i implements p<d0, ub.e<? super h>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f9525a;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Uri f9527c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ InputEvent f9528d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Uri uri, InputEvent inputEvent, ub.e<? super b> eVar) {
                super(2, eVar);
                this.f9527c = uri;
                this.f9528d = inputEvent;
            }

            @Override // wb.a
            public final ub.e<h> create(Object obj, ub.e<?> eVar) {
                return C0141a.this.new b(this.f9527c, this.f9528d, eVar);
            }

            @Override // dc.p
            public final Object invoke(d0 d0Var, ub.e<? super h> eVar) {
                return ((b) create(d0Var, eVar)).invokeSuspend(h.f13851a);
            }

            @Override // wb.a
            public final Object invokeSuspend(Object obj) {
                vb.a aVar = vb.a.f16085a;
                int i10 = this.f9525a;
                if (i10 == 0) {
                    f.b(obj);
                    d dVar = C0141a.this.f9522a;
                    Uri uri = this.f9527c;
                    InputEvent inputEvent = this.f9528d;
                    this.f9525a = 1;
                    if (dVar.b(uri, inputEvent, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                }
                return h.f13851a;
            }
        }

        @e(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {141}, m = "invokeSuspend")
        /* renamed from: l1.a$a$c */
        public static final class c extends i implements p<d0, ub.e<? super h>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f9529a;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Uri f9531c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Uri uri, ub.e<? super c> eVar) {
                super(2, eVar);
                this.f9531c = uri;
            }

            @Override // wb.a
            public final ub.e<h> create(Object obj, ub.e<?> eVar) {
                return C0141a.this.new c(this.f9531c, eVar);
            }

            @Override // dc.p
            public final Object invoke(d0 d0Var, ub.e<? super h> eVar) {
                return ((c) create(d0Var, eVar)).invokeSuspend(h.f13851a);
            }

            @Override // wb.a
            public final Object invokeSuspend(Object obj) {
                vb.a aVar = vb.a.f16085a;
                int i10 = this.f9529a;
                if (i10 == 0) {
                    f.b(obj);
                    d dVar = C0141a.this.f9522a;
                    Uri uri = this.f9531c;
                    this.f9529a = 1;
                    if (dVar.c(uri, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                }
                return h.f13851a;
            }
        }

        public C0141a(d.a aVar) {
            this.f9522a = aVar;
        }

        @Override // l1.a
        public s7.e<Integer> a() {
            return a0.h(x6.b.h(e0.a(r0.f11545a), new C0142a(null)));
        }

        @Override // l1.a
        public s7.e<h> b(Uri uri) {
            ec.i.e(uri, "trigger");
            return a0.h(x6.b.h(e0.a(r0.f11545a), new c(uri, null)));
        }

        public s7.e<h> c(m1.a aVar) {
            ec.i.e(aVar, "deletionRequest");
            throw null;
        }

        public s7.e<h> d(Uri uri, InputEvent inputEvent) {
            ec.i.e(uri, "attributionSource");
            return a0.h(x6.b.h(e0.a(r0.f11545a), new b(uri, inputEvent, null)));
        }

        public s7.e<h> e(m1.e eVar) {
            ec.i.e(eVar, "request");
            throw null;
        }

        public s7.e<h> f(m1.f fVar) {
            ec.i.e(fVar, "request");
            throw null;
        }
    }

    public abstract s7.e<Integer> a();

    public abstract s7.e<h> b(Uri uri);
}
