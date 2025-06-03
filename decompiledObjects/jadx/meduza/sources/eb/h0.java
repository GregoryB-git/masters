package eb;

import eb.s0;
import java.nio.charset.Charset;
import java.util.BitSet;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f5116a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    public static final p7.a f5117b = s0.f5207e;

    public interface a<T> extends s0.g<T> {
    }

    public static s0.f a(String str, a aVar) {
        boolean z10 = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z10 = true;
        }
        BitSet bitSet = s0.d.f5211d;
        return new s0.f(str, z10, aVar);
    }
}
