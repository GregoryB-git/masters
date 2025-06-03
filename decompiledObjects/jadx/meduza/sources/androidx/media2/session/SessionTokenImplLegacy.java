package androidx.media2.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media2.session.SessionToken;
import androidx.versionedparcelable.CustomVersionedParcelable;
import defpackage.f;
import java.util.Objects;

/* loaded from: classes.dex */
final class SessionTokenImplLegacy extends CustomVersionedParcelable implements SessionToken.SessionTokenImpl {

    /* renamed from: a, reason: collision with root package name */
    public MediaSessionCompat.Token f1123a;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f1124b;

    /* renamed from: c, reason: collision with root package name */
    public int f1125c;

    /* renamed from: d, reason: collision with root package name */
    public int f1126d;

    /* renamed from: e, reason: collision with root package name */
    public ComponentName f1127e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public Bundle f1128g;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SessionTokenImplLegacy)) {
            return false;
        }
        SessionTokenImplLegacy sessionTokenImplLegacy = (SessionTokenImplLegacy) obj;
        int i10 = this.f1126d;
        if (i10 != sessionTokenImplLegacy.f1126d) {
            return false;
        }
        if (i10 == 100) {
            return Objects.equals(this.f1123a, sessionTokenImplLegacy.f1123a);
        }
        if (i10 != 101) {
            return false;
        }
        return Objects.equals(this.f1127e, sessionTokenImplLegacy.f1127e);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1126d), this.f1127e, this.f1123a);
    }

    public final String toString() {
        StringBuilder l10 = f.l("SessionToken {legacyToken=");
        l10.append(this.f1123a);
        l10.append("}");
        return l10.toString();
    }
}
