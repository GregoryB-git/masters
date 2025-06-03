package w8;

import android.content.Context;
import android.os.Looper;
import k6.a;
import k6.d;
import k6.e;

/* loaded from: classes.dex */
public final class c extends k6.d<a.d.c> {

    /* renamed from: a, reason: collision with root package name */
    public static final k6.a<a.d.c> f16446a = new k6.a<>("DynamicLinks.API", new a(), new a.g());

    public class a extends a.AbstractC0130a<com.google.firebase.dynamiclinks.internal.a, a.d.c> {
        @Override // k6.a.AbstractC0130a
        public final com.google.firebase.dynamiclinks.internal.a buildClient(Context context, Looper looper, m6.a aVar, a.d.c cVar, e.a aVar2, e.b bVar) {
            return new com.google.firebase.dynamiclinks.internal.a(context, looper, aVar, aVar2, bVar);
        }
    }

    public c(Context context) {
        super(context, f16446a, a.d.f9096j, d.a.f9097c);
    }
}
