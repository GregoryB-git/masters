/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Map
 */
package R5;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class j {
    public static ArrayList a(Throwable throwable) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add((Object)throwable.toString());
        arrayList.add((Object)throwable.getClass().getSimpleName());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cause: ");
        stringBuilder.append((Object)throwable.getCause());
        stringBuilder.append(", Stacktrace: ");
        stringBuilder.append(Log.getStackTraceString((Throwable)throwable));
        arrayList.add((Object)stringBuilder.toString());
        return arrayList;
    }

    public static interface a {
        public Boolean a(String var1, Long var2);

        public Map b(String var1, List var2);

        public Boolean c(String var1, String var2);

        public Boolean d(String var1, List var2);

        public Boolean e(String var1, List var2);

        public Boolean f(String var1, Boolean var2);

        public Boolean g(String var1, Double var2);

        public Boolean remove(String var1);
    }

}

