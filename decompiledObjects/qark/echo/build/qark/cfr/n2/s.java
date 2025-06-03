/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package n2;

import android.database.sqlite.SQLiteDatabase;
import i2.a;
import java.util.Map;
import n2.M;

public final class s
implements M.b {
    public final /* synthetic */ M a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ a.a d;

    public /* synthetic */ s(M m8, String string2, Map map, a.a a8) {
        this.a = m8;
        this.b = string2;
        this.c = map;
        this.d = a8;
    }

    @Override
    public final Object apply(Object object) {
        return M.J(this.a, this.b, this.c, this.d, (SQLiteDatabase)object);
    }
}

