package V0;

import android.os.Parcel;

public final class f$b
{
  public final int a;
  public final long b;
  
  public f$b(int paramInt, long paramLong)
  {
    a = paramInt;
    b = paramLong;
  }
  
  public static b c(Parcel paramParcel)
  {
    return new b(paramParcel.readInt(), paramParcel.readLong());
  }
  
  public final void d(Parcel paramParcel)
  {
    paramParcel.writeInt(a);
    paramParcel.writeLong(b);
  }
}

/* Location:
 * Qualified Name:     V0.f.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */