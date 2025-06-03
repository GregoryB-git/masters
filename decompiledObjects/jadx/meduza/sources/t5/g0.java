package t5;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class g0 implements k {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f14502a = new g0();

    @Override // t5.k
    public final long a(n nVar) {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // t5.k
    public final void close() {
    }

    @Override // t5.k
    public final void f(l0 l0Var) {
    }

    @Override // t5.k
    public final Map h() {
        return Collections.emptyMap();
    }

    @Override // t5.k
    public final Uri l() {
        return null;
    }

    @Override // t5.h
    public final int read(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }
}
