package r0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import dc.p;
import o0.i;
import o0.q;
import rb.h;

/* loaded from: classes.dex */
public final class b implements i<d> {

    /* renamed from: a, reason: collision with root package name */
    public final i<d> f13508a;

    @wb.e(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {R.styleable.AppCompatTheme_listPreferredItemPaddingStart}, m = "invokeSuspend")
    public static final class a extends wb.i implements p<d, ub.e<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f13509a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f13510b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p<d, ub.e<? super d>, Object> f13511c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super d, ? super ub.e<? super d>, ? extends Object> pVar, ub.e<? super a> eVar) {
            super(2, eVar);
            this.f13511c = pVar;
        }

        @Override // wb.a
        public final ub.e<h> create(Object obj, ub.e<?> eVar) {
            a aVar = new a(this.f13511c, eVar);
            aVar.f13510b = obj;
            return aVar;
        }

        @Override // dc.p
        public final Object invoke(d dVar, ub.e<? super d> eVar) {
            return ((a) create(dVar, eVar)).invokeSuspend(h.f13851a);
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            vb.a aVar = vb.a.f16085a;
            int i10 = this.f13509a;
            if (i10 == 0) {
                rb.f.b(obj);
                d dVar = (d) this.f13510b;
                p<d, ub.e<? super d>, Object> pVar = this.f13511c;
                this.f13509a = 1;
                obj = pVar.invoke(dVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rb.f.b(obj);
            }
            d dVar2 = (d) obj;
            ((r0.a) dVar2).f13506b.set(true);
            return dVar2;
        }
    }

    public b(q qVar) {
        this.f13508a = qVar;
    }

    @Override // o0.i
    public final Object a(p<? super d, ? super ub.e<? super d>, ? extends Object> pVar, ub.e<? super d> eVar) {
        return this.f13508a.a(new a(pVar, null), eVar);
    }

    @Override // o0.i
    public final qc.e<d> getData() {
        return this.f13508a.getData();
    }
}
