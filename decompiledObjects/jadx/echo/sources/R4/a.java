package R4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5669a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5670b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5671c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5672d;

    public a(String packageName, String versionName, String appBuildVersion, String deviceManufacturer) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        this.f5669a = packageName;
        this.f5670b = versionName;
        this.f5671c = appBuildVersion;
        this.f5672d = deviceManufacturer;
    }

    public final String a() {
        return this.f5671c;
    }

    public final String b() {
        return this.f5672d;
    }

    public final String c() {
        return this.f5669a;
    }

    public final String d() {
        return this.f5670b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.a(this.f5669a, aVar.f5669a) && Intrinsics.a(this.f5670b, aVar.f5670b) && Intrinsics.a(this.f5671c, aVar.f5671c) && Intrinsics.a(this.f5672d, aVar.f5672d);
    }

    public int hashCode() {
        return (((((this.f5669a.hashCode() * 31) + this.f5670b.hashCode()) * 31) + this.f5671c.hashCode()) * 31) + this.f5672d.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f5669a + ", versionName=" + this.f5670b + ", appBuildVersion=" + this.f5671c + ", deviceManufacturer=" + this.f5672d + ')';
    }
}
