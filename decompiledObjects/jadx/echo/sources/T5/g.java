package T5;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.window.layout.WindowMetrics;
import androidx.window.layout.l;

/* loaded from: classes.dex */
public abstract class g {

    public interface a {
        void a(float f7, float f8, float f9);
    }

    public static void a(Context context, a aVar) {
        Activity b7 = b(context);
        if (b7 != null) {
            WindowMetrics computeMaximumWindowMetrics = l.a().computeMaximumWindowMetrics(b7);
            aVar.a(computeMaximumWindowMetrics.getBounds().width(), computeMaximumWindowMetrics.getBounds().height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static Activity b(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }
}
