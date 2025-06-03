package android.app;

import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final /* synthetic */ class NotificationChannel implements Parcelable {
    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ NotificationChannel(String str, CharSequence charSequence, int i10) {
    }

    public native /* synthetic */ String getId();

    public native /* synthetic */ CharSequence getName();

    public native /* synthetic */ void setDescription(String str);

    public native /* synthetic */ void setName(CharSequence charSequence);

    public native /* synthetic */ void setShowBadge(boolean z10);

    public native /* synthetic */ void setSound(Uri uri, AudioAttributes audioAttributes);
}
