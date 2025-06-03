package O1;

import android.net.Uri;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import x1.C2146B;

/* loaded from: classes.dex */
public final class x extends C0442e {

    /* renamed from: c, reason: collision with root package name */
    public static final a f3966c = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Uri a(String action, Bundle bundle) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (Intrinsics.a(action, "oauth")) {
                P p7 = P.f3756a;
                return P.g(H.k(), "oauth/authorize", bundle);
            }
            P p8 = P.f3756a;
            return P.g(H.k(), C2146B.w() + "/dialog/" + action, bundle);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String action, Bundle bundle) {
        super(action, bundle);
        Intrinsics.checkNotNullParameter(action, "action");
        b(f3966c.a(action, bundle == null ? new Bundle() : bundle));
    }
}
