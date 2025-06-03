package T3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e {
    public static void a(boolean z7) {
        b(z7, "", new Object[0]);
    }

    public static void b(boolean z7, String str, Object... objArr) {
        if (z7) {
            return;
        }
        throw new AssertionError("hardAssert failed: " + String.format(str, objArr));
    }

    public static Long c(Object obj) {
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    public static String d(List list) {
        if (list.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        boolean z7 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!z7) {
                sb.append("/");
            }
            sb.append(str);
            z7 = false;
        }
        return sb.toString();
    }

    public static List e(String str) {
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("/", -1);
        for (int i7 = 0; i7 < split.length; i7++) {
            if (!split[i7].isEmpty()) {
                arrayList.add(split[i7]);
            }
        }
        return arrayList;
    }
}
