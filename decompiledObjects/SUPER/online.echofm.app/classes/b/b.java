package b;

import android.os.Bundle;
import android.os.Handler;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

public class b
  implements Parcelable
{
  public static final Parcelable.Creator<b> CREATOR = new a();
  public final boolean o = false;
  public final Handler p = null;
  public a q;
  
  public b(Parcel paramParcel)
  {
    q = a.a.n(paramParcel.readStrongBinder());
  }
  
  public void a(int paramInt, Bundle paramBundle) {}
  
  public void b(int paramInt, Bundle paramBundle)
  {
    if (o)
    {
      localObject = p;
      if (localObject != null) {
        ((Handler)localObject).post(new c(paramInt, paramBundle));
      } else {
        a(paramInt, paramBundle);
      }
      return;
    }
    Object localObject = q;
    if (localObject != null) {}
    try
    {
      ((a)localObject).T0(paramInt, paramBundle);
      return;
    }
    catch (RemoteException paramBundle)
    {
      for (;;) {}
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    try
    {
      if (q == null)
      {
        b localb = new b/b$b;
        localb.<init>(this);
        q = localb;
      }
    }
    finally
    {
      break label46;
    }
    paramParcel.writeStrongBinder(q.asBinder());
    return;
    label46:
    throw paramParcel;
  }
  
  public class a
    implements Parcelable.Creator
  {
    public b a(Parcel paramParcel)
    {
      return new b(paramParcel);
    }
    
    public b[] b(int paramInt)
    {
      return new b[paramInt];
    }
  }
  
  public class b
    extends a.a
  {
    public b() {}
    
    public void T0(int paramInt, Bundle paramBundle)
    {
      b localb = b.this;
      Handler localHandler = p;
      if (localHandler != null) {
        localHandler.post(new b.c(localb, paramInt, paramBundle));
      } else {
        localb.a(paramInt, paramBundle);
      }
    }
  }
  
  public class c
    implements Runnable
  {
    public final int o;
    public final Bundle p;
    
    public c(int paramInt, Bundle paramBundle)
    {
      o = paramInt;
      p = paramBundle;
    }
    
    public void run()
    {
      a(o, p);
    }
  }
}

/* Location:
 * Qualified Name:     b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */