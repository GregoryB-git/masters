package A2;

import android.os.Bundle;
import y2.C2270a;

/* renamed from: A2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0334u implements C2270a.d {

    /* renamed from: b, reason: collision with root package name */
    public static final C0334u f535b = a().a();

    /* renamed from: a, reason: collision with root package name */
    public final String f536a;

    /* renamed from: A2.u$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f537a;

        public /* synthetic */ a(AbstractC0336w abstractC0336w) {
        }

        public C0334u a() {
            return new C0334u(this.f537a, null);
        }
    }

    public /* synthetic */ C0334u(String str, AbstractC0337x abstractC0337x) {
        this.f536a = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f536a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0334u) {
            return AbstractC0327m.a(this.f536a, ((C0334u) obj).f536a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0327m.b(this.f536a);
    }
}
