package O1;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public static final G f3743a = new G();

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f3744b = new ConcurrentHashMap();

    public static final JSONObject a(String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        return (JSONObject) f3744b.get(accessToken);
    }

    public static final void b(String key, JSONObject value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        f3744b.put(key, value);
    }
}
