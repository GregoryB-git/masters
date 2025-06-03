package f4;

import java.io.IOException;
import java.util.Map;

/* renamed from: f4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1291a {

    /* renamed from: a, reason: collision with root package name */
    public final String f14239a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f14240b;

    public C1291a(String str, Map map) {
        this.f14239a = str;
        this.f14240b = map;
    }

    public static C1291a c(String str) {
        if (!str.startsWith("gauth|")) {
            return null;
        }
        try {
            Map a7 = AbstractC1292b.a(str.substring(6));
            return new C1291a((String) a7.get("token"), (Map) a7.get("auth"));
        } catch (IOException e7) {
            throw new RuntimeException("Failed to parse gauth token", e7);
        }
    }

    public Map a() {
        return this.f14240b;
    }

    public String b() {
        return this.f14239a;
    }
}
