package com.yandex.metrica;

import android.content.ContentValues;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.yandex.metrica.impl.ob.f0;

class CounterConfiguration$a
  implements Parcelable.Creator<CounterConfiguration>
{
  public Object createFromParcel(Parcel paramParcel)
  {
    return new CounterConfiguration((ContentValues)paramParcel.readBundle(f0.class.getClassLoader()).getParcelable("com.yandex.metrica.CounterConfiguration.data"));
  }
  
  public Object[] newArray(int paramInt)
  {
    return new CounterConfiguration[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.yandex.metrica.CounterConfiguration.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */