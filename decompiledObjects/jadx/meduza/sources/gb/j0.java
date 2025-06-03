package gb;

import eb.u0;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes.dex */
public final class j0 extends eb.v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f6531a;

    static {
        boolean z10 = false;
        try {
            Class.forName("android.app.Application", false, j0.class.getClassLoader());
            z10 = true;
        } catch (Exception unused) {
        }
        f6531a = z10;
    }

    @Override // eb.u0.c
    public final void a() {
    }

    @Override // eb.u0.c
    public final i0 b(URI uri, u0.a aVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String path = uri.getPath();
        x6.b.y(path, "targetPath");
        x6.b.r(path.startsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE), "the path component (%s) of the target (%s) must start with '/'", path, uri);
        String substring = path.substring(1);
        uri.getAuthority();
        return new i0(substring, aVar, v0.f6842p, new n7.p(), f6531a);
    }

    @Override // eb.v0
    public Collection<Class<? extends SocketAddress>> c() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // eb.v0
    public boolean d() {
        return true;
    }

    @Override // eb.v0
    public int e() {
        return 5;
    }
}
