package androidx.core.view;

import android.view.WindowInsets.Type;
import androidx.annotation.RequiresApi;

@RequiresApi(30)
final class WindowInsetsCompat$TypeImpl30
{
  public static int toPlatformType(int paramInt)
  {
    int i = 0;
    int j = 1;
    while (j <= 256)
    {
      int k = i;
      if ((paramInt & j) != 0)
      {
        if (j != 1)
        {
          if (j != 2)
          {
            if (j != 4)
            {
              if (j != 8)
              {
                if (j != 16)
                {
                  if (j != 32)
                  {
                    if (j != 64)
                    {
                      if (j != 128)
                      {
                        k = i;
                        break label127;
                      }
                      k = WindowInsets.Type.displayCutout();
                    }
                    else
                    {
                      k = WindowInsets.Type.tappableElement();
                    }
                  }
                  else {
                    k = WindowInsets.Type.mandatorySystemGestures();
                  }
                }
                else {
                  k = WindowInsets.Type.systemGestures();
                }
              }
              else {
                k = WindowInsets.Type.ime();
              }
            }
            else {
              k = WindowInsets.Type.captionBar();
            }
          }
          else {
            k = WindowInsets.Type.navigationBars();
          }
        }
        else {
          k = WindowInsets.Type.statusBars();
        }
        k = i | k;
      }
      label127:
      j <<= 1;
      i = k;
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsCompat.TypeImpl30
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */