package y2;

import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public final class j {
    public static final int a(WorkDatabase workDatabase, String str) {
        Long a10 = workDatabase.q().a(str);
        int longValue = a10 != null ? (int) a10.longValue() : 0;
        workDatabase.q().b(new x2.d(str, Long.valueOf(longValue != Integer.MAX_VALUE ? longValue + 1 : 0)));
        return longValue;
    }
}
