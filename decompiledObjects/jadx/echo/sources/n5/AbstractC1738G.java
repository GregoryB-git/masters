package n5;

import android.database.Cursor;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o5.AbstractC1765a;

/* renamed from: n5.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1738G {
    public static List a(Cursor cursor, int i7) {
        String str;
        ArrayList arrayList = new ArrayList(i7);
        for (int i8 = 0; i8 < i7; i8++) {
            Object b7 = b(cursor, i8);
            if (AbstractC1765a.f18196c) {
                if (b7 == null) {
                    str = null;
                } else if (b7.getClass().isArray()) {
                    str = "array(" + b7.getClass().getComponentType().getName() + ")";
                } else {
                    str = b7.getClass().getName();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("column ");
                sb.append(i8);
                sb.append(" ");
                sb.append(cursor.getType(i8));
                sb.append(": ");
                sb.append(b7);
                sb.append(str == null ? "" : " (" + str + ")");
                Log.d("Sqflite", sb.toString());
            }
            arrayList.add(b7);
        }
        return arrayList;
    }

    public static Object b(Cursor cursor, int i7) {
        int type = cursor.getType(i7);
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i7));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i7));
        }
        if (type == 3) {
            return cursor.getString(i7);
        }
        if (type != 4) {
            return null;
        }
        return cursor.getBlob(i7);
    }

    public static Locale c(String str) {
        return Locale.forLanguageTag(str);
    }

    public static Locale d(String str) {
        return c(str);
    }
}
