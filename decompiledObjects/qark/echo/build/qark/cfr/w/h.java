/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Notification$BigPictureStyle
 *  android.app.Notification$BigTextStyle
 *  android.app.Notification$BubbleMetadata
 *  android.app.Notification$Builder
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.drawable.Icon
 *  android.media.AudioAttributes
 *  android.media.AudioAttributes$Builder
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.widget.RemoteViews
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 */
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
import w.g;
import w.i;
import w.l;

public abstract class h {
    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static class a {
        public final Bundle a;
        public IconCompat b;
        public final l[] c;
        public final l[] d;
        public boolean e;
        public boolean f;
        public final int g;
        public final boolean h;
        public int i;
        public CharSequence j;
        public PendingIntent k;
        public boolean l;

        public a(int n8, CharSequence charSequence, PendingIntent pendingIntent) {
            IconCompat iconCompat = null;
            if (n8 != 0) {
                iconCompat = IconCompat.e(null, "", n8);
            }
            this(iconCompat, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, l[] arrl, l[] arrl2, boolean bl, int n8, boolean bl2, boolean bl3, boolean bl4) {
            this.f = true;
            this.b = iconCompat;
            if (iconCompat != null && iconCompat.i() == 2) {
                this.i = iconCompat.g();
            }
            this.j = e.e(charSequence);
            this.k = pendingIntent;
            if (bundle == null) {
                bundle = new Bundle();
            }
            this.a = bundle;
            this.c = arrl;
            this.d = arrl2;
            this.e = bl;
            this.g = n8;
            this.f = bl2;
            this.h = bl3;
            this.l = bl4;
        }

        public PendingIntent a() {
            return this.k;
        }

        public boolean b() {
            return this.e;
        }

        public Bundle c() {
            return this.a;
        }

        public IconCompat d() {
            int n8;
            if (this.b == null && (n8 = this.i) != 0) {
                this.b = IconCompat.e(null, "", n8);
            }
            return this.b;
        }

        public l[] e() {
            return this.c;
        }

        public int f() {
            return this.g;
        }

        public boolean g() {
            return this.f;
        }

        public CharSequence h() {
            return this.j;
        }

        public boolean i() {
            return this.l;
        }

        public boolean j() {
            return this.h;
        }
    }

    public static class w.h$b
    extends f {
        public IconCompat e;
        public IconCompat f;
        public boolean g;
        public CharSequence h;
        public boolean i;

        @Override
        public void b(g g8) {
            int n8 = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle bigPictureStyle = a.c(a.b(g8.a()), this.b);
            IconCompat iconCompat = this.e;
            Context context = null;
            Notification.BigPictureStyle bigPictureStyle2 = bigPictureStyle;
            if (iconCompat != null) {
                if (n8 >= 31) {
                    bigPictureStyle2 = g8 instanceof i ? ((i)g8).f() : null;
                    c.a(bigPictureStyle, this.e.o((Context)bigPictureStyle2));
                    bigPictureStyle2 = bigPictureStyle;
                } else {
                    bigPictureStyle2 = bigPictureStyle;
                    if (iconCompat.i() == 1) {
                        bigPictureStyle2 = a.a(bigPictureStyle, this.e.f());
                    }
                }
            }
            if (this.g) {
                if (this.f == null) {
                    a.d(bigPictureStyle2, null);
                } else {
                    if (g8 instanceof i) {
                        context = ((i)g8).f();
                    }
                    b.a(bigPictureStyle2, this.f.o(context));
                }
            }
            if (this.d) {
                a.e(bigPictureStyle2, this.c);
            }
            if (n8 >= 31) {
                c.c(bigPictureStyle2, this.i);
                c.b(bigPictureStyle2, this.h);
            }
        }

        @Override
        public String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public w.h$b h(Bitmap object) {
            object = object == null ? null : IconCompat.d((Bitmap)object);
            this.f = object;
            this.g = true;
            return this;
        }

        public w.h$b i(Bitmap object) {
            object = object == null ? null : IconCompat.d((Bitmap)object);
            this.e = object;
            return this;
        }

        public static abstract class a {
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

        public static abstract class b {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        public static abstract class c {
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            public static void c(Notification.BigPictureStyle bigPictureStyle, boolean bl) {
                bigPictureStyle.showBigPictureWhenCollapsed(bl);
            }
        }

    }

    public static class c
    extends f {
        public CharSequence e;

        @Override
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override
        public void b(g g8) {
            g8 = a.a(a.c(a.b(g8.a()), this.b), this.e);
            if (this.d) {
                a.d((Notification.BigTextStyle)g8, this.c);
            }
        }

        @Override
        public String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.e = e.e(charSequence);
            return this;
        }

        public static abstract class a {
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

    }

    public static final abstract class d {
        public static Notification.BubbleMetadata a(d d8) {
            return null;
        }
    }

    public static class e {
        public boolean A;
        public boolean B;
        public String C;
        public Bundle D;
        public int E = 0;
        public int F = 0;
        public Notification G;
        public RemoteViews H;
        public RemoteViews I;
        public RemoteViews J;
        public String K;
        public int L = 0;
        public String M;
        public long N;
        public int O = 0;
        public int P = 0;
        public boolean Q;
        public Notification R;
        public boolean S;
        public Object T;
        public ArrayList U;
        public Context a;
        public ArrayList b = new ArrayList();
        public ArrayList c = new ArrayList();
        public ArrayList d = new ArrayList();
        public CharSequence e;
        public CharSequence f;
        public PendingIntent g;
        public PendingIntent h;
        public RemoteViews i;
        public Bitmap j;
        public CharSequence k;
        public int l;
        public int m;
        public boolean n = true;
        public boolean o;
        public f p;
        public CharSequence q;
        public CharSequence r;
        public CharSequence[] s;
        public int t;
        public int u;
        public boolean v;
        public String w;
        public boolean x;
        public String y;
        public boolean z = false;

        public e(Context context) {
            this(context, null);
        }

        public e(Context context, String string2) {
            Notification notification;
            this.R = notification = new Notification();
            this.a = context;
            this.K = string2;
            notification.when = System.currentTimeMillis();
            this.R.audioStreamType = -1;
            this.m = 0;
            this.U = new ArrayList();
            this.Q = true;
        }

        public static CharSequence e(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            CharSequence charSequence2 = charSequence;
            if (charSequence.length() > 5120) {
                charSequence2 = charSequence.subSequence(0, 5120);
            }
            return charSequence2;
        }

        public e A(CharSequence charSequence) {
            this.R.tickerText = e.e(charSequence);
            return this;
        }

        public e B(long[] arrl) {
            this.R.vibrate = arrl;
            return this;
        }

        public e C(int n8) {
            this.F = n8;
            return this;
        }

        public e D(long l8) {
            this.R.when = l8;
            return this;
        }

        public e a(int n8, CharSequence charSequence, PendingIntent pendingIntent) {
            this.b.add((Object)new w.h$a(n8, charSequence, pendingIntent));
            return this;
        }

        public e b(w.h$a a8) {
            if (a8 != null) {
                this.b.add((Object)a8);
            }
            return this;
        }

        public Notification c() {
            return new i(this).c();
        }

        public Bundle d() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public final Bitmap f(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            if (bitmap != null) {
                if (Build.VERSION.SDK_INT >= 27) {
                    return bitmap;
                }
                bitmap2 = this.a.getResources();
                int n8 = bitmap2.getDimensionPixelSize(v.b.b);
                int n9 = bitmap2.getDimensionPixelSize(v.b.a);
                if (bitmap.getWidth() <= n8 && bitmap.getHeight() <= n9) {
                    return bitmap;
                }
                double d8 = Math.min((double)((double)n8 / (double)Math.max((int)1, (int)bitmap.getWidth())), (double)((double)n9 / (double)Math.max((int)1, (int)bitmap.getHeight())));
                bitmap2 = Bitmap.createScaledBitmap((Bitmap)bitmap, (int)((int)Math.ceil((double)((double)bitmap.getWidth() * d8))), (int)((int)Math.ceil((double)((double)bitmap.getHeight() * d8))), (boolean)true);
            }
            return bitmap2;
        }

        public e g(boolean bl) {
            this.o(16, bl);
            return this;
        }

        public e h(String string2) {
            this.K = string2;
            return this;
        }

        public e i(int n8) {
            this.E = n8;
            return this;
        }

        public e j(PendingIntent pendingIntent) {
            this.g = pendingIntent;
            return this;
        }

        public e k(CharSequence charSequence) {
            this.f = e.e(charSequence);
            return this;
        }

        public e l(CharSequence charSequence) {
            this.e = e.e(charSequence);
            return this;
        }

        public e m(int n8) {
            Notification notification = this.R;
            notification.defaults = n8;
            if ((n8 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e n(PendingIntent pendingIntent) {
            this.R.deleteIntent = pendingIntent;
            return this;
        }

        /*
         * Enabled aggressive block sorting
         */
        public final void o(int n8, boolean bl) {
            Notification notification;
            if (bl) {
                notification = this.R;
                n8 |= notification.flags;
            } else {
                notification = this.R;
                n8 &= notification.flags;
            }
            notification.flags = n8;
        }

        public e p(Bitmap bitmap) {
            this.j = this.f(bitmap);
            return this;
        }

        public e q(int n8, int n9, int n10) {
            Notification notification = this.R;
            notification.ledARGB = n8;
            notification.ledOnMS = n9;
            notification.ledOffMS = n10;
            n8 = n9 != 0 && n10 != 0 ? 1 : 0;
            notification.flags = n8 | notification.flags & -2;
            return this;
        }

        public e r(boolean bl) {
            this.z = bl;
            return this;
        }

        public e s(int n8) {
            this.l = n8;
            return this;
        }

        public e t(boolean bl) {
            this.o(2, bl);
            return this;
        }

        public e u(int n8) {
            this.m = n8;
            return this;
        }

        public e v(boolean bl) {
            this.n = bl;
            return this;
        }

        public e w(int n8) {
            this.R.icon = n8;
            return this;
        }

        public e x(Uri uri) {
            Notification notification = this.R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            uri = a.e(a.c(a.b(), 4), 5);
            this.R.audioAttributes = a.a((AudioAttributes.Builder)uri);
            return this;
        }

        public e y(f f8) {
            if (this.p != f8) {
                this.p = f8;
                if (f8 != null) {
                    f8.g(this);
                }
            }
            return this;
        }

        public e z(CharSequence charSequence) {
            this.q = e.e(charSequence);
            return this;
        }

        public static abstract class a {
            public static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            public static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int n8) {
                return builder.setContentType(n8);
            }

            public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int n8) {
                return builder.setLegacyStreamType(n8);
            }

            public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int n8) {
                return builder.setUsage(n8);
            }
        }

    }

    public static abstract class f {
        public e a;
        public CharSequence b;
        public CharSequence c;
        public boolean d = false;

        public void a(Bundle bundle) {
            CharSequence charSequence;
            if (this.d) {
                bundle.putCharSequence("android.summaryText", this.c);
            }
            if ((charSequence = this.b) != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            if ((charSequence = this.c()) != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", (String)charSequence);
            }
        }

        public abstract void b(g var1);

        public String c() {
            return null;
        }

        public RemoteViews d(g g8) {
            return null;
        }

        public RemoteViews e(g g8) {
            return null;
        }

        public RemoteViews f(g g8) {
            return null;
        }

        public void g(e e8) {
            if (this.a != e8) {
                this.a = e8;
                if (e8 != null) {
                    e8.y(this);
                }
            }
        }
    }

}

