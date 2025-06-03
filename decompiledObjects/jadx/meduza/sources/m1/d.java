package m1;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import b.a0;
import ec.i;
import nc.l;
import p2.m0;
import rb.h;

/* loaded from: classes.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public final MeasurementManager f9872a;

        public a(Context context) {
            Object systemService = context.getSystemService((Class<Object>) MeasurementManager.class);
            i.d(systemService, "context.getSystemService…:class.java\n            )");
            this.f9872a = (MeasurementManager) systemService;
        }

        @Override // m1.d
        public Object a(ub.e<? super Integer> eVar) {
            l lVar = new l(1, m0.P(eVar));
            lVar.t();
            this.f9872a.getMeasurementApiStatus(new b(0), a0.i(lVar));
            Object s10 = lVar.s();
            m0.H();
            if (s10 == vb.a.f16085a) {
                x6.b.i0(eVar);
            }
            return s10;
        }

        @Override // m1.d
        public Object b(Uri uri, InputEvent inputEvent, ub.e<? super h> eVar) {
            l lVar = new l(1, m0.P(eVar));
            lVar.t();
            this.f9872a.registerSource(uri, inputEvent, new b(1), a0.i(lVar));
            Object s10 = lVar.s();
            m0.H();
            vb.a aVar = vb.a.f16085a;
            if (s10 == aVar) {
                x6.b.i0(eVar);
            }
            m0.H();
            return s10 == aVar ? s10 : h.f13851a;
        }

        @Override // m1.d
        public Object c(Uri uri, ub.e<? super h> eVar) {
            l lVar = new l(1, m0.P(eVar));
            lVar.t();
            this.f9872a.registerTrigger(uri, new m.a(1), a0.i(lVar));
            Object s10 = lVar.s();
            m0.H();
            vb.a aVar = vb.a.f16085a;
            if (s10 == aVar) {
                x6.b.i0(eVar);
            }
            m0.H();
            return s10 == aVar ? s10 : h.f13851a;
        }

        public Object d(m1.a aVar, ub.e<? super h> eVar) {
            new l(1, m0.P(eVar)).t();
            new DeletionRequest.Builder();
            throw null;
        }

        public Object e(e eVar, ub.e<? super h> eVar2) {
            new l(1, m0.P(eVar2)).t();
            throw null;
        }

        public Object f(f fVar, ub.e<? super h> eVar) {
            new l(1, m0.P(eVar)).t();
            throw null;
        }
    }

    public abstract Object a(ub.e<? super Integer> eVar);

    public abstract Object b(Uri uri, InputEvent inputEvent, ub.e<? super h> eVar);

    public abstract Object c(Uri uri, ub.e<? super h> eVar);
}
