/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ActivityNotFoundException
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.net.Uri
 *  android.os.Bundle
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Set
 */
package S5;

import S5.a;
import S5.h;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import q.b;
import q.c;

public final class i
implements a.b {
    public final Context a;
    public final a b;
    public Activity c;

    public i(Context context) {
        this(context, new h(context));
    }

    public i(Context context, a a8) {
        this.a = context;
        this.b = a8;
    }

    public static /* synthetic */ String f(Context context, Intent intent) {
        return i.j(context, intent);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static boolean g(Map var0) {
        var0 = var0.keySet().iterator();
        block9 : do {
            block10 : {
                var2_2 = var0.hasNext();
                var1_1 = 0;
                if (var2_2 == false) return false;
                var3_3 = ((String)var0.next()).toLowerCase(Locale.US);
                var3_3.hashCode();
                switch (var3_3.hashCode()) {
                    case 802785917: {
                        if (!var3_3.equals((Object)"accept-language")) break;
                        var1_1 = 3;
                        ** break;
                    }
                    case 785670158: {
                        if (!var3_3.equals((Object)"content-type")) break;
                        var1_1 = 2;
                        ** break;
                    }
                    case -1229727188: {
                        if (!var3_3.equals((Object)"content-language")) break;
                        var1_1 = 1;
                        ** break;
                    }
                    case -1423461112: {
                        if (var3_3.equals((Object)"accept")) break block10;
                    }
                }
                var1_1 = -1;
                ** break;
            }
            switch (var1_1) {
                case 0: 
                case 1: 
                case 2: 
                case 3: {
                    continue block9;
                }
            }
            break;
        } while (true);
        return true;
    }

    public static Bundle i(Map map) {
        Bundle bundle = new Bundle();
        for (String string2 : map.keySet()) {
            bundle.putString(string2, (String)map.get((Object)string2));
        }
        return bundle;
    }

    public static /* synthetic */ String j(Context context, Intent intent) {
        if ((context = intent.resolveActivity(context.getPackageManager())) == null) {
            return null;
        }
        return context.toShortString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean k(Context context, Uri uri, Bundle bundle) {
        c c8 = new c.b().a();
        c8.a.putExtra("com.android.browser.headers", bundle);
        try {
            c8.a(context, uri);
            return true;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            return false;
        }
    }

    @Override
    public Boolean a(String string2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse((String)string2));
        string2 = this.b.a(intent);
        if (string2 == null) {
            return Boolean.FALSE;
        }
        return "{com.android.fallback/com.android.fallback.Fallback}".equals((Object)string2) ^ true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public Boolean b(String string2, Boolean bl, a.d d8) {
        this.h();
        Bundle bundle = i.i(d8.d());
        if (bl.booleanValue() && !i.g(d8.d()) && i.k((Context)this.c, (Uri)(bl = Uri.parse((String)string2)), bundle)) {
            return Boolean.TRUE;
        }
        string2 = WebViewActivity.a((Context)this.c, string2, d8.c(), d8.b(), bundle);
        try {
            this.c.startActivity((Intent)string2);
            return Boolean.TRUE;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            return Boolean.FALSE;
        }
    }

    @Override
    public void c() {
        this.a.sendBroadcast(new Intent("close action"));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public Boolean d(String string2, Map map) {
        this.h();
        string2 = new Intent("android.intent.action.VIEW").setData(Uri.parse((String)string2)).putExtra("com.android.browser.headers", i.i(map));
        try {
            this.c.startActivity((Intent)string2);
            return Boolean.TRUE;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            return Boolean.FALSE;
        }
    }

    @Override
    public Boolean e() {
        boolean bl = b.a(this.a, Collections.emptyList()) != null;
        return bl;
    }

    public final void h() {
        if (this.c != null) {
            return;
        }
        throw new a.a("NO_ACTIVITY", "Launching a URL requires a foreground activity.", null);
    }

    public void l(Activity activity) {
        this.c = activity;
    }

    public static interface a {
        public String a(Intent var1);
    }

}

