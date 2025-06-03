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
import n2.M;

public final class K
implements M.b {
    public final /* synthetic */ M a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ K(M m8, String string2, String string3) {
        this.a = m8;
        this.b = string2;
        this.c = string3;
    }

    @Override
    public final Object apply(Object object) {
        return M.q(this.a, this.b, this.c, (SQLiteDatabase)object);
    }
}

