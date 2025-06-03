package mb;

import eb.c;
import java.util.logging.Logger;
import n7.i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final c.b<EnumC0166a> f11148a;

    /* renamed from: mb.a$a, reason: collision with other inner class name */
    public enum EnumC0166a {
        /* JADX INFO: Fake field, exist only in values array */
        BLOCKING,
        /* JADX INFO: Fake field, exist only in values array */
        FUTURE,
        ASYNC
    }

    static {
        Logger.getLogger(a.class.getName());
        if (!i.a(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        }
        f11148a = new c.b<>("internal-stub-type");
    }
}
