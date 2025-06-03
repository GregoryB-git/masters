package p0;

import android.media.MediaDrm;
import g0.a;
import k0.g0;
import l0.y1;
import m0.O;

public abstract class N$a
{
  public static boolean a(MediaDrm paramMediaDrm, String paramString)
  {
    return M.a(paramMediaDrm, paramString);
  }
  
  public static void b(MediaDrm paramMediaDrm, byte[] paramArrayOfByte, y1 paramy1)
  {
    paramy1 = paramy1.a();
    if (!O.a(paramy1, g0.a())) {
      L.a(K.a(a.e(J.a(paramMediaDrm, paramArrayOfByte))), paramy1);
    }
  }
}

/* Location:
 * Qualified Name:     p0.N.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */