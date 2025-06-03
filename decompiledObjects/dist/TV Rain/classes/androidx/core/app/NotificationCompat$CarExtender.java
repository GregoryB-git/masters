package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput.Builder;
import android.graphics.Bitmap;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import e;
import java.util.ArrayList;
import java.util.List;

public final class NotificationCompat$CarExtender
  implements NotificationCompat.Extender
{
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static final String EXTRA_CAR_EXTENDER = "android.car.EXTENSIONS";
  private static final String EXTRA_COLOR = "app_color";
  private static final String EXTRA_CONVERSATION = "car_conversation";
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static final String EXTRA_INVISIBLE_ACTIONS = "invisible_actions";
  private static final String EXTRA_LARGE_ICON = "large_icon";
  private static final String KEY_AUTHOR = "author";
  private static final String KEY_MESSAGES = "messages";
  private static final String KEY_ON_READ = "on_read";
  private static final String KEY_ON_REPLY = "on_reply";
  private static final String KEY_PARTICIPANTS = "participants";
  private static final String KEY_REMOTE_INPUT = "remote_input";
  private static final String KEY_TEXT = "text";
  private static final String KEY_TIMESTAMP = "timestamp";
  private int mColor = 0;
  private Bitmap mLargeIcon;
  private UnreadConversation mUnreadConversation;
  
  public NotificationCompat$CarExtender() {}
  
  public NotificationCompat$CarExtender(@NonNull Notification paramNotification)
  {
    if (NotificationCompat.getExtras(paramNotification) == null) {
      paramNotification = null;
    } else {
      paramNotification = NotificationCompat.getExtras(paramNotification).getBundle("android.car.EXTENSIONS");
    }
    if (paramNotification != null)
    {
      mLargeIcon = ((Bitmap)paramNotification.getParcelable("large_icon"));
      mColor = paramNotification.getInt("app_color", 0);
      mUnreadConversation = getUnreadConversationFromBundle(paramNotification.getBundle("car_conversation"));
    }
  }
  
  @RequiresApi(21)
  private static Bundle getBundleForUnreadConversation(@NonNull UnreadConversation paramUnreadConversation)
  {
    Bundle localBundle1 = new Bundle();
    Object localObject = paramUnreadConversation.getParticipants();
    int i = 0;
    if ((localObject != null) && (paramUnreadConversation.getParticipants().length > 1)) {
      localObject = paramUnreadConversation.getParticipants()[0];
    } else {
      localObject = null;
    }
    int j = paramUnreadConversation.getMessages().length;
    Parcelable[] arrayOfParcelable = new Parcelable[j];
    while (i < j)
    {
      Bundle localBundle2 = new Bundle();
      localBundle2.putString("text", paramUnreadConversation.getMessages()[i]);
      localBundle2.putString("author", (String)localObject);
      arrayOfParcelable[i] = localBundle2;
      i++;
    }
    localBundle1.putParcelableArray("messages", arrayOfParcelable);
    localObject = paramUnreadConversation.getRemoteInput();
    if (localObject != null) {
      localBundle1.putParcelable("remote_input", new RemoteInput.Builder(((RemoteInput)localObject).getResultKey()).setLabel(((RemoteInput)localObject).getLabel()).setChoices(((RemoteInput)localObject).getChoices()).setAllowFreeFormInput(((RemoteInput)localObject).getAllowFreeFormInput()).addExtras(((RemoteInput)localObject).getExtras()).build());
    }
    localBundle1.putParcelable("on_reply", paramUnreadConversation.getReplyPendingIntent());
    localBundle1.putParcelable("on_read", paramUnreadConversation.getReadPendingIntent());
    localBundle1.putStringArray("participants", paramUnreadConversation.getParticipants());
    localBundle1.putLong("timestamp", paramUnreadConversation.getLatestTimestamp());
    return localBundle1;
  }
  
  @RequiresApi(21)
  private static UnreadConversation getUnreadConversationFromBundle(@Nullable Bundle paramBundle)
  {
    String str = null;
    CharSequence[] arrayOfCharSequence = null;
    if (paramBundle == null) {
      return null;
    }
    Object localObject1 = paramBundle.getParcelableArray("messages");
    int i = 0;
    String[] arrayOfString;
    int k;
    if (localObject1 != null)
    {
      int j = localObject1.length;
      arrayOfString = new String[j];
      for (k = 0; k < j; k++)
      {
        localObject2 = localObject1[k];
        if (!(localObject2 instanceof Bundle)) {}
        do
        {
          k = 0;
          break;
          localObject2 = ((Bundle)localObject2).getString("text");
          arrayOfString[k] = localObject2;
        } while (localObject2 == null);
      }
      k = 1;
      if (k == 0) {
        return null;
      }
    }
    else
    {
      arrayOfString = null;
    }
    PendingIntent localPendingIntent1 = (PendingIntent)paramBundle.getParcelable("on_read");
    PendingIntent localPendingIntent2 = (PendingIntent)paramBundle.getParcelable("on_reply");
    android.app.RemoteInput localRemoteInput = (android.app.RemoteInput)paramBundle.getParcelable("remote_input");
    Object localObject2 = paramBundle.getStringArray("participants");
    localObject1 = str;
    if (localObject2 != null) {
      if (localObject2.length != 1)
      {
        localObject1 = str;
      }
      else
      {
        localObject1 = arrayOfCharSequence;
        if (localRemoteInput != null)
        {
          str = localRemoteInput.getResultKey();
          localObject1 = localRemoteInput.getLabel();
          arrayOfCharSequence = localRemoteInput.getChoices();
          boolean bool = localRemoteInput.getAllowFreeFormInput();
          k = i;
          if (Build.VERSION.SDK_INT >= 29) {
            k = e.a(localRemoteInput);
          }
          localObject1 = new RemoteInput(str, (CharSequence)localObject1, arrayOfCharSequence, bool, k, localRemoteInput.getExtras(), null);
        }
        localObject1 = new UnreadConversation(arrayOfString, (RemoteInput)localObject1, localPendingIntent2, localPendingIntent1, (String[])localObject2, paramBundle.getLong("timestamp"));
      }
    }
    return (UnreadConversation)localObject1;
  }
  
  @NonNull
  public NotificationCompat.Builder extend(@NonNull NotificationCompat.Builder paramBuilder)
  {
    Bundle localBundle = new Bundle();
    Object localObject = mLargeIcon;
    if (localObject != null) {
      localBundle.putParcelable("large_icon", (Parcelable)localObject);
    }
    int i = mColor;
    if (i != 0) {
      localBundle.putInt("app_color", i);
    }
    localObject = mUnreadConversation;
    if (localObject != null) {
      localBundle.putBundle("car_conversation", getBundleForUnreadConversation((UnreadConversation)localObject));
    }
    paramBuilder.getExtras().putBundle("android.car.EXTENSIONS", localBundle);
    return paramBuilder;
  }
  
  @ColorInt
  public int getColor()
  {
    return mColor;
  }
  
  @Nullable
  public Bitmap getLargeIcon()
  {
    return mLargeIcon;
  }
  
  @Deprecated
  @Nullable
  public UnreadConversation getUnreadConversation()
  {
    return mUnreadConversation;
  }
  
  @NonNull
  public CarExtender setColor(@ColorInt int paramInt)
  {
    mColor = paramInt;
    return this;
  }
  
  @NonNull
  public CarExtender setLargeIcon(@Nullable Bitmap paramBitmap)
  {
    mLargeIcon = paramBitmap;
    return this;
  }
  
  @Deprecated
  @NonNull
  public CarExtender setUnreadConversation(@Nullable UnreadConversation paramUnreadConversation)
  {
    mUnreadConversation = paramUnreadConversation;
    return this;
  }
  
  @Deprecated
  public static class UnreadConversation
  {
    private final long mLatestTimestamp;
    private final String[] mMessages;
    private final String[] mParticipants;
    private final PendingIntent mReadPendingIntent;
    private final RemoteInput mRemoteInput;
    private final PendingIntent mReplyPendingIntent;
    
    public UnreadConversation(@Nullable String[] paramArrayOfString1, @Nullable RemoteInput paramRemoteInput, @Nullable PendingIntent paramPendingIntent1, @Nullable PendingIntent paramPendingIntent2, @Nullable String[] paramArrayOfString2, long paramLong)
    {
      mMessages = paramArrayOfString1;
      mRemoteInput = paramRemoteInput;
      mReadPendingIntent = paramPendingIntent2;
      mReplyPendingIntent = paramPendingIntent1;
      mParticipants = paramArrayOfString2;
      mLatestTimestamp = paramLong;
    }
    
    public long getLatestTimestamp()
    {
      return mLatestTimestamp;
    }
    
    @Nullable
    public String[] getMessages()
    {
      return mMessages;
    }
    
    @Nullable
    public String getParticipant()
    {
      Object localObject = mParticipants;
      if (localObject.length > 0) {
        localObject = localObject[0];
      } else {
        localObject = null;
      }
      return (String)localObject;
    }
    
    @Nullable
    public String[] getParticipants()
    {
      return mParticipants;
    }
    
    @Nullable
    public PendingIntent getReadPendingIntent()
    {
      return mReadPendingIntent;
    }
    
    @Nullable
    public RemoteInput getRemoteInput()
    {
      return mRemoteInput;
    }
    
    @Nullable
    public PendingIntent getReplyPendingIntent()
    {
      return mReplyPendingIntent;
    }
    
    public static class Builder
    {
      private long mLatestTimestamp;
      private final List<String> mMessages = new ArrayList();
      private final String mParticipant;
      private PendingIntent mReadPendingIntent;
      private RemoteInput mRemoteInput;
      private PendingIntent mReplyPendingIntent;
      
      public Builder(@NonNull String paramString)
      {
        mParticipant = paramString;
      }
      
      @NonNull
      public Builder addMessage(@Nullable String paramString)
      {
        if (paramString != null) {
          mMessages.add(paramString);
        }
        return this;
      }
      
      @NonNull
      public NotificationCompat.CarExtender.UnreadConversation build()
      {
        Object localObject = mMessages;
        localObject = (String[])((List)localObject).toArray(new String[((List)localObject).size()]);
        String str = mParticipant;
        RemoteInput localRemoteInput = mRemoteInput;
        PendingIntent localPendingIntent1 = mReplyPendingIntent;
        PendingIntent localPendingIntent2 = mReadPendingIntent;
        long l = mLatestTimestamp;
        return new NotificationCompat.CarExtender.UnreadConversation((String[])localObject, localRemoteInput, localPendingIntent1, localPendingIntent2, new String[] { str }, l);
      }
      
      @NonNull
      public Builder setLatestTimestamp(long paramLong)
      {
        mLatestTimestamp = paramLong;
        return this;
      }
      
      @NonNull
      public Builder setReadPendingIntent(@Nullable PendingIntent paramPendingIntent)
      {
        mReadPendingIntent = paramPendingIntent;
        return this;
      }
      
      @NonNull
      public Builder setReplyAction(@Nullable PendingIntent paramPendingIntent, @Nullable RemoteInput paramRemoteInput)
      {
        mRemoteInput = paramRemoteInput;
        mReplyPendingIntent = paramPendingIntent;
        return this;
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.NotificationCompat.CarExtender
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */