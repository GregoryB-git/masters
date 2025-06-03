package u;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class r extends s {

    public static class a {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }
    }

    @Override // u.s
    public final void a(Bundle bundle) {
        super.a(bundle);
        bundle.putInt("android.callType", 0);
        bundle.putBoolean("android.callIsVideo", false);
        bundle.putCharSequence("android.verificationText", null);
        bundle.putParcelable("android.answerIntent", null);
        bundle.putParcelable("android.declineIntent", null);
        bundle.putParcelable("android.hangUpIntent", null);
    }

    @Override // u.s
    public final void b(t tVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            if (Log.isLoggable("NotifCompat", 3)) {
                StringBuilder l10 = defpackage.f.l("Unrecognized call type in CallStyle: ");
                l10.append(String.valueOf(0));
                Log.d("NotifCompat", l10.toString());
                return;
            }
            return;
        }
        Notification.Builder builder = tVar.f14847b;
        builder.setContentTitle(null);
        Bundle bundle = this.f14845a.f14840v;
        CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.f14845a.f14840v.getCharSequence("android.text");
        builder.setContentText(charSequence != null ? charSequence : null);
        a.b(builder, "call");
    }

    @Override // u.s
    public final String c() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }
}
