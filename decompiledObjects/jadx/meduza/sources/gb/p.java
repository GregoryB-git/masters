package gb;

import eb.b0;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f6623c = Logger.getLogger(eb.d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Object f6624a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final eb.f0 f6625b;

    public p(eb.f0 f0Var, long j10, String str) {
        x6.b.y(str, "description");
        this.f6625b = f0Var;
        String d10 = defpackage.g.d(str, " created");
        b0.a aVar = b0.a.CT_INFO;
        Long valueOf = Long.valueOf(j10);
        x6.b.y(d10, "description");
        x6.b.y(valueOf, "timestampNanos");
        b(new eb.b0(d10, aVar, valueOf.longValue(), null));
    }

    public static void a(eb.f0 f0Var, Level level, String str) {
        Logger logger = f6623c;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + f0Var + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    public final void b(eb.b0 b0Var) {
        int ordinal = b0Var.f5026b.ordinal();
        Level level = ordinal != 2 ? ordinal != 3 ? Level.FINEST : Level.FINE : Level.FINER;
        synchronized (this.f6624a) {
        }
        a(this.f6625b, level, b0Var.f5025a);
    }
}
