package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public enum Transport
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<Transport> CREATOR = new a();
  public final String a;
  
  static
  {
    Transport localTransport1 = new Transport("BLUETOOTH_CLASSIC", 0, "bt");
    Transport localTransport2 = new Transport("BLUETOOTH_LOW_ENERGY", 1, "ble");
    Transport localTransport3 = new Transport("NFC", 2, "nfc");
    Transport localTransport4 = new Transport("USB", 3, "usb");
    Transport localTransport5 = new Transport("INTERNAL", 4, "internal");
    Transport localTransport6 = new Transport("HYBRID", 5, "cable");
    b = localTransport6;
    c = new Transport[] { localTransport1, localTransport2, localTransport3, localTransport4, localTransport5, localTransport6 };
  }
  
  public Transport(String paramString1)
  {
    a = paramString1;
  }
  
  public static Transport f(String paramString)
  {
    for (Transport localTransport : ) {
      if (paramString.equals(a)) {
        return localTransport;
      }
    }
    if (paramString.equals("hybrid")) {
      return b;
    }
    throw new a(String.format("Transport %s not supported", new Object[] { paramString }));
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return a;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(a);
  }
  
  public static final class a
    extends Exception
  {
    public a(String paramString)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.fido.common.Transport
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */