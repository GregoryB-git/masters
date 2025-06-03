/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 *  java.lang.Object
 */
package n2;

import android.database.sqlite.SQLiteDatabase;
import f2.i;
import f2.p;
import n2.M;

public final class m
implements M.b {
    public final /* synthetic */ M a;
    public final /* synthetic */ i b;
    public final /* synthetic */ p c;

    public /* synthetic */ m(M m8, i i8, p p8) {
        this.a = m8;
        this.b = i8;
        this.c = p8;
    }

    @Override
    public final Object apply(Object object) {
        return M.x(this.a, this.b, this.c, (SQLiteDatabase)object);
    }
}

