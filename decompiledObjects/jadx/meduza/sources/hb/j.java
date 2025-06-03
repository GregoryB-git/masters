package hb;

import c4.x;
import java.util.EnumMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Logger f7311a;

    /* renamed from: b, reason: collision with root package name */
    public final Level f7312b;

    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        HEADER_TABLE_SIZE(1),
        /* JADX INFO: Fake field, exist only in values array */
        ENABLE_PUSH(2),
        /* JADX INFO: Fake field, exist only in values array */
        MAX_CONCURRENT_STREAMS(4),
        /* JADX INFO: Fake field, exist only in values array */
        MAX_FRAME_SIZE(5),
        /* JADX INFO: Fake field, exist only in values array */
        MAX_HEADER_LIST_SIZE(6),
        /* JADX INFO: Fake field, exist only in values array */
        INITIAL_WINDOW_SIZE(7);


        /* renamed from: a, reason: collision with root package name */
        public final int f7314a;

        a(int i10) {
            this.f7314a = i10;
        }
    }

    public j(Level level) {
        Logger logger = Logger.getLogger(i.class.getName());
        x6.b.y(level, "level");
        this.f7312b = level;
        x6.b.y(logger, "logger");
        this.f7311a = logger;
    }

    public static String h(xc.f fVar) {
        long j10 = fVar.f17252b;
        if (j10 <= 64) {
            return fVar.l0().l();
        }
        return fVar.q0((int) Math.min(j10, 64L)).l() + "...";
    }

    public final boolean a() {
        return this.f7311a.isLoggable(this.f7312b);
    }

    public final void b(int i10, int i11, xc.f fVar, int i12, boolean z10) {
        if (a()) {
            this.f7311a.log(this.f7312b, a0.j.u(i10) + " DATA: streamId=" + i11 + " endStream=" + z10 + " length=" + i12 + " bytes=" + h(fVar));
        }
    }

    public final void c(int i10, int i11, jb.a aVar, xc.i iVar) {
        if (a()) {
            Logger logger = this.f7311a;
            Level level = this.f7312b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a0.j.u(i10));
            sb2.append(" GO_AWAY: lastStreamId=");
            sb2.append(i11);
            sb2.append(" errorCode=");
            sb2.append(aVar);
            sb2.append(" length=");
            sb2.append(iVar.i());
            sb2.append(" bytes=");
            xc.f fVar = new xc.f();
            fVar.z0(iVar);
            sb2.append(h(fVar));
            logger.log(level, sb2.toString());
        }
    }

    public final void d(int i10, long j10) {
        if (a()) {
            this.f7311a.log(this.f7312b, a0.j.u(i10) + " PING: ack=false bytes=" + j10);
        }
    }

    public final void e(int i10, int i11, jb.a aVar) {
        if (a()) {
            this.f7311a.log(this.f7312b, a0.j.u(i10) + " RST_STREAM: streamId=" + i11 + " errorCode=" + aVar);
        }
    }

    public final void f(int i10, x xVar) {
        if (a()) {
            Logger logger = this.f7311a;
            Level level = this.f7312b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a0.j.u(i10));
            sb2.append(" SETTINGS: ack=false settings=");
            EnumMap enumMap = new EnumMap(a.class);
            for (a aVar : a.values()) {
                if (xVar.a(aVar.f7314a)) {
                    enumMap.put((EnumMap) aVar, (a) Integer.valueOf(((int[]) xVar.f2334d)[aVar.f7314a]));
                }
            }
            sb2.append(enumMap.toString());
            logger.log(level, sb2.toString());
        }
    }

    public final void g(int i10, int i11, long j10) {
        if (a()) {
            this.f7311a.log(this.f7312b, a0.j.u(i10) + " WINDOW_UPDATE: streamId=" + i11 + " windowSizeIncrement=" + j10);
        }
    }
}
