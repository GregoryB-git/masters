package O1;

import W5.C0681k;
import Y1.EnumC0712e;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
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
import x1.C2146B;
import x1.C2162o;
import x1.C2164q;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public static final E f3721a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f3722b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f3723c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f3724d;

    /* renamed from: e, reason: collision with root package name */
    public static final Map f3725e;

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicBoolean f3726f;

    /* renamed from: g, reason: collision with root package name */
    public static final Integer[] f3727g;

    public static final class a extends e {
        @Override // O1.E.e
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }

        @Override // O1.E.e
        public String d() {
            return "com.facebook.arstudio.player";
        }

        public Void g() {
            return null;
        }
    }

    public static final class b extends e {
        @Override // O1.E.e
        public String c() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // O1.E.e
        public String d() {
            return "com.instagram.android";
        }

        @Override // O1.E.e
        public String e() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    public static final class c extends e {
        @Override // O1.E.e
        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // O1.E.e
        public String d() {
            return "com.facebook.katana";
        }

        @Override // O1.E.e
        public void f() {
            if (g()) {
                Log.w(E.c(), "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }

        public final boolean g() {
            return C2146B.l().getApplicationInfo().targetSdkVersion >= 30;
        }
    }

    public static final class d extends e {
        @Override // O1.E.e
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }

        @Override // O1.E.e
        public String d() {
            return "com.facebook.orca";
        }

        public Void g() {
            return null;
        }
    }

    public static final class f {

        /* renamed from: c, reason: collision with root package name */
        public static final a f3729c = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public e f3730a;

        /* renamed from: b, reason: collision with root package name */
        public int f3731b;

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final f a(e eVar, int i7) {
                f fVar = new f(null);
                fVar.f3730a = eVar;
                fVar.f3731b = i7;
                return fVar;
            }

            public final f b() {
                f fVar = new f(null);
                fVar.f3731b = -1;
                return fVar;
            }
        }

        public f() {
        }

        public /* synthetic */ f(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final int c() {
            return this.f3731b;
        }
    }

    public static final class g extends e {
        @Override // O1.E.e
        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // O1.E.e
        public String d() {
            return "com.facebook.wakizashi";
        }
    }

    static {
        E e7 = new E();
        f3721a = e7;
        f3722b = E.class.getName();
        f3723c = e7.f();
        f3724d = e7.e();
        f3725e = e7.d();
        f3726f = new AtomicBoolean(false);
        f3727g = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    public static final Intent A(Context context, Intent intent, e eVar) {
        ResolveInfo resolveService;
        if (T1.a.d(E.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (intent == null || (resolveService = context.getPackageManager().resolveService(intent, 0)) == null) {
                return null;
            }
            C0448k c0448k = C0448k.f3856a;
            String str = resolveService.serviceInfo.packageName;
            Intrinsics.checkNotNullExpressionValue(str, "resolveInfo.serviceInfo.packageName");
            if (C0448k.a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th) {
            T1.a.b(th, E.class);
            return null;
        }
    }

    public static final /* synthetic */ TreeSet b(E e7, e eVar) {
        if (T1.a.d(E.class)) {
            return null;
        }
        try {
            return e7.o(eVar);
        } catch (Throwable th) {
            T1.a.b(th, E.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (T1.a.d(E.class)) {
            return null;
        }
        try {
            return f3722b;
        } catch (Throwable th) {
            T1.a.b(th, E.class);
            return null;
        }
    }

    public static final int h(TreeSet treeSet, int i7, int[] versionSpec) {
        if (T1.a.d(E.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(versionSpec, "versionSpec");
            if (treeSet == null) {
                return -1;
            }
            int length = versionSpec.length - 1;
            Iterator descendingIterator = treeSet.descendingIterator();
            int i8 = -1;
            while (descendingIterator.hasNext()) {
                Integer fbAppVersion = (Integer) descendingIterator.next();
                Intrinsics.checkNotNullExpressionValue(fbAppVersion, "fbAppVersion");
                i8 = Math.max(i8, fbAppVersion.intValue());
                while (length >= 0 && versionSpec[length] > fbAppVersion.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (versionSpec[length] == fbAppVersion.intValue()) {
                    if (length % 2 == 0) {
                        return Math.min(i8, i7);
                    }
                    return -1;
                }
            }
            return -1;
        } catch (Throwable th) {
            T1.a.b(th, E.class);
            return 0;
        }
    }

    public static final Bundle i(C2162o c2162o) {
        if (T1.a.d(E.class) || c2162o == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", c2162o.toString());
            if (c2162o instanceof C2164q) {
                bundle.putString("error_type", "UserCanceled");
            }
            return bundle;
        } catch (Throwable th) {
            T1.a.b(th, E.class);
            return null;
        }
    }

    public static final Intent j(Context context, String applicationId, Collection permissions, String e2e, boolean z7, boolean z8, EnumC0712e defaultAudience, String clientState, String authType, String str, boolean z9, boolean z10, boolean z11) {
        if (T1.a.d(E.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            Intrinsics.checkNotNullParameter(e2e, "e2e");
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            Intrinsics.checkNotNullParameter(clientState, "clientState");
            Intrinsics.checkNotNullParameter(authType, "authType");
            b bVar = new b();
            return z(context, f3721a.k(bVar, applicationId, permissions, e2e, z8, defaultAudience, clientState, authType, false, str, z9, Y1.B.INSTAGRAM, z10, z11, "", null, null), bVar);
        } catch (Throwable th) {
            T1.a.b(th, E.class);
            return null;
        }
    }

    public static final Intent l(Context context) {
        if (T1.a.d(E.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            for (e eVar : f3723c) {
                Intent A7 = A(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(eVar.d()).addCategory("android.intent.category.DEFAULT"), eVar);
                if (A7 != null) {
                    return A7;
                }
            }
            return null;
        } catch (Throwable th) {
            T1.a.b(th, E.class);
            return null;
        }
    }

    public static final Intent m(Intent requestIntent, Bundle bundle, C2162o c2162o) {
        if (T1.a.d(E.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(requestIntent, "requestIntent");
            UUID p7 = p(requestIntent);
            if (p7 == null) {
                return null;
            }
            Intent intent = new Intent();
            intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", v(requestIntent));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", p7.toString());
            if (c2162o != null) {
                bundle2.putBundle("error", i(c2162o));
            }
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle != null) {
                intent.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent;
        } catch (Throwable th) {
            T1.a.b(th, E.class);
            return null;
        }
    }

    public static final List n(Context context, String applicationId, Collection permissions, String e2e, boolean z7, boolean z8, EnumC0712e defaultAudience, String clientState, String authType, boolean z9, String str, boolean z10, boolean z11, boolean z12, String str2, String str3, String str4) {
        if (T1.a.d(E.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            Intrinsics.checkNotNullParameter(e2e, "e2e");
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            Intrinsics.checkNotNullParameter(clientState, "clientState");
            Intrinsics.checkNotNullParameter(authType, "authType");
            List list = f3723c;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ArrayList arrayList2 = arrayList;
                Intent k7 = f3721a.k((e) it.next(), applicationId, permissions, e2e, z8, defaultAudience, clientState, authType, z9, str, z10, Y1.B.FACEBOOK, z11, z12, str2, str3, str4);
                if (k7 != null) {
                    arrayList2.add(k7);
                }
                arrayList = arrayList2;
            }
            return arrayList;
        } catch (Throwable th) {
            T1.a.b(th, E.class);
            return null;
        }
    }

    public static final UUID p(Intent intent) {
        String stringExtra;
        if (T1.a.d(E.class) || intent == null) {
            return null;
        }
        try {
            if (w(v(intent))) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
            } else {
                stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (stringExtra == null) {
                return null;
            }
            try {
                return UUID.fromString(stringExtra);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } catch (Throwable th) {
            T1.a.b(th, E.class);
            return null;
        }
    }

    public static final C2162o q(Bundle bundle) {
        boolean l7;
        if (T1.a.d(E.class) || bundle == null) {
            return null;
        }
        try {
            String string = bundle.getString("error_type");
            if (string == null) {
                string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String string2 = bundle.getString("error_description");
            if (string2 == null) {
                string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            if (string != null) {
                l7 = kotlin.text.r.l(string, "UserCanceled", true);
                if (l7) {
                    return new C2164q(string2);
                }
            }
            return new C2162o(string2);
        } catch (Throwable th) {
            T1.a.b(th, E.class);
            return null;
        }
    }

    public static final int s(int i7) {
        if (T1.a.d(E.class)) {
            return 0;
        }
        try {
            return f3721a.r(f3723c, new int[]{i7}).c();
        } catch (Throwable th) {
            T1.a.b(th, E.class);
            return 0;
        }
    }

    public static final int t() {
        if (T1.a.d(E.class)) {
            return 0;
        }
        try {
            return f3727g[0].intValue();
        } catch (Throwable th) {
            T1.a.b(th, E.class);
            return 0;
        }
    }

    public static final Bundle u(Intent intent) {
        if (T1.a.d(E.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return !w(v(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            T1.a.b(th, E.class);
            return null;
        }
    }

    public static final int v(Intent intent) {
        if (T1.a.d(E.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            T1.a.b(th, E.class);
            return 0;
        }
    }

    public static final boolean w(int i7) {
        boolean h7;
        if (T1.a.d(E.class)) {
            return false;
        }
        try {
            h7 = C0681k.h(f3727g, Integer.valueOf(i7));
            return h7 && i7 >= 20140701;
        } catch (Throwable th) {
            T1.a.b(th, E.class);
            return false;
        }
    }

    public static final void x() {
        if (T1.a.d(E.class)) {
            return;
        }
        try {
            if (f3726f.compareAndSet(false, true)) {
                C2146B.t().execute(new Runnable() { // from class: O1.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        E.y();
                    }
                });
            }
        } catch (Throwable th) {
            T1.a.b(th, E.class);
        }
    }

    public static final void y() {
        if (T1.a.d(E.class)) {
            return;
        }
        try {
            try {
                Iterator it = f3723c.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).a(true);
                }
            } finally {
                f3726f.set(false);
            }
        } catch (Throwable th) {
            T1.a.b(th, E.class);
        }
    }

    public static final Intent z(Context context, Intent intent, e eVar) {
        ResolveInfo resolveActivity;
        if (T1.a.d(E.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (intent == null || (resolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null) {
                return null;
            }
            C0448k c0448k = C0448k.f3856a;
            String str = resolveActivity.activityInfo.packageName;
            Intrinsics.checkNotNullExpressionValue(str, "resolveInfo.activityInfo.packageName");
            if (C0448k.a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th) {
            T1.a.b(th, E.class);
            return null;
        }
    }

    public final Map d() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new d());
            List list = f3723c;
            hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", f3724d);
            hashMap.put("com.facebook.platform.action.request.SHARE_STORY", list);
            return hashMap;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final List e() {
        ArrayList d7;
        if (T1.a.d(this)) {
            return null;
        }
        try {
            d7 = W5.o.d(new a());
            d7.addAll(f());
            return d7;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final List f() {
        ArrayList d7;
        if (T1.a.d(this)) {
            return null;
        }
        try {
            d7 = W5.o.d(new c(), new g());
            return d7;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final Uri g(e eVar) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            Uri parse = Uri.parse("content://" + eVar.d() + ".provider.PlatformProvider/versions");
            Intrinsics.checkNotNullExpressionValue(parse, "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)");
            return parse;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final Intent k(e eVar, String str, Collection collection, String str2, boolean z7, EnumC0712e enumC0712e, String str3, String str4, boolean z8, String str5, boolean z9, Y1.B b7, boolean z10, boolean z11, String str6, String str7, String str8) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            String c7 = eVar.c();
            if (c7 == null) {
                return null;
            }
            Intent putExtra = new Intent().setClassName(eVar.d(), c7).putExtra("client_id", str);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
            putExtra.putExtra("facebook_sdk_version", C2146B.B());
            if (!P.d0(collection)) {
                putExtra.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!P.c0(str2)) {
                putExtra.putExtra("e2e", str2);
            }
            putExtra.putExtra("state", str3);
            putExtra.putExtra("response_type", eVar.e());
            putExtra.putExtra("nonce", str6);
            putExtra.putExtra("return_scopes", "true");
            if (z7) {
                putExtra.putExtra("default_audience", enumC0712e.e());
            }
            putExtra.putExtra("legacy_override", C2146B.w());
            putExtra.putExtra("auth_type", str4);
            if (z8) {
                putExtra.putExtra("fail_on_logged_out", true);
            }
            putExtra.putExtra("messenger_page_id", str5);
            putExtra.putExtra("reset_messenger_state", z9);
            if (z10) {
                putExtra.putExtra("fx_app", b7.toString());
            }
            if (z11) {
                putExtra.putExtra("skip_dedupe", true);
            }
            return putExtra;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007c A[Catch: all -> 0x0080, TRY_ENTER, TryCatch #0 {all -> 0x0080, blocks: (B:6:0x000c, B:29:0x0088, B:30:0x0085, B:17:0x007c), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[EXC_TOP_SPLITTER, LOOP:0: B:19:0x005d->B:22:0x0063, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:6:0x000c, B:29:0x0088, B:30:0x0085, B:17:0x007c), top: B:5:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.TreeSet o(O1.E.e r13) {
        /*
            r12 = this;
            java.lang.String r0 = "version"
            java.lang.String r1 = "Failed to query content resolver."
            boolean r2 = T1.a.d(r12)
            r3 = 0
            if (r2 == 0) goto Lc
            return r3
        Lc:
            java.util.TreeSet r2 = new java.util.TreeSet     // Catch: java.lang.Throwable -> L80
            r2.<init>()     // Catch: java.lang.Throwable -> L80
            android.content.Context r4 = x1.C2146B.l()     // Catch: java.lang.Throwable -> L80
            android.content.ContentResolver r5 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L80
            r4 = 1
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L80
            r4 = 0
            r7[r4] = r0     // Catch: java.lang.Throwable -> L80
            android.net.Uri r6 = r12.g(r13)     // Catch: java.lang.Throwable -> L80
            android.content.Context r8 = x1.C2146B.l()     // Catch: java.lang.Throwable -> L3a
            android.content.pm.PackageManager r8 = r8.getPackageManager()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r13 = r13.d()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r9 = ".provider.PlatformProvider"
            java.lang.String r13 = kotlin.jvm.internal.Intrinsics.i(r13, r9)     // Catch: java.lang.Throwable -> L3a
            android.content.pm.ProviderInfo r13 = r8.resolveContentProvider(r13, r4)     // Catch: java.lang.Throwable -> L3a java.lang.RuntimeException -> L3d
            goto L44
        L3a:
            r13 = move-exception
            r0 = r3
            goto L82
        L3d:
            r13 = move-exception
            java.lang.String r4 = O1.E.f3722b     // Catch: java.lang.Throwable -> L3a
            android.util.Log.e(r4, r1, r13)     // Catch: java.lang.Throwable -> L3a
            r13 = r3
        L44:
            if (r13 == 0) goto L78
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r13 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L3a java.lang.IllegalArgumentException -> L4e java.lang.SecurityException -> L55 java.lang.NullPointerException -> L58
            goto L5b
        L4e:
            java.lang.String r13 = O1.E.f3722b     // Catch: java.lang.Throwable -> L3a
        L50:
            android.util.Log.e(r13, r1)     // Catch: java.lang.Throwable -> L3a
            r13 = r3
            goto L5b
        L55:
            java.lang.String r13 = O1.E.f3722b     // Catch: java.lang.Throwable -> L3a
            goto L50
        L58:
            java.lang.String r13 = O1.E.f3722b     // Catch: java.lang.Throwable -> L3a
            goto L50
        L5b:
            if (r13 == 0) goto L79
        L5d:
            boolean r1 = r13.moveToNext()     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L79
            int r1 = r13.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L73
            int r1 = r13.getInt(r1)     // Catch: java.lang.Throwable -> L73
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L73
            r2.add(r1)     // Catch: java.lang.Throwable -> L73
            goto L5d
        L73:
            r0 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
            goto L82
        L78:
            r13 = r3
        L79:
            if (r13 != 0) goto L7c
            goto L7f
        L7c:
            r13.close()     // Catch: java.lang.Throwable -> L80
        L7f:
            return r2
        L80:
            r13 = move-exception
            goto L89
        L82:
            if (r0 != 0) goto L85
            goto L88
        L85:
            r0.close()     // Catch: java.lang.Throwable -> L80
        L88:
            throw r13     // Catch: java.lang.Throwable -> L80
        L89:
            T1.a.b(r13, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.E.o(O1.E$e):java.util.TreeSet");
    }

    public final f r(List list, int[] iArr) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            x();
            if (list == null) {
                return f.f3729c.b();
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                int h7 = h(eVar.b(), t(), iArr);
                if (h7 != -1) {
                    return f.f3729c.a(eVar, h7);
                }
            }
            return f.f3729c.b();
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public TreeSet f3728a;

        public final synchronized void a(boolean z7) {
            TreeSet treeSet;
            if (!z7) {
                try {
                    TreeSet treeSet2 = this.f3728a;
                    if (treeSet2 != null) {
                        if (!Intrinsics.a(treeSet2 == null ? null : Boolean.valueOf(treeSet2.isEmpty()), Boolean.FALSE)) {
                        }
                        treeSet = this.f3728a;
                        if (treeSet != null || treeSet.isEmpty()) {
                            f();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f3728a = E.b(E.f3721a, this);
            treeSet = this.f3728a;
            if (treeSet != null) {
            }
            f();
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.a(r0 == null ? null : java.lang.Boolean.valueOf(r0.isEmpty()), java.lang.Boolean.FALSE) == false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.TreeSet b() {
            /*
                r2 = this;
                java.util.TreeSet r0 = r2.f3728a
                if (r0 == 0) goto L18
                if (r0 != 0) goto L8
                r0 = 0
                goto L10
            L8:
                boolean r0 = r0.isEmpty()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            L10:
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                boolean r0 = kotlin.jvm.internal.Intrinsics.a(r0, r1)
                if (r0 != 0) goto L1c
            L18:
                r0 = 0
                r2.a(r0)
            L1c:
                java.util.TreeSet r0 = r2.f3728a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: O1.E.e.b():java.util.TreeSet");
        }

        public abstract String c();

        public abstract String d();

        public String e() {
            return "id_token,token,signed_request,graph_domain";
        }

        public void f() {
        }
    }
}
