/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package T3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class e {
    public static void a(boolean bl) {
        e.b(bl, "", new Object[0]);
    }

    public static /* varargs */ void b(boolean bl, String string2, Object ... arrobject) {
        if (bl) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hardAssert failed: ");
        stringBuilder.append(String.format((String)string2, (Object[])arrobject));
        throw new AssertionError((Object)stringBuilder.toString());
    }

    public static Long c(Object object) {
        if (object instanceof Integer) {
            return (long)((Integer)object);
        }
        if (object instanceof Long) {
            return (Long)object;
        }
        return null;
    }

    public static String d(List list) {
        if (list.isEmpty()) {
            return "/";
        }
        StringBuilder stringBuilder = new StringBuilder();
        list = list.iterator();
        boolean bl = true;
        while (list.hasNext()) {
            String string2 = (String)list.next();
            if (!bl) {
                stringBuilder.append("/");
            }
            stringBuilder.append(string2);
            bl = false;
        }
        return stringBuilder.toString();
    }

    public static List e(String arrstring) {
        ArrayList arrayList = new ArrayList();
        arrstring = arrstring.split("/", -1);
        for (int i8 = 0; i8 < arrstring.length; ++i8) {
            if (arrstring[i8].isEmpty()) continue;
            arrayList.add((Object)arrstring[i8]);
        }
        return arrayList;
    }
}

