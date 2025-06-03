/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 *  java.lang.Object
 */
package n2;

import android.database.sqlite.SQLiteDatabase;
import f2.p;
import n2.M;

public final class n
implements M.b {
    public final /* synthetic */ M a;
    public final /* synthetic */ p b;

    public /* synthetic */ n(M m8, p p8) {
        this.a = m8;
        this.b = p8;
    }

    @Override
    public final Object apply(Object object) {
        return M.r(this.a, this.b, (SQLiteDatabase)object);
    }
}

