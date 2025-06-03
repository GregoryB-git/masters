package androidx.media2.common;

import android.media.MediaFormat;
import android.os.Bundle;
import androidx.versionedparcelable.CustomVersionedParcelable;

/* loaded from: classes.dex */
public class SessionPlayer$TrackInfo extends CustomVersionedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public int f1040a;

    /* renamed from: b, reason: collision with root package name */
    public int f1041b;

    /* renamed from: c, reason: collision with root package name */
    public MediaFormat f1042c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1043d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle f1044e;
    public final Object f = new Object();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SessionPlayer$TrackInfo) && this.f1040a == ((SessionPlayer$TrackInfo) obj).f1040a;
    }

    public final int hashCode() {
        return this.f1040a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getName());
        sb2.append('#');
        sb2.append(this.f1040a);
        sb2.append('{');
        int i10 = this.f1041b;
        sb2.append(i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 5 ? "UNKNOWN" : "METADATA" : "SUBTITLE" : "AUDIO" : "VIDEO");
        sb2.append(", ");
        sb2.append(this.f1042c);
        sb2.append(", isSelectable=");
        sb2.append(this.f1043d);
        sb2.append("}");
        return sb2.toString();
    }
}
