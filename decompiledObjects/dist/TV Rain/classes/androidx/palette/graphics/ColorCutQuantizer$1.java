package androidx.palette.graphics;

import java.util.Comparator;

final class ColorCutQuantizer$1
  implements Comparator<ColorCutQuantizer.Vbox>
{
  public int compare(ColorCutQuantizer.Vbox paramVbox1, ColorCutQuantizer.Vbox paramVbox2)
  {
    return paramVbox2.getVolume() - paramVbox1.getVolume();
  }
}

/* Location:
 * Qualified Name:     androidx.palette.graphics.ColorCutQuantizer.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */