package com.ryanheise.audioservice;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import com.ryanheise.audioservice.AudioService;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class b implements FlutterPlugin, ActivityAware {

    /* renamed from: p, reason: collision with root package name */
    public static d f3274p;

    /* renamed from: q, reason: collision with root package name */
    public static c f3275q;

    /* renamed from: s, reason: collision with root package name */
    public static MethodChannel.Result f3277s;
    public static boolean t;

    /* renamed from: u, reason: collision with root package name */
    public static MediaBrowserCompat f3278u;

    /* renamed from: v, reason: collision with root package name */
    public static MediaControllerCompat f3279v;

    /* renamed from: a, reason: collision with root package name */
    public Context f3281a;

    /* renamed from: b, reason: collision with root package name */
    public FlutterPlugin.FlutterPluginBinding f3282b;

    /* renamed from: c, reason: collision with root package name */
    public ActivityPluginBinding f3283c;

    /* renamed from: d, reason: collision with root package name */
    public ta.b f3284d;

    /* renamed from: e, reason: collision with root package name */
    public d f3285e;
    public final C0057b f = new C0057b();

    /* renamed from: o, reason: collision with root package name */
    public static final HashSet f3273o = new HashSet();

    /* renamed from: r, reason: collision with root package name */
    public static final long f3276r = System.currentTimeMillis() - SystemClock.elapsedRealtime();

    /* renamed from: w, reason: collision with root package name */
    public static final a f3280w = new a();

    public class a extends MediaControllerCompat.a {
    }

    /* renamed from: com.ryanheise.audioservice.b$b, reason: collision with other inner class name */
    public class C0057b extends MediaBrowserCompat.c {
        public C0057b() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public final void a() {
            try {
                MediaBrowserCompat.e eVar = b.f3278u.f423a;
                if (eVar.f437h == null) {
                    MediaSession.Token sessionToken = eVar.f432b.getSessionToken();
                    eVar.f437h = sessionToken != null ? new MediaSessionCompat.Token(sessionToken, null, null) : null;
                }
                b.f3279v = new MediaControllerCompat(b.this.f3281a, eVar.f437h);
                d dVar = b.f3274p;
                Activity activity = dVar != null ? dVar.f3293b : null;
                if (activity != null) {
                    MediaControllerCompat.b(activity, b.f3279v);
                }
                b.f3279v.a(b.f3280w);
                MethodChannel.Result result = b.f3277s;
                if (result != null) {
                    result.success(b.k(new Object[0]));
                    b.f3277s = null;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                throw new RuntimeException(e10);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public final void b() {
            MethodChannel.Result result = b.f3277s;
            if (result != null) {
                result.error("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.", null, null);
            } else {
                b.this.f3285e.f3296e = true;
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public final void c() {
            System.out.println("### UNHANDLED: onConnectionSuspended");
        }
    }

    public static class c implements MethodChannel.MethodCallHandler, AudioService.c {

        /* renamed from: a, reason: collision with root package name */
        public BinaryMessenger f3287a;

        /* renamed from: b, reason: collision with root package name */
        public MethodChannel f3288b;

        /* renamed from: c, reason: collision with root package name */
        public AudioTrack f3289c;

        /* renamed from: d, reason: collision with root package name */
        public final Handler f3290d = new Handler(Looper.getMainLooper());

        /* renamed from: e, reason: collision with root package name */
        public LinkedList f3291e = new LinkedList();

        public c(BinaryMessenger binaryMessenger) {
            this.f3287a = binaryMessenger;
            MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.ryanheise.audio_service.handler.methods");
            this.f3288b = methodChannel;
            methodChannel.setMethodCallHandler(this);
        }

        public final void a(String str, HashMap hashMap, MethodChannel.Result result) {
            if (b.t) {
                this.f3288b.invokeMethod(str, hashMap, result);
            } else {
                this.f3291e.add(new e(str, hashMap, result));
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:242:0x0426, code lost:
        
            if (r2.A != false) goto L166;
         */
        /* JADX WARN: Code restructure failed: missing block: B:243:0x0430, code lost:
        
            r22 = 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:245:0x042d, code lost:
        
            r22 = 3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:247:0x042b, code lost:
        
            if (r2.A != false) goto L166;
         */
        /* JADX WARN: Removed duplicated region for block: B:161:0x0448  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x045e  */
        /* JADX WARN: Removed duplicated region for block: B:177:0x047e  */
        /* JADX WARN: Removed duplicated region for block: B:180:0x04c1  */
        /* JADX WARN: Removed duplicated region for block: B:229:0x0538  */
        /* JADX WARN: Removed duplicated region for block: B:232:0x0549  */
        /* JADX WARN: Removed duplicated region for block: B:233:0x053d  */
        /* JADX WARN: Removed duplicated region for block: B:235:0x0493  */
        /* JADX WARN: Removed duplicated region for block: B:237:0x046f  */
        /* JADX WARN: Removed duplicated region for block: B:238:0x0477  */
        /* JADX WARN: Removed duplicated region for block: B:278:0x065e  */
        /* JADX WARN: Removed duplicated region for block: B:279:0x066a  */
        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onMethodCall(io.flutter.plugin.common.MethodCall r41, io.flutter.plugin.common.MethodChannel.Result r42) {
            /*
                Method dump skipped, instructions count: 1768
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.b.c.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
        }
    }

    public static class d implements MethodChannel.MethodCallHandler {

        /* renamed from: a, reason: collision with root package name */
        public Context f3292a;

        /* renamed from: b, reason: collision with root package name */
        public Activity f3293b;

        /* renamed from: c, reason: collision with root package name */
        public final BinaryMessenger f3294c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f3295d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f3296e;

        public d(BinaryMessenger binaryMessenger) {
            this.f3294c = binaryMessenger;
            new MethodChannel(binaryMessenger, "com.ryanheise.audio_service.client.methods").setMethodCallHandler(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[Catch: Exception -> 0x01a1, TryCatch #0 {Exception -> 0x01a1, blocks: (B:3:0x0007, B:5:0x000b, B:13:0x0028, B:15:0x002c, B:18:0x00b3, B:20:0x00e1, B:21:0x00ed, B:23:0x00f5, B:24:0x00ff, B:26:0x010b, B:27:0x0116, B:29:0x011c, B:30:0x0126, B:32:0x012d, B:33:0x0130, B:35:0x0136, B:36:0x0180, B:38:0x0184, B:40:0x018e, B:42:0x0142, B:44:0x0148, B:45:0x015b, B:46:0x0163, B:48:0x0169, B:50:0x017b, B:53:0x0096, B:55:0x009c, B:58:0x00a1, B:59:0x00af, B:60:0x00ad, B:61:0x0191, B:62:0x0198, B:63:0x0019, B:66:0x0199, B:67:0x01a0), top: B:2:0x0007 }] */
        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onMethodCall(io.flutter.plugin.common.MethodCall r10, io.flutter.plugin.common.MethodChannel.Result r11) {
            /*
                Method dump skipped, instructions count: 429
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.b.d.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final String f3297a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f3298b;

        /* renamed from: c, reason: collision with root package name */
        public final MethodChannel.Result f3299c;

        public e(String str, HashMap hashMap, MethodChannel.Result result) {
            this.f3297a = str;
            this.f3298b = hashMap;
            this.f3299c = result;
        }
    }

    public static MediaBrowserCompat.MediaItem a(Map map) {
        return new MediaBrowserCompat.MediaItem(d(g(map).a(), (Map) map.get("extras")), ((Boolean) map.get("playable")).booleanValue() ? 2 : 1);
    }

    public static HashMap b(MediaMetadataCompat mediaMetadataCompat) {
        RatingCompat ratingCompat = null;
        if (mediaMetadataCompat == null) {
            return null;
        }
        MediaDescriptionCompat a10 = mediaMetadataCompat.a();
        HashMap hashMap = new HashMap();
        hashMap.put("id", a10.f444a);
        hashMap.put("title", m(mediaMetadataCompat, "android.media.metadata.TITLE"));
        hashMap.put("album", m(mediaMetadataCompat, "android.media.metadata.ALBUM"));
        Uri uri = a10.f;
        if (uri != null) {
            hashMap.put("artUri", uri.toString());
        }
        hashMap.put("artist", m(mediaMetadataCompat, "android.media.metadata.ARTIST"));
        hashMap.put("genre", m(mediaMetadataCompat, "android.media.metadata.GENRE"));
        if (mediaMetadataCompat.f455a.containsKey("android.media.metadata.DURATION")) {
            hashMap.put("duration", Long.valueOf(mediaMetadataCompat.f455a.getLong("android.media.metadata.DURATION", 0L)));
        }
        hashMap.put("playable", Boolean.valueOf(mediaMetadataCompat.f455a.getLong("playable_long", 0L) != 0));
        hashMap.put("displayTitle", m(mediaMetadataCompat, "android.media.metadata.DISPLAY_TITLE"));
        hashMap.put("displaySubtitle", m(mediaMetadataCompat, "android.media.metadata.DISPLAY_SUBTITLE"));
        hashMap.put("displayDescription", m(mediaMetadataCompat, "android.media.metadata.DISPLAY_DESCRIPTION"));
        if (mediaMetadataCompat.f455a.containsKey("android.media.metadata.RATING")) {
            try {
                ratingCompat = RatingCompat.a(mediaMetadataCompat.f455a.getParcelable("android.media.metadata.RATING"));
            } catch (Exception e10) {
                Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", e10);
            }
            hashMap.put("rating", n(ratingCompat));
        }
        HashMap e11 = e(new Bundle(mediaMetadataCompat.f455a));
        if (e11.size() > 0) {
            hashMap.put("extras", e11);
        }
        return hashMap;
    }

    public static ArrayList c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map map = (Map) it.next();
            arrayList.add(new MediaSessionCompat.QueueItem(null, d(g(map).a(), (Map) map.get("extras")), i10));
            i10++;
        }
        return arrayList;
    }

    public static MediaDescriptionCompat d(MediaDescriptionCompat mediaDescriptionCompat, Map<?, ?> map) {
        if (map == null || map.isEmpty()) {
            return mediaDescriptionCompat;
        }
        Bundle bundle = new Bundle();
        Bundle bundle2 = mediaDescriptionCompat.f449o;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        bundle.putAll(l(map));
        return new MediaDescriptionCompat(mediaDescriptionCompat.f444a, mediaDescriptionCompat.f445b, mediaDescriptionCompat.f446c, mediaDescriptionCompat.f447d, mediaDescriptionCompat.f448e, mediaDescriptionCompat.f, bundle, mediaDescriptionCompat.f450p);
    }

    public static HashMap e(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Serializable serializable = bundle.getSerializable(str);
            if (serializable != null) {
                hashMap.put(str, serializable);
            }
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.support.v4.media.MediaMetadataCompat g(java.util.Map<?, ?> r18) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.b.g(java.util.Map):android.support.v4.media.MediaMetadataCompat");
    }

    public static void h() {
        d dVar = f3274p;
        Activity activity = dVar != null ? dVar.f3293b : null;
        if (activity != null) {
            activity.setIntent(new Intent("android.intent.action.MAIN"));
        }
        MediaControllerCompat mediaControllerCompat = f3279v;
        if (mediaControllerCompat != null) {
            a aVar = f3280w;
            if (aVar == null) {
                throw new IllegalArgumentException("callback must not be null");
            }
            if (mediaControllerCompat.f468c.remove(aVar) == null) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
            } else {
                try {
                    mediaControllerCompat.f466a.b(aVar);
                } finally {
                    aVar.b(null);
                }
            }
            f3279v = null;
        }
        MediaBrowserCompat mediaBrowserCompat = f3278u;
        if (mediaBrowserCompat != null) {
            mediaBrowserCompat.a();
            f3278u = null;
        }
    }

    public static synchronized FlutterEngine i(Context context) {
        FlutterEngine flutterEngine;
        FlutterActivity flutterActivity;
        Uri data;
        synchronized (b.class) {
            flutterEngine = FlutterEngineCache.getInstance().get("audio_service_engine");
            if (flutterEngine == null) {
                flutterEngine = new FlutterEngine(context.getApplicationContext());
                String str = null;
                if ((context instanceof FlutterActivity) && (str = (flutterActivity = (FlutterActivity) context).getInitialRoute()) == null && flutterActivity.shouldHandleDeeplinking() && (data = flutterActivity.getIntent().getData()) != null) {
                    str = data.getPath();
                    if (data.getQuery() != null && !data.getQuery().isEmpty()) {
                        str = str + "?" + data.getQuery();
                    }
                }
                if (str == null) {
                    str = FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE;
                }
                flutterEngine.getNavigationChannel().setInitialRoute(str);
                flutterEngine.getDartExecutor().executeDartEntrypoint(DartExecutor.DartEntrypoint.createDefault());
                FlutterEngineCache.getInstance().put("audio_service_engine", flutterEngine);
            }
        }
        return flutterEngine;
    }

    public static Long j(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(((Integer) obj).intValue());
    }

    public static HashMap k(Object... objArr) {
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < objArr.length; i10 += 2) {
            hashMap.put((String) objArr[i10], objArr[i10 + 1]);
        }
        return hashMap;
    }

    public static Bundle l(Map<?, ?> map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        Iterator<?> it = map.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = map.get(str);
            if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            }
        }
        return bundle;
    }

    public static String m(MediaMetadataCompat mediaMetadataCompat, String str) {
        CharSequence charSequence = mediaMetadataCompat.f455a.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r4 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
    
        if (r1 == 1.0f) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
    
        if (r1 == 1.0f) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.HashMap<java.lang.String, java.lang.Object> n(android.support.v4.media.RatingCompat r9) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r9.f459a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "type"
            r0.put(r2, r1)
            float r1 = r9.f460b
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r4 = 1
            r5 = 0
            if (r3 < 0) goto L1b
            r3 = r4
            goto L1c
        L1b:
            r3 = r5
        L1c:
            r6 = 0
            java.lang.String r7 = "value"
            if (r3 == 0) goto L6b
            int r9 = r9.f459a
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8 = 1065353216(0x3f800000, float:1.0)
            switch(r9) {
                case 0: goto L6b;
                case 1: goto L5b;
                case 2: goto L4f;
                case 3: goto L38;
                case 4: goto L38;
                case 5: goto L38;
                case 6: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L6e
        L2b:
            r6 = 6
            if (r9 != r6) goto L36
            int r9 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r9 < 0) goto L33
            goto L34
        L33:
            r4 = r5
        L34:
            if (r4 != 0) goto L4a
        L36:
            r1 = r3
            goto L4a
        L38:
            r6 = 3
            if (r9 == r6) goto L42
            r6 = 4
            if (r9 == r6) goto L42
            r6 = 5
            if (r9 == r6) goto L42
            goto L36
        L42:
            int r9 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r9 < 0) goto L47
            goto L48
        L47:
            r4 = r5
        L48:
            if (r4 == 0) goto L36
        L4a:
            java.lang.Float r9 = java.lang.Float.valueOf(r1)
            goto L67
        L4f:
            r2 = 2
            if (r9 == r2) goto L53
            goto L63
        L53:
            int r9 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r9 != 0) goto L58
            goto L59
        L58:
            r4 = r5
        L59:
            r5 = r4
            goto L63
        L5b:
            if (r9 == r4) goto L5e
            goto L63
        L5e:
            int r9 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r9 != 0) goto L58
            goto L59
        L63:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
        L67:
            r0.put(r7, r9)
            goto L6e
        L6b:
            r0.put(r7, r6)
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.b.n(android.support.v4.media.RatingCompat):java.util.HashMap");
    }

    public final void f() {
        if (f3278u == null) {
            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(this.f3281a, new ComponentName(this.f3281a, (Class<?>) AudioService.class), this.f);
            f3278u = mediaBrowserCompat;
            Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
            mediaBrowserCompat.f423a.f432b.connect();
        }
    }

    public final void o() {
        Activity activity = this.f3285e.f3293b;
        if (activity.getIntent().getAction() != null) {
            f3275q.a("onNotificationClicked", k("clicked", Boolean.valueOf(activity.getIntent().getAction().equals("com.ryanheise.audioservice.NOTIFICATION_CLICK"))), null);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f3283c = activityPluginBinding;
        this.f3285e.f3293b = activityPluginBinding.getActivity();
        this.f3285e.f3292a = activityPluginBinding.getActivity();
        FlutterEngine i10 = i(activityPluginBinding.getActivity());
        this.f3285e.f3295d = this.f3282b.getBinaryMessenger() != i10.getDartExecutor();
        f3274p = this.f3285e;
        ActivityPluginBinding activityPluginBinding2 = this.f3283c;
        ta.b bVar = new ta.b(this);
        this.f3284d = bVar;
        activityPluginBinding2.addOnNewIntentListener(bVar);
        MediaControllerCompat mediaControllerCompat = f3279v;
        if (mediaControllerCompat != null) {
            MediaControllerCompat.b(f3274p.f3293b, mediaControllerCompat);
        }
        if (f3278u == null) {
            f();
        }
        Activity activity = f3274p.f3293b;
        if ((this.f3285e.f3293b.getIntent().getFlags() & 1048576) == 1048576) {
            activity.setIntent(new Intent("android.intent.action.MAIN"));
        }
        o();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f3282b = flutterPluginBinding;
        d dVar = new d(flutterPluginBinding.getBinaryMessenger());
        this.f3285e = dVar;
        dVar.f3292a = this.f3282b.getApplicationContext();
        f3273o.add(this.f3285e);
        if (this.f3281a == null) {
            this.f3281a = this.f3282b.getApplicationContext();
        }
        if (f3275q == null) {
            c cVar = new c(this.f3282b.getBinaryMessenger());
            f3275q = cVar;
            AudioService.H = cVar;
        }
        if (f3278u == null) {
            f();
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        this.f3283c.removeOnNewIntentListener(this.f3284d);
        this.f3283c = null;
        this.f3284d = null;
        d dVar = this.f3285e;
        dVar.f3293b = null;
        dVar.f3292a = this.f3282b.getApplicationContext();
        if (f3273o.size() == 1) {
            h();
        }
        if (this.f3285e == f3274p) {
            f3274p = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        this.f3283c.removeOnNewIntentListener(this.f3284d);
        this.f3283c = null;
        d dVar = this.f3285e;
        dVar.f3293b = null;
        dVar.f3292a = this.f3282b.getApplicationContext();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        HashSet hashSet = f3273o;
        if (hashSet.size() == 1) {
            h();
        }
        hashSet.remove(this.f3285e);
        this.f3285e.f3292a = null;
        this.f3285e = null;
        this.f3281a = null;
        c cVar = f3275q;
        if (cVar != null && cVar.f3287a == this.f3282b.getBinaryMessenger()) {
            System.out.println("### destroying audio handler interface");
            AudioTrack audioTrack = f3275q.f3289c;
            if (audioTrack != null) {
                audioTrack.release();
            }
            f3275q = null;
        }
        this.f3282b = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        this.f3283c = activityPluginBinding;
        this.f3285e.f3293b = activityPluginBinding.getActivity();
        this.f3285e.f3292a = activityPluginBinding.getActivity();
        ActivityPluginBinding activityPluginBinding2 = this.f3283c;
        ta.b bVar = new ta.b(this);
        this.f3284d = bVar;
        activityPluginBinding2.addOnNewIntentListener(bVar);
    }
}
