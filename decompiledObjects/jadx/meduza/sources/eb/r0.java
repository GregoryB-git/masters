package eb;

import eb.d1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f5195c = Logger.getLogger(r0.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static r0 f5196d;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet<p0> f5197a = new LinkedHashSet<>();

    /* renamed from: b, reason: collision with root package name */
    public List<p0> f5198b = Collections.emptyList();

    public static final class a implements d1.a<p0> {
        @Override // eb.d1.a
        public final boolean a(p0 p0Var) {
            return p0Var.b();
        }

        @Override // eb.d1.a
        public final int b(p0 p0Var) {
            return p0Var.c();
        }
    }

    public static List<Class<?>> a() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(hb.g.class);
        } catch (ClassNotFoundException e10) {
            f5195c.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e10);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e11) {
            f5195c.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e11);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e12) {
            f5195c.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e12);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
