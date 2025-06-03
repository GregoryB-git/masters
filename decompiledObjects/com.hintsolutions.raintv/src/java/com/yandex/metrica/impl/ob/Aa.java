/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.M7;
import com.yandex.metrica.impl.ob.b8;

class aa
implements M7 {
    @NonNull
    private final b8 a;

    public aa(@NonNull b8 b82, @NonNull String string) {
        this.a = b82;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(@NonNull String string, @NonNull byte[] byArray) {
        SQLiteDatabase sQLiteDatabase;
        block4: {
            SQLiteDatabase sQLiteDatabase2;
            sQLiteDatabase = null;
            sQLiteDatabase = sQLiteDatabase2 = this.a.a();
            if (sQLiteDatabase2 == null) break block4;
            try {
                sQLiteDatabase = new ContentValues();
                sQLiteDatabase.put("data_key", string);
                sQLiteDatabase.put("value", byArray);
                sQLiteDatabase2.insertWithOnConflict("binary_data", null, (ContentValues)sQLiteDatabase, 5);
                sQLiteDatabase = sQLiteDatabase2;
            }
            catch (Throwable throwable) {
                SQLiteDatabase sQLiteDatabase3;
                block5: {
                    sQLiteDatabase3 = sQLiteDatabase2;
                    break block5;
                    catch (Throwable throwable2) {
                        sQLiteDatabase3 = sQLiteDatabase;
                    }
                }
                sQLiteDatabase = sQLiteDatabase3;
            }
        }
        this.a.a(sQLiteDatabase);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] a(@NonNull String object) {
        SQLiteDatabase sQLiteDatabase;
        block10: {
            Cursor cursor;
            SQLiteDatabase sQLiteDatabase2;
            block8: {
                block9: {
                    sQLiteDatabase2 = this.a.a();
                    if (sQLiteDatabase2 == null) break block8;
                    try {
                        cursor = sQLiteDatabase2.query("binary_data", null, "data_key = ?", new String[]{object}, null, null, null);
                        if (cursor == null) break block9;
                    }
                    catch (Throwable throwable) {}
                    try {
                        if (cursor.getCount() != 1 || !cursor.moveToFirst()) break block9;
                        object = cursor.getBlob(cursor.getColumnIndexOrThrow("value"));
                    }
                    catch (Throwable throwable) {}
                    A2.a(cursor);
                    this.a.a(sQLiteDatabase2);
                    return object;
                }
                sQLiteDatabase = sQLiteDatabase2;
                object = cursor;
                if (cursor == null) break block10;
                cursor.getCount();
                catch (Throwable throwable) {
                    object = null;
                    sQLiteDatabase = null;
                }
                break block10;
            }
            object = null;
            sQLiteDatabase = sQLiteDatabase2;
            break block10;
            finally {
                sQLiteDatabase = sQLiteDatabase2;
                object = cursor;
            }
        }
        A2.a((Cursor)object);
        this.a.a(sQLiteDatabase);
        return null;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void b(@NonNull String var1_1) {
        block6: {
            var2_5 = var3_4 = this.a.a();
            if (var3_4 == null) break block6;
            var2_5 = new ContentValues();
            var2_5.put("data_key", var1_1);
            var3_4.delete("binary_data", "data_key = ?", new String[]{var1_1});
            catch (Throwable var1_2) {
                var2_5 = null;
            }
        }
lbl12:
        // 2 sources

        while (true) {
            this.a.a(var2_5);
            return;
        }
        finally {
            var2_5 = var3_4;
            ** continue;
        }
    }
}

