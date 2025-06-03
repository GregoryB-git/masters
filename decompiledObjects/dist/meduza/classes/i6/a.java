package i6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;

public final class a
  extends n6.a
{
  public static final Parcelable.Creator<a> CREATOR = new d();
  public final Intent a;
  
  public a(Intent paramIntent)
  {
    a = paramIntent;
  }
  
  public final String D()
  {
    String str1 = a.getStringExtra("google.message_id");
    String str2 = str1;
    if (str1 == null) {
      str2 = a.getStringExtra("message_id");
    }
    return str2;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.E(paramParcel, 1, a, paramInt, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     i6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */