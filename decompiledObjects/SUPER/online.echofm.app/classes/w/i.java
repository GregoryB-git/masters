package w;

import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Action.Builder;
import android.app.Notification.BubbleMetadata;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t.b;

public class i
  implements g
{
  public final Context a;
  public final Notification.Builder b;
  public final h.e c;
  public RemoteViews d;
  public RemoteViews e;
  public final List f = new ArrayList();
  public final Bundle g = new Bundle();
  public int h;
  public RemoteViews i;
  
  public i(h.e parame)
  {
    c = parame;
    Object localObject1 = a;
    a = ((Context)localObject1);
    if (Build.VERSION.SDK_INT >= 26) {}
    for (localObject1 = h.a((Context)localObject1, K);; localObject1 = new Notification.Builder(a))
    {
      b = ((Notification.Builder)localObject1);
      break;
    }
    Notification localNotification = R;
    localObject1 = b.setWhen(when).setSmallIcon(icon, iconLevel).setContent(contentView).setTicker(tickerText, i).setVibrate(vibrate).setLights(ledARGB, ledOnMS, ledOffMS);
    boolean bool;
    if ((flags & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    localObject1 = ((Notification.Builder)localObject1).setOngoing(bool);
    if ((flags & 0x8) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    localObject1 = ((Notification.Builder)localObject1).setOnlyAlertOnce(bool);
    if ((flags & 0x10) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    Object localObject2 = ((Notification.Builder)localObject1).setAutoCancel(bool).setDefaults(defaults).setContentTitle(e).setContentText(f).setContentInfo(k).setContentIntent(g).setDeleteIntent(deleteIntent);
    localObject1 = h;
    if ((flags & 0x80) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    ((Notification.Builder)localObject2).setFullScreenIntent((PendingIntent)localObject1, bool).setLargeIcon(j).setNumber(l).setProgress(t, u, v);
    a.b(a.d(a.c(b, q), o), m);
    localObject1 = b.iterator();
    while (((Iterator)localObject1).hasNext()) {
      b((h.a)((Iterator)localObject1).next());
    }
    localObject1 = D;
    if (localObject1 != null) {
      g.putAll((Bundle)localObject1);
    }
    int j = Build.VERSION.SDK_INT;
    d = H;
    e = I;
    b.a(b, n);
    d.i(b, z);
    d.g(b, w);
    d.j(b, y);
    d.h(b, x);
    h = O;
    e.b(b, C);
    e.c(b, E);
    e.f(b, F);
    e.d(b, G);
    e.e(b, sound, audioAttributes);
    if (j < 28) {
      localObject1 = e(g(c), U);
    } else {
      localObject1 = U;
    }
    if ((localObject1 != null) && (!((List)localObject1).isEmpty()))
    {
      localObject2 = ((List)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (String)((Iterator)localObject2).next();
        e.a(b, (String)localObject1);
      }
    }
    i = J;
    if (d.size() > 0)
    {
      localObject2 = parame.d().getBundle("android.car.EXTENSIONS");
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = new Bundle();
      }
      localObject2 = new Bundle((Bundle)localObject1);
      Bundle localBundle = new Bundle();
      for (j = 0; j < d.size(); j++) {
        localBundle.putBundle(Integer.toString(j), j.a((h.a)d.get(j)));
      }
      ((Bundle)localObject1).putBundle("invisible_actions", localBundle);
      ((Bundle)localObject2).putBundle("invisible_actions", localBundle);
      parame.d().putBundle("android.car.EXTENSIONS", (Bundle)localObject1);
      g.putBundle("android.car.EXTENSIONS", (Bundle)localObject2);
    }
    j = Build.VERSION.SDK_INT;
    localObject1 = T;
    if (localObject1 != null) {
      f.b(b, localObject1);
    }
    if (j >= 24)
    {
      c.a(b, D);
      g.e(b, s);
      localObject1 = H;
      if (localObject1 != null) {
        g.c(b, (RemoteViews)localObject1);
      }
      localObject1 = I;
      if (localObject1 != null) {
        g.b(b, (RemoteViews)localObject1);
      }
      localObject1 = J;
      if (localObject1 != null) {
        g.d(b, (RemoteViews)localObject1);
      }
    }
    if (j >= 26)
    {
      h.b(b, L);
      h.e(b, r);
      h.f(b, M);
      h.g(b, N);
      h.d(b, O);
      if (B) {
        h.c(b, A);
      }
      if (!TextUtils.isEmpty(K)) {
        b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
      }
    }
    if (j >= 28)
    {
      localObject1 = c.iterator();
      if (((Iterator)localObject1).hasNext())
      {
        a.a(((Iterator)localObject1).next());
        throw null;
      }
    }
    if (j >= 29)
    {
      j.a(b, Q);
      j.b(b, h.d.a(null));
    }
    int k;
    if (j >= 31)
    {
      k = P;
      if (k != 0) {
        k.b(b, k);
      }
    }
    if (S)
    {
      if (c.x) {
        h = 2;
      } else {
        h = 1;
      }
      b.setVibrate(null);
      b.setSound(null);
      k = defaults & 0xFFFFFFFC;
      defaults = k;
      b.setDefaults(k);
      if (j >= 26)
      {
        if (TextUtils.isEmpty(c.w)) {
          d.g(b, "silent");
        }
        h.d(b, h);
      }
    }
  }
  
  public static List e(List paramList1, List paramList2)
  {
    if (paramList1 == null) {
      return paramList2;
    }
    if (paramList2 == null) {
      return paramList1;
    }
    b localb = new b(paramList1.size() + paramList2.size());
    localb.addAll(paramList1);
    localb.addAll(paramList2);
    return new ArrayList(localb);
  }
  
  public static List g(List paramList)
  {
    if (paramList == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    if (!paramList.hasNext()) {
      return localArrayList;
    }
    a.a(paramList.next());
    throw null;
  }
  
  public Notification.Builder a()
  {
    return b;
  }
  
  public final void b(h.a parama)
  {
    Object localObject = parama.d();
    if (localObject != null) {
      localObject = ((IconCompat)localObject).n();
    } else {
      localObject = null;
    }
    Notification.Action.Builder localBuilder = f.a((Icon)localObject, parama.h(), parama.a());
    if (parama.e() != null)
    {
      localObject = l.b(parama.e());
      int j = localObject.length;
      for (k = 0; k < j; k++) {
        d.c(localBuilder, localObject[k]);
      }
    }
    if (parama.c() != null) {
      localObject = new Bundle(parama.c());
    } else {
      localObject = new Bundle();
    }
    ((BaseBundle)localObject).putBoolean("android.support.allowGeneratedReplies", parama.b());
    int k = Build.VERSION.SDK_INT;
    if (k >= 24) {
      g.a(localBuilder, parama.b());
    }
    ((BaseBundle)localObject).putInt("android.support.action.semanticAction", parama.f());
    if (k >= 28) {
      i.b(localBuilder, parama.f());
    }
    if (k >= 29) {
      j.c(localBuilder, parama.j());
    }
    if (k >= 31) {
      k.a(localBuilder, parama.i());
    }
    ((BaseBundle)localObject).putBoolean("android.support.action.showsUserInterface", parama.g());
    d.b(localBuilder, (Bundle)localObject);
    d.a(b, d.d(localBuilder));
  }
  
  public Notification c()
  {
    h.f localf = c.p;
    if (localf != null) {
      localf.b(this);
    }
    Object localObject;
    if (localf != null) {
      localObject = localf.e(this);
    } else {
      localObject = null;
    }
    Notification localNotification = d();
    if (localObject != null) {}
    do
    {
      contentView = ((RemoteViews)localObject);
      break;
      localObject = c.H;
    } while (localObject != null);
    if (localf != null)
    {
      localObject = localf.d(this);
      if (localObject != null) {
        bigContentView = ((RemoteViews)localObject);
      }
    }
    if (localf != null)
    {
      localObject = c.p.f(this);
      if (localObject != null) {
        headsUpContentView = ((RemoteViews)localObject);
      }
    }
    if (localf != null)
    {
      localObject = h.a(localNotification);
      if (localObject != null) {
        localf.a((Bundle)localObject);
      }
    }
    return localNotification;
  }
  
  public Notification d()
  {
    int j = Build.VERSION.SDK_INT;
    if (j >= 26) {
      return a.a(b);
    }
    if (j >= 24)
    {
      localNotification = a.a(b);
      if (h != 0)
      {
        if ((d.f(localNotification) != null) && ((flags & 0x200) != 0) && (h == 2)) {
          h(localNotification);
        }
        if ((d.f(localNotification) != null) && ((flags & 0x200) == 0) && (h == 1)) {
          h(localNotification);
        }
      }
      return localNotification;
    }
    c.a(b, g);
    Notification localNotification = a.a(b);
    RemoteViews localRemoteViews = d;
    if (localRemoteViews != null) {
      contentView = localRemoteViews;
    }
    localRemoteViews = e;
    if (localRemoteViews != null) {
      bigContentView = localRemoteViews;
    }
    localRemoteViews = i;
    if (localRemoteViews != null) {
      headsUpContentView = localRemoteViews;
    }
    if (h != 0)
    {
      if ((d.f(localNotification) != null) && ((flags & 0x200) != 0) && (h == 2)) {
        h(localNotification);
      }
      if ((d.f(localNotification) != null) && ((flags & 0x200) == 0) && (h == 1)) {
        h(localNotification);
      }
    }
    return localNotification;
  }
  
  public Context f()
  {
    return a;
  }
  
  public final void h(Notification paramNotification)
  {
    sound = null;
    vibrate = null;
    defaults &= 0xFFFFFFFC;
  }
  
  public static abstract class a
  {
    public static Notification a(Notification.Builder paramBuilder)
    {
      return paramBuilder.build();
    }
    
    public static Notification.Builder b(Notification.Builder paramBuilder, int paramInt)
    {
      return paramBuilder.setPriority(paramInt);
    }
    
    public static Notification.Builder c(Notification.Builder paramBuilder, CharSequence paramCharSequence)
    {
      return paramBuilder.setSubText(paramCharSequence);
    }
    
    public static Notification.Builder d(Notification.Builder paramBuilder, boolean paramBoolean)
    {
      return paramBuilder.setUsesChronometer(paramBoolean);
    }
  }
  
  public static abstract class b
  {
    public static Notification.Builder a(Notification.Builder paramBuilder, boolean paramBoolean)
    {
      return paramBuilder.setShowWhen(paramBoolean);
    }
  }
  
  public static abstract class c
  {
    public static Notification.Builder a(Notification.Builder paramBuilder, Bundle paramBundle)
    {
      return paramBuilder.setExtras(paramBundle);
    }
  }
  
  public static abstract class d
  {
    public static Notification.Builder a(Notification.Builder paramBuilder, Notification.Action paramAction)
    {
      return paramBuilder.addAction(paramAction);
    }
    
    public static Notification.Action.Builder b(Notification.Action.Builder paramBuilder, Bundle paramBundle)
    {
      return paramBuilder.addExtras(paramBundle);
    }
    
    public static Notification.Action.Builder c(Notification.Action.Builder paramBuilder, RemoteInput paramRemoteInput)
    {
      return paramBuilder.addRemoteInput(paramRemoteInput);
    }
    
    public static Notification.Action d(Notification.Action.Builder paramBuilder)
    {
      return paramBuilder.build();
    }
    
    public static Notification.Action.Builder e(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
    {
      return new Notification.Action.Builder(paramInt, paramCharSequence, paramPendingIntent);
    }
    
    public static String f(Notification paramNotification)
    {
      return paramNotification.getGroup();
    }
    
    public static Notification.Builder g(Notification.Builder paramBuilder, String paramString)
    {
      return paramBuilder.setGroup(paramString);
    }
    
    public static Notification.Builder h(Notification.Builder paramBuilder, boolean paramBoolean)
    {
      return paramBuilder.setGroupSummary(paramBoolean);
    }
    
    public static Notification.Builder i(Notification.Builder paramBuilder, boolean paramBoolean)
    {
      return paramBuilder.setLocalOnly(paramBoolean);
    }
    
    public static Notification.Builder j(Notification.Builder paramBuilder, String paramString)
    {
      return paramBuilder.setSortKey(paramString);
    }
  }
  
  public static abstract class e
  {
    public static Notification.Builder a(Notification.Builder paramBuilder, String paramString)
    {
      return paramBuilder.addPerson(paramString);
    }
    
    public static Notification.Builder b(Notification.Builder paramBuilder, String paramString)
    {
      return paramBuilder.setCategory(paramString);
    }
    
    public static Notification.Builder c(Notification.Builder paramBuilder, int paramInt)
    {
      return paramBuilder.setColor(paramInt);
    }
    
    public static Notification.Builder d(Notification.Builder paramBuilder, Notification paramNotification)
    {
      return paramBuilder.setPublicVersion(paramNotification);
    }
    
    public static Notification.Builder e(Notification.Builder paramBuilder, Uri paramUri, Object paramObject)
    {
      return paramBuilder.setSound(paramUri, (AudioAttributes)paramObject);
    }
    
    public static Notification.Builder f(Notification.Builder paramBuilder, int paramInt)
    {
      return paramBuilder.setVisibility(paramInt);
    }
  }
  
  public static abstract class f
  {
    public static Notification.Action.Builder a(Icon paramIcon, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
    {
      return new Notification.Action.Builder(paramIcon, paramCharSequence, paramPendingIntent);
    }
    
    public static Notification.Builder b(Notification.Builder paramBuilder, Object paramObject)
    {
      return paramBuilder.setSmallIcon((Icon)paramObject);
    }
  }
  
  public static abstract class g
  {
    public static Notification.Action.Builder a(Notification.Action.Builder paramBuilder, boolean paramBoolean)
    {
      return paramBuilder.setAllowGeneratedReplies(paramBoolean);
    }
    
    public static Notification.Builder b(Notification.Builder paramBuilder, RemoteViews paramRemoteViews)
    {
      return paramBuilder.setCustomBigContentView(paramRemoteViews);
    }
    
    public static Notification.Builder c(Notification.Builder paramBuilder, RemoteViews paramRemoteViews)
    {
      return paramBuilder.setCustomContentView(paramRemoteViews);
    }
    
    public static Notification.Builder d(Notification.Builder paramBuilder, RemoteViews paramRemoteViews)
    {
      return paramBuilder.setCustomHeadsUpContentView(paramRemoteViews);
    }
    
    public static Notification.Builder e(Notification.Builder paramBuilder, CharSequence[] paramArrayOfCharSequence)
    {
      return paramBuilder.setRemoteInputHistory(paramArrayOfCharSequence);
    }
  }
  
  public static abstract class h
  {
    public static Notification.Builder a(Context paramContext, String paramString)
    {
      return new Notification.Builder(paramContext, paramString);
    }
    
    public static Notification.Builder b(Notification.Builder paramBuilder, int paramInt)
    {
      return paramBuilder.setBadgeIconType(paramInt);
    }
    
    public static Notification.Builder c(Notification.Builder paramBuilder, boolean paramBoolean)
    {
      return paramBuilder.setColorized(paramBoolean);
    }
    
    public static Notification.Builder d(Notification.Builder paramBuilder, int paramInt)
    {
      return paramBuilder.setGroupAlertBehavior(paramInt);
    }
    
    public static Notification.Builder e(Notification.Builder paramBuilder, CharSequence paramCharSequence)
    {
      return paramBuilder.setSettingsText(paramCharSequence);
    }
    
    public static Notification.Builder f(Notification.Builder paramBuilder, String paramString)
    {
      return paramBuilder.setShortcutId(paramString);
    }
    
    public static Notification.Builder g(Notification.Builder paramBuilder, long paramLong)
    {
      return paramBuilder.setTimeoutAfter(paramLong);
    }
  }
  
  public static abstract class i
  {
    public static Notification.Builder a(Notification.Builder paramBuilder, Person paramPerson)
    {
      return paramBuilder.addPerson(paramPerson);
    }
    
    public static Notification.Action.Builder b(Notification.Action.Builder paramBuilder, int paramInt)
    {
      return paramBuilder.setSemanticAction(paramInt);
    }
  }
  
  public static abstract class j
  {
    public static Notification.Builder a(Notification.Builder paramBuilder, boolean paramBoolean)
    {
      return paramBuilder.setAllowSystemGeneratedContextualActions(paramBoolean);
    }
    
    public static Notification.Builder b(Notification.Builder paramBuilder, Notification.BubbleMetadata paramBubbleMetadata)
    {
      return paramBuilder.setBubbleMetadata(paramBubbleMetadata);
    }
    
    public static Notification.Action.Builder c(Notification.Action.Builder paramBuilder, boolean paramBoolean)
    {
      return paramBuilder.setContextual(paramBoolean);
    }
    
    public static Notification.Builder d(Notification.Builder paramBuilder, Object paramObject)
    {
      return paramBuilder.setLocusId((LocusId)paramObject);
    }
  }
  
  public static abstract class k
  {
    public static Notification.Action.Builder a(Notification.Action.Builder paramBuilder, boolean paramBoolean)
    {
      return paramBuilder.setAuthenticationRequired(paramBoolean);
    }
    
    public static Notification.Builder b(Notification.Builder paramBuilder, int paramInt)
    {
      return paramBuilder.setForegroundServiceBehavior(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     w.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */