package G5;

import D5.m;
import D5.m.b;
import android.view.PointerIcon;
import java.util.AbstractMap;
import java.util.HashMap;

public class b
{
  public static HashMap c;
  public final c a;
  public final m b;
  
  public b(c paramc, m paramm)
  {
    a = paramc;
    b = paramm;
    paramm.b(new a());
  }
  
  public void c()
  {
    b.b(null);
  }
  
  public final PointerIcon d(String paramString)
  {
    if (c == null) {
      c = new b();
    }
    int i = ((Integer)a.a(c, paramString, Integer.valueOf(1000))).intValue();
    return a.b(i);
  }
  
  public class a
    implements m.b
  {
    public a() {}
    
    public void a(String paramString)
    {
      b.b(b.this).setPointerIcon(b.a(b.this, paramString));
    }
  }
  
  public class b
    extends HashMap
  {
    private static final long serialVersionUID = 1L;
    
    public b()
    {
      put("alias", Integer.valueOf(1010));
      Integer localInteger1 = Integer.valueOf(1013);
      put("allScroll", localInteger1);
      put("basic", Integer.valueOf(1000));
      put("cell", Integer.valueOf(1006));
      put("click", Integer.valueOf(1002));
      put("contextMenu", Integer.valueOf(1001));
      put("copy", Integer.valueOf(1011));
      this$1 = Integer.valueOf(1012);
      put("forbidden", b.this);
      put("grab", Integer.valueOf(1020));
      put("grabbing", Integer.valueOf(1021));
      put("help", Integer.valueOf(1003));
      put("move", localInteger1);
      put("none", Integer.valueOf(0));
      put("noDrop", b.this);
      put("precise", Integer.valueOf(1007));
      put("text", Integer.valueOf(1008));
      localInteger1 = Integer.valueOf(1014);
      put("resizeColumn", localInteger1);
      Integer localInteger2 = Integer.valueOf(1015);
      put("resizeDown", localInteger2);
      this$1 = Integer.valueOf(1016);
      put("resizeUpLeft", b.this);
      Integer localInteger3 = Integer.valueOf(1017);
      put("resizeDownRight", localInteger3);
      put("resizeLeft", localInteger1);
      put("resizeLeftRight", localInteger1);
      put("resizeRight", localInteger1);
      put("resizeRow", localInteger2);
      put("resizeUp", localInteger2);
      put("resizeUpDown", localInteger2);
      put("resizeUpLeft", localInteger3);
      put("resizeUpRight", b.this);
      put("resizeUpLeftDownRight", localInteger3);
      put("resizeUpRightDownLeft", b.this);
      put("verticalText", Integer.valueOf(1009));
      put("wait", Integer.valueOf(1004));
      put("zoomIn", Integer.valueOf(1018));
      put("zoomOut", Integer.valueOf(1019));
    }
  }
  
  public static abstract interface c
  {
    public abstract PointerIcon b(int paramInt);
    
    public abstract void setPointerIcon(PointerIcon paramPointerIcon);
  }
}

/* Location:
 * Qualified Name:     G5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */