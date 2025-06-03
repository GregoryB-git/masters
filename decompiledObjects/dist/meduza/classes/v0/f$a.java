package v0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

public final class f$a
  extends f.b
{
  public final TextView a;
  public final d b;
  public boolean c;
  
  public f$a(TextView paramTextView)
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

/* Location:
 * Qualified Name:     v0.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */