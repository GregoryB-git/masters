package eb;

import eb.a;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final a.b<String> f5233d = new a.b<>("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* renamed from: a, reason: collision with root package name */
    public final List<SocketAddress> f5234a;

    /* renamed from: b, reason: collision with root package name */
    public final a f5235b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5236c;

    public u(SocketAddress socketAddress) {
        this(Collections.singletonList(socketAddress), a.f5012b);
    }

    public u(List<SocketAddress> list, a aVar) {
        x6.b.s("addrs is empty", !list.isEmpty());
        List<SocketAddress> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f5234a = unmodifiableList;
        x6.b.y(aVar, "attrs");
        this.f5235b = aVar;
        this.f5236c = unmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f5234a.size() != uVar.f5234a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f5234a.size(); i10++) {
            if (!this.f5234a.get(i10).equals(uVar.f5234a.get(i10))) {
                return false;
            }
        }
        return this.f5235b.equals(uVar.f5235b);
    }

    public final int hashCode() {
        return this.f5236c;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("[");
        l10.append(this.f5234a);
        l10.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        l10.append(this.f5235b);
        l10.append("]");
        return l10.toString();
    }
}
