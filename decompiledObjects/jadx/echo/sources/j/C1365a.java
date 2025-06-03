package j;

import android.content.Context;
import android.content.res.Configuration;

/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1365a {

    /* renamed from: a, reason: collision with root package name */
    public Context f15344a;

    public C1365a(Context context) {
        this.f15344a = context;
    }

    public static C1365a a(Context context) {
        return new C1365a(context);
    }

    public int b() {
        return this.f15344a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int c() {
        Configuration configuration = this.f15344a.getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        int i8 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i7 > 600) {
            return 5;
        }
        if (i7 > 960 && i8 > 720) {
            return 5;
        }
        if (i7 > 720 && i8 > 960) {
            return 5;
        }
        if (i7 >= 500) {
            return 4;
        }
        if (i7 > 640 && i8 > 480) {
            return 4;
        }
        if (i7 <= 480 || i8 <= 640) {
            return i7 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public boolean d() {
        return true;
    }
}
