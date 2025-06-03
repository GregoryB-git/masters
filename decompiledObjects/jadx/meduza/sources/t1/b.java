package t1;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

/* loaded from: classes.dex */
public interface b extends Closeable {
    void G();

    void J();

    Cursor V(e eVar, CancellationSignal cancellationSignal);

    void X();

    void h();

    boolean isOpen();

    boolean j0();

    void m(String str);

    boolean n0();

    f q(String str);

    Cursor y(e eVar);
}
