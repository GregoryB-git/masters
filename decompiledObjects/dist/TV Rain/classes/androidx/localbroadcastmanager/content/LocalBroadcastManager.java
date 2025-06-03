package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public final class LocalBroadcastManager
{
  private static final boolean DEBUG = false;
  public static final int MSG_EXEC_PENDING_BROADCASTS = 1;
  private static final String TAG = "LocalBroadcastManager";
  private static LocalBroadcastManager mInstance;
  private static final Object mLock = new Object();
  private final HashMap<String, ArrayList<ReceiverRecord>> mActions = new HashMap();
  private final Context mAppContext;
  private final Handler mHandler;
  private final ArrayList<BroadcastRecord> mPendingBroadcasts = new ArrayList();
  private final HashMap<BroadcastReceiver, ArrayList<ReceiverRecord>> mReceivers = new HashMap();
  
  private LocalBroadcastManager(Context paramContext)
  {
    mAppContext = paramContext;
    mHandler = new Handler(paramContext.getMainLooper())
    {
      public void handleMessage(Message paramAnonymousMessage)
      {
        if (what != 1) {
          super.handleMessage(paramAnonymousMessage);
        } else {
          executePendingBroadcasts();
        }
      }
    };
  }
  
  @NonNull
  public static LocalBroadcastManager getInstance(@NonNull Context paramContext)
  {
    synchronized (mLock)
    {
      if (mInstance == null)
      {
        LocalBroadcastManager localLocalBroadcastManager = new androidx/localbroadcastmanager/content/LocalBroadcastManager;
        localLocalBroadcastManager.<init>(paramContext.getApplicationContext());
        mInstance = localLocalBroadcastManager;
      }
      paramContext = mInstance;
      return paramContext;
    }
  }
  
  public void executePendingBroadcasts()
  {
    synchronized (mReceivers)
    {
      int i;
      BroadcastRecord[] arrayOfBroadcastRecord;
      int j;
      do
      {
        i = mPendingBroadcasts.size();
        if (i <= 0) {
          return;
        }
        arrayOfBroadcastRecord = new BroadcastRecord[i];
        mPendingBroadcasts.toArray(arrayOfBroadcastRecord);
        mPendingBroadcasts.clear();
        j = 0;
      } while (j >= i);
      ??? = arrayOfBroadcastRecord[j];
      int k = receivers.size();
      for (int m = 0; m < k; m++)
      {
        ReceiverRecord localReceiverRecord = (ReceiverRecord)receivers.get(m);
        if (!dead) {
          receiver.onReceive(mAppContext, intent);
        }
      }
      j++;
    }
  }
  
  public void registerReceiver(@NonNull BroadcastReceiver paramBroadcastReceiver, @NonNull IntentFilter paramIntentFilter)
  {
    synchronized (mReceivers)
    {
      ReceiverRecord localReceiverRecord = new androidx/localbroadcastmanager/content/LocalBroadcastManager$ReceiverRecord;
      localReceiverRecord.<init>(paramIntentFilter, paramBroadcastReceiver);
      Object localObject1 = (ArrayList)mReceivers.get(paramBroadcastReceiver);
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>(1);
        mReceivers.put(paramBroadcastReceiver, localObject2);
      }
      ((ArrayList)localObject2).add(localReceiverRecord);
      for (int i = 0; i < paramIntentFilter.countActions(); i++)
      {
        localObject1 = paramIntentFilter.getAction(i);
        localObject2 = (ArrayList)mActions.get(localObject1);
        paramBroadcastReceiver = (BroadcastReceiver)localObject2;
        if (localObject2 == null)
        {
          paramBroadcastReceiver = new java/util/ArrayList;
          paramBroadcastReceiver.<init>(1);
          mActions.put(localObject1, paramBroadcastReceiver);
        }
        paramBroadcastReceiver.add(localReceiverRecord);
      }
      return;
    }
  }
  
  public boolean sendBroadcast(@NonNull Intent paramIntent)
  {
    synchronized (mReceivers)
    {
      String str1 = paramIntent.getAction();
      Object localObject1 = paramIntent.resolveTypeIfNeeded(mAppContext.getContentResolver());
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
      ArrayList localArrayList = (ArrayList)mActions.get(paramIntent.getAction());
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
          Object localObject4 = (ReceiverRecord)localArrayList.get(j);
          if (i != 0)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((StringBuilder)localObject2).append("Matching against filter ");
            ((StringBuilder)localObject2).append(filter);
            Log.v("LocalBroadcastManager", ((StringBuilder)localObject2).toString());
          }
          if (broadcasting)
          {
            if (i != 0) {
              Log.v("LocalBroadcastManager", "  Filter's target already added");
            }
          }
          else
          {
            IntentFilter localIntentFilter = filter;
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
              broadcasting = true;
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
            getbroadcasting = false;
          }
          localObject1 = mPendingBroadcasts;
          localObject2 = new androidx/localbroadcastmanager/content/LocalBroadcastManager$BroadcastRecord;
          ((BroadcastRecord)localObject2).<init>(paramIntent, (ArrayList)localObject3);
          ((ArrayList)localObject1).add(localObject2);
          if (!mHandler.hasMessages(1)) {
            mHandler.sendEmptyMessage(1);
          }
          return true;
        }
      }
      return false;
    }
  }
  
  public void sendBroadcastSync(@NonNull Intent paramIntent)
  {
    if (sendBroadcast(paramIntent)) {
      executePendingBroadcasts();
    }
  }
  
  public void unregisterReceiver(@NonNull BroadcastReceiver paramBroadcastReceiver)
  {
    synchronized (mReceivers)
    {
      ArrayList localArrayList1 = (ArrayList)mReceivers.remove(paramBroadcastReceiver);
      if (localArrayList1 == null) {
        return;
      }
      for (int i = localArrayList1.size() - 1; i >= 0; i--)
      {
        ReceiverRecord localReceiverRecord1 = (ReceiverRecord)localArrayList1.get(i);
        dead = true;
        for (int j = 0; j < filter.countActions(); j++)
        {
          String str = filter.getAction(j);
          ArrayList localArrayList2 = (ArrayList)mActions.get(str);
          if (localArrayList2 != null)
          {
            for (int k = localArrayList2.size() - 1; k >= 0; k--)
            {
              ReceiverRecord localReceiverRecord2 = (ReceiverRecord)localArrayList2.get(k);
              if (receiver == paramBroadcastReceiver)
              {
                dead = true;
                localArrayList2.remove(k);
              }
            }
            if (localArrayList2.size() <= 0) {
              mActions.remove(str);
            }
          }
        }
      }
      return;
    }
  }
  
  public static final class BroadcastRecord
  {
    public final Intent intent;
    public final ArrayList<LocalBroadcastManager.ReceiverRecord> receivers;
    
    public BroadcastRecord(Intent paramIntent, ArrayList<LocalBroadcastManager.ReceiverRecord> paramArrayList)
    {
      intent = paramIntent;
      receivers = paramArrayList;
    }
  }
  
  public static final class ReceiverRecord
  {
    public boolean broadcasting;
    public boolean dead;
    public final IntentFilter filter;
    public final BroadcastReceiver receiver;
    
    public ReceiverRecord(IntentFilter paramIntentFilter, BroadcastReceiver paramBroadcastReceiver)
    {
      filter = paramIntentFilter;
      receiver = paramBroadcastReceiver;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder(128);
      localStringBuilder.append("Receiver{");
      localStringBuilder.append(receiver);
      localStringBuilder.append(" filter=");
      localStringBuilder.append(filter);
      if (dead) {
        localStringBuilder.append(" DEAD");
      }
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.localbroadcastmanager.content.LocalBroadcastManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */