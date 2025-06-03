package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class EventMessage$1
  implements Parcelable.Creator<EventMessage>
{
  public EventMessage createFromParcel(Parcel paramParcel)
  {
    return new EventMessage(paramParcel);
  }
  
  public EventMessage[] newArray(int paramInt)
  {
    return new EventMessage[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.emsg.EventMessage.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */