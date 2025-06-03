package R2;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.a0;
import com.google.android.gms.internal.measurement.b0;

public abstract class Q1
  extends b0
  implements R1
{
  public Q1()
  {
    super("com.google.android.gms.measurement.internal.IMeasurementService");
  }
  
  public final boolean n(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject1;
    Object localObject2;
    switch (paramInt1)
    {
    case 3: 
    case 8: 
    case 22: 
    case 23: 
    default: 
      return false;
    case 24: 
      localObject1 = (W5)a0.a(paramParcel1, W5.CREATOR);
      localObject2 = (Bundle)a0.a(paramParcel1, Bundle.CREATOR);
      a0.f(paramParcel1);
      paramParcel1 = F((W5)localObject1, (Bundle)localObject2);
      paramParcel2.writeNoException();
      paramParcel2.writeTypedList(paramParcel1);
      break;
    case 21: 
      localObject1 = (W5)a0.a(paramParcel1, W5.CREATOR);
      a0.f(paramParcel1);
      paramParcel1 = P0((W5)localObject1);
      paramParcel2.writeNoException();
      a0.g(paramParcel2, paramParcel1);
      break;
    case 20: 
      localObject1 = (W5)a0.a(paramParcel1, W5.CREATOR);
      a0.f(paramParcel1);
      U0((W5)localObject1);
    case 19: 
    case 18: 
    case 17: 
    case 16: 
    case 15: 
    case 14: 
    case 13: 
    case 12: 
    case 11: 
    case 10: 
    case 9: 
    case 7: 
    case 6: 
    case 5: 
    case 4: 
    case 2: 
    case 1: 
      for (;;)
      {
        paramParcel2.writeNoException();
        break label891;
        localObject1 = (Bundle)a0.a(paramParcel1, Bundle.CREATOR);
        localObject2 = (W5)a0.a(paramParcel1, W5.CREATOR);
        a0.f(paramParcel1);
        O0((Bundle)localObject1, (W5)localObject2);
        continue;
        localObject1 = (W5)a0.a(paramParcel1, W5.CREATOR);
        a0.f(paramParcel1);
        D0((W5)localObject1);
        continue;
        localObject1 = paramParcel1.readString();
        String str = paramParcel1.readString();
        localObject2 = paramParcel1.readString();
        a0.f(paramParcel1);
        paramParcel1 = K0((String)localObject1, str, (String)localObject2);
        break;
        localObject2 = paramParcel1.readString();
        str = paramParcel1.readString();
        localObject1 = (W5)a0.a(paramParcel1, W5.CREATOR);
        a0.f(paramParcel1);
        paramParcel1 = V0((String)localObject2, str, (W5)localObject1);
        break;
        str = paramParcel1.readString();
        localObject2 = paramParcel1.readString();
        localObject1 = paramParcel1.readString();
        boolean bool = a0.h(paramParcel1);
        a0.f(paramParcel1);
        paramParcel1 = W(str, (String)localObject2, (String)localObject1, bool);
        break;
        str = paramParcel1.readString();
        localObject2 = paramParcel1.readString();
        bool = a0.h(paramParcel1);
        localObject1 = (W5)a0.a(paramParcel1, W5.CREATOR);
        a0.f(paramParcel1);
        paramParcel1 = x0(str, (String)localObject2, bool, (W5)localObject1);
        break;
        localObject1 = (e)a0.a(paramParcel1, e.CREATOR);
        a0.f(paramParcel1);
        n0((e)localObject1);
        continue;
        localObject1 = (e)a0.a(paramParcel1, e.CREATOR);
        localObject2 = (W5)a0.a(paramParcel1, W5.CREATOR);
        a0.f(paramParcel1);
        m0((e)localObject1, (W5)localObject2);
        continue;
        localObject1 = (W5)a0.a(paramParcel1, W5.CREATOR);
        a0.f(paramParcel1);
        paramParcel1 = G((W5)localObject1);
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        break label891;
        long l = paramParcel1.readLong();
        localObject2 = paramParcel1.readString();
        localObject1 = paramParcel1.readString();
        str = paramParcel1.readString();
        a0.f(paramParcel1);
        I0(l, (String)localObject2, (String)localObject1, str);
        continue;
        localObject2 = (I)a0.a(paramParcel1, I.CREATOR);
        localObject1 = paramParcel1.readString();
        a0.f(paramParcel1);
        paramParcel1 = M0((I)localObject2, (String)localObject1);
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        break label891;
        localObject1 = (W5)a0.a(paramParcel1, W5.CREATOR);
        bool = a0.h(paramParcel1);
        a0.f(paramParcel1);
        paramParcel1 = L0((W5)localObject1, bool);
        break;
        localObject1 = (W5)a0.a(paramParcel1, W5.CREATOR);
        a0.f(paramParcel1);
        N((W5)localObject1);
        continue;
        localObject1 = (I)a0.a(paramParcel1, I.CREATOR);
        str = paramParcel1.readString();
        localObject2 = paramParcel1.readString();
        a0.f(paramParcel1);
        S0((I)localObject1, str, (String)localObject2);
        continue;
        localObject1 = (W5)a0.a(paramParcel1, W5.CREATOR);
        a0.f(paramParcel1);
        c0((W5)localObject1);
        continue;
        localObject1 = (R5)a0.a(paramParcel1, R5.CREATOR);
        localObject2 = (W5)a0.a(paramParcel1, W5.CREATOR);
        a0.f(paramParcel1);
        Z((R5)localObject1, (W5)localObject2);
        continue;
        localObject1 = (I)a0.a(paramParcel1, I.CREATOR);
        localObject2 = (W5)a0.a(paramParcel1, W5.CREATOR);
        a0.f(paramParcel1);
        R0((I)localObject1, (W5)localObject2);
      }
    }
    label891:
    return true;
  }
}

/* Location:
 * Qualified Name:     R2.Q1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */