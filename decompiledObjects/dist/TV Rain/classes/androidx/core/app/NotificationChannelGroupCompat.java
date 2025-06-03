package androidx.core.app;

import a3;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class NotificationChannelGroupCompat
{
  private boolean mBlocked;
  private List<NotificationChannelCompat> mChannels = Collections.emptyList();
  public String mDescription;
  public final String mId;
  public CharSequence mName;
  
  @RequiresApi(28)
  public NotificationChannelGroupCompat(@NonNull NotificationChannelGroup paramNotificationChannelGroup)
  {
    this(paramNotificationChannelGroup, Collections.emptyList());
  }
  
  @RequiresApi(26)
  public NotificationChannelGroupCompat(@NonNull NotificationChannelGroup paramNotificationChannelGroup, @NonNull List<NotificationChannel> paramList)
  {
    this(paramNotificationChannelGroup.getId());
    mName = paramNotificationChannelGroup.getName();
    int i = Build.VERSION.SDK_INT;
    if (i >= 28) {
      mDescription = a3.l(paramNotificationChannelGroup);
    }
    if (i >= 28)
    {
      mBlocked = a3.y(paramNotificationChannelGroup);
      mChannels = getChannelsCompat(paramNotificationChannelGroup.getChannels());
    }
    else
    {
      mChannels = getChannelsCompat(paramList);
    }
  }
  
  public NotificationChannelGroupCompat(@NonNull String paramString)
  {
    mId = ((String)Preconditions.checkNotNull(paramString));
  }
  
  @RequiresApi(26)
  private List<NotificationChannelCompat> getChannelsCompat(List<NotificationChannel> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (NotificationChannel)localIterator.next();
      if (mId.equals(paramList.getGroup())) {
        localArrayList.add(new NotificationChannelCompat(paramList));
      }
    }
    return localArrayList;
  }
  
  @NonNull
  public List<NotificationChannelCompat> getChannels()
  {
    return mChannels;
  }
  
  @Nullable
  public String getDescription()
  {
    return mDescription;
  }
  
  @NonNull
  public String getId()
  {
    return mId;
  }
  
  @Nullable
  public CharSequence getName()
  {
    return mName;
  }
  
  public NotificationChannelGroup getNotificationChannelGroup()
  {
    int i = Build.VERSION.SDK_INT;
    if (i < 26) {
      return null;
    }
    NotificationChannelGroup localNotificationChannelGroup = new NotificationChannelGroup(mId, mName);
    if (i >= 28) {
      a3.o(localNotificationChannelGroup, mDescription);
    }
    return localNotificationChannelGroup;
  }
  
  public boolean isBlocked()
  {
    return mBlocked;
  }
  
  @NonNull
  public Builder toBuilder()
  {
    return new Builder(mId).setName(mName).setDescription(mDescription);
  }
  
  public static class Builder
  {
    public final NotificationChannelGroupCompat mGroup;
    
    public Builder(@NonNull String paramString)
    {
      mGroup = new NotificationChannelGroupCompat(paramString);
    }
    
    @NonNull
    public NotificationChannelGroupCompat build()
    {
      return mGroup;
    }
    
    @NonNull
    public Builder setDescription(@Nullable String paramString)
    {
      mGroup.mDescription = paramString;
      return this;
    }
    
    @NonNull
    public Builder setName(@Nullable CharSequence paramCharSequence)
    {
      mGroup.mName = paramCharSequence;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationChannelGroupCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */