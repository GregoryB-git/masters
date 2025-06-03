package eb;

import eb.u0;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes.dex */
public abstract class v0 extends u0.c {
    public Collection<Class<? extends SocketAddress>> c() {
        return Collections.singleton(InetSocketAddress.class);
    }

    public abstract boolean d();

    public abstract int e();
}
