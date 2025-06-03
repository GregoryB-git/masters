package R4;

import android.util.Log;
import c2.AbstractC0820c;
import c2.C0819b;
import c2.InterfaceC0822e;
import kotlin.jvm.internal.Intrinsics;
import r4.InterfaceC1922b;

/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: b, reason: collision with root package name */
    public static final a f5719b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1922b f5720a;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public h(InterfaceC1922b transportFactoryProvider) {
        Intrinsics.checkNotNullParameter(transportFactoryProvider, "transportFactoryProvider");
        this.f5720a = transportFactoryProvider;
    }

    @Override // R4.i
    public void a(q sessionEvent) {
        Intrinsics.checkNotNullParameter(sessionEvent, "sessionEvent");
        ((c2.g) this.f5720a.get()).a("FIREBASE_APPQUALITY_SESSION", q.class, C0819b.b("json"), new InterfaceC0822e() { // from class: R4.g
            @Override // c2.InterfaceC0822e
            public final Object apply(Object obj) {
                byte[] c7;
                c7 = h.this.c((q) obj);
                return c7;
            }
        }).b(AbstractC0820c.d(sessionEvent));
    }

    public final byte[] c(q qVar) {
        String a7 = r.f5765a.b().a(qVar);
        Intrinsics.checkNotNullExpressionValue(a7, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: " + a7);
        byte[] bytes = a7.getBytes(kotlin.text.b.f16240b);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}
