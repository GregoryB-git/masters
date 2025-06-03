package okhttp3.internal.http;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import xc.h;
import xc.s;

/* loaded from: classes.dex */
public final class RealResponseBody extends ResponseBody {

    /* renamed from: a, reason: collision with root package name */
    public final String f12467a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12468b;

    /* renamed from: c, reason: collision with root package name */
    public final h f12469c;

    public RealResponseBody(String str, long j10, s sVar) {
        this.f12467a = str;
        this.f12468b = j10;
        this.f12469c = sVar;
    }

    @Override // okhttp3.ResponseBody
    public final h H() {
        return this.f12469c;
    }

    @Override // okhttp3.ResponseBody
    public final long f() {
        return this.f12468b;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType g() {
        String str = this.f12467a;
        if (str == null) {
            return null;
        }
        try {
            return MediaType.a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
