package x0;

import android.util.Log;
import f;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import y0.b;

public final class a
  extends g0
  implements y.m
{
  public final y p;
  public boolean q;
  public int r = -1;
  
  public a(y paramy)
  {
    p = paramy;
  }
  
  public final boolean a(ArrayList<a> paramArrayList, ArrayList<Boolean> paramArrayList1)
  {
    if (y.L(2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Run: ");
      localStringBuilder.append(this);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    paramArrayList.add(this);
    paramArrayList1.add(Boolean.FALSE);
    if (g) {
      p.d.add(this);
    }
    return true;
  }
  
  public final void c(int paramInt)
  {
    if (!g) {
      return;
    }
    Object localObject1;
    if (y.L(2))
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Bump nesting in ");
      ((StringBuilder)localObject1).append(this);
      ((StringBuilder)localObject1).append(" by ");
      ((StringBuilder)localObject1).append(paramInt);
      Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
    }
    int i = a.size();
    for (int j = 0; j < i; j++)
    {
      localObject1 = (g0.a)a.get(j);
      Object localObject2 = b;
      if (localObject2 != null)
      {
        mBackStackNesting += paramInt;
        if (y.L(2))
        {
          localObject2 = f.l("Bump nesting of ");
          ((StringBuilder)localObject2).append(b);
          ((StringBuilder)localObject2).append(" to ");
          ((StringBuilder)localObject2).append(b.mBackStackNesting);
          Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
        }
      }
    }
  }
  
  public final int d(boolean paramBoolean)
  {
    if (!q)
    {
      if (y.L(2))
      {
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Commit: ");
        ((StringBuilder)localObject).append(this);
        Log.v("FragmentManager", ((StringBuilder)localObject).toString());
        localObject = new PrintWriter(new p0());
        f("  ", (PrintWriter)localObject, true);
        ((PrintWriter)localObject).close();
      }
      q = true;
      int i;
      if (g) {
        i = p.j.getAndIncrement();
      } else {
        i = -1;
      }
      r = i;
      p.y(this, paramBoolean);
      return r;
    }
    throw new IllegalStateException("commit already called");
  }
  
  public final void e(int paramInt, i parami, String paramString)
  {
    Object localObject = mPreviousWho;
    if (localObject != null) {
      b.d(parami, (String)localObject);
    }
    localObject = parami.getClass();
    int i = ((Class)localObject).getModifiers();
    if ((!((Class)localObject).isAnonymousClass()) && (Modifier.isPublic(i)) && ((!((Class)localObject).isMemberClass()) || (Modifier.isStatic(i))))
    {
      if (paramString != null)
      {
        localObject = mTag;
        if ((localObject != null) && (!paramString.equals(localObject)))
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Can't change tag of fragment ");
          ((StringBuilder)localObject).append(parami);
          ((StringBuilder)localObject).append(": was ");
          ((StringBuilder)localObject).append(mTag);
          ((StringBuilder)localObject).append(" now ");
          ((StringBuilder)localObject).append(paramString);
          throw new IllegalStateException(((StringBuilder)localObject).toString());
        }
        mTag = paramString;
      }
      if (paramInt != 0) {
        if (paramInt != -1)
        {
          i = mFragmentId;
          if ((i != 0) && (i != paramInt))
          {
            paramString = new StringBuilder();
            paramString.append("Can't change container ID of fragment ");
            paramString.append(parami);
            paramString.append(": was ");
            paramString.append(mFragmentId);
            paramString.append(" now ");
            paramString.append(paramInt);
            throw new IllegalStateException(paramString.toString());
          }
          mFragmentId = paramInt;
          mContainerId = paramInt;
        }
        else
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Can't add fragment ");
          ((StringBuilder)localObject).append(parami);
          ((StringBuilder)localObject).append(" with tag ");
          ((StringBuilder)localObject).append(paramString);
          ((StringBuilder)localObject).append(" to container view with no id");
          throw new IllegalArgumentException(((StringBuilder)localObject).toString());
        }
      }
      b(new g0.a(parami, 1));
      mFragmentManager = p;
      return;
    }
    parami = f.l("Fragment ");
    parami.append(((Class)localObject).getCanonicalName());
    parami.append(" must be a public static class to be  properly recreated from instance state.");
    throw new IllegalStateException(parami.toString());
  }
  
  public final void f(String paramString, PrintWriter paramPrintWriter, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mName=");
      paramPrintWriter.print(h);
      paramPrintWriter.print(" mIndex=");
      paramPrintWriter.print(r);
      paramPrintWriter.print(" mCommitted=");
      paramPrintWriter.println(q);
      if (f != 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mTransition=#");
        paramPrintWriter.print(Integer.toHexString(f));
      }
      if ((b != 0) || (c != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(b));
        paramPrintWriter.print(" mExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(c));
      }
      if ((d != 0) || (e != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mPopEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(d));
        paramPrintWriter.print(" mPopExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(e));
      }
      if ((this.i != 0) || (this.j != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.i));
        paramPrintWriter.print(" mBreadCrumbTitleText=");
        paramPrintWriter.println(this.j);
      }
      if ((k != 0) || (l != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(k));
        paramPrintWriter.print(" mBreadCrumbShortTitleText=");
        paramPrintWriter.println(l);
      }
    }
    if (!a.isEmpty())
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      int i = a.size();
      for (int j = 0; j < i; j++)
      {
        g0.a locala = (g0.a)a.get(j);
        Object localObject;
        switch (a)
        {
        default: 
          localObject = f.l("cmd=");
          ((StringBuilder)localObject).append(a);
          localObject = ((StringBuilder)localObject).toString();
          break;
        case 10: 
          localObject = "OP_SET_MAX_LIFECYCLE";
          break;
        case 9: 
          localObject = "UNSET_PRIMARY_NAV";
          break;
        case 8: 
          localObject = "SET_PRIMARY_NAV";
          break;
        case 7: 
          localObject = "ATTACH";
          break;
        case 6: 
          localObject = "DETACH";
          break;
        case 5: 
          localObject = "SHOW";
          break;
        case 4: 
          localObject = "HIDE";
          break;
        case 3: 
          localObject = "REMOVE";
          break;
        case 2: 
          localObject = "REPLACE";
          break;
        case 1: 
          localObject = "ADD";
          break;
        case 0: 
          localObject = "NULL";
        }
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  Op #");
        paramPrintWriter.print(j);
        paramPrintWriter.print(": ");
        paramPrintWriter.print((String)localObject);
        paramPrintWriter.print(" ");
        paramPrintWriter.println(b);
        if (paramBoolean)
        {
          if ((d != 0) || (e != 0))
          {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("enterAnim=#");
            paramPrintWriter.print(Integer.toHexString(d));
            paramPrintWriter.print(" exitAnim=#");
            paramPrintWriter.println(Integer.toHexString(e));
          }
          if ((f != 0) || (g != 0))
          {
            paramPrintWriter.print(paramString);
            paramPrintWriter.print("popEnterAnim=#");
            paramPrintWriter.print(Integer.toHexString(f));
            paramPrintWriter.print(" popExitAnim=#");
            paramPrintWriter.println(Integer.toHexString(g));
          }
        }
      }
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("BackStackEntry{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (r >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(r);
    }
    if (h != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(h);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     x0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */