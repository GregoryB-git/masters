package v5;

import java.util.HashMap;
import java.util.Map;

/* renamed from: v5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2062a {

    /* renamed from: b, reason: collision with root package name */
    public static C2062a f20173b;

    /* renamed from: a, reason: collision with root package name */
    public final Map f20174a = new HashMap();

    public static C2062a b() {
        if (f20173b == null) {
            f20173b = new C2062a();
        }
        return f20173b;
    }

    public io.flutter.embedding.engine.a a(String str) {
        return (io.flutter.embedding.engine.a) this.f20174a.get(str);
    }

    public void c(String str, io.flutter.embedding.engine.a aVar) {
        if (aVar != null) {
            this.f20174a.put(str, aVar);
        } else {
            this.f20174a.remove(str);
        }
    }

    public void d(String str) {
        c(str, null);
    }
}
