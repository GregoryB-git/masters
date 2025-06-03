package gb;

import gb.d1;
import java.io.Closeable;
import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public interface v extends Closeable {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f6824a = "unknown-authority";

        /* renamed from: b, reason: collision with root package name */
        public eb.a f6825b = eb.a.f5012b;

        /* renamed from: c, reason: collision with root package name */
        public String f6826c;

        /* renamed from: d, reason: collision with root package name */
        public eb.a0 f6827d;

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f6824a.equals(aVar.f6824a) && this.f6825b.equals(aVar.f6825b) && x6.b.Q(this.f6826c, aVar.f6826c) && x6.b.Q(this.f6827d, aVar.f6827d);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f6824a, this.f6825b, this.f6826c, this.f6827d});
        }
    }

    x W(SocketAddress socketAddress, a aVar, d1.f fVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    ScheduledExecutorService p0();

    Collection<Class<? extends SocketAddress>> y0();
}
