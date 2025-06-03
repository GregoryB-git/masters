package L;

import android.widget.ListView;

/* loaded from: classes.dex */
public abstract class f {

    public static class a {
        public static boolean a(ListView listView, int i7) {
            return listView.canScrollList(i7);
        }

        public static void b(ListView listView, int i7) {
            listView.scrollListBy(i7);
        }
    }

    public static void a(ListView listView, int i7) {
        a.b(listView, i7);
    }
}
