package eb;

/* loaded from: classes.dex */
public abstract class p0 {

    public static final class a extends RuntimeException {
        public a() {
            super("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
        }
    }

    public abstract o0<?> a(String str);

    public abstract boolean b();

    public abstract int c();
}
