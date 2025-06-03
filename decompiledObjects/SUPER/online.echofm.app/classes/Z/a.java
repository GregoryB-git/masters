package Z;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public final class a
{
  public static final Object f = new Object();
  public static a g;
  public final Context a;
  public final HashMap b = new HashMap();
  public final HashMap c = new HashMap();
  public final ArrayList d = new ArrayList();
  public final Handler e;
  
  public a(Context paramContext)
  {
    a = paramContext;
    e = new a(paramContext.getMainLooper());
  }
  
  public static a b(Context paramContext)
  {
    synchronized (f)
    {
      if (g == null)
      {
        a locala = new Z/a;
        locala.<init>(paramContext.getApplicationContext());
        g = locala;
      }
    }
    paramContext = g;
    return paramContext;
  }
  
  public void a()
  {
    int i;
    b[] arrayOfb;
    int j;
    int k;
    int m;
    c localc;
    synchronized (b)
    {
      i = d.size();
      if (i <= 0) {
        return;
      }
    }
  }
  
  public void c(BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter)
  {
    c localc;
    Object localObject1;
    Object localObject2;
    synchronized (b)
    {
      localc = new Z/a$c;
      localc.<init>(paramIntentFilter, paramBroadcastReceiver);
      localObject1 = (ArrayList)b.get(paramBroadcastReceiver);
      localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>(1);
        b.put(paramBroadcastReceiver, localObject2);
      }
    }
    ((ArrayList)localObject2).add(localc);
    for (int i = 0; i < paramIntentFilter.countActions(); i++)
    {
      localObject1 = paramIntentFilter.getAction(i);
      localObject2 = (ArrayList)c.get(localObject1);
      paramBroadcastReceiver = (BroadcastReceiver)localObject2;
      if (localObject2 == null)
      {
        paramBroadcastReceiver = new java/util/ArrayList;
        paramBroadcastReceiver.<init>(1);
        c.put(localObject1, paramBroadcastReceiver);
      }
      paramBroadcastReceiver.add(localc);
    }
  }
  
  public boolean d(Intent paramIntent)
  {
    String str1;
    Object localObject1;
    Uri localUri;
    String str2;
    Set localSet;
    int i;
    Object localObject2;
    synchronized (b)
    {
      str1 = paramIntent.getAction();
      localObject1 = paramIntent.resolveTypeIfNeeded(a.getContentResolver());
      localUri = paramIntent.getData();
      str2 = paramIntent.getScheme();
      localSet = paramIntent.getCategories();
      if ((paramIntent.getFlags() & 0x8) != 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("Resolving type ");
        ((StringBuilder)localObject2).append((String)localObject1);
        ((StringBuilder)localObject2).append(" scheme ");
        ((StringBuilder)localObject2).append(str2);
        ((StringBuilder)localObject2).append(" of intent ");
        ((StringBuilder)localObject2).append(paramIntent);
        Log.v("LocalBroadcastManager", ((StringBuilder)localObject2).toString());
      }
    }
    ArrayList localArrayList = (ArrayList)c.get(paramIntent.getAction());
    if (localArrayList != null)
    {
      if (i != 0)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("Action list: ");
        ((StringBuilder)localObject2).append(localArrayList);
        Log.v("LocalBroadcastManager", ((StringBuilder)localObject2).toString());
      }
      Object localObject3 = null;
      for (int j = 0; j < localArrayList.size(); j++)
      {
        Object localObject4 = (c)localArrayList.get(j);
        if (i != 0)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ((StringBuilder)localObject2).append("Matching against filter ");
          ((StringBuilder)localObject2).append(a);
          Log.v("LocalBroadcastManager", ((StringBuilder)localObject2).toString());
        }
        if (c)
        {
          if (i != 0) {
            Log.v("LocalBroadcastManager", "  Filter's target already added");
          }
        }
        else
        {
          IntentFilter localIntentFilter = a;
          localObject2 = localObject3;
          int k = localIntentFilter.match(str1, (String)localObject1, str2, localUri, localSet, "LocalBroadcastManager");
          if (k >= 0)
          {
            if (i != 0)
            {
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              ((StringBuilder)localObject3).append("  Filter matched!  match=0x");
              ((StringBuilder)localObject3).append(Integer.toHexString(k));
              Log.v("LocalBroadcastManager", ((StringBuilder)localObject3).toString());
            }
            if (localObject2 == null)
            {
              localObject3 = new java/util/ArrayList;
              ((ArrayList)localObject3).<init>();
            }
            else
            {
              localObject3 = localObject2;
            }
            ((ArrayList)localObject3).add(localObject4);
            c = true;
          }
          else if (i != 0)
          {
            if (k != -4)
            {
              if (k != -3)
              {
                if (k != -2)
                {
                  if (k != -1) {
                    localObject2 = "unknown reason";
                  } else {
                    localObject2 = "type";
                  }
                }
                else {
                  localObject2 = "data";
                }
              }
              else {
                localObject2 = "action";
              }
            }
            else {
              localObject2 = "category";
            }
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            ((StringBuilder)localObject4).append("  Filter did not match: ");
            ((StringBuilder)localObject4).append((String)localObject2);
            Log.v("LocalBroadcastManager", ((StringBuilder)localObject4).toString());
          }
        }
      }
      if (localObject3 != null)
      {
        for (i = 0; i < ((ArrayList)localObject3).size(); i++) {
          getc = false;
        }
        localObject2 = d;
        localObject1 = new Z/a$b;
        ((b)localObject1).<init>(paramIntent, (ArrayList)localObject3);
        ((ArrayList)localObject2).add(localObject1);
        if (!e.hasMessages(1)) {
          e.sendEmptyMessage(1);
        }
        return true;
      }
    }
    return false;
  }
  
  public void e(BroadcastReceiver paramBroadcastReceiver)
  {
    ArrayList localArrayList1;
    int i;
    c localc1;
    int j;
    String str;
    ArrayList localArrayList2;
    int k;
    c localc2;
    synchronized (b)
    {
      localArrayList1 = (ArrayList)b.remove(paramBroadcastReceiver);
      if (localArrayList1 == null) {
        return;
      }
    }
  }
  
  public class a
    extends Handler
  {
    public a(Looper paramLooper)
    {
      super();
    }
    
    public void handleMessage(Message paramMessage)
    {
      if (what != 1) {
        super.handleMessage(paramMessage);
      } else {
        a();
      }
    }
  }
  
  public static final class b
  {
    public final Intent a;
    public final ArrayList b;
    
    public b(Intent paramIntent, ArrayList paramArrayList)
    {
      a = paramIntent;
      b = paramArrayList;
    }
  }
  
  public static final class c
  {
    public final IntentFilter a;
    public final BroadcastReceiver b;
    public boolean c;
    public boolean d;
    
    public c(IntentFilter paramIntentFilter, BroadcastReceiver paramBroadcastReceiver)
    {
      a = paramIntentFilter;
      b = paramBroadcastReceiver;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder(128);
      localStringBuilder.append("Receiver{");
      localStringBuilder.append(b);
      localStringBuilder.append(" filter=");
      localStringBuilder.append(a);
      if (d) {
        localStringBuilder.append(" DEAD");
      }
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     Z.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */