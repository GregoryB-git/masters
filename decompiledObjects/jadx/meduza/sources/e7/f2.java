package e7;

import android.content.Context;
import android.content.res.Resources;
import io.meduza.meduza.R;

/* loaded from: classes.dex */
public final class f2 {
    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }
}
