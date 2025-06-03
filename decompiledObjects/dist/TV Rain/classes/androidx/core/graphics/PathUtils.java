package androidx.core.graphics;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Collection;
import p3;

public final class PathUtils
{
  @NonNull
  @RequiresApi(26)
  public static Collection<PathSegment> flatten(@NonNull Path paramPath)
  {
    return flatten(paramPath, 0.5F);
  }
  
  @NonNull
  @RequiresApi(26)
  public static Collection<PathSegment> flatten(@NonNull Path paramPath, @FloatRange(from=0.0D) float paramFloat)
  {
    paramPath = Api26Impl.approximate(paramPath, paramFloat);
    int i = paramPath.length / 3;
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 1; j < i; j++)
    {
      int k = j * 3;
      int m = (j - 1) * 3;
      float f1 = paramPath[k];
      float f2 = paramPath[(k + 1)];
      float f3 = paramPath[(k + 2)];
      float f4 = paramPath[m];
      paramFloat = paramPath[(m + 1)];
      float f5 = paramPath[(m + 2)];
      if ((f1 != f4) && ((f2 != paramFloat) || (f3 != f5))) {
        localArrayList.add(new PathSegment(new PointF(paramFloat, f5), f4, new PointF(f2, f3), f1));
      }
    }
    return localArrayList;
  }
  
  @RequiresApi(26)
  public static class Api26Impl
  {
    @DoNotInline
    public static float[] approximate(Path paramPath, float paramFloat)
    {
      return p3.w(paramPath, paramFloat);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.PathUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */