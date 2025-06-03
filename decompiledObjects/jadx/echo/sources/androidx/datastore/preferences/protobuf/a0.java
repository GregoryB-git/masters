package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f8936c = new a0();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f8938b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final f0 f8937a = new G();

    public static a0 a() {
        return f8936c;
    }

    public e0 b(Class cls, e0 e0Var) {
        AbstractC0777y.b(cls, "messageType");
        AbstractC0777y.b(e0Var, "schema");
        return (e0) this.f8938b.putIfAbsent(cls, e0Var);
    }

    public e0 c(Class cls) {
        AbstractC0777y.b(cls, "messageType");
        e0 e0Var = (e0) this.f8938b.get(cls);
        if (e0Var != null) {
            return e0Var;
        }
        e0 a7 = this.f8937a.a(cls);
        e0 b7 = b(cls, a7);
        return b7 != null ? b7 : a7;
    }

    public e0 d(Object obj) {
        return c(obj.getClass());
    }
}
