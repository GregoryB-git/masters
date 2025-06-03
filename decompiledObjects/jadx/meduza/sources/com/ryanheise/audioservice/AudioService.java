package com.ryanheise.audioservice;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.LruCache;
import android.view.KeyEvent;
import b.m;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.ryanheise.audioservice.b;
import g1.c;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import q0.g;
import ta.f;
import u.n;
import u.q;

/* loaded from: classes.dex */
public class AudioService extends g1.c {
    public static AudioService F;
    public static PendingIntent G;
    public static c H;
    public static List<MediaSessionCompat.QueueItem> I = new ArrayList();
    public static final HashMap J = new HashMap();
    public boolean C;
    public com.ryanheise.audioservice.a E;

    /* renamed from: p, reason: collision with root package name */
    public ta.a f3263p;

    /* renamed from: q, reason: collision with root package name */
    public PowerManager.WakeLock f3264q;

    /* renamed from: r, reason: collision with root package name */
    public MediaSessionCompat f3265r;

    /* renamed from: v, reason: collision with root package name */
    public int[] f3268v;

    /* renamed from: w, reason: collision with root package name */
    public MediaMetadataCompat f3269w;

    /* renamed from: x, reason: collision with root package name */
    public Bitmap f3270x;

    /* renamed from: y, reason: collision with root package name */
    public String f3271y;

    /* renamed from: z, reason: collision with root package name */
    public a f3272z;

    /* renamed from: s, reason: collision with root package name */
    public List<f> f3266s = new ArrayList();
    public ArrayList t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f3267u = new ArrayList();
    public boolean A = false;
    public int B = 1;
    public final Handler D = new Handler(Looper.getMainLooper());

    public class a extends LruCache<String, Bitmap> {
        public a(int i10) {
            super(i10);
        }

        @Override // android.util.LruCache
        public final int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getByteCount() / 1024;
        }
    }

    public class b extends MediaSessionCompat.a {
        public b() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void A0(int i10) {
            c cVar = AudioService.H;
            if (cVar == null) {
                return;
            }
            ((b.c) cVar).a("setShuffleMode", com.ryanheise.audioservice.b.k("shuffleMode", Integer.valueOf(i10)), null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void B0() {
            c cVar = AudioService.H;
            if (cVar == null) {
                return;
            }
            ((b.c) cVar).a("skipToNext", com.ryanheise.audioservice.b.k(new Object[0]), null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void C0() {
            c cVar = AudioService.H;
            if (cVar == null) {
                return;
            }
            ((b.c) cVar).a("skipToPrevious", com.ryanheise.audioservice.b.k(new Object[0]), null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void D0(long j10) {
            c cVar = AudioService.H;
            if (cVar == null) {
                return;
            }
            ((b.c) cVar).a("skipToQueueItem", com.ryanheise.audioservice.b.k("index", Long.valueOf(j10)), null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void E(MediaDescriptionCompat mediaDescriptionCompat) {
            c cVar = AudioService.H;
            if (cVar == null) {
                return;
            }
            ((b.c) cVar).a("addQueueItem", com.ryanheise.audioservice.b.k("mediaItem", com.ryanheise.audioservice.b.b((MediaMetadataCompat) AudioService.J.get(mediaDescriptionCompat.f444a))), null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void E0() {
            c cVar = AudioService.H;
            if (cVar == null) {
                return;
            }
            ((b.c) cVar).a("stop", com.ryanheise.audioservice.b.k(new Object[0]), null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void H(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
            c cVar = AudioService.H;
            if (cVar == null) {
                return;
            }
            ((b.c) cVar).a("insertQueueItem", com.ryanheise.audioservice.b.k("mediaItem", com.ryanheise.audioservice.b.b((MediaMetadataCompat) AudioService.J.get(mediaDescriptionCompat.f444a)), "index", Integer.valueOf(i10)), null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void O(String str, Bundle bundle) {
            if (AudioService.H == null) {
                return;
            }
            if ("com.ryanheise.audioservice.action.STOP".equals(str)) {
                b.c cVar = (b.c) AudioService.H;
                cVar.getClass();
                cVar.a("stop", com.ryanheise.audioservice.b.k(new Object[0]), null);
            } else if ("com.ryanheise.audioservice.action.FAST_FORWARD".equals(str)) {
                b.c cVar2 = (b.c) AudioService.H;
                cVar2.getClass();
                cVar2.a("fastForward", com.ryanheise.audioservice.b.k(new Object[0]), null);
            } else if ("com.ryanheise.audioservice.action.REWIND".equals(str)) {
                b.c cVar3 = (b.c) AudioService.H;
                cVar3.getClass();
                cVar3.a("rewind", com.ryanheise.audioservice.b.k(new Object[0]), null);
            } else {
                b.c cVar4 = (b.c) AudioService.H;
                cVar4.getClass();
                cVar4.a("customAction", com.ryanheise.audioservice.b.k("name", str, "extras", com.ryanheise.audioservice.b.e(bundle)), null);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void P() {
            c cVar = AudioService.H;
            if (cVar == null) {
                return;
            }
            ((b.c) cVar).a("fastForward", com.ryanheise.audioservice.b.k(new Object[0]), null);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final boolean Q(Intent intent) {
            int i10;
            if (AudioService.H == null) {
                return false;
            }
            KeyEvent keyEvent = (KeyEvent) intent.getExtras().getParcelable("android.intent.extra.KEY_EVENT");
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79) {
                    if (keyCode == 130) {
                        U();
                    } else if (keyCode != 126 && keyCode != 127) {
                        switch (keyCode) {
                            case R.styleable.AppCompatTheme_panelBackground /* 86 */:
                                E0();
                                break;
                            case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                                t0();
                                break;
                            case R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                                P();
                                break;
                            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                                V();
                                break;
                        }
                    }
                }
                c cVar = AudioService.H;
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 != 79 && keyCode2 != 85) {
                    if (keyCode2 == 87) {
                        i10 = 2;
                    } else if (keyCode2 == 88) {
                        i10 = 3;
                    }
                    b.c cVar2 = (b.c) cVar;
                    cVar2.getClass();
                    cVar2.a("click", com.ryanheise.audioservice.b.k("button", Integer.valueOf(g.c(i10))), null);
                }
                i10 = 1;
                b.c cVar22 = (b.c) cVar;
                cVar22.getClass();
                cVar22.a("click", com.ryanheise.audioservice.b.k("button", Integer.valueOf(g.c(i10))), null);
            }
            return true;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void U() {
            c cVar = AudioService.H;
            if (cVar == null) {
                return;
            }
            ((b.c) cVar).a("pause", com.ryanheise.audioservice.b.k(new Object[0]), null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void V() {
            c cVar = AudioService.H;
            if (cVar == null) {
                return;
            }
            ((b.c) cVar).a("play", com.ryanheise.audioservice.b.k(new Object[0]), null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void f0(String str, Bundle bundle) {
            c cVar = AudioService.H;
            if (cVar == null) {
                return;
            }
            ((b.c) cVar).a("playFromMediaId", com.ryanheise.audioservice.b.k("mediaId", str, "extras", com.ryanheise.audioservice.b.e(bundle)), null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void h0(String str, Bundle bundle) {
            c cVar = AudioService.H;
            if (cVar == null) {
                return;
            }
            ((b.c) cVar).a("playFromSearch", com.ryanheise.audioservice.b.k("query", str, "extras", com.ryanheise.audioservice.b.e(bundle)), null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void j0(Uri uri, Bundle bundle) {
            c cVar = AudioService.H;
            if (cVar == null) {
                return;
            }
            ((b.c) cVar).a("playFromUri", com.ryanheise.audioservice.b.k("uri", uri.toString(), "extras", com.ryanheise.audioservice.b.e(bundle)), null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void n0() {
            if (AudioService.H == null) {
                return;
            }
            if (!AudioService.this.f3265r.c()) {
                AudioService.this.f3265r.e(true);
            }
            b.c cVar = (b.c) AudioService.H;
            cVar.getClass();
            cVar.a("prepare", com.ryanheise.audioservice.b.k(new Object[0]), null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void o0(String str, Bundle bundle) {
            if (AudioService.H == null) {
                return;
            }
            if (!AudioService.this.f3265r.c()) {
                AudioService.this.f3265r.e(true);
            }
            b.c cVar = (b.c) AudioService.H;
            cVar.getClass();
            cVar.a("prepareFromMediaId", com.ryanheise.audioservice.b.k("mediaId", str, "extras", com.ryanheise.audioservice.b.e(bundle)), null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void q0(String str, Bundle bundle) {
            if (AudioService.H == null) {
                return;
            }
            if (!AudioService.this.f3265r.c()) {
                AudioService.this.f3265r.e(true);
            }
            b.c cVar = (b.c) AudioService.H;
            cVar.getClass();
            cVar.a("prepareFromSearch", com.ryanheise.audioservice.b.k("query", str, "extras", com.ryanheise.audioservice.b.e(bundle)), null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void r0(Uri uri, Bundle bundle) {
            if (AudioService.H == null) {
                return;
            }
            if (!AudioService.this.f3265r.c()) {
                AudioService.this.f3265r.e(true);
            }
            b.c cVar = (b.c) AudioService.H;
            cVar.getClass();
            cVar.a("prepareFromUri", com.ryanheise.audioservice.b.k("uri", uri.toString(), "extras", com.ryanheise.audioservice.b.e(bundle)), null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void s0(MediaDescriptionCompat mediaDescriptionCompat) {
            c cVar = AudioService.H;
            if (cVar == null) {
                return;
            }
            ((b.c) cVar).a("removeQueueItem", com.ryanheise.audioservice.b.k("mediaItem", com.ryanheise.audioservice.b.b((MediaMetadataCompat) AudioService.J.get(mediaDescriptionCompat.f444a))), null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void t0() {
            c cVar = AudioService.H;
            if (cVar == null) {
                return;
            }
            ((b.c) cVar).a("rewind", com.ryanheise.audioservice.b.k(new Object[0]), null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void u0(long j10) {
            c cVar = AudioService.H;
            if (cVar == null) {
                return;
            }
            ((b.c) cVar).a("seek", com.ryanheise.audioservice.b.k("position", Long.valueOf(j10 * 1000)), null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void v0(boolean z10) {
            c cVar = AudioService.H;
            if (cVar == null) {
                return;
            }
            ((b.c) cVar).a("setCaptioningEnabled", com.ryanheise.audioservice.b.k("enabled", Boolean.valueOf(z10)), null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void w0(float f) {
            c cVar = AudioService.H;
            if (cVar == null) {
                return;
            }
            ((b.c) cVar).a("setSpeed", com.ryanheise.audioservice.b.k("speed", Float.valueOf(f)), null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void x0(RatingCompat ratingCompat) {
            c cVar = AudioService.H;
            if (cVar == null) {
                return;
            }
            ((b.c) cVar).a("setRating", com.ryanheise.audioservice.b.k("rating", com.ryanheise.audioservice.b.n(ratingCompat), "extras", null), null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void y0(RatingCompat ratingCompat, Bundle bundle) {
            c cVar = AudioService.H;
            if (cVar == null) {
                return;
            }
            ((b.c) cVar).a("setRating", com.ryanheise.audioservice.b.k("rating", com.ryanheise.audioservice.b.n(ratingCompat), "extras", com.ryanheise.audioservice.b.e(bundle)), null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void z0(int i10) {
            c cVar = AudioService.H;
            if (cVar == null) {
                return;
            }
            ((b.c) cVar).a("setRepeatMode", com.ryanheise.audioservice.b.k("repeatMode", Integer.valueOf(i10)), null);
        }
    }

    public interface c {
    }

    @Override // g1.c
    public final c.b b(Bundle bundle) {
        Bundle bundle2 = null;
        Boolean valueOf = bundle == null ? null : Boolean.valueOf(bundle.getBoolean("android.service.media.extra.RECENT"));
        if (valueOf == null) {
            valueOf = Boolean.FALSE;
        }
        ta.a aVar = this.f3263p;
        if (aVar.f14689o != null) {
            try {
                JSONObject jSONObject = new JSONObject(aVar.f14689o);
                Bundle bundle3 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        try {
                            try {
                                try {
                                    bundle3.putInt(next, jSONObject.getInt(next));
                                } catch (Exception unused) {
                                    bundle3.putDouble(next, jSONObject.getDouble(next));
                                }
                            } catch (Exception unused2) {
                                System.out.println("Unsupported extras value for key " + next);
                            }
                        } catch (Exception unused3) {
                            bundle3.putBoolean(next, jSONObject.getBoolean(next));
                        }
                    } catch (Exception unused4) {
                        bundle3.putString(next, jSONObject.getString(next));
                    }
                }
                bundle2 = bundle3;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return new c.b(bundle2, valueOf.booleanValue() ? "recent" : "root");
    }

    @Override // g1.c
    public final void c(Bundle bundle, c.i iVar, String str) {
        if (H == null) {
            iVar.f(new ArrayList());
            return;
        }
        if (com.ryanheise.audioservice.b.f3275q != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("parentMediaId", str);
            hashMap.put("options", com.ryanheise.audioservice.b.e(bundle));
            com.ryanheise.audioservice.b.f3275q.a("getChildren", hashMap, new com.ryanheise.audioservice.c(iVar));
        }
        iVar.a();
    }

    @Override // g1.c
    public final void d(String str, c.i<List<MediaBrowserCompat.MediaItem>> iVar) {
        c(null, iVar, str);
    }

    @Override // g1.c
    public final void e(String str, c.i<MediaBrowserCompat.MediaItem> iVar) {
        if (H == null) {
            iVar.f(null);
            return;
        }
        if (com.ryanheise.audioservice.b.f3275q != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("mediaId", str);
            com.ryanheise.audioservice.b.f3275q.a("getMediaItem", hashMap, new d(iVar));
        }
        iVar.a();
    }

    @Override // g1.c
    public final void f(Bundle bundle, g1.e eVar, String str) {
        if (H == null) {
            eVar.f(new ArrayList());
            return;
        }
        if (com.ryanheise.audioservice.b.f3275q != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("query", str);
            hashMap.put("extras", com.ryanheise.audioservice.b.e(bundle));
            com.ryanheise.audioservice.b.f3275q.a("search", hashMap, new e(eVar));
        }
        eVar.a();
    }

    public final PendingIntent h(long j10) {
        int i10 = j10 == 4 ? 91 : j10 == 2 ? 130 : j10 == 4 ? R.styleable.AppCompatTheme_windowNoTitle : j10 == 2 ? 127 : j10 == 32 ? 87 : j10 == 16 ? 88 : j10 == 1 ? 86 : j10 == 64 ? 90 : j10 == 8 ? 89 : j10 == 512 ? 85 : 0;
        if (i10 == 0) {
            return null;
        }
        Intent intent = new Intent(this, (Class<?>) MediaButtonReceiver.class);
        intent.setAction("android.intent.action.MEDIA_BUTTON");
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i10));
        return PendingIntent.getBroadcast(this, i10, intent, 67108864);
    }

    public final Notification i() {
        int[] iArr = this.f3268v;
        if (iArr == null) {
            int min = Math.min(3, this.t.size());
            int[] iArr2 = new int[min];
            for (int i10 = 0; i10 < min; i10++) {
                iArr2[i10] = i10;
            }
            iArr = iArr2;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) getSystemService(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE);
            if (notificationManager.getNotificationChannel(this.f3271y) == null) {
                NotificationChannel notificationChannel = new NotificationChannel(this.f3271y, this.f3263p.f14679d, 2);
                notificationChannel.setShowBadge(this.f3263p.f14682h);
                String str = this.f3263p.f14680e;
                if (str != null) {
                    notificationChannel.setDescription(str);
                }
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        q qVar = new q(this, this.f3271y);
        qVar.f14842x = 1;
        qVar.f14830k = false;
        Intent intent = new Intent(this, (Class<?>) MediaButtonReceiver.class);
        intent.setAction("com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE");
        qVar.B.deleteIntent = PendingIntent.getBroadcast(this, 0, intent, 67108864);
        qVar.B.icon = k(this.f3263p.f14681g);
        MediaMetadataCompat mediaMetadataCompat = this.f3269w;
        if (mediaMetadataCompat != null) {
            MediaDescriptionCompat a10 = mediaMetadataCompat.a();
            CharSequence charSequence = a10.f445b;
            if (charSequence != null) {
                qVar.f14825e = q.b(charSequence);
            }
            CharSequence charSequence2 = a10.f446c;
            if (charSequence2 != null) {
                qVar.c(charSequence2);
            }
            CharSequence charSequence3 = a10.f447d;
            if (charSequence3 != null) {
                qVar.f14833n = q.b(charSequence3);
            }
            synchronized (this) {
                Bitmap bitmap = this.f3270x;
                if (bitmap != null) {
                    qVar.e(bitmap);
                }
            }
        }
        if (this.f3263p.f14683i) {
            qVar.f14826g = this.f3265r.f484b.f466a.f469a.getSessionActivity();
        }
        int i11 = this.f3263p.f;
        if (i11 != -1) {
            qVar.f14841w = i11;
        }
        Iterator it = this.t.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (nVar != null) {
                qVar.f14822b.add(nVar);
            }
        }
        h1.b bVar = new h1.b();
        bVar.f7058c = this.f3265r.f483a.f502b;
        if (Build.VERSION.SDK_INT < 33) {
            bVar.f7057b = iArr;
        }
        if (this.f3263p.f14684j) {
            h(1L);
            qVar.d(2, true);
        }
        qVar.g(bVar);
        return qVar.a();
    }

    public final void j(ta.a aVar) {
        this.f3263p = aVar;
        String str = aVar.f14678c;
        if (str == null) {
            str = getApplication().getPackageName() + ".channel";
        }
        this.f3271y = str;
        if (aVar.f14688n != null) {
            Context applicationContext = getApplicationContext();
            Intent intent = new Intent((String) null);
            intent.setComponent(new ComponentName(applicationContext, aVar.f14688n));
            intent.setAction("com.ryanheise.audioservice.NOTIFICATION_CLICK");
            G = PendingIntent.getActivity(applicationContext, 1000, intent, 201326592);
        } else {
            G = null;
        }
        if (aVar.f14677b) {
            return;
        }
        this.f3265r.f483a.f501a.setMediaButtonReceiver(null);
    }

    public final int k(String str) {
        String[] split = str.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        String str2 = split[0];
        return getResources().getIdentifier(split[1], str2, getApplicationContext().getPackageName());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[Catch: Exception -> 0x00ca, TryCatch #1 {Exception -> 0x00ca, blocks: (B:7:0x000c, B:46:0x001f, B:48:0x0025, B:50:0x0038, B:51:0x003c, B:53:0x0042, B:54:0x0046, B:11:0x0050, B:13:0x005c, B:16:0x00c4, B:19:0x0067, B:21:0x006d, B:23:0x0077, B:24:0x0082, B:27:0x009f, B:29:0x00a6, B:31:0x00ac, B:32:0x0090, B:33:0x0094, B:35:0x0098, B:37:0x009c, B:40:0x007b, B:42:0x00b7, B:43:0x00bc), top: B:6:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap l(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            com.ryanheise.audioservice.AudioService$a r0 = r9.f3272z
            java.lang.Object r0 = r0.get(r10)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            r1 = 0
            android.net.Uri r2 = android.net.Uri.parse(r10)     // Catch: java.lang.Exception -> Lca
            java.lang.String r3 = "content"
            java.lang.String r4 = r2.getScheme()     // Catch: java.lang.Exception -> Lca
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> Lca
            r4 = -1
            if (r3 == 0) goto L62
            if (r11 == 0) goto L50
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> Lca
            r5 = 29
            if (r11 < r5) goto L50
            android.util.Size r11 = new android.util.Size     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> Lca
            r0 = 192(0xc0, float:2.69E-43)
            r11.<init>(r0, r0)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> Lca
            android.content.ContentResolver r0 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> Lca
            android.util.Size r5 = new android.util.Size     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> Lca
            ta.a r6 = r9.f3263p     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> Lca
            int r6 = r6.f14686l     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> Lca
            if (r6 != r4) goto L3c
            int r6 = r11.getWidth()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> Lca
        L3c:
            ta.a r7 = r9.f3263p     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> Lca
            int r7 = r7.f14687m     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> Lca
            if (r7 != r4) goto L46
            int r7 = r11.getHeight()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> Lca
        L46:
            r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> Lca
            android.graphics.Bitmap r0 = aa.w.d(r0, r2, r5)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> Lca
            if (r0 != 0) goto L62
            return r1
        L50:
            android.content.ContentResolver r11 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> Lca
            java.lang.String r5 = "r"
            android.os.ParcelFileDescriptor r11 = r11.openFileDescriptor(r2, r5)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> Lca
            if (r11 == 0) goto L61
            java.io.FileDescriptor r11 = r11.getFileDescriptor()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> Lca
            goto L63
        L61:
            return r1
        L62:
            r11 = r1
        L63:
            if (r3 == 0) goto L67
            if (r11 == 0) goto Lc4
        L67:
            ta.a r0 = r9.f3263p     // Catch: java.lang.Exception -> Lca
            int r0 = r0.f14686l     // Catch: java.lang.Exception -> Lca
            if (r0 == r4) goto Lb5
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Exception -> Lca
            r0.<init>()     // Catch: java.lang.Exception -> Lca
            r3 = 1
            r0.inJustDecodeBounds = r3     // Catch: java.lang.Exception -> Lca
            if (r11 == 0) goto L7b
            android.graphics.BitmapFactory.decodeFileDescriptor(r11, r1, r0)     // Catch: java.lang.Exception -> Lca
            goto L82
        L7b:
            java.lang.String r4 = r2.getPath()     // Catch: java.lang.Exception -> Lca
            android.graphics.BitmapFactory.decodeFile(r4, r0)     // Catch: java.lang.Exception -> Lca
        L82:
            ta.a r4 = r9.f3263p     // Catch: java.lang.Exception -> Lca
            int r5 = r4.f14686l     // Catch: java.lang.Exception -> Lca
            int r4 = r4.f14687m     // Catch: java.lang.Exception -> Lca
            int r6 = r0.outHeight     // Catch: java.lang.Exception -> Lca
            int r7 = r0.outWidth     // Catch: java.lang.Exception -> Lca
            if (r6 > r4) goto L90
            if (r7 <= r5) goto L9f
        L90:
            int r6 = r6 / 2
            int r7 = r7 / 2
        L94:
            int r8 = r6 / r3
            if (r8 < r4) goto L9f
            int r8 = r7 / r3
            if (r8 < r5) goto L9f
            int r3 = r3 * 2
            goto L94
        L9f:
            r0.inSampleSize = r3     // Catch: java.lang.Exception -> Lca
            r3 = 0
            r0.inJustDecodeBounds = r3     // Catch: java.lang.Exception -> Lca
            if (r11 == 0) goto Lac
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeFileDescriptor(r11, r1, r0)     // Catch: java.lang.Exception -> Lca
        Laa:
            r0 = r11
            goto Lc4
        Lac:
            java.lang.String r11 = r2.getPath()     // Catch: java.lang.Exception -> Lca
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeFile(r11, r0)     // Catch: java.lang.Exception -> Lca
            goto Laa
        Lb5:
            if (r11 == 0) goto Lbc
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFileDescriptor(r11)     // Catch: java.lang.Exception -> Lca
            goto Lc4
        Lbc:
            java.lang.String r11 = r2.getPath()     // Catch: java.lang.Exception -> Lca
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r11)     // Catch: java.lang.Exception -> Lca
        Lc4:
            com.ryanheise.audioservice.AudioService$a r11 = r9.f3272z     // Catch: java.lang.Exception -> Lca
            r11.put(r10, r0)     // Catch: java.lang.Exception -> Lca
            return r0
        Lca:
            r10 = move-exception
            r10.printStackTrace()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.AudioService.l(java.lang.String, java.lang.String):android.graphics.Bitmap");
    }

    public final MediaMetadataCompat m(MediaMetadataCompat mediaMetadataCompat) {
        MediaMetadataCompat.b bVar = new MediaMetadataCompat.b(mediaMetadataCompat);
        bVar.a(this.f3270x, "android.media.metadata.ALBUM_ART");
        bVar.a(this.f3270x, "android.media.metadata.DISPLAY_ICON");
        return new MediaMetadataCompat(bVar.f458a);
    }

    public final synchronized void n(MediaMetadataCompat mediaMetadataCompat) {
        Bitmap l10;
        String b10 = mediaMetadataCompat.b("artCacheFile");
        if (b10 != null) {
            l10 = l(b10, null);
        } else {
            String b11 = mediaMetadataCompat.b("android.media.metadata.DISPLAY_ICON_URI");
            if (b11 == null || !b11.startsWith("content:")) {
                this.f3270x = null;
                this.f3269w = mediaMetadataCompat;
                this.f3265r.g(mediaMetadataCompat);
                this.D.removeCallbacksAndMessages(null);
                this.D.post(new m(this, 20));
            } else {
                l10 = l(b11, mediaMetadataCompat.b("loadThumbnailUri"));
            }
        }
        this.f3270x = l10;
        mediaMetadataCompat = m(mediaMetadataCompat);
        this.f3269w = mediaMetadataCompat;
        this.f3265r.g(mediaMetadataCompat);
        this.D.removeCallbacksAndMessages(null);
        this.D.post(new m(this, 20));
    }

    @Override // g1.c, android.app.Service
    public final void onCreate() {
        super.onCreate();
        F = this;
        this.C = false;
        this.A = false;
        this.B = 1;
        this.f3265r = new MediaSessionCompat(this, "media-session", null);
        j(new ta.a(getApplicationContext()));
        this.f3265r.f483a.f501a.setFlags(7);
        this.f3265r.h(new PlaybackStateCompat(0, 0L, 0L, 0.0f, 3669711L, 0, null, 0L, new ArrayList(), -1L, null));
        this.f3265r.f(new b(), null);
        MediaSessionCompat.Token token = this.f3265r.f483a.f502b;
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.f != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.f = token;
        c.f fVar = this.f5714a;
        g1.c.this.f5718e.a(new g1.f(fVar, token));
        this.f3265r.i(I);
        this.f3264q = ((PowerManager) getSystemService("power")).newWakeLock(1, AudioService.class.getName());
        this.f3272z = new a(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
    
        r2 = io.flutter.embedding.engine.FlutterEngineCache.getInstance().get("audio_service_engine");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        if (r2 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        r2.destroy();
        io.flutter.embedding.engine.FlutterEngineCache.getInstance().remove("audio_service_engine");
     */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDestroy() {
        /*
            r5 = this;
            super.onDestroy()
            com.ryanheise.audioservice.AudioService$c r0 = com.ryanheise.audioservice.AudioService.H
            r1 = 0
            if (r0 == 0) goto L43
            java.util.HashSet r0 = com.ryanheise.audioservice.b.f3273o
            java.lang.Class<com.ryanheise.audioservice.b> r0 = com.ryanheise.audioservice.b.class
            monitor-enter(r0)
            java.util.HashSet r2 = com.ryanheise.audioservice.b.f3273o     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L40
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L24
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L40
            com.ryanheise.audioservice.b$d r3 = (com.ryanheise.audioservice.b.d) r3     // Catch: java.lang.Throwable -> L40
            android.app.Activity r3 = r3.f3293b     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L13
            goto L3c
        L24:
            io.flutter.embedding.engine.FlutterEngineCache r2 = io.flutter.embedding.engine.FlutterEngineCache.getInstance()     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = "audio_service_engine"
            io.flutter.embedding.engine.FlutterEngine r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L3c
            r2.destroy()     // Catch: java.lang.Throwable -> L40
            io.flutter.embedding.engine.FlutterEngineCache r2 = io.flutter.embedding.engine.FlutterEngineCache.getInstance()     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = "audio_service_engine"
            r2.remove(r3)     // Catch: java.lang.Throwable -> L40
        L3c:
            monitor-exit(r0)
            com.ryanheise.audioservice.AudioService.H = r1
            goto L43
        L40:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L43:
            r5.f3269w = r1
            r5.f3270x = r1
            java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r0 = com.ryanheise.audioservice.AudioService.I
            r0.clear()
            java.util.HashMap r0 = com.ryanheise.audioservice.AudioService.J
            r0.clear()
            java.util.List<ta.f> r0 = r5.f3266s
            r0.clear()
            com.ryanheise.audioservice.AudioService$a r0 = r5.f3272z
            r0.evictAll()
            r5.f3268v = r1
            android.support.v4.media.session.MediaSessionCompat r0 = r5.f3265r
            r2 = 0
            if (r0 != 0) goto L63
            goto L82
        L63:
            boolean r0 = r0.c()
            if (r0 == 0) goto L6e
            android.support.v4.media.session.MediaSessionCompat r0 = r5.f3265r
            r0.e(r2)
        L6e:
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            r3 = 1124(0x464, float:1.575E-42)
            r0.cancel(r3)
            android.support.v4.media.session.MediaSessionCompat r0 = r5.f3265r
            r0.d()
            r5.f3265r = r1
        L82:
            ta.a r0 = r5.f3263p
            boolean r0 = r0.f14677b
            r0 = r0 ^ 1
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L92
            r5.stopForeground(r0)
            goto L95
        L92:
            r5.stopForeground(r0)
        L95:
            android.os.PowerManager$WakeLock r0 = r5.f3264q
            boolean r0 = r0.isHeld()
            if (r0 == 0) goto La2
            android.os.PowerManager$WakeLock r0 = r5.f3264q
            r0.release()
        La2:
            com.ryanheise.audioservice.AudioService.F = r1
            r5.C = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.AudioService.onDestroy():void");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        MediaSessionCompat mediaSessionCompat = this.f3265r;
        int i12 = i1.a.f7354a;
        if (mediaSessionCompat == null || intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            return 2;
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        MediaControllerCompat mediaControllerCompat = mediaSessionCompat.f484b;
        if (keyEvent != null) {
            mediaControllerCompat.f466a.f469a.dispatchMediaButtonEvent(keyEvent);
            return 2;
        }
        mediaControllerCompat.getClass();
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        c cVar = H;
        if (cVar != null) {
            ((b.c) cVar).a("onTaskRemoved", com.ryanheise.audioservice.b.k(new Object[0]), null);
        }
        super.onTaskRemoved(intent);
    }
}
