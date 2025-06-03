package e0;

import android.content.ClipData;
import android.view.ContentInfo;
import f;

public final class c$d
  implements c.e
{
  public final ContentInfo a;
  
  public c$d(ContentInfo paramContentInfo)
  {
    paramContentInfo.getClass();
    a = paramContentInfo;
  }
  
  public final ClipData a()
  {
    return a.getClip();
  }
  
  public final ContentInfo b()
  {
    return a;
  }
  
  public final int c()
  {
    return a.getSource();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("ContentInfoCompat{");
    localStringBuilder.append(a);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final int w()
  {
    return a.getFlags();
  }
}

/* Location:
 * Qualified Name:     e0.c.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */