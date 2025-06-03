package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import z2;

@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult
  implements Parcelable
{
  @NonNull
  public static final Parcelable.Creator<ActivityResult> CREATOR = new Parcelable.Creator()
  {
    public ActivityResult createFromParcel(@NonNull Parcel paramAnonymousParcel)
    {
      return new ActivityResult(paramAnonymousParcel);
    }
    
    public ActivityResult[] newArray(int paramAnonymousInt)
    {
      return new ActivityResult[paramAnonymousInt];
    }
  };
  @Nullable
  private final Intent mData;
  private final int mResultCode;
  
  public ActivityResult(int paramInt, @Nullable Intent paramIntent)
  {
    mResultCode = paramInt;
    mData = paramIntent;
  }
  
  public ActivityResult(Parcel paramParcel)
  {
    mResultCode = paramParcel.readInt();
    if (paramParcel.readInt() == 0) {
      paramParcel = null;
    } else {
      paramParcel = (Intent)Intent.CREATOR.createFromParcel(paramParcel);
    }
    mData = paramParcel;
  }
  
  @NonNull
  public static String resultCodeToString(int paramInt)
  {
    if (paramInt != -1)
    {
      if (paramInt != 0) {
        return String.valueOf(paramInt);
      }
      return "RESULT_CANCELED";
    }
    return "RESULT_OK";
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  @Nullable
  public Intent getData()
  {
    return mData;
  }
  
  public int getResultCode()
  {
    return mResultCode;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("ActivityResult{resultCode=");
    localStringBuilder.append(resultCodeToString(mResultCode));
    localStringBuilder.append(", data=");
    localStringBuilder.append(mData);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(@NonNull Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(mResultCode);
    int i;
    if (mData == null) {
      i = 0;
    } else {
      i = 1;
    }
    paramParcel.writeInt(i);
    Intent localIntent = mData;
    if (localIntent != null) {
      localIntent.writeToParcel(paramParcel, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.activity.result.ActivityResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */