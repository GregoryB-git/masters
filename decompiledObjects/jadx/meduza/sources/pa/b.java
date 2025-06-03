package pa;

import aa.m0;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.Surface;
import b1.x;
import com.jhomlala.better_player.ImageWorker;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.urllauncher.WebViewActivity;
import io.flutter.view.TextureRegistry;
import io.meduza.meduza.R;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import o2.l;
import o2.o;
import p2.k0;
import s5.c;
import v3.d0;
import v3.e1;
import v3.f1;
import v3.j0;
import v3.m;
import v3.n;
import v3.o0;
import v3.p0;
import v3.r;
import v3.r1;
import v3.s1;
import v5.e0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final EventChannel f13050a;

    /* renamed from: b, reason: collision with root package name */
    public final TextureRegistry.SurfaceTextureEntry f13051b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f13052c;

    /* renamed from: d, reason: collision with root package name */
    public final k f13053d;

    /* renamed from: e, reason: collision with root package name */
    public final r5.f f13054e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public Surface f13055g;

    /* renamed from: h, reason: collision with root package name */
    public String f13056h;

    /* renamed from: i, reason: collision with root package name */
    public s5.c f13057i;

    /* renamed from: j, reason: collision with root package name */
    public Handler f13058j;

    /* renamed from: k, reason: collision with root package name */
    public b.d f13059k;

    /* renamed from: l, reason: collision with root package name */
    public c f13060l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap f13061m;

    /* renamed from: n, reason: collision with root package name */
    public MediaSessionCompat f13062n;

    /* renamed from: o, reason: collision with root package name */
    public a4.b f13063o;

    /* renamed from: p, reason: collision with root package name */
    public final k0 f13064p;

    /* renamed from: q, reason: collision with root package name */
    public final HashMap<UUID, x<o>> f13065q;

    /* renamed from: r, reason: collision with root package name */
    public long f13066r;

    public static final class a {
        public static void a(File file) {
            File[] listFiles;
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                int i10 = 0;
                while (true) {
                    if (!(i10 < listFiles.length)) {
                        break;
                    }
                    int i11 = i10 + 1;
                    try {
                        File file2 = listFiles[i10];
                        ec.i.b(file2);
                        a(file2);
                        i10 = i11;
                    } catch (ArrayIndexOutOfBoundsException e10) {
                        throw new NoSuchElementException(e10.getMessage());
                    }
                }
            }
            if (file.delete()) {
                return;
            }
            Log.e("BetterPlayer", "Failed to delete cache dir.");
        }
    }

    /* renamed from: pa.b$b, reason: collision with other inner class name */
    public static final class C0196b extends MediaSessionCompat.a {
        public C0196b() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void u0(long j10) {
            b bVar = b.this;
            d0 d0Var = bVar.f13052c;
            if (d0Var != null) {
                d0Var.T(5, j10);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("event", "seek");
            hashMap.put("position", Long.valueOf(j10));
            bVar.f13053d.success(hashMap);
        }
    }

    public static final class c implements f1.c {
        public c() {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void D(boolean z10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void F(f1.a aVar) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void G(int i10, f1.d dVar, f1.d dVar2) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void I(boolean z10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void K(int i10, boolean z10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void L(float f) {
        }

        @Override // v3.f1.c
        public final void N(int i10) {
            MediaSessionCompat mediaSessionCompat = b.this.f13062n;
            if (mediaSessionCompat != null) {
                Bundle bundle = new Bundle();
                d0 d0Var = b.this.f13052c;
                long duration = d0Var != null ? d0Var.getDuration() : 0L;
                r.b<String, Integer> bVar = MediaMetadataCompat.f452d;
                if (bVar.containsKey("android.media.metadata.DURATION") && bVar.getOrDefault("android.media.metadata.DURATION", null).intValue() != 0) {
                    throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
                }
                bundle.putLong("android.media.metadata.DURATION", duration);
                mediaSessionCompat.g(new MediaMetadataCompat(bundle));
            }
        }

        @Override // v3.f1.c
        public final /* synthetic */ void R(p0 p0Var) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void T(boolean z10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void W(int i10, boolean z10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void X(n nVar) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void Y(r1 r1Var, int i10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void Z(s1 s1Var) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void a0(n nVar) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void b(w5.o oVar) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void b0(int i10, boolean z10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void c0(e1 e1Var) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void d(int i10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void d0(x3.d dVar) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void e0(f1 f1Var, f1.b bVar) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void f() {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void j(h5.c cVar) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void k0(o0 o0Var, int i10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void l0(m mVar) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void m() {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void m0(int i10, int i11) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void o(boolean z10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void p0(boolean z10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void q(int i10) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void r(List list) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void w(p4.a aVar) {
        }

        @Override // v3.f1.c
        public final /* synthetic */ void x(int i10) {
        }
    }

    public static final class d implements c.InterfaceC0219c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f13068a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f13069b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f13070c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13071d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f13072e;
        public final /* synthetic */ b f;

        public d(String str, Context context, String str2, String str3, String str4, b bVar) {
            this.f13068a = str;
            this.f13069b = context;
            this.f13070c = str2;
            this.f13071d = str3;
            this.f13072e = str4;
            this.f = bVar;
        }

        @Override // s5.c.InterfaceC0219c
        public final CharSequence a(f1 f1Var) {
            ec.i.e(f1Var, "player");
            return this.f13068a;
        }

        @Override // s5.c.InterfaceC0219c
        public final Bitmap b(f1 f1Var, final c.a aVar) {
            ec.i.e(f1Var, "player");
            if (this.f13072e == null) {
                return null;
            }
            Bitmap bitmap = this.f.f13061m;
            if (bitmap != null) {
                return bitmap;
            }
            l.a aVar2 = new l.a(ImageWorker.class);
            String str = this.f13072e;
            ec.i.e(str, "tag");
            aVar2.f11751d.add(str);
            HashMap hashMap = new HashMap();
            hashMap.put(WebViewActivity.URL_EXTRA, this.f13072e);
            androidx.work.c cVar = new androidx.work.c(hashMap);
            androidx.work.c.e(cVar);
            aVar2.f11750c.f16834e = cVar;
            l a10 = aVar2.a();
            ec.i.d(a10, "build(...)");
            final l lVar = a10;
            this.f.f13064p.a(lVar);
            final b bVar = this.f;
            x<o> xVar = new x() { // from class: pa.c
                @Override // b1.x
                public final void a(Object obj) {
                    b bVar2 = b.this;
                    l lVar2 = lVar;
                    c.a aVar3 = aVar;
                    o oVar = (o) obj;
                    if (oVar != null) {
                        try {
                            o.b bVar3 = oVar.f11727b;
                            ec.i.d(bVar3, "getState(...)");
                            o.b bVar4 = o.b.SUCCEEDED;
                            if (bVar3 == bVar4) {
                                androidx.work.c cVar2 = oVar.f11729d;
                                ec.i.d(cVar2, "getOutputData(...)");
                                Bitmap decodeFile = BitmapFactory.decodeFile(cVar2.d("filePath"));
                                bVar2.f13061m = decodeFile;
                                if (decodeFile != null) {
                                    s5.c.this.f14178e.obtainMessage(1, aVar3.f14198a, -1, decodeFile).sendToTarget();
                                }
                            }
                            if (bVar3 == bVar4 || bVar3 == o.b.CANCELLED || bVar3 == o.b.FAILED) {
                                UUID uuid = lVar2.f11745a;
                                ec.i.d(uuid, "getId(...)");
                                x<o> remove = bVar2.f13065q.remove(uuid);
                                if (remove != null) {
                                    bVar2.f13064p.e(uuid).removeObserver(remove);
                                }
                            }
                        } catch (Exception e10) {
                            Log.e("BetterPlayer", "Image select error: " + e10);
                        }
                    }
                }
            };
            UUID uuid = lVar.f11745a;
            ec.i.d(uuid, "getId(...)");
            this.f.f13064p.e(uuid).observeForever(xVar);
            this.f.f13065q.put(uuid, xVar);
            return null;
        }

        @Override // s5.c.InterfaceC0219c
        public final /* synthetic */ void c() {
        }

        @Override // s5.c.InterfaceC0219c
        public final PendingIntent d(f1 f1Var) {
            ec.i.e(f1Var, "player");
            String packageName = this.f13069b.getApplicationContext().getPackageName();
            Intent intent = new Intent();
            intent.setClassName(packageName, packageName + '.' + this.f13070c);
            intent.setFlags(603979776);
            return PendingIntent.getActivity(this.f13069b, 0, intent, 67108864);
        }

        @Override // s5.c.InterfaceC0219c
        public final CharSequence e(f1 f1Var) {
            ec.i.e(f1Var, "player");
            return this.f13071d;
        }
    }

    public b(Context context, EventChannel eventChannel, TextureRegistry.SurfaceTextureEntry surfaceTextureEntry, i iVar, MethodChannel.Result result) {
        ec.i.e(result, "result");
        this.f13050a = eventChannel;
        this.f13051b = surfaceTextureEntry;
        this.f13053d = new k();
        r5.f fVar = new r5.f(context);
        this.f13054e = fVar;
        i iVar2 = iVar == null ? new i() : iVar;
        int i10 = iVar2.f13098a;
        int i11 = iVar2.f13099b;
        int i12 = iVar2.f13100c;
        int i13 = iVar2.f13101d;
        v3.j.j("bufferForPlaybackMs", i12, 0, "0");
        v3.j.j("bufferForPlaybackAfterRebufferMs", i13, 0, "0");
        v3.j.j("minBufferMs", i10, i12, "bufferForPlaybackMs");
        v3.j.j("minBufferMs", i10, i13, "bufferForPlaybackAfterRebufferMs");
        v3.j.j("maxBufferMs", i11, i10, "minBufferMs");
        v3.j jVar = new v3.j(new t5.o(), i10, i11, i12, i13, -1, false, 0, false);
        r rVar = new r(context);
        x6.b.H(!rVar.t);
        int i14 = 0;
        rVar.f15721e = new defpackage.e(fVar, i14);
        x6.b.H(!rVar.t);
        rVar.f = new m0(jVar, i14);
        x6.b.H(!rVar.t);
        rVar.t = true;
        d0 d0Var = new d0(rVar);
        this.f13052c = d0Var;
        this.f13064p = k0.d(context);
        this.f13065q = new HashMap<>();
        eventChannel.setStreamHandler(new pa.d(this));
        Surface surface = new Surface(surfaceTextureEntry.surfaceTexture());
        this.f13055g = surface;
        d0Var.u0();
        d0Var.n0(surface);
        d0Var.g0(-1, -1);
        d0Var.u0();
        d0Var.k0(new x3.d(3, 0, 1, 1, 0), false);
        d0Var.f15284l.a(new e(this));
        HashMap hashMap = new HashMap();
        hashMap.put("textureId", Long.valueOf(surfaceTextureEntry.id()));
        result.success(hashMap);
    }

    public final void a() {
        d0 d0Var;
        MediaSessionCompat mediaSessionCompat = this.f13062n;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.d();
        }
        this.f13062n = null;
        b();
        if (this.f && (d0Var = this.f13052c) != null) {
            d0Var.stop();
        }
        this.f13051b.release();
        this.f13050a.setStreamHandler(null);
        Surface surface = this.f13055g;
        if (surface != null) {
            surface.release();
        }
        d0 d0Var2 = this.f13052c;
        if (d0Var2 != null) {
            d0Var2.h0();
        }
    }

    public final void b() {
        d0 d0Var;
        c cVar = this.f13060l;
        if (cVar != null && (d0Var = this.f13052c) != null) {
            d0Var.h(cVar);
        }
        Handler handler = this.f13058j;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f13058j = null;
            this.f13059k = null;
        }
        s5.c cVar2 = this.f13057i;
        if (cVar2 != null) {
            cVar2.b(null);
        }
        this.f13061m = null;
    }

    public final void c(boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", z10 ? "pipStart" : "pipStop");
        this.f13053d.success(hashMap);
    }

    public final void d(boolean z10) {
        d0 d0Var = this.f13052c;
        long z11 = d0Var != null ? d0Var.z() : 0L;
        if (z10 || z11 != this.f13066r) {
            HashMap hashMap = new HashMap();
            hashMap.put("event", "bufferingUpdate");
            hashMap.put("values", va.a.f(va.a.g(0L, Long.valueOf(z11))));
            this.f13053d.success(hashMap);
            this.f13066r = z11;
        }
    }

    public final void e() {
        if (this.f13054e.e() == null) {
            return;
        }
        this.f13054e.h().buildUpon();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ec.i.a(b.class, obj.getClass())) {
            return false;
        }
        b bVar = (b) obj;
        d0 d0Var = this.f13052c;
        if (d0Var == null ? bVar.f13052c != null : !ec.i.a(d0Var, bVar.f13052c)) {
            return false;
        }
        Surface surface = this.f13055g;
        Surface surface2 = bVar.f13055g;
        return surface != null ? ec.i.a(surface, surface2) : surface2 == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.content.Context r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, io.flutter.plugin.common.MethodChannel.Result r32, java.util.Map<java.lang.String, java.lang.String> r33, boolean r34, long r35, long r37, long r39, java.lang.String r41, java.util.Map<java.lang.String, java.lang.String> r42, java.lang.String r43, java.lang.String r44) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.b.f(android.content.Context, java.lang.String, java.lang.String, java.lang.String, io.flutter.plugin.common.MethodChannel$Result, java.util.Map, boolean, long, long, long, java.lang.String, java.util.Map, java.lang.String, java.lang.String):void");
    }

    public final void g() {
        ec.i.d(this.f13054e.buildUponParameters(), "buildUponParameters(...)");
        throw null;
    }

    public final MediaSessionCompat h(Context context) {
        MediaSessionCompat mediaSessionCompat = this.f13062n;
        if (mediaSessionCompat != null) {
            mediaSessionCompat.d();
        }
        if (context == null) {
            return null;
        }
        MediaSessionCompat mediaSessionCompat2 = new MediaSessionCompat(context, "BetterPlayer", PendingIntent.getBroadcast(context, 0, new Intent("android.intent.action.MEDIA_BUTTON"), 67108864));
        mediaSessionCompat2.f(new C0196b(), null);
        mediaSessionCompat2.e(true);
        b4.a aVar = new b4.a(mediaSessionCompat2);
        d0 d0Var = this.f13052c;
        x6.b.q(d0Var == null || d0Var.f15291s == aVar.f1825b);
        f1 f1Var = aVar.f1831i;
        if (f1Var != null) {
            f1Var.h(aVar.f1826c);
        }
        aVar.f1831i = d0Var;
        if (d0Var != null) {
            d0Var.s(aVar.f1826c);
        }
        aVar.c();
        aVar.b();
        this.f13062n = mediaSessionCompat2;
        return mediaSessionCompat2;
    }

    public final int hashCode() {
        d0 d0Var = this.f13052c;
        int hashCode = (d0Var != null ? d0Var.hashCode() : 0) * 31;
        Surface surface = this.f13055g;
        return hashCode + (surface != null ? surface.hashCode() : 0);
    }

    public final void i(Context context, String str, String str2, String str3, String str4, String str5) {
        String str6;
        ec.i.e(str, "title");
        ec.i.e(str5, "activityName");
        d dVar = new d(str, context, str5, str2, str3, this);
        if (str4 != null || Build.VERSION.SDK_INT < 26) {
            str6 = str4;
        } else {
            NotificationChannel notificationChannel = new NotificationChannel("BETTER_PLAYER_NOTIFICATION", "BETTER_PLAYER_NOTIFICATION", 2);
            notificationChannel.setDescription("BETTER_PLAYER_NOTIFICATION");
            ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
            str6 = "BETTER_PLAYER_NOTIFICATION";
        }
        ec.i.b(str6);
        s5.c cVar = new s5.c(context, str6, 20772077, dVar, R.drawable.exo_notification_small_icon, R.drawable.exo_notification_play, R.drawable.exo_notification_pause, R.drawable.exo_notification_stop, R.drawable.exo_notification_rewind, R.drawable.exo_notification_fastforward, R.drawable.exo_notification_previous, R.drawable.exo_notification_next);
        this.f13057i = cVar;
        d0 d0Var = this.f13052c;
        if (d0Var != null) {
            cVar.b(new j0(d0Var));
            if (cVar.f14192u) {
                cVar.f14192u = false;
                if (cVar.f14189q && !cVar.f14178e.hasMessages(0)) {
                    cVar.f14178e.sendEmptyMessage(0);
                }
            }
            if (cVar.t) {
                cVar.t = false;
                if (cVar.f14189q && !cVar.f14178e.hasMessages(0)) {
                    cVar.f14178e.sendEmptyMessage(0);
                }
            }
            if (cVar.f14196y) {
                cVar.f14196y = false;
                if (cVar.f14189q && !cVar.f14178e.hasMessages(0)) {
                    cVar.f14178e.sendEmptyMessage(0);
                }
            }
        }
        MediaSessionCompat h10 = h(context);
        if (h10 != null) {
            MediaSessionCompat.Token token = h10.f483a.f502b;
            if (!e0.a(cVar.f14191s, token)) {
                cVar.f14191s = token;
                if (cVar.f14189q && !cVar.f14178e.hasMessages(0)) {
                    cVar.f14178e.sendEmptyMessage(0);
                }
            }
        }
        Handler handler = new Handler(Looper.getMainLooper());
        this.f13058j = handler;
        b.d dVar2 = new b.d(this, 22);
        this.f13059k = dVar2;
        handler.postDelayed(dVar2, 0L);
        c cVar2 = new c();
        this.f13060l = cVar2;
        d0 d0Var2 = this.f13052c;
        if (d0Var2 != null) {
            d0Var2.f15284l.a(cVar2);
        }
        d0 d0Var3 = this.f13052c;
        if (d0Var3 != null) {
            d0Var3.T(5, 0L);
        }
    }
}
