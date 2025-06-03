package A1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public enum a {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;


    /* renamed from: o, reason: collision with root package name */
    public static final C0001a f214o = new C0001a(null);

    /* renamed from: A1.a$a, reason: collision with other inner class name */
    public static final class C0001a {
        public C0001a() {
        }

        public /* synthetic */ C0001a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final a a(String rawValue) {
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            return Intrinsics.a(rawValue, "MOBILE_APP_INSTALL") ? a.MOBILE_APP_INSTALL : Intrinsics.a(rawValue, "CUSTOM_APP_EVENTS") ? a.CUSTOM : a.OTHER;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        a[] valuesCustom = values();
        return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
