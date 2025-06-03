package androidx.appcompat.view.menu;

import k.c;
import l.E;

public class ActionMenuItemView$a
  extends E
{
  public ActionMenuItemView$a(ActionMenuItemView paramActionMenuItemView)
  {
    super(paramActionMenuItemView);
  }
  
  public c b()
  {
    ActionMenuItemView.b localb = x.x;
    if (localb != null) {
      return localb.a();
    }
    return null;
  }
  
  public boolean c()
  {
    ActionMenuItemView localActionMenuItemView = x;
    Object localObject = v;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (localObject != null)
    {
      bool2 = bool1;
      if (((d.b)localObject).a(s))
      {
        localObject = b();
        bool2 = bool1;
        if (localObject != null)
        {
          bool2 = bool1;
          if (((c)localObject).i()) {
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