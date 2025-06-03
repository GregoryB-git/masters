package okhttp3.internal.connection;

import defpackage.f;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.ConnectionSpec;
import okhttp3.internal.Internal;

/* loaded from: classes.dex */
public final class ConnectionSpecSelector {

    /* renamed from: a, reason: collision with root package name */
    public final List<ConnectionSpec> f12408a;

    /* renamed from: b, reason: collision with root package name */
    public int f12409b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12410c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12411d;

    public ConnectionSpecSelector(List<ConnectionSpec> list) {
        this.f12408a = list;
    }

    public final ConnectionSpec a(SSLSocket sSLSocket) {
        boolean z10;
        ConnectionSpec connectionSpec;
        int i10 = this.f12409b;
        int size = this.f12408a.size();
        while (true) {
            z10 = true;
            if (i10 >= size) {
                connectionSpec = null;
                break;
            }
            connectionSpec = this.f12408a.get(i10);
            if (connectionSpec.a(sSLSocket)) {
                this.f12409b = i10 + 1;
                break;
            }
            i10++;
        }
        if (connectionSpec == null) {
            StringBuilder l10 = f.l("Unable to find acceptable protocols. isFallback=");
            l10.append(this.f12411d);
            l10.append(", modes=");
            l10.append(this.f12408a);
            l10.append(", supported protocols=");
            l10.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
            throw new UnknownServiceException(l10.toString());
        }
        int i11 = this.f12409b;
        while (true) {
            if (i11 >= this.f12408a.size()) {
                z10 = false;
                break;
            }
            if (this.f12408a.get(i11).a(sSLSocket)) {
                break;
            }
            i11++;
        }
        this.f12410c = z10;
        Internal.f12370a.c(connectionSpec, sSLSocket, this.f12411d);
        return connectionSpec;
    }
}
