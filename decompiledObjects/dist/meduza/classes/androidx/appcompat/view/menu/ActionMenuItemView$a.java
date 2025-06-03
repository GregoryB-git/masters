package androidx.appcompat.view.menu;

import androidx.appcompat.widget.a;
import androidx.appcompat.widget.a.b;
import k.f;
import l.l0;

public final class ActionMenuItemView$a
  extends l0
{
  public ActionMenuItemView$a(ActionMenuItemView paramActionMenuItemView)
  {
    super(paramActionMenuItemView);
  }
  
  public final f b()
  {
    Object localObject1 = r.u;
    Object localObject2 = null;
    Object localObject3 = localObject2;
    if (localObject1 != null)
    {
      localObject1 = a.B;
      localObject3 = localObject2;
      if (localObject1 != null) {
        localObject3 = ((i)localObject1).a();
      }
    }
    return (f)localObject3;
  }
  
  public final boolean c()
  {
    ActionMenuItemView localActionMenuItemView = r;
    Object localObject = s;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (localObject != null)
    {
      bool2 = bool1;
      if (((f.b)localObject).a(p))
      {
        localObject = b();
        bool2 = bool1;
        if (localObject != null)
        {
          bool2 = bool1;
          if (((f)localObject).a()) {
            bool2 = true;
          }
        }
      }
    }
    return bool2;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.ActionMenuItemView.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */