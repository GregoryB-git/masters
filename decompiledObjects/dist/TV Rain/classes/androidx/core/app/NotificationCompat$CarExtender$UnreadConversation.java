package androidx.core.app;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class NotificationCompat$CarExtender$UnreadConversation
{
  private final long mLatestTimestamp;
  private final String[] mMessages;
  private final String[] mParticipants;
  private final PendingIntent mReadPendingIntent;
  private final RemoteInput mRemoteInput;
  private final PendingIntent mReplyPendingIntent;
  
  public NotificationCompat$CarExtender$UnreadConversation(@Nullable String[] paramArrayOfString1, @Nullable RemoteInput paramRemoteInput, @Nullable PendingIntent paramPendingIntent1, @Nullable PendingIntent paramPendingIntent2, @Nullable String[] paramArrayOfString2, long paramLong)
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

/* Location:
 * Qualified Name:     androidx.core.app.NotificationCompat.CarExtender.UnreadConversation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */