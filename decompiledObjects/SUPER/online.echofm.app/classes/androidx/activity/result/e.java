package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;

public final class e
  implements Parcelable
{
  @NonNull
  public static final Parcelable.Creator<e> CREATOR = new a();
  public final IntentSender o;
  public final Intent p;
  public final int q;
  public final int r;
  
  public e(IntentSender paramIntentSender, Intent paramIntent, int paramInt1, int paramInt2)
  {
    o = paramIntentSender;
    p = paramIntent;
    q = paramInt1;
    r = paramInt2;
  }
  
  public e(Parcel paramParcel)
  {
    o = ((IntentSender)paramParcel.readParcelable(IntentSender.class.getClassLoader()));
    p = ((Intent)paramParcel.readParcelable(Intent.class.getClassLoader()));
    q = paramParcel.readInt();
    r = paramParcel.readInt();
  }
  
  public Intent a()
  {
    return p;
  }
  
  public int b()
  {
    return q;
  }
  
  public int c()
  {
    return r;
  }
  
  public IntentSender d()
  {
    return o;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(o, paramInt);
    paramParcel.writeParcelable(p, paramInt);
    paramParcel.writeInt(q);
    paramParcel.writeInt(r);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public e a(Parcel paramParcel)
    {
      return new e(paramParcel);
    }
    
    public e[] b(int paramInt)
    {
      return new e[paramInt];
    }
  }
  
  public static final class b
  {
    public IntentSender a;
    public Intent b;
    public int c;
    public int d;
    
    public b(IntentSender paramIntentSender)
    {
      a = paramIntentSender;
    }
    
    public e a()
    {
      return new e(a, b, c, d);
    }
    
    public b b(Intent paramIntent)
    {
      b = paramIntent;
      return this;
    }
    
    public b c(int paramInt1, int paramInt2)
    {
      d = paramInt1;
      c = paramInt2;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.activity.result.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */