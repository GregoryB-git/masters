package p4;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: p4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1810b {

    /* renamed from: a, reason: collision with root package name */
    public static final Executor f18428a = ExecutorC1809a.f18427o;

    public static Executor a() {
        return f18428a;
    }

    public static ExecutorService b() {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new F2.a("firebase-iid-executor"));
    }
}
