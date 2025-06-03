package R4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f5673a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5674b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5675c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5676d;

    /* renamed from: e, reason: collision with root package name */
    public final n f5677e;

    /* renamed from: f, reason: collision with root package name */
    public final a f5678f;

    public b(String appId, String deviceModel, String sessionSdkVersion, String osVersion, n logEnvironment, a androidAppInfo) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(sessionSdkVersion, "sessionSdkVersion");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(logEnvironment, "logEnvironment");
        Intrinsics.checkNotNullParameter(androidAppInfo, "androidAppInfo");
        this.f5673a = appId;
        this.f5674b = deviceModel;
        this.f5675c = sessionSdkVersion;
        this.f5676d = osVersion;
        this.f5677e = logEnvironment;
        this.f5678f = androidAppInfo;
    }

    public final a a() {
        return this.f5678f;
    }

    public final String b() {
        return this.f5673a;
    }

    public final String c() {
        return this.f5674b;
    }

    public final n d() {
        return this.f5677e;
    }

    public final String e() {
        return this.f5676d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.a(this.f5673a, bVar.f5673a) && Intrinsics.a(this.f5674b, bVar.f5674b) && Intrinsics.a(this.f5675c, bVar.f5675c) && Intrinsics.a(this.f5676d, bVar.f5676d) && this.f5677e == bVar.f5677e && Intrinsics.a(this.f5678f, bVar.f5678f);
    }

    public final String f() {
        return this.f5675c;
    }

    public int hashCode() {
        return (((((((((this.f5673a.hashCode() * 31) + this.f5674b.hashCode()) * 31) + this.f5675c.hashCode()) * 31) + this.f5676d.hashCode()) * 31) + this.f5677e.hashCode()) * 31) + this.f5678f.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.f5673a + ", deviceModel=" + this.f5674b + ", sessionSdkVersion=" + this.f5675c + ", osVersion=" + this.f5676d + ", logEnvironment=" + this.f5677e + ", androidAppInfo=" + this.f5678f + ')';
    }
}
