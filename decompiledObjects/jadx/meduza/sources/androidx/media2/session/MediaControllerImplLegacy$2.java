package androidx.media2.session;

import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: classes.dex */
class MediaControllerImplLegacy$2 extends ResultReceiver {
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        new SessionResult(i10, bundle);
        throw null;
    }
}
