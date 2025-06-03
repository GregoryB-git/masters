/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 *  java.lang.Object
 */
package n2;

import android.database.sqlite.SQLiteDatabase;
import n2.M;

public final class I
implements M.b {
    public final /* synthetic */ M a;
    public final /* synthetic */ long b;

    public /* synthetic */ I(M m8, long l8) {
        this.a = m8;
        this.b = l8;
    }

    @Override
    public final Object apply(Object object) {
        return M.G(this.a, this.b, (SQLiteDatabase)object);
    }
}

