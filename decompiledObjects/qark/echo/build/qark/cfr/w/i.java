/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Notification$Action
 *  android.app.Notification$Action$Builder
 *  android.app.Notification$BubbleMetadata
 *  android.app.Notification$Builder
 *  android.app.PendingIntent
 *  android.app.Person
 *  android.app.RemoteInput
 *  android.content.Context
 *  android.content.LocusId
 *  android.graphics.Bitmap
 *  android.graphics.drawable.Icon
 *  android.media.AudioAttributes
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.widget.RemoteViews
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 */
package w;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import w.h;
import w.l;

public class i
implements w.g {
    public final Context a;
    public final Notification.Builder b;
    public final h.e c;
    public RemoteViews d;
    public RemoteViews e;
    public final List f = new ArrayList();
    public final Bundle g = new Bundle();
    public int h;
    public RemoteViews i;

    /*
     * Enabled aggressive block sorting
     */
    public i(h.e e8) {
        int n8;
        this.c = e8;
        Object object = e8.a;
        this.a = object;
        object = Build.VERSION.SDK_INT >= 26 ? h.a((Context)object, e8.K) : new Notification.Builder(e8.a);
        this.b = object;
        Notification notification = e8.R;
        object = this.b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, e8.i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean bl = (notification.flags & 2) != 0;
        object = object.setOngoing(bl);
        bl = (notification.flags & 8) != 0;
        object = object.setOnlyAlertOnce(bl);
        bl = (notification.flags & 16) != 0;
        object = object.setAutoCancel(bl).setDefaults(notification.defaults).setContentTitle(e8.e).setContentText(e8.f).setContentInfo(e8.k).setContentIntent(e8.g).setDeleteIntent(notification.deleteIntent);
        Object object2 = e8.h;
        bl = (notification.flags & 128) != 0;
        object.setFullScreenIntent((PendingIntent)object2, bl).setLargeIcon(e8.j).setNumber(e8.l).setProgress(e8.t, e8.u, e8.v);
        a.b(a.d(a.c(this.b, e8.q), e8.o), e8.m);
        object = e8.b.iterator();
        while (object.hasNext()) {
            this.b((h.a)object.next());
        }
        object = e8.D;
        if (object != null) {
            this.g.putAll((Bundle)object);
        }
        int n9 = Build.VERSION.SDK_INT;
        this.d = e8.H;
        this.e = e8.I;
        b.a(this.b, e8.n);
        d.i(this.b, e8.z);
        d.g(this.b, e8.w);
        d.j(this.b, e8.y);
        d.h(this.b, e8.x);
        this.h = e8.O;
        e.b(this.b, e8.C);
        e.c(this.b, e8.E);
        e.f(this.b, e8.F);
        e.d(this.b, e8.G);
        e.e(this.b, notification.sound, (Object)notification.audioAttributes);
        object = n9 < 28 ? i.e(i.g((List)e8.c), (List)e8.U) : e8.U;
        if (object != null && !object.isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                object2 = (String)object.next();
                e.a(this.b, (String)object2);
            }
        }
        this.i = e8.J;
        if (e8.d.size() > 0) {
            object = object2 = e8.d().getBundle("android.car.EXTENSIONS");
            if (object2 == null) {
                object = new Bundle();
            }
            object2 = new Bundle((Bundle)object);
            Bundle bundle = new Bundle();
            for (n9 = 0; n9 < e8.d.size(); ++n9) {
                bundle.putBundle(Integer.toString((int)n9), w.j.a((h.a)e8.d.get(n9)));
            }
            object.putBundle("invisible_actions", bundle);
            object2.putBundle("invisible_actions", bundle);
            e8.d().putBundle("android.car.EXTENSIONS", (Bundle)object);
            this.g.putBundle("android.car.EXTENSIONS", (Bundle)object2);
        }
        n9 = Build.VERSION.SDK_INT;
        object = e8.T;
        if (object != null) {
            f.b(this.b, object);
        }
        if (n9 >= 24) {
            c.a(this.b, e8.D);
            g.e(this.b, e8.s);
            object = e8.H;
            if (object != null) {
                g.c(this.b, (RemoteViews)object);
            }
            if ((object = e8.I) != null) {
                g.b(this.b, (RemoteViews)object);
            }
            if ((object = e8.J) != null) {
                g.d(this.b, (RemoteViews)object);
            }
        }
        if (n9 >= 26) {
            h.b(this.b, e8.L);
            h.e(this.b, e8.r);
            h.f(this.b, e8.M);
            h.g(this.b, e8.N);
            h.d(this.b, e8.O);
            if (e8.B) {
                h.c(this.b, e8.A);
            }
            if (!TextUtils.isEmpty((CharSequence)e8.K)) {
                this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (n9 >= 28 && (object = e8.c.iterator()).hasNext()) {
            android.support.v4.media.a.a(object.next());
            throw null;
        }
        if (n9 >= 29) {
            j.a(this.b, e8.Q);
            j.b(this.b, h.d.a(null));
        }
        if (n9 >= 31 && (n8 = e8.P) != 0) {
            k.b(this.b, n8);
        }
        if (e8.S) {
            this.h = this.c.x ? 2 : 1;
            this.b.setVibrate(null);
            this.b.setSound(null);
            notification.defaults = n8 = notification.defaults & -4;
            this.b.setDefaults(n8);
            if (n9 >= 26) {
                if (TextUtils.isEmpty((CharSequence)this.c.w)) {
                    d.g(this.b, "silent");
                }
                h.d(this.b, this.h);
            }
        }
    }

    public static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        t.b b8 = new t.b(list.size() + list2.size());
        b8.addAll((Collection)list);
        b8.addAll((Collection)list2);
        return new ArrayList((Collection)b8);
    }

    public static List g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        if (!(list = list.iterator()).hasNext()) {
            return arrayList;
        }
        android.support.v4.media.a.a(list.next());
        throw null;
    }

    @Override
    public Notification.Builder a() {
        return this.b;
    }

    public final void b(h.a a8) {
        int n8;
        Bundle bundle = a8.d();
        bundle = bundle != null ? bundle.n() : null;
        Notification.Action.Builder builder = f.a((Icon)bundle, a8.h(), a8.a());
        if (a8.e() != null) {
            bundle = l.b(a8.e());
            int n9 = bundle.length;
            for (n8 = 0; n8 < n9; ++n8) {
                d.c(builder, (RemoteInput)bundle[n8]);
            }
        }
        bundle = a8.c() != null ? new Bundle(a8.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", a8.b());
        n8 = Build.VERSION.SDK_INT;
        if (n8 >= 24) {
            g.a(builder, a8.b());
        }
        bundle.putInt("android.support.action.semanticAction", a8.f());
        if (n8 >= 28) {
            i.b(builder, a8.f());
        }
        if (n8 >= 29) {
            j.c(builder, a8.j());
        }
        if (n8 >= 31) {
            k.a(builder, a8.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", a8.g());
        d.b(builder, bundle);
        d.a(this.b, d.d(builder));
    }

    /*
     * Enabled aggressive block sorting
     */
    public Notification c() {
        h.f f8 = this.c.p;
        if (f8 != null) {
            f8.b(this);
        }
        RemoteViews remoteViews = f8 != null ? f8.e(this) : null;
        Notification notification = this.d();
        if (remoteViews != null || (remoteViews = this.c.H) != null) {
            notification.contentView = remoteViews;
        }
        if (f8 != null && (remoteViews = f8.d(this)) != null) {
            notification.bigContentView = remoteViews;
        }
        if (f8 != null && (remoteViews = this.c.p.f(this)) != null) {
            notification.headsUpContentView = remoteViews;
        }
        if (f8 != null && (remoteViews = w.h.a(notification)) != null) {
            f8.a((Bundle)remoteViews);
        }
        return notification;
    }

    public Notification d() {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 26) {
            return a.a(this.b);
        }
        if (n8 >= 24) {
            Notification notification = a.a(this.b);
            if (this.h != 0) {
                if (d.f(notification) != null && (notification.flags & 512) != 0 && this.h == 2) {
                    this.h(notification);
                }
                if (d.f(notification) != null && (notification.flags & 512) == 0 && this.h == 1) {
                    this.h(notification);
                }
            }
            return notification;
        }
        c.a(this.b, this.g);
        Notification notification = a.a(this.b);
        RemoteViews remoteViews = this.d;
        if (remoteViews != null) {
            notification.contentView = remoteViews;
        }
        if ((remoteViews = this.e) != null) {
            notification.bigContentView = remoteViews;
        }
        if ((remoteViews = this.i) != null) {
            notification.headsUpContentView = remoteViews;
        }
        if (this.h != 0) {
            if (d.f(notification) != null && (notification.flags & 512) != 0 && this.h == 2) {
                this.h(notification);
            }
            if (d.f(notification) != null && (notification.flags & 512) == 0 && this.h == 1) {
                this.h(notification);
            }
        }
        return notification;
    }

    public Context f() {
        return this.a;
    }

    public final void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    public static abstract class a {
        public static Notification a(Notification.Builder builder) {
            return builder.build();
        }

        public static Notification.Builder b(Notification.Builder builder, int n8) {
            return builder.setPriority(n8);
        }

        public static Notification.Builder c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        public static Notification.Builder d(Notification.Builder builder, boolean bl) {
            return builder.setUsesChronometer(bl);
        }
    }

    public static abstract class b {
        public static Notification.Builder a(Notification.Builder builder, boolean bl) {
            return builder.setShowWhen(bl);
        }
    }

    public static abstract class c {
        public static Notification.Builder a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    public static abstract class d {
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        public static Notification.Action.Builder e(int n8, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(n8, charSequence, pendingIntent);
        }

        public static String f(Notification notification) {
            return notification.getGroup();
        }

        public static Notification.Builder g(Notification.Builder builder, String string2) {
            return builder.setGroup(string2);
        }

        public static Notification.Builder h(Notification.Builder builder, boolean bl) {
            return builder.setGroupSummary(bl);
        }

        public static Notification.Builder i(Notification.Builder builder, boolean bl) {
            return builder.setLocalOnly(bl);
        }

        public static Notification.Builder j(Notification.Builder builder, String string2) {
            return builder.setSortKey(string2);
        }
    }

    public static abstract class e {
        public static Notification.Builder a(Notification.Builder builder, String string2) {
            return builder.addPerson(string2);
        }

        public static Notification.Builder b(Notification.Builder builder, String string2) {
            return builder.setCategory(string2);
        }

        public static Notification.Builder c(Notification.Builder builder, int n8) {
            return builder.setColor(n8);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object object) {
            return builder.setSound(uri, (AudioAttributes)object);
        }

        public static Notification.Builder f(Notification.Builder builder, int n8) {
            return builder.setVisibility(n8);
        }
    }

    public static abstract class f {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Object object) {
            return builder.setSmallIcon((Icon)object);
        }
    }

    public static abstract class g {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean bl) {
            return builder.setAllowGeneratedReplies(bl);
        }

        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] arrcharSequence) {
            return builder.setRemoteInputHistory(arrcharSequence);
        }
    }

    public static abstract class h {
        public static Notification.Builder a(Context context, String string2) {
            return new Notification.Builder(context, string2);
        }

        public static Notification.Builder b(Notification.Builder builder, int n8) {
            return builder.setBadgeIconType(n8);
        }

        public static Notification.Builder c(Notification.Builder builder, boolean bl) {
            return builder.setColorized(bl);
        }

        public static Notification.Builder d(Notification.Builder builder, int n8) {
            return builder.setGroupAlertBehavior(n8);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder f(Notification.Builder builder, String string2) {
            return builder.setShortcutId(string2);
        }

        public static Notification.Builder g(Notification.Builder builder, long l8) {
            return builder.setTimeoutAfter(l8);
        }
    }

    public static abstract class i {
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, int n8) {
            return builder.setSemanticAction(n8);
        }
    }

    public static abstract class j {
        public static Notification.Builder a(Notification.Builder builder, boolean bl) {
            return builder.setAllowSystemGeneratedContextualActions(bl);
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean bl) {
            return builder.setContextual(bl);
        }

        public static Notification.Builder d(Notification.Builder builder, Object object) {
            return builder.setLocusId((LocusId)object);
        }
    }

    public static abstract class k {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean bl) {
            return builder.setAuthenticationRequired(bl);
        }

        public static Notification.Builder b(Notification.Builder builder, int n8) {
            return builder.setForegroundServiceBehavior(n8);
        }
    }

}

