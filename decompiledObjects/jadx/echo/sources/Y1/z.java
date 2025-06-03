package Y1;

import W5.K;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7532a;

    /* renamed from: b, reason: collision with root package name */
    public static final Set f7533b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f7534c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Set b() {
            Set f7;
            f7 = K.f("ads_management", "create_event", "rsvp_event");
            return f7;
        }

        public final boolean c(String str) {
            boolean s7;
            boolean s8;
            if (str == null) {
                return false;
            }
            s7 = kotlin.text.r.s(str, "publish", false, 2, null);
            if (!s7) {
                s8 = kotlin.text.r.s(str, "manage", false, 2, null);
                if (!s8 && !z.f7533b.contains(str)) {
                    return false;
                }
            }
            return true;
        }
    }

    static {
        a aVar = new a(null);
        f7532a = aVar;
        f7533b = aVar.b();
        String cls = z.class.toString();
        Intrinsics.checkNotNullExpressionValue(cls, "LoginManager::class.java.toString()");
        f7534c = cls;
    }
}
