package u;

import android.app.RemoteInput;
import android.os.Build;

/* loaded from: classes.dex */
public final class z {

    public static class a {
        public static int a(Object obj) {
            int editChoicesBeforeSending;
            editChoicesBeforeSending = ((RemoteInput) obj).getEditChoicesBeforeSending();
            return editChoicesBeforeSending;
        }

        public static RemoteInput.Builder b(RemoteInput.Builder builder, int i10) {
            RemoteInput.Builder editChoicesBeforeSending;
            editChoicesBeforeSending = builder.setEditChoicesBeforeSending(i10);
            return editChoicesBeforeSending;
        }
    }

    public static RemoteInput a(z zVar) {
        zVar.getClass();
        RemoteInput.Builder addExtras = new RemoteInput.Builder(null).setLabel(null).setChoices(null).setAllowFreeFormInput(false).addExtras(null);
        if (Build.VERSION.SDK_INT >= 29) {
            a.b(addExtras, 0);
        }
        return addExtras.build();
    }
}
