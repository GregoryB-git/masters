package w;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class h {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f20211a;

        /* renamed from: b, reason: collision with root package name */
        public IconCompat f20212b;

        /* renamed from: c, reason: collision with root package name */
        public final l[] f20213c;

        /* renamed from: d, reason: collision with root package name */
        public final l[] f20214d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f20215e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f20216f;

        /* renamed from: g, reason: collision with root package name */
        public final int f20217g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f20218h;

        /* renamed from: i, reason: collision with root package name */
        public int f20219i;

        /* renamed from: j, reason: collision with root package name */
        public CharSequence f20220j;

        /* renamed from: k, reason: collision with root package name */
        public PendingIntent f20221k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f20222l;

        public a(int i7, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i7 != 0 ? IconCompat.e(null, "", i7) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f20221k;
        }

        public boolean b() {
            return this.f20215e;
        }

        public Bundle c() {
            return this.f20211a;
        }

        public IconCompat d() {
            int i7;
            if (this.f20212b == null && (i7 = this.f20219i) != 0) {
                this.f20212b = IconCompat.e(null, "", i7);
            }
            return this.f20212b;
        }

        public l[] e() {
            return this.f20213c;
        }

        public int f() {
            return this.f20217g;
        }

        public boolean g() {
            return this.f20216f;
        }

        public CharSequence h() {
            return this.f20220j;
        }

        public boolean i() {
            return this.f20222l;
        }

        public boolean j() {
            return this.f20218h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, l[] lVarArr, l[] lVarArr2, boolean z7, int i7, boolean z8, boolean z9, boolean z10) {
            this.f20216f = true;
            this.f20212b = iconCompat;
            if (iconCompat != null && iconCompat.i() == 2) {
                this.f20219i = iconCompat.g();
            }
            this.f20220j = e.e(charSequence);
            this.f20221k = pendingIntent;
            this.f20211a = bundle == null ? new Bundle() : bundle;
            this.f20213c = lVarArr;
            this.f20214d = lVarArr2;
            this.f20215e = z7;
            this.f20217g = i7;
            this.f20216f = z8;
            this.f20218h = z9;
            this.f20222l = z10;
        }
    }

    public static class b extends f {

        /* renamed from: e, reason: collision with root package name */
        public IconCompat f20223e;

        /* renamed from: f, reason: collision with root package name */
        public IconCompat f20224f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f20225g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f20226h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f20227i;

        public static class a {
            public static Notification.BigPictureStyle a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                return bigPictureStyle.bigPicture(bitmap);
            }

            public static Notification.BigPictureStyle b(Notification.Builder builder) {
                return new Notification.BigPictureStyle(builder);
            }

            public static Notification.BigPictureStyle c(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                return bigPictureStyle.setBigContentTitle(charSequence);
            }

            public static void d(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            public static void e(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: w.h$b$b, reason: collision with other inner class name */
        public static class C0285b {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        public static class c {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z7) {
                bigPictureStyle.showBigPictureWhenCollapsed(z7);
            }
        }

        @Override // w.h.f
        public void b(g gVar) {
            int i7 = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle c7 = a.c(a.b(gVar.a()), this.f20277b);
            IconCompat iconCompat = this.f20223e;
            if (iconCompat != null) {
                if (i7 >= 31) {
                    c.a(c7, this.f20223e.o(gVar instanceof i ? ((i) gVar).f() : null));
                } else if (iconCompat.i() == 1) {
                    c7 = a.a(c7, this.f20223e.f());
                }
            }
            if (this.f20225g) {
                if (this.f20224f == null) {
                    a.d(c7, null);
                } else {
                    C0285b.a(c7, this.f20224f.o(gVar instanceof i ? ((i) gVar).f() : null));
                }
            }
            if (this.f20279d) {
                a.e(c7, this.f20278c);
            }
            if (i7 >= 31) {
                c.c(c7, this.f20227i);
                c.b(c7, this.f20226h);
            }
        }

        @Override // w.h.f
        public String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f20224f = bitmap == null ? null : IconCompat.d(bitmap);
            this.f20225g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.f20223e = bitmap == null ? null : IconCompat.d(bitmap);
            return this;
        }
    }

    public static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        public CharSequence f20228e;

        public static class a {
            public static Notification.BigTextStyle a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            public static Notification.BigTextStyle b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            public static Notification.BigTextStyle c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            public static Notification.BigTextStyle d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setSummaryText(charSequence);
            }
        }

        @Override // w.h.f
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // w.h.f
        public void b(g gVar) {
            Notification.BigTextStyle a7 = a.a(a.c(a.b(gVar.a()), this.f20277b), this.f20228e);
            if (this.f20279d) {
                a.d(a7, this.f20278c);
            }
        }

        @Override // w.h.f
        public String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.f20228e = e.e(charSequence);
            return this;
        }
    }

    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    public static class e {

        /* renamed from: A, reason: collision with root package name */
        public boolean f20229A;

        /* renamed from: B, reason: collision with root package name */
        public boolean f20230B;

        /* renamed from: C, reason: collision with root package name */
        public String f20231C;

        /* renamed from: D, reason: collision with root package name */
        public Bundle f20232D;

        /* renamed from: E, reason: collision with root package name */
        public int f20233E;

        /* renamed from: F, reason: collision with root package name */
        public int f20234F;

        /* renamed from: G, reason: collision with root package name */
        public Notification f20235G;

        /* renamed from: H, reason: collision with root package name */
        public RemoteViews f20236H;

        /* renamed from: I, reason: collision with root package name */
        public RemoteViews f20237I;

        /* renamed from: J, reason: collision with root package name */
        public RemoteViews f20238J;

        /* renamed from: K, reason: collision with root package name */
        public String f20239K;

        /* renamed from: L, reason: collision with root package name */
        public int f20240L;

        /* renamed from: M, reason: collision with root package name */
        public String f20241M;

        /* renamed from: N, reason: collision with root package name */
        public long f20242N;

        /* renamed from: O, reason: collision with root package name */
        public int f20243O;

        /* renamed from: P, reason: collision with root package name */
        public int f20244P;

        /* renamed from: Q, reason: collision with root package name */
        public boolean f20245Q;

        /* renamed from: R, reason: collision with root package name */
        public Notification f20246R;

        /* renamed from: S, reason: collision with root package name */
        public boolean f20247S;

        /* renamed from: T, reason: collision with root package name */
        public Object f20248T;

        /* renamed from: U, reason: collision with root package name */
        public ArrayList f20249U;

        /* renamed from: a, reason: collision with root package name */
        public Context f20250a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f20251b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f20252c;

        /* renamed from: d, reason: collision with root package name */
        public ArrayList f20253d;

        /* renamed from: e, reason: collision with root package name */
        public CharSequence f20254e;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f20255f;

        /* renamed from: g, reason: collision with root package name */
        public PendingIntent f20256g;

        /* renamed from: h, reason: collision with root package name */
        public PendingIntent f20257h;

        /* renamed from: i, reason: collision with root package name */
        public RemoteViews f20258i;

        /* renamed from: j, reason: collision with root package name */
        public Bitmap f20259j;

        /* renamed from: k, reason: collision with root package name */
        public CharSequence f20260k;

        /* renamed from: l, reason: collision with root package name */
        public int f20261l;

        /* renamed from: m, reason: collision with root package name */
        public int f20262m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f20263n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f20264o;

        /* renamed from: p, reason: collision with root package name */
        public f f20265p;

        /* renamed from: q, reason: collision with root package name */
        public CharSequence f20266q;

        /* renamed from: r, reason: collision with root package name */
        public CharSequence f20267r;

        /* renamed from: s, reason: collision with root package name */
        public CharSequence[] f20268s;

        /* renamed from: t, reason: collision with root package name */
        public int f20269t;

        /* renamed from: u, reason: collision with root package name */
        public int f20270u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f20271v;

        /* renamed from: w, reason: collision with root package name */
        public String f20272w;

        /* renamed from: x, reason: collision with root package name */
        public boolean f20273x;

        /* renamed from: y, reason: collision with root package name */
        public String f20274y;

        /* renamed from: z, reason: collision with root package name */
        public boolean f20275z;

        public static class a {
            public static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            public static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i7) {
                return builder.setContentType(i7);
            }

            public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i7) {
                return builder.setLegacyStreamType(i7);
            }

            public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i7) {
                return builder.setUsage(i7);
            }
        }

        public e(Context context) {
            this(context, null);
        }

        public static CharSequence e(CharSequence charSequence) {
            return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public e A(CharSequence charSequence) {
            this.f20246R.tickerText = e(charSequence);
            return this;
        }

        public e B(long[] jArr) {
            this.f20246R.vibrate = jArr;
            return this;
        }

        public e C(int i7) {
            this.f20234F = i7;
            return this;
        }

        public e D(long j7) {
            this.f20246R.when = j7;
            return this;
        }

        public e a(int i7, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f20251b.add(new a(i7, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f20251b.add(aVar);
            }
            return this;
        }

        public Notification c() {
            return new i(this).c();
        }

        public Bundle d() {
            if (this.f20232D == null) {
                this.f20232D = new Bundle();
            }
            return this.f20232D;
        }

        public final Bitmap f(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f20250a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(v.b.f20022b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(v.b.f20021a);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
        }

        public e g(boolean z7) {
            o(16, z7);
            return this;
        }

        public e h(String str) {
            this.f20239K = str;
            return this;
        }

        public e i(int i7) {
            this.f20233E = i7;
            return this;
        }

        public e j(PendingIntent pendingIntent) {
            this.f20256g = pendingIntent;
            return this;
        }

        public e k(CharSequence charSequence) {
            this.f20255f = e(charSequence);
            return this;
        }

        public e l(CharSequence charSequence) {
            this.f20254e = e(charSequence);
            return this;
        }

        public e m(int i7) {
            Notification notification = this.f20246R;
            notification.defaults = i7;
            if ((i7 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e n(PendingIntent pendingIntent) {
            this.f20246R.deleteIntent = pendingIntent;
            return this;
        }

        public final void o(int i7, boolean z7) {
            Notification notification;
            int i8;
            if (z7) {
                notification = this.f20246R;
                i8 = i7 | notification.flags;
            } else {
                notification = this.f20246R;
                i8 = (~i7) & notification.flags;
            }
            notification.flags = i8;
        }

        public e p(Bitmap bitmap) {
            this.f20259j = f(bitmap);
            return this;
        }

        public e q(int i7, int i8, int i9) {
            Notification notification = this.f20246R;
            notification.ledARGB = i7;
            notification.ledOnMS = i8;
            notification.ledOffMS = i9;
            notification.flags = ((i8 == 0 || i9 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e r(boolean z7) {
            this.f20275z = z7;
            return this;
        }

        public e s(int i7) {
            this.f20261l = i7;
            return this;
        }

        public e t(boolean z7) {
            o(2, z7);
            return this;
        }

        public e u(int i7) {
            this.f20262m = i7;
            return this;
        }

        public e v(boolean z7) {
            this.f20263n = z7;
            return this;
        }

        public e w(int i7) {
            this.f20246R.icon = i7;
            return this;
        }

        public e x(Uri uri) {
            Notification notification = this.f20246R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder e7 = a.e(a.c(a.b(), 4), 5);
            this.f20246R.audioAttributes = a.a(e7);
            return this;
        }

        public e y(f fVar) {
            if (this.f20265p != fVar) {
                this.f20265p = fVar;
                if (fVar != null) {
                    fVar.g(this);
                }
            }
            return this;
        }

        public e z(CharSequence charSequence) {
            this.f20266q = e(charSequence);
            return this;
        }

        public e(Context context, String str) {
            this.f20251b = new ArrayList();
            this.f20252c = new ArrayList();
            this.f20253d = new ArrayList();
            this.f20263n = true;
            this.f20275z = false;
            this.f20233E = 0;
            this.f20234F = 0;
            this.f20240L = 0;
            this.f20243O = 0;
            this.f20244P = 0;
            Notification notification = new Notification();
            this.f20246R = notification;
            this.f20250a = context;
            this.f20239K = str;
            notification.when = System.currentTimeMillis();
            this.f20246R.audioStreamType = -1;
            this.f20262m = 0;
            this.f20249U = new ArrayList();
            this.f20245Q = true;
        }
    }

    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        public e f20276a;

        /* renamed from: b, reason: collision with root package name */
        public CharSequence f20277b;

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f20278c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f20279d = false;

        public void a(Bundle bundle) {
            if (this.f20279d) {
                bundle.putCharSequence("android.summaryText", this.f20278c);
            }
            CharSequence charSequence = this.f20277b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c7 = c();
            if (c7 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c7);
            }
        }

        public abstract void b(g gVar);

        public String c() {
            return null;
        }

        public RemoteViews d(g gVar) {
            return null;
        }

        public RemoteViews e(g gVar) {
            return null;
        }

        public RemoteViews f(g gVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.f20276a != eVar) {
                this.f20276a = eVar;
                if (eVar != null) {
                    eVar.y(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }
}
