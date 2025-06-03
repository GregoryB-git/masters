package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

class PathProperty<T>
  extends Property<T, Float>
{
  private float mCurrentFraction;
  private final float mPathLength;
  private final PathMeasure mPathMeasure;
  private final PointF mPointF = new PointF();
  private final float[] mPosition = new float[2];
  private final Property<T, PointF> mProperty;
  
  public PathProperty(Property<T, PointF> paramProperty, Path paramPath)
  {
    super(Float.class, paramProperty.getName());
    mProperty = paramProperty;
    paramProperty = new PathMeasure(paramPath, false);
    mPathMeasure = paramProperty;
    mPathLength = paramProperty.getLength();
  }
  
  public Float get(T paramT)
  {
    return Float.valueOf(mCurrentFraction);
  }
  
  public void set(T paramT, Float paramFloat)
  {
    mCurrentFraction = paramFloat.floatValue();
    Object localObject = mPathMeasure;
    float f = mPathLength;
    ((PathMeasure)localObject).getPosTan(paramFloat.floatValue() * f, mPosition, null);
    paramFloat = mPointF;
    localObject = mPosition;
    x = localObject[0];
    y = localObject[1];
    mProperty.set(paramT, paramFloat);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.PathProperty
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */