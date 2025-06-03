package f2;

import android.content.Context;
import java.io.Closeable;
import n2.InterfaceC1707d;

/* loaded from: classes.dex */
public abstract class v implements Closeable {

    public interface a {
        v a();

        a b(Context context);
    }

    public abstract InterfaceC1707d a();

    public abstract u b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }
}
