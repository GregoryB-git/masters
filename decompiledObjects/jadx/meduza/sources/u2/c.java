package u2;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import dc.p;
import ec.j;
import pc.o;
import pc.q;
import t2.b;

@wb.e(c = "androidx.work.impl.constraints.controllers.ConstraintController$track$1", f = "ContraintControllers.kt", l = {R.styleable.AppCompatTheme_colorControlNormal}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c extends wb.i implements p<q<? super t2.b>, ub.e<? super rb.h>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f14920a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f14921b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d<Object> f14922c;

    public static final class a extends j implements dc.a<rb.h> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d<Object> f14923a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f14924b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, b bVar) {
            super(0);
            this.f14923a = dVar;
            this.f14924b = bVar;
        }

        @Override // dc.a
        public final rb.h invoke() {
            v2.g<Object> gVar = this.f14923a.f14927a;
            b bVar = this.f14924b;
            gVar.getClass();
            ec.i.e(bVar, "listener");
            synchronized (gVar.f15218c) {
                if (gVar.f15219d.remove(bVar) && gVar.f15219d.isEmpty()) {
                    gVar.d();
                }
            }
            return rb.h.f13851a;
        }
    }

    public static final class b implements t2.a<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d<Object> f14925a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q<t2.b> f14926b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(d<Object> dVar, q<? super t2.b> qVar) {
            this.f14925a = dVar;
            this.f14926b = qVar;
        }

        @Override // t2.a
        public final void a(Object obj) {
            this.f14926b.getChannel().l(this.f14925a.c(obj) ? new b.C0227b(this.f14925a.a()) : b.a.f14412a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d<Object> dVar, ub.e<? super c> eVar) {
        super(2, eVar);
        this.f14922c = dVar;
    }

    @Override // wb.a
    public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
        c cVar = new c(this.f14922c, eVar);
        cVar.f14921b = obj;
        return cVar;
    }

    @Override // dc.p
    public final Object invoke(q<? super t2.b> qVar, ub.e<? super rb.h> eVar) {
        return ((c) create(qVar, eVar)).invokeSuspend(rb.h.f13851a);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        vb.a aVar = vb.a.f16085a;
        int i10 = this.f14920a;
        if (i10 == 0) {
            rb.f.b(obj);
            q qVar = (q) this.f14921b;
            d<Object> dVar = this.f14922c;
            b bVar = new b(dVar, qVar);
            v2.g<Object> gVar = dVar.f14927a;
            gVar.getClass();
            synchronized (gVar.f15218c) {
                if (gVar.f15219d.add(bVar)) {
                    if (gVar.f15219d.size() == 1) {
                        gVar.f15220e = gVar.a();
                        o2.j.d().a(v2.h.f15221a, gVar.getClass().getSimpleName() + ": initial state = " + gVar.f15220e);
                        gVar.c();
                    }
                    bVar.a(gVar.f15220e);
                }
                rb.h hVar = rb.h.f13851a;
            }
            a aVar2 = new a(this.f14922c, bVar);
            this.f14920a = 1;
            if (o.a(qVar, aVar2, this) == aVar) {
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
