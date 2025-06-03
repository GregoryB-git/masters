package s7;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public interface e<V> extends Future<V> {
    void f(Runnable runnable, Executor executor);
}
