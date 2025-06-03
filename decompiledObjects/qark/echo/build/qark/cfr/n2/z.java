/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  java.lang.Object
 *  java.util.Map
 */
package n2;

import android.database.Cursor;
import java.util.Map;
import n2.M;

public final class z
implements M.b {
    public final /* synthetic */ Map a;

    public /* synthetic */ z(Map map) {
        this.a = map;
    }

    @Override
    public final Object apply(Object object) {
        return M.F(this.a, (Cursor)object);
    }
}

