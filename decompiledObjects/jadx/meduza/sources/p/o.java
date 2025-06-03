package p;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import java.util.ArrayList;
import p.a;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f12724a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f12725b;

    public static class a {
        public static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    public static class b {
        public static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    public static class c {
        public static void a(ActivityOptions activityOptions, boolean z10) {
            activityOptions.setShareIdentityEnabled(z10);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f12726a;

        /* renamed from: b, reason: collision with root package name */
        public final a.C0191a f12727b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList<Bundle> f12728c;

        /* renamed from: d, reason: collision with root package name */
        public ActivityOptions f12729d;

        /* renamed from: e, reason: collision with root package name */
        public Bundle f12730e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f12731g;

        public d() {
            this.f12726a = new Intent("android.intent.action.VIEW");
            this.f12727b = new a.C0191a();
            this.f = 0;
            this.f12731g = true;
        }

        public d(u uVar) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f12726a = intent;
            this.f12727b = new a.C0191a();
            this.f = 0;
            this.f12731g = true;
            if (uVar != null) {
                intent.setPackage(uVar.f12747d.getPackageName());
                IBinder asBinder = uVar.f12746c.asBinder();
                PendingIntent pendingIntent = uVar.f12748e;
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", asBinder);
                if (pendingIntent != null) {
                    bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                }
                intent.putExtras(bundle);
            }
        }

        public final o a() {
            if (!this.f12726a.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                this.f12726a.putExtras(bundle);
            }
            ArrayList<Bundle> arrayList = this.f12728c;
            if (arrayList != null) {
                this.f12726a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            this.f12726a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f12731g);
            Intent intent = this.f12726a;
            this.f12727b.getClass();
            intent.putExtras(new Bundle());
            Bundle bundle2 = this.f12730e;
            if (bundle2 != null) {
                this.f12726a.putExtras(bundle2);
            }
            this.f12726a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                String a10 = b.a();
                if (!TextUtils.isEmpty(a10)) {
                    Bundle bundleExtra = this.f12726a.hasExtra("com.android.browser.headers") ? this.f12726a.getBundleExtra("com.android.browser.headers") : new Bundle();
                    if (!bundleExtra.containsKey("Accept-Language")) {
                        bundleExtra.putString("Accept-Language", a10);
                        this.f12726a.putExtra("com.android.browser.headers", bundleExtra);
                    }
                }
            }
            if (i10 >= 34) {
                if (this.f12729d == null) {
                    this.f12729d = a.a();
                }
                c.a(this.f12729d, false);
            }
            ActivityOptions activityOptions = this.f12729d;
            return new o(this.f12726a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public final void b(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f = i10;
            if (i10 == 1) {
                this.f12726a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            } else if (i10 == 2) {
                this.f12726a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
            } else {
                this.f12726a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            }
        }
    }

    public o(Intent intent, Bundle bundle) {
        this.f12724a = intent;
        this.f12725b = bundle;
    }
}
