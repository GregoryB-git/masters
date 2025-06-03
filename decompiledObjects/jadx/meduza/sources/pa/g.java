package pa;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.util.LongSparseArray;
import com.jhomlala.better_player.CacheWorker;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.urllauncher.WebViewActivity;
import io.flutter.view.TextureRegistry;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import o2.l;
import p2.k0;
import pa.b;
import r5.j;
import u5.q;
import v3.d0;
import v3.e1;
import v3.r1;
import x0.q0;
import z4.i0;
import z4.j0;

/* loaded from: classes.dex */
public final class g implements FlutterPlugin, ActivityAware, MethodChannel.MethodCallHandler {

    /* renamed from: c, reason: collision with root package name */
    public a f13082c;

    /* renamed from: e, reason: collision with root package name */
    public Map<String, ? extends Object> f13084e;
    public Activity f;

    /* renamed from: o, reason: collision with root package name */
    public Handler f13085o;

    /* renamed from: p, reason: collision with root package name */
    public q0 f13086p;

    /* renamed from: a, reason: collision with root package name */
    public final LongSparseArray<pa.b> f13080a = new LongSparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    public final LongSparseArray<Map<String, Object>> f13081b = new LongSparseArray<>();

    /* renamed from: d, reason: collision with root package name */
    public long f13083d = -1;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f13087a;

        /* renamed from: b, reason: collision with root package name */
        public final BinaryMessenger f13088b;

        /* renamed from: c, reason: collision with root package name */
        public final c f13089c;

        /* renamed from: d, reason: collision with root package name */
        public final b f13090d;

        /* renamed from: e, reason: collision with root package name */
        public final TextureRegistry f13091e;
        public final MethodChannel f;

        public a(Context context, BinaryMessenger binaryMessenger, d dVar, e eVar, TextureRegistry textureRegistry) {
            this.f13087a = context;
            this.f13088b = binaryMessenger;
            this.f13089c = dVar;
            this.f13090d = eVar;
            this.f13091e = textureRegistry;
            this.f = new MethodChannel(binaryMessenger, "better_player_channel");
        }
    }

    public interface b {
        String a(String str, String str2);
    }

    public interface c {
        String a(String str);
    }

    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FlutterLoader f13092a;

        public d(FlutterLoader flutterLoader) {
            this.f13092a = flutterLoader;
        }

        @Override // pa.g.c
        public final String a(String str) {
            FlutterLoader flutterLoader = this.f13092a;
            ec.i.b(str);
            String lookupKeyForAsset = flutterLoader.getLookupKeyForAsset(str);
            ec.i.d(lookupKeyForAsset, "getLookupKeyForAsset(...)");
            return lookupKeyForAsset;
        }
    }

    public static final class e implements b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FlutterLoader f13093a;

        public e(FlutterLoader flutterLoader) {
            this.f13093a = flutterLoader;
        }

        @Override // pa.g.b
        public final String a(String str, String str2) {
            FlutterLoader flutterLoader = this.f13093a;
            ec.i.b(str);
            ec.i.b(str2);
            String lookupKeyForAsset = flutterLoader.getLookupKeyForAsset(str, str2);
            ec.i.d(lookupKeyForAsset, "getLookupKeyForAsset(...)");
            return lookupKeyForAsset;
        }
    }

    public static Object b(Map map, String str, Serializable serializable) {
        Object obj;
        return (!(map != null && map.containsKey(str)) || (obj = map.get(str)) == null) ? serializable : obj;
    }

    public final void a() {
        int size = this.f13080a.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f13080a.valueAt(i10).a();
        }
        this.f13080a.clear();
        this.f13081b.clear();
    }

    public final Long c(pa.b bVar) {
        int size = this.f13080a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (bVar == this.f13080a.valueAt(i10)) {
                return Long.valueOf(this.f13080a.keyAt(i10));
            }
        }
        return null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        ec.i.e(activityPluginBinding, "binding");
        this.f = activityPluginBinding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        ec.i.e(flutterPluginBinding, "binding");
        FlutterLoader flutterLoader = new FlutterLoader();
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        ec.i.d(applicationContext, "getApplicationContext(...)");
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        ec.i.d(binaryMessenger, "getBinaryMessenger(...)");
        a aVar = new a(applicationContext, binaryMessenger, new d(flutterLoader), new e(flutterLoader), flutterPluginBinding.getTextureRegistry());
        this.f13082c = aVar;
        aVar.f.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        ec.i.e(flutterPluginBinding, "binding");
        if (this.f13082c == null) {
            Log.wtf("BetterPlayerPlugin", "Detached from the engine before registering to it.");
        }
        a();
        f fVar = f.f13078a;
        try {
            if (f.f13079b != null) {
                q qVar = f.f13079b;
                ec.i.b(qVar);
                qVar.q();
                f.f13079b = null;
            }
        } catch (Exception e10) {
            Log.e("BetterPlayerCache", e10.toString());
        }
        a aVar = this.f13082c;
        if (aVar != null) {
            aVar.f.setMethodCallHandler(null);
        }
        this.f13082c = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.app.PictureInPictureParams$Builder] */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Object valueOf;
        Activity activity;
        Map<String, ? extends Object> map;
        Context context;
        String str;
        String str2;
        String str3;
        Map<String, String> map2;
        String str4;
        String str5;
        boolean z10;
        long j10;
        long longValue;
        String a10;
        long P;
        j.a aVar;
        int i10;
        int i11;
        ec.i.e(methodCall, "call");
        ec.i.e(result, "result");
        a aVar2 = this.f13082c;
        if (aVar2 == null || aVar2.f13091e == null) {
            result.error("no_activity", "better_player plugin requires a foreground activity", null);
            return;
        }
        String str6 = methodCall.method;
        if (str6 != null) {
            switch (str6.hashCode()) {
                case -1352294148:
                    if (str6.equals("create")) {
                        a aVar3 = this.f13082c;
                        ec.i.b(aVar3);
                        TextureRegistry textureRegistry = aVar3.f13091e;
                        ec.i.b(textureRegistry);
                        TextureRegistry.SurfaceTextureEntry createSurfaceTexture = textureRegistry.createSurfaceTexture();
                        ec.i.d(createSurfaceTexture, "createSurfaceTexture(...)");
                        a aVar4 = this.f13082c;
                        BinaryMessenger binaryMessenger = aVar4 != null ? aVar4.f13088b : null;
                        StringBuilder l10 = defpackage.f.l("better_player_channel/videoEvents");
                        l10.append(createSurfaceTexture.id());
                        EventChannel eventChannel = new EventChannel(binaryMessenger, l10.toString());
                        i iVar = (methodCall.hasArgument("minBufferMs") && methodCall.hasArgument("maxBufferMs") && methodCall.hasArgument("bufferForPlaybackMs") && methodCall.hasArgument("bufferForPlaybackAfterRebufferMs")) ? new i((Integer) methodCall.argument("minBufferMs"), (Integer) methodCall.argument("maxBufferMs"), (Integer) methodCall.argument("bufferForPlaybackMs"), (Integer) methodCall.argument("bufferForPlaybackAfterRebufferMs")) : null;
                        a aVar5 = this.f13082c;
                        Context context2 = aVar5 != null ? aVar5.f13087a : null;
                        ec.i.b(context2);
                        this.f13080a.put(createSurfaceTexture.id(), new pa.b(context2, eventChannel, createSurfaceTexture, iVar, result));
                        return;
                    }
                    break;
                case -1321125217:
                    if (str6.equals("preCache")) {
                        Map map3 = (Map) methodCall.argument("dataSource");
                        if (map3 != null) {
                            Number number = (Number) b(map3, "maxCacheSize", 104857600);
                            Number number2 = (Number) b(map3, "maxCacheFileSize", 10485760);
                            long longValue2 = number.longValue();
                            long longValue3 = number2.longValue();
                            long longValue4 = ((Number) b(map3, "preCacheSize", 3145728)).longValue();
                            String str7 = (String) b(map3, "uri", "");
                            String str8 = (String) b(map3, "cacheKey", null);
                            Map map4 = (Map) b(map3, "headers", new HashMap());
                            a aVar6 = this.f13082c;
                            Context context3 = aVar6 != null ? aVar6.f13087a : null;
                            ec.i.e(map4, "headers");
                            HashMap hashMap = new HashMap();
                            hashMap.put(WebViewActivity.URL_EXTRA, str7);
                            hashMap.put("preCacheSize", Long.valueOf(longValue4));
                            hashMap.put("maxCacheSize", Long.valueOf(longValue2));
                            hashMap.put("maxCacheFileSize", Long.valueOf(longValue3));
                            if (str8 != null) {
                                hashMap.put("cacheKey", str8);
                            }
                            for (String str9 : map4.keySet()) {
                                hashMap.put(defpackage.g.d("header_", str9), (String) map4.get(str9));
                            }
                            if (str7 != null && context3 != null) {
                                l.a aVar7 = new l.a(CacheWorker.class);
                                aVar7.f11751d.add(str7);
                                androidx.work.c cVar = new androidx.work.c(hashMap);
                                androidx.work.c.e(cVar);
                                aVar7.f11750c.f16834e = cVar;
                                l a11 = aVar7.a();
                                ec.i.d(a11, "build(...)");
                                k0.d(context3).a(a11);
                            }
                            result.success(null);
                            return;
                        }
                        return;
                    }
                    break;
                case -759238347:
                    if (str6.equals("clearCache")) {
                        a aVar8 = this.f13082c;
                        Context context4 = aVar8 != null ? aVar8.f13087a : null;
                        if (context4 != null) {
                            try {
                                b.a.a(new File(context4.getCacheDir(), "betterPlayerCache"));
                            } catch (Exception e10) {
                                Log.e("BetterPlayer", e10.toString());
                                result.error("", "", "");
                                return;
                            }
                        }
                        result.success(null);
                        return;
                    }
                    break;
                case 3237136:
                    if (str6.equals("init")) {
                        a();
                        return;
                    }
                    break;
                case 1800570049:
                    if (str6.equals("stopPreCache")) {
                        String str10 = (String) methodCall.argument(WebViewActivity.URL_EXTRA);
                        a aVar9 = this.f13082c;
                        Context context5 = aVar9 != null ? aVar9.f13087a : null;
                        if (str10 != null && context5 != null) {
                            k0 d10 = k0.d(context5);
                            d10.getClass();
                            d10.f12880d.d(new y2.c(d10, str10));
                        }
                        result.success(null);
                        return;
                    }
                    break;
            }
        }
        Number number3 = (Number) methodCall.argument("textureId");
        ec.i.b(number3);
        long longValue5 = number3.longValue();
        pa.b bVar = this.f13080a.get(longValue5);
        if (bVar == null) {
            result.error("Unknown textureId", a0.j.i("No video player associated with texture id ", longValue5), null);
            return;
        }
        String str11 = methodCall.method;
        if (str11 != null) {
            switch (str11.hashCode()) {
                case -1904142125:
                    if (str11.equals("setTrackParameters")) {
                        Object argument = methodCall.argument("width");
                        ec.i.b(argument);
                        ((Number) argument).intValue();
                        Object argument2 = methodCall.argument("height");
                        ec.i.b(argument2);
                        ((Number) argument2).intValue();
                        Object argument3 = methodCall.argument("bitrate");
                        ec.i.b(argument3);
                        ((Number) argument3).intValue();
                        bVar.g();
                        throw null;
                    }
                    break;
                case -1022740989:
                    if (str11.equals("setMixWithOthers")) {
                        Boolean bool = (Boolean) methodCall.argument("mixWithOthers");
                        if (bool != null) {
                            boolean booleanValue = bool.booleanValue();
                            d0 d0Var = bVar.f13052c;
                            if (d0Var != null) {
                                d0Var.u0();
                                d0Var.k0(new x3.d(3, 0, 1, 1, 0), !booleanValue);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    break;
                case -971364356:
                    if (str11.equals("setLooping")) {
                        Object argument4 = methodCall.argument("looping");
                        ec.i.b(argument4);
                        boolean booleanValue2 = ((Boolean) argument4).booleanValue();
                        d0 d0Var2 = bVar.f13052c;
                        if (d0Var2 != null) {
                            d0Var2.u(booleanValue2 ? 2 : 0);
                        }
                        valueOf = null;
                        result.success(valueOf);
                        return;
                    }
                    break;
                case -906224877:
                    if (str11.equals("seekTo")) {
                        Number number4 = (Number) methodCall.argument("location");
                        ec.i.b(number4);
                        int intValue = number4.intValue();
                        d0 d0Var3 = bVar.f13052c;
                        if (d0Var3 != null) {
                            d0Var3.T(5, intValue);
                        }
                        valueOf = null;
                        result.success(valueOf);
                        return;
                    }
                    break;
                case -651597783:
                    boolean z11 = false;
                    if (str11.equals("isPictureInPictureSupported")) {
                        if (Build.VERSION.SDK_INT >= 26 && (activity = this.f) != null && activity.getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
                            z11 = true;
                        }
                        valueOf = Boolean.valueOf(z11);
                        result.success(valueOf);
                        return;
                    }
                    break;
                case -547403682:
                    if (str11.equals("enablePictureInPicture")) {
                        int i12 = Build.VERSION.SDK_INT;
                        if (i12 >= 26) {
                            a aVar10 = this.f13082c;
                            ec.i.b(aVar10);
                            bVar.h(aVar10.f13087a);
                            Activity activity2 = this.f;
                            ec.i.b(activity2);
                            activity2.enterPictureInPictureMode(new Object() { // from class: android.app.PictureInPictureParams$Builder
                                static {
                                    throw new NoClassDefFoundError();
                                }

                                public native /* synthetic */ PictureInPictureParams build();
                            }.build());
                            if (i12 >= 24) {
                                Handler handler = new Handler(Looper.getMainLooper());
                                this.f13085o = handler;
                                q0 q0Var = new q0(18, this, bVar);
                                this.f13086p = q0Var;
                                handler.post(q0Var);
                            }
                            bVar.c(true);
                        }
                        valueOf = null;
                        result.success(valueOf);
                        return;
                    }
                    break;
                case 3443508:
                    if (str11.equals("play")) {
                        try {
                            Long c10 = c(bVar);
                            if (c10 != null) {
                                Map<String, ? extends Object> map5 = this.f13081b.get(c10.longValue());
                                if (c10.longValue() != this.f13083d || (map = this.f13084e) == null || map5 == null || map != map5) {
                                    this.f13084e = map5;
                                    this.f13083d = c10.longValue();
                                    int size = this.f13080a.size();
                                    for (int i13 = 0; i13 < size; i13++) {
                                        this.f13080a.valueAt(i13).b();
                                    }
                                    if (((Boolean) b(map5, "showNotification", Boolean.FALSE)).booleanValue()) {
                                        String str12 = (String) b(map5, "title", "");
                                        String str13 = (String) b(map5, "author", "");
                                        String str14 = (String) b(map5, "imageUrl", "");
                                        String str15 = (String) b(map5, "notificationChannelName", null);
                                        String str16 = (String) b(map5, "activityName", "MainActivity");
                                        a aVar11 = this.f13082c;
                                        Context context6 = aVar11 != null ? aVar11.f13087a : null;
                                        ec.i.b(context6);
                                        bVar.i(context6, str12, str13, str14, str15, str16);
                                    }
                                }
                            }
                        } catch (Exception e11) {
                            Log.e("BetterPlayerPlugin", "SetupNotification failed", e11);
                        }
                        d0 d0Var4 = bVar.f13052c;
                        if (d0Var4 != null) {
                            d0Var4.m0(true);
                        }
                        valueOf = null;
                        result.success(valueOf);
                        return;
                    }
                    break;
                case 106440182:
                    if (str11.equals("pause")) {
                        d0 d0Var5 = bVar.f13052c;
                        if (d0Var5 != null) {
                            d0Var5.m0(false);
                        }
                        valueOf = null;
                        result.success(valueOf);
                        return;
                    }
                    break;
                case 670514716:
                    if (str11.equals("setVolume")) {
                        Object argument5 = methodCall.argument("volume");
                        ec.i.b(argument5);
                        float max = (float) Math.max(0.0d, Math.min(1.0d, ((Number) argument5).doubleValue()));
                        d0 d0Var6 = bVar.f13052c;
                        if (d0Var6 != null) {
                            d0Var6.o0(max);
                        }
                        valueOf = null;
                        result.success(valueOf);
                        return;
                    }
                    break;
                case 747804969:
                    if (str11.equals("position")) {
                        d0 d0Var7 = bVar.f13052c;
                        result.success(Long.valueOf(d0Var7 != null ? d0Var7.P() : 0L));
                        bVar.d(false);
                        return;
                    }
                    break;
                case 869456835:
                    if (str11.equals("disablePictureInPicture")) {
                        Handler handler2 = this.f13085o;
                        if (handler2 != null) {
                            handler2.removeCallbacksAndMessages(null);
                            this.f13085o = null;
                        }
                        this.f13086p = null;
                        Activity activity3 = this.f;
                        ec.i.b(activity3);
                        activity3.moveTaskToBack(false);
                        bVar.c(false);
                        MediaSessionCompat mediaSessionCompat = bVar.f13062n;
                        if (mediaSessionCompat != null) {
                            mediaSessionCompat.d();
                        }
                        bVar.f13062n = null;
                        valueOf = null;
                        result.success(valueOf);
                        return;
                    }
                    break;
                case 1404354821:
                    if (str11.equals("setSpeed")) {
                        Object argument6 = methodCall.argument("speed");
                        ec.i.b(argument6);
                        e1 e1Var = new e1((float) ((Number) argument6).doubleValue());
                        d0 d0Var8 = bVar.f13052c;
                        if (d0Var8 != null) {
                            d0Var8.c(e1Var);
                        }
                        valueOf = null;
                        result.success(valueOf);
                        return;
                    }
                    break;
                case 1671767583:
                    if (str11.equals("dispose")) {
                        bVar.a();
                        this.f13080a.remove(longValue5);
                        this.f13081b.remove(longValue5);
                        Handler handler3 = this.f13085o;
                        if (handler3 != null) {
                            handler3.removeCallbacksAndMessages(null);
                            this.f13085o = null;
                        }
                        this.f13086p = null;
                        valueOf = null;
                        result.success(valueOf);
                        return;
                    }
                    break;
                case 1748853351:
                    if (str11.equals("setDataSource")) {
                        Object argument7 = methodCall.argument("dataSource");
                        ec.i.b(argument7);
                        Map<String, Object> map6 = (Map) argument7;
                        LongSparseArray<Map<String, Object>> longSparseArray = this.f13081b;
                        Long c11 = c(bVar);
                        ec.i.b(c11);
                        longSparseArray.put(c11.longValue(), map6);
                        String str17 = (String) b(map6, Constants.KEY, "");
                        Map<String, String> map7 = (Map) b(map6, "headers", new HashMap());
                        Number number5 = (Number) b(map6, "overriddenDuration", 0);
                        if (map6.get("asset") != null) {
                            String str18 = (String) b(map6, "asset", "");
                            if (map6.get("package") != null) {
                                String str19 = (String) b(map6, "package", "");
                                a aVar12 = this.f13082c;
                                ec.i.b(aVar12);
                                a10 = aVar12.f13090d.a(str18, str19);
                            } else {
                                a aVar13 = this.f13082c;
                                ec.i.b(aVar13);
                                a10 = aVar13.f13089c.a(str18);
                            }
                            a aVar14 = this.f13082c;
                            context = aVar14 != null ? aVar14.f13087a : null;
                            ec.i.b(context);
                            map2 = null;
                            str4 = null;
                            str2 = null;
                            j10 = 0;
                            str3 = "asset:///" + a10;
                            str = null;
                            str5 = null;
                            z10 = false;
                            longValue = number5.longValue();
                        } else {
                            boolean booleanValue3 = ((Boolean) b(map6, "useCache", Boolean.FALSE)).booleanValue();
                            Number number6 = (Number) b(map6, "maxCacheSize", 0);
                            Number number7 = (Number) b(map6, "maxCacheFileSize", 0);
                            long longValue6 = number6.longValue();
                            long longValue7 = number7.longValue();
                            String str20 = (String) b(map6, "uri", "");
                            String str21 = (String) b(map6, "cacheKey", null);
                            String str22 = (String) b(map6, "formatHint", null);
                            String str23 = (String) b(map6, "licenseUrl", null);
                            String str24 = (String) b(map6, "clearKey", null);
                            Map<String, String> map8 = (Map) b(map6, "drmHeaders", new HashMap());
                            a aVar15 = this.f13082c;
                            ec.i.b(aVar15);
                            context = aVar15.f13087a;
                            str = str22;
                            str2 = str24;
                            str3 = str20;
                            map2 = map8;
                            str4 = str21;
                            str5 = str23;
                            r16 = longValue6;
                            z10 = booleanValue3;
                            j10 = longValue7;
                            longValue = number5.longValue();
                        }
                        bVar.f(context, str17, str3, str, result, map7, z10, r16, j10, longValue, str5, map2, str4, str2);
                        return;
                    }
                    break;
                case 1809884096:
                    if (str11.equals("absolutePosition")) {
                        d0 d0Var9 = bVar.f13052c;
                        r1 J = d0Var9 != null ? d0Var9.J() : null;
                        if (J == null || J.p()) {
                            d0 d0Var10 = bVar.f13052c;
                            P = d0Var10 != null ? d0Var10.P() : 0L;
                        } else {
                            long j11 = J.m(0, new r1.c()).f;
                            d0 d0Var11 = bVar.f13052c;
                            P = j11 + (d0Var11 != null ? d0Var11.P() : 0L);
                        }
                        valueOf = Long.valueOf(P);
                        result.success(valueOf);
                        return;
                    }
                    break;
                case 2015518999:
                    if (str11.equals("setAudioTrack")) {
                        String str25 = (String) methodCall.argument("name");
                        Integer num = (Integer) methodCall.argument("index");
                        if (str25 != null && num != null) {
                            int intValue2 = num.intValue();
                            try {
                                j.a aVar16 = bVar.f13054e.f13713c;
                                if (aVar16 != null) {
                                    int i14 = aVar16.f13714a;
                                    int i15 = 0;
                                    while (i15 < i14) {
                                        if (aVar16.f13715b[i15] != 1) {
                                            aVar = aVar16;
                                            i10 = i14;
                                        } else {
                                            j0 j0Var = aVar16.f13716c[i15];
                                            ec.i.d(j0Var, "getTrackGroups(...)");
                                            int i16 = j0Var.f17691a;
                                            int i17 = 0;
                                            boolean z12 = false;
                                            boolean z13 = false;
                                            while (i17 < i16) {
                                                i0 a12 = j0Var.a(i17);
                                                int i18 = a12.f17684a;
                                                j.a aVar17 = aVar16;
                                                int i19 = 0;
                                                while (i19 < i18) {
                                                    int i20 = i14;
                                                    v3.i0 i0Var = a12.f17687d[i19];
                                                    int i21 = i16;
                                                    ec.i.d(i0Var, "getFormat(...)");
                                                    if (i0Var.f15448b == null) {
                                                        z12 = true;
                                                    }
                                                    String str26 = i0Var.f15447a;
                                                    if (str26 != null && ec.i.a(str26, "1/15")) {
                                                        z13 = true;
                                                    }
                                                    i19++;
                                                    i14 = i20;
                                                    i16 = i21;
                                                }
                                                i17++;
                                                aVar16 = aVar17;
                                            }
                                            aVar = aVar16;
                                            i10 = i14;
                                            int i22 = j0Var.f17691a;
                                            int i23 = 0;
                                            while (i23 < i22) {
                                                i0 a13 = j0Var.a(i23);
                                                int i24 = a13.f17684a;
                                                while (i11 < i24) {
                                                    String str27 = a13.f17687d[i11].f15448b;
                                                    i11 = ((ec.i.a(str25, str27) && intValue2 == i23) || (!z13 && z12 && intValue2 == i23) || (z13 && ec.i.a(str25, str27))) ? 0 : i11 + 1;
                                                    bVar.e();
                                                }
                                                i23++;
                                            }
                                        }
                                        i15++;
                                        aVar16 = aVar;
                                        i14 = i10;
                                    }
                                }
                            } catch (Exception e12) {
                                Log.e("BetterPlayer", "setAudioTrack failed" + e12);
                            }
                        }
                        valueOf = null;
                        result.success(valueOf);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        ec.i.e(activityPluginBinding, "binding");
    }
}
