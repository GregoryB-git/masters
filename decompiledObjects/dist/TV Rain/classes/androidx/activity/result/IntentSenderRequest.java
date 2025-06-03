package androidx.activity.result;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest
  implements Parcelable
{
  @NonNull
  public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new Parcelable.Creator()
  {
    public IntentSenderRequest createFromParcel(Parcel paramAnonymousParcel)
    {
      return new IntentSenderRequest(paramAnonymousParcel);
    }
    
    public IntentSenderRequest[] newArray(int paramAnonymousInt)
    {
      return new IntentSenderRequest[paramAnonymousInt];
    }
  };
  @Nullable
  private final Intent mFillInIntent;
  private final int mFlagsMask;
  private final int mFlagsValues;
  @NonNull
  private final IntentSender mIntentSender;
  
  public IntentSenderRequest(@NonNull IntentSender paramIntentSender, @Nullable Intent paramIntent, int paramInt1, int paramInt2)
  {
    mIntentSender = paramIntentSender;
    mFillInIntent = paramIntent;
    mFlagsMask = paramInt1;
    mFlagsValues = paramInt2;
  }
  
  public IntentSenderRequest(@NonNull Parcel paramParcel)
  {
    mIntentSender = ((IntentSender)paramParcel.readParcelable(IntentSender.class.getClassLoader()));
    mFillInIntent = ((Intent)paramParcel.readParcelable(Intent.class.getClassLoader()));
    mFlagsMask = paramParcel.readInt();
    mFlagsValues = paramParcel.readInt();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  @Nullable
  public Intent getFillInIntent()
  {
    return mFillInIntent;
  }
  
  public int getFlagsMask()
  {
    return mFlagsMask;
  }
  
  public int getFlagsValues()
  {
    return mFlagsValues;
  }
  
  @NonNull
  public IntentSender getIntentSender()
  {
    return mIntentSender;
  }
  
  public void writeToParcel(@NonNull Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(mIntentSender, paramInt);
    paramParcel.writeParcelable(mFillInIntent, paramInt);
    paramParcel.writeInt(mFlagsMask);
    paramParcel.writeInt(mFlagsValues);
  }
  
  public static final class Builder
  {
    private Intent mFillInIntent;
    private int mFlagsMask;
    private int mFlagsValues;
    private IntentSender mIntentSender;
    
    public Builder(@NonNull PendingIntent paramPendingIntent)
    {
      this(paramPendingIntent.getIntentSender());
    }
    
    public Builder(@NonNull IntentSender paramIntentSender)
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
}

/* Location:
 * Qualified Name:     androidx.activity.result.IntentSenderRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */