/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map$Entry
 */
package com.yandex.metrica.impl.ob;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.T7;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class U7
implements T7 {
    private final HashMap<String, List<String>> a;

    public U7(@NonNull String string2, @NonNull HashMap<String, List<String>> hashMap) {
        this.a = hashMap;
    }

    /*
     * Loose catch block
     */
    public boolean a(SQLiteDatabase sQLiteDatabase) {
        boolean bl;
        block15: {
            Cursor cursor;
            Iterator iterator = this.a.entrySet().iterator();
            bl = true;
            while (true) {
                Cursor cursor2;
                Map.Entry entry;
                block16: {
                    if (!iterator.hasNext()) break block15;
                    entry = (Map.Entry)iterator.next();
                    cursor = null;
                    cursor2 = sQLiteDatabase.query((String)entry.getKey(), null, null, null, null, null, null);
                    if (cursor2 != null) break block16;
                    A2.a(cursor2);
                }
                cursor = cursor2;
                String string2 = (String)entry.getKey();
                cursor = cursor2;
                entry = (List)entry.getValue();
                cursor = cursor2;
                string2 = Arrays.asList((Object[])cursor2.getColumnNames());
                cursor = cursor2;
                Collections.sort((List)string2);
                cursor = cursor2;
                boolean bl2 = entry.equals((Object)string2);
                bl &= bl2;
                A2.a(cursor2);
                continue;
                break;
            }
            catch (Throwable throwable) {
                A2.a(cursor);
                throw throwable;
            }
        }
        return bl;
        {
            catch (Throwable throwable2) {}
        }
        finally {
            return false;
        }
    }
}

