package androidx.activity.result;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class IntentSenderRequest$Builder
{
  private Intent mFillInIntent;
  private int mFlagsMask;
  private int mFlagsValues;
  private IntentSender mIntentSender;
  
  public IntentSenderRequest$Builder(@NonNull PendingIntent paramPendingIntent)
  {
    this(paramPendingIntent.getIntentSender());
  }
  
  public IntentSenderRequest$Builder(@NonNull IntentSender paramIntentSender)
  {
    mIntentSender = paramIntentSender;
  }
  
  @NonNull
  public IntentSenderRequest build()
  {
    return new IntentSenderRequest(mIntentSender, mFillInIntent, mFlagsMask, mFlagsValues);
  }
  
  @NonNull
  public Builder setFillInIntent(@Nullable Intent paramIntent)
  {
    mFillInIntent = paramIntent;
    return this;
  }
  
  @NonNull
  public Builder setFlags(int paramInt1, int paramInt2)
  {
    mFlagsValues = paramInt1;
    mFlagsMask = paramInt2;
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.activity.result.IntentSenderRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */