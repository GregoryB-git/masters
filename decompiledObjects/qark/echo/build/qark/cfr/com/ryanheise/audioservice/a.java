/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Bitmap
 *  android.media.AudioTrack
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.SystemClock
 *  android.util.Log
 *  java.io.PrintStream
 *  java.io.Serializable
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.LinkedList
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package com.ryanheise.audioservice;

import A5.a;
import E5.j;
import E5.k;
import E5.n;
import a0.d;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
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
import com.ryanheise.audioservice.AudioService;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l5.h;
import l5.i;
import l5.l;
import l5.m;
import l5.o;
import l5.q;
import w5.a;

public class a
implements A5.a,
B5.a {
    public static String g = "audio_service_engine";
    public static final Set h = new HashSet();
    public static d i;
    public static c j;
    public static final long k;
    public static k.d l;
    public static boolean m;
    public static MediaBrowserCompat n;
    public static MediaControllerCompat o;
    public static final MediaControllerCompat.a p;
    public Context a;
    public a.b b;
    public B5.c c;
    public n d;
    public d e;
    public final MediaBrowserCompat.b f;

    static {
        k = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        p = new MediaControllerCompat.a(){};
    }

    public a() {
        this.f = new MediaBrowserCompat.b(){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void a() {
                if (a.this.a == null) {
                    return;
                }
                try {
                    MediaSessionCompat.Token token = n.c();
                    o = new MediaControllerCompat(a.this.a, token);
                    token = i != null ? i.b : null;
                    if (token != null) {
                        MediaControllerCompat.f((Activity)token, o);
                    }
                    o.d(p);
                    if (l == null) return;
                    {
                        l.a((Object)a.F(new Object[0]));
                        l = null;
                        return;
                    }
                }
                catch (Exception exception) {}
                Object object = System.out;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onConnected error: ");
                stringBuilder.append(exception.getMessage());
                object.println(stringBuilder.toString());
                exception.printStackTrace();
                if (l != null) {
                    object = l;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("onConnected error: ");
                    stringBuilder.append(exception.getMessage());
                    object.b(stringBuilder.toString(), null, null);
                    return;
                }
                a.this.e.f(true);
            }

            @Override
            public void b() {
                if (l != null) {
                    l.b("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.", null, null);
                    return;
                }
                a.this.e.f(true);
            }

            @Override
            public void c() {
                System.out.println("### UNHANDLED: onConnectionSuspended");
            }
        };
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void A() {
        synchronized (a.class) {
            Throwable throwable2;
            block6 : {
                block5 : {
                    Object object;
                    try {
                        object = h.iterator();
                        while (object.hasNext()) {
                            Activity activity = ((d)object.next()).b;
                            if (activity == null) continue;
                        }
                    }
                    catch (Throwable throwable2) {}
                    return;
                    object = v5.a.b().a(g);
                    if (object == null) break block5;
                    object.g();
                    v5.a.b().d(g);
                    break block5;
                    break block6;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static io.flutter.embedding.engine.a B(Context object) {
        synchronized (a.class) {
            Object object2;
            io.flutter.embedding.engine.a a8;
            block10 : {
                block9 : {
                    try {
                        a8 = v5.a.b().a(g);
                        object2 = a8;
                        if (a8 != null) return object2;
                        a8 = new io.flutter.embedding.engine.a(object.getApplicationContext());
                        if (!(object instanceof u5.i)) break block9;
                        u5.i i8 = (u5.i)object;
                        object = object2 = i8.i();
                        if (object2 == null) {
                            object = object2;
                            if (i8.y()) {
                                i8 = i8.getIntent().getData();
                                object = object2;
                                if (i8 != null) {
                                    object = object2 = i8.getPath();
                                    if (i8.getQuery() != null) {
                                        object = object2;
                                        if (!i8.getQuery().isEmpty()) {
                                            object = new StringBuilder();
                                            object.append((String)object2);
                                            object.append("?");
                                            object.append(i8.getQuery());
                                            object = object.toString();
                                        }
                                    }
                                }
                            }
                        }
                        break block10;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
                object = null;
            }
            object2 = object;
            if (object == null) {
                object2 = "/";
            }
            a8.o().c((String)object2);
            a8.k().j(a.c.a());
            v5.a.b().c(g, a8);
            return a8;
        }
    }

    public static Integer C(Object object) {
        if (object != null && !(object instanceof Integer)) {
            return (int)((Long)object).longValue();
        }
        return (Integer)object;
    }

    public static Long D(Object object) {
        if (object != null && !(object instanceof Long)) {
            return (long)((Integer)object);
        }
        return (Long)object;
    }

    public static /* varargs */ Map F(Object ... arrobject) {
        HashMap hashMap = new HashMap();
        for (int i8 = 0; i8 < arrobject.length; i8 += 2) {
            hashMap.put((Object)((String)arrobject[i8]), arrobject[i8 + 1]);
        }
        return hashMap;
    }

    public static Bundle G(Map map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (String string2 : map.keySet()) {
            Object object = map.get((Object)string2);
            if (object instanceof Integer) {
                bundle.putInt(string2, ((Integer)object).intValue());
                continue;
            }
            if (object instanceof Long) {
                bundle.putLong(string2, ((Long)object).longValue());
                continue;
            }
            if (object instanceof Double) {
                bundle.putDouble(string2, ((Double)object).doubleValue());
                continue;
            }
            if (object instanceof Boolean) {
                bundle.putBoolean(string2, ((Boolean)object).booleanValue());
                continue;
            }
            if (!(object instanceof String)) continue;
            bundle.putString(string2, (String)object);
        }
        return bundle;
    }

    public static Map H(MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat == null) {
            return null;
        }
        MediaDescriptionCompat mediaDescriptionCompat = mediaMetadataCompat.e();
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"id", (Object)mediaDescriptionCompat.g());
        hashMap.put((Object)"title", (Object)a.I(mediaMetadataCompat, "android.media.metadata.TITLE"));
        hashMap.put((Object)"album", (Object)a.I(mediaMetadataCompat, "android.media.metadata.ALBUM"));
        if (mediaDescriptionCompat.e() != null) {
            hashMap.put((Object)"artUri", (Object)mediaDescriptionCompat.e().toString());
        }
        hashMap.put((Object)"artist", (Object)a.I(mediaMetadataCompat, "android.media.metadata.ARTIST"));
        hashMap.put((Object)"genre", (Object)a.I(mediaMetadataCompat, "android.media.metadata.GENRE"));
        if (mediaMetadataCompat.a("android.media.metadata.DURATION")) {
            hashMap.put((Object)"duration", (Object)mediaMetadataCompat.f("android.media.metadata.DURATION"));
        }
        boolean bl = mediaMetadataCompat.f("playable_long") != 0L;
        hashMap.put((Object)"playable", (Object)bl);
        hashMap.put((Object)"displayTitle", (Object)a.I(mediaMetadataCompat, "android.media.metadata.DISPLAY_TITLE"));
        hashMap.put((Object)"displaySubtitle", (Object)a.I(mediaMetadataCompat, "android.media.metadata.DISPLAY_SUBTITLE"));
        hashMap.put((Object)"displayDescription", (Object)a.I(mediaMetadataCompat, "android.media.metadata.DISPLAY_DESCRIPTION"));
        if (mediaMetadataCompat.a("android.media.metadata.RATING")) {
            hashMap.put((Object)"rating", (Object)a.J(mediaMetadataCompat.h("android.media.metadata.RATING")));
        }
        if ((mediaMetadataCompat = a.w(mediaMetadataCompat.d())).size() > 0) {
            hashMap.put((Object)"extras", (Object)mediaMetadataCompat);
        }
        return hashMap;
    }

    public static String I(MediaMetadataCompat mediaMetadataCompat, String string2) {
        if ((mediaMetadataCompat = mediaMetadataCompat.j(string2)) != null) {
            return mediaMetadataCompat.toString();
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static HashMap J(RatingCompat var0) {
        block7 : {
            var3_1 = new HashMap();
            var3_1.put((Object)"type", (Object)var0.d());
            if (!var0.g()) break block7;
            switch (var0.d()) {
                default: {
                    return var3_1;
                }
                case 6: {
                    var1_2 = var0.b();
                    ** GOTO lbl12
                }
                case 3: 
                case 4: 
                case 5: {
                    var1_2 = var0.e();
lbl12: // 2 sources:
                    var0 = Float.valueOf((float)var1_2);
                    ** GOTO lbl20
                }
                case 2: {
                    var2_3 = var0.h();
                    ** GOTO lbl19
                }
                case 1: {
                    var2_3 = var0.f();
lbl19: // 2 sources:
                    var0 = Boolean.valueOf((boolean)var2_3);
lbl20: // 2 sources:
                    var3_1.put((Object)"value", (Object)var0);
                    return var3_1;
                }
                case 0: 
            }
        }
        var3_1.put((Object)"value", (Object)null);
        return var3_1;
    }

    public static List K(List list) {
        ArrayList arrayList = new ArrayList();
        list = list.iterator();
        int n8 = 0;
        while (list.hasNext()) {
            Map map = (Map)list.next();
            arrayList.add((Object)new MediaSessionCompat.QueueItem(a.v(a.y(map).e(), (Map)map.get((Object)"extras")), n8));
            ++n8;
        }
        return arrayList;
    }

    public static RatingCompat L(Map object) {
        if (object == null) {
            return null;
        }
        Integer n8 = (Integer)object.get((Object)"type");
        if ((object = object.get((Object)"value")) != null) {
            switch (n8) {
                default: {
                    return RatingCompat.m(n8);
                }
                case 6: {
                    return RatingCompat.j(((Double)object).floatValue());
                }
                case 3: 
                case 4: 
                case 5: {
                    return RatingCompat.k(n8, ((Integer)object).intValue());
                }
                case 2: {
                    return RatingCompat.l((Boolean)object);
                }
                case 1: 
            }
            return RatingCompat.i((Boolean)object);
        }
        return RatingCompat.m(n8);
    }

    public static MediaBrowserCompat.MediaItem M(Map map) {
        MediaDescriptionCompat mediaDescriptionCompat = a.v(a.y(map).e(), (Map)map.get((Object)"extras"));
        int n8 = (Boolean)map.get((Object)"playable") != false ? 2 : 1;
        return new MediaBrowserCompat.MediaItem(mediaDescriptionCompat, n8);
    }

    public static /* synthetic */ boolean a(a a8, Intent intent) {
        return a8.E(intent);
    }

    public static /* synthetic */ long j() {
        return k;
    }

    public static MediaDescriptionCompat v(MediaDescriptionCompat mediaDescriptionCompat, Map map) {
        MediaDescriptionCompat mediaDescriptionCompat2 = mediaDescriptionCompat;
        if (map != null) {
            if (map.isEmpty()) {
                return mediaDescriptionCompat;
            }
            mediaDescriptionCompat2 = new Bundle();
            if (mediaDescriptionCompat.c() != null) {
                mediaDescriptionCompat2.putAll(mediaDescriptionCompat.c());
            }
            mediaDescriptionCompat2.putAll(a.G(map));
            mediaDescriptionCompat2 = new MediaDescriptionCompat.d().i(mediaDescriptionCompat.j()).h(mediaDescriptionCompat.i()).b(mediaDescriptionCompat.b()).d(mediaDescriptionCompat.d()).e(mediaDescriptionCompat.e()).f(mediaDescriptionCompat.g()).g(mediaDescriptionCompat.h()).c((Bundle)mediaDescriptionCompat2).a();
        }
        return mediaDescriptionCompat2;
    }

    public static Map w(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String string2 : bundle.keySet()) {
            Serializable serializable = bundle.getSerializable(string2);
            if (serializable == null) continue;
            hashMap.put((Object)string2, (Object)serializable);
        }
        return hashMap;
    }

    public static MediaMetadataCompat y(Map map) {
        return AudioService.R.F((String)map.get((Object)"id"), (String)map.get((Object)"title"), (String)map.get((Object)"album"), (String)map.get((Object)"artist"), (String)map.get((Object)"genre"), a.D(map.get((Object)"duration")), (String)map.get((Object)"artUri"), (Boolean)map.get((Object)"playable"), (String)map.get((Object)"displayTitle"), (String)map.get((Object)"displaySubtitle"), (String)map.get((Object)"displayDescription"), a.L((Map)map.get((Object)"rating")), (Map)map.get((Object)"extras"));
    }

    public final /* synthetic */ boolean E(Intent intent) {
        this.e.b.setIntent(intent);
        this.O();
        return true;
    }

    public final void N() {
        B5.c c8 = this.c;
        i i8 = new i(this);
        this.d = i8;
        c8.g(i8);
    }

    public final void O() {
        Activity activity = this.e.b;
        if (j != null && activity.getIntent().getAction() != null) {
            boolean bl = activity.getIntent().getAction().equals((Object)"com.ryanheise.audioservice.NOTIFICATION_CLICK");
            j.R("onNotificationClicked", (Object)a.F("clicked", bl));
        }
    }

    @Override
    public void onAttachedToActivity(B5.c object) {
        this.c = object;
        this.e.d(object.c());
        this.e.e((Context)object.c());
        object = a.B((Context)object.c());
        d d8 = this.e;
        boolean bl = this.b.b() != object.k();
        d8.g(bl);
        i = this.e;
        this.N();
        if (o != null) {
            MediaControllerCompat.f(i.b, o);
        }
        if (n == null) {
            this.x();
        }
        object = i.b;
        if (this.e.h()) {
            object.setIntent(new Intent("android.intent.action.MAIN"));
        }
        this.O();
    }

    @Override
    public void onAttachedToEngine(a.b object) {
        this.b = object;
        this.e = object = new d(object.b());
        ((d)object).e(this.b.a());
        h.add((Object)this.e);
        if (this.a == null) {
            this.a = this.b.a();
        }
        if (j == null) {
            j = object = new c(this.b.b());
            AudioService.Q((AudioService.e)object);
        }
        if (n == null) {
            this.x();
        }
    }

    @Override
    public void onDetachedFromActivity() {
        this.c.i(this.d);
        this.c = null;
        this.d = null;
        this.e.d(null);
        this.e.e(this.b.a());
        if (h.size() == 1) {
            this.z();
        }
        if (this.e == i) {
            i = null;
        }
    }

    @Override
    public void onDetachedFromActivityForConfigChanges() {
        this.c.i(this.d);
        this.c = null;
        this.e.d(null);
        this.e.e(this.b.a());
    }

    @Override
    public void onDetachedFromEngine(a.b object) {
        object = h;
        if (object.size() == 1) {
            this.z();
        }
        object.remove((Object)this.e);
        this.e.e(null);
        this.e = null;
        this.a = null;
        object = j;
        if (object != null && object.a == this.b.b()) {
            System.out.println("### destroying audio handler interface");
            j.Q();
            j = null;
        }
        this.b = null;
    }

    @Override
    public void onReattachedToActivityForConfigChanges(B5.c c8) {
        this.c = c8;
        this.e.d(c8.c());
        this.e.e((Context)c8.c());
        this.N();
    }

    public final void x() {
        if (n == null) {
            MediaBrowserCompat mediaBrowserCompat;
            n = mediaBrowserCompat = new MediaBrowserCompat(this.a, new ComponentName(this.a, AudioService.class), this.f, null);
            mediaBrowserCompat.a();
        }
    }

    public final void z() {
        Object object = i;
        object = object != null ? ((d)object).b : null;
        if (object != null) {
            object.setIntent(new Intent("android.intent.action.MAIN"));
        }
        if ((object = o) != null) {
            object.g(p);
            o = null;
        }
        if ((object = n) != null) {
            object.b();
            n = null;
        }
    }

    public static class c
    implements k.c,
    AudioService.e {
        public E5.c a;
        public k b;
        public AudioTrack c;
        public final Handler d = new Handler(Looper.getMainLooper());
        public List e = new LinkedList();

        public c(E5.c object) {
            this.a = object;
            this.b = object = new k((E5.c)object, "com.ryanheise.audio_service.handler.methods");
            object.e(this);
        }

        public static /* synthetic */ void K(k.d d8, Exception exception) {
            d8.b("UNEXPECTED_ERROR", "Unexpected error", Log.getStackTraceString((Throwable)exception));
        }

        public static /* synthetic */ void L(k.d d8) {
            d8.a(null);
        }

        public static /* synthetic */ void M(k.d d8, Exception exception) {
            d8.b("UNEXPECTED_ERROR", "Unexpected error", Log.getStackTraceString((Throwable)exception));
        }

        public static /* synthetic */ void N(k.d d8) {
            d8.a(null);
        }

        public static /* synthetic */ void O(c c8, Map map, k.d d8) {
            c8.Z(map, d8);
        }

        public static /* synthetic */ void a(c c8, Map map, k.d d8) {
            c8.W(map, d8);
        }

        @Override
        public void A() {
            this.R("fastForward", (Object)a.F(new Object[0]));
        }

        @Override
        public void B(long l8) {
            this.R("seek", (Object)a.F("position", l8 * 1000L));
        }

        @Override
        public void C(MediaMetadataCompat mediaMetadataCompat) {
            this.R("addQueueItem", (Object)a.F(new Object[]{"mediaItem", a.H(mediaMetadataCompat)}));
        }

        @Override
        public void D() {
            a.A();
        }

        @Override
        public void E(String string2, Bundle bundle) {
            this.R("customAction", (Object)a.F(new Object[]{"name", string2, "extras", a.w(bundle)}));
        }

        @Override
        public void F(String string2, Bundle bundle) {
            this.R("prepareFromSearch", (Object)a.F(new Object[]{"query", string2, "extras", a.w(bundle)}));
        }

        @Override
        public void G(long l8) {
            this.R("skipToQueueItem", (Object)a.F("index", l8));
        }

        @Override
        public void H(int n8) {
            this.R("androidAdjustRemoteVolume", (Object)a.F("direction", n8));
        }

        @Override
        public void I(Uri uri, Bundle bundle) {
            this.R("playFromUri", (Object)a.F(new Object[]{"uri", uri.toString(), "extras", a.w(bundle)}));
        }

        @Override
        public void J(RatingCompat ratingCompat, Bundle bundle) {
            this.R("setRating", (Object)a.F(new Object[]{"rating", a.J(ratingCompat), "extras", a.w(bundle)}));
        }

        public final void Q() {
            AudioTrack audioTrack = this.c;
            if (audioTrack != null) {
                audioTrack.release();
            }
        }

        public void R(String string2, Object object) {
            this.S(string2, object, null);
        }

        public void S(String string2, Object object, k.d d8) {
            if (m) {
                this.b.d(string2, object, d8);
                return;
            }
            this.e.add((Object)new e(string2, object, d8));
        }

        public void T() {
            for (e e8 : this.e) {
                this.b.d(e8.a, e8.b, e8.c);
            }
            this.e.clear();
        }

        public final /* synthetic */ void W(Map object, k.d d8) {
            try {
                object = a.y((Map)object.get((Object)"mediaItem"));
                AudioService.R.Y((MediaMetadataCompat)object);
                this.d.post((Runnable)new l5.n(d8));
                return;
            }
            catch (Exception exception) {
                this.d.post((Runnable)new o(d8, exception));
                return;
            }
        }

        public final /* synthetic */ void Z(Map map, k.d d8) {
            try {
                map = a.K((List)map.get((Object)"queue"));
                AudioService.R.a0((List)map);
                this.d.post((Runnable)new l(d8));
                return;
            }
            catch (Exception exception) {
                this.d.post((Runnable)new m(d8, exception));
                return;
            }
        }

        public void a0(E5.c object) {
            this.b.e(null);
            this.a = object;
            this.b = object = new k((E5.c)object, "com.ryanheise.audio_service.handler.methods");
            object.e(this);
        }

        @Override
        public void b() {
            this.R("onNotificationDeleted", (Object)a.F(new Object[0]));
        }

        @Override
        public void c(int n8) {
            this.R("setRepeatMode", (Object)a.F("repeatMode", n8));
        }

        @Override
        public void d(int n8) {
            this.R("setShuffleMode", (Object)a.F("shuffleMode", n8));
        }

        @Override
        public void e() {
            this.R("play", (Object)a.F(new Object[0]));
        }

        @Override
        public void f(boolean bl) {
            this.R("setCaptioningEnabled", (Object)a.F("enabled", bl));
        }

        @Override
        public void g() {
            this.R("stop", (Object)a.F(new Object[0]));
        }

        @Override
        public void h(String string2, Bundle bundle) {
            this.R("prepareFromMediaId", (Object)a.F(new Object[]{"mediaId", string2, "extras", a.w(bundle)}));
        }

        @Override
        public void i(String string2, Bundle bundle, final d.l l8) {
            if (j != null) {
                HashMap hashMap = new HashMap();
                hashMap.put((Object)"query", (Object)string2);
                hashMap.put((Object)"extras", (Object)a.w(bundle));
                j.S("search", (Object)hashMap, new k.d(){

                    @Override
                    public void a(Object object) {
                        List list = (List)((Map)object).get((Object)"mediaItems");
                        object = new ArrayList();
                        list = list.iterator();
                        while (list.hasNext()) {
                            object.add((Object)a.M((Map)list.next()));
                        }
                        l8.g(object);
                    }

                    @Override
                    public void b(String string2, String string3, Object object) {
                        l8.f(new Bundle());
                    }

                    @Override
                    public void c() {
                        l8.f(new Bundle());
                    }
                });
            }
            l8.a();
        }

        @Override
        public void j(q q8) {
            this.R("click", (Object)a.F("button", q8.ordinal()));
        }

        @Override
        public void k() {
            this.R("skipToPrevious", (Object)a.F(new Object[0]));
        }

        @Override
        public void l() {
            this.R("skipToNext", (Object)a.F(new Object[0]));
        }

        @Override
        public void m(String string2, final d.l l8) {
            if (j != null) {
                HashMap hashMap = new HashMap();
                hashMap.put((Object)"mediaId", (Object)string2);
                j.S("getMediaItem", (Object)hashMap, new k.d(){

                    @Override
                    public void a(Object object) {
                        if ((object = (Map)((Map)object).get((Object)"mediaItem")) != null) {
                            object = a.M((Map)object);
                            l8.g(object);
                            return;
                        }
                        l8.g(null);
                    }

                    @Override
                    public void b(String string2, String string3, Object object) {
                        l8.f(new Bundle());
                    }

                    @Override
                    public void c() {
                        l8.f(new Bundle());
                    }
                });
            }
            l8.a();
        }

        @Override
        public void n(MediaMetadataCompat mediaMetadataCompat) {
            this.R("removeQueueItem", (Object)a.F(new Object[]{"mediaItem", a.H(mediaMetadataCompat)}));
        }

        @Override
        public void o(float f8) {
            this.R("setSpeed", (Object)a.F(new Object[]{"speed", Float.valueOf((float)f8)}));
        }

        /*
         * Exception decompiling
         */
        @Override
        public void onMethodCall(j var1_1, k.d var2_3) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.CannotPerformDecode: reachable test BLOCK was exited and re-entered.
            // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.getFarthestReachableInRange(Misc.java:143)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:385)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:65)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:423)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
            // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
            // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
            // org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:682)
            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:765)
            // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
            // org.benf.cfr.reader.Main.doJar(Main.java:134)
            // org.benf.cfr.reader.Main.main(Main.java:189)
            throw new IllegalStateException("Decompilation failed");
        }

        @Override
        public void p() {
            this.R("prepare", (Object)a.F(new Object[0]));
        }

        @Override
        public void q(Uri uri, Bundle bundle) {
            this.R("prepareFromUri", (Object)a.F(new Object[]{"uri", uri.toString(), "extras", a.w(bundle)}));
        }

        @Override
        public void r() {
            this.R("rewind", (Object)a.F(new Object[0]));
        }

        @Override
        public void s(String string2, final d.l l8, Bundle bundle) {
            if (j != null) {
                HashMap hashMap = new HashMap();
                hashMap.put((Object)"parentMediaId", (Object)string2);
                hashMap.put((Object)"options", (Object)a.w(bundle));
                j.S("getChildren", (Object)hashMap, new k.d(){

                    @Override
                    public void a(Object object) {
                        List list = (List)((Map)object).get((Object)"children");
                        object = new ArrayList();
                        list = list.iterator();
                        while (list.hasNext()) {
                            object.add((Object)a.M((Map)list.next()));
                        }
                        l8.g(object);
                    }

                    @Override
                    public void b(String string2, String string3, Object object) {
                        l8.f(new Bundle());
                    }

                    @Override
                    public void c() {
                        l8.f(new Bundle());
                    }
                });
            }
            l8.a();
        }

        @Override
        public void t(RatingCompat ratingCompat) {
            this.R("setRating", (Object)a.F(new Object[]{"rating", a.J(ratingCompat), "extras", null}));
        }

        @Override
        public void u(String string2, Bundle bundle) {
            this.R("playFromSearch", (Object)a.F(new Object[]{"query", string2, "extras", a.w(bundle)}));
        }

        @Override
        public void v(MediaMetadataCompat mediaMetadataCompat, int n8) {
            this.R("insertQueueItem", (Object)a.F(new Object[]{"mediaItem", a.H(mediaMetadataCompat), "index", n8}));
        }

        @Override
        public void w() {
            this.R("pause", (Object)a.F(new Object[0]));
        }

        @Override
        public void x(int n8) {
            this.R("androidSetRemoteVolume", (Object)a.F("volumeIndex", n8));
        }

        @Override
        public void y() {
            this.R("onTaskRemoved", (Object)a.F(new Object[0]));
        }

        @Override
        public void z(String string2, Bundle bundle) {
            this.R("playFromMediaId", (Object)a.F(new Object[]{"mediaId", string2, "extras", a.w(bundle)}));
        }

    }

    public static class d
    implements k.c {
        public Context a;
        public Activity b;
        public final E5.c c;
        public final k d;
        public boolean e;
        public boolean f;

        public d(E5.c object) {
            this.c = object;
            this.d = object = new k((E5.c)object, "com.ryanheise.audio_service.client.methods");
            object.e(this);
        }

        private void d(Activity activity) {
            this.b = activity;
        }

        public final void e(Context context) {
            this.a = context;
        }

        public void f(boolean bl) {
            this.f = bl;
        }

        public void g(boolean bl) {
            this.e = bl;
        }

        public boolean h() {
            if ((this.b.getIntent().getFlags() & 1048576) == 1048576) {
                return true;
            }
            return false;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void onMethodCall(j object, k.d d8) {
            try {
                if (this.e) {
                    throw new IllegalStateException("The Activity class declared in your AndroidManifest.xml is wrong or has not provided the correct FlutterEngine. Please see the README for instructions.");
                }
                Object object2 = object.a;
                if (object2.hashCode() != -804429082) {
                    return;
                }
                if (!object2.equals((Object)"configure")) return;
                {
                    if (this.f) {
                        throw new IllegalStateException("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.");
                    }
                    m = true;
                    object2 = (Map)((Map)object.b).get((Object)"config");
                    object = new h(this.a.getApplicationContext());
                    object.i = (Boolean)object2.get((Object)"androidNotificationClickStartsActivity");
                    object.j = (Boolean)object2.get((Object)"androidNotificationOngoing");
                    object.b = (Boolean)object2.get((Object)"androidResumeOnClick");
                    object.c = (String)object2.get((Object)"androidNotificationChannelId");
                    object.d = (String)object2.get((Object)"androidNotificationChannelName");
                    object.e = (String)object2.get((Object)"androidNotificationChannelDescription");
                    Object object3 = object2.get((Object)"notificationColor");
                    int n8 = -1;
                    int n9 = object3 == null ? -1 : a.C(object2.get((Object)"notificationColor"));
                    object.f = n9;
                    object.g = (String)object2.get((Object)"androidNotificationIcon");
                    object.h = (Boolean)object2.get((Object)"androidShowNotificationBadge");
                    object.k = (Boolean)object2.get((Object)"androidStopForegroundOnPause");
                    n9 = object2.get((Object)"artDownscaleWidth") != null ? (Integer)object2.get((Object)"artDownscaleWidth") : -1;
                    object.l = n9;
                    n9 = n8;
                    if (object2.get((Object)"artDownscaleHeight") != null) {
                        n9 = (Integer)object2.get((Object)"artDownscaleHeight");
                    }
                    object.m = n9;
                    object.c((Map)object2.get((Object)"androidBrowsableRootExtras"));
                    object2 = this.b;
                    if (object2 != null) {
                        object.n = object2.getClass().getName();
                    }
                    object.b();
                    object2 = AudioService.R;
                    if (object2 != null) {
                        object2.B((h)object);
                    }
                    i = this;
                    if (j == null) {
                        j = new c(this.c);
                        AudioService.Q(j);
                    } else {
                        if (a.e().a != this.c) {
                            j.a0(this.c);
                        }
                        j.T();
                    }
                    if (o != null) {
                        d8.a((Object)a.F(new Object[0]));
                        return;
                    }
                    l = d8;
                    return;
                }
            }
            catch (Exception exception) {}
            exception.printStackTrace();
            d8.b(exception.getMessage(), null, null);
        }
    }

    public static class e {
        public final String a;
        public final Object b;
        public final k.d c;

        public e(String string2, Object object, k.d d8) {
            this.a = string2;
            this.b = object;
            this.c = d8;
        }
    }

}

