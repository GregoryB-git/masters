// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q;

import android.os.BaseBundle;
import android.os.Parcelable;
import w.d;
import android.text.TextUtils;
import android.os.Build$VERSION;
import android.app.PendingIntent;
import android.os.IBinder;
import android.util.SparseArray;
import java.util.ArrayList;
import android.os.LocaleList;
import x.a;
import android.net.Uri;
import android.content.Context;
import android.os.Bundle;
import android.content.Intent;

public final class c
{
    public final Intent a;
    public final Bundle b;
    
    public c(final Intent a, final Bundle b) {
        this.a = a;
        this.b = b;
    }
    
    public void a(final Context context, final Uri data) {
        this.a.setData(data);
        x.a.j(context, this.a, this.b);
    }
    
    public abstract static class a
    {
        public static String a() {
            final LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }
    
    public static final class b
    {
        public final Intent a;
        public final q.a.a b;
        public ArrayList c;
        public Bundle d;
        public ArrayList e;
        public SparseArray f;
        public Bundle g;
        public int h;
        public boolean i;
        
        public b() {
            this.a = new Intent("android.intent.action.VIEW");
            this.b = new q.a.a();
            this.h = 0;
            this.i = true;
        }
        
        public b(final e e) {
            this.a = new Intent("android.intent.action.VIEW");
            this.b = new q.a.a();
            this.h = 0;
            this.i = true;
        }
        
        public c a() {
            if (!this.a.hasExtra("android.support.customtabs.extra.SESSION")) {
                this.c(null, null);
            }
            final ArrayList c = this.c;
            if (c != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", c);
            }
            final ArrayList e = this.e;
            if (e != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", e);
            }
            this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.i);
            this.a.putExtras(this.b.a().a());
            final Bundle g = this.g;
            if (g != null) {
                this.a.putExtras(g);
            }
            if (this.f != null) {
                final Bundle bundle = new Bundle();
                bundle.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f);
                this.a.putExtras(bundle);
            }
            this.a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.h);
            if (Build$VERSION.SDK_INT >= 24) {
                this.b();
            }
            return new c(this.a, this.d);
        }
        
        public final void b() {
            final String a = q.c.a.a();
            if (!TextUtils.isEmpty((CharSequence)a)) {
                Bundle bundleExtra;
                if (this.a.hasExtra("com.android.browser.headers")) {
                    bundleExtra = this.a.getBundleExtra("com.android.browser.headers");
                }
                else {
                    bundleExtra = new Bundle();
                }
                if (!((BaseBundle)bundleExtra).containsKey("Accept-Language")) {
                    ((BaseBundle)bundleExtra).putString("Accept-Language", a);
                    this.a.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
        }
        
        public final void c(final IBinder binder, final PendingIntent pendingIntent) {
            final Bundle bundle = new Bundle();
            w.d.b(bundle, "android.support.customtabs.extra.SESSION", binder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", (Parcelable)pendingIntent);
            }
            this.a.putExtras(bundle);
        }
    }
}
