package q5;

import h5.a.a;
import h5.g;
import h5.i;
import java.util.ArrayList;
import java.util.Collections;
import n7.d;
import v5.e0;
import v5.u;

public final class a
  extends h5.f
{
  public final u m = new u();
  
  public final g h(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    m.E(paramArrayOfByte, paramInt);
    ArrayList localArrayList = new ArrayList();
    for (;;)
    {
      paramArrayOfByte = m;
      paramInt = c - b;
      if (paramInt <= 0) {
        break label325;
      }
      if (paramInt < 8) {
        break;
      }
      paramInt = paramArrayOfByte.f();
      if (m.f() == 1987343459)
      {
        Object localObject1 = m;
        paramInt -= 8;
        paramArrayOfByte = null;
        Object localObject2 = paramArrayOfByte;
        while (paramInt > 0) {
          if (paramInt >= 8)
          {
            int i = ((u)localObject1).f();
            int j = ((u)localObject1).f();
            int k = i - 8;
            Object localObject3 = a;
            int n = b;
            i = e0.a;
            localObject3 = new String((byte[])localObject3, n, k, d.c);
            ((u)localObject1).H(k);
            i = paramInt - 8 - k;
            if (j == 1937011815)
            {
              localObject2 = new f.d();
              f.e((String)localObject3, (f.d)localObject2);
              localObject2 = ((f.d)localObject2).a();
              paramInt = i;
            }
            else
            {
              paramInt = i;
              if (j == 1885436268)
              {
                paramArrayOfByte = f.f(null, ((String)localObject3).trim(), Collections.emptyList());
                paramInt = i;
              }
            }
          }
          else
          {
            throw new i("Incomplete vtt cue box header found.");
          }
        }
        localObject1 = paramArrayOfByte;
        if (paramArrayOfByte == null) {
          localObject1 = "";
        }
        if (localObject2 != null)
        {
          a = ((CharSequence)localObject1);
          paramArrayOfByte = ((a.a)localObject2).a();
        }
        else
        {
          paramArrayOfByte = f.a;
          paramArrayOfByte = new f.d();
          c = ((CharSequence)localObject1);
          paramArrayOfByte = paramArrayOfByte.a().a();
        }
        localArrayList.add(paramArrayOfByte);
      }
      else
      {
        m.H(paramInt - 8);
      }
    }
    throw new i("Incomplete Mp4Webvtt Top Level box header found.");
    label325:
    return new b(localArrayList);
  }
}

/* Location:
 * Qualified Name:     q5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */