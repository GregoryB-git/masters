package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class Trace$b
  implements Parcelable.Creator
{
  public Trace a(Parcel paramParcel)
  {
    return new Trace(paramParcel, true, null);
  }
  
  public Trace[] b(int paramInt)
  {
    return new Trace[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.perf.metrics.Trace.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */