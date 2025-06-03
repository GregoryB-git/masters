package androidx.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.Iterator;

public final class TaskStackBuilder
  implements Iterable<Intent>
{
  private static final String TAG = "TaskStackBuilder";
  private final ArrayList<Intent> mIntents = new ArrayList();
  private final Context mSourceContext;
  
  private TaskStackBuilder(Context paramContext)
  {
    mSourceContext = paramContext;
  }
  
  @NonNull
  public static TaskStackBuilder create(@NonNull Context paramContext)
  {
    return new TaskStackBuilder(paramContext);
  }
  
  @Deprecated
  public static TaskStackBuilder from(Context paramContext)
  {
    return create(paramContext);
  }
  
  @NonNull
  public TaskStackBuilder addNextIntent(@NonNull Intent paramIntent)
  {
    mIntents.add(paramIntent);
    return this;
  }
  
  @NonNull
  public TaskStackBuilder addNextIntentWithParentStack(@NonNull Intent paramIntent)
  {
    ComponentName localComponentName1 = paramIntent.getComponent();
    ComponentName localComponentName2 = localComponentName1;
    if (localComponentName1 == null) {
      localComponentName2 = paramIntent.resolveActivity(mSourceContext.getPackageManager());
    }
    if (localComponentName2 != null) {
      addParentStack(localComponentName2);
    }
    addNextIntent(paramIntent);
    return this;
  }
  
  @NonNull
  public TaskStackBuilder addParentStack(@NonNull Activity paramActivity)
  {
    Object localObject1;
    if ((paramActivity instanceof SupportParentable)) {
      localObject1 = ((SupportParentable)paramActivity).getSupportParentActivityIntent();
    } else {
      localObject1 = null;
    }
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = NavUtils.getParentActivityIntent(paramActivity);
    }
    if (localObject2 != null)
    {
      localObject1 = ((Intent)localObject2).getComponent();
      paramActivity = (Activity)localObject1;
      if (localObject1 == null) {
        paramActivity = ((Intent)localObject2).resolveActivity(mSourceContext.getPackageManager());
      }
      addParentStack(paramActivity);
      addNextIntent((Intent)localObject2);
    }
    return this;
  }
  
  @NonNull
  public TaskStackBuilder addParentStack(@NonNull ComponentName paramComponentName)
  {
    int i = mIntents.size();
    try
    {
      for (paramComponentName = NavUtils.getParentActivityIntent(mSourceContext, paramComponentName); paramComponentName != null; paramComponentName = NavUtils.getParentActivityIntent(mSourceContext, paramComponentName.getComponent())) {
        mIntents.add(i, paramComponentName);
      }
      return this;
    }
    catch (PackageManager.NameNotFoundException paramComponentName)
    {
      Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
      throw new IllegalArgumentException(paramComponentName);
    }
  }
  
  @NonNull
  public TaskStackBuilder addParentStack(@NonNull Class<?> paramClass)
  {
    return addParentStack(new ComponentName(mSourceContext, paramClass));
  }
  
  @Nullable
  public Intent editIntentAt(int paramInt)
  {
    return (Intent)mIntents.get(paramInt);
  }
  
  @Deprecated
  public Intent getIntent(int paramInt)
  {
    return editIntentAt(paramInt);
  }
  
  public int getIntentCount()
  {
    return mIntents.size();
  }
  
  @NonNull
  public Intent[] getIntents()
  {
    int i = mIntents.size();
    Intent[] arrayOfIntent = new Intent[i];
    if (i == 0) {
      return arrayOfIntent;
    }
    arrayOfIntent[0] = new Intent((Intent)mIntents.get(0)).addFlags(268484608);
    for (int j = 1; j < i; j++) {
      arrayOfIntent[j] = new Intent((Intent)mIntents.get(j));
    }
    return arrayOfIntent;
  }
  
  @Nullable
  public PendingIntent getPendingIntent(int paramInt1, int paramInt2)
  {
    return getPendingIntent(paramInt1, paramInt2, null);
  }
  
  @Nullable
  public PendingIntent getPendingIntent(int paramInt1, int paramInt2, @Nullable Bundle paramBundle)
  {
    if (!mIntents.isEmpty())
    {
      Intent[] arrayOfIntent = (Intent[])mIntents.toArray(new Intent[0]);
      arrayOfIntent[0] = new Intent(arrayOfIntent[0]).addFlags(268484608);
      return Api16Impl.getActivities(mSourceContext, paramInt1, arrayOfIntent, paramInt2, paramBundle);
    }
    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
  }
  
  @Deprecated
  @NonNull
  public Iterator<Intent> iterator()
  {
    return mIntents.iterator();
  }
  
  public void startActivities()
  {
    startActivities(null);
  }
  
  public void startActivities(@Nullable Bundle paramBundle)
  {
    if (!mIntents.isEmpty())
    {
      Intent[] arrayOfIntent = (Intent[])mIntents.toArray(new Intent[0]);
      arrayOfIntent[0] = new Intent(arrayOfIntent[0]).addFlags(268484608);
      if (!ContextCompat.startActivities(mSourceContext, arrayOfIntent, paramBundle))
      {
        paramBundle = new Intent(arrayOfIntent[(arrayOfIntent.length - 1)]);
        paramBundle.addFlags(268435456);
        mSourceContext.startActivity(paramBundle);
      }
      return;
    }
    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
  }
  
  @RequiresApi(16)
  public static class Api16Impl
  {
    @DoNotInline
    public static PendingIntent getActivities(Context paramContext, int paramInt1, Intent[] paramArrayOfIntent, int paramInt2, Bundle paramBundle)
    {
      return PendingIntent.getActivities(paramContext, paramInt1, paramArrayOfIntent, paramInt2, paramBundle);
    }
  }
  
  public static abstract interface SupportParentable
  {
    @Nullable
    public abstract Intent getSupportParentActivityIntent();
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.TaskStackBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */