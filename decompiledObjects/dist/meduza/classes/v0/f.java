package v0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

public final class f
{
  public final b a;
  
  public f(TextView paramTextView)
  {
    if (paramTextView != null)
    {
      a = new c(paramTextView);
      return;
    }
    throw new NullPointerException("textView cannot be null");
  }
  
  public static final class a
    extends f.b
  {
    public final TextView a;
    public final d b;
    public boolean c;
    
    public a(TextView paramTextView)
    {
      a = paramTextView;
      c = true;
      b = new d(paramTextView);
    }
    
    public final InputFilter[] a(InputFilter[] paramArrayOfInputFilter)
    {
      boolean bool = c;
      int i = 0;
      if (!bool)
      {
        SparseArray localSparseArray = new SparseArray(1);
        for (j = 0; j < paramArrayOfInputFilter.length; j++)
        {
          localObject = paramArrayOfInputFilter[j];
          if ((localObject instanceof d)) {
            localSparseArray.put(j, localObject);
          }
        }
        if (localSparseArray.size() != 0)
        {
          int k = paramArrayOfInputFilter.length;
          localObject = new InputFilter[paramArrayOfInputFilter.length - localSparseArray.size()];
          for (m = 0; i < k; m = j)
          {
            j = m;
            if (localSparseArray.indexOfKey(i) < 0)
            {
              localObject[m] = paramArrayOfInputFilter[i];
              j = m + 1;
            }
            i++;
          }
          paramArrayOfInputFilter = (InputFilter[])localObject;
        }
        return paramArrayOfInputFilter;
      }
      int m = paramArrayOfInputFilter.length;
      for (int j = 0; j < m; j++) {
        if (paramArrayOfInputFilter[j] == b) {
          return paramArrayOfInputFilter;
        }
      }
      Object localObject = new InputFilter[paramArrayOfInputFilter.length + 1];
      System.arraycopy(paramArrayOfInputFilter, 0, localObject, 0, m);
      localObject[m] = b;
      paramArrayOfInputFilter = (InputFilter[])localObject;
      return paramArrayOfInputFilter;
    }
    
    public final void b(boolean paramBoolean)
    {
      if (paramBoolean) {
        d();
      }
    }
    
    public final void c(boolean paramBoolean)
    {
      c = paramBoolean;
      d();
      InputFilter[] arrayOfInputFilter = a.getFilters();
      a.setFilters(a(arrayOfInputFilter));
    }
    
    public final void d()
    {
      TransformationMethod localTransformationMethod = a.getTransformationMethod();
      Object localObject;
      if (c)
      {
        if ((localTransformationMethod instanceof h)) {
          localObject = localTransformationMethod;
        } else if ((localTransformationMethod instanceof PasswordTransformationMethod)) {
          localObject = localTransformationMethod;
        } else {
          localObject = new h(localTransformationMethod);
        }
      }
      else
      {
        localObject = localTransformationMethod;
        if ((localTransformationMethod instanceof h)) {
          localObject = a;
        }
      }
      a.setTransformationMethod((TransformationMethod)localObject);
    }
  }
  
  public static class b
  {
    public InputFilter[] a(InputFilter[] paramArrayOfInputFilter)
    {
      throw null;
    }
    
    public void b(boolean paramBoolean)
    {
      throw null;
    }
    
    public void c(boolean paramBoolean)
    {
      throw null;
    }
  }
  
  public static final class c
    extends f.b
  {
    public final f.a a;
    
    public c(TextView paramTextView)
    {
      a = new f.a(paramTextView);
    }
    
    public final InputFilter[] a(InputFilter[] paramArrayOfInputFilter)
    {
      int i;
      if (androidx.emoji2.text.d.j != null) {
        i = 1;
      } else {
        i = 0;
      }
      if ((i ^ 0x1) != 0) {
        return paramArrayOfInputFilter;
      }
      return a.a(paramArrayOfInputFilter);
    }
    
    public final void b(boolean paramBoolean)
    {
      int i;
      if (androidx.emoji2.text.d.j != null) {
        i = 1;
      } else {
        i = 0;
      }
      if ((i ^ 0x1) != 0) {
        return;
      }
      a.b(paramBoolean);
    }
    
    public final void c(boolean paramBoolean)
    {
      int i;
      if (androidx.emoji2.text.d.j != null) {
        i = 1;
      } else {
        i = 0;
      }
      if ((i ^ 0x1) != 0) {
        a.c = paramBoolean;
      } else {
        a.c(paramBoolean);
      }
    }
  }
}

/* Location:
 * Qualified Name:     v0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */