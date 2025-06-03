/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.LocaleList
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.SparseArray
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Locale
 */
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
import java.util.Locale;
import q.a;
import q.e;
import w.d;

public final class c {
    public final Intent a;
    public final Bundle b;

    public c(Intent intent, Bundle bundle) {
        this.a = intent;
        this.b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.a.setData(uri);
        x.a.j(context, this.a, this.b);
    }

    public static abstract class a {
        public static String a() {
            LocaleList localeList = LocaleList.getAdjustedDefault();
            if (localeList.size() > 0) {
                return localeList.get(0).toLanguageTag();
            }
            return null;
        }
    }

    public static final class b {
        public final Intent a = new Intent("android.intent.action.VIEW");
        public final a.a b = new a.a();
        public ArrayList c;
        public Bundle d;
        public ArrayList e;
        public SparseArray f;
        public Bundle g;
        public int h = 0;
        public boolean i = true;

        public b() {
        }

        public b(e e8) {
        }

        public c a() {
            ArrayList arrayList;
            if (!this.a.hasExtra("android.support.customtabs.extra.SESSION")) {
                this.c(null, null);
            }
            if ((arrayList = this.c) != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            if ((arrayList = this.e) != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList);
            }
            this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.i);
            this.a.putExtras(this.b.a().a());
            arrayList = this.g;
            if (arrayList != null) {
                this.a.putExtras((Bundle)arrayList);
            }
            if (this.f != null) {
                arrayList = new Bundle();
                arrayList.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f);
                this.a.putExtras((Bundle)arrayList);
            }
            this.a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.h);
            if (Build.VERSION.SDK_INT >= 24) {
                this.b();
            }
            return new c(this.a, this.d);
        }

        public final void b() {
            String string2 = a.a();
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                Bundle bundle = this.a.hasExtra("com.android.browser.headers") ? this.a.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundle.containsKey("Accept-Language")) {
                    bundle.putString("Accept-Language", string2);
                    this.a.putExtra("com.android.browser.headers", bundle);
                }
            }
        }

        public final void c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            d.b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", (Parcelable)pendingIntent);
            }
            this.a.putExtras(bundle);
        }
    }

}

