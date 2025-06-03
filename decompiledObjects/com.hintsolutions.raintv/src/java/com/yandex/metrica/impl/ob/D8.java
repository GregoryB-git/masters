/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.J7;
import com.yandex.metrica.impl.ob.b8;

public class d8
implements b8 {
    private final J7 a;

    public d8(J7 j72) {
        this.a = j72;
    }

    @Override
    @Nullable
    public SQLiteDatabase a() {
        try {
            SQLiteDatabase sQLiteDatabase = this.a.getWritableDatabase();
            return sQLiteDatabase;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    @Override
    public void a(@Nullable SQLiteDatabase sQLiteDatabase) {
    }
}

