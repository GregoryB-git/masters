package androidx.activity.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class IntentSenderRequest$1
  implements Parcelable.Creator<IntentSenderRequest>
{
  public IntentSenderRequest createFromParcel(Parcel paramParcel)
  {
    return new IntentSenderRequest(paramParcel);
  }
  
  public IntentSenderRequest[] newArray(int paramInt)
  {
    return new IntentSenderRequest[paramInt];
  }
}

/* Location:
 * Qualified Name:     androidx.activity.result.IntentSenderRequest.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */