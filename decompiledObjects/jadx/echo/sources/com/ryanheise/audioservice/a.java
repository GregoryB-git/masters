package com.ryanheise.audioservice;

import A5.a;
import E5.j;
import E5.k;
import E5.n;
import a0.AbstractServiceC0721d;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
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
import com.android.installreferrer.api.InstallReferrerClient;
import com.ryanheise.audioservice.AudioService;
import com.ryanheise.audioservice.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import l5.C1620h;
import l5.C1628p;
import l5.C1630r;
import l5.EnumC1613a;
import l5.EnumC1629q;
import u5.AbstractActivityC2022i;
import v5.C2062a;
import w5.C2105a;

/* loaded from: classes.dex */
public class a implements A5.a, B5.a {

    /* renamed from: g, reason: collision with root package name */
    public static String f12304g = "audio_service_engine";

    /* renamed from: i, reason: collision with root package name */
    public static d f12306i;

    /* renamed from: j, reason: collision with root package name */
    public static c f12307j;

    /* renamed from: l, reason: collision with root package name */
    public static k.d f12309l;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f12310m;

    /* renamed from: n, reason: collision with root package name */
    public static MediaBrowserCompat f12311n;

    /* renamed from: o, reason: collision with root package name */
    public static MediaControllerCompat f12312o;

    /* renamed from: a, reason: collision with root package name */
    public Context f12314a;

    /* renamed from: b, reason: collision with root package name */
    public a.b f12315b;

    /* renamed from: c, reason: collision with root package name */
    public B5.c f12316c;

    /* renamed from: d, reason: collision with root package name */
    public n f12317d;

    /* renamed from: e, reason: collision with root package name */
    public d f12318e;

    /* renamed from: f, reason: collision with root package name */
    public final MediaBrowserCompat.b f12319f = new b();

    /* renamed from: h, reason: collision with root package name */
    public static final Set f12305h = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    public static final long f12308k = System.currentTimeMillis() - SystemClock.elapsedRealtime();

    /* renamed from: p, reason: collision with root package name */
    public static final MediaControllerCompat.a f12313p = new C0182a();

    /* renamed from: com.ryanheise.audioservice.a$a, reason: collision with other inner class name */
    public class C0182a extends MediaControllerCompat.a {
    }

    public class b extends MediaBrowserCompat.b {
        public b() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void a() {
            if (a.this.f12314a == null) {
                return;
            }
            try {
                MediaControllerCompat unused = a.f12312o = new MediaControllerCompat(a.this.f12314a, a.f12311n.c());
                Activity activity = a.f12306i != null ? a.f12306i.f12333b : null;
                if (activity != null) {
                    MediaControllerCompat.f(activity, a.f12312o);
                }
                a.f12312o.d(a.f12313p);
                if (a.f12309l != null) {
                    a.f12309l.a(a.F(new Object[0]));
                    k.d unused2 = a.f12309l = null;
                }
            } catch (Exception e7) {
                System.out.println("onConnected error: " + e7.getMessage());
                e7.printStackTrace();
                if (a.f12309l == null) {
                    a.this.f12318e.f(true);
                    return;
                }
                a.f12309l.b("onConnected error: " + e7.getMessage(), null, null);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void b() {
            if (a.f12309l != null) {
                a.f12309l.b("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.", null, null);
            } else {
                a.this.f12318e.f(true);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.b
        public void c() {
            System.out.println("### UNHANDLED: onConnectionSuspended");
        }
    }

    public static class c implements k.c, AudioService.e {

        /* renamed from: a, reason: collision with root package name */
        public E5.c f12321a;

        /* renamed from: b, reason: collision with root package name */
        public k f12322b;

        /* renamed from: c, reason: collision with root package name */
        public AudioTrack f12323c;

        /* renamed from: d, reason: collision with root package name */
        public final Handler f12324d = new Handler(Looper.getMainLooper());

        /* renamed from: e, reason: collision with root package name */
        public List f12325e = new LinkedList();

        /* renamed from: com.ryanheise.audioservice.a$c$a, reason: collision with other inner class name */
        public class C0183a implements k.d {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AbstractServiceC0721d.l f12326a;

            public C0183a(AbstractServiceC0721d.l lVar) {
                this.f12326a = lVar;
            }

            @Override // E5.k.d
            public void a(Object obj) {
                List list = (List) ((Map) obj).get("children");
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(a.M((Map) it.next()));
                }
                this.f12326a.g(arrayList);
            }

            @Override // E5.k.d
            public void b(String str, String str2, Object obj) {
                this.f12326a.f(new Bundle());
            }

            @Override // E5.k.d
            public void c() {
                this.f12326a.f(new Bundle());
            }
        }

        public class b implements k.d {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AbstractServiceC0721d.l f12328a;

            public b(AbstractServiceC0721d.l lVar) {
                this.f12328a = lVar;
            }

            @Override // E5.k.d
            public void a(Object obj) {
                Map map = (Map) ((Map) obj).get("mediaItem");
                if (map == null) {
                    this.f12328a.g(null);
                } else {
                    this.f12328a.g(a.M(map));
                }
            }

            @Override // E5.k.d
            public void b(String str, String str2, Object obj) {
                this.f12328a.f(new Bundle());
            }

            @Override // E5.k.d
            public void c() {
                this.f12328a.f(new Bundle());
            }
        }

        /* renamed from: com.ryanheise.audioservice.a$c$c, reason: collision with other inner class name */
        public class C0184c implements k.d {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AbstractServiceC0721d.l f12330a;

            public C0184c(AbstractServiceC0721d.l lVar) {
                this.f12330a = lVar;
            }

            @Override // E5.k.d
            public void a(Object obj) {
                List list = (List) ((Map) obj).get("mediaItems");
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(a.M((Map) it.next()));
                }
                this.f12330a.g(arrayList);
            }

            @Override // E5.k.d
            public void b(String str, String str2, Object obj) {
                this.f12330a.f(new Bundle());
            }

            @Override // E5.k.d
            public void c() {
                this.f12330a.f(new Bundle());
            }
        }

        public c(E5.c cVar) {
            this.f12321a = cVar;
            k kVar = new k(cVar, "com.ryanheise.audio_service.handler.methods");
            this.f12322b = kVar;
            kVar.e(this);
        }

        public static /* synthetic */ void V(k.d dVar, Exception exc) {
            dVar.b("UNEXPECTED_ERROR", "Unexpected error", Log.getStackTraceString(exc));
        }

        public static /* synthetic */ void Y(k.d dVar, Exception exc) {
            dVar.b("UNEXPECTED_ERROR", "Unexpected error", Log.getStackTraceString(exc));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void A() {
            R("fastForward", a.F(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void B(long j7) {
            R("seek", a.F("position", Long.valueOf(j7 * 1000)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void C(MediaMetadataCompat mediaMetadataCompat) {
            R("addQueueItem", a.F("mediaItem", a.H(mediaMetadataCompat)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void D() {
            a.A();
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void E(String str, Bundle bundle) {
            R("customAction", a.F("name", str, "extras", a.w(bundle)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void F(String str, Bundle bundle) {
            R("prepareFromSearch", a.F("query", str, "extras", a.w(bundle)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void G(long j7) {
            R("skipToQueueItem", a.F("index", Long.valueOf(j7)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void H(int i7) {
            R("androidAdjustRemoteVolume", a.F("direction", Integer.valueOf(i7)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void I(Uri uri, Bundle bundle) {
            R("playFromUri", a.F("uri", uri.toString(), "extras", a.w(bundle)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void J(RatingCompat ratingCompat, Bundle bundle) {
            R("setRating", a.F("rating", a.J(ratingCompat), "extras", a.w(bundle)));
        }

        public final void Q() {
            AudioTrack audioTrack = this.f12323c;
            if (audioTrack != null) {
                audioTrack.release();
            }
        }

        public void R(String str, Object obj) {
            S(str, obj, null);
        }

        public void S(String str, Object obj, k.d dVar) {
            if (a.f12310m) {
                this.f12322b.d(str, obj, dVar);
            } else {
                this.f12325e.add(new e(str, obj, dVar));
            }
        }

        public void T() {
            for (e eVar : this.f12325e) {
                this.f12322b.d(eVar.f12338a, eVar.f12339b, eVar.f12340c);
            }
            this.f12325e.clear();
        }

        public final /* synthetic */ void W(Map map, final k.d dVar) {
            try {
                AudioService.f12275R.Y(a.y((Map) map.get("mediaItem")));
                this.f12324d.post(new Runnable() { // from class: l5.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.d.this.a(null);
                    }
                });
            } catch (Exception e7) {
                this.f12324d.post(new Runnable() { // from class: l5.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.c.V(k.d.this, e7);
                    }
                });
            }
        }

        public final /* synthetic */ void Z(Map map, final k.d dVar) {
            try {
                AudioService.f12275R.a0(a.K((List) map.get("queue")));
                this.f12324d.post(new Runnable() { // from class: l5.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.d.this.a(null);
                    }
                });
            } catch (Exception e7) {
                this.f12324d.post(new Runnable() { // from class: l5.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.c.Y(k.d.this, e7);
                    }
                });
            }
        }

        public void a0(E5.c cVar) {
            this.f12322b.e(null);
            this.f12321a = cVar;
            k kVar = new k(cVar, "com.ryanheise.audio_service.handler.methods");
            this.f12322b = kVar;
            kVar.e(this);
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void b() {
            R("onNotificationDeleted", a.F(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void c(int i7) {
            R("setRepeatMode", a.F("repeatMode", Integer.valueOf(i7)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void d(int i7) {
            R("setShuffleMode", a.F("shuffleMode", Integer.valueOf(i7)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void e() {
            R("play", a.F(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void f(boolean z7) {
            R("setCaptioningEnabled", a.F("enabled", Boolean.valueOf(z7)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void g() {
            R("stop", a.F(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void h(String str, Bundle bundle) {
            R("prepareFromMediaId", a.F("mediaId", str, "extras", a.w(bundle)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void i(String str, Bundle bundle, AbstractServiceC0721d.l lVar) {
            if (a.f12307j != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("query", str);
                hashMap.put("extras", a.w(bundle));
                a.f12307j.S("search", hashMap, new C0184c(lVar));
            }
            lVar.a();
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void j(EnumC1629q enumC1629q) {
            R("click", a.F("button", Integer.valueOf(enumC1629q.ordinal())));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void k() {
            R("skipToPrevious", a.F(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void l() {
            R("skipToNext", a.F(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void m(String str, AbstractServiceC0721d.l lVar) {
            if (a.f12307j != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("mediaId", str);
                a.f12307j.S("getMediaItem", hashMap, new b(lVar));
            }
            lVar.a();
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void n(MediaMetadataCompat mediaMetadataCompat) {
            R("removeQueueItem", a.F("mediaItem", a.H(mediaMetadataCompat)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void o(float f7) {
            R("setSpeed", a.F("speed", Float.valueOf(f7)));
        }

        @Override // E5.k.c
        public void onMethodCall(j jVar, final k.d dVar) {
            char c7;
            ExecutorService newSingleThreadExecutor;
            Runnable runnable;
            int[] iArr;
            try {
                final Map map = (Map) jVar.f1671b;
                String str = jVar.f1670a;
                switch (str.hashCode()) {
                    case -615448875:
                        if (str.equals("setMediaItem")) {
                            c7 = 0;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case -3300612:
                        if (str.equals("androidForceEnableMediaButtons")) {
                            c7 = 5;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 534585782:
                        if (str.equals("setAndroidPlaybackInfo")) {
                            c7 = 3;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 699379795:
                        if (str.equals("stopService")) {
                            c7 = 6;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1402657231:
                        if (str.equals("setQueue")) {
                            c7 = 1;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1404470607:
                        if (str.equals("setState")) {
                            c7 = 2;
                            break;
                        }
                        c7 = 65535;
                        break;
                    case 1742026028:
                        if (str.equals("notifyChildrenChanged")) {
                            c7 = 4;
                            break;
                        }
                        c7 = 65535;
                        break;
                    default:
                        c7 = 65535;
                        break;
                }
                switch (c7) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                        runnable = new Runnable() { // from class: l5.j
                            @Override // java.lang.Runnable
                            public final void run() {
                                a.c.this.W(map, dVar);
                            }
                        };
                        newSingleThreadExecutor.execute(runnable);
                        break;
                    case 1:
                        newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                        runnable = new Runnable() { // from class: l5.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                a.c.this.Z(map, dVar);
                            }
                        };
                        newSingleThreadExecutor.execute(runnable);
                        break;
                    case 2:
                        Map map2 = (Map) map.get("state");
                        EnumC1613a enumC1613a = EnumC1613a.values()[((Integer) map2.get("processingState")).intValue()];
                        boolean booleanValue = ((Boolean) map2.get("playing")).booleanValue();
                        List<Map> list = (List) map2.get("controls");
                        List list2 = (List) map2.get("androidCompactActionIndices");
                        List list3 = (List) map2.get("systemActions");
                        long longValue = a.D(map2.get("updatePosition")).longValue();
                        long longValue2 = a.D(map2.get("bufferedPosition")).longValue();
                        float doubleValue = (float) ((Double) map2.get("speed")).doubleValue();
                        long currentTimeMillis = map2.get("updateTime") == null ? System.currentTimeMillis() : a.D(map2.get("updateTime")).longValue();
                        Integer num = (Integer) map2.get("errorCode");
                        String str2 = (String) map2.get("errorMessage");
                        int intValue = ((Integer) map2.get("repeatMode")).intValue();
                        int intValue2 = ((Integer) map2.get("shuffleMode")).intValue();
                        Long D7 = a.D(map2.get("queueIndex"));
                        boolean booleanValue2 = ((Boolean) map2.get("captioningEnabled")).booleanValue();
                        long j7 = currentTimeMillis - a.f12308k;
                        ArrayList arrayList = new ArrayList();
                        long j8 = 0;
                        for (Map map3 : list) {
                            String str3 = (String) map3.get("androidIcon");
                            String str4 = (String) map3.get("label");
                            long intValue3 = 1 << ((Integer) map3.get("action")).intValue();
                            j8 |= intValue3;
                            Map map4 = (Map) map3.get("customAction");
                            arrayList.add(new C1630r(str3, str4, intValue3, map4 != null ? new C1628p((String) map4.get("name"), (Map) map4.get("extras")) : null));
                        }
                        while (list3.iterator().hasNext()) {
                            j8 |= 1 << ((Integer) r0.next()).intValue();
                        }
                        if (list2 != null) {
                            int min = Math.min(3, list2.size());
                            iArr = new int[min];
                            for (int i7 = 0; i7 < min; i7++) {
                                iArr[i7] = ((Integer) list2.get(i7)).intValue();
                            }
                        } else {
                            iArr = null;
                        }
                        AudioService.f12275R.b0(arrayList, j8, iArr, enumC1613a, booleanValue, longValue, longValue2, doubleValue, j7, num, str2, intValue, intValue2, booleanValue2, D7);
                        dVar.a(null);
                        break;
                    case 3:
                        Map map5 = (Map) map.get("playbackInfo");
                        AudioService.f12275R.Z(((Integer) map5.get("playbackType")).intValue(), (Integer) map5.get("volumeControlType"), (Integer) map5.get("maxVolume"), (Integer) map5.get("volume"));
                        dVar.a(null);
                        break;
                    case 4:
                        AudioService.f12275R.e((String) map.get("parentMediaId"), a.G((Map) map.get("options")));
                        dVar.a(null);
                        break;
                    case 5:
                        if (this.f12323c == null) {
                            AudioTrack audioTrack = new AudioTrack(3, 44100, 2, 3, 2048, 0);
                            this.f12323c = audioTrack;
                            audioTrack.write(new byte[2048], 0, 2048);
                        }
                        this.f12323c.reloadStaticData();
                        this.f12323c.play();
                        dVar.a(null);
                        break;
                    case 6:
                        AudioService audioService = AudioService.f12275R;
                        if (audioService != null) {
                            audioService.c0();
                        }
                        dVar.a(null);
                        break;
                }
            } catch (Exception e7) {
                e7.printStackTrace();
                dVar.b(e7.getMessage(), null, null);
            }
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void p() {
            R("prepare", a.F(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void q(Uri uri, Bundle bundle) {
            R("prepareFromUri", a.F("uri", uri.toString(), "extras", a.w(bundle)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void r() {
            R("rewind", a.F(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void s(String str, AbstractServiceC0721d.l lVar, Bundle bundle) {
            if (a.f12307j != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("parentMediaId", str);
                hashMap.put("options", a.w(bundle));
                a.f12307j.S("getChildren", hashMap, new C0183a(lVar));
            }
            lVar.a();
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void t(RatingCompat ratingCompat) {
            R("setRating", a.F("rating", a.J(ratingCompat), "extras", null));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void u(String str, Bundle bundle) {
            R("playFromSearch", a.F("query", str, "extras", a.w(bundle)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void v(MediaMetadataCompat mediaMetadataCompat, int i7) {
            R("insertQueueItem", a.F("mediaItem", a.H(mediaMetadataCompat), "index", Integer.valueOf(i7)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void w() {
            R("pause", a.F(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void x(int i7) {
            R("androidSetRemoteVolume", a.F("volumeIndex", Integer.valueOf(i7)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void y() {
            R("onTaskRemoved", a.F(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void z(String str, Bundle bundle) {
            R("playFromMediaId", a.F("mediaId", str, "extras", a.w(bundle)));
        }
    }

    public static class d implements k.c {

        /* renamed from: a, reason: collision with root package name */
        public Context f12332a;

        /* renamed from: b, reason: collision with root package name */
        public Activity f12333b;

        /* renamed from: c, reason: collision with root package name */
        public final E5.c f12334c;

        /* renamed from: d, reason: collision with root package name */
        public final k f12335d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f12336e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f12337f;

        public d(E5.c cVar) {
            this.f12334c = cVar;
            k kVar = new k(cVar, "com.ryanheise.audio_service.client.methods");
            this.f12335d = kVar;
            kVar.e(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Activity activity) {
            this.f12333b = activity;
        }

        public final void e(Context context) {
            this.f12332a = context;
        }

        public void f(boolean z7) {
            this.f12337f = z7;
        }

        public void g(boolean z7) {
            this.f12336e = z7;
        }

        public boolean h() {
            return (this.f12333b.getIntent().getFlags() & 1048576) == 1048576;
        }

        @Override // E5.k.c
        public void onMethodCall(j jVar, k.d dVar) {
            try {
                if (this.f12336e) {
                    throw new IllegalStateException("The Activity class declared in your AndroidManifest.xml is wrong or has not provided the correct FlutterEngine. Please see the README for instructions.");
                }
                String str = jVar.f1670a;
                if (str.hashCode() == -804429082 && str.equals("configure")) {
                    if (this.f12337f) {
                        throw new IllegalStateException("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.");
                    }
                    boolean unused = a.f12310m = true;
                    Map map = (Map) ((Map) jVar.f1671b).get("config");
                    C1620h c1620h = new C1620h(this.f12332a.getApplicationContext());
                    c1620h.f17267i = ((Boolean) map.get("androidNotificationClickStartsActivity")).booleanValue();
                    c1620h.f17268j = ((Boolean) map.get("androidNotificationOngoing")).booleanValue();
                    c1620h.f17260b = ((Boolean) map.get("androidResumeOnClick")).booleanValue();
                    c1620h.f17261c = (String) map.get("androidNotificationChannelId");
                    c1620h.f17262d = (String) map.get("androidNotificationChannelName");
                    c1620h.f17263e = (String) map.get("androidNotificationChannelDescription");
                    c1620h.f17264f = map.get("notificationColor") == null ? -1 : a.C(map.get("notificationColor")).intValue();
                    c1620h.f17265g = (String) map.get("androidNotificationIcon");
                    c1620h.f17266h = ((Boolean) map.get("androidShowNotificationBadge")).booleanValue();
                    c1620h.f17269k = ((Boolean) map.get("androidStopForegroundOnPause")).booleanValue();
                    c1620h.f17270l = map.get("artDownscaleWidth") != null ? ((Integer) map.get("artDownscaleWidth")).intValue() : -1;
                    c1620h.f17271m = map.get("artDownscaleHeight") != null ? ((Integer) map.get("artDownscaleHeight")).intValue() : -1;
                    c1620h.c((Map) map.get("androidBrowsableRootExtras"));
                    Activity activity = this.f12333b;
                    if (activity != null) {
                        c1620h.f17272n = activity.getClass().getName();
                    }
                    c1620h.b();
                    AudioService audioService = AudioService.f12275R;
                    if (audioService != null) {
                        audioService.B(c1620h);
                    }
                    d unused2 = a.f12306i = this;
                    if (a.f12307j == null) {
                        c unused3 = a.f12307j = new c(this.f12334c);
                        AudioService.Q(a.f12307j);
                    } else {
                        if (a.f12307j.f12321a != this.f12334c) {
                            a.f12307j.a0(this.f12334c);
                        }
                        a.f12307j.T();
                    }
                    if (a.f12312o != null) {
                        dVar.a(a.F(new Object[0]));
                    } else {
                        k.d unused4 = a.f12309l = dVar;
                    }
                }
            } catch (Exception e7) {
                e7.printStackTrace();
                dVar.b(e7.getMessage(), null, null);
            }
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final String f12338a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f12339b;

        /* renamed from: c, reason: collision with root package name */
        public final k.d f12340c;

        public e(String str, Object obj, k.d dVar) {
            this.f12338a = str;
            this.f12339b = obj;
            this.f12340c = dVar;
        }
    }

    public static synchronized void A() {
        synchronized (a.class) {
            Iterator it = f12305h.iterator();
            while (it.hasNext()) {
                if (((d) it.next()).f12333b != null) {
                    return;
                }
            }
            io.flutter.embedding.engine.a a7 = C2062a.b().a(f12304g);
            if (a7 != null) {
                a7.g();
                C2062a.b().d(f12304g);
            }
        }
    }

    public static synchronized io.flutter.embedding.engine.a B(Context context) {
        io.flutter.embedding.engine.a a7;
        String str;
        Uri data;
        synchronized (a.class) {
            try {
                a7 = C2062a.b().a(f12304g);
                if (a7 == null) {
                    a7 = new io.flutter.embedding.engine.a(context.getApplicationContext());
                    if (context instanceof AbstractActivityC2022i) {
                        AbstractActivityC2022i abstractActivityC2022i = (AbstractActivityC2022i) context;
                        str = abstractActivityC2022i.i();
                        if (str == null && abstractActivityC2022i.y() && (data = abstractActivityC2022i.getIntent().getData()) != null) {
                            str = data.getPath();
                            if (data.getQuery() != null && !data.getQuery().isEmpty()) {
                                str = str + "?" + data.getQuery();
                            }
                        }
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "/";
                    }
                    a7.o().c(str);
                    a7.k().j(C2105a.c.a());
                    C2062a.b().c(f12304g, a7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a7;
    }

    public static Integer C(Object obj) {
        return (obj == null || (obj instanceof Integer)) ? (Integer) obj : Integer.valueOf((int) ((Long) obj).longValue());
    }

    public static Long D(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(((Integer) obj).intValue());
    }

    public static Map F(Object... objArr) {
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < objArr.length; i7 += 2) {
            hashMap.put((String) objArr[i7], objArr[i7 + 1]);
        }
        return hashMap;
    }

    public static Bundle G(Map map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
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

    public static Map H(MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat == null) {
            return null;
        }
        MediaDescriptionCompat e7 = mediaMetadataCompat.e();
        HashMap hashMap = new HashMap();
        hashMap.put("id", e7.g());
        hashMap.put("title", I(mediaMetadataCompat, "android.media.metadata.TITLE"));
        hashMap.put("album", I(mediaMetadataCompat, "android.media.metadata.ALBUM"));
        if (e7.e() != null) {
            hashMap.put("artUri", e7.e().toString());
        }
        hashMap.put("artist", I(mediaMetadataCompat, "android.media.metadata.ARTIST"));
        hashMap.put("genre", I(mediaMetadataCompat, "android.media.metadata.GENRE"));
        if (mediaMetadataCompat.a("android.media.metadata.DURATION")) {
            hashMap.put("duration", Long.valueOf(mediaMetadataCompat.f("android.media.metadata.DURATION")));
        }
        hashMap.put("playable", Boolean.valueOf(mediaMetadataCompat.f("playable_long") != 0));
        hashMap.put("displayTitle", I(mediaMetadataCompat, "android.media.metadata.DISPLAY_TITLE"));
        hashMap.put("displaySubtitle", I(mediaMetadataCompat, "android.media.metadata.DISPLAY_SUBTITLE"));
        hashMap.put("displayDescription", I(mediaMetadataCompat, "android.media.metadata.DISPLAY_DESCRIPTION"));
        if (mediaMetadataCompat.a("android.media.metadata.RATING")) {
            hashMap.put("rating", J(mediaMetadataCompat.h("android.media.metadata.RATING")));
        }
        Map w7 = w(mediaMetadataCompat.d());
        if (w7.size() > 0) {
            hashMap.put("extras", w7);
        }
        return hashMap;
    }

    public static String I(MediaMetadataCompat mediaMetadataCompat, String str) {
        CharSequence j7 = mediaMetadataCompat.j(str);
        if (j7 != null) {
            return j7.toString();
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static HashMap J(RatingCompat ratingCompat) {
        boolean f7;
        Object valueOf;
        float e7;
        HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(ratingCompat.d()));
        if (ratingCompat.g()) {
            switch (ratingCompat.d()) {
                case 1:
                    f7 = ratingCompat.f();
                    valueOf = Boolean.valueOf(f7);
                    hashMap.put("value", valueOf);
                    break;
                case 2:
                    f7 = ratingCompat.h();
                    valueOf = Boolean.valueOf(f7);
                    hashMap.put("value", valueOf);
                    break;
                case 3:
                case 4:
                case 5:
                    e7 = ratingCompat.e();
                    valueOf = Float.valueOf(e7);
                    hashMap.put("value", valueOf);
                    break;
                case 6:
                    e7 = ratingCompat.b();
                    valueOf = Float.valueOf(e7);
                    hashMap.put("value", valueOf);
                    break;
            }
        }
        hashMap.put("value", null);
        return hashMap;
    }

    public static List K(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Map map = (Map) it.next();
            arrayList.add(new MediaSessionCompat.QueueItem(v(y(map).e(), (Map) map.get("extras")), i7));
            i7++;
        }
        return arrayList;
    }

    public static RatingCompat L(Map map) {
        if (map == null) {
            return null;
        }
        Integer num = (Integer) map.get("type");
        Object obj = map.get("value");
        if (obj == null) {
            return RatingCompat.m(num.intValue());
        }
        switch (num.intValue()) {
            case 1:
                return RatingCompat.i(((Boolean) obj).booleanValue());
            case 2:
                return RatingCompat.l(((Boolean) obj).booleanValue());
            case 3:
            case 4:
            case 5:
                return RatingCompat.k(num.intValue(), ((Integer) obj).intValue());
            case 6:
                return RatingCompat.j(((Double) obj).floatValue());
            default:
                return RatingCompat.m(num.intValue());
        }
    }

    public static MediaBrowserCompat.MediaItem M(Map map) {
        return new MediaBrowserCompat.MediaItem(v(y(map).e(), (Map) map.get("extras")), ((Boolean) map.get("playable")).booleanValue() ? 2 : 1);
    }

    public static MediaDescriptionCompat v(MediaDescriptionCompat mediaDescriptionCompat, Map map) {
        if (map == null || map.isEmpty()) {
            return mediaDescriptionCompat;
        }
        Bundle bundle = new Bundle();
        if (mediaDescriptionCompat.c() != null) {
            bundle.putAll(mediaDescriptionCompat.c());
        }
        bundle.putAll(G(map));
        return new MediaDescriptionCompat.d().i(mediaDescriptionCompat.j()).h(mediaDescriptionCompat.i()).b(mediaDescriptionCompat.b()).d(mediaDescriptionCompat.d()).e(mediaDescriptionCompat.e()).f(mediaDescriptionCompat.g()).g(mediaDescriptionCompat.h()).c(bundle).a();
    }

    public static Map w(Bundle bundle) {
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

    public static MediaMetadataCompat y(Map map) {
        return AudioService.f12275R.F((String) map.get("id"), (String) map.get("title"), (String) map.get("album"), (String) map.get("artist"), (String) map.get("genre"), D(map.get("duration")), (String) map.get("artUri"), (Boolean) map.get("playable"), (String) map.get("displayTitle"), (String) map.get("displaySubtitle"), (String) map.get("displayDescription"), L((Map) map.get("rating")), (Map) map.get("extras"));
    }

    public final /* synthetic */ boolean E(Intent intent) {
        this.f12318e.f12333b.setIntent(intent);
        O();
        return true;
    }

    public final void N() {
        B5.c cVar = this.f12316c;
        n nVar = new n() { // from class: l5.i
            @Override // E5.n
            public final boolean onNewIntent(Intent intent) {
                boolean E6;
                E6 = com.ryanheise.audioservice.a.this.E(intent);
                return E6;
            }
        };
        this.f12317d = nVar;
        cVar.g(nVar);
    }

    public final void O() {
        Activity activity = this.f12318e.f12333b;
        if (f12307j == null || activity.getIntent().getAction() == null) {
            return;
        }
        f12307j.R("onNotificationClicked", F("clicked", Boolean.valueOf(activity.getIntent().getAction().equals("com.ryanheise.audioservice.NOTIFICATION_CLICK"))));
    }

    @Override // B5.a
    public void onAttachedToActivity(B5.c cVar) {
        this.f12316c = cVar;
        this.f12318e.d(cVar.c());
        this.f12318e.e(cVar.c());
        this.f12318e.g(this.f12315b.b() != B(cVar.c()).k());
        f12306i = this.f12318e;
        N();
        if (f12312o != null) {
            MediaControllerCompat.f(f12306i.f12333b, f12312o);
        }
        if (f12311n == null) {
            x();
        }
        Activity activity = f12306i.f12333b;
        if (this.f12318e.h()) {
            activity.setIntent(new Intent("android.intent.action.MAIN"));
        }
        O();
    }

    @Override // A5.a
    public void onAttachedToEngine(a.b bVar) {
        this.f12315b = bVar;
        d dVar = new d(bVar.b());
        this.f12318e = dVar;
        dVar.e(this.f12315b.a());
        f12305h.add(this.f12318e);
        if (this.f12314a == null) {
            this.f12314a = this.f12315b.a();
        }
        if (f12307j == null) {
            c cVar = new c(this.f12315b.b());
            f12307j = cVar;
            AudioService.Q(cVar);
        }
        if (f12311n == null) {
            x();
        }
    }

    @Override // B5.a
    public void onDetachedFromActivity() {
        this.f12316c.i(this.f12317d);
        this.f12316c = null;
        this.f12317d = null;
        this.f12318e.d(null);
        this.f12318e.e(this.f12315b.a());
        if (f12305h.size() == 1) {
            z();
        }
        if (this.f12318e == f12306i) {
            f12306i = null;
        }
    }

    @Override // B5.a
    public void onDetachedFromActivityForConfigChanges() {
        this.f12316c.i(this.f12317d);
        this.f12316c = null;
        this.f12318e.d(null);
        this.f12318e.e(this.f12315b.a());
    }

    @Override // A5.a
    public void onDetachedFromEngine(a.b bVar) {
        Set set = f12305h;
        if (set.size() == 1) {
            z();
        }
        set.remove(this.f12318e);
        this.f12318e.e(null);
        this.f12318e = null;
        this.f12314a = null;
        c cVar = f12307j;
        if (cVar != null && cVar.f12321a == this.f12315b.b()) {
            System.out.println("### destroying audio handler interface");
            f12307j.Q();
            f12307j = null;
        }
        this.f12315b = null;
    }

    @Override // B5.a
    public void onReattachedToActivityForConfigChanges(B5.c cVar) {
        this.f12316c = cVar;
        this.f12318e.d(cVar.c());
        this.f12318e.e(cVar.c());
        N();
    }

    public final void x() {
        if (f12311n == null) {
            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(this.f12314a, new ComponentName(this.f12314a, (Class<?>) AudioService.class), this.f12319f, null);
            f12311n = mediaBrowserCompat;
            mediaBrowserCompat.a();
        }
    }

    public final void z() {
        d dVar = f12306i;
        Activity activity = dVar != null ? dVar.f12333b : null;
        if (activity != null) {
            activity.setIntent(new Intent("android.intent.action.MAIN"));
        }
        MediaControllerCompat mediaControllerCompat = f12312o;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.g(f12313p);
            f12312o = null;
        }
        MediaBrowserCompat mediaBrowserCompat = f12311n;
        if (mediaBrowserCompat != null) {
            mediaBrowserCompat.b();
            f12311n = null;
        }
    }
}
