/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  java.lang.Object
 *  java.util.List
 */
package n2;

import android.database.Cursor;
import f2.p;
import java.util.List;
import n2.M;

public final class v
implements M.b {
    public final /* synthetic */ M a;
    public final /* synthetic */ List b;
    public final /* synthetic */ p c;

    public /* synthetic */ v(M m8, List list, p p8) {
        this.a = m8;
        this.b = list;
        this.c = p8;
    }

    @Override
    public final Object apply(Object object) {
        return M.H(this.a, this.b, this.c, (Cursor)object);
    }
}

