package m9;

import android.util.Base64;
import f;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import ma.h;

public final class g
{
  public final int a;
  public final h b;
  public final int c;
  public final MessageDigest d;
  
  public g(h paramh, int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt1 < 8))
    {
      if (paramInt2 >= 0)
      {
        if ((paramh.size() > 0) && (paramInt2 == 0)) {
          throw new IllegalArgumentException(f.h("Invalid hash count: ", paramInt2));
        }
        if ((paramh.size() == 0) && (paramInt1 != 0)) {
          throw new IllegalArgumentException(f.h("Expected padding of 0 when bitmap length is 0, but got ", paramInt1));
        }
        b = paramh;
        c = paramInt2;
        a = (paramh.size() * 8 - paramInt1);
        try
        {
          paramh = MessageDigest.getInstance("MD5");
          d = paramh;
          return;
        }
        catch (NoSuchAlgorithmException paramh)
        {
          throw new RuntimeException("Missing MD5 MessageDigest provider: ", paramh);
        }
      }
      throw new IllegalArgumentException(f.h("Invalid hash count: ", paramInt2));
    }
    throw new IllegalArgumentException(f.h("Invalid padding: ", paramInt1));
  }
  
  public static g a(h paramh, int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt1 < 8))
    {
      if (paramInt2 >= 0)
      {
        if ((paramh.size() > 0) && (paramInt2 == 0)) {
          throw new a(f.h("Invalid hash count: ", paramInt2));
        }
        if ((paramh.size() == 0) && (paramInt1 != 0)) {
          throw new a(f.h("Expected padding of 0 when bitmap length is 0, but got ", paramInt1));
        }
        return new g(paramh, paramInt1, paramInt2);
      }
      throw new a(f.h("Invalid hash count: ", paramInt2));
    }
    throw new a(f.h("Invalid padding: ", paramInt1));
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("BloomFilter{hashCount=");
    localStringBuilder.append(c);
    localStringBuilder.append(", size=");
    localStringBuilder.append(a);
    localStringBuilder.append(", bitmap=\"");
    localStringBuilder.append(Base64.encodeToString(b.z(), 2));
    localStringBuilder.append("\"}");
    return localStringBuilder.toString();
  }
  
  public static final class a
    extends Exception
  {
    public a(String paramString)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     m9.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */