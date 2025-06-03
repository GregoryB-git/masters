package androidx.versionedparcelable;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

class VersionedParcel$1
  extends ObjectInputStream
{
  public VersionedParcel$1(VersionedParcel paramVersionedParcel, InputStream paramInputStream)
  {
    super(paramInputStream);
  }
  
  public Class<?> resolveClass(ObjectStreamClass paramObjectStreamClass)
    throws IOException, ClassNotFoundException
  {
    Class localClass = Class.forName(paramObjectStreamClass.getName(), false, getClass().getClassLoader());
    if (localClass != null) {
      return localClass;
    }
    return super.resolveClass(paramObjectStreamClass);
  }
}

/* Location:
 * Qualified Name:     androidx.versionedparcelable.VersionedParcel.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */