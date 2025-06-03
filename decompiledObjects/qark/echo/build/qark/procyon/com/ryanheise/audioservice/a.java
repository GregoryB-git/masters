// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.ryanheise.audioservice;

import android.os.BaseBundle;
import l5.h;
import java.util.concurrent.ExecutorService;
import l5.p;
import l5.r;
import java.util.concurrent.Executors;
import E5.j;
import l5.q;
import a0.d;
import l5.m;
import l5.l;
import l5.o;
import android.util.Log;
import java.util.LinkedList;
import android.os.Looper;
import android.os.Handler;
import android.media.AudioTrack;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import android.net.Uri;
import u5.i;
import java.util.Iterator;
import java.io.PrintStream;
import android.app.Activity;
import android.os.SystemClock;
import java.util.HashSet;
import E5.n;
import B5.c;
import android.content.Context;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.MediaBrowserCompat;
import E5.k;
import java.util.Set;

public class a implements A5.a, B5.a
{
    public static String g = "audio_service_engine";
    public static final Set h;
    public static d i;
    public static c j;
    public static final long k;
    public static k.d l;
    public static boolean m;
    public static MediaBrowserCompat n;
    public static MediaControllerCompat o;
    public static final MediaControllerCompat.a p;
    public Context a;
    public b b;
    public B5.c c;
    public n d;
    public d e;
    public final MediaBrowserCompat.b f;
    
    static {
        h = new HashSet();
        k = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        p = new MediaControllerCompat.a() {};
    }
    
    public a() {
        this.f = new MediaBrowserCompat.b() {
            @Override
            public void a() {
                if (a.b(a.this) == null) {
                    return;
                }
                while (true) {
                    while (true) {
                        Label_0203: {
                            while (true) {
                                try {
                                    a.o(new MediaControllerCompat(a.b(a.this), a.m().c()));
                                    if (a.p() != null) {
                                        final Activity a = com.ryanheise.audioservice.a.d.a(com.ryanheise.audioservice.a.p());
                                        if (a != null) {
                                            MediaControllerCompat.f(a, com.ryanheise.audioservice.a.n());
                                        }
                                        com.ryanheise.audioservice.a.n().d(com.ryanheise.audioservice.a.r());
                                        if (com.ryanheise.audioservice.a.s() != null) {
                                            com.ryanheise.audioservice.a.s().a(com.ryanheise.audioservice.a.F(new Object[0]));
                                            com.ryanheise.audioservice.a.t(null);
                                        }
                                        return;
                                    }
                                    break Label_0203;
                                    final PrintStream out = System.out;
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("onConnected error: ");
                                    final Exception ex;
                                    sb.append(ex.getMessage());
                                    out.println(sb.toString());
                                    ex.printStackTrace();
                                    // iftrue(Label_0187:, a.s() == null)
                                    final k.d s = a.s();
                                    final StringBuilder sb2 = new StringBuilder();
                                    sb2.append("onConnected error: ");
                                    sb2.append(ex.getMessage());
                                    s.b(sb2.toString(), null, null);
                                    return;
                                    Label_0187: {
                                        a.u(a.this).f(true);
                                    }
                                    return;
                                }
                                catch (Exception ex2) {}
                                final Exception ex2;
                                final Exception ex = ex2;
                                continue;
                            }
                        }
                        final Activity a = null;
                        continue;
                    }
                }
            }
            
            @Override
            public void b() {
                if (a.s() != null) {
                    a.s().b("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.", null, null);
                    return;
                }
                a.u(a.this).f(true);
            }
            
            @Override
            public void c() {
                System.out.println("### UNHANDLED: onConnectionSuspended");
            }
        };
    }
    
    public static void A() {
        // monitorenter(a.class)
        // monitorexit(a.class)
        Label_0077: {
            Label_0046: {
                try {
                    final Iterator<d> iterator = a.h.iterator();
                    Block_5: {
                        while (iterator.hasNext()) {
                            if (d.a(iterator.next()) != null) {
                                break Block_5;
                            }
                        }
                        break Label_0046;
                    }
                    // monitorexit(a.class)
                    return;
                }
                finally {
                    break Label_0077;
                }
            }
            final io.flutter.embedding.engine.a a = v5.a.b().a(com.ryanheise.audioservice.a.g);
            if (a != null) {
                a.g();
                v5.a.b().d(com.ryanheise.audioservice.a.g);
            }
            return;
        }
    }
    // monitorexit(a.class)
    
    public static io.flutter.embedding.engine.a B(final Context context) {
        io.flutter.embedding.engine.a a2;
        io.flutter.embedding.engine.a a;
        i i;
        Uri data;
        String path;
        StringBuilder sb;
        String s = null;
        String s2;
        Label_0176_Outer:Label_0141_Outer:
        while (true) {
            // monitorenter(a.class)
            while (true) {
                Label_0187: {
                    Label_0185: {
                        while (true) {
                            try {
                                a = (a2 = v5.a.b().a(com.ryanheise.audioservice.a.g));
                                if (a == null) {
                                    a = new io.flutter.embedding.engine.a(context.getApplicationContext());
                                    if (!(context instanceof i)) {
                                        break Label_0185;
                                    }
                                    i = (i)context;
                                    if (i.i() != null || !i.y()) {
                                        break Label_0187;
                                    }
                                    data = i.getIntent().getData();
                                    if (data == null) {
                                        break Label_0187;
                                    }
                                    path = data.getPath();
                                    if (data.getQuery() != null && !data.getQuery().isEmpty()) {
                                        sb = new StringBuilder();
                                        sb.append(path);
                                        sb.append("?");
                                        sb.append(data.getQuery());
                                        sb.toString();
                                    }
                                    break Label_0187;
                                }
                                while (true) {
                                    return a2;
                                    throw s;
                                    a.o().c(s2);
                                    a.k().j(w5.a.c.a());
                                    v5.a.b().c(com.ryanheise.audioservice.a.g, a);
                                    a2 = a;
                                    continue Label_0176_Outer;
                                }
                            }
                            // monitorexit(a.class)
                            // monitorexit(a.class)
                            finally {
                                continue Label_0141_Outer;
                            }
                            break;
                        }
                    }
                    s = null;
                }
                if ((s2 = s) == null) {
                    s2 = "/";
                    continue;
                }
                continue;
            }
        }
    }
    
    public static Integer C(final Object o) {
        if (o != null && !(o instanceof Integer)) {
            return (int)(long)o;
        }
        return (Integer)o;
    }
    
    public static Long D(final Object o) {
        if (o != null && !(o instanceof Long)) {
            return (long)(int)o;
        }
        return (Long)o;
    }
    
    public static Map F(final Object... array) {
        final HashMap<String, Object> hashMap = new HashMap<String, Object>();
        for (int i = 0; i < array.length; i += 2) {
            hashMap.put((String)array[i], array[i + 1]);
        }
        return hashMap;
    }
    
    public static Bundle G(final Map map) {
        if (map == null) {
            return null;
        }
        final Bundle bundle = new Bundle();
        for (final String s : map.keySet()) {
            final V value = map.get(s);
            if (value instanceof Integer) {
                ((BaseBundle)bundle).putInt(s, (int)value);
            }
            else if (value instanceof Long) {
                ((BaseBundle)bundle).putLong(s, (long)value);
            }
            else if (value instanceof Double) {
                ((BaseBundle)bundle).putDouble(s, (double)value);
            }
            else if (value instanceof Boolean) {
                ((BaseBundle)bundle).putBoolean(s, (boolean)value);
            }
            else {
                if (!(value instanceof String)) {
                    continue;
                }
                ((BaseBundle)bundle).putString(s, (String)value);
            }
        }
        return bundle;
    }
    
    public static Map H(final MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat == null) {
            return null;
        }
        final MediaDescriptionCompat e = mediaMetadataCompat.e();
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("id", e.g());
        hashMap.put("title", I(mediaMetadataCompat, "android.media.metadata.TITLE"));
        hashMap.put("album", I(mediaMetadataCompat, "android.media.metadata.ALBUM"));
        if (e.e() != null) {
            hashMap.put("artUri", e.e().toString());
        }
        hashMap.put("artist", I(mediaMetadataCompat, "android.media.metadata.ARTIST"));
        hashMap.put("genre", I(mediaMetadataCompat, "android.media.metadata.GENRE"));
        if (mediaMetadataCompat.a("android.media.metadata.DURATION")) {
            hashMap.put("duration", (String)mediaMetadataCompat.f("android.media.metadata.DURATION"));
        }
        hashMap.put("playable", (String)(mediaMetadataCompat.f("playable_long") != 0L));
        hashMap.put("displayTitle", I(mediaMetadataCompat, "android.media.metadata.DISPLAY_TITLE"));
        hashMap.put("displaySubtitle", I(mediaMetadataCompat, "android.media.metadata.DISPLAY_SUBTITLE"));
        hashMap.put("displayDescription", I(mediaMetadataCompat, "android.media.metadata.DISPLAY_DESCRIPTION"));
        if (mediaMetadataCompat.a("android.media.metadata.RATING")) {
            hashMap.put("rating", (String)J(mediaMetadataCompat.h("android.media.metadata.RATING")));
        }
        final Map w = w(mediaMetadataCompat.d());
        if (w.size() > 0) {
            hashMap.put("extras", (String)w);
        }
        return hashMap;
    }
    
    public static String I(final MediaMetadataCompat mediaMetadataCompat, final String s) {
        final CharSequence j = mediaMetadataCompat.j(s);
        if (j != null) {
            return j.toString();
        }
        return null;
    }
    
    public static HashMap J(final RatingCompat ratingCompat) {
        final HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("type", ratingCompat.d());
        Label_0128: {
            if (ratingCompat.g()) {
                while (true) {
                    boolean b = false;
                    Label_0112: {
                        float f = 0.0f;
                        switch (ratingCompat.d()) {
                            default: {
                                return hashMap;
                            }
                            case 6: {
                                f = ratingCompat.b();
                                break;
                            }
                            case 3:
                            case 4:
                            case 5: {
                                f = ratingCompat.e();
                                break;
                            }
                            case 2: {
                                b = ratingCompat.h();
                                break Label_0112;
                            }
                            case 1: {
                                b = ratingCompat.f();
                                break Label_0112;
                            }
                            case 0: {
                                break Label_0128;
                            }
                        }
                        final Serializable value = f;
                        hashMap.put("value", (Integer)value);
                        return hashMap;
                    }
                    final Serializable value = b;
                    continue;
                }
            }
        }
        hashMap.put("value", null);
        return hashMap;
    }
    
    public static List K(final List list) {
        final ArrayList<MediaSessionCompat.QueueItem> list2 = new ArrayList<MediaSessionCompat.QueueItem>();
        final Iterator<Map<K, Map>> iterator = list.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Map<K, Map> map = iterator.next();
            list2.add(new MediaSessionCompat.QueueItem(v(y(map).e(), map.get("extras")), n));
            ++n;
        }
        return list2;
    }
    
    public static RatingCompat L(final Map map) {
        if (map == null) {
            return null;
        }
        final Integer n = map.get("type");
        final Integer value = map.get("value");
        if (value == null) {
            return RatingCompat.m(n);
        }
        switch (n) {
            default: {
                return RatingCompat.m(n);
            }
            case 6: {
                return RatingCompat.j(Double.valueOf(value).floatValue());
            }
            case 3:
            case 4:
            case 5: {
                return RatingCompat.k(n, value);
            }
            case 2: {
                return RatingCompat.l((Boolean)(Object)value);
            }
            case 1: {
                return RatingCompat.i((Boolean)(Object)value);
            }
        }
    }
    
    public static MediaBrowserCompat.MediaItem M(final Map map) {
        final MediaDescriptionCompat v = v(y(map).e(), map.get("extras"));
        int n;
        if (map.get("playable")) {
            n = 2;
        }
        else {
            n = 1;
        }
        return new MediaBrowserCompat.MediaItem(v, n);
    }
    
    public static /* synthetic */ Context b(final a a) {
        return a.a;
    }
    
    public static /* synthetic */ boolean c() {
        return a.m;
    }
    
    public static /* synthetic */ boolean d(final boolean m) {
        return a.m = m;
    }
    
    public static /* synthetic */ c e() {
        return a.j;
    }
    
    public static /* synthetic */ c f(final c j) {
        return a.j = j;
    }
    
    public static /* synthetic */ long j() {
        return a.k;
    }
    
    public static /* synthetic */ MediaBrowserCompat m() {
        return a.n;
    }
    
    public static /* synthetic */ MediaControllerCompat n() {
        return a.o;
    }
    
    public static /* synthetic */ MediaControllerCompat o(final MediaControllerCompat o) {
        return a.o = o;
    }
    
    public static /* synthetic */ d p() {
        return a.i;
    }
    
    public static /* synthetic */ d q(final d i) {
        return a.i = i;
    }
    
    public static /* synthetic */ MediaControllerCompat.a r() {
        return a.p;
    }
    
    public static /* synthetic */ k.d s() {
        return a.l;
    }
    
    public static /* synthetic */ k.d t(final k.d l) {
        return a.l = l;
    }
    
    public static /* synthetic */ d u(final a a) {
        return a.e;
    }
    
    public static MediaDescriptionCompat v(final MediaDescriptionCompat mediaDescriptionCompat, final Map map) {
        MediaDescriptionCompat a = mediaDescriptionCompat;
        if (map != null) {
            if (map.isEmpty()) {
                return mediaDescriptionCompat;
            }
            final Bundle bundle = new Bundle();
            if (mediaDescriptionCompat.c() != null) {
                bundle.putAll(mediaDescriptionCompat.c());
            }
            bundle.putAll(G(map));
            a = new MediaDescriptionCompat.d().i(mediaDescriptionCompat.j()).h(mediaDescriptionCompat.i()).b(mediaDescriptionCompat.b()).d(mediaDescriptionCompat.d()).e(mediaDescriptionCompat.e()).f(mediaDescriptionCompat.g()).g(mediaDescriptionCompat.h()).c(bundle).a();
        }
        return a;
    }
    
    public static Map w(final Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        final HashMap<String, Serializable> hashMap = new HashMap<String, Serializable>();
        for (final String s : ((BaseBundle)bundle).keySet()) {
            final Serializable serializable = bundle.getSerializable(s);
            if (serializable != null) {
                hashMap.put(s, serializable);
            }
        }
        return hashMap;
    }
    
    public static MediaMetadataCompat y(final Map map) {
        return AudioService.R.F(map.get("id"), map.get("title"), map.get("album"), map.get("artist"), map.get("genre"), D(map.get("duration")), map.get("artUri"), (Boolean)map.get("playable"), map.get("displayTitle"), map.get("displaySubtitle"), map.get("displayDescription"), L((Map)map.get("rating")), (Map)map.get("extras"));
    }
    
    public final void N() {
        this.c.g(this.d = new l5.i(this));
    }
    
    public final void O() {
        final Activity a = com.ryanheise.audioservice.a.d.a(this.e);
        if (com.ryanheise.audioservice.a.j != null && a.getIntent().getAction() != null) {
            com.ryanheise.audioservice.a.j.R("onNotificationClicked", F("clicked", a.getIntent().getAction().equals("com.ryanheise.audioservice.NOTIFICATION_CLICK")));
        }
    }
    
    @Override
    public void onAttachedToActivity(final B5.c c) {
        this.c = c;
        this.e.d(c.c());
        this.e.e((Context)c.c());
        this.e.g(this.b.b() != B((Context)c.c()).k());
        com.ryanheise.audioservice.a.i = this.e;
        this.N();
        if (com.ryanheise.audioservice.a.o != null) {
            MediaControllerCompat.f(com.ryanheise.audioservice.a.d.a(com.ryanheise.audioservice.a.i), com.ryanheise.audioservice.a.o);
        }
        if (com.ryanheise.audioservice.a.n == null) {
            this.x();
        }
        final Activity a = com.ryanheise.audioservice.a.d.a(com.ryanheise.audioservice.a.i);
        if (this.e.h()) {
            a.setIntent(new Intent("android.intent.action.MAIN"));
        }
        this.O();
    }
    
    @Override
    public void onAttachedToEngine(final b b) {
        this.b = b;
        (this.e = new d(b.b())).e(this.b.a());
        com.ryanheise.audioservice.a.h.add(this.e);
        if (this.a == null) {
            this.a = this.b.a();
        }
        if (com.ryanheise.audioservice.a.j == null) {
            AudioService.Q((AudioService.e)(com.ryanheise.audioservice.a.j = new c(this.b.b())));
        }
        if (com.ryanheise.audioservice.a.n == null) {
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
        if (com.ryanheise.audioservice.a.h.size() == 1) {
            this.z();
        }
        if (this.e == com.ryanheise.audioservice.a.i) {
            com.ryanheise.audioservice.a.i = null;
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
    public void onDetachedFromEngine(final b b) {
        final Set h = com.ryanheise.audioservice.a.h;
        if (h.size() == 1) {
            this.z();
        }
        h.remove(this.e);
        this.e.e(null);
        this.e = null;
        this.a = null;
        final c j = com.ryanheise.audioservice.a.j;
        if (j != null && j.a == this.b.b()) {
            System.out.println("### destroying audio handler interface");
            com.ryanheise.audioservice.a.j.Q();
            com.ryanheise.audioservice.a.j = null;
        }
        this.b = null;
    }
    
    @Override
    public void onReattachedToActivityForConfigChanges(final B5.c c) {
        this.c = c;
        this.e.d(c.c());
        this.e.e((Context)c.c());
        this.N();
    }
    
    public final void x() {
        if (com.ryanheise.audioservice.a.n == null) {
            (com.ryanheise.audioservice.a.n = new MediaBrowserCompat(this.a, new ComponentName(this.a, (Class)AudioService.class), this.f, null)).a();
        }
    }
    
    public final void z() {
        final d i = com.ryanheise.audioservice.a.i;
        Activity a;
        if (i != null) {
            a = com.ryanheise.audioservice.a.d.a(i);
        }
        else {
            a = null;
        }
        if (a != null) {
            a.setIntent(new Intent("android.intent.action.MAIN"));
        }
        final MediaControllerCompat o = com.ryanheise.audioservice.a.o;
        if (o != null) {
            o.g(com.ryanheise.audioservice.a.p);
            com.ryanheise.audioservice.a.o = null;
        }
        final MediaBrowserCompat n = com.ryanheise.audioservice.a.n;
        if (n != null) {
            n.b();
            com.ryanheise.audioservice.a.n = null;
        }
    }
    
    public static class c implements E5.k.c, AudioService.e
    {
        public E5.c a;
        public k b;
        public AudioTrack c;
        public final Handler d;
        public List e;
        
        public c(final E5.c a) {
            this.d = new Handler(Looper.getMainLooper());
            this.e = new LinkedList();
            this.a = a;
            (this.b = new k(a, "com.ryanheise.audio_service.handler.methods")).e((E5.k.c)this);
        }
        
        @Override
        public void A() {
            this.R("fastForward", com.ryanheise.audioservice.a.F(new Object[0]));
        }
        
        @Override
        public void B(final long n) {
            this.R("seek", com.ryanheise.audioservice.a.F("position", n * 1000L));
        }
        
        @Override
        public void C(final MediaMetadataCompat mediaMetadataCompat) {
            this.R("addQueueItem", com.ryanheise.audioservice.a.F("mediaItem", H(mediaMetadataCompat)));
        }
        
        @Override
        public void D() {
            com.ryanheise.audioservice.a.A();
        }
        
        @Override
        public void E(final String s, final Bundle bundle) {
            this.R("customAction", com.ryanheise.audioservice.a.F("name", s, "extras", com.ryanheise.audioservice.a.w(bundle)));
        }
        
        @Override
        public void F(final String s, final Bundle bundle) {
            this.R("prepareFromSearch", com.ryanheise.audioservice.a.F("query", s, "extras", com.ryanheise.audioservice.a.w(bundle)));
        }
        
        @Override
        public void G(final long l) {
            this.R("skipToQueueItem", com.ryanheise.audioservice.a.F("index", l));
        }
        
        @Override
        public void H(final int i) {
            this.R("androidAdjustRemoteVolume", com.ryanheise.audioservice.a.F("direction", i));
        }
        
        @Override
        public void I(final Uri uri, final Bundle bundle) {
            this.R("playFromUri", com.ryanheise.audioservice.a.F("uri", uri.toString(), "extras", com.ryanheise.audioservice.a.w(bundle)));
        }
        
        @Override
        public void J(final RatingCompat ratingCompat, final Bundle bundle) {
            this.R("setRating", com.ryanheise.audioservice.a.F("rating", J(ratingCompat), "extras", com.ryanheise.audioservice.a.w(bundle)));
        }
        
        public final void Q() {
            final AudioTrack c = this.c;
            if (c != null) {
                c.release();
            }
        }
        
        public void R(final String s, final Object o) {
            this.S(s, o, null);
        }
        
        public void S(final String s, final Object o, final k.d d) {
            if (com.ryanheise.audioservice.a.c()) {
                this.b.d(s, o, d);
                return;
            }
            this.e.add(new e(s, o, d));
        }
        
        public void T() {
            for (final e e : this.e) {
                this.b.d(e.a, e.b, e.c);
            }
            this.e.clear();
        }
        
        public void a0(final E5.c a) {
            this.b.e(null);
            this.a = a;
            (this.b = new k(a, "com.ryanheise.audio_service.handler.methods")).e((E5.k.c)this);
        }
        
        @Override
        public void b() {
            this.R("onNotificationDeleted", com.ryanheise.audioservice.a.F(new Object[0]));
        }
        
        @Override
        public void c(final int i) {
            this.R("setRepeatMode", com.ryanheise.audioservice.a.F("repeatMode", i));
        }
        
        @Override
        public void d(final int i) {
            this.R("setShuffleMode", com.ryanheise.audioservice.a.F("shuffleMode", i));
        }
        
        @Override
        public void e() {
            this.R("play", com.ryanheise.audioservice.a.F(new Object[0]));
        }
        
        @Override
        public void f(final boolean b) {
            this.R("setCaptioningEnabled", com.ryanheise.audioservice.a.F("enabled", b));
        }
        
        @Override
        public void g() {
            this.R("stop", com.ryanheise.audioservice.a.F(new Object[0]));
        }
        
        @Override
        public void h(final String s, final Bundle bundle) {
            this.R("prepareFromMediaId", com.ryanheise.audioservice.a.F("mediaId", s, "extras", com.ryanheise.audioservice.a.w(bundle)));
        }
        
        @Override
        public void i(final String s, final Bundle bundle, final l l) {
            if (com.ryanheise.audioservice.a.e() != null) {
                final HashMap<String, String> hashMap = new HashMap<String, String>();
                hashMap.put("query", s);
                hashMap.put("extras", (String)com.ryanheise.audioservice.a.w(bundle));
                com.ryanheise.audioservice.a.e().S("search", hashMap, new k.d() {
                    @Override
                    public void a(final Object o) {
                        final List<Map> list = ((Map)o).get("mediaItems");
                        final ArrayList<MediaBrowserCompat.MediaItem> list2 = new ArrayList<MediaBrowserCompat.MediaItem>();
                        final Iterator<Map> iterator = list.iterator();
                        while (iterator.hasNext()) {
                            list2.add(M(iterator.next()));
                        }
                        l.g(list2);
                    }
                    
                    @Override
                    public void b(final String s, final String s2, final Object o) {
                        l.f(new Bundle());
                    }
                    
                    @Override
                    public void c() {
                        l.f(new Bundle());
                    }
                });
            }
            l.a();
        }
        
        @Override
        public void j(final l5.q q) {
            this.R("click", com.ryanheise.audioservice.a.F("button", q.ordinal()));
        }
        
        @Override
        public void k() {
            this.R("skipToPrevious", com.ryanheise.audioservice.a.F(new Object[0]));
        }
        
        @Override
        public void l() {
            this.R("skipToNext", com.ryanheise.audioservice.a.F(new Object[0]));
        }
        
        @Override
        public void m(final String s, final l l) {
            if (com.ryanheise.audioservice.a.e() != null) {
                final HashMap<String, String> hashMap = new HashMap<String, String>();
                hashMap.put("mediaId", s);
                com.ryanheise.audioservice.a.e().S("getMediaItem", hashMap, new k.d() {
                    @Override
                    public void a(final Object o) {
                        final Map map = ((Map)o).get("mediaItem");
                        if (map != null) {
                            l.g(M(map));
                            return;
                        }
                        l.g(null);
                    }
                    
                    @Override
                    public void b(final String s, final String s2, final Object o) {
                        l.f(new Bundle());
                    }
                    
                    @Override
                    public void c() {
                        l.f(new Bundle());
                    }
                });
            }
            l.a();
        }
        
        @Override
        public void n(final MediaMetadataCompat mediaMetadataCompat) {
            this.R("removeQueueItem", com.ryanheise.audioservice.a.F("mediaItem", H(mediaMetadataCompat)));
        }
        
        @Override
        public void o(final float f) {
            this.R("setSpeed", com.ryanheise.audioservice.a.F("speed", f));
        }
        
        @Override
        public void onMethodCall(final E5.j j, final k.d d) {
            Map map;
            String a;
            int n = 0;
            Iterator<Map<K, String>> iterator;
            Map<K, String> map2;
            String s;
            String s2;
            long n2;
            long n3;
            Map map3;
            ExecutorService executorService;
            Runnable runnable;
            ArrayList<r> list;
            l5.p p2;
            int[] array;
            int n4;
            List list2;
            int min;
            Map map4;
            Integer n5;
            String s3;
            int intValue;
            int intValue2;
            Long d2;
            boolean booleanValue;
            long i;
            List list3;
            List list4;
            Iterator<Integer> iterator2;
            Exception ex;
            AudioService r;
            int[] array2;
            long n6;
            l5.a a2;
            boolean booleanValue2;
            long longValue;
            long longValue2;
            float n7;
            Map map5;
            final Exception ex2;
            Label_1038_Outer:Label_0862_Outer:Label_0993_Outer:
            while (true) {
                while (true) {
                Label_0862:
                    while (true) {
                    Label_0284_Outer:
                        while (true) {
                            Block_10_Outer:Label_1084_Outer:Label_0197_Outer:
                            while (true) {
                            Label_1064_Outer:
                                while (true) {
                                Label_0421_Outer:
                                    while (true) {
                                        while (true) {
                                        Label_0217_Outer:
                                            while (true) {
                                                while (true) {
                                                    Label_1111: {
                                                        Label_1108: {
                                                            while (true) {
                                                                try {
                                                                    map = (Map)j.b;
                                                                    a = j.a;
                                                                    switch (a.hashCode()) {
                                                                        case 1742026028: {
                                                                            if (a.equals("notifyChildrenChanged")) {
                                                                                n = 4;
                                                                                break Label_1111;
                                                                            }
                                                                            break Label_1108;
                                                                        }
                                                                        case 1404470607: {
                                                                            if (a.equals("setState")) {
                                                                                n = 2;
                                                                                break Label_1111;
                                                                            }
                                                                            break Label_1108;
                                                                        }
                                                                        case 1402657231: {
                                                                            if (a.equals("setQueue")) {
                                                                                n = 1;
                                                                                break Label_1111;
                                                                            }
                                                                            break Label_1108;
                                                                        }
                                                                        case 699379795: {
                                                                            if (a.equals("stopService")) {
                                                                                n = 6;
                                                                                break Label_1111;
                                                                            }
                                                                            break Label_1108;
                                                                        }
                                                                        case 534585782: {
                                                                            if (a.equals("setAndroidPlaybackInfo")) {
                                                                                n = 3;
                                                                                break Label_1111;
                                                                            }
                                                                            break Label_1108;
                                                                        }
                                                                        case -3300612: {
                                                                            if (a.equals("androidForceEnableMediaButtons")) {
                                                                                n = 5;
                                                                                break Label_1111;
                                                                            }
                                                                            break Label_1108;
                                                                        }
                                                                        case -615448875: {
                                                                            if (a.equals("setMediaItem")) {
                                                                                n = 0;
                                                                                break Label_1111;
                                                                            }
                                                                            break Label_1108;
                                                                        }
                                                                        default: {
                                                                            break Label_1108;
                                                                        }
                                                                    }
                                                                    // iftrue(Label_1157:, map3 == null)
                                                                    // iftrue(Label_0887:, !iterator.hasNext())
                                                                    // iftrue(Label_0209:, r == null)
                                                                    // iftrue(Label_0993:, n4 >= min)
                                                                    // iftrue(Label_1162:, list2 == null)
                                                                    // iftrue(Label_0595:, map4.get((Object)"updateTime") != null)
                                                                    // iftrue(Label_0927:, !iterator2.hasNext())
                                                                    while (true) {
                                                                        Block_12_Outer:Label_0613_Outer:
                                                                        while (true) {
                                                                            d.a(null);
                                                                            return;
                                                                        Label_0613:
                                                                            while (true) {
                                                                                Block_11: {
                                                                                    Label_1055: {
                                                                                        while (true) {
                                                                                            Label_0895: {
                                                                                                while (true) {
                                                                                                    while (true) {
                                                                                                        Label_0954: {
                                                                                                        Label_0737:
                                                                                                            while (true) {
                                                                                                                while (true) {
                                                                                                                    map2 = iterator.next();
                                                                                                                    s = map2.get("androidIcon");
                                                                                                                    s2 = map2.get("label");
                                                                                                                    n2 = 1 << (int)map2.get("action");
                                                                                                                    n3 |= n2;
                                                                                                                    map3 = (Map)map2.get("customAction");
                                                                                                                    while (true) {
                                                                                                                        Block_13: {
                                                                                                                            break Block_13;
                                                                                                                            executorService = Executors.newSingleThreadExecutor();
                                                                                                                            runnable = new l5.k(this, map, d);
                                                                                                                            break Label_1055;
                                                                                                                            list.add(new r(s, s2, n2, p2));
                                                                                                                            break Label_0737;
                                                                                                                            array[n4] = list2.get(n4);
                                                                                                                            ++n4;
                                                                                                                            break Label_0954;
                                                                                                                            AudioService.R.e(map.get("parentMediaId"), com.ryanheise.audioservice.a.G((Map)map.get("options")));
                                                                                                                            continue Block_12_Outer;
                                                                                                                            this.c.reloadStaticData();
                                                                                                                            this.c.play();
                                                                                                                            continue Block_12_Outer;
                                                                                                                        }
                                                                                                                        p2 = new l5.p(map3.get("name"), (Map)map3.get("extras"));
                                                                                                                        continue Label_0862;
                                                                                                                        (this.c = new AudioTrack(3, 44100, 2, 3, 2048, 0)).write(new byte[2048], 0, 2048);
                                                                                                                        continue Block_10_Outer;
                                                                                                                    }
                                                                                                                    continue Label_1038_Outer;
                                                                                                                }
                                                                                                                min = Math.min(3, list2.size());
                                                                                                                array = new int[min];
                                                                                                                n4 = 0;
                                                                                                                break Label_0954;
                                                                                                                n5 = map4.get("errorCode");
                                                                                                                s3 = (String)map4.get("errorMessage");
                                                                                                                intValue = map4.get("repeatMode");
                                                                                                                intValue2 = map4.get("shuffleMode");
                                                                                                                d2 = com.ryanheise.audioservice.a.D(map4.get("queueIndex"));
                                                                                                                booleanValue = (Boolean)(Object)map4.get("captioningEnabled");
                                                                                                                i = com.ryanheise.audioservice.a.j();
                                                                                                                list = new ArrayList<r>();
                                                                                                                iterator = list3.iterator();
                                                                                                                n3 = 0L;
                                                                                                                continue Label_0737;
                                                                                                            }
                                                                                                            Label_0887: {
                                                                                                                iterator2 = list4.iterator();
                                                                                                            }
                                                                                                            break Label_0895;
                                                                                                            n3 |= 1 << iterator2.next();
                                                                                                            break Label_0895;
                                                                                                            ex.printStackTrace();
                                                                                                            d.b(ex.getMessage(), null, null);
                                                                                                            return;
                                                                                                            r = AudioService.R;
                                                                                                            break Label_0613;
                                                                                                            executorService = Executors.newSingleThreadExecutor();
                                                                                                            runnable = new l5.j(this, map, d);
                                                                                                            break Label_1055;
                                                                                                        }
                                                                                                        array2 = array;
                                                                                                        continue Label_0284_Outer;
                                                                                                    }
                                                                                                    Label_0595: {
                                                                                                        n6 = com.ryanheise.audioservice.a.D(map4.get("updateTime"));
                                                                                                    }
                                                                                                    continue Label_0613;
                                                                                                    Label_0927:
                                                                                                    continue Label_0613_Outer;
                                                                                                }
                                                                                                map4 = (Map)map.get("state");
                                                                                                a2 = l5.a.values()[map4.get("processingState")];
                                                                                                booleanValue2 = (Boolean)(Object)map4.get("playing");
                                                                                                list3 = (List)map4.get("controls");
                                                                                                list2 = (List)map4.get("androidCompactActionIndices");
                                                                                                list4 = (List)map4.get("systemActions");
                                                                                                longValue = com.ryanheise.audioservice.a.D(map4.get("updatePosition"));
                                                                                                longValue2 = com.ryanheise.audioservice.a.D(map4.get("bufferedPosition"));
                                                                                                n7 = map4.get("speed");
                                                                                                break Block_11;
                                                                                            }
                                                                                            continue Label_1084_Outer;
                                                                                        }
                                                                                        AudioService.R.b0(list, n3, array2, a2, booleanValue2, longValue, longValue2, n7, n6 - i, n5, s3, intValue, intValue2, booleanValue, d2);
                                                                                        d.a(null);
                                                                                        return;
                                                                                    }
                                                                                    executorService.execute(runnable);
                                                                                    return;
                                                                                }
                                                                                n6 = System.currentTimeMillis();
                                                                                continue Label_0613;
                                                                            }
                                                                            r.c0();
                                                                            continue Block_12_Outer;
                                                                            map5 = (Map)map.get("playbackInfo");
                                                                            AudioService.R.Z(map5.get("playbackType"), map5.get("volumeControlType"), map5.get("maxVolume"), map5.get("volume"));
                                                                            continue Block_12_Outer;
                                                                        }
                                                                        continue Label_1084_Outer;
                                                                    }
                                                                }
                                                                // iftrue(Label_0266:, this.c != null)
                                                                catch (Exception ex2) {}
                                                                ex = ex2;
                                                                continue Label_0197_Outer;
                                                            }
                                                        }
                                                        n = -1;
                                                    }
                                                    switch (n) {
                                                        case 6: {
                                                            continue Label_1064_Outer;
                                                        }
                                                        case 5: {
                                                            continue;
                                                        }
                                                        case 4: {
                                                            continue Label_0197_Outer;
                                                        }
                                                        case 3: {
                                                            continue Label_0217_Outer;
                                                        }
                                                        case 2: {
                                                            continue Label_0993_Outer;
                                                        }
                                                        case 1: {
                                                            continue Label_0862_Outer;
                                                        }
                                                        case 0: {
                                                            continue Label_0421_Outer;
                                                        }
                                                        default: {
                                                            return;
                                                        }
                                                    }
                                                    break;
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        Label_1157: {
                            p2 = null;
                        }
                        continue Label_0862;
                    }
                    Label_1162: {
                        array2 = null;
                    }
                    continue;
                }
            }
        }
        
        @Override
        public void p() {
            this.R("prepare", com.ryanheise.audioservice.a.F(new Object[0]));
        }
        
        @Override
        public void q(final Uri uri, final Bundle bundle) {
            this.R("prepareFromUri", com.ryanheise.audioservice.a.F("uri", uri.toString(), "extras", com.ryanheise.audioservice.a.w(bundle)));
        }
        
        @Override
        public void r() {
            this.R("rewind", com.ryanheise.audioservice.a.F(new Object[0]));
        }
        
        @Override
        public void s(final String s, final l l, final Bundle bundle) {
            if (com.ryanheise.audioservice.a.e() != null) {
                final HashMap<String, String> hashMap = new HashMap<String, String>();
                hashMap.put("parentMediaId", s);
                hashMap.put("options", (String)com.ryanheise.audioservice.a.w(bundle));
                com.ryanheise.audioservice.a.e().S("getChildren", hashMap, new k.d() {
                    @Override
                    public void a(final Object o) {
                        final List<Map> list = ((Map)o).get("children");
                        final ArrayList<MediaBrowserCompat.MediaItem> list2 = new ArrayList<MediaBrowserCompat.MediaItem>();
                        final Iterator<Map> iterator = list.iterator();
                        while (iterator.hasNext()) {
                            list2.add(M(iterator.next()));
                        }
                        l.g(list2);
                    }
                    
                    @Override
                    public void b(final String s, final String s2, final Object o) {
                        l.f(new Bundle());
                    }
                    
                    @Override
                    public void c() {
                        l.f(new Bundle());
                    }
                });
            }
            l.a();
        }
        
        @Override
        public void t(final RatingCompat ratingCompat) {
            this.R("setRating", com.ryanheise.audioservice.a.F("rating", J(ratingCompat), "extras", null));
        }
        
        @Override
        public void u(final String s, final Bundle bundle) {
            this.R("playFromSearch", com.ryanheise.audioservice.a.F("query", s, "extras", com.ryanheise.audioservice.a.w(bundle)));
        }
        
        @Override
        public void v(final MediaMetadataCompat mediaMetadataCompat, final int i) {
            this.R("insertQueueItem", com.ryanheise.audioservice.a.F("mediaItem", H(mediaMetadataCompat), "index", i));
        }
        
        @Override
        public void w() {
            this.R("pause", com.ryanheise.audioservice.a.F(new Object[0]));
        }
        
        @Override
        public void x(final int i) {
            this.R("androidSetRemoteVolume", com.ryanheise.audioservice.a.F("volumeIndex", i));
        }
        
        @Override
        public void y() {
            this.R("onTaskRemoved", com.ryanheise.audioservice.a.F(new Object[0]));
        }
        
        @Override
        public void z(final String s, final Bundle bundle) {
            this.R("playFromMediaId", com.ryanheise.audioservice.a.F("mediaId", s, "extras", com.ryanheise.audioservice.a.w(bundle)));
        }
    }
    
    public static class d implements k.c
    {
        public Context a;
        public Activity b;
        public final E5.c c;
        public final k d;
        public boolean e;
        public boolean f;
        
        public d(final E5.c c) {
            this.c = c;
            (this.d = new k(c, "com.ryanheise.audio_service.client.methods")).e((k.c)this);
        }
        
        public static /* synthetic */ Activity a(final d d) {
            return d.b;
        }
        
        private void d(final Activity b) {
            this.b = b;
        }
        
        public final void e(final Context a) {
            this.a = a;
        }
        
        public void f(final boolean f) {
            this.f = f;
        }
        
        public void g(final boolean e) {
            this.e = e;
        }
        
        public boolean h() {
            return (this.b.getIntent().getFlags() & 0x100000) == 0x100000;
        }
        
        @Override
        public void onMethodCall(final j j, final k.d d) {
            while (true) {
                while (true) {
                    Label_0548: {
                        while (true) {
                            try {
                                if (this.e) {
                                    throw new IllegalStateException("The Activity class declared in your AndroidManifest.xml is wrong or has not provided the correct FlutterEngine. Please see the README for instructions.");
                                }
                                final String a = j.a;
                                if (a.hashCode() != -804429082) {
                                    return;
                                }
                                if (a.equals("configure")) {
                                    if (this.f) {
                                        throw new IllegalStateException("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.");
                                    }
                                    com.ryanheise.audioservice.a.d(true);
                                    final Map<Object, Boolean> map = ((Map)j.b).get("config");
                                    final h h = new h(this.a.getApplicationContext());
                                    h.i = map.get("androidNotificationClickStartsActivity");
                                    h.j = map.get("androidNotificationOngoing");
                                    h.b = map.get("androidResumeOnClick");
                                    h.c = (String)map.get("androidNotificationChannelId");
                                    h.d = (String)map.get("androidNotificationChannelName");
                                    h.e = (String)map.get("androidNotificationChannelDescription");
                                    final Boolean value = map.get("notificationColor");
                                    final int n = -1;
                                    int intValue;
                                    if (value == null) {
                                        intValue = -1;
                                    }
                                    else {
                                        intValue = com.ryanheise.audioservice.a.C(map.get("notificationColor"));
                                    }
                                    h.f = intValue;
                                    h.g = (String)map.get("androidNotificationIcon");
                                    h.h = map.get("androidShowNotificationBadge");
                                    h.k = map.get("androidStopForegroundOnPause");
                                    if (map.get("artDownscaleWidth") == null) {
                                        break Label_0548;
                                    }
                                    final int intValue2 = (Object)map.get("artDownscaleWidth");
                                    h.l = intValue2;
                                    int intValue3 = n;
                                    if (map.get("artDownscaleHeight") != null) {
                                        intValue3 = (Integer)(Object)map.get("artDownscaleHeight");
                                    }
                                    h.m = intValue3;
                                    h.c((Map)map.get("androidBrowsableRootExtras"));
                                    final Activity b = this.b;
                                    if (b != null) {
                                        h.n = b.getClass().getName();
                                    }
                                    h.b();
                                    final AudioService r = AudioService.R;
                                    if (r != null) {
                                        r.B(h);
                                    }
                                    com.ryanheise.audioservice.a.q(this);
                                    if (com.ryanheise.audioservice.a.e() == null) {
                                        com.ryanheise.audioservice.a.f(new c(this.c));
                                        AudioService.Q((AudioService.e)com.ryanheise.audioservice.a.e());
                                    }
                                    else {
                                        if (com.ryanheise.audioservice.a.e().a != this.c) {
                                            com.ryanheise.audioservice.a.e().a0(this.c);
                                        }
                                        com.ryanheise.audioservice.a.e().T();
                                    }
                                    if (com.ryanheise.audioservice.a.n() != null) {
                                        d.a(com.ryanheise.audioservice.a.F(new Object[0]));
                                        return;
                                    }
                                    com.ryanheise.audioservice.a.t(d);
                                    return;
                                }
                                return;
                                final Exception ex;
                                ex.printStackTrace();
                                d.b(ex.getMessage(), null, null);
                                return;
                            }
                            catch (Exception ex2) {}
                            final Exception ex2;
                            final Exception ex = ex2;
                            continue;
                        }
                    }
                    final int intValue2 = -1;
                    continue;
                }
            }
        }
    }
    
    public static class e
    {
        public final String a;
        public final Object b;
        public final k.d c;
        
        public e(final String a, final Object b, final k.d c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
