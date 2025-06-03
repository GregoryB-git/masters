package androidx.activity.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;

class ActivityResult$1
  implements Parcelable.Creator<ActivityResult>
{
  public ActivityResult createFromParcel(@NonNull Parcel paramParcel)
  {
    return new ActivityResult(paramParcel);
  }
  
  public ActivityResult[] newArray(int paramInt)
  {
    return new ActivityResult[paramInt];
  }
}

/* Location:
 * Qualified Name:     androidx.activity.result.ActivityResult.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */