package u;

import aa.u;
import aa.v;
import aa.w;
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
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.graphics.drawable.IconCompat.a;
import e0.h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class t
{
  public final Context a;
  public final Notification.Builder b;
  public final q c;
  public final Bundle d;
  
  public t(q paramq)
  {
    new ArrayList();
    d = new Bundle();
    c = paramq;
    Object localObject2 = a;
    a = ((Context)localObject2);
    if (Build.VERSION.SDK_INT >= 26) {
      localObject3 = e.a((Context)localObject2, y);
    } else {
      localObject3 = new Notification.Builder(a);
    }
    b = ((Notification.Builder)localObject3);
    Object localObject4 = B;
    Object localObject5 = ((Notification.Builder)localObject3).setWhen(when).setSmallIcon(icon, iconLevel).setContent(contentView).setTicker(tickerText, null).setVibrate(vibrate).setLights(ledARGB, ledOnMS, ledOffMS);
    int i = flags;
    int j = 2;
    int k = 0;
    boolean bool;
    if ((i & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    localObject5 = ((Notification.Builder)localObject5).setOngoing(bool);
    if ((flags & 0x8) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    localObject5 = ((Notification.Builder)localObject5).setOnlyAlertOnce(bool);
    if ((flags & 0x10) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    localObject5 = ((Notification.Builder)localObject5).setAutoCancel(bool).setDefaults(defaults).setContentTitle(e).setContentText(f).setContentInfo(null).setContentIntent(g).setDeleteIntent(deleteIntent);
    if ((flags & 0x80) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    ((Notification.Builder)localObject5).setFullScreenIntent(null, bool).setNumber(i).setProgress(o, p, q);
    localObject5 = h;
    if (localObject5 == null) {
      localObject2 = null;
    } else {
      localObject2 = IconCompat.a.f((IconCompat)localObject5, (Context)localObject2);
    }
    c.b((Notification.Builder)localObject3, (Icon)localObject2);
    ((Notification.Builder)localObject3).setSubText(n).setUsesChronometer(l).setPriority(j);
    Object localObject3 = m;
    Object localObject6;
    Bundle localBundle1;
    Object localObject7;
    if ((localObject3 instanceof r))
    {
      localObject5 = (r)localObject3;
      i = v.a.getColor(a.a, 2131099694);
      localObject3 = new SpannableStringBuilder();
      ((SpannableStringBuilder)localObject3).append(a.a.getResources().getString(2131886118));
      ((SpannableStringBuilder)localObject3).setSpan(new ForegroundColorSpan(Integer.valueOf(i).intValue()), 0, ((SpannableStringBuilder)localObject3).length(), 18);
      localObject2 = a.a;
      localObject6 = IconCompat.k;
      localObject2.getClass();
      localObject6 = IconCompat.d(((Context)localObject2).getResources(), ((Context)localObject2).getPackageName(), 2131230927);
      localBundle1 = new Bundle();
      localObject7 = q.b((CharSequence)localObject3);
      localObject3 = new ArrayList();
      localObject2 = new ArrayList();
      if (((ArrayList)localObject3).isEmpty()) {
        localObject3 = null;
      } else {
        localObject3 = (z[])((ArrayList)localObject3).toArray(new z[((ArrayList)localObject3).size()]);
      }
      if (((ArrayList)localObject2).isEmpty()) {
        localObject2 = null;
      } else {
        localObject2 = (z[])((ArrayList)localObject2).toArray(new z[((ArrayList)localObject2).size()]);
      }
      localObject2 = new n((IconCompat)localObject6, (CharSequence)localObject7, null, localBundle1, (z[])localObject2, (z[])localObject3, true, 0, true, false, false);
      a.putBoolean("key_action_priority", true);
      localObject3 = new ArrayList(3);
      ((ArrayList)localObject3).add(localObject2);
      localObject2 = a.b;
      if (localObject2 != null)
      {
        localObject5 = ((ArrayList)localObject2).iterator();
        while (((Iterator)localObject5).hasNext())
        {
          localObject2 = (n)((Iterator)localObject5).next();
          if (g)
          {
            ((ArrayList)localObject3).add(localObject2);
          }
          else if ((!a.getBoolean("key_action_priority")) && (j > 1))
          {
            ((ArrayList)localObject3).add(localObject2);
            j--;
          }
        }
      }
      localObject3 = ((ArrayList)localObject3).iterator();
      while (((Iterator)localObject3).hasNext()) {
        ((t)localObject1).a((n)((Iterator)localObject3).next());
      }
    }
    localObject3 = b.iterator();
    while (((Iterator)localObject3).hasNext()) {
      ((t)localObject1).a((n)((Iterator)localObject3).next());
    }
    localObject3 = v;
    if (localObject3 != null) {
      d.putAll((Bundle)localObject3);
    }
    j = Build.VERSION.SDK_INT;
    b.setShowWhen(k);
    a.i(b, s);
    a.g(b, r);
    a.j(b, null);
    a.h(b, false);
    b.b(b, null);
    b.c(b, w);
    b.f(b, x);
    b.d(b, null);
    b.e(b, sound, audioAttributes);
    localObject2 = "";
    if (j < 28)
    {
      localObject3 = c;
      if (localObject3 == null)
      {
        localObject3 = null;
      }
      else
      {
        localObject4 = new ArrayList(((ArrayList)localObject3).size());
        localObject5 = ((ArrayList)localObject3).iterator();
        for (;;)
        {
          localObject3 = localObject4;
          if (!((Iterator)localObject5).hasNext()) {
            break;
          }
          localObject6 = (x)((Iterator)localObject5).next();
          localObject3 = c;
          if (localObject3 == null) {
            if (a != null)
            {
              localObject3 = f.l("name:");
              ((StringBuilder)localObject3).append(a);
              localObject3 = ((StringBuilder)localObject3).toString();
            }
            else
            {
              localObject3 = "";
            }
          }
          ((ArrayList)localObject4).add(localObject3);
        }
      }
      localObject4 = C;
      if (localObject3 == null)
      {
        localObject3 = localObject4;
      }
      else if (localObject4 != null)
      {
        j = ((ArrayList)localObject3).size();
        localObject5 = new r.d(((ArrayList)localObject4).size() + j);
        ((r.d)localObject5).addAll((Collection)localObject3);
        ((r.d)localObject5).addAll((Collection)localObject4);
        localObject3 = new ArrayList((Collection)localObject5);
      }
    }
    else
    {
      localObject3 = C;
    }
    if ((localObject3 != null) && (!((List)localObject3).isEmpty()))
    {
      localObject4 = ((List)localObject3).iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject3 = (String)((Iterator)localObject4).next();
        b.a(b, (String)localObject3);
      }
    }
    if (d.size() > 0)
    {
      if (v == null) {
        v = new Bundle();
      }
      localObject3 = v.getBundle("android.car.EXTENSIONS");
      localObject1 = localObject3;
      if (localObject3 == null) {
        localObject1 = new Bundle();
      }
      localBundle1 = new Bundle((Bundle)localObject1);
      localObject7 = new Bundle();
      j = k;
      for (localObject3 = localObject2;; localObject3 = localObject2)
      {
        i = 0;
        localObject5 = null;
        if (j >= d.size()) {
          break;
        }
        String str = Integer.toString(j);
        n localn = (n)d.get(j);
        Bundle localBundle2 = new Bundle();
        if (b == null)
        {
          k = h;
          if (k != 0) {
            b = IconCompat.d(null, (String)localObject3, k);
          }
        }
        localObject2 = b;
        if (localObject2 != null) {
          k = ((IconCompat)localObject2).e();
        } else {
          k = 0;
        }
        localBundle2.putInt("icon", k);
        localBundle2.putCharSequence("title", i);
        localBundle2.putParcelable("actionIntent", j);
        if (a != null) {
          localObject2 = new Bundle(a);
        } else {
          localObject2 = new Bundle();
        }
        ((BaseBundle)localObject2).putBoolean("android.support.allowGeneratedReplies", d);
        localBundle2.putBundle("extras", (Bundle)localObject2);
        localObject4 = c;
        if (localObject4 == null)
        {
          localObject2 = localObject3;
        }
        else
        {
          localObject6 = new Bundle[localObject4.length];
          for (k = i;; k++)
          {
            localObject2 = localObject3;
            localObject5 = localObject6;
            if (k >= localObject4.length) {
              break;
            }
            localObject5 = localObject4[k];
            localObject2 = new Bundle();
            localObject5.getClass();
            ((BaseBundle)localObject2).putString("resultKey", null);
            ((Bundle)localObject2).putCharSequence("label", null);
            ((Bundle)localObject2).putCharSequenceArray("choices", null);
            ((BaseBundle)localObject2).putBoolean("allowFreeFormInput", false);
            ((Bundle)localObject2).putBundle("extras", null);
            localObject6[k] = localObject2;
          }
        }
        localBundle2.putParcelableArray("remoteInputs", (Parcelable[])localObject5);
        localBundle2.putBoolean("showsUserInterface", e);
        localBundle2.putInt("semanticAction", f);
        ((Bundle)localObject7).putBundle(str, localBundle2);
        j++;
      }
      ((Bundle)localObject1).putBundle("invisible_actions", (Bundle)localObject7);
      localBundle1.putBundle("invisible_actions", (Bundle)localObject7);
      if (v == null) {
        v = new Bundle();
      }
      v.putBundle("android.car.EXTENSIONS", (Bundle)localObject1);
      d.putBundle("android.car.EXTENSIONS", localBundle1);
    }
    localObject3 = this;
    j = Build.VERSION.SDK_INT;
    if (j >= 24)
    {
      b.setExtras(v);
      d.e(b, null);
    }
    if (j >= 26)
    {
      e.b(b, z);
      e.e(b, null);
      e.f(b, null);
      e.g(b, 0L);
      e.d(b, 0);
      if (u) {
        e.c(b, t);
      }
      if (!TextUtils.isEmpty(y)) {
        b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
      }
    }
    if (j >= 28)
    {
      localObject2 = c.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (x)((Iterator)localObject2).next();
        localObject4 = b;
        localObject1.getClass();
        f.a((Notification.Builder)localObject4, x.a.b((x)localObject1));
      }
    }
    if (Build.VERSION.SDK_INT >= 29)
    {
      g.a(b, A);
      g.b(b, null);
    }
  }
  
  public final void a(n paramn)
  {
    Object localObject1 = b;
    Object localObject2 = null;
    if (localObject1 == null)
    {
      i = h;
      if (i != 0) {
        b = IconCompat.d(null, "", i);
      }
    }
    localObject1 = b;
    if (localObject1 != null) {
      localObject2 = IconCompat.a.f((IconCompat)localObject1, null);
    }
    localObject1 = c.a((Icon)localObject2, i, j);
    localObject2 = c;
    if (localObject2 != null)
    {
      int j = 0;
      RemoteInput[] arrayOfRemoteInput = new RemoteInput[localObject2.length];
      for (i = 0; i < localObject2.length; i++) {
        arrayOfRemoteInput[i] = z.a(localObject2[i]);
      }
      int k = arrayOfRemoteInput.length;
      for (i = j; i < k; i++) {
        a.c((Notification.Action.Builder)localObject1, arrayOfRemoteInput[i]);
      }
    }
    if (a != null) {
      localObject2 = new Bundle(a);
    } else {
      localObject2 = new Bundle();
    }
    ((BaseBundle)localObject2).putBoolean("android.support.allowGeneratedReplies", d);
    int i = Build.VERSION.SDK_INT;
    if (i >= 24) {
      d.a((Notification.Action.Builder)localObject1, d);
    }
    ((BaseBundle)localObject2).putInt("android.support.action.semanticAction", f);
    if (i >= 28) {
      f.b((Notification.Action.Builder)localObject1, f);
    }
    if (i >= 29) {
      g.c((Notification.Action.Builder)localObject1, g);
    }
    if (i >= 31) {
      h.a((Notification.Action.Builder)localObject1, k);
    }
    ((BaseBundle)localObject2).putBoolean("android.support.action.showsUserInterface", e);
    a.b((Notification.Action.Builder)localObject1, (Bundle)localObject2);
    a.a(b, a.d((Notification.Action.Builder)localObject1));
  }
  
  public static final class a
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
  
  public static final class b
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
  
  public static final class c
  {
    public static Notification.Action.Builder a(Icon paramIcon, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
    {
      return new Notification.Action.Builder(paramIcon, paramCharSequence, paramPendingIntent);
    }
    
    public static Notification.Builder b(Notification.Builder paramBuilder, Icon paramIcon)
    {
      return paramBuilder.setLargeIcon(paramIcon);
    }
    
    public static Notification.Builder c(Notification.Builder paramBuilder, Object paramObject)
    {
      return paramBuilder.setSmallIcon((Icon)paramObject);
    }
  }
  
  public static final class d
  {
    public static Notification.Action.Builder a(Notification.Action.Builder paramBuilder, boolean paramBoolean)
    {
      return a0.d.d(paramBuilder, paramBoolean);
    }
    
    public static Notification.Builder b(Notification.Builder paramBuilder, RemoteViews paramRemoteViews)
    {
      return a0.d.e(paramBuilder, paramRemoteViews);
    }
    
    public static Notification.Builder c(Notification.Builder paramBuilder, RemoteViews paramRemoteViews)
    {
      return a0.e.c(paramBuilder, paramRemoteViews);
    }
    
    public static Notification.Builder d(Notification.Builder paramBuilder, RemoteViews paramRemoteViews)
    {
      return b0.f.b(paramBuilder, paramRemoteViews);
    }
    
    public static Notification.Builder e(Notification.Builder paramBuilder, CharSequence[] paramArrayOfCharSequence)
    {
      return b0.f.c(paramBuilder, paramArrayOfCharSequence);
    }
  }
  
  public static final class e
  {
    public static Notification.Builder a(Context paramContext, String paramString)
    {
      return new Notification.Builder(paramContext, paramString);
    }
    
    public static Notification.Builder b(Notification.Builder paramBuilder, int paramInt)
    {
      return com.google.android.gms.internal.base.a.e(paramBuilder, paramInt);
    }
    
    public static Notification.Builder c(Notification.Builder paramBuilder, boolean paramBoolean)
    {
      return d2.e.d(paramBuilder, paramBoolean);
    }
    
    public static Notification.Builder d(Notification.Builder paramBuilder, int paramInt)
    {
      return d2.e.c(paramBuilder, paramInt);
    }
    
    public static Notification.Builder e(Notification.Builder paramBuilder, CharSequence paramCharSequence)
    {
      return c0.b.d(paramBuilder, paramCharSequence);
    }
    
    public static Notification.Builder f(Notification.Builder paramBuilder, String paramString)
    {
      return com.google.android.gms.internal.base.a.f(paramBuilder, paramString);
    }
    
    public static Notification.Builder g(Notification.Builder paramBuilder, long paramLong)
    {
      return c0.b.c(paramBuilder, paramLong);
    }
  }
  
  public static final class f
  {
    public static Notification.Builder a(Notification.Builder paramBuilder, Person paramPerson)
    {
      return com.google.android.recaptcha.internal.a.f(paramBuilder, paramPerson);
    }
    
    public static Notification.Action.Builder b(Notification.Action.Builder paramBuilder, int paramInt)
    {
      return android.support.v4.media.session.b.b(paramBuilder, paramInt);
    }
  }
  
  public static final class g
  {
    public static Notification.Builder a(Notification.Builder paramBuilder, boolean paramBoolean)
    {
      return u.a(paramBuilder, paramBoolean);
    }
    
    public static Notification.Builder b(Notification.Builder paramBuilder, Notification.BubbleMetadata paramBubbleMetadata)
    {
      return v.b(paramBuilder, paramBubbleMetadata);
    }
    
    public static Notification.Action.Builder c(Notification.Action.Builder paramBuilder, boolean paramBoolean)
    {
      return w.c(paramBuilder, paramBoolean);
    }
    
    public static Notification.Builder d(Notification.Builder paramBuilder, Object paramObject)
    {
      return v.c(paramBuilder, (LocusId)paramObject);
    }
  }
  
  public static final class h
  {
    public static Notification.Action.Builder a(Notification.Action.Builder paramBuilder, boolean paramBoolean)
    {
      return h0.d(paramBuilder, paramBoolean);
    }
    
    public static Notification.Builder b(Notification.Builder paramBuilder, int paramInt)
    {
      return a4.r.b(paramBuilder, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     u.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */