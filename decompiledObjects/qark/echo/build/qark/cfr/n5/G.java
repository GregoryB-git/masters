/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Locale
 */
package n5;

import android.database.Cursor;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o5.a;

public abstract class G {
    public static List a(Cursor cursor, int n8) {
        ArrayList arrayList = new ArrayList(n8);
        for (int i8 = 0; i8 < n8; ++i8) {
            Object object = G.b(cursor, i8);
            if (a.c) {
                Object object2;
                if (object != null) {
                    if (object.getClass().isArray()) {
                        object2 = new StringBuilder();
                        object2.append("array(");
                        object2.append(object.getClass().getComponentType().getName());
                        object2.append(")");
                        object2 = object2.toString();
                    } else {
                        object2 = object.getClass().getName();
                    }
                } else {
                    object2 = null;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("column ");
                stringBuilder.append(i8);
                stringBuilder.append(" ");
                stringBuilder.append(cursor.getType(i8));
                stringBuilder.append(": ");
                stringBuilder.append(object);
                if (object2 == null) {
                    object2 = "";
                } else {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(" (");
                    stringBuilder2.append((String)object2);
                    stringBuilder2.append(")");
                    object2 = stringBuilder2.toString();
                }
                stringBuilder.append((String)object2);
                Log.d((String)"Sqflite", (String)stringBuilder.toString());
            }
            arrayList.add(object);
        }
        return arrayList;
    }

    public static Object b(Cursor cursor, int n8) {
        int n9 = cursor.getType(n8);
        if (n9 != 1) {
            if (n9 != 2) {
                if (n9 != 3) {
                    if (n9 != 4) {
                        return null;
                    }
                    return cursor.getBlob(n8);
                }
                return cursor.getString(n8);
            }
            return cursor.getDouble(n8);
        }
        return cursor.getLong(n8);
    }

    public static Locale c(String string2) {
        return Locale.forLanguageTag((String)string2);
    }

    public static Locale d(String string2) {
        return G.c(string2);
    }
}

