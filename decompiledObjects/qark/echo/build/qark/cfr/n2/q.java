/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 *  java.lang.Object
 *  java.lang.String
 */
package n2;

import android.database.sqlite.SQLiteDatabase;
import i2.c;
import n2.M;

public final class q
implements M.b {
    public final /* synthetic */ String a;
    public final /* synthetic */ c.b b;
    public final /* synthetic */ long c;

    public /* synthetic */ q(String string2, c.b b8, long l8) {
        this.a = string2;
        this.b = b8;
        this.c = l8;
    }

    @Override
    public final Object apply(Object object) {
        return M.E(this.a, this.b, this.c, (SQLiteDatabase)object);
    }
}

