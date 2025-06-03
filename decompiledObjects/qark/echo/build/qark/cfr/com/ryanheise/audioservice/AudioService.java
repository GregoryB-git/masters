/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Notification
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.app.PendingIntent
 *  android.app.Service
 *  android.content.ComponentName
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.graphics.Rect
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.ParcelFileDescriptor
 *  android.os.Parcelable
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  android.util.LruCache
 *  android.util.Size
 *  android.view.KeyEvent
 *  java.io.FileDescriptor
 *  java.io.FileNotFoundException
 *  java.io.IOException
 *  java.io.PrintStream
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package com.ryanheise.audioservice;

import a0.d;
import a0.o;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.PowerManager;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.LruCache;
import android.util.Size;
import android.view.KeyEvent;
import com.ryanheise.audioservice.MediaButtonReceiver;
import com.ryanheise.audioservice.a;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l5.c;
import l5.f;
import l5.g;
import l5.h;
import l5.p;
import l5.q;
import l5.r;
import w.h;
import x2.i;

public class AudioService
extends a0.d {
    public static AudioService R;
    public static PendingIntent S;
    public static e T;
    public static List U;
    public static final Map V;
    public MediaSessionCompat A;
    public d B;
    public List C = new ArrayList();
    public List D = new ArrayList();
    public List E = new ArrayList();
    public int[] F;
    public MediaMetadataCompat G;
    public Bitmap H;
    public String I;
    public LruCache J;
    public boolean K = false;
    public l5.a L = l5.a.o;
    public int M;
    public int N;
    public boolean O;
    public final Handler P = new Handler(Looper.getMainLooper());
    public o Q;
    public io.flutter.embedding.engine.a x;
    public h y;
    public PowerManager.WakeLock z;

    static {
        U = new ArrayList();
        V = new HashMap();
    }

    public static int A(BitmapFactory.Options options, int n8, int n9) {
        int n10 = options.outHeight;
        int n11 = options.outWidth;
        int n12 = 1;
        int n13 = 1;
        if (n10 > n9 || n11 > n8) {
            n11 /= 2;
            do {
                n12 = n13;
                if ((n10 /= 2) / n13 < n9) break;
                n12 = n13;
                if (n11 / n13 < n8) break;
                n13 *= 2;
            } while (true);
        }
        return n12;
    }

    public static MediaMetadataCompat K(String string2) {
        return (MediaMetadataCompat)V.get((Object)string2);
    }

    public static void Q(e e8) {
        T = e8;
    }

    public static int d0(long l8) {
        if (l8 == 4L) {
            return 91;
        }
        if (l8 == 2L) {
            return 130;
        }
        return PlaybackStateCompat.h(l8);
    }

    public static /* synthetic */ void t(AudioService audioService) {
        audioService.e0();
    }

    public void B(h h8) {
        this.y = h8;
        String string2 = h8.c;
        if (string2 == null) {
            string2 = new StringBuilder();
            string2.append(this.getApplication().getPackageName());
            string2.append(".channel");
            string2 = string2.toString();
        }
        this.I = string2;
        if (h8.n != null) {
            string2 = this.getApplicationContext();
            Intent intent = new Intent(null);
            intent.setComponent(new ComponentName((Context)string2, h8.n));
            intent.setAction("com.ryanheise.audioservice.NOTIFICATION_CLICK");
            S = PendingIntent.getActivity((Context)string2, (int)1000, (Intent)intent, (int)201326592);
        } else {
            S = null;
        }
        if (!h8.b) {
            this.A.l(null);
        }
    }

    public h.a C(String string2, String string3, long l8) {
        return new h.a(this.O(string2), (CharSequence)string3, this.y(l8));
    }

    public final void D() {
        NotificationManager notificationManager = this.M();
        if (x2.e.a(notificationManager, this.I) == null) {
            c.a();
            NotificationChannel notificationChannel = i.a(this.I, this.y.d, 2);
            l5.d.a(notificationChannel, this.y.h);
            String string2 = this.y.e;
            if (string2 != null) {
                l5.e.a(notificationChannel, string2);
            }
            x2.f.a(notificationManager, notificationChannel);
        }
    }

    public PlaybackStateCompat.CustomAction E(r r8) {
        int n8 = this.O(r8.a);
        p p8 = r8.d;
        if (p8 != null) {
            return new PlaybackStateCompat.CustomAction.b(p8.a, r8.b, n8).b(this.U(r8.d.b)).a();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            long l8 = r8.c;
            if (l8 == 1L) {
                return new PlaybackStateCompat.CustomAction.b("com.ryanheise.audioservice.action.STOP", r8.b, n8).a();
            }
            if (l8 == 64L) {
                return new PlaybackStateCompat.CustomAction.b("com.ryanheise.audioservice.action.FAST_FORWARD", r8.b, n8).a();
            }
            if (l8 == 8L) {
                return new PlaybackStateCompat.CustomAction.b("com.ryanheise.audioservice.action.REWIND", r8.b, n8).a();
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public MediaMetadataCompat F(String string2, String object, String string3, String string42, String string5, Long l8, String string6, Boolean bl, String string7, String string8, String string9, RatingCompat ratingCompat, Map map) {
        MediaMetadataCompat.b b8;
        block14 : {
            long l9;
            b8 = new MediaMetadataCompat.b().e("android.media.metadata.MEDIA_ID", string2).e("android.media.metadata.TITLE", (String)object);
            if (string3 != null) {
                b8.e("android.media.metadata.ALBUM", string3);
            }
            if (string42 != null) {
                b8.e("android.media.metadata.ARTIST", string42);
            }
            if (string5 != null) {
                b8.e("android.media.metadata.GENRE", string5);
            }
            if (l8 != null) {
                b8.c("android.media.metadata.DURATION", l8);
            }
            if (string6 != null) {
                b8.e("android.media.metadata.DISPLAY_ICON_URI", string6);
            }
            if (bl != null) {
                l9 = bl != false ? 1L : 0L;
                b8.c("playable_long", l9);
            }
            if (string7 != null) {
                b8.e("android.media.metadata.DISPLAY_TITLE", string7);
            }
            if (string8 != null) {
                b8.e("android.media.metadata.DISPLAY_SUBTITLE", string8);
            }
            if (string9 != null) {
                b8.e("android.media.metadata.DISPLAY_DESCRIPTION", string9);
            }
            if (ratingCompat != null) {
                b8.d("android.media.metadata.RATING", ratingCompat);
            }
            if (map == null) break block14;
            for (String string42 : map.keySet()) {
                block19 : {
                    block20 : {
                        block16 : {
                            block18 : {
                                block17 : {
                                    block15 : {
                                        object = map.get((Object)string42);
                                        if (!(object instanceof Long)) break block15;
                                        l9 = (Long)object;
                                        break block16;
                                    }
                                    if (!(object instanceof Integer)) break block17;
                                    l9 = ((Integer)object).intValue();
                                    break block16;
                                }
                                if (!(object instanceof String)) break block18;
                                object = (String)object;
                                break block19;
                            }
                            if (!(object instanceof Boolean)) break block20;
                            l9 = (Boolean)object != false ? 1L : 0L;
                        }
                        b8.c(string42, l9);
                        continue;
                    }
                    if (!(object instanceof Double)) continue;
                    object = object.toString();
                }
                b8.e(string42, (String)object);
            }
        }
        object = b8.a();
        V.put((Object)string2, object);
        return object;
    }

    public final void G() {
        if (this.A.e()) {
            this.A.g(false);
        }
        this.M().cancel(1124);
    }

    public final void H() {
        x.a.k((Context)this, new Intent((Context)this, AudioService.class));
        if (!this.A.e()) {
            this.A.g(true);
        }
        this.w();
        this.A.s(S);
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

    public final h.e L() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.D();
        }
        h.e e8 = new h.e((Context)this, this.I).C(1).v(false).n(this.x());
        e8.w(this.O(this.y.g));
        return e8;
    }

    public final NotificationManager M() {
        return (NotificationManager)this.getSystemService("notification");
    }

    public int N() {
        int n8 = .a[this.L.ordinal()];
        int n9 = 2;
        if (n8 != 2) {
            if (n8 != 3) {
                if (n8 != 4) {
                    if (n8 != 5) {
                        if (n8 != 6) {
                            return 0;
                        }
                        return 7;
                    }
                    if (this.K) {
                        n9 = 3;
                    }
                    return n9;
                }
                if (this.K) {
                    n9 = 3;
                }
                return n9;
            }
            return 6;
        }
        return 8;
    }

    public int O(String string2) {
        Object object = string2.split("/");
        string2 = object[0];
        object = object[1];
        return this.getResources().getIdentifier((String)object, string2, this.getApplicationContext().getPackageName());
    }

    public void P() {
        e e8 = T;
        if (e8 == null) {
            return;
        }
        e8.b();
    }

    public final void R() {
        this.startForeground(1124, this.z());
        this.O = true;
    }

    public final void S(boolean bl) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:668)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public Bitmap T(String var1_1, String var2_4) {
        var8_5 = (Bitmap)this.J.get((Object)var1_1);
        if (var8_5 != null) {
            return var8_5;
        }
        try {
            block14 : {
                var9_6 = Uri.parse((String)var1_1);
                var6_7 = "content".equals((Object)var9_6.getScheme());
                var7_8 = var8_5;
                if (!var6_7) break block14;
                if (var2_4 == null) ** GOTO lbl25
                try {
                    if (Build.VERSION.SDK_INT >= 29) {
                        var2_4 = new Size(192, 192);
                        var7_8 = this.getContentResolver();
                        var3_10 = var4_9 = this.y.l;
                        if (var4_9 == -1) {
                            var3_10 = var2_4.getWidth();
                        }
                        var4_9 = var5_11 = this.y.m;
                        if (var5_11 == -1) {
                            var4_9 = var2_4.getHeight();
                        }
                        var2_4 = f.a((ContentResolver)var7_8, var9_6, new Size(var3_10, var4_9), null);
                        var7_8 = var2_4;
                        if (var2_4 == null) {
                            return null;
                        }
                        break block14;
                    }
lbl25: // 3 sources:
                    if ((var2_4 = this.getContentResolver().openFileDescriptor(var9_6, "r")) == null) return null;
                    var7_8 = var2_4.getFileDescriptor();
                    var2_4 = var8_5;
                    var8_5 = var7_8;
                }
                catch (FileNotFoundException | IOException var1_3) {
                    return null;
                }
            }
            var8_5 = null;
            var2_4 = var7_8;
            if (!var6_7 || var8_5 != null) {
                if (this.y.l != -1) {
                    var2_4 = new BitmapFactory.Options();
                    var2_4.inJustDecodeBounds = true;
                    if (var8_5 != null) {
                        BitmapFactory.decodeFileDescriptor((FileDescriptor)var8_5, (Rect)null, (BitmapFactory.Options)var2_4);
                    } else {
                        BitmapFactory.decodeFile((String)var9_6.getPath(), (BitmapFactory.Options)var2_4);
                    }
                    var7_8 = this.y;
                    var2_4.inSampleSize = AudioService.A((BitmapFactory.Options)var2_4, var7_8.l, var7_8.m);
                    var2_4.inJustDecodeBounds = false;
                    var2_4 = var8_5 != null ? BitmapFactory.decodeFileDescriptor((FileDescriptor)var8_5, (Rect)null, (BitmapFactory.Options)var2_4) : BitmapFactory.decodeFile((String)var9_6.getPath(), (BitmapFactory.Options)var2_4);
                } else {
                    var2_4 = var8_5 != null ? BitmapFactory.decodeFileDescriptor((FileDescriptor)var8_5) : BitmapFactory.decodeFile((String)var9_6.getPath());
                }
            }
            this.J.put((Object)var1_1, (Object)var2_4);
            return var2_4;
        }
        catch (Exception var1_2) {}
        var1_2.printStackTrace();
        return null;
    }

    public final Bundle U(Map map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Object object : map.entrySet()) {
            String string2 = object.getKey().toString();
            if ((object = object.getValue()) instanceof Integer) {
                bundle.putInt(string2, ((Integer)object).intValue());
                continue;
            }
            if (object instanceof Long) {
                bundle.putLong(string2, ((Long)object).longValue());
                continue;
            }
            bundle.putString(string2, object.toString());
        }
        return bundle;
    }

    public final MediaMetadataCompat V(MediaMetadataCompat mediaMetadataCompat) {
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

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void Y(MediaMetadataCompat var1_1) {
        block5 : {
            // MONITORENTER : this
            var2_3 = var1_1.i("artCacheFile");
            if (var2_3 == null) break block5;
            this.H = this.T(var2_3, null);
            ** GOTO lbl11
        }
        var2_3 = var1_1.i("android.media.metadata.DISPLAY_ICON_URI");
        if (var2_3 != null && var2_3.startsWith("content:")) {
            this.H = this.T(var2_3, var1_1.i("loadThumbnailUri"));
lbl11: // 2 sources:
            var1_1 = this.V(var1_1);
        } else {
            this.H = null;
        }
        this.G = var1_1;
        this.A.m(var1_1);
        this.P.removeCallbacksAndMessages((Object)null);
        this.P.post((Runnable)new g(this));
        // MONITOREXIT : this
        return;
    }

    public void Z(int n8, Integer n9, Integer n10, Integer n11) {
        if (n8 == 1) {
            this.A.o(3);
            this.Q = null;
            return;
        }
        if (n8 == 2) {
            if (this.Q != null && n9.intValue() == this.Q.b() && n10.intValue() == this.Q.a()) {
                this.Q.f(n11);
            } else {
                this.Q = new o(n9, n10, n11){

                    @Override
                    public void d(int n8) {
                        if (T == null) {
                            return;
                        }
                        T.H(n8);
                    }

                    @Override
                    public void e(int n8) {
                        if (T == null) {
                            return;
                        }
                        T.x(n8);
                    }
                };
            }
            this.A.p(this.Q);
        }
    }

    public void a0(List list) {
        synchronized (this) {
            U = list;
            this.A.q(list);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void b0(List object, long l8, int[] object2, l5.a a8, boolean bl, long l9, long l10, float f8, long l11, Integer n8, String string2, int n9, int n10, boolean bl2, Long l12) {
        boolean bl3;
        boolean bl4;
        block16 : {
            int n11;
            block15 : {
                block14 : {
                    r r8;
                    bl3 = Arrays.equals((int[])object2, (int[])this.F);
                    bl4 = true;
                    if (object.equals((Object)this.C)) {
                        bl4 = bl3 ^ true;
                    }
                    this.C = object;
                    this.D.clear();
                    this.E.clear();
                    object = object.iterator();
                    while (object.hasNext()) {
                        r8 = (r)object.next();
                        PlaybackStateCompat.CustomAction customAction = this.E(r8);
                        if (customAction != null) {
                            this.E.add((Object)customAction);
                            continue;
                        }
                        this.D.add((Object)this.C(r8.a, r8.b, r8.c));
                    }
                    this.F = object2;
                    bl3 = this.K;
                    object = this.L;
                    this.L = a8;
                    this.K = bl;
                    this.M = n9;
                    this.N = n10;
                    object2 = new PlaybackStateCompat.d().c(l8 | 3669711L).h(this.N(), l9, f8, l11).e(l10);
                    r8 = this.E.iterator();
                    while (r8.hasNext()) {
                        object2.a((PlaybackStateCompat.CustomAction)r8.next());
                    }
                    if (l12 != null) {
                        object2.d(l12);
                    }
                    if (n8 == null || string2 == null) break block14;
                    n11 = n8;
                    break block15;
                }
                if (string2 == null) break block16;
                n11 = -987654;
            }
            object2.f(n11, string2);
        }
        if (this.G != null) {
            n8 = new Bundle();
            n8.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", this.G.e().g());
            object2.g((Bundle)n8);
        }
        this.A.n(object2.b());
        this.A.r(n9);
        this.A.t(n10);
        this.A.j(bl2);
        if (!bl3 && bl) {
            this.H();
        } else if (bl3 && !bl) {
            this.J();
        }
        object2 = l5.a.o;
        if (object != object2 && a8 == object2) {
            this.c0();
            return;
        }
        if (a8 != object2 && bl4) {
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
    public d.e g(String string2, int n8, Bundle object) {
        string2 = object == null ? null : Boolean.valueOf((boolean)object.getBoolean("android.service.media.extra.RECENT"));
        object = string2;
        if (string2 == null) {
            object = Boolean.FALSE;
        }
        Bundle bundle = this.y.a();
        string2 = object.booleanValue() ? "recent" : "root";
        return new d.e(string2, bundle);
    }

    @Override
    public void h(String string2, d.l l8) {
        this.i(string2, l8, null);
    }

    @Override
    public void i(String string2, d.l l8, Bundle bundle) {
        e e8 = T;
        if (e8 == null) {
            l8.g((Object)new ArrayList());
            return;
        }
        e8.s(string2, l8, bundle);
    }

    @Override
    public void j(String string2, d.l l8) {
        e e8 = T;
        if (e8 == null) {
            l8.g(null);
            return;
        }
        e8.m(string2, l8);
    }

    @Override
    public void k(String string2, Bundle bundle, d.l l8) {
        e e8 = T;
        if (e8 == null) {
            l8.g((Object)new ArrayList());
            return;
        }
        e8.i(string2, bundle, l8);
    }

    @Override
    public void onCreate() {
        d d8;
        super.onCreate();
        R = this;
        this.M = 0;
        this.N = 0;
        this.O = false;
        this.K = false;
        this.L = l5.a.o;
        this.A = new MediaSessionCompat((Context)this, "media-session");
        this.B(new h(this.getApplicationContext()));
        this.A.k(4);
        Object object = new PlaybackStateCompat.d().c(3669711L);
        this.A.n(object.b());
        object = this.A;
        this.B = d8 = new d();
        object.h(d8);
        this.s(this.A.c());
        this.A.q(U);
        this.z = ((PowerManager)this.getSystemService("power")).newWakeLock(1, AudioService.class.getName());
        this.J = new LruCache((int)(Runtime.getRuntime().maxMemory() / 1024L) / 8){

            public int a(String string2, Bitmap bitmap) {
                return bitmap.getByteCount() / 1024;
            }
        };
        this.x = a.B((Context)this);
        System.out.println("flutterEngine warmed up");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        e e8 = T;
        if (e8 != null) {
            e8.D();
            T = null;
        }
        this.G = null;
        this.H = null;
        U.clear();
        V.clear();
        this.C.clear();
        this.J.evictAll();
        this.F = null;
        this.W();
        this.S(this.y.b ^ true);
        this.X();
        R = null;
        this.O = false;
    }

    public int onStartCommand(Intent intent, int n8, int n9) {
        c0.d.c(this.A, intent);
        return 2;
    }

    public void onTaskRemoved(Intent intent) {
        e e8 = T;
        if (e8 != null) {
            e8.y();
        }
        Service.super.onTaskRemoved(intent);
    }

    public final void w() {
        if (!this.z.isHeld()) {
            this.z.acquire();
        }
    }

    public PendingIntent x() {
        Intent intent = new Intent((Context)this, MediaButtonReceiver.class);
        intent.setAction("com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE");
        return PendingIntent.getBroadcast((Context)this, (int)0, (Intent)intent, (int)67108864);
    }

    public PendingIntent y(long l8) {
        int n8 = AudioService.d0(l8);
        if (n8 == 0) {
            return null;
        }
        Intent intent = new Intent((Context)this, MediaButtonReceiver.class);
        intent.setAction("android.intent.action.MEDIA_BUTTON");
        intent.putExtra("android.intent.extra.KEY_EVENT", (Parcelable)new KeyEvent(0, n8));
        return PendingIntent.getBroadcast((Context)this, (int)n8, (Intent)intent, (int)67108864);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Notification z() {
        int n8;
        Object object = this.F;
        int[] arrn = object;
        if (object == null) {
            int n9 = Math.min((int)3, (int)this.D.size());
            arrn = new int[n9];
            n8 = 0;
            while (n8 < n9) {
                arrn[n8] = n8++;
            }
        }
        object = this.L();
        Object object2 = this.G;
        if (object2 != null) {
            if ((object2 = object2.e()).j() != null) {
                object.l(object2.j());
            }
            if (object2.i() != null) {
                object.k(object2.i());
            }
            if (object2.b() != null) {
                object.z(object2.b());
            }
            // MONITORENTER : this
            object2 = this.H;
            if (object2 != null) {
                object.p((Bitmap)object2);
            }
            // MONITOREXIT : this
        }
        if (this.y.i) {
            object.j(this.A.b().b());
        }
        if ((n8 = this.y.f) != -1) {
            object.i(n8);
        }
        object2 = this.D.iterator();
        while (object2.hasNext()) {
            object.b((h.a)object2.next());
        }
        object2 = new b0.c().i(this.A.c());
        if (Build.VERSION.SDK_INT < 33) {
            object2.j(arrn);
        }
        if (this.y.j) {
            object2.k(true);
            object2.h(this.y(1L));
            object.t(true);
        }
        object.y((h.f)object2);
        return object.c();
        catch (Throwable throwable) {
            throw throwable;
        }
    }

    public class d
    extends MediaSessionCompat.b {
        @Override
        public void A() {
            if (T == null) {
                return;
            }
            T.k();
        }

        @Override
        public void B(long l8) {
            if (T == null) {
                return;
            }
            T.G(l8);
        }

        @Override
        public void C() {
            if (T == null) {
                return;
            }
            T.g();
        }

        public final q E(KeyEvent keyEvent) {
            int n8 = keyEvent.getKeyCode();
            if (n8 != 79 && n8 != 85) {
                if (n8 != 87) {
                    if (n8 != 88) {
                        return q.o;
                    }
                    return q.q;
                }
                return q.p;
            }
            return q.o;
        }

        @Override
        public void b(MediaDescriptionCompat mediaDescriptionCompat) {
            if (T == null) {
                return;
            }
            T.C(AudioService.K(mediaDescriptionCompat.g()));
        }

        @Override
        public void c(MediaDescriptionCompat mediaDescriptionCompat, int n8) {
            if (T == null) {
                return;
            }
            T.v(AudioService.K(mediaDescriptionCompat.g()), n8);
        }

        @Override
        public void e(String string2, Bundle bundle) {
            if (T == null) {
                return;
            }
            if ("com.ryanheise.audioservice.action.STOP".equals((Object)string2)) {
                T.g();
                return;
            }
            if ("com.ryanheise.audioservice.action.FAST_FORWARD".equals((Object)string2)) {
                T.A();
                return;
            }
            if ("com.ryanheise.audioservice.action.REWIND".equals((Object)string2)) {
                T.r();
                return;
            }
            T.E(string2, bundle);
        }

        @Override
        public void f() {
            if (T == null) {
                return;
            }
            T.A();
        }

        /*
         * Unable to fully structure code
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public boolean g(Intent var1_1) {
            if (AudioService.u() == null) {
                return false;
            }
            if ((var1_1 = (KeyEvent)var1_1.getExtras().getParcelable("android.intent.extra.KEY_EVENT")).getAction() != 0) return true;
            var2_2 = var1_1.getKeyCode();
            if (var2_2 == 79) ** GOTO lbl-1000
            if (var2_2 == 130) ** GOTO lbl-1000
            if (var2_2 != 126 && var2_2 != 127) {
                switch (var2_2) {
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
                }
            }
            ** GOTO lbl-1000
lbl-1000: // 1 sources:
            {
                this.h();
                return true;
                case 85: 
                case 87: 
                case 88: lbl-1000: // 3 sources:
                {
                    AudioService.u().j(this.E((KeyEvent)var1_1));
                }
            }
            return true;
        }

        @Override
        public void h() {
            if (T == null) {
                return;
            }
            T.w();
        }

        @Override
        public void i() {
            if (T == null) {
                return;
            }
            T.e();
        }

        @Override
        public void j(String string2, Bundle bundle) {
            if (T == null) {
                return;
            }
            T.z(string2, bundle);
        }

        @Override
        public void k(String string2, Bundle bundle) {
            if (T == null) {
                return;
            }
            T.u(string2, bundle);
        }

        @Override
        public void l(Uri uri, Bundle bundle) {
            if (T == null) {
                return;
            }
            T.I(uri, bundle);
        }

        @Override
        public void m() {
            if (T == null) {
                return;
            }
            if (!AudioService.this.A.e()) {
                AudioService.this.A.g(true);
            }
            T.p();
        }

        @Override
        public void n(String string2, Bundle bundle) {
            if (T == null) {
                return;
            }
            if (!AudioService.this.A.e()) {
                AudioService.this.A.g(true);
            }
            T.h(string2, bundle);
        }

        @Override
        public void o(String string2, Bundle bundle) {
            if (T == null) {
                return;
            }
            if (!AudioService.this.A.e()) {
                AudioService.this.A.g(true);
            }
            T.F(string2, bundle);
        }

        @Override
        public void p(Uri uri, Bundle bundle) {
            if (T == null) {
                return;
            }
            if (!AudioService.this.A.e()) {
                AudioService.this.A.g(true);
            }
            T.q(uri, bundle);
        }

        @Override
        public void q(MediaDescriptionCompat mediaDescriptionCompat) {
            if (T == null) {
                return;
            }
            T.n(AudioService.K(mediaDescriptionCompat.g()));
        }

        @Override
        public void r() {
            if (T == null) {
                return;
            }
            T.r();
        }

        @Override
        public void s(long l8) {
            if (T == null) {
                return;
            }
            T.B(l8);
        }

        @Override
        public void t(boolean bl) {
            if (T == null) {
                return;
            }
            T.f(bl);
        }

        @Override
        public void u(float f8) {
            if (T == null) {
                return;
            }
            T.o(f8);
        }

        @Override
        public void v(RatingCompat ratingCompat) {
            if (T == null) {
                return;
            }
            T.t(ratingCompat);
        }

        @Override
        public void w(RatingCompat ratingCompat, Bundle bundle) {
            if (T == null) {
                return;
            }
            T.J(ratingCompat, bundle);
        }

        @Override
        public void x(int n8) {
            if (T == null) {
                return;
            }
            T.c(n8);
        }

        @Override
        public void y(int n8) {
            if (T == null) {
                return;
            }
            T.d(n8);
        }

        @Override
        public void z() {
            if (T == null) {
                return;
            }
            T.l();
        }
    }

    public static interface e {
        public void A();

        public void B(long var1);

        public void C(MediaMetadataCompat var1);

        public void D();

        public void E(String var1, Bundle var2);

        public void F(String var1, Bundle var2);

        public void G(long var1);

        public void H(int var1);

        public void I(Uri var1, Bundle var2);

        public void J(RatingCompat var1, Bundle var2);

        public void b();

        public void c(int var1);

        public void d(int var1);

        public void e();

        public void f(boolean var1);

        public void g();

        public void h(String var1, Bundle var2);

        public void i(String var1, Bundle var2, d.l var3);

        public void j(q var1);

        public void k();

        public void l();

        public void m(String var1, d.l var2);

        public void n(MediaMetadataCompat var1);

        public void o(float var1);

        public void p();

        public void q(Uri var1, Bundle var2);

        public void r();

        public void s(String var1, d.l var2, Bundle var3);

        public void t(RatingCompat var1);

        public void u(String var1, Bundle var2);

        public void v(MediaMetadataCompat var1, int var2);

        public void w();

        public void x(int var1);

        public void y();

        public void z(String var1, Bundle var2);
    }

}

