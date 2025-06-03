package u;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import io.meduza.meduza.R;
import java.util.ArrayList;
import java.util.Iterator;
import u.x;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14846a;

    /* renamed from: b, reason: collision with root package name */
    public final Notification.Builder f14847b;

    /* renamed from: c, reason: collision with root package name */
    public final q f14848c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f14849d;

    public static class a {
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

        public static Notification.Action.Builder e(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i10, charSequence, pendingIntent);
        }

        public static String f(Notification notification) {
            return notification.getGroup();
        }

        public static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder h(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        public static Notification.Builder i(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        public static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    public static class b {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    public static class c {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        public static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    public static class d {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            Notification.Action.Builder allowGeneratedReplies;
            allowGeneratedReplies = builder.setAllowGeneratedReplies(z10);
            return allowGeneratedReplies;
        }

        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            Notification.Builder customBigContentView;
            customBigContentView = builder.setCustomBigContentView(remoteViews);
            return customBigContentView;
        }

        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            Notification.Builder customContentView;
            customContentView = builder.setCustomContentView(remoteViews);
            return customContentView;
        }

        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            Notification.Builder customHeadsUpContentView;
            customHeadsUpContentView = builder.setCustomHeadsUpContentView(remoteViews);
            return customHeadsUpContentView;
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            Notification.Builder remoteInputHistory;
            remoteInputHistory = builder.setRemoteInputHistory(charSequenceArr);
            return remoteInputHistory;
        }
    }

    public static class e {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder b(Notification.Builder builder, int i10) {
            Notification.Builder badgeIconType;
            badgeIconType = builder.setBadgeIconType(i10);
            return badgeIconType;
        }

        public static Notification.Builder c(Notification.Builder builder, boolean z10) {
            Notification.Builder colorized;
            colorized = builder.setColorized(z10);
            return colorized;
        }

        public static Notification.Builder d(Notification.Builder builder, int i10) {
            Notification.Builder groupAlertBehavior;
            groupAlertBehavior = builder.setGroupAlertBehavior(i10);
            return groupAlertBehavior;
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            Notification.Builder settingsText;
            settingsText = builder.setSettingsText(charSequence);
            return settingsText;
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            Notification.Builder shortcutId;
            shortcutId = builder.setShortcutId(str);
            return shortcutId;
        }

        public static Notification.Builder g(Notification.Builder builder, long j10) {
            Notification.Builder timeoutAfter;
            timeoutAfter = builder.setTimeoutAfter(j10);
            return timeoutAfter;
        }
    }

    public static class f {
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            Notification.Builder addPerson;
            addPerson = builder.addPerson(person);
            return addPerson;
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            Notification.Action.Builder semanticAction;
            semanticAction = builder.setSemanticAction(i10);
            return semanticAction;
        }
    }

    public static class g {
        public static Notification.Builder a(Notification.Builder builder, boolean z10) {
            Notification.Builder allowSystemGeneratedContextualActions;
            allowSystemGeneratedContextualActions = builder.setAllowSystemGeneratedContextualActions(z10);
            return allowSystemGeneratedContextualActions;
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            Notification.Builder bubbleMetadata2;
            bubbleMetadata2 = builder.setBubbleMetadata(bubbleMetadata);
            return bubbleMetadata2;
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            Notification.Action.Builder contextual;
            contextual = builder.setContextual(z10);
            return contextual;
        }

        public static Notification.Builder d(Notification.Builder builder, Object obj) {
            Notification.Builder locusId;
            locusId = builder.setLocusId((LocusId) obj);
            return locusId;
        }
    }

    public static class h {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            Notification.Action.Builder authenticationRequired;
            authenticationRequired = builder.setAuthenticationRequired(z10);
            return authenticationRequired;
        }

        public static Notification.Builder b(Notification.Builder builder, int i10) {
            Notification.Builder foregroundServiceBehavior;
            foregroundServiceBehavior = builder.setForegroundServiceBehavior(i10);
            return foregroundServiceBehavior;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v24, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v25, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r5v27, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r6v28, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.os.Bundle[]] */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.os.Parcelable[]] */
    /* JADX WARN: Type inference failed for: r7v6 */
    public t(q qVar) {
        ArrayList<String> arrayList;
        String str;
        int i10;
        t tVar = this;
        new ArrayList();
        tVar.f14849d = new Bundle();
        tVar.f14848c = qVar;
        Context context = qVar.f14821a;
        tVar.f14846a = context;
        Notification.Builder a10 = Build.VERSION.SDK_INT >= 26 ? e.a(context, qVar.f14843y) : new Notification.Builder(qVar.f14821a);
        tVar.f14847b = a10;
        Notification notification = qVar.B;
        ?? r72 = 0;
        int i11 = 2;
        int i12 = 0;
        a10.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(qVar.f14825e).setContentText(qVar.f).setContentInfo(null).setContentIntent(qVar.f14826g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(qVar.f14828i).setProgress(qVar.f14834o, qVar.f14835p, qVar.f14836q);
        IconCompat iconCompat = qVar.f14827h;
        c.b(a10, iconCompat == null ? null : IconCompat.a.f(iconCompat, context));
        a10.setSubText(qVar.f14833n).setUsesChronometer(qVar.f14831l).setPriority(qVar.f14829j);
        s sVar = qVar.f14832m;
        if (sVar instanceof r) {
            r rVar = (r) sVar;
            Integer valueOf = Integer.valueOf(v.a.getColor(rVar.f14845a.f14821a, R.color.call_notification_decline_color));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) rVar.f14845a.f14821a.getResources().getString(R.string.call_notification_hang_up_action));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(valueOf.intValue()), 0, spannableStringBuilder.length(), 18);
            Context context2 = rVar.f14845a.f14821a;
            PorterDuff.Mode mode = IconCompat.f941k;
            context2.getClass();
            IconCompat d10 = IconCompat.d(context2.getResources(), context2.getPackageName(), 2131230927);
            Bundle bundle = new Bundle();
            CharSequence b10 = q.b(spannableStringBuilder);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            n nVar = new n(d10, b10, null, bundle, arrayList3.isEmpty() ? null : (z[]) arrayList3.toArray(new z[arrayList3.size()]), arrayList2.isEmpty() ? null : (z[]) arrayList2.toArray(new z[arrayList2.size()]), true, 0, true, false, false);
            nVar.f14807a.putBoolean("key_action_priority", true);
            ArrayList arrayList4 = new ArrayList(3);
            arrayList4.add(nVar);
            ArrayList<n> arrayList5 = rVar.f14845a.f14822b;
            if (arrayList5 != null) {
                Iterator<n> it = arrayList5.iterator();
                while (it.hasNext()) {
                    n next = it.next();
                    if (next.f14812g) {
                        arrayList4.add(next);
                    } else if (!next.f14807a.getBoolean("key_action_priority") && i11 > 1) {
                        arrayList4.add(next);
                        i11--;
                    }
                }
            }
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                tVar.a((n) it2.next());
            }
        } else {
            Iterator<n> it3 = qVar.f14822b.iterator();
            while (it3.hasNext()) {
                tVar.a(it3.next());
            }
        }
        Bundle bundle2 = qVar.f14840v;
        if (bundle2 != null) {
            tVar.f14849d.putAll(bundle2);
        }
        int i13 = Build.VERSION.SDK_INT;
        tVar.f14847b.setShowWhen(qVar.f14830k);
        a.i(tVar.f14847b, qVar.f14838s);
        a.g(tVar.f14847b, qVar.f14837r);
        a.j(tVar.f14847b, null);
        a.h(tVar.f14847b, false);
        b.b(tVar.f14847b, null);
        b.c(tVar.f14847b, qVar.f14841w);
        b.f(tVar.f14847b, qVar.f14842x);
        b.d(tVar.f14847b, null);
        b.e(tVar.f14847b, notification.sound, notification.audioAttributes);
        String str2 = "";
        if (i13 < 28) {
            ArrayList<x> arrayList6 = qVar.f14823c;
            if (arrayList6 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(arrayList6.size());
                Iterator<x> it4 = arrayList6.iterator();
                while (it4.hasNext()) {
                    x next2 = it4.next();
                    String str3 = next2.f14873c;
                    if (str3 == null) {
                        if (next2.f14871a != null) {
                            StringBuilder l10 = defpackage.f.l("name:");
                            l10.append((Object) next2.f14871a);
                            str3 = l10.toString();
                        } else {
                            str3 = "";
                        }
                    }
                    arrayList.add(str3);
                }
            }
            ArrayList<String> arrayList7 = qVar.C;
            if (arrayList == null) {
                arrayList = arrayList7;
            } else if (arrayList7 != null) {
                r.d dVar = new r.d(arrayList7.size() + arrayList.size());
                dVar.addAll(arrayList);
                dVar.addAll(arrayList7);
                arrayList = new ArrayList<>(dVar);
            }
        } else {
            arrayList = qVar.C;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<String> it5 = arrayList.iterator();
            while (it5.hasNext()) {
                b.a(tVar.f14847b, it5.next());
            }
        }
        if (qVar.f14824d.size() > 0) {
            if (qVar.f14840v == null) {
                qVar.f14840v = new Bundle();
            }
            Bundle bundle3 = qVar.f14840v.getBundle("android.car.EXTENSIONS");
            ?? bundle4 = bundle3 == null ? new Bundle() : bundle3;
            ?? bundle5 = new Bundle((Bundle) bundle4);
            ?? bundle6 = new Bundle();
            int i14 = 0;
            while (i12 < qVar.f14824d.size()) {
                String num = Integer.toString(i12);
                n nVar2 = qVar.f14824d.get(i12);
                ?? bundle7 = new Bundle();
                if (nVar2.f14808b == null && (i10 = nVar2.f14813h) != 0) {
                    nVar2.f14808b = IconCompat.d(r72, str2, i10);
                }
                IconCompat iconCompat2 = nVar2.f14808b;
                bundle7.putInt("icon", iconCompat2 != null ? iconCompat2.e() : i14);
                bundle7.putCharSequence("title", nVar2.f14814i);
                bundle7.putParcelable("actionIntent", nVar2.f14815j);
                Bundle bundle8 = nVar2.f14807a != null ? new Bundle(nVar2.f14807a) : new Bundle();
                bundle8.putBoolean("android.support.allowGeneratedReplies", nVar2.f14810d);
                bundle7.putBundle("extras", bundle8);
                z[] zVarArr = nVar2.f14809c;
                if (zVarArr != null) {
                    r72 = new Bundle[zVarArr.length];
                    while (i14 < zVarArr.length) {
                        z zVar = zVarArr[i14];
                        String str4 = str2;
                        Bundle bundle9 = new Bundle();
                        zVar.getClass();
                        bundle9.putString("resultKey", null);
                        bundle9.putCharSequence("label", null);
                        bundle9.putCharSequenceArray("choices", null);
                        bundle9.putBoolean("allowFreeFormInput", false);
                        bundle9.putBundle("extras", null);
                        r72[i14] = bundle9;
                        i14++;
                        str2 = str4;
                        zVarArr = zVarArr;
                    }
                }
                String str5 = str2;
                bundle7.putParcelableArray("remoteInputs", r72);
                bundle7.putBoolean("showsUserInterface", nVar2.f14811e);
                bundle7.putInt("semanticAction", nVar2.f);
                bundle6.putBundle(num, bundle7);
                i12++;
                i14 = 0;
                r72 = 0;
                str2 = str5;
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (qVar.f14840v == null) {
                qVar.f14840v = new Bundle();
            }
            qVar.f14840v.putBundle("android.car.EXTENSIONS", bundle4);
            tVar = this;
            tVar.f14849d.putBundle("android.car.EXTENSIONS", bundle5);
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 24) {
            tVar.f14847b.setExtras(qVar.f14840v);
            str = null;
            d.e(tVar.f14847b, null);
        } else {
            str = null;
        }
        if (i15 >= 26) {
            e.b(tVar.f14847b, qVar.f14844z);
            e.e(tVar.f14847b, str);
            e.f(tVar.f14847b, str);
            e.g(tVar.f14847b, 0L);
            e.d(tVar.f14847b, 0);
            if (qVar.f14839u) {
                e.c(tVar.f14847b, qVar.t);
            }
            if (!TextUtils.isEmpty(qVar.f14843y)) {
                tVar.f14847b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i15 >= 28) {
            Iterator<x> it6 = qVar.f14823c.iterator();
            while (it6.hasNext()) {
                x next3 = it6.next();
                Notification.Builder builder = tVar.f14847b;
                next3.getClass();
                f.a(builder, x.a.b(next3));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            g.a(tVar.f14847b, qVar.A);
            g.b(tVar.f14847b, null);
        }
    }

    public final void a(n nVar) {
        int i10;
        if (nVar.f14808b == null && (i10 = nVar.f14813h) != 0) {
            nVar.f14808b = IconCompat.d(null, "", i10);
        }
        IconCompat iconCompat = nVar.f14808b;
        Notification.Action.Builder a10 = c.a(iconCompat != null ? IconCompat.a.f(iconCompat, null) : null, nVar.f14814i, nVar.f14815j);
        z[] zVarArr = nVar.f14809c;
        if (zVarArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[zVarArr.length];
            for (int i11 = 0; i11 < zVarArr.length; i11++) {
                remoteInputArr[i11] = z.a(zVarArr[i11]);
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                a.c(a10, remoteInput);
            }
        }
        Bundle bundle = nVar.f14807a != null ? new Bundle(nVar.f14807a) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", nVar.f14810d);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 24) {
            d.a(a10, nVar.f14810d);
        }
        bundle.putInt("android.support.action.semanticAction", nVar.f);
        if (i12 >= 28) {
            f.b(a10, nVar.f);
        }
        if (i12 >= 29) {
            g.c(a10, nVar.f14812g);
        }
        if (i12 >= 31) {
            h.a(a10, nVar.f14816k);
        }
        bundle.putBoolean("android.support.action.showsUserInterface", nVar.f14811e);
        a.b(a10, bundle);
        a.a(this.f14847b, a.d(a10));
    }
}
