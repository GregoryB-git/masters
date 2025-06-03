package com.ryanheise.audioservice;

import a0.AbstractC0732o;
import a0.AbstractServiceC0721d;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.LruCache;
import android.view.KeyEvent;
import b0.C0787c;
import com.ryanheise.audioservice.AudioService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l5.AbstractC1615c;
import l5.C1620h;
import l5.C1628p;
import l5.C1630r;
import l5.EnumC1613a;
import l5.EnumC1629q;
import w.h;
import x.AbstractC2112a;
import x2.AbstractC2195i;

/* loaded from: classes.dex */
public class AudioService extends AbstractServiceC0721d {

    /* renamed from: R, reason: collision with root package name */
    public static AudioService f12275R;

    /* renamed from: S, reason: collision with root package name */
    public static PendingIntent f12276S;

    /* renamed from: T, reason: collision with root package name */
    public static e f12277T;

    /* renamed from: U, reason: collision with root package name */
    public static List f12278U = new ArrayList();

    /* renamed from: V, reason: collision with root package name */
    public static final Map f12279V = new HashMap();

    /* renamed from: A, reason: collision with root package name */
    public MediaSessionCompat f12280A;

    /* renamed from: B, reason: collision with root package name */
    public d f12281B;

    /* renamed from: F, reason: collision with root package name */
    public int[] f12285F;

    /* renamed from: G, reason: collision with root package name */
    public MediaMetadataCompat f12286G;

    /* renamed from: H, reason: collision with root package name */
    public Bitmap f12287H;

    /* renamed from: I, reason: collision with root package name */
    public String f12288I;

    /* renamed from: J, reason: collision with root package name */
    public LruCache f12289J;

    /* renamed from: M, reason: collision with root package name */
    public int f12292M;

    /* renamed from: N, reason: collision with root package name */
    public int f12293N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f12294O;

    /* renamed from: Q, reason: collision with root package name */
    public AbstractC0732o f12296Q;

    /* renamed from: x, reason: collision with root package name */
    public io.flutter.embedding.engine.a f12297x;

    /* renamed from: y, reason: collision with root package name */
    public C1620h f12298y;

    /* renamed from: z, reason: collision with root package name */
    public PowerManager.WakeLock f12299z;

    /* renamed from: C, reason: collision with root package name */
    public List f12282C = new ArrayList();

    /* renamed from: D, reason: collision with root package name */
    public List f12283D = new ArrayList();

    /* renamed from: E, reason: collision with root package name */
    public List f12284E = new ArrayList();

    /* renamed from: K, reason: collision with root package name */
    public boolean f12290K = false;

    /* renamed from: L, reason: collision with root package name */
    public EnumC1613a f12291L = EnumC1613a.idle;

    /* renamed from: P, reason: collision with root package name */
    public final Handler f12295P = new Handler(Looper.getMainLooper());

    public class a extends LruCache {
        public a(int i7) {
            super(i7);
        }

        @Override // android.util.LruCache
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getByteCount() / 1024;
        }
    }

    public class b extends AbstractC0732o {
        public b(int i7, int i8, int i9) {
            super(i7, i8, i9);
        }

        @Override // a0.AbstractC0732o
        public void d(int i7) {
            if (AudioService.f12277T == null) {
                return;
            }
            AudioService.f12277T.H(i7);
        }

        @Override // a0.AbstractC0732o
        public void e(int i7) {
            if (AudioService.f12277T == null) {
                return;
            }
            AudioService.f12277T.x(i7);
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12302a;

        static {
            int[] iArr = new int[EnumC1613a.values().length];
            f12302a = iArr;
            try {
                iArr[EnumC1613a.idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12302a[EnumC1613a.loading.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12302a[EnumC1613a.buffering.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12302a[EnumC1613a.ready.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12302a[EnumC1613a.completed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12302a[EnumC1613a.error.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public class d extends MediaSessionCompat.b {
        public d() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void A() {
            if (AudioService.f12277T == null) {
                return;
            }
            AudioService.f12277T.k();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void B(long j7) {
            if (AudioService.f12277T == null) {
                return;
            }
            AudioService.f12277T.G(j7);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void C() {
            if (AudioService.f12277T == null) {
                return;
            }
            AudioService.f12277T.g();
        }

        public final EnumC1629q E(KeyEvent keyEvent) {
            int keyCode = keyEvent.getKeyCode();
            return (keyCode == 79 || keyCode == 85) ? EnumC1629q.media : keyCode != 87 ? keyCode != 88 ? EnumC1629q.media : EnumC1629q.previous : EnumC1629q.next;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void b(MediaDescriptionCompat mediaDescriptionCompat) {
            if (AudioService.f12277T == null) {
                return;
            }
            AudioService.f12277T.C(AudioService.K(mediaDescriptionCompat.g()));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void c(MediaDescriptionCompat mediaDescriptionCompat, int i7) {
            if (AudioService.f12277T == null) {
                return;
            }
            AudioService.f12277T.v(AudioService.K(mediaDescriptionCompat.g()), i7);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void e(String str, Bundle bundle) {
            if (AudioService.f12277T == null) {
                return;
            }
            if ("com.ryanheise.audioservice.action.STOP".equals(str)) {
                AudioService.f12277T.g();
                return;
            }
            if ("com.ryanheise.audioservice.action.FAST_FORWARD".equals(str)) {
                AudioService.f12277T.A();
            } else if ("com.ryanheise.audioservice.action.REWIND".equals(str)) {
                AudioService.f12277T.r();
            } else {
                AudioService.f12277T.E(str, bundle);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void f() {
            if (AudioService.f12277T == null) {
                return;
            }
            AudioService.f12277T.A();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public boolean g(Intent intent) {
            if (AudioService.f12277T == null) {
                return false;
            }
            KeyEvent keyEvent = (KeyEvent) intent.getExtras().getParcelable("android.intent.extra.KEY_EVENT");
            if (keyEvent.getAction() != 0) {
                return true;
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79) {
                if (keyCode == 130) {
                    h();
                    return true;
                }
                if (keyCode != 126 && keyCode != 127) {
                    switch (keyCode) {
                        case 85:
                        case 87:
                        case 88:
                            break;
                        case 86:
                            C();
                            return true;
                        case 89:
                            r();
                            return true;
                        case 90:
                            f();
                            return true;
                        case 91:
                            i();
                            return true;
                        default:
                            return true;
                    }
                }
            }
            AudioService.f12277T.j(E(keyEvent));
            return true;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void h() {
            if (AudioService.f12277T == null) {
                return;
            }
            AudioService.f12277T.w();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void i() {
            if (AudioService.f12277T == null) {
                return;
            }
            AudioService.f12277T.e();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void j(String str, Bundle bundle) {
            if (AudioService.f12277T == null) {
                return;
            }
            AudioService.f12277T.z(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void k(String str, Bundle bundle) {
            if (AudioService.f12277T == null) {
                return;
            }
            AudioService.f12277T.u(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void l(Uri uri, Bundle bundle) {
            if (AudioService.f12277T == null) {
                return;
            }
            AudioService.f12277T.I(uri, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void m() {
            if (AudioService.f12277T == null) {
                return;
            }
            if (!AudioService.this.f12280A.e()) {
                AudioService.this.f12280A.g(true);
            }
            AudioService.f12277T.p();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void n(String str, Bundle bundle) {
            if (AudioService.f12277T == null) {
                return;
            }
            if (!AudioService.this.f12280A.e()) {
                AudioService.this.f12280A.g(true);
            }
            AudioService.f12277T.h(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void o(String str, Bundle bundle) {
            if (AudioService.f12277T == null) {
                return;
            }
            if (!AudioService.this.f12280A.e()) {
                AudioService.this.f12280A.g(true);
            }
            AudioService.f12277T.F(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void p(Uri uri, Bundle bundle) {
            if (AudioService.f12277T == null) {
                return;
            }
            if (!AudioService.this.f12280A.e()) {
                AudioService.this.f12280A.g(true);
            }
            AudioService.f12277T.q(uri, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void q(MediaDescriptionCompat mediaDescriptionCompat) {
            if (AudioService.f12277T == null) {
                return;
            }
            AudioService.f12277T.n(AudioService.K(mediaDescriptionCompat.g()));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void r() {
            if (AudioService.f12277T == null) {
                return;
            }
            AudioService.f12277T.r();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void s(long j7) {
            if (AudioService.f12277T == null) {
                return;
            }
            AudioService.f12277T.B(j7);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void t(boolean z7) {
            if (AudioService.f12277T == null) {
                return;
            }
            AudioService.f12277T.f(z7);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void u(float f7) {
            if (AudioService.f12277T == null) {
                return;
            }
            AudioService.f12277T.o(f7);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void v(RatingCompat ratingCompat) {
            if (AudioService.f12277T == null) {
                return;
            }
            AudioService.f12277T.t(ratingCompat);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void w(RatingCompat ratingCompat, Bundle bundle) {
            if (AudioService.f12277T == null) {
                return;
            }
            AudioService.f12277T.J(ratingCompat, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void x(int i7) {
            if (AudioService.f12277T == null) {
                return;
            }
            AudioService.f12277T.c(i7);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void y(int i7) {
            if (AudioService.f12277T == null) {
                return;
            }
            AudioService.f12277T.d(i7);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void z() {
            if (AudioService.f12277T == null) {
                return;
            }
            AudioService.f12277T.l();
        }
    }

    public interface e {
        void A();

        void B(long j7);

        void C(MediaMetadataCompat mediaMetadataCompat);

        void D();

        void E(String str, Bundle bundle);

        void F(String str, Bundle bundle);

        void G(long j7);

        void H(int i7);

        void I(Uri uri, Bundle bundle);

        void J(RatingCompat ratingCompat, Bundle bundle);

        void b();

        void c(int i7);

        void d(int i7);

        void e();

        void f(boolean z7);

        void g();

        void h(String str, Bundle bundle);

        void i(String str, Bundle bundle, AbstractServiceC0721d.l lVar);

        void j(EnumC1629q enumC1629q);

        void k();

        void l();

        void m(String str, AbstractServiceC0721d.l lVar);

        void n(MediaMetadataCompat mediaMetadataCompat);

        void o(float f7);

        void p();

        void q(Uri uri, Bundle bundle);

        void r();

        void s(String str, AbstractServiceC0721d.l lVar, Bundle bundle);

        void t(RatingCompat ratingCompat);

        void u(String str, Bundle bundle);

        void v(MediaMetadataCompat mediaMetadataCompat, int i7);

        void w();

        void x(int i7);

        void y();

        void z(String str, Bundle bundle);
    }

    public static int A(BitmapFactory.Options options, int i7, int i8) {
        int i9 = options.outHeight;
        int i10 = options.outWidth;
        int i11 = 1;
        if (i9 > i8 || i10 > i7) {
            int i12 = i9 / 2;
            int i13 = i10 / 2;
            while (i12 / i11 >= i8 && i13 / i11 >= i7) {
                i11 *= 2;
            }
        }
        return i11;
    }

    public static MediaMetadataCompat K(String str) {
        return (MediaMetadataCompat) f12279V.get(str);
    }

    public static void Q(e eVar) {
        f12277T = eVar;
    }

    public static int d0(long j7) {
        if (j7 == 4) {
            return 91;
        }
        if (j7 == 2) {
            return 130;
        }
        return PlaybackStateCompat.h(j7);
    }

    public void B(C1620h c1620h) {
        this.f12298y = c1620h;
        String str = c1620h.f17261c;
        if (str == null) {
            str = getApplication().getPackageName() + ".channel";
        }
        this.f12288I = str;
        if (c1620h.f17272n != null) {
            Context applicationContext = getApplicationContext();
            Intent intent = new Intent((String) null);
            intent.setComponent(new ComponentName(applicationContext, c1620h.f17272n));
            intent.setAction("com.ryanheise.audioservice.NOTIFICATION_CLICK");
            f12276S = PendingIntent.getActivity(applicationContext, 1000, intent, 201326592);
        } else {
            f12276S = null;
        }
        if (c1620h.f17260b) {
            return;
        }
        this.f12280A.l(null);
    }

    public h.a C(String str, String str2, long j7) {
        return new h.a(O(str), str2, y(j7));
    }

    public final void D() {
        NotificationChannel notificationChannel;
        NotificationManager M6 = M();
        notificationChannel = M6.getNotificationChannel(this.f12288I);
        if (notificationChannel == null) {
            AbstractC1615c.a();
            NotificationChannel a7 = AbstractC2195i.a(this.f12288I, this.f12298y.f17262d, 2);
            a7.setShowBadge(this.f12298y.f17266h);
            String str = this.f12298y.f17263e;
            if (str != null) {
                a7.setDescription(str);
            }
            M6.createNotificationChannel(a7);
        }
    }

    public PlaybackStateCompat.CustomAction E(C1630r c1630r) {
        int O6 = O(c1630r.f17293a);
        C1628p c1628p = c1630r.f17296d;
        if (c1628p != null) {
            return new PlaybackStateCompat.CustomAction.b(c1628p.f17287a, c1630r.f17294b, O6).b(U(c1630r.f17296d.f17288b)).a();
        }
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        long j7 = c1630r.f17295c;
        if (j7 == 1) {
            return new PlaybackStateCompat.CustomAction.b("com.ryanheise.audioservice.action.STOP", c1630r.f17294b, O6).a();
        }
        if (j7 == 64) {
            return new PlaybackStateCompat.CustomAction.b("com.ryanheise.audioservice.action.FAST_FORWARD", c1630r.f17294b, O6).a();
        }
        if (j7 == 8) {
            return new PlaybackStateCompat.CustomAction.b("com.ryanheise.audioservice.action.REWIND", c1630r.f17294b, O6).a();
        }
        return null;
    }

    public MediaMetadataCompat F(String str, String str2, String str3, String str4, String str5, Long l7, String str6, Boolean bool, String str7, String str8, String str9, RatingCompat ratingCompat, Map map) {
        long longValue;
        String str10;
        MediaMetadataCompat.b e7 = new MediaMetadataCompat.b().e("android.media.metadata.MEDIA_ID", str).e("android.media.metadata.TITLE", str2);
        if (str3 != null) {
            e7.e("android.media.metadata.ALBUM", str3);
        }
        if (str4 != null) {
            e7.e("android.media.metadata.ARTIST", str4);
        }
        if (str5 != null) {
            e7.e("android.media.metadata.GENRE", str5);
        }
        if (l7 != null) {
            e7.c("android.media.metadata.DURATION", l7.longValue());
        }
        if (str6 != null) {
            e7.e("android.media.metadata.DISPLAY_ICON_URI", str6);
        }
        if (bool != null) {
            e7.c("playable_long", bool.booleanValue() ? 1L : 0L);
        }
        if (str7 != null) {
            e7.e("android.media.metadata.DISPLAY_TITLE", str7);
        }
        if (str8 != null) {
            e7.e("android.media.metadata.DISPLAY_SUBTITLE", str8);
        }
        if (str9 != null) {
            e7.e("android.media.metadata.DISPLAY_DESCRIPTION", str9);
        }
        if (ratingCompat != null) {
            e7.d("android.media.metadata.RATING", ratingCompat);
        }
        if (map != null) {
            for (String str11 : map.keySet()) {
                Object obj = map.get(str11);
                if (obj instanceof Long) {
                    longValue = ((Long) obj).longValue();
                } else if (obj instanceof Integer) {
                    longValue = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        str10 = (String) obj;
                    } else if (obj instanceof Boolean) {
                        longValue = ((Boolean) obj).booleanValue() ? 1L : 0L;
                    } else if (obj instanceof Double) {
                        str10 = obj.toString();
                    }
                    e7.e(str11, str10);
                }
                e7.c(str11, longValue);
            }
        }
        MediaMetadataCompat a7 = e7.a();
        f12279V.put(str, a7);
        return a7;
    }

    public final void G() {
        if (this.f12280A.e()) {
            this.f12280A.g(false);
        }
        M().cancel(1124);
    }

    public final void H() {
        AbstractC2112a.k(this, new Intent(this, (Class<?>) AudioService.class));
        if (!this.f12280A.e()) {
            this.f12280A.g(true);
        }
        w();
        this.f12280A.s(f12276S);
        R();
    }

    public final void I() {
        S(false);
        X();
    }

    public final void J() {
        if (this.f12298y.f17269k) {
            I();
        }
    }

    public final h.e L() {
        if (Build.VERSION.SDK_INT >= 26) {
            D();
        }
        h.e n7 = new h.e(this, this.f12288I).C(1).v(false).n(x());
        n7.w(O(this.f12298y.f17265g));
        return n7;
    }

    public final NotificationManager M() {
        return (NotificationManager) getSystemService("notification");
    }

    public int N() {
        int i7 = c.f12302a[this.f12291L.ordinal()];
        if (i7 == 2) {
            return 8;
        }
        if (i7 != 3) {
            return i7 != 4 ? i7 != 5 ? i7 != 6 ? 0 : 7 : this.f12290K ? 3 : 2 : this.f12290K ? 3 : 2;
        }
        return 6;
    }

    public int O(String str) {
        String[] split = str.split("/");
        String str2 = split[0];
        return getResources().getIdentifier(split[1], str2, getApplicationContext().getPackageName());
    }

    public void P() {
        e eVar = f12277T;
        if (eVar == null) {
            return;
        }
        eVar.b();
    }

    public final void R() {
        startForeground(1124, z());
        this.f12294O = true;
    }

    public final void S(boolean z7) {
        if (Build.VERSION.SDK_INT >= 24) {
            stopForeground(z7 ? 1 : 0);
        } else {
            stopForeground(z7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:7:0x000c, B:35:0x001f, B:37:0x0025, B:39:0x0038, B:40:0x0040, B:42:0x0046, B:43:0x004a, B:11:0x0054, B:13:0x0060, B:16:0x00b5, B:19:0x006b, B:21:0x0071, B:23:0x007b, B:24:0x0086, B:26:0x0097, B:28:0x009d, B:29:0x007f, B:31:0x00a8, B:32:0x00ad), top: B:6:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Bitmap T(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            android.util.LruCache r0 = r8.f12289J
            java.lang.Object r0 = r0.get(r9)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            r1 = 0
            android.net.Uri r2 = android.net.Uri.parse(r9)     // Catch: java.lang.Exception -> L3d
            java.lang.String r3 = "content"
            java.lang.String r4 = r2.getScheme()     // Catch: java.lang.Exception -> L3d
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L3d
            r4 = -1
            if (r3 == 0) goto L66
            if (r10 == 0) goto L54
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            r5 = 29
            if (r10 < r5) goto L54
            android.util.Size r10 = new android.util.Size     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            r0 = 192(0xc0, float:2.69E-43)
            r10.<init>(r0, r0)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            android.content.ContentResolver r0 = r8.getContentResolver()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            android.util.Size r5 = new android.util.Size     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            l5.h r6 = r8.f12298y     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            int r6 = r6.f17270l     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            if (r6 != r4) goto L40
            int r6 = r10.getWidth()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            goto L40
        L3d:
            r9 = move-exception
            goto Lbb
        L40:
            l5.h r7 = r8.f12298y     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            int r7 = r7.f17271m     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            if (r7 != r4) goto L4a
            int r7 = r10.getHeight()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
        L4a:
            r5.<init>(r6, r7)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            android.graphics.Bitmap r0 = l5.AbstractC1618f.a(r0, r2, r5, r1)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            if (r0 != 0) goto L66
            return r1
        L54:
            android.content.ContentResolver r10 = r8.getContentResolver()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            java.lang.String r5 = "r"
            android.os.ParcelFileDescriptor r10 = r10.openFileDescriptor(r2, r5)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            if (r10 == 0) goto L65
            java.io.FileDescriptor r10 = r10.getFileDescriptor()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L65
            goto L67
        L65:
            return r1
        L66:
            r10 = r1
        L67:
            if (r3 == 0) goto L6b
            if (r10 == 0) goto Lb5
        L6b:
            l5.h r0 = r8.f12298y     // Catch: java.lang.Exception -> L3d
            int r0 = r0.f17270l     // Catch: java.lang.Exception -> L3d
            if (r0 == r4) goto La6
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Exception -> L3d
            r0.<init>()     // Catch: java.lang.Exception -> L3d
            r3 = 1
            r0.inJustDecodeBounds = r3     // Catch: java.lang.Exception -> L3d
            if (r10 == 0) goto L7f
            android.graphics.BitmapFactory.decodeFileDescriptor(r10, r1, r0)     // Catch: java.lang.Exception -> L3d
            goto L86
        L7f:
            java.lang.String r3 = r2.getPath()     // Catch: java.lang.Exception -> L3d
            android.graphics.BitmapFactory.decodeFile(r3, r0)     // Catch: java.lang.Exception -> L3d
        L86:
            l5.h r3 = r8.f12298y     // Catch: java.lang.Exception -> L3d
            int r4 = r3.f17270l     // Catch: java.lang.Exception -> L3d
            int r3 = r3.f17271m     // Catch: java.lang.Exception -> L3d
            int r3 = A(r0, r4, r3)     // Catch: java.lang.Exception -> L3d
            r0.inSampleSize = r3     // Catch: java.lang.Exception -> L3d
            r3 = 0
            r0.inJustDecodeBounds = r3     // Catch: java.lang.Exception -> L3d
            if (r10 == 0) goto L9d
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeFileDescriptor(r10, r1, r0)     // Catch: java.lang.Exception -> L3d
        L9b:
            r0 = r10
            goto Lb5
        L9d:
            java.lang.String r10 = r2.getPath()     // Catch: java.lang.Exception -> L3d
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeFile(r10, r0)     // Catch: java.lang.Exception -> L3d
            goto L9b
        La6:
            if (r10 == 0) goto Lad
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFileDescriptor(r10)     // Catch: java.lang.Exception -> L3d
            goto Lb5
        Lad:
            java.lang.String r10 = r2.getPath()     // Catch: java.lang.Exception -> L3d
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r10)     // Catch: java.lang.Exception -> L3d
        Lb5:
            android.util.LruCache r10 = r8.f12289J     // Catch: java.lang.Exception -> L3d
            r10.put(r9, r0)     // Catch: java.lang.Exception -> L3d
            return r0
        Lbb:
            r9.printStackTrace()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.AudioService.T(java.lang.String, java.lang.String):android.graphics.Bitmap");
    }

    public final Bundle U(Map map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String obj = entry.getKey().toString();
            Object value = entry.getValue();
            if (value instanceof Integer) {
                bundle.putInt(obj, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                bundle.putLong(obj, ((Long) value).longValue());
            } else {
                bundle.putString(obj, value.toString());
            }
        }
        return bundle;
    }

    public final MediaMetadataCompat V(MediaMetadataCompat mediaMetadataCompat) {
        return new MediaMetadataCompat.b(mediaMetadataCompat).b("android.media.metadata.ALBUM_ART", this.f12287H).b("android.media.metadata.DISPLAY_ICON", this.f12287H).a();
    }

    public final void W() {
        if (this.f12280A == null) {
            return;
        }
        G();
        this.f12280A.f();
        this.f12280A = null;
    }

    public final void X() {
        if (this.f12299z.isHeld()) {
            this.f12299z.release();
        }
    }

    public synchronized void Y(MediaMetadataCompat mediaMetadataCompat) {
        try {
            String i7 = mediaMetadataCompat.i("artCacheFile");
            if (i7 != null) {
                this.f12287H = T(i7, null);
            } else {
                String i8 = mediaMetadataCompat.i("android.media.metadata.DISPLAY_ICON_URI");
                if (i8 == null || !i8.startsWith("content:")) {
                    this.f12287H = null;
                    this.f12286G = mediaMetadataCompat;
                    this.f12280A.m(mediaMetadataCompat);
                    this.f12295P.removeCallbacksAndMessages(null);
                    this.f12295P.post(new Runnable() { // from class: l5.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            AudioService.this.e0();
                        }
                    });
                } else {
                    this.f12287H = T(i8, mediaMetadataCompat.i("loadThumbnailUri"));
                }
            }
            mediaMetadataCompat = V(mediaMetadataCompat);
            this.f12286G = mediaMetadataCompat;
            this.f12280A.m(mediaMetadataCompat);
            this.f12295P.removeCallbacksAndMessages(null);
            this.f12295P.post(new Runnable() { // from class: l5.g
                @Override // java.lang.Runnable
                public final void run() {
                    AudioService.this.e0();
                }
            });
        } catch (Throwable th) {
            throw th;
        }
    }

    public void Z(int i7, Integer num, Integer num2, Integer num3) {
        if (i7 == 1) {
            this.f12280A.o(3);
            this.f12296Q = null;
        } else if (i7 == 2) {
            if (this.f12296Q != null && num.intValue() == this.f12296Q.b() && num2.intValue() == this.f12296Q.a()) {
                this.f12296Q.f(num3.intValue());
            } else {
                this.f12296Q = new b(num.intValue(), num2.intValue(), num3.intValue());
            }
            this.f12280A.p(this.f12296Q);
        }
    }

    public synchronized void a0(List list) {
        f12278U = list;
        this.f12280A.q(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b0(java.util.List r20, long r21, int[] r23, l5.EnumC1613a r24, boolean r25, long r26, long r28, float r30, long r31, java.lang.Integer r33, java.lang.String r34, int r35, int r36, boolean r37, java.lang.Long r38) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ryanheise.audioservice.AudioService.b0(java.util.List, long, int[], l5.a, boolean, long, long, float, long, java.lang.Integer, java.lang.String, int, int, boolean, java.lang.Long):void");
    }

    public void c0() {
        G();
        stopSelf();
    }

    public final void e0() {
        if (this.f12294O) {
            M().notify(1124, z());
        }
    }

    @Override // a0.AbstractServiceC0721d
    public AbstractServiceC0721d.e g(String str, int i7, Bundle bundle) {
        Boolean valueOf = bundle == null ? null : Boolean.valueOf(bundle.getBoolean("android.service.media.extra.RECENT"));
        if (valueOf == null) {
            valueOf = Boolean.FALSE;
        }
        return new AbstractServiceC0721d.e(valueOf.booleanValue() ? "recent" : "root", this.f12298y.a());
    }

    @Override // a0.AbstractServiceC0721d
    public void h(String str, AbstractServiceC0721d.l lVar) {
        i(str, lVar, null);
    }

    @Override // a0.AbstractServiceC0721d
    public void i(String str, AbstractServiceC0721d.l lVar, Bundle bundle) {
        e eVar = f12277T;
        if (eVar == null) {
            lVar.g(new ArrayList());
        } else {
            eVar.s(str, lVar, bundle);
        }
    }

    @Override // a0.AbstractServiceC0721d
    public void j(String str, AbstractServiceC0721d.l lVar) {
        e eVar = f12277T;
        if (eVar == null) {
            lVar.g(null);
        } else {
            eVar.m(str, lVar);
        }
    }

    @Override // a0.AbstractServiceC0721d
    public void k(String str, Bundle bundle, AbstractServiceC0721d.l lVar) {
        e eVar = f12277T;
        if (eVar == null) {
            lVar.g(new ArrayList());
        } else {
            eVar.i(str, bundle, lVar);
        }
    }

    @Override // a0.AbstractServiceC0721d, android.app.Service
    public void onCreate() {
        super.onCreate();
        f12275R = this;
        this.f12292M = 0;
        this.f12293N = 0;
        this.f12294O = false;
        this.f12290K = false;
        this.f12291L = EnumC1613a.idle;
        this.f12280A = new MediaSessionCompat(this, "media-session");
        B(new C1620h(getApplicationContext()));
        this.f12280A.k(4);
        this.f12280A.n(new PlaybackStateCompat.d().c(3669711L).b());
        MediaSessionCompat mediaSessionCompat = this.f12280A;
        d dVar = new d();
        this.f12281B = dVar;
        mediaSessionCompat.h(dVar);
        s(this.f12280A.c());
        this.f12280A.q(f12278U);
        this.f12299z = ((PowerManager) getSystemService("power")).newWakeLock(1, AudioService.class.getName());
        this.f12289J = new a(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8);
        this.f12297x = com.ryanheise.audioservice.a.B(this);
        System.out.println("flutterEngine warmed up");
    }

    @Override // a0.AbstractServiceC0721d, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        e eVar = f12277T;
        if (eVar != null) {
            eVar.D();
            f12277T = null;
        }
        this.f12286G = null;
        this.f12287H = null;
        f12278U.clear();
        f12279V.clear();
        this.f12282C.clear();
        this.f12289J.evictAll();
        this.f12285F = null;
        W();
        S(!this.f12298y.f17260b);
        X();
        f12275R = null;
        this.f12294O = false;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i7, int i8) {
        c0.d.c(this.f12280A, intent);
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        e eVar = f12277T;
        if (eVar != null) {
            eVar.y();
        }
        super.onTaskRemoved(intent);
    }

    public final void w() {
        if (this.f12299z.isHeld()) {
            return;
        }
        this.f12299z.acquire();
    }

    public PendingIntent x() {
        Intent intent = new Intent(this, (Class<?>) MediaButtonReceiver.class);
        intent.setAction("com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE");
        return PendingIntent.getBroadcast(this, 0, intent, 67108864);
    }

    public PendingIntent y(long j7) {
        int d02 = d0(j7);
        if (d02 == 0) {
            return null;
        }
        Intent intent = new Intent(this, (Class<?>) MediaButtonReceiver.class);
        intent.setAction("android.intent.action.MEDIA_BUTTON");
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, d02));
        return PendingIntent.getBroadcast(this, d02, intent, 67108864);
    }

    public final Notification z() {
        int[] iArr = this.f12285F;
        if (iArr == null) {
            int min = Math.min(3, this.f12283D.size());
            int[] iArr2 = new int[min];
            for (int i7 = 0; i7 < min; i7++) {
                iArr2[i7] = i7;
            }
            iArr = iArr2;
        }
        h.e L6 = L();
        MediaMetadataCompat mediaMetadataCompat = this.f12286G;
        if (mediaMetadataCompat != null) {
            MediaDescriptionCompat e7 = mediaMetadataCompat.e();
            if (e7.j() != null) {
                L6.l(e7.j());
            }
            if (e7.i() != null) {
                L6.k(e7.i());
            }
            if (e7.b() != null) {
                L6.z(e7.b());
            }
            synchronized (this) {
                try {
                    Bitmap bitmap = this.f12287H;
                    if (bitmap != null) {
                        L6.p(bitmap);
                    }
                } finally {
                }
            }
        }
        if (this.f12298y.f17267i) {
            L6.j(this.f12280A.b().b());
        }
        int i8 = this.f12298y.f17264f;
        if (i8 != -1) {
            L6.i(i8);
        }
        Iterator it = this.f12283D.iterator();
        while (it.hasNext()) {
            L6.b((h.a) it.next());
        }
        C0787c i9 = new C0787c().i(this.f12280A.c());
        if (Build.VERSION.SDK_INT < 33) {
            i9.j(iArr);
        }
        if (this.f12298y.f17268j) {
            i9.k(true);
            i9.h(y(1L));
            L6.t(true);
        }
        L6.y(i9);
        return L6.c();
    }
}
