package j9;

import ka.d0;
import ma.n1;

/* loaded from: classes.dex */
public final class p {
    public static n1 a(d0 d0Var) {
        return d0Var.Y().L("__local_write_time__").b0();
    }

    public static d0 b(d0 d0Var) {
        d0 K = d0Var.Y().K("__previous_value__");
        return c(K) ? b(K) : K;
    }

    public static boolean c(d0 d0Var) {
        d0 K = d0Var == null ? null : d0Var.Y().K("__type__");
        return K != null && "server_timestamp".equals(K.a0());
    }
}
