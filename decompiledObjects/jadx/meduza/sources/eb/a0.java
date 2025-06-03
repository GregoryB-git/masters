package eb;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;
import n7.g;

/* loaded from: classes.dex */
public final class a0 extends y0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f5017e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final SocketAddress f5018a;

    /* renamed from: b, reason: collision with root package name */
    public final InetSocketAddress f5019b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5020c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5021d;

    public a0(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        x6.b.y(socketAddress, "proxyAddress");
        x6.b.y(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            x6.b.G(socketAddress, "The proxy address %s is not resolved", !((InetSocketAddress) socketAddress).isUnresolved());
        }
        this.f5018a = socketAddress;
        this.f5019b = inetSocketAddress;
        this.f5020c = str;
        this.f5021d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return x6.b.Q(this.f5018a, a0Var.f5018a) && x6.b.Q(this.f5019b, a0Var.f5019b) && x6.b.Q(this.f5020c, a0Var.f5020c) && x6.b.Q(this.f5021d, a0Var.f5021d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5018a, this.f5019b, this.f5020c, this.f5021d});
    }

    public final String toString() {
        g.a b10 = n7.g.b(this);
        b10.a(this.f5018a, "proxyAddr");
        b10.a(this.f5019b, "targetAddr");
        b10.a(this.f5020c, URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME);
        b10.c("hasPassword", this.f5021d != null);
        return b10.toString();
    }
}
