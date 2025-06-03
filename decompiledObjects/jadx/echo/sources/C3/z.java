package C3;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class z {

    public enum a implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return a.INSTANCE;
    }

    public static Executor b(Executor executor) {
        return new A(executor);
    }
}
