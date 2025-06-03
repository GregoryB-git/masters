package b3;

import java.util.concurrent.Executor;

/* renamed from: b3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0792a implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
