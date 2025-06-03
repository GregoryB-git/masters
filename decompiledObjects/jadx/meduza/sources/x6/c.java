package x6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import v6.e;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17198a;

    public c(Context context) {
        this.f17198a = context;
    }

    public final ApplicationInfo a(int i10, String str) {
        return this.f17198a.getPackageManager().getApplicationInfo(str, i10);
    }

    public final PackageInfo b(int i10, String str) {
        return this.f17198a.getPackageManager().getPackageInfo(str, i10);
    }

    public final boolean c() {
        String nameForUid;
        boolean isInstantApp;
        if (Binder.getCallingUid() == Process.myUid()) {
            return b.d0(this.f17198a);
        }
        if (!e.a() || (nameForUid = this.f17198a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        isInstantApp = this.f17198a.getPackageManager().isInstantApp(nameForUid);
        return isInstantApp;
    }
}
