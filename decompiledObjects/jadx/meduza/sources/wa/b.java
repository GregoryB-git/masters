package wa;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends wa.a {

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, Object> f16469b;

    /* renamed from: c, reason: collision with root package name */
    public final a f16470c = new a();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16471d;

    public class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public Object f16472a;

        /* renamed from: b, reason: collision with root package name */
        public String f16473b;

        /* renamed from: c, reason: collision with root package name */
        public String f16474c;

        /* renamed from: d, reason: collision with root package name */
        public Object f16475d;

        @Override // wa.d
        public final void a(Serializable serializable) {
            this.f16472a = serializable;
        }

        @Override // wa.d
        public final void b(String str, HashMap hashMap) {
            this.f16473b = "sqlite_error";
            this.f16474c = str;
            this.f16475d = hashMap;
        }
    }

    public b(Map<String, Object> map, boolean z10) {
        this.f16469b = map;
        this.f16471d = z10;
    }

    @Override // m.e
    public final <T> T c(String str) {
        return (T) this.f16469b.get(str);
    }

    @Override // m.e
    public final String d() {
        return (String) this.f16469b.get(Constants.METHOD);
    }

    @Override // m.e
    public final boolean e() {
        return this.f16471d;
    }

    @Override // m.e
    public final boolean f() {
        return this.f16469b.containsKey("transactionId");
    }

    @Override // wa.a
    public final d v() {
        return this.f16470c;
    }
}
