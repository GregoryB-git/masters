package okhttp3;

import java.util.ArrayList;
import java.util.UUID;
import xc.f;
import xc.i;
import xc.r;

/* loaded from: classes.dex */
public final class MultipartBody extends RequestBody {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f12264a = 0;

    public static final class Builder {
        public Builder() {
            String uuid = UUID.randomUUID().toString();
            int i10 = MultipartBody.f12264a;
            new ArrayList();
            i iVar = i.f17259d;
            i.a.a(uuid);
        }
    }

    public static final class Part {
    }

    static {
        MediaType.a("multipart/mixed");
        MediaType.a("multipart/alternative");
        MediaType.a("multipart/digest");
        MediaType.a("multipart/parallel");
        MediaType.a("multipart/form-data");
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        return 0L;
    }

    @Override // okhttp3.RequestBody
    public final MediaType b() {
        return null;
    }

    @Override // okhttp3.RequestBody
    public final void d(r rVar) {
        e(rVar, false);
        throw null;
    }

    public final void e(r rVar, boolean z10) {
        if (z10) {
            new f();
        }
        throw null;
    }
}
