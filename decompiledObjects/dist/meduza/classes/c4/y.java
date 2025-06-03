package c4;

import android.util.Base64;
import f;
import java.util.ArrayList;
import java.util.List;
import v3.a1;
import v5.e0;
import v5.m;
import v5.u;

public final class y
{
  public static p4.a a(List<String> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramList.size(); i++)
    {
      Object localObject1 = (String)paramList.get(i);
      int j = e0.a;
      Object localObject2 = ((String)localObject1).split("=", 2);
      if (localObject2.length != 2)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("Failed to parse Vorbis comment: ");
        ((StringBuilder)localObject2).append((String)localObject1);
        m.f("VorbisUtil", ((StringBuilder)localObject2).toString());
      }
      else if (localObject2[0].equals("METADATA_BLOCK_PICTURE"))
      {
        try
        {
          localObject1 = Base64.decode(localObject2[1], 0);
          localObject2 = new v5/u;
          ((u)localObject2).<init>((byte[])localObject1);
          localArrayList.add(s4.a.a((u)localObject2));
        }
        catch (RuntimeException localRuntimeException)
        {
          m.g("VorbisUtil", "Failed to parse vorbis picture", localRuntimeException);
        }
      }
      else
      {
        localArrayList.add(new x4.a(localObject2[0], localObject2[1]));
      }
    }
    if (localArrayList.isEmpty()) {
      paramList = null;
    } else {
      paramList = new p4.a(localArrayList);
    }
    return paramList;
  }
  
  public static a b(u paramu, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0;
    if (paramBoolean1) {
      c(3, paramu, false);
    }
    paramu.s((int)paramu.l());
    long l = paramu.l();
    String[] arrayOfString = new String[(int)l];
    while (i < l)
    {
      arrayOfString[i] = paramu.s((int)paramu.l());
      i++;
    }
    if ((paramBoolean2) && ((paramu.v() & 0x1) == 0)) {
      throw a1.a("framing bit expected to be set", null);
    }
    return new a(arrayOfString);
  }
  
  public static boolean c(int paramInt, u paramu, boolean paramBoolean)
  {
    if (c - b < 7)
    {
      if (paramBoolean) {
        return false;
      }
      StringBuilder localStringBuilder = f.l("too short header: ");
      localStringBuilder.append(c - b);
      throw a1.a(localStringBuilder.toString(), null);
    }
    if (paramu.v() != paramInt)
    {
      if (paramBoolean) {
        return false;
      }
      paramu = f.l("expected header type ");
      paramu.append(Integer.toHexString(paramInt));
      throw a1.a(paramu.toString(), null);
    }
    if ((paramu.v() == 118) && (paramu.v() == 111) && (paramu.v() == 114) && (paramu.v() == 98) && (paramu.v() == 105) && (paramu.v() == 115)) {
      return true;
    }
    if (paramBoolean) {
      return false;
    }
    throw a1.a("expected characters 'vorbis'", null);
  }
  
  public static final class a
  {
    public final String[] a;
    
    public a(String[] paramArrayOfString)
    {
      a = paramArrayOfString;
    }
  }
  
  public static final class b
  {
    public final boolean a;
    
    public b(boolean paramBoolean)
    {
      a = paramBoolean;
    }
  }
  
  public static final class c
  {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    
    public c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, byte[] paramArrayOfByte)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramInt3;
      d = paramInt4;
      e = paramInt5;
      f = paramInt6;
      g = paramArrayOfByte;
    }
  }
}

/* Location:
 * Qualified Name:     c4.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */