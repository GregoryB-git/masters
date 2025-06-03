package androidx.vectordrawable.graphics.drawable;

import android.content.res.Resources.Theme;
import android.graphics.Path;
import android.util.Log;
import androidx.core.graphics.PathParser;
import androidx.core.graphics.PathParser.PathDataNode;
import z2;

abstract class VectorDrawableCompat$VPath
  extends VectorDrawableCompat.VObject
{
  public static final int FILL_TYPE_WINDING = 0;
  public int mChangingConfigurations;
  public int mFillRule = 0;
  public PathParser.PathDataNode[] mNodes = null;
  public String mPathName;
  
  public VectorDrawableCompat$VPath()
  {
    super(null);
  }
  
  public VectorDrawableCompat$VPath(VPath paramVPath)
  {
    super(null);
    mPathName = mPathName;
    mChangingConfigurations = mChangingConfigurations;
    mNodes = PathParser.deepCopyNodes(mNodes);
  }
  
  public void applyTheme(Resources.Theme paramTheme) {}
  
  public boolean canApplyTheme()
  {
    return false;
  }
  
  public PathParser.PathDataNode[] getPathData()
  {
    return mNodes;
  }
  
  public String getPathName()
  {
    return mPathName;
  }
  
  public boolean isClipPath()
  {
    return false;
  }
  
  public String nodesToString(PathParser.PathDataNode[] paramArrayOfPathDataNode)
  {
    Object localObject = " ";
    for (int i = 0; i < paramArrayOfPathDataNode.length; i++)
    {
      localObject = z2.t((String)localObject);
      ((StringBuilder)localObject).append(mType);
      ((StringBuilder)localObject).append(":");
      localObject = ((StringBuilder)localObject).toString();
      float[] arrayOfFloat = mParams;
      for (int j = 0; j < arrayOfFloat.length; j++)
      {
        localObject = z2.t((String)localObject);
        ((StringBuilder)localObject).append(arrayOfFloat[j]);
        ((StringBuilder)localObject).append(",");
        localObject = ((StringBuilder)localObject).toString();
      }
    }
    return (String)localObject;
  }
  
  public void printVPath(int paramInt)
  {
    Object localObject = "";
    for (int i = 0; i < paramInt; i++) {
      localObject = z2.o((String)localObject, "    ");
    }
    localObject = z2.u((String)localObject, "current path is :");
    ((StringBuilder)localObject).append(mPathName);
    ((StringBuilder)localObject).append(" pathData is ");
    ((StringBuilder)localObject).append(nodesToString(mNodes));
    Log.v("VectorDrawableCompat", ((StringBuilder)localObject).toString());
  }
  
  public void setPathData(PathParser.PathDataNode[] paramArrayOfPathDataNode)
  {
    if (!PathParser.canMorph(mNodes, paramArrayOfPathDataNode)) {
      mNodes = PathParser.deepCopyNodes(paramArrayOfPathDataNode);
    } else {
      PathParser.updateNodes(mNodes, paramArrayOfPathDataNode);
    }
  }
  
  public void toPath(Path paramPath)
  {
    paramPath.reset();
    PathParser.PathDataNode[] arrayOfPathDataNode = mNodes;
    if (arrayOfPathDataNode != null) {
      PathParser.PathDataNode.nodesToPath(arrayOfPathDataNode, paramPath);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */