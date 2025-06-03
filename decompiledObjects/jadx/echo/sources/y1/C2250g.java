package y1;

import O1.P;
import android.content.Context;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.jvm.internal.Intrinsics;
import x1.C2146B;
import y1.C2244a;
import y1.C2248e;

/* renamed from: y1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2250g {

    /* renamed from: a, reason: collision with root package name */
    public static final C2250g f21372a = new C2250g();

    /* renamed from: b, reason: collision with root package name */
    public static final String f21373b = C2250g.class.getName();

    /* renamed from: y1.g$a */
    public static final class a extends ObjectInputStream {

        /* renamed from: o, reason: collision with root package name */
        public static final C0299a f21374o = new C0299a(null);

        /* renamed from: y1.g$a$a, reason: collision with other inner class name */
        public static final class C0299a {
            public C0299a() {
            }

            public /* synthetic */ C0299a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        public ObjectStreamClass readClassDescriptor() {
            Class cls;
            ObjectStreamClass resultClassDescriptor = super.readClassDescriptor();
            if (!Intrinsics.a(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                cls = Intrinsics.a(resultClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2") ? C2248e.b.class : C2244a.b.class;
                Intrinsics.checkNotNullExpressionValue(resultClassDescriptor, "resultClassDescriptor");
                return resultClassDescriptor;
            }
            resultClassDescriptor = ObjectStreamClass.lookup(cls);
            Intrinsics.checkNotNullExpressionValue(resultClassDescriptor, "resultClassDescriptor");
            return resultClassDescriptor;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009f A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:12:0x0028, B:14:0x002b, B:17:0x009f, B:23:0x0039, B:44:0x0074, B:46:0x0077, B:47:0x0089, B:50:0x0082, B:36:0x005e, B:38:0x0061, B:41:0x006c, B:33:0x0070, B:27:0x008a, B:29:0x008d, B:32:0x0098), top: B:3:0x0003, inners: #1, #4, #5, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized y1.C2238G a() {
        /*
            java.lang.Class<y1.g> r0 = y1.C2250g.class
            monitor-enter(r0)
            G1.g.b()     // Catch: java.lang.Throwable -> L35
            android.content.Context r1 = x1.C2146B.l()     // Catch: java.lang.Throwable -> L35
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 java.io.FileNotFoundException -> L55
            java.lang.String r4 = "context.openFileInput(PERSISTED_EVENTS_FILENAME)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 java.io.FileNotFoundException -> L55
            y1.g$a r4 = new y1.g$a     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 java.io.FileNotFoundException -> L55
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 java.io.FileNotFoundException -> L55
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 java.io.FileNotFoundException -> L55
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 java.io.FileNotFoundException -> L55
            java.lang.Object r3 = r4.readObject()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44 java.io.FileNotFoundException -> L8a
            if (r3 == 0) goto L46
            y1.G r3 = (y1.C2238G) r3     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44 java.io.FileNotFoundException -> L8a
            O1.P.j(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            r1.delete()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L38
            goto L40
        L35:
            r1 = move-exception
            goto La6
        L38:
            r1 = move-exception
            java.lang.String r2 = y1.C2250g.f21373b     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r2, r4, r1)     // Catch: java.lang.Throwable -> L35
        L40:
            r2 = r3
            goto L9d
        L42:
            r2 = move-exception
            goto L74
        L44:
            r3 = move-exception
            goto L57
        L46:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44 java.io.FileNotFoundException -> L8a
            java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents"
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44 java.io.FileNotFoundException -> L8a
            throw r3     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44 java.io.FileNotFoundException -> L8a
        L4e:
            r3 = move-exception
            r4 = r2
            r2 = r3
            goto L74
        L52:
            r3 = move-exception
            r4 = r2
            goto L57
        L55:
            r4 = r2
            goto L8a
        L57:
            java.lang.String r5 = y1.C2250g.f21373b     // Catch: java.lang.Throwable -> L42
            java.lang.String r6 = "Got unexpected exception while reading events: "
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> L42
            O1.P.j(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L6b
            r1.delete()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L6b
            goto L9d
        L6b:
            r1 = move-exception
            java.lang.String r3 = y1.C2250g.f21373b     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "Got unexpected exception when removing events file: "
        L70:
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> L35
            goto L9d
        L74:
            O1.P.j(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L81
            r1.delete()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L81
            goto L89
        L81:
            r1 = move-exception
            java.lang.String r3 = y1.C2250g.f21373b     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> L35
        L89:
            throw r2     // Catch: java.lang.Throwable -> L35
        L8a:
            O1.P.j(r4)     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L97
            r1.delete()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L97
            goto L9d
        L97:
            r1 = move-exception
            java.lang.String r3 = y1.C2250g.f21373b     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            goto L70
        L9d:
            if (r2 != 0) goto La4
            y1.G r2 = new y1.G     // Catch: java.lang.Throwable -> L35
            r2.<init>()     // Catch: java.lang.Throwable -> L35
        La4:
            monitor-exit(r0)
            return r2
        La6:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.C2250g.a():y1.G");
    }

    public static final void b(C2238G c2238g) {
        Context l7 = C2146B.l();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(l7.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream2.writeObject(c2238g);
                P.j(objectOutputStream2);
            } catch (Throwable th) {
                th = th;
                objectOutputStream = objectOutputStream2;
                try {
                    Log.w(f21373b, "Got unexpected exception while persisting events: ", th);
                    try {
                        l7.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception unused) {
                    }
                } finally {
                    P.j(objectOutputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
