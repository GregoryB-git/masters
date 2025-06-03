/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.ProviderInfo
 *  android.content.pm.ResolveInfo
 *  android.content.pm.ServiceInfo
 *  android.database.Cursor
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.TreeSet
 *  java.util.UUID
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package O1;

import O1.D;
import O1.P;
import O1.k;
import W5.m;
import Y1.B;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import x1.o;
import x1.q;

public final class E {
    public static final E a;
    public static final String b;
    public static final List c;
    public static final List d;
    public static final Map e;
    public static final AtomicBoolean f;
    public static final Integer[] g;

    static {
        E e8;
        a = e8 = new E();
        b = E.class.getName();
        c = e8.f();
        d = e8.e();
        e = e8.d();
        f = new AtomicBoolean(false);
        g = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    public static final Intent A(Context context, Intent intent, e object) {
        block7 : {
            block6 : {
                if (T1.a.d(E.class)) {
                    return null;
                }
                try {
                    Intrinsics.checkNotNullParameter((Object)context, "context");
                    if (intent != null) break block6;
                    return null;
                }
                catch (Throwable throwable) {
                    T1.a.b(throwable, E.class);
                    return null;
                }
            }
            object = context.getPackageManager().resolveService(intent, 0);
            if (object != null) break block7;
            return null;
        }
        k k8 = k.a;
        object = object.serviceInfo.packageName;
        Intrinsics.checkNotNullExpressionValue(object, "resolveInfo.serviceInfo.packageName");
        boolean bl = k.a(context, (String)object);
        if (!bl) {
            intent = null;
        }
        return intent;
    }

    public static /* synthetic */ void a() {
        E.y();
    }

    public static final /* synthetic */ TreeSet b(E e8, e e9) {
        if (T1.a.d(E.class)) {
            return null;
        }
        try {
            e8 = e8.o(e9);
            return e8;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, E.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (T1.a.d(E.class)) {
            return null;
        }
        try {
            String string2 = b;
            return string2;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, E.class);
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final int h(TreeSet treeSet, int n8, int[] arrn) {
        int n9;
        int n10;
        int n11;
        if (T1.a.d(E.class)) {
            return 0;
        }
        try {
            Integer n12;
            Intrinsics.checkNotNullParameter(arrn, "versionSpec");
            int n13 = -1;
            if (treeSet == null) {
                return -1;
            }
            int n14 = arrn.length - 1;
            treeSet = treeSet.descendingIterator();
            int n15 = -1;
            do {
                n9 = n13;
                if (!treeSet.hasNext()) return n9;
                n12 = (Integer)treeSet.next();
                Intrinsics.checkNotNullExpressionValue((Object)n12, "fbAppVersion");
                n11 = Math.max((int)n15, (int)n12);
                for (n10 = n14; n10 >= 0 && arrn[n10] > n12; --n10) {
                }
                if (n10 < 0) {
                    return -1;
                }
                n14 = n10;
                n15 = n11;
            } while (arrn[n10] != n12);
            n9 = n13;
        }
        catch (Throwable throwable) {}
        if (n10 % 2 != 0) return n9;
        return Math.min((int)n11, (int)n8);
        T1.a.b(throwable, E.class);
        return 0;
    }

    public static final Bundle i(o o8) {
        Throwable throwable2;
        block5 : {
            Bundle bundle;
            if (T1.a.d(E.class)) {
                return null;
            }
            if (o8 == null) {
                return null;
            }
            try {
                bundle = new Bundle();
                bundle.putString("error_description", o8.toString());
                if (o8 instanceof q) {
                    bundle.putString("error_type", "UserCanceled");
                    return bundle;
                }
            }
            catch (Throwable throwable2) {
                break block5;
            }
            return bundle;
        }
        T1.a.b(throwable2, E.class);
        return null;
    }

    public static final Intent j(Context context, String string2, Collection collection, String string3, boolean bl, boolean bl2, Y1.e e8, String string4, String string5, String string6, boolean bl3, boolean bl4, boolean bl5) {
        if (T1.a.d(E.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)context, "context");
            Intrinsics.checkNotNullParameter(string2, "applicationId");
            Intrinsics.checkNotNullParameter((Object)collection, "permissions");
            Intrinsics.checkNotNullParameter(string3, "e2e");
            Intrinsics.checkNotNullParameter((Object)e8, "defaultAudience");
            Intrinsics.checkNotNullParameter(string4, "clientState");
            Intrinsics.checkNotNullParameter(string5, "authType");
            b b8 = new b();
            context = E.z(context, a.k(b8, string2, collection, string3, bl2, e8, string4, string5, false, string6, bl3, B.r, bl4, bl5, "", null, null), b8);
            return context;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, E.class);
            return null;
        }
    }

    public static final Intent l(Context context) {
        Throwable throwable2;
        block4 : {
            if (T1.a.d(E.class)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter((Object)context, "context");
                for (e e8 : c) {
                    if ((e8 = E.A(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(e8.d()).addCategory("android.intent.category.DEFAULT"), e8)) == null) continue;
                    return e8;
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            return null;
        }
        T1.a.b(throwable2, E.class);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Intent m(Intent intent, Bundle bundle, o o8) {
        if (T1.a.d(E.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)intent, "requestIntent");
            UUID uUID = E.p(intent);
            if (uUID == null) {
                return null;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", E.v(intent));
            intent = new Bundle();
            intent.putString("action_id", uUID.toString());
            if (o8 != null) {
                intent.putBundle("error", E.i(o8));
            }
            intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", (Bundle)intent);
            if (bundle != null) {
                intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent2;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, E.class);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final List n(Context context, String string2, Collection collection, String string3, boolean bl, boolean bl2, Y1.e e8, String string4, String string5, boolean bl3, String string6, boolean bl4, boolean bl5, boolean bl6, String string7, String string8, String string9) {
        if (T1.a.d(E.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(string2, "applicationId");
            Intrinsics.checkNotNullParameter((Object)collection, "permissions");
            Intrinsics.checkNotNullParameter(string3, "e2e");
            Intrinsics.checkNotNullParameter((Object)e8, "defaultAudience");
            Intrinsics.checkNotNullParameter(string4, "clientState");
            Intrinsics.checkNotNullParameter(string5, "authType");
            Iterable iterable = (Iterable)c;
            context = new ArrayList();
            for (e e9 : iterable) {
                if ((e9 = a.k(e9, string2, collection, string3, bl2, e8, string4, string5, bl3, string6, bl4, B.q, bl5, bl6, string7, string8, string9)) == null) continue;
                context.add((Object)e9);
            }
            return context;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, E.class);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final UUID p(Intent object) {
        boolean bl = T1.a.d(E.class);
        UUID uUID = null;
        if (bl) {
            return null;
        }
        if (object == null) {
            return null;
        }
        try {
            if (E.w(E.v((Intent)object))) {
                if ((object = object.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS")) == null) return uUID;
                object = object.getString("action_id");
            } else {
                object = object.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (object == null) return uUID;
            try {
                return UUID.fromString((String)object);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return null;
            }
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, E.class);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final o q(Bundle object) {
        if (T1.a.d(E.class)) {
            return null;
        }
        if (object == null) {
            return null;
        }
        try {
            String string2;
            String string3;
            String string4 = string3 = object.getString("error_type");
            if (string3 == null) {
                string4 = object.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            string3 = string2 = object.getString("error_description");
            if (string2 == null) {
                string3 = object.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            if (string4 == null) return new o(string3);
            if (!i.l(string4, "UserCanceled", true)) return new o(string3);
            return new q(string3);
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, E.class);
        return null;
    }

    public static final int s(int n8) {
        if (T1.a.d(E.class)) {
            return 0;
        }
        try {
            n8 = a.r(c, new int[]{n8}).c();
            return n8;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, E.class);
            return 0;
        }
    }

    public static final int t() {
        if (T1.a.d(E.class)) {
            return 0;
        }
        try {
            int n8 = g[0];
            return n8;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, E.class);
            return 0;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Bundle u(Intent intent) {
        if (T1.a.d(E.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)intent, "intent");
            if (E.w(E.v(intent))) return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
            return intent.getExtras();
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, E.class);
        return null;
    }

    public static final int v(Intent intent) {
        if (T1.a.d(E.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)intent, "intent");
            int n8 = intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
            return n8;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, E.class);
            return 0;
        }
    }

    public static final boolean w(int n8) {
        boolean bl = T1.a.d(E.class);
        boolean bl2 = false;
        if (bl) {
            return false;
        }
        try {
            boolean bl3 = W5.g.h((Object[])g, n8);
            bl = bl2;
            if (bl3) {
                bl = bl2;
                if (n8 >= 20140701) {
                    bl = true;
                }
            }
            return bl;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, E.class);
            return false;
        }
    }

    public static final void x() {
        if (T1.a.d(E.class)) {
            return;
        }
        try {
            if (!f.compareAndSet(false, true)) {
                return;
            }
            x1.B.t().execute((Runnable)new D());
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, E.class);
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final void y() {
        if (T1.a.d(E.class)) {
            return;
        }
        try {
            var0 = E.c.iterator();
            while (var0.hasNext()) {
                ((e)var0.next()).a(true);
            }
        }
        catch (Throwable var0_1) {
            ** GOTO lbl14
        }
        try {
            E.f.set(false);
            return;
lbl14: // 1 sources:
            E.f.set(false);
            throw var0_1;
        }
        catch (Throwable var0_2) {}
        T1.a.b(var0_2, E.class);
    }

    public static final Intent z(Context context, Intent intent, e object) {
        block7 : {
            block6 : {
                if (T1.a.d(E.class)) {
                    return null;
                }
                try {
                    Intrinsics.checkNotNullParameter((Object)context, "context");
                    if (intent != null) break block6;
                    return null;
                }
                catch (Throwable throwable) {
                    T1.a.b(throwable, E.class);
                    return null;
                }
            }
            object = context.getPackageManager().resolveActivity(intent, 0);
            if (object != null) break block7;
            return null;
        }
        k k8 = k.a;
        object = object.activityInfo.packageName;
        Intrinsics.checkNotNullExpressionValue(object, "resolveInfo.activityInfo.packageName");
        boolean bl = k.a(context, (String)object);
        if (!bl) {
            intent = null;
        }
        return intent;
    }

    public final Map d() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Object)new d());
            List list = c;
            hashMap.put((Object)"com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", (Object)list);
            hashMap.put((Object)"com.facebook.platform.action.request.FEED_DIALOG", (Object)list);
            hashMap.put((Object)"com.facebook.platform.action.request.LIKE_DIALOG", (Object)list);
            hashMap.put((Object)"com.facebook.platform.action.request.APPINVITES_DIALOG", (Object)list);
            hashMap.put((Object)"com.facebook.platform.action.request.MESSAGE_DIALOG", (Object)arrayList);
            hashMap.put((Object)"com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", (Object)arrayList);
            hashMap.put((Object)"com.facebook.platform.action.request.CAMERA_EFFECT", (Object)d);
            hashMap.put((Object)"com.facebook.platform.action.request.SHARE_STORY", (Object)list);
            return hashMap;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return null;
        }
    }

    public final List e() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = m.d(new a());
            arrayList.addAll((Collection)this.f());
            return arrayList;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return null;
        }
    }

    public final List f() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = m.d(new c(), new g());
            return arrayList;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return null;
        }
    }

    public final Uri g(e e8) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("content://");
            stringBuilder.append(e8.d());
            stringBuilder.append(".provider.PlatformProvider/versions");
            e8 = Uri.parse((String)stringBuilder.toString());
            Intrinsics.checkNotNullExpressionValue(e8, "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)");
            return e8;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Intent k(e e8, String string2, Collection collection, String string3, boolean bl, Y1.e e9, String string4, String string5, boolean bl2, String string6, boolean bl3, B b8, boolean bl4, boolean bl5, String string7, String string8, String string9) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            string8 = e8.c();
            if (string8 == null) {
                return null;
            }
            string2 = new Intent().setClassName(e8.d(), string8).putExtra("client_id", string2);
            Intrinsics.checkNotNullExpressionValue(string2, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
            string2.putExtra("facebook_sdk_version", x1.B.B());
            if (!P.d0(collection)) {
                string2.putExtra("scope", TextUtils.join((CharSequence)",", (Iterable)((Iterable)collection)));
            }
            if (!P.c0(string3)) {
                string2.putExtra("e2e", string3);
            }
            string2.putExtra("state", string4);
            string2.putExtra("response_type", e8.e());
            string2.putExtra("nonce", string7);
            string2.putExtra("return_scopes", "true");
            if (bl) {
                string2.putExtra("default_audience", e9.e());
            }
            string2.putExtra("legacy_override", x1.B.w());
            string2.putExtra("auth_type", string5);
            if (bl2) {
                string2.putExtra("fail_on_logged_out", true);
            }
            string2.putExtra("messenger_page_id", string6);
            string2.putExtra("reset_messenger_state", bl3);
            if (bl4) {
                string2.putExtra("fx_app", b8.toString());
            }
            if (bl5) {
                string2.putExtra("skip_dedupe", true);
            }
            return string2;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
        return null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final TreeSet o(e object) {
        void var2_11;
        block17 : {
            Object object2;
            TreeSet treeSet;
            block18 : {
                block19 : {
                    block20 : {
                        Uri uri;
                        block16 : {
                            if (T1.a.d(this)) {
                                return null;
                            }
                            treeSet = new TreeSet();
                            object2 = x1.B.l().getContentResolver();
                            uri = this.g((e)object);
                            try {
                                PackageManager packageManager = x1.B.l().getPackageManager();
                                object = Intrinsics.i(object.d(), ".provider.PlatformProvider");
                                object = packageManager.resolveContentProvider((String)object, 0);
                                break block16;
                            }
                            catch (Throwable throwable) {
                                object = null;
                                break block17;
                            }
                            catch (RuntimeException runtimeException) {
                                Log.e((String)b, (String)"Failed to query content resolver.", (Throwable)runtimeException);
                                return treeSet;
                            }
                        }
                        if (object == null) return treeSet;
                        try {
                            object = object2.query(uri, new String[]{"version"}, null, null, null);
                            object2 = object;
                            if (object == null) break block18;
                            break block19;
                        }
                        catch (NullPointerException nullPointerException) {}
                        object = b;
                        break block20;
                        catch (SecurityException securityException) {}
                        object = b;
                        break block20;
                        catch (IllegalArgumentException illegalArgumentException) {}
                        object = b;
                    }
                    Log.e((String)object, (String)"Failed to query content resolver.");
                    return treeSet;
                }
                do {
                    object2 = object;
                    try {
                        if (!object.moveToNext()) break;
                        treeSet.add((Object)object.getInt(object.getColumnIndex("version")));
                    }
                    catch (Throwable throwable) {
                        break block17;
                    }
                } while (true);
            }
            if (object2 == null) {
                return treeSet;
            }
            try {
                object2.close();
                return treeSet;
            }
            catch (Throwable throwable) {}
            T1.a.b(throwable, this);
            return null;
        }
        if (object == null) throw var2_11;
        object.close();
        throw var2_11;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final f r(List object, int[] arrn) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            int n8;
            e e8;
            E.x();
            if (object == null) {
                return f.c.b();
            }
            object = object.iterator();
            do {
                if (object.hasNext()) continue;
                return f.c.b();
            } while ((n8 = E.h((e8 = (e)object.next()).b(), E.t(), arrn)) == -1);
            return f.c.a(e8, n8);
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
        return null;
    }

    public static final class a
    extends e {
        @Override
        public String d() {
            return "com.facebook.arstudio.player";
        }

        public Void g() {
            return null;
        }
    }

    public static final class b
    extends e {
        @Override
        public String c() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override
        public String d() {
            return "com.instagram.android";
        }

        @Override
        public String e() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    public static final class c
    extends e {
        @Override
        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override
        public String d() {
            return "com.facebook.katana";
        }

        @Override
        public void f() {
            if (this.g()) {
                Log.w((String)E.c(), (String)"Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }

        public final boolean g() {
            if (x1.B.l().getApplicationInfo().targetSdkVersion >= 30) {
                return true;
            }
            return false;
        }
    }

    public static final class d
    extends e {
        @Override
        public String d() {
            return "com.facebook.orca";
        }

        public Void g() {
            return null;
        }
    }

    public static abstract class e {
        public TreeSet a;

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public final void a(boolean var1_1) {
            block8 : {
                block7 : {
                    // MONITORENTER : this
                    if (var1_1) ** GOTO lbl8
                    var2_2 = this.a;
                    if (var2_2 == null) break block7;
                    var2_2 = var2_2 == null ? null : Boolean.valueOf((boolean)var2_2.isEmpty());
                    if (Intrinsics.a((Object)var2_2, (Object)Boolean.FALSE)) break block8;
                }
                this.a = E.b(E.a, this);
            }
            if ((var2_2 = this.a) == null || var2_2.isEmpty()) {
                this.f();
            }
            // MONITOREXIT : this
            return;
        }

        public final TreeSet b() {
            block3 : {
                block2 : {
                    TreeSet treeSet = this.a;
                    if (treeSet == null) break block2;
                    treeSet = treeSet == null ? null : Boolean.valueOf((boolean)treeSet.isEmpty());
                    if (Intrinsics.a((Object)treeSet, (Object)Boolean.FALSE)) break block3;
                }
                this.a(false);
            }
            return this.a;
        }

        public abstract String c();

        public abstract String d();

        public String e() {
            return "id_token,token,signed_request,graph_domain";
        }

        public void f() {
        }
    }

    public static final class f {
        public static final a c = new a(null);
        public e a;
        public int b;

        public f() {
        }

        public /* synthetic */ f(kotlin.jvm.internal.g g8) {
            this();
        }

        public static final /* synthetic */ void a(f f8, e e8) {
            f8.a = e8;
        }

        public static final /* synthetic */ void b(f f8, int n8) {
            f8.b = n8;
        }

        public final int c() {
            return this.b;
        }

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g g8) {
                this();
            }

            public final f a(e e8, int n8) {
                f f8 = new f(null);
                f.a(f8, e8);
                f.b(f8, n8);
                return f8;
            }

            public final f b() {
                f f8 = new f(null);
                f.b(f8, -1);
                return f8;
            }
        }

    }

    public static final class g
    extends e {
        @Override
        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override
        public String d() {
            return "com.facebook.wakizashi";
        }
    }

}

