package r1;

import E.q;
import V5.t;
import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import kotlin.jvm.internal.Intrinsics;
import o1.C1753a;
import org.jetbrains.annotations.NotNull;
import p6.C1860m;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final b f19075a = new b(null);

    public static final class a extends n {

        /* renamed from: b, reason: collision with root package name */
        public final MeasurementManager f19076b;

        public a(MeasurementManager mMeasurementManager) {
            Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
            this.f19076b = mMeasurementManager;
        }

        @Override // r1.n
        public Object a(@NotNull AbstractC1913a abstractC1913a, @NotNull X5.d dVar) {
            X5.d b7;
            Object c7;
            Object c8;
            b7 = Y5.c.b(dVar);
            C1860m c1860m = new C1860m(b7, 1);
            c1860m.z();
            this.f19076b.deleteRegistrations(k(abstractC1913a), new m(), q.a(c1860m));
            Object w7 = c1860m.w();
            c7 = Y5.d.c();
            if (w7 == c7) {
                Z5.h.c(dVar);
            }
            c8 = Y5.d.c();
            return w7 == c8 ? w7 : t.f6803a;
        }

        @Override // r1.n
        public Object b(@NotNull X5.d dVar) {
            X5.d b7;
            Object c7;
            b7 = Y5.c.b(dVar);
            C1860m c1860m = new C1860m(b7, 1);
            c1860m.z();
            this.f19076b.getMeasurementApiStatus(new m(), q.a(c1860m));
            Object w7 = c1860m.w();
            c7 = Y5.d.c();
            if (w7 == c7) {
                Z5.h.c(dVar);
            }
            return w7;
        }

        @Override // r1.n
        public Object c(@NotNull Uri uri, InputEvent inputEvent, @NotNull X5.d dVar) {
            X5.d b7;
            Object c7;
            Object c8;
            b7 = Y5.c.b(dVar);
            C1860m c1860m = new C1860m(b7, 1);
            c1860m.z();
            this.f19076b.registerSource(uri, inputEvent, new m(), q.a(c1860m));
            Object w7 = c1860m.w();
            c7 = Y5.d.c();
            if (w7 == c7) {
                Z5.h.c(dVar);
            }
            c8 = Y5.d.c();
            return w7 == c8 ? w7 : t.f6803a;
        }

        @Override // r1.n
        public Object d(@NotNull Uri uri, @NotNull X5.d dVar) {
            X5.d b7;
            Object c7;
            Object c8;
            b7 = Y5.c.b(dVar);
            C1860m c1860m = new C1860m(b7, 1);
            c1860m.z();
            this.f19076b.registerTrigger(uri, new m(), q.a(c1860m));
            Object w7 = c1860m.w();
            c7 = Y5.d.c();
            if (w7 == c7) {
                Z5.h.c(dVar);
            }
            c8 = Y5.d.c();
            return w7 == c8 ? w7 : t.f6803a;
        }

        @Override // r1.n
        public Object e(@NotNull o oVar, @NotNull X5.d dVar) {
            X5.d b7;
            Object c7;
            Object c8;
            b7 = Y5.c.b(dVar);
            C1860m c1860m = new C1860m(b7, 1);
            c1860m.z();
            this.f19076b.registerWebSource(l(oVar), new m(), q.a(c1860m));
            Object w7 = c1860m.w();
            c7 = Y5.d.c();
            if (w7 == c7) {
                Z5.h.c(dVar);
            }
            c8 = Y5.d.c();
            return w7 == c8 ? w7 : t.f6803a;
        }

        @Override // r1.n
        public Object f(@NotNull p pVar, @NotNull X5.d dVar) {
            X5.d b7;
            Object c7;
            Object c8;
            b7 = Y5.c.b(dVar);
            C1860m c1860m = new C1860m(b7, 1);
            c1860m.z();
            this.f19076b.registerWebTrigger(m(pVar), new m(), q.a(c1860m));
            Object w7 = c1860m.w();
            c7 = Y5.d.c();
            if (w7 == c7) {
                Z5.h.c(dVar);
            }
            c8 = Y5.d.c();
            return w7 == c8 ? w7 : t.f6803a;
        }

        public final DeletionRequest k(AbstractC1913a abstractC1913a) {
            AbstractC1914b.a();
            throw null;
        }

        public final WebSourceRegistrationRequest l(o oVar) {
            AbstractC1916d.a();
            throw null;
        }

        public final WebTriggerRegistrationRequest m(p pVar) {
            AbstractC1917e.a();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(android.content.Context r2) {
            /*
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.Class r0 = r1.i.a()
                java.lang.Object r2 = r2.getSystemService(r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
                android.adservices.measurement.MeasurementManager r2 = r1.j.a(r2)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: r1.n.a.<init>(android.content.Context):void");
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final n a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            C1753a c1753a = C1753a.f18173a;
            sb.append(c1753a.a());
            Log.d("MeasurementManager", sb.toString());
            if (c1753a.a() >= 5) {
                return new a(context);
            }
            return null;
        }
    }

    public abstract Object a(AbstractC1913a abstractC1913a, X5.d dVar);

    public abstract Object b(X5.d dVar);

    public abstract Object c(Uri uri, InputEvent inputEvent, X5.d dVar);

    public abstract Object d(Uri uri, X5.d dVar);

    public abstract Object e(o oVar, X5.d dVar);

    public abstract Object f(p pVar, X5.d dVar);
}
