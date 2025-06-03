package V0;

import android.os.Parcel;

public final class d$b
{
  public final int a;
  public final long b;
  public final long c;
  
  public d$b(int paramInt, long paramLong1, long paramLong2)
  {
    a = paramInt;
    b = paramLong1;
    c = paramLong2;
  }
  
  public static b a(Parcel paramParcel)
  {
    return new b(paramParcel.readInt(), paramParcel.readLong(), paramParcel.readLong());
  }
  
  public void b(Parcel paramParcel)
  {
    paramParcel.writeInt(a);
    paramParcel.writeLong(b);
    paramParcel.writeLong(c);
  }
}

/* Location:
 * Qualified Name:     V0.d.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */