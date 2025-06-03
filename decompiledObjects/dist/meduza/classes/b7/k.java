package b7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import java.util.Arrays;
import m6.h;
import n6.a;

public final class k
  extends a
{
  public static final Parcelable.Creator<k> CREATOR = new u1();
  public final b a;
  public final Boolean b;
  public final g1 c;
  public final c0 d;
  
  public k(String paramString1, Boolean paramBoolean, String paramString2, String paramString3)
  {
    int i = 0;
    Object localObject = null;
    if (paramString1 == null) {
      paramString1 = null;
    }
    for (;;)
    {
      int k;
      try
      {
        b[] arrayOfb = b.values();
        int j = arrayOfb.length;
        k = 0;
        if (k >= j) {
          break;
        }
        b localb = arrayOfb[k];
        if (!paramString1.equals(a)) {
          break label173;
        }
        paramString1 = localb;
        a = paramString1;
        b = paramBoolean;
        if (paramString2 == null) {
          paramString1 = null;
        } else {
          paramString1 = g1.f(paramString2);
        }
        c = paramString1;
        if (paramString3 == null)
        {
          paramString1 = (String)localObject;
        }
        else
        {
          paramBoolean = c0.values();
          j = paramBoolean.length;
          k = i;
          if (k >= j) {
            break label161;
          }
          paramString1 = paramBoolean[k];
          if (!paramString3.equals(a)) {
            continue;
          }
        }
        d = paramString1;
        return;
        k++;
        continue;
        paramString1 = new b7/c0$a;
      }
      catch (c0.a paramString1) {}catch (f1 paramString1) {}catch (b.a paramString1) {}
      label161:
      paramString1.<init>(paramString3);
      throw paramString1;
      label173:
      k++;
    }
    paramBoolean = new b7/b$a;
    paramBoolean.<init>(paramString1);
    throw paramBoolean;
    throw new IllegalArgumentException(paramString1);
  }
  
  public final c0 D()
  {
    c0 localc0 = d;
    Object localObject = localc0;
    if (localc0 == null)
    {
      localObject = b;
      if ((localObject != null) && (((Boolean)localObject).booleanValue())) {
        return c0.b;
      }
      localObject = null;
    }
    return (c0)localObject;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof k)) {
      return false;
    }
    paramObject = (k)paramObject;
    return (h.a(a, a)) && (h.a(b, b)) && (h.a(c, c)) && (h.a(D(), ((k)paramObject).D()));
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b, c, D() });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    Object localObject1 = a;
    Object localObject2 = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = a;
    }
    z.F(paramParcel, 2, (String)localObject1, false);
    z.u(paramParcel, 3, b);
    localObject1 = c;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = a;
    }
    z.F(paramParcel, 4, (String)localObject1, false);
    if (D() == null) {
      localObject1 = localObject2;
    } else {
      localObject1 = Da;
    }
    z.F(paramParcel, 5, (String)localObject1, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b7.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */