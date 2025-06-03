package v5;

import java.util.HashMap;
import java.util.Map;

/* renamed from: v5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2064c {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C2064c f20197b;

    /* renamed from: a, reason: collision with root package name */
    public final Map f20198a = new HashMap();

    public static C2064c b() {
        if (f20197b == null) {
            synchronized (C2064c.class) {
                try {
                    if (f20197b == null) {
                        f20197b = new C2064c();
                    }
                } finally {
                }
            }
        }
        return f20197b;
    }

    public io.flutter.embedding.engine.b a(String str) {
        return (io.flutter.embedding.engine.b) this.f20198a.get(str);
    }
}
