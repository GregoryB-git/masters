package r0;

import dc.p;
import java.util.LinkedHashMap;
import java.util.Map;
import r0.d;
import rb.h;
import wb.i;

/* loaded from: classes.dex */
public final class e {

    @wb.e(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {329}, m = "invokeSuspend")
    public static final class a extends i implements p<d, ub.e<? super d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f13514a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f13515b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p<r0.a, ub.e<? super h>, Object> f13516c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super r0.a, ? super ub.e<? super h>, ? extends Object> pVar, ub.e<? super a> eVar) {
            super(2, eVar);
            this.f13516c = pVar;
        }

        @Override // wb.a
        public final ub.e<h> create(Object obj, ub.e<?> eVar) {
            a aVar = new a(this.f13516c, eVar);
            aVar.f13515b = obj;
            return aVar;
        }

        @Override // dc.p
        public final Object invoke(d dVar, ub.e<? super d> eVar) {
            return ((a) create(dVar, eVar)).invokeSuspend(h.f13851a);
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            vb.a aVar = vb.a.f16085a;
            int i10 = this.f13514a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r0.a aVar2 = (r0.a) this.f13515b;
                rb.f.b(obj);
                return aVar2;
            }
            rb.f.b(obj);
            Map<d.a<?>, Object> a10 = ((d) this.f13515b).a();
            ec.i.e(a10, "<this>");
            r0.a aVar3 = new r0.a((Map<d.a<?>, Object>) new LinkedHashMap(a10), false);
            p<r0.a, ub.e<? super h>, Object> pVar = this.f13516c;
            this.f13515b = aVar3;
            this.f13514a = 1;
            return pVar.invoke(aVar3, this) == aVar ? aVar : aVar3;
        }
    }

    public static final Object a(o0.i<d> iVar, p<? super r0.a, ? super ub.e<? super h>, ? extends Object> pVar, ub.e<? super d> eVar) {
        return iVar.a(new a(pVar, null), eVar);
    }
}
