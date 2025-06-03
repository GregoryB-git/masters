package I;

import android.view.ViewGroup;

/* renamed from: I.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0424v {

    /* renamed from: I.v$a */
    public static class a {
        public static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        public static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        public static void c(ViewGroup viewGroup, boolean z7) {
            viewGroup.setTransitionGroup(z7);
        }
    }

    public static boolean a(ViewGroup viewGroup) {
        return a.b(viewGroup);
    }
}
