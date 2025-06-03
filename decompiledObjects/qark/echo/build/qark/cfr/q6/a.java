/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package q6;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import kotlin.jvm.internal.g;
import p6.B0;
import q6.c;
import q6.e;
import u6.t;

public final class a
implements t {
    @Override
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override
    public B0 b(List list) {
        list = Looper.getMainLooper();
        if (list != null) {
            return new c(e.a((Looper)list, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override
    public int c() {
        return 1073741823;
    }
}

