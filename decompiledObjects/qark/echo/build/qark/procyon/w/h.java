// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w;

import android.os.BaseBundle;
import android.media.AudioAttributes;
import android.media.AudioAttributes$Builder;
import android.net.Uri;
import v.b;
import java.util.ArrayList;
import android.widget.RemoteViews;
import android.app.Notification$BubbleMetadata;
import android.app.Notification$BigTextStyle;
import android.graphics.drawable.Icon;
import android.app.Notification$Builder;
import android.content.Context;
import android.app.Notification$BigPictureStyle;
import android.graphics.Bitmap;
import android.os.Build$VERSION;
import android.content.res.Resources;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import android.os.Bundle;
import android.app.Notification;

public abstract class h
{
    public static Bundle a(final Notification notification) {
        return notification.extras;
    }
    
    public static class a
    {
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
        
        public a(final int n, final CharSequence charSequence, final PendingIntent pendingIntent) {
            IconCompat e = null;
            if (n != 0) {
                e = IconCompat.e(null, "", n);
            }
            this(e, charSequence, pendingIntent);
        }
        
        public a(final IconCompat iconCompat, final CharSequence charSequence, final PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }
        
        public a(final IconCompat b, final CharSequence charSequence, final PendingIntent k, Bundle a, final l[] c, final l[] d, final boolean e, final int g, final boolean f, final boolean h, final boolean l) {
            this.f = true;
            this.b = b;
            if (b != null && b.i() == 2) {
                this.i = b.g();
            }
            this.j = e.e(charSequence);
            this.k = k;
            if (a == null) {
                a = new Bundle();
            }
            this.a = a;
            this.c = c;
            this.d = d;
            this.e = e;
            this.g = g;
            this.f = f;
            this.h = h;
            this.l = l;
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
            if (this.b == null) {
                final int i = this.i;
                if (i != 0) {
                    this.b = IconCompat.e(null, "", i);
                }
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
    
    public static class b extends f
    {
        public IconCompat e;
        public IconCompat f;
        public boolean g;
        public CharSequence h;
        public boolean i;
        
        @Override
        public void b(final g g) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            final Notification$BigPictureStyle c = a.c(a.b(g.a()), super.b);
            final IconCompat e = this.e;
            Context f = null;
            Notification$BigPictureStyle a = c;
            if (e != null) {
                if (sdk_INT >= 31) {
                    Context f2;
                    if (g instanceof i) {
                        f2 = ((i)g).f();
                    }
                    else {
                        f2 = null;
                    }
                    w.h.b.c.a(c, this.e.o(f2));
                    a = c;
                }
                else {
                    a = c;
                    if (e.i() == 1) {
                        a = w.h.b.a.a(c, this.e.f());
                    }
                }
            }
            if (this.g) {
                if (this.f == null) {
                    w.h.b.a.d(a, null);
                }
                else {
                    if (g instanceof i) {
                        f = ((i)g).f();
                    }
                    w.h.b.b.a(a, this.f.o(f));
                }
            }
            if (super.d) {
                w.h.b.a.e(a, super.c);
            }
            if (sdk_INT >= 31) {
                w.h.b.c.c(a, this.i);
                w.h.b.c.b(a, this.h);
            }
        }
        
        @Override
        public String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }
        
        public h.b h(final Bitmap bitmap) {
            IconCompat d;
            if (bitmap == null) {
                d = null;
            }
            else {
                d = IconCompat.d(bitmap);
            }
            this.f = d;
            this.g = true;
            return this;
        }
        
        public h.b i(final Bitmap bitmap) {
            IconCompat d;
            if (bitmap == null) {
                d = null;
            }
            else {
                d = IconCompat.d(bitmap);
            }
            this.e = d;
            return this;
        }
        
        public abstract static class a
        {
            public static Notification$BigPictureStyle a(final Notification$BigPictureStyle notification$BigPictureStyle, final Bitmap bitmap) {
                return notification$BigPictureStyle.bigPicture(bitmap);
            }
            
            public static Notification$BigPictureStyle b(final Notification$Builder notification$Builder) {
                return new Notification$BigPictureStyle(notification$Builder);
            }
            
            public static Notification$BigPictureStyle c(final Notification$BigPictureStyle notification$BigPictureStyle, final CharSequence bigContentTitle) {
                return notification$BigPictureStyle.setBigContentTitle(bigContentTitle);
            }
            
            public static void d(final Notification$BigPictureStyle notification$BigPictureStyle, final Bitmap bitmap) {
                notification$BigPictureStyle.bigLargeIcon(bitmap);
            }
            
            public static void e(final Notification$BigPictureStyle notification$BigPictureStyle, final CharSequence summaryText) {
                notification$BigPictureStyle.setSummaryText(summaryText);
            }
        }
        
        public abstract static class b
        {
            public static void a(final Notification$BigPictureStyle notification$BigPictureStyle, final Icon icon) {
                notification$BigPictureStyle.bigLargeIcon(icon);
            }
        }
        
        public abstract static class c
        {
            public static void a(final Notification$BigPictureStyle notification$BigPictureStyle, final Icon icon) {
                notification$BigPictureStyle.bigPicture(icon);
            }
            
            public static void b(final Notification$BigPictureStyle notification$BigPictureStyle, final CharSequence contentDescription) {
                notification$BigPictureStyle.setContentDescription(contentDescription);
            }
            
            public static void c(final Notification$BigPictureStyle notification$BigPictureStyle, final boolean b) {
                notification$BigPictureStyle.showBigPictureWhenCollapsed(b);
            }
        }
    }
    
    public static class c extends f
    {
        public CharSequence e;
        
        @Override
        public void a(final Bundle bundle) {
            super.a(bundle);
        }
        
        @Override
        public void b(final g g) {
            final Notification$BigTextStyle a = c.a.a(c.a.c(c.a.b(g.a()), super.b), this.e);
            if (super.d) {
                c.a.d(a, super.c);
            }
        }
        
        @Override
        public String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }
        
        public c h(final CharSequence charSequence) {
            this.e = h.e.e(charSequence);
            return this;
        }
        
        public abstract static class a
        {
            public static Notification$BigTextStyle a(final Notification$BigTextStyle notification$BigTextStyle, final CharSequence charSequence) {
                return notification$BigTextStyle.bigText(charSequence);
            }
            
            public static Notification$BigTextStyle b(final Notification$Builder notification$Builder) {
                return new Notification$BigTextStyle(notification$Builder);
            }
            
            public static Notification$BigTextStyle c(final Notification$BigTextStyle notification$BigTextStyle, final CharSequence bigContentTitle) {
                return notification$BigTextStyle.setBigContentTitle(bigContentTitle);
            }
            
            public static Notification$BigTextStyle d(final Notification$BigTextStyle notification$BigTextStyle, final CharSequence summaryText) {
                return notification$BigTextStyle.setSummaryText(summaryText);
            }
        }
    }
    
    public abstract static final class d
    {
        public static Notification$BubbleMetadata a(final d d) {
            return null;
        }
    }
    
    public static class e
    {
        public boolean A;
        public boolean B;
        public String C;
        public Bundle D;
        public int E;
        public int F;
        public Notification G;
        public RemoteViews H;
        public RemoteViews I;
        public RemoteViews J;
        public String K;
        public int L;
        public String M;
        public long N;
        public int O;
        public int P;
        public boolean Q;
        public Notification R;
        public boolean S;
        public Object T;
        public ArrayList U;
        public Context a;
        public ArrayList b;
        public ArrayList c;
        public ArrayList d;
        public CharSequence e;
        public CharSequence f;
        public PendingIntent g;
        public PendingIntent h;
        public RemoteViews i;
        public Bitmap j;
        public CharSequence k;
        public int l;
        public int m;
        public boolean n;
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
        public boolean z;
        
        public e(final Context context) {
            this(context, null);
        }
        
        public e(final Context a, final String k) {
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.n = true;
            this.z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.O = 0;
            this.P = 0;
            final Notification r = new Notification();
            this.R = r;
            this.a = a;
            this.K = k;
            r.when = System.currentTimeMillis();
            this.R.audioStreamType = -1;
            this.m = 0;
            this.U = new ArrayList();
            this.Q = true;
        }
        
        public static CharSequence e(final CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            CharSequence subSequence = charSequence;
            if (charSequence.length() > 5120) {
                subSequence = charSequence.subSequence(0, 5120);
            }
            return subSequence;
        }
        
        public e A(final CharSequence charSequence) {
            this.R.tickerText = e(charSequence);
            return this;
        }
        
        public e B(final long[] vibrate) {
            this.R.vibrate = vibrate;
            return this;
        }
        
        public e C(final int f) {
            this.F = f;
            return this;
        }
        
        public e D(final long when) {
            this.R.when = when;
            return this;
        }
        
        public e a(final int n, final CharSequence charSequence, final PendingIntent pendingIntent) {
            this.b.add(new h.a(n, charSequence, pendingIntent));
            return this;
        }
        
        public e b(final h.a e) {
            if (e != null) {
                this.b.add(e);
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
        
        public final Bitmap f(final Bitmap bitmap) {
            Bitmap scaledBitmap = bitmap;
            if (bitmap != null) {
                if (Build$VERSION.SDK_INT >= 27) {
                    return bitmap;
                }
                final Resources resources = this.a.getResources();
                final int dimensionPixelSize = resources.getDimensionPixelSize(v.b.b);
                final int dimensionPixelSize2 = resources.getDimensionPixelSize(v.b.a);
                if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                    return bitmap;
                }
                final double min = Math.min(dimensionPixelSize / (double)Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / (double)Math.max(1, bitmap.getHeight()));
                scaledBitmap = Bitmap.createScaledBitmap(bitmap, (int)Math.ceil(bitmap.getWidth() * min), (int)Math.ceil(bitmap.getHeight() * min), true);
            }
            return scaledBitmap;
        }
        
        public e g(final boolean b) {
            this.o(16, b);
            return this;
        }
        
        public e h(final String k) {
            this.K = k;
            return this;
        }
        
        public e i(final int e) {
            this.E = e;
            return this;
        }
        
        public e j(final PendingIntent g) {
            this.g = g;
            return this;
        }
        
        public e k(final CharSequence charSequence) {
            this.f = e(charSequence);
            return this;
        }
        
        public e l(final CharSequence charSequence) {
            this.e = e(charSequence);
            return this;
        }
        
        public e m(final int defaults) {
            final Notification r = this.R;
            r.defaults = defaults;
            if ((defaults & 0x4) != 0x0) {
                r.flags |= 0x1;
            }
            return this;
        }
        
        public e n(final PendingIntent deleteIntent) {
            this.R.deleteIntent = deleteIntent;
            return this;
        }
        
        public final void o(int flags, final boolean b) {
            Notification notification;
            if (b) {
                notification = this.R;
                flags |= notification.flags;
            }
            else {
                notification = this.R;
                flags &= notification.flags;
            }
            notification.flags = flags;
        }
        
        public e p(final Bitmap bitmap) {
            this.j = this.f(bitmap);
            return this;
        }
        
        public e q(int ledARGB, final int ledOnMS, final int ledOffMS) {
            final Notification r = this.R;
            r.ledARGB = ledARGB;
            r.ledOnMS = ledOnMS;
            r.ledOffMS = ledOffMS;
            if (ledOnMS != 0 && ledOffMS != 0) {
                ledARGB = 1;
            }
            else {
                ledARGB = 0;
            }
            r.flags = (ledARGB | (r.flags & 0xFFFFFFFE));
            return this;
        }
        
        public e r(final boolean z) {
            this.z = z;
            return this;
        }
        
        public e s(final int l) {
            this.l = l;
            return this;
        }
        
        public e t(final boolean b) {
            this.o(2, b);
            return this;
        }
        
        public e u(final int m) {
            this.m = m;
            return this;
        }
        
        public e v(final boolean n) {
            this.n = n;
            return this;
        }
        
        public e w(final int icon) {
            this.R.icon = icon;
            return this;
        }
        
        public e x(final Uri sound) {
            final Notification r = this.R;
            r.sound = sound;
            r.audioStreamType = -1;
            this.R.audioAttributes = w.h.e.a.a(w.h.e.a.e(w.h.e.a.c(w.h.e.a.b(), 4), 5));
            return this;
        }
        
        public e y(final f p) {
            if (this.p != p && (this.p = p) != null) {
                p.g(this);
            }
            return this;
        }
        
        public e z(final CharSequence charSequence) {
            this.q = e(charSequence);
            return this;
        }
        
        public abstract static class a
        {
            public static AudioAttributes a(final AudioAttributes$Builder audioAttributes$Builder) {
                return audioAttributes$Builder.build();
            }
            
            public static AudioAttributes$Builder b() {
                return new AudioAttributes$Builder();
            }
            
            public static AudioAttributes$Builder c(final AudioAttributes$Builder audioAttributes$Builder, final int contentType) {
                return audioAttributes$Builder.setContentType(contentType);
            }
            
            public static AudioAttributes$Builder d(final AudioAttributes$Builder audioAttributes$Builder, final int legacyStreamType) {
                return audioAttributes$Builder.setLegacyStreamType(legacyStreamType);
            }
            
            public static AudioAttributes$Builder e(final AudioAttributes$Builder audioAttributes$Builder, final int usage) {
                return audioAttributes$Builder.setUsage(usage);
            }
        }
    }
    
    public abstract static class f
    {
        public e a;
        public CharSequence b;
        public CharSequence c;
        public boolean d;
        
        public f() {
            this.d = false;
        }
        
        public void a(final Bundle bundle) {
            if (this.d) {
                bundle.putCharSequence("android.summaryText", this.c);
            }
            final CharSequence b = this.b;
            if (b != null) {
                bundle.putCharSequence("android.title.big", b);
            }
            final String c = this.c();
            if (c != null) {
                ((BaseBundle)bundle).putString("androidx.core.app.extra.COMPAT_TEMPLATE", c);
            }
        }
        
        public abstract void b(final g p0);
        
        public String c() {
            return null;
        }
        
        public RemoteViews d(final g g) {
            return null;
        }
        
        public RemoteViews e(final g g) {
            return null;
        }
        
        public RemoteViews f(final g g) {
            return null;
        }
        
        public void g(final e a) {
            if (this.a != a && (this.a = a) != null) {
                a.y(this);
            }
        }
    }
}
