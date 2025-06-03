package q0;

import android.net.Uri;
import g0.a;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public final class e
{
  public final LinkedHashMap a;
  
  public e(final int paramInt)
  {
    a = new a(paramInt + 1, 1.0F, false, paramInt);
  }
  
  public byte[] a(Uri paramUri)
  {
    if (paramUri == null) {
      return null;
    }
    return (byte[])a.get(paramUri);
  }
  
  public byte[] b(Uri paramUri, byte[] paramArrayOfByte)
  {
    return (byte[])a.put((Uri)a.e(paramUri), (byte[])a.e(paramArrayOfByte));
  }
  
  public byte[] c(Uri paramUri)
  {
    return (byte[])a.remove(a.e(paramUri));
  }
  
  public class a
    extends LinkedHashMap
  {
    public a(int paramInt1, float paramFloat, boolean paramBoolean, int paramInt2)
    {
      super(paramFloat, paramBoolean);
    }
    
    public boolean removeEldestEntry(Map.Entry paramEntry)
    {
      boolean bool;
      if (size() > paramInt) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     q0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */