package q;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import q.C1878a;
import x.AbstractC2112a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f18592a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f18593b;

    public static class a {
        public static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f18596c;

        /* renamed from: d, reason: collision with root package name */
        public Bundle f18597d;

        /* renamed from: e, reason: collision with root package name */
        public ArrayList f18598e;

        /* renamed from: f, reason: collision with root package name */
        public SparseArray f18599f;

        /* renamed from: g, reason: collision with root package name */
        public Bundle f18600g;

        /* renamed from: a, reason: collision with root package name */
        public final Intent f18594a = new Intent("android.intent.action.VIEW");

        /* renamed from: b, reason: collision with root package name */
        public final C1878a.C0250a f18595b = new C1878a.C0250a();

        /* renamed from: h, reason: collision with root package name */
        public int f18601h = 0;

        /* renamed from: i, reason: collision with root package name */
        public boolean f18602i = true;

        public b() {
        }

        public c a() {
            if (!this.f18594a.hasExtra("android.support.customtabs.extra.SESSION")) {
                c(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.f18596c;
            if (arrayList != null) {
                this.f18594a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.f18598e;
            if (arrayList2 != null) {
                this.f18594a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f18594a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f18602i);
            this.f18594a.putExtras(this.f18595b.a().a());
            Bundle bundle = this.f18600g;
            if (bundle != null) {
                this.f18594a.putExtras(bundle);
            }
            if (this.f18599f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f18599f);
                this.f18594a.putExtras(bundle2);
            }
            this.f18594a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f18601h);
            if (Build.VERSION.SDK_INT >= 24) {
                b();
            }
            return new c(this.f18594a, this.f18597d);
        }

        public final void b() {
            String a7 = a.a();
            if (TextUtils.isEmpty(a7)) {
                return;
            }
            Bundle bundleExtra = this.f18594a.hasExtra("com.android.browser.headers") ? this.f18594a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", a7);
            this.f18594a.putExtra("com.android.browser.headers", bundleExtra);
        }

        public final void c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            w.d.b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f18594a.putExtras(bundle);
        }

        public b(e eVar) {
        }
    }

    public c(Intent intent, Bundle bundle) {
        this.f18592a = intent;
        this.f18593b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f18592a.setData(uri);
        AbstractC2112a.j(context, this.f18592a, this.f18593b);
    }
}
