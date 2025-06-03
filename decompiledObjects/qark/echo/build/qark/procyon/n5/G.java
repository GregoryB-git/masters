// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n5;

import java.util.Locale;
import android.util.Log;
import o5.a;
import java.util.ArrayList;
import java.util.List;
import android.database.Cursor;

public abstract class G
{
    public static List a(final Cursor cursor, final int initialCapacity) {
        final ArrayList<Object> list = new ArrayList<Object>(initialCapacity);
        for (int i = 0; i < initialCapacity; ++i) {
            final Object b = b(cursor, i);
            if (a.c) {
                String str;
                if (b != null) {
                    if (b.getClass().isArray()) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("array(");
                        sb.append(b.getClass().getComponentType().getName());
                        sb.append(")");
                        str = sb.toString();
                    }
                    else {
                        str = b.getClass().getName();
                    }
                }
                else {
                    str = null;
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("column ");
                sb2.append(i);
                sb2.append(" ");
                sb2.append(cursor.getType(i));
                sb2.append(": ");
                sb2.append(b);
                String string;
                if (str == null) {
                    string = "";
                }
                else {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(" (");
                    sb3.append(str);
                    sb3.append(")");
                    string = sb3.toString();
                }
                sb2.append(string);
                Log.d("Sqflite", sb2.toString());
            }
            list.add(b);
        }
        return list;
    }
    
    public static Object b(final Cursor cursor, final int n) {
        final int type = cursor.getType(n);
        if (type == 1) {
            return cursor.getLong(n);
        }
        if (type == 2) {
            return cursor.getDouble(n);
        }
        if (type == 3) {
            return cursor.getString(n);
        }
        if (type != 4) {
            return null;
        }
        return cursor.getBlob(n);
    }
    
    public static Locale c(final String languageTag) {
        return Locale.forLanguageTag(languageTag);
    }
    
    public static Locale d(final String s) {
        return c(s);
    }
}
