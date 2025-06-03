package androidx.transition;

import android.graphics.PointF;
import android.util.Property;

final class ChangeTransform$2
  extends Property<ChangeTransform.PathAnimatorMatrix, PointF>
{
  public ChangeTransform$2(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public PointF get(ChangeTransform.PathAnimatorMatrix paramPathAnimatorMatrix)
  {
    return null;
  }
  
  public void set(ChangeTransform.PathAnimatorMatrix paramPathAnimatorMatrix, PointF paramPointF)
  {
    paramPathAnimatorMatrix.setTranslation(paramPointF);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ChangeTransform.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */