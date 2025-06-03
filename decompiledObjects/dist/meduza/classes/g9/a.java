package g9;

import android.app.Activity;
import android.app.Fragment;
import b.k;
import d9.b0;
import g.q;
import java.util.ArrayList;
import java.util.Iterator;
import x0.i;
import x6.b;

public final class a
{
  public static void a(Activity paramActivity, b0 paramb0)
  {
    if (paramActivity != null)
    {
      boolean bool = paramActivity instanceof x0.m;
      if (bool)
      {
        paramActivity = (x0.m)paramActivity;
        paramActivity.runOnUiThread(new x0.f(17, paramActivity, new k(paramb0, 11)));
      }
      else
      {
        paramb0 = new b.m(paramb0, 14);
        b.Z("onActivityStopCallOnce must be called with a *non*-FragmentActivity Activity.", bool ^ true, new Object[0]);
        paramActivity.runOnUiThread(new q(15, paramActivity, paramb0));
      }
    }
  }
  
  public static <T> T b(Class<T> paramClass, Object paramObject, String paramString)
  {
    if (paramObject == null) {
      return null;
    }
    try
    {
      Object localObject = paramClass.cast(paramObject);
      return (T)localObject;
    }
    catch (ClassCastException localClassCastException)
    {
      paramString = f.m("Fragment with tag '", paramString, "' is a ");
      paramString.append(paramObject.getClass().getName());
      paramString.append(" but should be a ");
      paramString.append(paramClass.getName());
      throw new IllegalStateException(paramString.toString());
    }
  }
  
  public static final class a
  {
    public final ArrayList a = new ArrayList();
  }
  
  public static final class b
    extends Fragment
  {
    public a.a a = new a.a();
    
    public final void onStop()
    {
      super.onStop();
      synchronized (a)
      {
        a.a locala = a;
        Object localObject2 = new g9/a$a;
        ((a.a)localObject2).<init>();
        a = ((a.a)localObject2);
        ??? = a.iterator();
        while (((Iterator)???).hasNext())
        {
          localObject2 = (Runnable)((Iterator)???).next();
          if (localObject2 != null) {
            ((Runnable)localObject2).run();
          }
        }
        return;
      }
    }
  }
  
  public static class c
    extends i
  {
    public a.a a = new a.a();
    
    public final void onStop()
    {
      super.onStop();
      synchronized (a)
      {
        Object localObject2 = a;
        a.a locala = new g9/a$a;
        locala.<init>();
        a = locala;
        ??? = a.iterator();
        while (((Iterator)???).hasNext())
        {
          localObject2 = (Runnable)((Iterator)???).next();
          if (localObject2 != null) {
            ((Runnable)localObject2).run();
          }
        }
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     g9.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */