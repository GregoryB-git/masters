package okhttp3.internal.http2;

import okhttp3.internal.Util;
import xc.i;

/* loaded from: classes.dex */
public final class Header {

    /* renamed from: d, reason: collision with root package name */
    public static final i f12505d;

    /* renamed from: e, reason: collision with root package name */
    public static final i f12506e;
    public static final i f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f12507g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f12508h;

    /* renamed from: i, reason: collision with root package name */
    public static final i f12509i;

    /* renamed from: a, reason: collision with root package name */
    public final i f12510a;

    /* renamed from: b, reason: collision with root package name */
    public final i f12511b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12512c;

    public interface Listener {
    }

    static {
        i iVar = i.f17259d;
        f12505d = i.a.a(":");
        f12506e = i.a.a(":status");
        f = i.a.a(":method");
        f12507g = i.a.a(":path");
        f12508h = i.a.a(":scheme");
        f12509i = i.a.a(":authority");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String str, String str2) {
        this(i.a.a(str), i.a.a(str2));
        i iVar = i.f17259d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return this.f12510a.equals(header.f12510a) && this.f12511b.equals(header.f12511b);
    }

    public final int hashCode() {
        return this.f12511b.hashCode() + ((this.f12510a.hashCode() + 527) * 31);
    }

    public final String toString() {
        return Util.l("%s: %s", this.f12510a.t(), this.f12511b.t());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(i iVar, String str) {
        this(iVar, i.a.a(str));
        i iVar2 = i.f17259d;
    }

    public Header(i iVar, i iVar2) {
        this.f12510a = iVar;
        this.f12511b = iVar2;
        this.f12512c = iVar2.i() + iVar.i() + 32;
    }
}
