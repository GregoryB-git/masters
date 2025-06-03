// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import android.database.Cursor;
import android.content.ContentResolver;
import android.os.BaseBundle;
import android.content.pm.PackageManager;
import android.util.Log;
import android.text.TextUtils;
import android.net.Uri;
import W5.m;
import java.util.HashMap;
import W5.g;
import kotlin.text.i;
import java.util.ArrayList;
import java.util.UUID;
import Y1.B;
import Y1.e;
import java.util.Collection;
import x1.q;
import android.os.Bundle;
import x1.o;
import java.util.Iterator;
import java.util.TreeSet;
import android.content.pm.ResolveInfo;
import kotlin.jvm.internal.Intrinsics;
import T1.a;
import android.content.Intent;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Map;
import java.util.List;

public final class E
{
    public static final E a;
    public static final String b;
    public static final List c;
    public static final List d;
    public static final Map e;
    public static final AtomicBoolean f;
    public static final Integer[] g;
    
    static {
        final E e2 = a = new E();
        b = E.class.getName();
        c = e2.f();
        d = e2.e();
        e = e2.d();
        f = new AtomicBoolean(false);
        g = new Integer[] { 20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101 };
    }
    
    public static final Intent A(final Context context, Intent intent, final e e) {
        if (T1.a.d(E.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (intent == null) {
                return null;
            }
            final ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService == null) {
                return null;
            }
            final k a = k.a;
            final String packageName = resolveService.serviceInfo.packageName;
            Intrinsics.checkNotNullExpressionValue(packageName, "resolveInfo.serviceInfo.packageName");
            if (!k.a(context, packageName)) {
                intent = null;
            }
            return intent;
        }
        finally {
            final Throwable t;
            T1.a.b(t, E.class);
            return null;
        }
    }
    
    public static final /* synthetic */ TreeSet b(final E e, final e e2) {
        if (T1.a.d(E.class)) {
            return null;
        }
        try {
            return e.o(e2);
        }
        finally {
            final Throwable t;
            T1.a.b(t, E.class);
            return null;
        }
    }
    
    public static final /* synthetic */ String c() {
        if (T1.a.d(E.class)) {
            return null;
        }
        try {
            return E.b;
        }
        finally {
            final Throwable t;
            T1.a.b(t, E.class);
            return null;
        }
    }
    
    public static final int h(final TreeSet set, final int n, final int[] array) {
        if (T1.a.d(E.class)) {
            return 0;
        }
        Label_0010: {
            break Label_0010;
        Label_0163:
            while (true) {
                int i;
            Label_0151_Outer:
                do {
                    Label_0110: {
                        break Label_0110;
                        while (true) {
                            try {
                                Intrinsics.checkNotNullParameter(array, "versionSpec");
                                final int n2 = -1;
                                if (set == null) {
                                    return -1;
                                }
                                int n3 = array.length - 1;
                                final Iterator<Integer> descendingIterator = set.descendingIterator();
                                int a = -1;
                                int min = 0;
                                Label_0038: {
                                    min = n2;
                                }
                                if (descendingIterator.hasNext()) {
                                    final Integer n4 = descendingIterator.next();
                                    Intrinsics.checkNotNullExpressionValue(n4, "fbAppVersion");
                                    final int max = Math.max(a, n4);
                                    for (i = n3; i >= 0 && array[i] > n4; --i) {}
                                    continue Label_0163;
                                }
                                Label_0148:
                                return min;
                                while (true) {
                                    min = n2;
                                    final int max;
                                    return Math.min(max, n);
                                    T1.a.b((Throwable)descendingIterator, E.class);
                                    return 0;
                                    min = Math.min(max, n);
                                    return min;
                                    n3 = i;
                                    a = max;
                                    continue Label_0151_Outer;
                                }
                            }
                            // iftrue(Label_0148:, i % 2 != 0)
                            // iftrue(Label_0038:, array[i] != n4.intValue())
                            finally {
                                continue;
                            }
                            break;
                        }
                    }
                    continue Label_0163;
                } while (i >= 0);
                break;
            }
        }
        return -1;
    }
    
    public static final Bundle i(final o o) {
        if (T1.a.d(E.class)) {
            return null;
        }
        if (o == null) {
            return null;
        }
        Label_0057: {
            Bundle bundle;
            try {
                bundle = new Bundle();
                ((BaseBundle)bundle).putString("error_description", o.toString());
                if (o instanceof q) {
                    ((BaseBundle)bundle).putString("error_type", "UserCanceled");
                    return bundle;
                }
            }
            finally {
                break Label_0057;
            }
            return bundle;
        }
        final Throwable t;
        T1.a.b(t, E.class);
        return null;
    }
    
    public static final Intent j(final Context context, final String s, final Collection collection, final String s2, final boolean b, final boolean b2, final Y1.e e, final String s3, final String s4, final String s5, final boolean b3, final boolean b4, final boolean b5) {
        if (T1.a.d(E.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(s, "applicationId");
            Intrinsics.checkNotNullParameter(collection, "permissions");
            Intrinsics.checkNotNullParameter(s2, "e2e");
            Intrinsics.checkNotNullParameter(e, "defaultAudience");
            Intrinsics.checkNotNullParameter(s3, "clientState");
            Intrinsics.checkNotNullParameter(s4, "authType");
            final b b6 = new b();
            return z(context, E.a.k((e)b6, s, collection, s2, b2, e, s3, s4, false, s5, b3, B.r, b4, b5, "", null, null), (e)b6);
        }
        finally {
            final Throwable t;
            T1.a.b(t, E.class);
            return null;
        }
    }
    
    public static final Intent l(final Context context) {
        if (T1.a.d(E.class)) {
            return null;
        }
        Label_0085: {
            try {
                Intrinsics.checkNotNullParameter(context, "context");
                for (final e e : E.c) {
                    final Intent a = A(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(e.d()).addCategory("android.intent.category.DEFAULT"), e);
                    if (a != null) {
                        return a;
                    }
                }
                return null;
            }
            finally {
                break Label_0085;
            }
            return null;
        }
        final Throwable t;
        T1.a.b(t, E.class);
        return null;
    }
    
    public static final Intent m(final Intent intent, final Bundle bundle, final o o) {
        if (T1.a.d(E.class)) {
            return null;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(intent, "requestIntent");
                final UUID p3 = p(intent);
                if (p3 == null) {
                    return null;
                }
                final Intent intent2 = new Intent();
                intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", v(intent));
                final Bundle bundle2 = new Bundle();
                ((BaseBundle)bundle2).putString("action_id", p3.toString());
                if (o != null) {
                    bundle2.putBundle("error", i(o));
                }
                intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
                if (bundle != null) {
                    intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
                }
                return intent2;
                final Throwable t;
                T1.a.b(t, E.class);
                return null;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final List n(final Context context, final String s, final Collection collection, final String s2, final boolean b, final boolean b2, final Y1.e e, final String s3, final String s4, final boolean b3, final String s5, final boolean b4, final boolean b5, final boolean b6, final String s6, final String s7, final String s8) {
        if (T1.a.d(E.class)) {
            return null;
        }
        while (true) {
            ArrayList<Intent> list = null;
        Label_0162:
            while (true) {
                Label_0157: {
                    try {
                        Intrinsics.checkNotNullParameter(s, "applicationId");
                        Intrinsics.checkNotNullParameter(collection, "permissions");
                        Intrinsics.checkNotNullParameter(s2, "e2e");
                        Intrinsics.checkNotNullParameter(e, "defaultAudience");
                        Intrinsics.checkNotNullParameter(s3, "clientState");
                        Intrinsics.checkNotNullParameter(s4, "authType");
                        Object iterator = E.c;
                        list = new ArrayList<Intent>();
                        iterator = ((Iterable)iterator).iterator();
                        if (!((Iterator)iterator).hasNext()) {
                            return list;
                        }
                        final Intent k = E.a.k(((Iterator<e>)iterator).next(), s, collection, s2, b2, e, s3, s4, b3, s5, b4, B.q, b5, b6, s6, s7, s8);
                        if (k != null) {
                            list.add(k);
                            break Label_0157;
                        }
                        break Label_0157;
                    }
                    finally {
                        break Label_0162;
                    }
                }
                continue;
            }
            T1.a.b((Throwable)list, E.class);
            return null;
        }
    }
    
    public static final UUID p(final Intent intent) {
        final boolean d = T1.a.d(E.class);
        UUID fromString = null;
        if (d) {
            return null;
        }
        if (intent == null) {
            return null;
        }
        while (true) {
            while (true) {
                Label_0087: {
                    while (true) {
                        try {
                            String name;
                            if (w(v(intent))) {
                                final Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                                if (bundleExtra == null) {
                                    break Label_0087;
                                }
                                name = ((BaseBundle)bundleExtra).getString("action_id");
                            }
                            else {
                                name = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
                            }
                            if (name == null) {
                                return fromString;
                            }
                            try {
                                fromString = UUID.fromString(name);
                                return fromString;
                                final Throwable t;
                                T1.a.b(t, E.class);
                                return null;
                            }
                            catch (IllegalArgumentException ex) {
                                return null;
                            }
                        }
                        finally {}
                        final Throwable t2;
                        final Throwable t = t2;
                        continue;
                    }
                }
                String name = null;
                continue;
            }
        }
    }
    
    public static final o q(final Bundle bundle) {
        if (T1.a.d(E.class)) {
            return null;
        }
        if (bundle == null) {
            return null;
        }
        while (true) {
            try {
                String s;
                if ((s = ((BaseBundle)bundle).getString("error_type")) == null) {
                    s = ((BaseBundle)bundle).getString("com.facebook.platform.status.ERROR_TYPE");
                }
                String s2;
                if ((s2 = ((BaseBundle)bundle).getString("error_description")) == null) {
                    s2 = ((BaseBundle)bundle).getString("com.facebook.platform.status.ERROR_DESCRIPTION");
                }
                if (s != null && i.l(s, "UserCanceled", true)) {
                    return new q(s2);
                }
                return new o(s2);
                final Throwable t;
                T1.a.b(t, E.class);
                return null;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final int s(int c) {
        if (T1.a.d(E.class)) {
            return 0;
        }
        try {
            c = E.a.r(E.c, new int[] { c }).c();
            return c;
        }
        finally {
            final Throwable t;
            T1.a.b(t, E.class);
            return 0;
        }
    }
    
    public static final int t() {
        if (T1.a.d(E.class)) {
            return 0;
        }
        try {
            return E.g[0];
        }
        finally {
            final Throwable t;
            T1.a.b(t, E.class);
            return 0;
        }
    }
    
    public static final Bundle u(final Intent intent) {
        if (T1.a.d(E.class)) {
            return null;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(intent, "intent");
                if (!w(v(intent))) {
                    return intent.getExtras();
                }
                return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
                final Throwable t;
                T1.a.b(t, E.class);
                return null;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final int v(final Intent intent) {
        if (T1.a.d(E.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        }
        finally {
            final Throwable t;
            T1.a.b(t, E.class);
            return 0;
        }
    }
    
    public static final boolean w(final int i) {
        final boolean d = T1.a.d(E.class);
        final boolean b = false;
        if (d) {
            return false;
        }
        try {
            final boolean h = W5.g.h(E.g, i);
            boolean b2 = b;
            if (h) {
                b2 = b;
                if (i >= 20140701) {
                    b2 = true;
                }
            }
            return b2;
        }
        finally {
            final Throwable t;
            T1.a.b(t, E.class);
            return false;
        }
    }
    
    public static final void x() {
        if (T1.a.d(E.class)) {
            return;
        }
        try {
            if (!E.f.compareAndSet(false, true)) {
                return;
            }
            x1.B.t().execute(new D());
        }
        finally {
            final Throwable t;
            T1.a.b(t, E.class);
        }
    }
    
    public static final void y() {
        if (T1.a.d(E.class)) {
            return;
        }
        Label_0055: {
            try {
                final Iterator<e> iterator = E.c.iterator();
                while (iterator.hasNext()) {
                    iterator.next().a(true);
                }
            }
            finally {
                break Label_0055;
            }
            while (true) {
                try {
                    E.f.set(false);
                    return;
                    E.f.set(false);
                    throw;
                    final Throwable t2;
                    T1.a.b(t2, E.class);
                }
                finally {
                    continue;
                }
                break;
            }
        }
    }
    
    public static final Intent z(final Context context, Intent intent, final e e) {
        if (T1.a.d(E.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (intent == null) {
                return null;
            }
            final ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
            if (resolveActivity == null) {
                return null;
            }
            final k a = k.a;
            final String packageName = resolveActivity.activityInfo.packageName;
            Intrinsics.checkNotNullExpressionValue(packageName, "resolveInfo.activityInfo.packageName");
            if (!k.a(context, packageName)) {
                intent = null;
            }
            return intent;
        }
        finally {
            final Throwable t;
            T1.a.b(t, E.class);
            return null;
        }
    }
    
    public final Map d() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            final HashMap<String, ArrayList<d>> hashMap = new HashMap<String, ArrayList<d>>();
            final ArrayList<d> list = new ArrayList<d>();
            list.add(new d());
            final List c = E.c;
            hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", (ArrayList<d>)c);
            hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", (ArrayList<d>)c);
            hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", (ArrayList<d>)c);
            hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", (ArrayList<d>)c);
            hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", (ArrayList<d>)E.d);
            hashMap.put("com.facebook.platform.action.request.SHARE_STORY", (ArrayList<d>)c);
            return hashMap;
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return null;
        }
    }
    
    public final List e() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            final ArrayList d = m.d((e)new a());
            d.addAll(this.f());
            return d;
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return null;
        }
    }
    
    public final List f() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            return m.d((e)new c(), (e)new g());
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return null;
        }
    }
    
    public final Uri g(final e e) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append("content://");
            sb.append(e.d());
            sb.append(".provider.PlatformProvider/versions");
            final Uri parse = Uri.parse(sb.toString());
            Intrinsics.checkNotNullExpressionValue(parse, "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)");
            return parse;
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return null;
        }
    }
    
    public final Intent k(final e e, final String s, final Collection collection, final String s2, final boolean b, final Y1.e e2, final String s3, final String s4, final boolean b2, final String s5, final boolean b3, final B b4, final boolean b5, final boolean b6, final String s6, String c, final String s7) {
        if (T1.a.d(this)) {
            return null;
        }
        while (true) {
            try {
                c = e.c();
                if (c == null) {
                    return null;
                }
                final Intent putExtra = new Intent().setClassName(e.d(), c).putExtra("client_id", s);
                Intrinsics.checkNotNullExpressionValue(putExtra, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
                putExtra.putExtra("facebook_sdk_version", x1.B.B());
                if (!P.d0(collection)) {
                    putExtra.putExtra("scope", TextUtils.join((CharSequence)",", (Iterable)collection));
                }
                if (!P.c0(s2)) {
                    putExtra.putExtra("e2e", s2);
                }
                putExtra.putExtra("state", s3);
                putExtra.putExtra("response_type", e.e());
                putExtra.putExtra("nonce", s6);
                putExtra.putExtra("return_scopes", "true");
                if (b) {
                    putExtra.putExtra("default_audience", e2.e());
                }
                putExtra.putExtra("legacy_override", x1.B.w());
                putExtra.putExtra("auth_type", s4);
                if (b2) {
                    putExtra.putExtra("fail_on_logged_out", true);
                }
                putExtra.putExtra("messenger_page_id", s5);
                putExtra.putExtra("reset_messenger_state", b3);
                if (b5) {
                    putExtra.putExtra("fx_app", b4.toString());
                }
                if (b6) {
                    putExtra.putExtra("skip_dedupe", true);
                }
                return putExtra;
                final Throwable t;
                T1.a.b(t, this);
                return null;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final TreeSet o(e query) {
        if (T1.a.d(this)) {
            return null;
        }
        TreeSet<Integer> set;
        Object contentResolver;
        Uri g;
        PackageManager packageManager;
        String i;
        PackageManager packageManager2;
        String s;
        int n;
        final Object o;
        Object o2 = null;
        Throwable t = null;
        final Throwable t2;
        Label_0210_Outer:Label_0202_Outer:
        while (true) {
        Label_0208_Outer:
            while (true) {
                while (true) {
                    Label_0233: {
                        while (true) {
                            try {
                                set = new TreeSet<Integer>();
                                contentResolver = x1.B.l().getContentResolver();
                                g = this.g((e)query);
                                Label_0081: {
                                    try {
                                        packageManager = x1.B.l().getPackageManager();
                                        i = Intrinsics.i(((e)query).d(), ".provider.PlatformProvider");
                                        packageManager2 = packageManager;
                                        s = i;
                                        n = 0;
                                        packageManager2.resolveContentProvider(s, n);
                                        break Label_0081;
                                    }
                                    finally {
                                        contentResolver = o;
                                        o2 = null;
                                        break Label_0233;
                                    }
                                    try {
                                        packageManager2 = packageManager;
                                        s = i;
                                        n = 0;
                                        packageManager2.resolveContentProvider(s, n);
                                    }
                                    catch (RuntimeException ex) {
                                        Log.e(E.b, "Failed to query content resolver.", (Throwable)ex);
                                        o2 = null;
                                    }
                                }
                                Label_0186: {
                                    if (o2 == null) {
                                        break Label_0186;
                                    }
                                Label_0139_Outer:
                                    while (true) {
                                        while (true) {
                                            try {
                                                query = ((ContentResolver)contentResolver).query(g, new String[] { "version" }, (String)null, (String[])null, (String)null);
                                                while (true) {
                                                    contentResolver = query;
                                                    if (query != null) {
                                                        while (true) {
                                                            contentResolver = query;
                                                            try {
                                                                if (((Cursor)query).moveToNext()) {
                                                                    set.add(((Cursor)query).getInt(((Cursor)query).getColumnIndex("version")));
                                                                    continue Label_0139_Outer;
                                                                }
                                                                break;
                                                            }
                                                            finally {
                                                                break Label_0233;
                                                            }
                                                            contentResolver = null;
                                                            break;
                                                        }
                                                    }
                                                    if (contentResolver == null) {
                                                        return set;
                                                    }
                                                    ((Cursor)contentResolver).close();
                                                    return set;
                                                    T1.a.b(t, this);
                                                    return null;
                                                    ((Cursor)t).close();
                                                    throw contentResolver;
                                                    Log.e(E.b, "Failed to query content resolver.");
                                                    query = null;
                                                    continue Label_0210_Outer;
                                                }
                                                throw contentResolver;
                                            }
                                            catch (NullPointerException ex2) {}
                                            catch (SecurityException ex3) {}
                                            catch (IllegalArgumentException ex4) {}
                                            continue Label_0208_Outer;
                                        }
                                    }
                                }
                            }
                            finally {}
                            t = t2;
                            continue Label_0202_Outer;
                        }
                    }
                    if (t == null) {
                        continue;
                    }
                    break;
                }
                continue Label_0208_Outer;
            }
        }
    }
    
    public final f r(final List list, final int[] array) {
        if (T1.a.d(this)) {
            return null;
        }
        while (true) {
            try {
                x();
                if (list == null) {
                    return E.f.c.b();
                }
                for (final e e : list) {
                    final int h = h(e.b(), t(), array);
                    if (h != -1) {
                        return E.f.c.a(e, h);
                    }
                }
                return E.f.c.b();
                final Throwable t;
                T1.a.b(t, this);
                return null;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final class a extends e
    {
        @Override
        public String d() {
            return "com.facebook.arstudio.player";
        }
        
        public Void g() {
            return null;
        }
    }
    
    public static final class b extends e
    {
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
    
    public static final class c extends e
    {
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
                Log.w(E.c(), "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }
        
        public final boolean g() {
            return x1.B.l().getApplicationInfo().targetSdkVersion >= 30;
        }
    }
    
    public static final class d extends e
    {
        @Override
        public String d() {
            return "com.facebook.orca";
        }
        
        public Void g() {
            return null;
        }
    }
    
    public abstract static class e
    {
        public TreeSet a;
        
        public final void a(final boolean b) {
            // monitorenter(this)
            Label_0045: {
                if (b) {
                    break Label_0045;
                }
                while (true) {
                    try {
                        final TreeSet a = this.a;
                        Label_0056: {
                            if (a != null) {
                                Object value;
                                if (a == null) {
                                    value = null;
                                }
                                else {
                                    value = a.isEmpty();
                                }
                                if (Intrinsics.a(value, Boolean.FALSE)) {
                                    break Label_0056;
                                }
                            }
                            this.a = E.b(E.a, this);
                        }
                        final TreeSet a2 = this.a;
                        if (a2 == null || a2.isEmpty()) {
                            this.f();
                        }
                        // monitorexit(this)
                        return;
                        // monitorexit(this)
                        throw;
                    }
                    finally {
                        continue;
                    }
                    break;
                }
            }
        }
        
        public final TreeSet b() {
            final TreeSet a = this.a;
            if (a != null) {
                Object value;
                if (a == null) {
                    value = null;
                }
                else {
                    value = a.isEmpty();
                }
                if (Intrinsics.a(value, Boolean.FALSE)) {
                    return this.a;
                }
            }
            this.a(false);
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
    
    public static final class f
    {
        public static final a c;
        public e a;
        public int b;
        
        static {
            c = new a(null);
        }
        
        public static final /* synthetic */ void a(final f f, final e a) {
            f.a = a;
        }
        
        public static final /* synthetic */ void b(final f f, final int b) {
            f.b = b;
        }
        
        public final int c() {
            return this.b;
        }
        
        public static final class a
        {
            public final f a(final e e, final int n) {
                final f f = new f(null);
                E.f.a(f, e);
                E.f.b(f, n);
                return f;
            }
            
            public final f b() {
                final f f = new f(null);
                E.f.b(f, -1);
                return f;
            }
        }
    }
    
    public static final class g extends e
    {
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
