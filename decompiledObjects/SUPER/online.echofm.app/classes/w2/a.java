package w2;

import B2.c;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;

public final class a
  extends B2.a
{
  @NonNull
  public static final Parcelable.Creator<a> CREATOR = new d();
  public Intent o;
  
  public a(Intent paramIntent)
  {
    o = paramIntent;
  }
  
  public Intent a()
  {
    return o;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.m(paramParcel, 1, o, paramInt, false);
    c.b(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     w2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */