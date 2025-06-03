package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.d.c;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class v
{
  public final j a;
  public final ClassLoader b;
  public ArrayList c = new ArrayList();
  public int d;
  public int e;
  public int f;
  public int g;
  public int h;
  public boolean i;
  public boolean j = true;
  public String k;
  public int l;
  public CharSequence m;
  public int n;
  public CharSequence o;
  public ArrayList p;
  public ArrayList q;
  public boolean r = false;
  public ArrayList s;
  
  public v(j paramj, ClassLoader paramClassLoader)
  {
    a = paramj;
    b = paramClassLoader;
  }
  
  public v b(int paramInt, Fragment paramFragment, String paramString)
  {
    j(paramInt, paramFragment, paramString, 1);
    return this;
  }
  
  public v c(ViewGroup paramViewGroup, Fragment paramFragment, String paramString)
  {
    U = paramViewGroup;
    return b(paramViewGroup.getId(), paramFragment, paramString);
  }
  
  public v d(Fragment paramFragment, String paramString)
  {
    j(0, paramFragment, paramString, 1);
    return this;
  }
  
  public void e(a parama)
  {
    c.add(parama);
    c = d;
    d = e;
    e = f;
    f = g;
  }
  
  public abstract int f();
  
  public abstract int g();
  
  public abstract void h();
  
  public v i()
  {
    if (!i)
    {
      j = false;
      return this;
    }
    throw new IllegalStateException("This transaction is already being added to the back stack");
  }
  
  public void j(int paramInt1, Fragment paramFragment, String paramString, int paramInt2)
  {
    Object localObject = paramFragment.getClass();
    int i1 = ((Class)localObject).getModifiers();
    if ((!((Class)localObject).isAnonymousClass()) && (Modifier.isPublic(i1)) && ((!((Class)localObject).isMemberClass()) || (Modifier.isStatic(i1))))
    {
      if (paramString != null)
      {
        localObject = M;
        if ((localObject != null) && (!paramString.equals(localObject)))
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Can't change tag of fragment ");
          ((StringBuilder)localObject).append(paramFragment);
          ((StringBuilder)localObject).append(": was ");
          ((StringBuilder)localObject).append(M);
          ((StringBuilder)localObject).append(" now ");
          ((StringBuilder)localObject).append(paramString);
          throw new IllegalStateException(((StringBuilder)localObject).toString());
        }
        M = paramString;
      }
      if (paramInt1 != 0) {
        if (paramInt1 != -1)
        {
          i1 = K;
          if ((i1 != 0) && (i1 != paramInt1))
          {
            paramString = new StringBuilder();
            paramString.append("Can't change container ID of fragment ");
            paramString.append(paramFragment);
            paramString.append(": was ");
            paramString.append(K);
            paramString.append(" now ");
            paramString.append(paramInt1);
            throw new IllegalStateException(paramString.toString());
          }
          K = paramInt1;
          L = paramInt1;
        }
        else
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Can't add fragment ");
          ((StringBuilder)localObject).append(paramFragment);
          ((StringBuilder)localObject).append(" with tag ");
          ((StringBuilder)localObject).append(paramString);
          ((StringBuilder)localObject).append(" to container view with no id");
          throw new IllegalArgumentException(((StringBuilder)localObject).toString());
        }
      }
      e(new a(paramInt2, paramFragment));
      return;
    }
    paramFragment = new StringBuilder();
    paramFragment.append("Fragment ");
    paramFragment.append(((Class)localObject).getCanonicalName());
    paramFragment.append(" must be a public static class to be  properly recreated from instance state.");
    throw new IllegalStateException(paramFragment.toString());
  }
  
  public v k(Fragment paramFragment)
  {
    e(new a(3, paramFragment));
    return this;
  }
  
  public v l(boolean paramBoolean)
  {
    r = paramBoolean;
    return this;
  }
  
  public static final class a
  {
    public int a;
    public Fragment b;
    public int c;
    public int d;
    public int e;
    public int f;
    public d.c g;
    public d.c h;
    
    public a() {}
    
    public a(int paramInt, Fragment paramFragment)
    {
      a = paramInt;
      b = paramFragment;
      paramFragment = d.c.s;
      g = paramFragment;
      h = paramFragment;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */