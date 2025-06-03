// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.ryanheise.audioservice;

import android.os.BaseBundle;
import l5.q;
import android.support.v4.media.MediaDescriptionCompat;
import android.app.Notification;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.os.PowerManager;
import java.util.Arrays;
import l5.g;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import java.io.FileDescriptor;
import android.content.ContentResolver;
import java.io.IOException;
import java.io.FileNotFoundException;
import android.graphics.Rect;
import android.graphics.BitmapFactory;
import android.os.CancellationSignal;
import android.util.Size;
import android.net.Uri;
import java.util.Iterator;
import android.support.v4.media.RatingCompat;
import l5.p;
import android.os.Build$VERSION;
import l5.r;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import x2.f;
import x2.i;
import l5.c;
import x2.e;
import android.content.Context;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v4.media.session.PlaybackStateCompat;
import android.graphics.BitmapFactory$Options;
import android.os.Looper;
import java.util.HashMap;
import java.util.ArrayList;
import android.os.PowerManager$WakeLock;
import l5.h;
import a0.o;
import android.os.Handler;
import l5.a;
import android.util.LruCache;
import android.graphics.Bitmap;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.Map;
import java.util.List;
import android.app.PendingIntent;
import a0.d;

public class AudioService extends a0.d
{
    public static AudioService R;
    public static PendingIntent S;
    public static e T;
    public static List U;
    public static final Map V;
    public MediaSessionCompat A;
    public d B;
    public List C;
    public List D;
    public List E;
    public int[] F;
    public MediaMetadataCompat G;
    public Bitmap H;
    public String I;
    public LruCache J;
    public boolean K;
    public a L;
    public int M;
    public int N;
    public boolean O;
    public final Handler P;
    public a0.o Q;
    public io.flutter.embedding.engine.a x;
    public l5.h y;
    public PowerManager$WakeLock z;
    
    static {
        AudioService.U = new ArrayList();
        V = new HashMap();
    }
    
    public AudioService() {
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.K = false;
        this.L = a.o;
        this.P = new Handler(Looper.getMainLooper());
    }
    
    public static int A(final BitmapFactory$Options bitmapFactory$Options, final int n, final int n2) {
        final int outHeight = bitmapFactory$Options.outHeight;
        final int outWidth = bitmapFactory$Options.outWidth;
        int n3 = 1;
        int n4 = 1;
        if (outHeight > n2 || outWidth > n) {
            final int n5 = outHeight / 2;
            final int n6 = outWidth / 2;
            while (true) {
                n3 = n4;
                if (n5 / n4 < n2) {
                    break;
                }
                n3 = n4;
                if (n6 / n4 < n) {
                    break;
                }
                n4 *= 2;
            }
        }
        return n3;
    }
    
    public static MediaMetadataCompat K(final String s) {
        return AudioService.V.get(s);
    }
    
    public static void Q(final e t) {
        AudioService.T = t;
    }
    
    public static int d0(final long n) {
        if (n == 4L) {
            return 91;
        }
        if (n == 2L) {
            return 130;
        }
        return PlaybackStateCompat.h(n);
    }
    
    public static /* synthetic */ e u() {
        return AudioService.T;
    }
    
    public static /* synthetic */ MediaSessionCompat v(final AudioService audioService) {
        return audioService.A;
    }
    
    public void B(final l5.h y) {
        this.y = y;
        String i = y.c;
        if (i == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(((Context)this.getApplication()).getPackageName());
            sb.append(".channel");
            i = sb.toString();
        }
        this.I = i;
        if (y.n != null) {
            final Context applicationContext = ((Context)this).getApplicationContext();
            final Intent intent = new Intent((String)null);
            intent.setComponent(new ComponentName(applicationContext, y.n));
            intent.setAction("com.ryanheise.audioservice.NOTIFICATION_CLICK");
            AudioService.S = PendingIntent.getActivity(applicationContext, 1000, intent, 201326592);
        }
        else {
            AudioService.S = null;
        }
        if (!y.b) {
            this.A.l(null);
        }
    }
    
    public w.h.a C(final String s, final String s2, final long n) {
        return new w.h.a(this.O(s), s2, this.y(n));
    }
    
    public final void D() {
        final NotificationManager m = this.M();
        if (x2.e.a(m, this.I) == null) {
            c.a();
            final NotificationChannel a = x2.i.a(this.I, this.y.d, 2);
            l5.d.a(a, this.y.h);
            final String e = this.y.e;
            if (e != null) {
                l5.e.a(a, e);
            }
            x2.f.a(m, a);
        }
    }
    
    public PlaybackStateCompat.CustomAction E(final r r) {
        final int o = this.O(r.a);
        final l5.p d = r.d;
        if (d != null) {
            return new PlaybackStateCompat.CustomAction.b(d.a, r.b, o).b(this.U(r.d.b)).a();
        }
        if (Build$VERSION.SDK_INT >= 33) {
            final long c = r.c;
            if (c == 1L) {
                return new PlaybackStateCompat.CustomAction.b("com.ryanheise.audioservice.action.STOP", r.b, o).a();
            }
            if (c == 64L) {
                return new PlaybackStateCompat.CustomAction.b("com.ryanheise.audioservice.action.FAST_FORWARD", r.b, o).a();
            }
            if (c == 8L) {
                return new PlaybackStateCompat.CustomAction.b("com.ryanheise.audioservice.action.REWIND", r.b, o).a();
            }
        }
        return null;
    }
    
    public MediaMetadataCompat F(final String s, String string, final String s2, String s3, final String s4, final Long n, final String s5, final Boolean b, final String s6, final String s7, final String s8, final RatingCompat ratingCompat, final Map map) {
        final MediaMetadataCompat.b e = new MediaMetadataCompat.b().e("android.media.metadata.MEDIA_ID", s).e("android.media.metadata.TITLE", string);
        if (s2 != null) {
            e.e("android.media.metadata.ALBUM", s2);
        }
        if (s3 != null) {
            e.e("android.media.metadata.ARTIST", s3);
        }
        if (s4 != null) {
            e.e("android.media.metadata.GENRE", s4);
        }
        if (n != null) {
            e.c("android.media.metadata.DURATION", n);
        }
        if (s5 != null) {
            e.e("android.media.metadata.DISPLAY_ICON_URI", s5);
        }
        if (b != null) {
            long n2;
            if (b) {
                n2 = 1L;
            }
            else {
                n2 = 0L;
            }
            e.c("playable_long", n2);
        }
        if (s6 != null) {
            e.e("android.media.metadata.DISPLAY_TITLE", s6);
        }
        if (s7 != null) {
            e.e("android.media.metadata.DISPLAY_SUBTITLE", s7);
        }
        if (s8 != null) {
            e.e("android.media.metadata.DISPLAY_DESCRIPTION", s8);
        }
        if (ratingCompat != null) {
            e.d("android.media.metadata.RATING", ratingCompat);
        }
        if (map != null) {
            final Iterator<String> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                s3 = iterator.next();
                final V value = map.get(s3);
                long longValue = 0L;
                Label_0265: {
                    if (value instanceof Long) {
                        longValue = (long)value;
                    }
                    else {
                        if (!(value instanceof Integer)) {
                            if (value instanceof String) {
                                string = (String)value;
                            }
                            else if (value instanceof Boolean) {
                                if (value) {
                                    longValue = 1L;
                                    break Label_0265;
                                }
                                longValue = 0L;
                                break Label_0265;
                            }
                            else {
                                if (!(value instanceof Double)) {
                                    continue;
                                }
                                string = value.toString();
                            }
                            e.e(s3, string);
                            continue;
                        }
                        longValue = (int)value;
                    }
                }
                e.c(s3, longValue);
            }
        }
        final MediaMetadataCompat a = e.a();
        AudioService.V.put(s, a);
        return a;
    }
    
    public final void G() {
        if (this.A.e()) {
            this.A.g(false);
        }
        this.M().cancel(1124);
    }
    
    public final void H() {
        x.a.k((Context)this, new Intent((Context)this, (Class)AudioService.class));
        if (!this.A.e()) {
            this.A.g(true);
        }
        this.w();
        this.A.s(AudioService.S);
        this.R();
    }
    
    public final void I() {
        this.S(false);
        this.X();
    }
    
    public final void J() {
        if (this.y.k) {
            this.I();
        }
    }
    
    public final w.h.e L() {
        if (Build$VERSION.SDK_INT >= 26) {
            this.D();
        }
        final w.h.e n = new w.h.e((Context)this, this.I).C(1).v(false).n(this.x());
        n.w(this.O(this.y.g));
        return n;
    }
    
    public final NotificationManager M() {
        return (NotificationManager)((Context)this).getSystemService("notification");
    }
    
    public int N() {
        final int n = AudioService$c.a[this.L.ordinal()];
        int n2 = 2;
        if (n == 2) {
            return 8;
        }
        if (n == 3) {
            return 6;
        }
        if (n == 4) {
            if (this.K) {
                n2 = 3;
            }
            return n2;
        }
        if (n == 5) {
            if (this.K) {
                n2 = 3;
            }
            return n2;
        }
        if (n != 6) {
            return 0;
        }
        return 7;
    }
    
    public int O(String s) {
        final String[] split = s.split("/");
        s = split[0];
        return ((Context)this).getResources().getIdentifier(split[1], s, ((Context)this).getApplicationContext().getPackageName());
    }
    
    public void P() {
        final e t = AudioService.T;
        if (t == null) {
            return;
        }
        t.b();
    }
    
    public final void R() {
        this.startForeground(1124, this.z());
        this.O = true;
    }
    
    public final void S(final boolean b) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:668)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public Bitmap T(final String s, final String s2) {
        final Bitmap bitmap = (Bitmap)this.J.get((Object)s);
        if (bitmap != null) {
            return bitmap;
        }
        while (true) {
            while (true) {
                Label_0367: {
                    while (true) {
                        try {
                            final Uri parse = Uri.parse(s);
                            final boolean equals = "content".equals(parse.getScheme());
                            Bitmap a = bitmap;
                            Label_0195: {
                                if (!equals) {
                                    break Label_0195;
                                }
                                Label_0160: {
                                    if (s2 == null) {
                                        break Label_0160;
                                    }
                                    try {
                                        FileDescriptor fileDescriptor;
                                        Bitmap bitmap2;
                                        if (Build$VERSION.SDK_INT >= 29) {
                                            final Size size = new Size(192, 192);
                                            final ContentResolver contentResolver = ((Context)this).getContentResolver();
                                            int n;
                                            if ((n = this.y.l) == -1) {
                                                n = size.getWidth();
                                            }
                                            int n2;
                                            if ((n2 = this.y.m) == -1) {
                                                n2 = size.getHeight();
                                            }
                                            if ((a = l5.f.a(contentResolver, parse, new Size(n, n2), (CancellationSignal)null)) == null) {
                                                return null;
                                            }
                                            fileDescriptor = null;
                                            bitmap2 = a;
                                        }
                                        else {
                                            final ParcelFileDescriptor openFileDescriptor = ((Context)this).getContentResolver().openFileDescriptor(parse, "r");
                                            if (openFileDescriptor == null) {
                                                return null;
                                            }
                                            final FileDescriptor fileDescriptor2 = openFileDescriptor.getFileDescriptor();
                                            bitmap2 = bitmap;
                                            fileDescriptor = fileDescriptor2;
                                        }
                                        if (!equals || fileDescriptor != null) {
                                            if (this.y.l != -1) {
                                                final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
                                                bitmapFactory$Options.inJustDecodeBounds = true;
                                                if (fileDescriptor != null) {
                                                    BitmapFactory.decodeFileDescriptor(fileDescriptor, (Rect)null, bitmapFactory$Options);
                                                }
                                                else {
                                                    BitmapFactory.decodeFile(parse.getPath(), bitmapFactory$Options);
                                                }
                                                final l5.h y = this.y;
                                                bitmapFactory$Options.inSampleSize = A(bitmapFactory$Options, y.l, y.m);
                                                bitmapFactory$Options.inJustDecodeBounds = false;
                                                if (fileDescriptor != null) {
                                                    bitmap2 = BitmapFactory.decodeFileDescriptor(fileDescriptor, (Rect)null, bitmapFactory$Options);
                                                    break Label_0367;
                                                }
                                                bitmap2 = BitmapFactory.decodeFile(parse.getPath(), bitmapFactory$Options);
                                                break Label_0367;
                                            }
                                            else if (fileDescriptor != null) {
                                                bitmap2 = BitmapFactory.decodeFileDescriptor(fileDescriptor);
                                            }
                                            else {
                                                bitmap2 = BitmapFactory.decodeFile(parse.getPath());
                                            }
                                        }
                                        this.J.put((Object)s, (Object)bitmap2);
                                        return bitmap2;
                                        final Exception ex;
                                        ex.printStackTrace();
                                        return null;
                                    }
                                    catch (FileNotFoundException | IOException ex3) {
                                        return null;
                                    }
                                }
                            }
                        }
                        catch (Exception ex2) {}
                        final Exception ex2;
                        final Exception ex = ex2;
                        continue;
                    }
                }
                continue;
            }
        }
    }
    
    public final Bundle U(final Map map) {
        if (map == null) {
            return null;
        }
        final Bundle bundle = new Bundle();
        for (final Map.Entry<Object, V> entry : map.entrySet()) {
            final String string = entry.getKey().toString();
            final V value = entry.getValue();
            if (value instanceof Integer) {
                ((BaseBundle)bundle).putInt(string, (int)value);
            }
            else if (value instanceof Long) {
                ((BaseBundle)bundle).putLong(string, (long)value);
            }
            else {
                ((BaseBundle)bundle).putString(string, value.toString());
            }
        }
        return bundle;
    }
    
    public final MediaMetadataCompat V(final MediaMetadataCompat mediaMetadataCompat) {
        return new MediaMetadataCompat.b(mediaMetadataCompat).b("android.media.metadata.ALBUM_ART", this.H).b("android.media.metadata.DISPLAY_ICON", this.H).a();
    }
    
    public final void W() {
        if (this.A == null) {
            return;
        }
        this.G();
        this.A.f();
        this.A = null;
    }
    
    public final void X() {
        if (this.z.isHeld()) {
            this.z.release();
        }
    }
    
    public void Y(MediaMetadataCompat v) {
        // monitorenter(this)
        while (true) {
            try {
                final String i = v.i("artCacheFile");
                Label_0079: {
                    if (i != null) {
                        this.H = this.T(i, null);
                    }
                    else {
                        final String j = v.i("android.media.metadata.DISPLAY_ICON_URI");
                        if (j == null || !j.startsWith("content:")) {
                            this.H = null;
                            break Label_0079;
                        }
                        this.H = this.T(j, v.i("loadThumbnailUri"));
                    }
                    v = this.V(v);
                }
                this.G = v;
                this.A.m(v);
                this.P.removeCallbacksAndMessages((Object)null);
                this.P.post((Runnable)new l5.g(this));
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void Z(final int n, final Integer n2, final Integer n3, final Integer n4) {
        if (n == 1) {
            this.A.o(3);
            this.Q = null;
            return;
        }
        if (n == 2) {
            if (this.Q != null && n2 == this.Q.b() && n3 == this.Q.a()) {
                this.Q.f(n4);
            }
            else {
                this.Q = new a0.o((int)n2, (int)n3, (int)n4) {
                    @Override
                    public void d(final int n) {
                        if (AudioService.u() == null) {
                            return;
                        }
                        AudioService.u().H(n);
                    }
                    
                    @Override
                    public void e(final int n) {
                        if (AudioService.u() == null) {
                            return;
                        }
                        AudioService.u().x(n);
                    }
                };
            }
            this.A.p(this.Q);
        }
    }
    
    public void a0(final List u) {
        synchronized (this) {
            AudioService.U = u;
            this.A.q(u);
        }
    }
    
    public void b0(final List c, final long n, final int[] array, final a l, final boolean k, final long n2, final long n3, final float n4, final long n5, final Integer n6, final String s, final int m, final int n7, final boolean b, final Long n8) {
        final boolean equals = Arrays.equals(array, this.F);
        boolean b2 = true;
        if (c.equals(this.C)) {
            b2 = (equals ^ true);
        }
        this.C = c;
        this.D.clear();
        this.E.clear();
        for (final r r : c) {
            final PlaybackStateCompat.CustomAction e = this.E(r);
            if (e != null) {
                this.E.add(e);
            }
            else {
                this.D.add(this.C(r.a, r.b, r.c));
            }
        }
        this.F = array;
        final boolean i = this.K;
        final a j = this.L;
        this.L = l;
        this.K = k;
        this.M = m;
        this.N = n7;
        final PlaybackStateCompat.d e2 = new PlaybackStateCompat.d().c(n | 0x37FECFL).h(this.N(), n2, n4, n5).e(n3);
        final Iterator<PlaybackStateCompat.CustomAction> iterator2 = (Iterator<PlaybackStateCompat.CustomAction>)this.E.iterator();
        while (iterator2.hasNext()) {
            e2.a(iterator2.next());
        }
        if (n8 != null) {
            e2.d(n8);
        }
        Label_0321: {
            int intValue;
            if (n6 != null && s != null) {
                intValue = n6;
            }
            else {
                if (s == null) {
                    break Label_0321;
                }
                intValue = -987654;
            }
            e2.f(intValue, s);
        }
        if (this.G != null) {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", this.G.e().g());
            e2.g(bundle);
        }
        this.A.n(e2.b());
        this.A.r(m);
        this.A.t(n7);
        this.A.j(b);
        if (!i && k) {
            this.H();
        }
        else if (i && !k) {
            this.J();
        }
        final a o = a.o;
        if (j != o && l == o) {
            this.c0();
            return;
        }
        if (l != o && b2) {
            this.e0();
        }
    }
    
    public void c0() {
        this.G();
        this.stopSelf();
    }
    
    public final void e0() {
        if (this.O) {
            this.M().notify(1124, this.z());
        }
    }
    
    @Override
    public a0.d.e g(String s, final int n, final Bundle bundle) {
        Boolean value;
        if (bundle == null) {
            value = null;
        }
        else {
            value = ((BaseBundle)bundle).getBoolean("android.service.media.extra.RECENT");
        }
        Boolean false = value;
        if (value == null) {
            false = Boolean.FALSE;
        }
        final Bundle a = this.y.a();
        if (false) {
            s = "recent";
        }
        else {
            s = "root";
        }
        return new a0.d.e(s, a);
    }
    
    @Override
    public void h(final String s, final l l) {
        this.i(s, l, null);
    }
    
    @Override
    public void i(final String s, final l l, final Bundle bundle) {
        final e t = AudioService.T;
        if (t == null) {
            l.g(new ArrayList());
            return;
        }
        t.s(s, l, bundle);
    }
    
    @Override
    public void j(final String s, final l l) {
        final e t = AudioService.T;
        if (t == null) {
            l.g(null);
            return;
        }
        t.m(s, l);
    }
    
    @Override
    public void k(final String s, final Bundle bundle, final l l) {
        final e t = AudioService.T;
        if (t == null) {
            l.g(new ArrayList());
            return;
        }
        t.i(s, bundle, l);
    }
    
    @Override
    public void onCreate() {
        super.onCreate();
        AudioService.R = this;
        this.M = 0;
        this.N = 0;
        this.O = false;
        this.K = false;
        this.L = a.o;
        this.A = new MediaSessionCompat((Context)this, "media-session");
        this.B(new l5.h(((Context)this).getApplicationContext()));
        this.A.k(4);
        this.A.n(new PlaybackStateCompat.d().c(3669711L).b());
        this.A.h((MediaSessionCompat.b)(this.B = new d()));
        this.s(this.A.c());
        this.A.q(AudioService.U);
        this.z = ((PowerManager)((Context)this).getSystemService("power")).newWakeLock(1, AudioService.class.getName());
        this.J = new LruCache((int)(Runtime.getRuntime().maxMemory() / 1024L) / 8) {
            public int a(final String s, final Bitmap bitmap) {
                return bitmap.getByteCount() / 1024;
            }
        };
        this.x = com.ryanheise.audioservice.a.B((Context)this);
        System.out.println("flutterEngine warmed up");
    }
    
    @Override
    public void onDestroy() {
        super.onDestroy();
        final e t = AudioService.T;
        if (t != null) {
            t.D();
            AudioService.T = null;
        }
        this.G = null;
        this.H = null;
        AudioService.U.clear();
        AudioService.V.clear();
        this.C.clear();
        this.J.evictAll();
        this.F = null;
        this.W();
        this.S(this.y.b ^ true);
        this.X();
        AudioService.R = null;
        this.O = false;
    }
    
    public int onStartCommand(final Intent intent, final int n, final int n2) {
        c0.d.c(this.A, intent);
        return 2;
    }
    
    public void onTaskRemoved(final Intent intent) {
        final e t = AudioService.T;
        if (t != null) {
            t.y();
        }
        super.onTaskRemoved(intent);
    }
    
    public final void w() {
        if (!this.z.isHeld()) {
            this.z.acquire();
        }
    }
    
    public PendingIntent x() {
        final Intent intent = new Intent((Context)this, (Class)MediaButtonReceiver.class);
        intent.setAction("com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE");
        return PendingIntent.getBroadcast((Context)this, 0, intent, 67108864);
    }
    
    public PendingIntent y(final long n) {
        final int d0 = d0(n);
        if (d0 == 0) {
            return null;
        }
        final Intent intent = new Intent((Context)this, (Class)MediaButtonReceiver.class);
        intent.setAction("android.intent.action.MEDIA_BUTTON");
        intent.putExtra("android.intent.extra.KEY_EVENT", (Parcelable)new KeyEvent(0, d0));
        return PendingIntent.getBroadcast((Context)this, d0, intent, 67108864);
    }
    
    public final Notification z() {
        int[] f;
        if ((f = this.F) == null) {
            final int min = Math.min(3, this.D.size());
            f = new int[min];
            for (int i = 0; i < min; ++i) {
                f[i] = i;
            }
        }
        final w.h.e l = this.L();
        final MediaMetadataCompat g = this.G;
        // monitorenter(this)
        while (true) {
            Label_0164: {
                if (g == null) {
                    break Label_0164;
                }
                final MediaDescriptionCompat e = g.e();
                if (e.j() != null) {
                    l.l(e.j());
                }
                if (e.i() != null) {
                    l.k(e.i());
                }
                if (e.b() != null) {
                    l.z(e.b());
                }
                try {
                    final Bitmap h = this.H;
                    if (h != null) {
                        l.p(h);
                    }
                    // monitorexit(this)
                    if (this.y.i) {
                        l.j(this.A.b().b());
                    }
                    final int f2 = this.y.f;
                    if (f2 != -1) {
                        l.i(f2);
                    }
                    final Iterator<w.h.a> iterator = this.D.iterator();
                    while (iterator.hasNext()) {
                        l.b(iterator.next());
                    }
                    final b0.c j = new b0.c().i(this.A.c());
                    if (Build$VERSION.SDK_INT < 33) {
                        j.j(f);
                    }
                    if (this.y.j) {
                        j.k(true);
                        j.h(this.y(1L));
                        l.t(true);
                    }
                    l.y(j);
                    return l.c();
                }
                // monitorexit(this)
                finally {}
            }
            continue;
        }
    }
    
    public class d extends MediaSessionCompat.b
    {
        @Override
        public void A() {
            if (AudioService.u() == null) {
                return;
            }
            AudioService.u().k();
        }
        
        @Override
        public void B(final long n) {
            if (AudioService.u() == null) {
                return;
            }
            AudioService.u().G(n);
        }
        
        @Override
        public void C() {
            if (AudioService.u() == null) {
                return;
            }
            AudioService.u().g();
        }
        
        public final l5.q E(final KeyEvent keyEvent) {
            final int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                return l5.q.o;
            }
            if (keyCode == 87) {
                return l5.q.p;
            }
            if (keyCode != 88) {
                return l5.q.o;
            }
            return l5.q.q;
        }
        
        @Override
        public void b(final MediaDescriptionCompat mediaDescriptionCompat) {
            if (AudioService.u() == null) {
                return;
            }
            AudioService.u().C(AudioService.K(mediaDescriptionCompat.g()));
        }
        
        @Override
        public void c(final MediaDescriptionCompat mediaDescriptionCompat, final int n) {
            if (AudioService.u() == null) {
                return;
            }
            AudioService.u().v(AudioService.K(mediaDescriptionCompat.g()), n);
        }
        
        @Override
        public void e(final String anObject, final Bundle bundle) {
            if (AudioService.u() == null) {
                return;
            }
            if ("com.ryanheise.audioservice.action.STOP".equals(anObject)) {
                AudioService.u().g();
                return;
            }
            if ("com.ryanheise.audioservice.action.FAST_FORWARD".equals(anObject)) {
                AudioService.u().A();
                return;
            }
            if ("com.ryanheise.audioservice.action.REWIND".equals(anObject)) {
                AudioService.u().r();
                return;
            }
            AudioService.u().E(anObject, bundle);
        }
        
        @Override
        public void f() {
            if (AudioService.u() == null) {
                return;
            }
            AudioService.u().A();
        }
        
        @Override
        public boolean g(final Intent intent) {
            if (AudioService.u() == null) {
                return false;
            }
            final KeyEvent keyEvent = (KeyEvent)intent.getExtras().getParcelable("android.intent.extra.KEY_EVENT");
            if (keyEvent.getAction() == 0) {
                final int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79) {
                    if (keyCode == 130) {
                        this.h();
                        return true;
                    }
                    if (keyCode != 126 && keyCode != 127) {
                        switch (keyCode) {
                            default: {
                                return true;
                            }
                            case 91: {
                                this.i();
                                return true;
                            }
                            case 90: {
                                this.f();
                                return true;
                            }
                            case 89: {
                                this.r();
                                return true;
                            }
                            case 86: {
                                this.C();
                                return true;
                            }
                            case 85:
                            case 87:
                            case 88: {
                                break;
                            }
                        }
                    }
                }
                AudioService.u().j(this.E(keyEvent));
            }
            return true;
        }
        
        @Override
        public void h() {
            if (AudioService.u() == null) {
                return;
            }
            AudioService.u().w();
        }
        
        @Override
        public void i() {
            if (AudioService.u() == null) {
                return;
            }
            AudioService.u().e();
        }
        
        @Override
        public void j(final String s, final Bundle bundle) {
            if (AudioService.u() == null) {
                return;
            }
            AudioService.u().z(s, bundle);
        }
        
        @Override
        public void k(final String s, final Bundle bundle) {
            if (AudioService.u() == null) {
                return;
            }
            AudioService.u().u(s, bundle);
        }
        
        @Override
        public void l(final Uri uri, final Bundle bundle) {
            if (AudioService.u() == null) {
                return;
            }
            AudioService.u().I(uri, bundle);
        }
        
        @Override
        public void m() {
            if (AudioService.u() == null) {
                return;
            }
            if (!AudioService.v(AudioService.this).e()) {
                AudioService.v(AudioService.this).g(true);
            }
            AudioService.u().p();
        }
        
        @Override
        public void n(final String s, final Bundle bundle) {
            if (AudioService.u() == null) {
                return;
            }
            if (!AudioService.v(AudioService.this).e()) {
                AudioService.v(AudioService.this).g(true);
            }
            AudioService.u().h(s, bundle);
        }
        
        @Override
        public void o(final String s, final Bundle bundle) {
            if (AudioService.u() == null) {
                return;
            }
            if (!AudioService.v(AudioService.this).e()) {
                AudioService.v(AudioService.this).g(true);
            }
            AudioService.u().F(s, bundle);
        }
        
        @Override
        public void p(final Uri uri, final Bundle bundle) {
            if (AudioService.u() == null) {
                return;
            }
            if (!AudioService.v(AudioService.this).e()) {
                AudioService.v(AudioService.this).g(true);
            }
            AudioService.u().q(uri, bundle);
        }
        
        @Override
        public void q(final MediaDescriptionCompat mediaDescriptionCompat) {
            if (AudioService.u() == null) {
                return;
            }
            AudioService.u().n(AudioService.K(mediaDescriptionCompat.g()));
        }
        
        @Override
        public void r() {
            if (AudioService.u() == null) {
                return;
            }
            AudioService.u().r();
        }
        
        @Override
        public void s(final long n) {
            if (AudioService.u() == null) {
                return;
            }
            AudioService.u().B(n);
        }
        
        @Override
        public void t(final boolean b) {
            if (AudioService.u() == null) {
                return;
            }
            AudioService.u().f(b);
        }
        
        @Override
        public void u(final float n) {
            if (AudioService.u() == null) {
                return;
            }
            AudioService.u().o(n);
        }
        
        @Override
        public void v(final RatingCompat ratingCompat) {
            if (AudioService.u() == null) {
                return;
            }
            AudioService.u().t(ratingCompat);
        }
        
        @Override
        public void w(final RatingCompat ratingCompat, final Bundle bundle) {
            if (AudioService.u() == null) {
                return;
            }
            AudioService.u().J(ratingCompat, bundle);
        }
        
        @Override
        public void x(final int n) {
            if (AudioService.u() == null) {
                return;
            }
            AudioService.u().c(n);
        }
        
        @Override
        public void y(final int n) {
            if (AudioService.u() == null) {
                return;
            }
            AudioService.u().d(n);
        }
        
        @Override
        public void z() {
            if (AudioService.u() == null) {
                return;
            }
            AudioService.u().l();
        }
    }
    
    public interface e
    {
        void A();
        
        void B(final long p0);
        
        void C(final MediaMetadataCompat p0);
        
        void D();
        
        void E(final String p0, final Bundle p1);
        
        void F(final String p0, final Bundle p1);
        
        void G(final long p0);
        
        void H(final int p0);
        
        void I(final Uri p0, final Bundle p1);
        
        void J(final RatingCompat p0, final Bundle p1);
        
        void b();
        
        void c(final int p0);
        
        void d(final int p0);
        
        void e();
        
        void f(final boolean p0);
        
        void g();
        
        void h(final String p0, final Bundle p1);
        
        void i(final String p0, final Bundle p1, final l p2);
        
        void j(final l5.q p0);
        
        void k();
        
        void l();
        
        void m(final String p0, final l p1);
        
        void n(final MediaMetadataCompat p0);
        
        void o(final float p0);
        
        void p();
        
        void q(final Uri p0, final Bundle p1);
        
        void r();
        
        void s(final String p0, final l p1, final Bundle p2);
        
        void t(final RatingCompat p0);
        
        void u(final String p0, final Bundle p1);
        
        void v(final MediaMetadataCompat p0, final int p1);
        
        void w();
        
        void x(final int p0);
        
        void y();
        
        void z(final String p0, final Bundle p1);
    }
}
