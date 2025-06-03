package b8;

import java.util.Map;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public String f2137a;

    /* renamed from: b, reason: collision with root package name */
    public Map<String, Object> f2138b;

    public s(String str, Map<String, Object> map) {
        this.f2137a = str;
        this.f2138b = map;
    }

    public final long a(String str) {
        Integer num = (Integer) this.f2138b.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }
}
