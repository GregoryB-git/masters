/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.widget.ListView
 *  java.lang.Object
 */
package L;

import android.widget.ListView;

public abstract class f {
    public static void a(ListView listView, int n8) {
        a.b(listView, n8);
    }

    public static abstract class a {
        public static boolean a(ListView listView, int n8) {
            return listView.canScrollList(n8);
        }

        public static void b(ListView listView, int n8) {
            listView.scrollListBy(n8);
        }
    }

}

