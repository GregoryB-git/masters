package L5;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class A {

    /* renamed from: a, reason: collision with root package name */
    public final List f3388a;

    /* renamed from: b, reason: collision with root package name */
    public Q3.p f3389b;

    public A(Q3.e eVar, List list) {
        this.f3389b = eVar;
        this.f3388a = list;
    }

    public Q3.p a() {
        if (this.f3388a.isEmpty()) {
            return this.f3389b;
        }
        for (Map map : this.f3388a) {
            Object obj = map.get("type");
            Objects.requireNonNull(obj);
            switch ((String) obj) {
                case "cursor":
                    b(map);
                    break;
                case "orderBy":
                    f(map);
                    break;
                case "limit":
                    e(map);
                    break;
            }
        }
        return this.f3389b;
    }

    public final void b(Map map) {
        Object obj = map.get("name");
        Objects.requireNonNull(obj);
        switch ((String) obj) {
            case "startAt":
                h(map);
                break;
            case "startAfter":
                g(map);
                break;
            case "endAt":
                c(map);
                break;
            case "endBefore":
                d(map);
                break;
        }
    }

    public final void c(Map map) {
        Object obj = map.get("value");
        String str = (String) map.get("key");
        this.f3389b = obj instanceof Boolean ? str == null ? this.f3389b.i(((Boolean) obj).booleanValue()) : this.f3389b.j(((Boolean) obj).booleanValue(), str) : obj instanceof Number ? str == null ? this.f3389b.d(((Number) obj).doubleValue()) : this.f3389b.e(((Number) obj).doubleValue(), str) : str == null ? this.f3389b.g((String) obj) : this.f3389b.h((String) obj, str);
    }

    public final void d(Map map) {
        Object obj = map.get("value");
        String str = (String) map.get("key");
        this.f3389b = obj instanceof Boolean ? str == null ? this.f3389b.p(((Boolean) obj).booleanValue()) : this.f3389b.q(((Boolean) obj).booleanValue(), str) : obj instanceof Number ? str == null ? this.f3389b.k(((Number) obj).doubleValue()) : this.f3389b.l(((Number) obj).doubleValue(), str) : str == null ? this.f3389b.n((String) obj) : this.f3389b.o((String) obj, str);
    }

    public final void e(Map map) {
        Q3.p x7;
        Object obj = map.get("name");
        Objects.requireNonNull(obj);
        String str = (String) obj;
        Object obj2 = map.get("limit");
        Objects.requireNonNull(obj2);
        int intValue = ((Integer) obj2).intValue();
        if ("limitToFirst".equals(str)) {
            x7 = this.f3389b.w(intValue);
        } else if (!"limitToLast".equals(str)) {
            return;
        } else {
            x7 = this.f3389b.x(intValue);
        }
        this.f3389b = x7;
    }

    public final void f(Map map) {
        Q3.p A7;
        Object obj = map.get("name");
        Objects.requireNonNull(obj);
        switch ((String) obj) {
            case "orderByPriority":
                A7 = this.f3389b.A();
                break;
            case "orderByKey":
                A7 = this.f3389b.z();
                break;
            case "orderByChild":
                Object obj2 = map.get("path");
                Objects.requireNonNull(obj2);
                A7 = this.f3389b.y((String) obj2);
                break;
            case "orderByValue":
                A7 = this.f3389b.B();
                break;
            default:
                return;
        }
        this.f3389b = A7;
    }

    public final void g(Map map) {
        Object obj = map.get("value");
        String str = (String) map.get("key");
        this.f3389b = obj instanceof Boolean ? str == null ? this.f3389b.K(((Boolean) obj).booleanValue()) : this.f3389b.L(((Boolean) obj).booleanValue(), str) : obj instanceof Number ? str == null ? this.f3389b.F(((Number) obj).doubleValue()) : this.f3389b.G(((Number) obj).doubleValue(), str) : str == null ? this.f3389b.I((String) obj) : this.f3389b.J((String) obj, str);
    }

    public final void h(Map map) {
        Object obj = map.get("value");
        String str = (String) map.get("key");
        this.f3389b = obj instanceof Boolean ? str == null ? this.f3389b.R(((Boolean) obj).booleanValue()) : this.f3389b.S(((Boolean) obj).booleanValue(), str) : obj instanceof Number ? str == null ? this.f3389b.M(((Number) obj).doubleValue()) : this.f3389b.N(((Number) obj).doubleValue(), str) : str == null ? this.f3389b.P((String) obj) : this.f3389b.Q((String) obj, str);
    }
}
