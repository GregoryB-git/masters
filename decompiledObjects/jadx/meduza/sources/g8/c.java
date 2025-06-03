package g8;

import android.content.Context;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5909a;

    /* renamed from: b, reason: collision with root package name */
    public a f5910b = null;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f5911a;

        /* renamed from: b, reason: collision with root package name */
        public final String f5912b;

        /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(g8.c r6) {
            /*
                r5 = this;
                r5.<init>()
                android.content.Context r0 = r6.f5909a
                java.lang.String r1 = "com.google.firebase.crashlytics.unity_version"
                java.lang.String r2 = "string"
                int r0 = j8.g.e(r0, r1, r2)
                r1 = 2
                java.lang.String r2 = "FirebaseCrashlytics"
                r3 = 0
                if (r0 == 0) goto L30
                java.lang.String r4 = "Unity"
                r5.f5911a = r4
                android.content.Context r6 = r6.f5909a
                android.content.res.Resources r6 = r6.getResources()
                java.lang.String r6 = r6.getString(r0)
                r5.f5912b = r6
                java.lang.String r0 = "Unity Editor version is: "
                java.lang.String r6 = defpackage.g.d(r0, r6)
                boolean r0 = android.util.Log.isLoggable(r2, r1)
                if (r0 == 0) goto L65
                goto L5d
            L30:
                java.lang.String r0 = "flutter_assets/NOTICES.Z"
                android.content.Context r4 = r6.f5909a
                android.content.res.AssetManager r4 = r4.getAssets()
                if (r4 != 0) goto L3b
                goto L4c
            L3b:
                android.content.Context r6 = r6.f5909a     // Catch: java.io.IOException -> L4c
                android.content.res.AssetManager r6 = r6.getAssets()     // Catch: java.io.IOException -> L4c
                java.io.InputStream r6 = r6.open(r0)     // Catch: java.io.IOException -> L4c
                if (r6 == 0) goto L4a
                r6.close()     // Catch: java.io.IOException -> L4c
            L4a:
                r6 = 1
                goto L4d
            L4c:
                r6 = 0
            L4d:
                if (r6 == 0) goto L61
                java.lang.String r6 = "Flutter"
                r5.f5911a = r6
                r5.f5912b = r3
                boolean r6 = android.util.Log.isLoggable(r2, r1)
                if (r6 == 0) goto L65
                java.lang.String r6 = "Development platform is: Flutter"
            L5d:
                android.util.Log.v(r2, r6, r3)
                goto L65
            L61:
                r5.f5911a = r3
                r5.f5912b = r3
            L65:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g8.c.a.<init>(g8.c):void");
        }
    }

    public c(Context context) {
        this.f5909a = context;
    }
}
