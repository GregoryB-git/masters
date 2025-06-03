package androidx.media2.session;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.media2.session.SessionToken;
import defpackage.f;
import java.util.Objects;

/* loaded from: classes.dex */
final class SessionTokenImplBase implements SessionToken.SessionTokenImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f1117a;

    /* renamed from: b, reason: collision with root package name */
    public int f1118b;

    /* renamed from: c, reason: collision with root package name */
    public String f1119c;

    /* renamed from: d, reason: collision with root package name */
    public String f1120d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f1121e;
    public ComponentName f;

    /* renamed from: g, reason: collision with root package name */
    public Bundle f1122g;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SessionTokenImplBase)) {
            return false;
        }
        SessionTokenImplBase sessionTokenImplBase = (SessionTokenImplBase) obj;
        return this.f1117a == sessionTokenImplBase.f1117a && TextUtils.equals(this.f1119c, sessionTokenImplBase.f1119c) && TextUtils.equals(this.f1120d, sessionTokenImplBase.f1120d) && this.f1118b == sessionTokenImplBase.f1118b && Objects.equals(this.f1121e, sessionTokenImplBase.f1121e);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1118b), Integer.valueOf(this.f1117a), this.f1119c, this.f1120d);
    }

    public final String toString() {
        StringBuilder l10 = f.l("SessionToken {pkg=");
        l10.append(this.f1119c);
        l10.append(" type=");
        l10.append(this.f1118b);
        l10.append(" service=");
        l10.append(this.f1120d);
        l10.append(" IMediaSession=");
        l10.append(this.f1121e);
        l10.append(" extras=");
        l10.append(this.f1122g);
        l10.append("}");
        return l10.toString();
    }
}
