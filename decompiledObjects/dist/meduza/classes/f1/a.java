package f1;

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

@Deprecated
public final class a
{
  public static final Object f = new Object();
  public static a g;
  public final Context a;
  public final HashMap<BroadcastReceiver, ArrayList<c>> b = new HashMap();
  public final HashMap<String, ArrayList<c>> c = new HashMap();
  public final ArrayList<b> d = new ArrayList();
  public final a e;
  
  public a(Context paramContext)
  {
    a = paramContext;
    e = new a(paramContext.getMainLooper());
  }
  
  public static a a(Context paramContext)
  {
    synchronized (f)
    {
      if (g == null)
      {
        a locala = new f1/a;
        locala.<init>(paramContext.getApplicationContext());
        g = locala;
      }
      paramContext = g;
      return paramContext;
    }
  }
  
  public final boolean b(Intent paramIntent)
  {
    synchronized (b)
    {
      String str1 = paramIntent.getAction();
      Object localObject1 = paramIntent.resolveTypeIfNeeded(a.getContentResolver());
      Uri localUri = paramIntent.getData();
      String str2 = paramIntent.getScheme();
      Set localSet = paramIntent.getCategories();
      int i;
      if ((paramIntent.getFlags() & 0x8) != 0) {
        i = 1;
      } else {
        i = 0;
      }
      Object localObject2;
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
          localObject1 = d;
          localObject2 = new f1/a$b;
          ((b)localObject2).<init>(paramIntent, (ArrayList)localObject3);
          ((ArrayList)localObject1).add(localObject2);
          if (!e.hasMessages(1)) {
            e.sendEmptyMessage(1);
          }
          return true;
        }
      }
      return false;
    }
  }
  
  public final class a
    extends Handler
  {
    public a(Looper paramLooper)
    {
      super();
    }
    
    public final void handleMessage(Message paramMessage)
    {
      a locala;
      if (what != 1) {
        super.handleMessage(paramMessage);
      } else {
        locala = a.this;
      }
      synchronized (b)
      {
        int i;
        int j;
        do
        {
          i = d.size();
          if (i <= 0) {
            return;
          }
          paramMessage = new a.b[i];
          d.toArray(paramMessage);
          d.clear();
          j = 0;
        } while (j >= i);
        Object localObject2 = paramMessage[j];
        int k = b.size();
        for (int m = 0; m < k; m++)
        {
          ??? = (a.c)b.get(m);
          if (!d) {
            b.onReceive(a, a);
          }
        }
        j++;
      }
    }
  }
  
  public static final class b
  {
    public final Intent a;
    public final ArrayList<a.c> b;
    
    public b(Intent paramIntent, ArrayList<a.c> paramArrayList)
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
    
    public c(BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter)
    {
      a = paramIntentFilter;
      b = paramBroadcastReceiver;
    }
    
    public final String toString()
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
 * Qualified Name:     f1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */