package oc;

import android.os.Looper;
import java.util.List;
import nc.s1;
import sc.m;

/* loaded from: classes.dex */
public final class a implements m {
    @Override // sc.m
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // sc.m
    public s1 b(List<? extends m> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new f(h.a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // sc.m
    public int c() {
        return 1073741823;
    }
}
