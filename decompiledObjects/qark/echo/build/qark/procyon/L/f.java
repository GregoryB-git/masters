// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package L;

import android.widget.AbsListView;
import android.widget.ListView;

public abstract class f
{
    public static void a(final ListView listView, final int n) {
        a.b(listView, n);
    }
    
    public abstract static class a
    {
        public static boolean a(final ListView listView, final int n) {
            return ((AbsListView)listView).canScrollList(n);
        }
        
        public static void b(final ListView listView, final int n) {
            ((AbsListView)listView).scrollListBy(n);
        }
    }
}
