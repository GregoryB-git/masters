package J2;

import android.os.Parcel;

public abstract class c
{
  public static final ClassLoader a = c.class.getClassLoader();
  
  public static void a(Parcel paramParcel, boolean paramBoolean)
  {
    paramParcel.writeInt(1);
  }
  
  public static boolean b(Parcel paramParcel)
  {
    return paramParcel.readInt() != 0;
  }
}

/* Location:
 * Qualified Name:     J2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */