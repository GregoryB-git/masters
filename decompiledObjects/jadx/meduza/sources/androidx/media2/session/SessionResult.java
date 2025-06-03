package androidx.media2.session;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.media2.common.MediaItem;
import androidx.versionedparcelable.CustomVersionedParcelable;

/* loaded from: classes.dex */
public class SessionResult extends CustomVersionedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public int f1111a;

    /* renamed from: b, reason: collision with root package name */
    public long f1112b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1113c;

    /* renamed from: d, reason: collision with root package name */
    public MediaItem f1114d;

    /* renamed from: e, reason: collision with root package name */
    public MediaItem f1115e;

    public SessionResult() {
    }

    public SessionResult(int i10, Bundle bundle) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f1111a = i10;
        this.f1113c = bundle;
        this.f1114d = null;
        this.f1112b = elapsedRealtime;
    }
}
