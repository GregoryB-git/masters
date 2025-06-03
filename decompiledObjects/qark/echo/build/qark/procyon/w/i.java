// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w;

import android.os.BaseBundle;
import android.content.LocusId;
import android.app.Notification$BubbleMetadata;
import android.app.Person;
import android.media.AudioAttributes;
import android.app.PendingIntent;
import android.app.Notification$Action;
import android.app.RemoteInput;
import android.app.Notification$Action$Builder;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Collection;
import t.b;
import java.util.Iterator;
import android.app.Notification;
import android.support.v4.media.a;
import android.net.Uri;
import android.text.TextUtils;
import android.os.Build$VERSION;
import java.util.ArrayList;
import android.os.Bundle;
import java.util.List;
import android.widget.RemoteViews;
import android.app.Notification$Builder;
import android.content.Context;

public class i implements w.g
{
    public final Context a;
    public final Notification$Builder b;
    public final w.h.e c;
    public RemoteViews d;
    public RemoteViews e;
    public final List f;
    public final Bundle g;
    public int h;
    public RemoteViews i;
    
    public i(final w.h.e c) {
        this.f = new ArrayList();
        this.g = new Bundle();
        this.c = c;
        final Context a = c.a;
        this.a = a;
        Notification$Builder a2;
        if (Build$VERSION.SDK_INT >= 26) {
            a2 = w.i.h.a(a, c.K);
        }
        else {
            a2 = new Notification$Builder(c.a);
        }
        this.b = a2;
        final Notification r = c.R;
        this.b.setWhen(r.when).setSmallIcon(r.icon, r.iconLevel).setContent(r.contentView).setTicker(r.tickerText, c.i).setVibrate(r.vibrate).setLights(r.ledARGB, r.ledOnMS, r.ledOffMS).setOngoing((r.flags & 0x2) != 0x0).setOnlyAlertOnce((r.flags & 0x8) != 0x0).setAutoCancel((r.flags & 0x10) != 0x0).setDefaults(r.defaults).setContentTitle(c.e).setContentText(c.f).setContentInfo(c.k).setContentIntent(c.g).setDeleteIntent(r.deleteIntent).setFullScreenIntent(c.h, (r.flags & 0x80) != 0x0).setLargeIcon(c.j).setNumber(c.l).setProgress(c.t, c.u, c.v);
        w.i.a.b(w.i.a.d(w.i.a.c(this.b, c.q), c.o), c.m);
        final Iterator<w.h.a> iterator = (Iterator<w.h.a>)c.b.iterator();
        while (iterator.hasNext()) {
            this.b(iterator.next());
        }
        final Bundle d = c.D;
        if (d != null) {
            this.g.putAll(d);
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        this.d = c.H;
        this.e = c.I;
        w.i.b.a(this.b, c.n);
        w.i.d.i(this.b, c.z);
        w.i.d.g(this.b, c.w);
        w.i.d.j(this.b, c.y);
        w.i.d.h(this.b, c.x);
        this.h = c.O;
        w.i.e.b(this.b, c.C);
        w.i.e.c(this.b, c.E);
        w.i.e.f(this.b, c.F);
        w.i.e.d(this.b, c.G);
        w.i.e.e(this.b, r.sound, r.audioAttributes);
        List list;
        if (sdk_INT < 28) {
            list = e(g(c.c), c.U);
        }
        else {
            list = c.U;
        }
        if (list != null && !list.isEmpty()) {
            final Iterator<String> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                w.i.e.a(this.b, iterator2.next());
            }
        }
        this.i = c.J;
        if (c.d.size() > 0) {
            Bundle bundle;
            if ((bundle = c.d().getBundle("android.car.EXTENSIONS")) == null) {
                bundle = new Bundle();
            }
            final Bundle bundle2 = new Bundle(bundle);
            final Bundle bundle3 = new Bundle();
            for (int i = 0; i < c.d.size(); ++i) {
                bundle3.putBundle(Integer.toString(i), w.j.a((w.h.a)c.d.get(i)));
            }
            bundle.putBundle("invisible_actions", bundle3);
            bundle2.putBundle("invisible_actions", bundle3);
            c.d().putBundle("android.car.EXTENSIONS", bundle);
            this.g.putBundle("android.car.EXTENSIONS", bundle2);
        }
        final int sdk_INT2 = Build$VERSION.SDK_INT;
        final Object t = c.T;
        if (t != null) {
            w.i.f.b(this.b, t);
        }
        if (sdk_INT2 >= 24) {
            w.i.c.a(this.b, c.D);
            w.i.g.e(this.b, c.s);
            final RemoteViews h = c.H;
            if (h != null) {
                w.i.g.c(this.b, h);
            }
            final RemoteViews j = c.I;
            if (j != null) {
                w.i.g.b(this.b, j);
            }
            final RemoteViews k = c.J;
            if (k != null) {
                w.i.g.d(this.b, k);
            }
        }
        if (sdk_INT2 >= 26) {
            w.i.h.b(this.b, c.L);
            w.i.h.e(this.b, c.r);
            w.i.h.f(this.b, c.M);
            w.i.h.g(this.b, c.N);
            w.i.h.d(this.b, c.O);
            if (c.B) {
                w.i.h.c(this.b, c.A);
            }
            if (!TextUtils.isEmpty((CharSequence)c.K)) {
                this.b.setSound((Uri)null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[])null);
            }
        }
        if (sdk_INT2 >= 28) {
            final Iterator<Object> iterator3 = (Iterator<Object>)c.c.iterator();
            if (iterator3.hasNext()) {
                android.support.v4.media.a.a(iterator3.next());
                throw null;
            }
        }
        if (sdk_INT2 >= 29) {
            j.a(this.b, c.Q);
            j.b(this.b, w.h.d.a(null));
        }
        if (sdk_INT2 >= 31) {
            final int p = c.P;
            if (p != 0) {
                k.b(this.b, p);
            }
        }
        if (c.S) {
            if (this.c.x) {
                this.h = 2;
            }
            else {
                this.h = 1;
            }
            this.b.setVibrate((long[])null);
            this.b.setSound((Uri)null);
            final int n = r.defaults & 0xFFFFFFFC;
            r.defaults = n;
            this.b.setDefaults(n);
            if (sdk_INT2 >= 26) {
                if (TextUtils.isEmpty((CharSequence)this.c.w)) {
                    w.i.d.g(this.b, "silent");
                }
                w.i.h.d(this.b, this.h);
            }
        }
    }
    
    public static List e(final List list, final List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        final t.b c = new t.b(list.size() + list2.size());
        c.addAll(list);
        c.addAll(list2);
        return new ArrayList(c);
    }
    
    public static List g(final List list) {
        if (list == null) {
            return null;
        }
        final ArrayList list2 = new ArrayList(list.size());
        final Iterator<Object> iterator = list.iterator();
        if (!iterator.hasNext()) {
            return list2;
        }
        android.support.v4.media.a.a(iterator.next());
        throw null;
    }
    
    @Override
    public Notification$Builder a() {
        return this.b;
    }
    
    public final void b(final w.h.a a) {
        final IconCompat d = a.d();
        Icon n;
        if (d != null) {
            n = d.n();
        }
        else {
            n = null;
        }
        final Notification$Action$Builder a2 = w.i.f.a(n, a.h(), a.a());
        if (a.e() != null) {
            final RemoteInput[] b = l.b(a.e());
            for (int length = b.length, i = 0; i < length; ++i) {
                w.i.d.c(a2, b[i]);
            }
        }
        Bundle bundle;
        if (a.c() != null) {
            bundle = new Bundle(a.c());
        }
        else {
            bundle = new Bundle();
        }
        ((BaseBundle)bundle).putBoolean("android.support.allowGeneratedReplies", a.b());
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 24) {
            w.i.g.a(a2, a.b());
        }
        ((BaseBundle)bundle).putInt("android.support.action.semanticAction", a.f());
        if (sdk_INT >= 28) {
            w.i.i.b(a2, a.f());
        }
        if (sdk_INT >= 29) {
            j.c(a2, a.j());
        }
        if (sdk_INT >= 31) {
            k.a(a2, a.i());
        }
        ((BaseBundle)bundle).putBoolean("android.support.action.showsUserInterface", a.g());
        w.i.d.b(a2, bundle);
        w.i.d.a(this.b, w.i.d.d(a2));
    }
    
    public Notification c() {
        final w.h.f p = this.c.p;
        if (p != null) {
            p.b(this);
        }
        RemoteViews contentView;
        if (p != null) {
            contentView = p.e(this);
        }
        else {
            contentView = null;
        }
        final Notification d = this.d();
        Label_0064: {
            if (contentView == null) {
                contentView = this.c.H;
                if (contentView == null) {
                    break Label_0064;
                }
            }
            d.contentView = contentView;
        }
        if (p != null) {
            final RemoteViews d2 = p.d(this);
            if (d2 != null) {
                d.bigContentView = d2;
            }
        }
        if (p != null) {
            final RemoteViews f = this.c.p.f(this);
            if (f != null) {
                d.headsUpContentView = f;
            }
        }
        if (p != null) {
            final Bundle a = w.h.a(d);
            if (a != null) {
                p.a(a);
            }
        }
        return d;
    }
    
    public Notification d() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 26) {
            return w.i.a.a(this.b);
        }
        if (sdk_INT >= 24) {
            final Notification a = w.i.a.a(this.b);
            if (this.h != 0) {
                if (w.i.d.f(a) != null && (a.flags & 0x200) != 0x0 && this.h == 2) {
                    this.h(a);
                }
                if (w.i.d.f(a) != null && (a.flags & 0x200) == 0x0 && this.h == 1) {
                    this.h(a);
                }
            }
            return a;
        }
        w.i.c.a(this.b, this.g);
        final Notification a2 = w.i.a.a(this.b);
        final RemoteViews d = this.d;
        if (d != null) {
            a2.contentView = d;
        }
        final RemoteViews e = this.e;
        if (e != null) {
            a2.bigContentView = e;
        }
        final RemoteViews i = this.i;
        if (i != null) {
            a2.headsUpContentView = i;
        }
        if (this.h != 0) {
            if (w.i.d.f(a2) != null && (a2.flags & 0x200) != 0x0 && this.h == 2) {
                this.h(a2);
            }
            if (w.i.d.f(a2) != null && (a2.flags & 0x200) == 0x0 && this.h == 1) {
                this.h(a2);
            }
        }
        return a2;
    }
    
    public Context f() {
        return this.a;
    }
    
    public final void h(final Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= 0xFFFFFFFC;
    }
    
    public abstract static class a
    {
        public static Notification a(final Notification$Builder notification$Builder) {
            return notification$Builder.build();
        }
        
        public static Notification$Builder b(final Notification$Builder notification$Builder, final int priority) {
            return notification$Builder.setPriority(priority);
        }
        
        public static Notification$Builder c(final Notification$Builder notification$Builder, final CharSequence subText) {
            return notification$Builder.setSubText(subText);
        }
        
        public static Notification$Builder d(final Notification$Builder notification$Builder, final boolean usesChronometer) {
            return notification$Builder.setUsesChronometer(usesChronometer);
        }
    }
    
    public abstract static class b
    {
        public static Notification$Builder a(final Notification$Builder notification$Builder, final boolean showWhen) {
            return notification$Builder.setShowWhen(showWhen);
        }
    }
    
    public abstract static class c
    {
        public static Notification$Builder a(final Notification$Builder notification$Builder, final Bundle extras) {
            return notification$Builder.setExtras(extras);
        }
    }
    
    public abstract static class d
    {
        public static Notification$Builder a(final Notification$Builder notification$Builder, final Notification$Action notification$Action) {
            return notification$Builder.addAction(notification$Action);
        }
        
        public static Notification$Action$Builder b(final Notification$Action$Builder notification$Action$Builder, final Bundle bundle) {
            return notification$Action$Builder.addExtras(bundle);
        }
        
        public static Notification$Action$Builder c(final Notification$Action$Builder notification$Action$Builder, final RemoteInput remoteInput) {
            return notification$Action$Builder.addRemoteInput(remoteInput);
        }
        
        public static Notification$Action d(final Notification$Action$Builder notification$Action$Builder) {
            return notification$Action$Builder.build();
        }
        
        public static Notification$Action$Builder e(final int n, final CharSequence charSequence, final PendingIntent pendingIntent) {
            return new Notification$Action$Builder(n, charSequence, pendingIntent);
        }
        
        public static String f(final Notification notification) {
            return notification.getGroup();
        }
        
        public static Notification$Builder g(final Notification$Builder notification$Builder, final String group) {
            return notification$Builder.setGroup(group);
        }
        
        public static Notification$Builder h(final Notification$Builder notification$Builder, final boolean groupSummary) {
            return notification$Builder.setGroupSummary(groupSummary);
        }
        
        public static Notification$Builder i(final Notification$Builder notification$Builder, final boolean localOnly) {
            return notification$Builder.setLocalOnly(localOnly);
        }
        
        public static Notification$Builder j(final Notification$Builder notification$Builder, final String sortKey) {
            return notification$Builder.setSortKey(sortKey);
        }
    }
    
    public abstract static class e
    {
        public static Notification$Builder a(final Notification$Builder notification$Builder, final String s) {
            return notification$Builder.addPerson(s);
        }
        
        public static Notification$Builder b(final Notification$Builder notification$Builder, final String category) {
            return notification$Builder.setCategory(category);
        }
        
        public static Notification$Builder c(final Notification$Builder notification$Builder, final int color) {
            return notification$Builder.setColor(color);
        }
        
        public static Notification$Builder d(final Notification$Builder notification$Builder, final Notification publicVersion) {
            return notification$Builder.setPublicVersion(publicVersion);
        }
        
        public static Notification$Builder e(final Notification$Builder notification$Builder, final Uri uri, final Object o) {
            return notification$Builder.setSound(uri, (AudioAttributes)o);
        }
        
        public static Notification$Builder f(final Notification$Builder notification$Builder, final int visibility) {
            return notification$Builder.setVisibility(visibility);
        }
    }
    
    public abstract static class f
    {
        public static Notification$Action$Builder a(final Icon icon, final CharSequence charSequence, final PendingIntent pendingIntent) {
            return new Notification$Action$Builder(icon, charSequence, pendingIntent);
        }
        
        public static Notification$Builder b(final Notification$Builder notification$Builder, final Object o) {
            return notification$Builder.setSmallIcon((Icon)o);
        }
    }
    
    public abstract static class g
    {
        public static Notification$Action$Builder a(final Notification$Action$Builder notification$Action$Builder, final boolean allowGeneratedReplies) {
            return notification$Action$Builder.setAllowGeneratedReplies(allowGeneratedReplies);
        }
        
        public static Notification$Builder b(final Notification$Builder notification$Builder, final RemoteViews customBigContentView) {
            return notification$Builder.setCustomBigContentView(customBigContentView);
        }
        
        public static Notification$Builder c(final Notification$Builder notification$Builder, final RemoteViews customContentView) {
            return notification$Builder.setCustomContentView(customContentView);
        }
        
        public static Notification$Builder d(final Notification$Builder notification$Builder, final RemoteViews customHeadsUpContentView) {
            return notification$Builder.setCustomHeadsUpContentView(customHeadsUpContentView);
        }
        
        public static Notification$Builder e(final Notification$Builder notification$Builder, final CharSequence[] remoteInputHistory) {
            return notification$Builder.setRemoteInputHistory(remoteInputHistory);
        }
    }
    
    public abstract static class h
    {
        public static Notification$Builder a(final Context context, final String s) {
            return new Notification$Builder(context, s);
        }
        
        public static Notification$Builder b(final Notification$Builder notification$Builder, final int badgeIconType) {
            return notification$Builder.setBadgeIconType(badgeIconType);
        }
        
        public static Notification$Builder c(final Notification$Builder notification$Builder, final boolean colorized) {
            return notification$Builder.setColorized(colorized);
        }
        
        public static Notification$Builder d(final Notification$Builder notification$Builder, final int groupAlertBehavior) {
            return notification$Builder.setGroupAlertBehavior(groupAlertBehavior);
        }
        
        public static Notification$Builder e(final Notification$Builder notification$Builder, final CharSequence settingsText) {
            return notification$Builder.setSettingsText(settingsText);
        }
        
        public static Notification$Builder f(final Notification$Builder notification$Builder, final String shortcutId) {
            return notification$Builder.setShortcutId(shortcutId);
        }
        
        public static Notification$Builder g(final Notification$Builder notification$Builder, final long timeoutAfter) {
            return notification$Builder.setTimeoutAfter(timeoutAfter);
        }
    }
    
    public abstract static class i
    {
        public static Notification$Builder a(final Notification$Builder notification$Builder, final Person person) {
            return notification$Builder.addPerson(person);
        }
        
        public static Notification$Action$Builder b(final Notification$Action$Builder notification$Action$Builder, final int semanticAction) {
            return notification$Action$Builder.setSemanticAction(semanticAction);
        }
    }
    
    public abstract static class j
    {
        public static Notification$Builder a(final Notification$Builder notification$Builder, final boolean allowSystemGeneratedContextualActions) {
            return notification$Builder.setAllowSystemGeneratedContextualActions(allowSystemGeneratedContextualActions);
        }
        
        public static Notification$Builder b(final Notification$Builder notification$Builder, final Notification$BubbleMetadata bubbleMetadata) {
            return notification$Builder.setBubbleMetadata(bubbleMetadata);
        }
        
        public static Notification$Action$Builder c(final Notification$Action$Builder notification$Action$Builder, final boolean contextual) {
            return notification$Action$Builder.setContextual(contextual);
        }
        
        public static Notification$Builder d(final Notification$Builder notification$Builder, final Object o) {
            return notification$Builder.setLocusId((LocusId)o);
        }
    }
    
    public abstract static class k
    {
        public static Notification$Action$Builder a(final Notification$Action$Builder notification$Action$Builder, final boolean authenticationRequired) {
            return notification$Action$Builder.setAuthenticationRequired(authenticationRequired);
        }
        
        public static Notification$Builder b(final Notification$Builder notification$Builder, final int foregroundServiceBehavior) {
            return notification$Builder.setForegroundServiceBehavior(foregroundServiceBehavior);
        }
    }
}
