package w;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t.C1959b;
import w.h;

/* loaded from: classes.dex */
public class i implements w.g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f20280a;

    /* renamed from: b, reason: collision with root package name */
    public final Notification.Builder f20281b;

    /* renamed from: c, reason: collision with root package name */
    public final h.e f20282c;

    /* renamed from: d, reason: collision with root package name */
    public RemoteViews f20283d;

    /* renamed from: e, reason: collision with root package name */
    public RemoteViews f20284e;

    /* renamed from: f, reason: collision with root package name */
    public final List f20285f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f20286g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public int f20287h;

    /* renamed from: i, reason: collision with root package name */
    public RemoteViews f20288i;

    public static class a {
        public static Notification a(Notification.Builder builder) {
            return builder.build();
        }

        public static Notification.Builder b(Notification.Builder builder, int i7) {
            return builder.setPriority(i7);
        }

        public static Notification.Builder c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        public static Notification.Builder d(Notification.Builder builder, boolean z7) {
            return builder.setUsesChronometer(z7);
        }
    }

    public static class b {
        public static Notification.Builder a(Notification.Builder builder, boolean z7) {
            return builder.setShowWhen(z7);
        }
    }

    public static class c {
        public static Notification.Builder a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    public static class d {
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

        public static Notification.Action.Builder e(int i7, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i7, charSequence, pendingIntent);
        }

        public static String f(Notification notification) {
            return notification.getGroup();
        }

        public static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder h(Notification.Builder builder, boolean z7) {
            return builder.setGroupSummary(z7);
        }

        public static Notification.Builder i(Notification.Builder builder, boolean z7) {
            return builder.setLocalOnly(z7);
        }

        public static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    public static class e {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder c(Notification.Builder builder, int i7) {
            return builder.setColor(i7);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder f(Notification.Builder builder, int i7) {
            return builder.setVisibility(i7);
        }
    }

    public static class f {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    public static class g {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z7) {
            return builder.setAllowGeneratedReplies(z7);
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

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    public static class h {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder b(Notification.Builder builder, int i7) {
            return builder.setBadgeIconType(i7);
        }

        public static Notification.Builder c(Notification.Builder builder, boolean z7) {
            return builder.setColorized(z7);
        }

        public static Notification.Builder d(Notification.Builder builder, int i7) {
            return builder.setGroupAlertBehavior(i7);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder g(Notification.Builder builder, long j7) {
            return builder.setTimeoutAfter(j7);
        }
    }

    /* renamed from: w.i$i, reason: collision with other inner class name */
    public static class C0286i {
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i7) {
            return builder.setSemanticAction(i7);
        }
    }

    public static class j {
        public static Notification.Builder a(Notification.Builder builder, boolean z7) {
            return builder.setAllowSystemGeneratedContextualActions(z7);
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z7) {
            return builder.setContextual(z7);
        }

        public static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    public static class k {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z7) {
            return builder.setAuthenticationRequired(z7);
        }

        public static Notification.Builder b(Notification.Builder builder, int i7) {
            return builder.setForegroundServiceBehavior(i7);
        }
    }

    public i(h.e eVar) {
        int i7;
        this.f20282c = eVar;
        Context context = eVar.f20250a;
        this.f20280a = context;
        this.f20281b = Build.VERSION.SDK_INT >= 26 ? h.a(context, eVar.f20239K) : new Notification.Builder(eVar.f20250a);
        Notification notification = eVar.f20246R;
        this.f20281b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f20258i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f20254e).setContentText(eVar.f20255f).setContentInfo(eVar.f20260k).setContentIntent(eVar.f20256g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f20257h, (notification.flags & 128) != 0).setLargeIcon(eVar.f20259j).setNumber(eVar.f20261l).setProgress(eVar.f20269t, eVar.f20270u, eVar.f20271v);
        a.b(a.d(a.c(this.f20281b, eVar.f20266q), eVar.f20264o), eVar.f20262m);
        Iterator it = eVar.f20251b.iterator();
        while (it.hasNext()) {
            b((h.a) it.next());
        }
        Bundle bundle = eVar.f20232D;
        if (bundle != null) {
            this.f20286g.putAll(bundle);
        }
        int i8 = Build.VERSION.SDK_INT;
        this.f20283d = eVar.f20236H;
        this.f20284e = eVar.f20237I;
        b.a(this.f20281b, eVar.f20263n);
        d.i(this.f20281b, eVar.f20275z);
        d.g(this.f20281b, eVar.f20272w);
        d.j(this.f20281b, eVar.f20274y);
        d.h(this.f20281b, eVar.f20273x);
        this.f20287h = eVar.f20243O;
        e.b(this.f20281b, eVar.f20231C);
        e.c(this.f20281b, eVar.f20233E);
        e.f(this.f20281b, eVar.f20234F);
        e.d(this.f20281b, eVar.f20235G);
        e.e(this.f20281b, notification.sound, notification.audioAttributes);
        List e7 = i8 < 28 ? e(g(eVar.f20252c), eVar.f20249U) : eVar.f20249U;
        if (e7 != null && !e7.isEmpty()) {
            Iterator it2 = e7.iterator();
            while (it2.hasNext()) {
                e.a(this.f20281b, (String) it2.next());
            }
        }
        this.f20288i = eVar.f20238J;
        if (eVar.f20253d.size() > 0) {
            Bundle bundle2 = eVar.d().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i9 = 0; i9 < eVar.f20253d.size(); i9++) {
                bundle4.putBundle(Integer.toString(i9), w.j.a((h.a) eVar.f20253d.get(i9)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.d().putBundle("android.car.EXTENSIONS", bundle2);
            this.f20286g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i10 = Build.VERSION.SDK_INT;
        Object obj = eVar.f20248T;
        if (obj != null) {
            f.b(this.f20281b, obj);
        }
        if (i10 >= 24) {
            c.a(this.f20281b, eVar.f20232D);
            g.e(this.f20281b, eVar.f20268s);
            RemoteViews remoteViews = eVar.f20236H;
            if (remoteViews != null) {
                g.c(this.f20281b, remoteViews);
            }
            RemoteViews remoteViews2 = eVar.f20237I;
            if (remoteViews2 != null) {
                g.b(this.f20281b, remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.f20238J;
            if (remoteViews3 != null) {
                g.d(this.f20281b, remoteViews3);
            }
        }
        if (i10 >= 26) {
            h.b(this.f20281b, eVar.f20240L);
            h.e(this.f20281b, eVar.f20267r);
            h.f(this.f20281b, eVar.f20241M);
            h.g(this.f20281b, eVar.f20242N);
            h.d(this.f20281b, eVar.f20243O);
            if (eVar.f20230B) {
                h.c(this.f20281b, eVar.f20229A);
            }
            if (!TextUtils.isEmpty(eVar.f20239K)) {
                this.f20281b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i10 >= 28) {
            Iterator it3 = eVar.f20252c.iterator();
            if (it3.hasNext()) {
                android.support.v4.media.a.a(it3.next());
                throw null;
            }
        }
        if (i10 >= 29) {
            j.a(this.f20281b, eVar.f20245Q);
            j.b(this.f20281b, h.d.a(null));
        }
        if (i10 >= 31 && (i7 = eVar.f20244P) != 0) {
            k.b(this.f20281b, i7);
        }
        if (eVar.f20247S) {
            if (this.f20282c.f20273x) {
                this.f20287h = 2;
            } else {
                this.f20287h = 1;
            }
            this.f20281b.setVibrate(null);
            this.f20281b.setSound(null);
            int i11 = notification.defaults & (-4);
            notification.defaults = i11;
            this.f20281b.setDefaults(i11);
            if (i10 >= 26) {
                if (TextUtils.isEmpty(this.f20282c.f20272w)) {
                    d.g(this.f20281b, "silent");
                }
                h.d(this.f20281b, this.f20287h);
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
        C1959b c1959b = new C1959b(list.size() + list2.size());
        c1959b.addAll(list);
        c1959b.addAll(list2);
        return new ArrayList(c1959b);
    }

    public static List g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        android.support.v4.media.a.a(it.next());
        throw null;
    }

    @Override // w.g
    public Notification.Builder a() {
        return this.f20281b;
    }

    public final void b(h.a aVar) {
        IconCompat d7 = aVar.d();
        Notification.Action.Builder a7 = f.a(d7 != null ? d7.n() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : l.b(aVar.e())) {
                d.c(a7, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 24) {
            g.a(a7, aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i7 >= 28) {
            C0286i.b(a7, aVar.f());
        }
        if (i7 >= 29) {
            j.c(a7, aVar.j());
        }
        if (i7 >= 31) {
            k.a(a7, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        d.b(a7, bundle);
        d.a(this.f20281b, d.d(a7));
    }

    public Notification c() {
        Bundle a7;
        RemoteViews f7;
        RemoteViews d7;
        h.f fVar = this.f20282c.f20265p;
        if (fVar != null) {
            fVar.b(this);
        }
        RemoteViews e7 = fVar != null ? fVar.e(this) : null;
        Notification d8 = d();
        if (e7 != null || (e7 = this.f20282c.f20236H) != null) {
            d8.contentView = e7;
        }
        if (fVar != null && (d7 = fVar.d(this)) != null) {
            d8.bigContentView = d7;
        }
        if (fVar != null && (f7 = this.f20282c.f20265p.f(this)) != null) {
            d8.headsUpContentView = f7;
        }
        if (fVar != null && (a7 = w.h.a(d8)) != null) {
            fVar.a(a7);
        }
        return d8;
    }

    public Notification d() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            return a.a(this.f20281b);
        }
        if (i7 >= 24) {
            Notification a7 = a.a(this.f20281b);
            if (this.f20287h != 0) {
                if (d.f(a7) != null && (a7.flags & 512) != 0 && this.f20287h == 2) {
                    h(a7);
                }
                if (d.f(a7) != null && (a7.flags & 512) == 0 && this.f20287h == 1) {
                    h(a7);
                }
            }
            return a7;
        }
        c.a(this.f20281b, this.f20286g);
        Notification a8 = a.a(this.f20281b);
        RemoteViews remoteViews = this.f20283d;
        if (remoteViews != null) {
            a8.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f20284e;
        if (remoteViews2 != null) {
            a8.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f20288i;
        if (remoteViews3 != null) {
            a8.headsUpContentView = remoteViews3;
        }
        if (this.f20287h != 0) {
            if (d.f(a8) != null && (a8.flags & 512) != 0 && this.f20287h == 2) {
                h(a8);
            }
            if (d.f(a8) != null && (a8.flags & 512) == 0 && this.f20287h == 1) {
                h(a8);
            }
        }
        return a8;
    }

    public Context f() {
        return this.f20280a;
    }

    public final void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }
}
