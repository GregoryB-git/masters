package p4;

import java.util.concurrent.Executor;

/* renamed from: p4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1812d implements Executor {

    /* renamed from: o, reason: collision with root package name */
    public static final Executor f18432o = new ExecutorC1812d();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
