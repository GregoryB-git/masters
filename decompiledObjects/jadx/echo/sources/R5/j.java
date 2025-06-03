package R5;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class j {

    public interface a {
        Boolean a(String str, Long l7);

        Map b(String str, List list);

        Boolean c(String str, String str2);

        Boolean d(String str, List list);

        Boolean e(String str, List list);

        Boolean f(String str, Boolean bool);

        Boolean g(String str, Double d7);

        Boolean remove(String str);
    }

    public static ArrayList a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}
