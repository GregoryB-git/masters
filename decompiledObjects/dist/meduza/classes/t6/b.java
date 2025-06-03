package t6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import m6.h;
import m6.j;
import n6.c;

public abstract class b
  extends a
  implements c
{
  public final int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    if (!getClass().isInstance(paramObject)) {
      return false;
    }
    a locala = (a)paramObject;
    Iterator localIterator = getFieldMappings().values().iterator();
    while (localIterator.hasNext())
    {
      paramObject = (a.a)localIterator.next();
      if (isFieldSet((a.a)paramObject))
      {
        if ((!locala.isFieldSet((a.a)paramObject)) || (!h.a(getFieldValue((a.a)paramObject), locala.getFieldValue((a.a)paramObject)))) {
          return false;
        }
      }
      else if (locala.isFieldSet((a.a)paramObject)) {
        return false;
      }
    }
    return true;
  }
  
  public Object getValueObject(String paramString)
  {
    return null;
  }
  
  public int hashCode()
  {
    Iterator localIterator = getFieldMappings().values().iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      Object localObject = (a.a)localIterator.next();
      if (isFieldSet((a.a)localObject))
      {
        localObject = getFieldValue((a.a)localObject);
        j.i(localObject);
        i = i * 31 + localObject.hashCode();
      }
    }
    return i;
  }
  
  public boolean isPrimitiveFieldSet(String paramString)
  {
    return false;
  }
  
  public byte[] toByteArray()
  {
    Parcel localParcel = Parcel.obtain();
    writeToParcel(localParcel, 0);
    byte[] arrayOfByte = localParcel.marshall();
    localParcel.recycle();
    return arrayOfByte;
  }
}

/* Location:
 * Qualified Name:     t6.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */