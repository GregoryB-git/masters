// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Q5;

import java.util.List;
import android.util.Log;
import java.util.ArrayList;

public abstract class i
{
    public static ArrayList a(final Throwable t) {
        final ArrayList<String> list = new ArrayList<String>(3);
        list.add(t.toString());
        list.add(t.getClass().getSimpleName());
        final StringBuilder sb = new StringBuilder();
        sb.append("Cause: ");
        sb.append(t.getCause());
        sb.append(", Stacktrace: ");
        sb.append(Log.getStackTraceString(t));
        list.add(sb.toString());
        return list;
    }
    
    public interface a
    {
        String a();
        
        String b();
        
        String c();
        
        List d();
        
        String e();
        
        List f(final b p0);
        
        String g();
    }
    
    public enum b
    {
        p("ROOT", 0, 0), 
        q("MUSIC", 1, 1), 
        r("PODCASTS", 2, 2), 
        s("RINGTONES", 3, 3), 
        t("ALARMS", 4, 4), 
        u("NOTIFICATIONS", 5, 5), 
        v("PICTURES", 6, 6), 
        w("MOVIES", 7, 7), 
        x("DOWNLOADS", 8, 8), 
        y("DCIM", 9, 9), 
        z("DOCUMENTS", 10, 10);
        
        public final int o;
        
        static {
            A = c();
        }
        
        public b(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        public static /* synthetic */ b[] c() {
            return new b[] { b.p, b.q, b.r, b.s, b.t, b.u, b.v, b.w, b.x, b.y, b.z };
        }
    }
}
