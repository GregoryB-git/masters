package okhttp3;

import java.util.ArrayList;
import xc.f;
import xc.r;

/* loaded from: classes.dex */
public final class FormBody extends RequestBody {

    /* renamed from: a, reason: collision with root package name */
    public static final MediaType f12237a = MediaType.a("application/x-www-form-urlencoded");

    public static final class Builder {
        public Builder() {
            new ArrayList();
            new ArrayList();
        }
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        new f();
        throw null;
    }

    @Override // okhttp3.RequestBody
    public final MediaType b() {
        return f12237a;
    }

    @Override // okhttp3.RequestBody
    public final void d(r rVar) {
        throw null;
    }
}
