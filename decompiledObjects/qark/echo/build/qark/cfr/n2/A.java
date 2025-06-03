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
import i2.a;
import java.util.Map;
import n2.M;

public final class A
implements M.b {
    public final /* synthetic */ M a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ a.a c;

    public /* synthetic */ A(M m8, Map map, a.a a8) {
        this.a = m8;
        this.b = map;
        this.c = a8;
    }

    @Override
    public final Object apply(Object object) {
        return M.v(this.a, this.b, this.c, (Cursor)object);
    }
}

