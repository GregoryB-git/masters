package a0;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

public final class b
{
  public static final void a(Bundle paramBundle, String paramString, Size paramSize)
  {
    paramBundle.putSize(paramString, paramSize);
  }
  
  public static final void b(Bundle paramBundle, String paramString, SizeF paramSizeF)
  {
    paramBundle.putSizeF(paramString, paramSizeF);
  }
}

/* Location:
 * Qualified Name:     a0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */