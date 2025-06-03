package q6;

import android.os.Looper;
import java.util.List;
import p6.B0;
import u6.t;

/* loaded from: classes.dex */
public final class a implements t {
    @Override // u6.t
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // u6.t
    public B0 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new c(e.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // u6.t
    public int c() {
        return 1073741823;
    }
}
