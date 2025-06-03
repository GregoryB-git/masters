package gc;

import ac.a;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7002a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final gc.a f7003b;

    public static final class a extends c implements Serializable {
        public final int a() {
            return c.f7003b.b();
        }
    }

    static {
        yb.b.f17466a.getClass();
        Integer num = a.C0007a.f386a;
        f7003b = num == null || num.intValue() >= 34 ? new hc.a() : new b();
    }
}
