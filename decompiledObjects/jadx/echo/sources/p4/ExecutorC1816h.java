package p4;

import java.util.concurrent.Executor;

/* renamed from: p4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1816h implements Executor {

    /* renamed from: o, reason: collision with root package name */
    public static final Executor f18443o = new ExecutorC1816h();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
