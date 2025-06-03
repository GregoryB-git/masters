/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Executor
 */
import java.util.concurrent.Executor;

public final class h1
implements Executor {
    public final int a;

    public /* synthetic */ h1(int n) {
        this.a = n;
    }

    public final void execute(Runnable runnable) {
        switch (this.a) {
            default: {
                break;
            }
            case 4: {
                runnable.run();
                return;
            }
            case 3: {
                runnable.run();
                return;
            }
            case 2: {
                runnable.run();
                return;
            }
            case 1: {
                runnable.run();
                return;
            }
            case 0: {
                runnable.run();
                return;
            }
        }
        runnable.run();
    }
}

