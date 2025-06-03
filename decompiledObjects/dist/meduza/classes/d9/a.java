package d9;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.i;
import e;
import java.util.List;
import java.util.Objects;
import n9.f;

public final class a
{
  public final i a;
  public final List<com.google.firebase.firestore.a> b;
  
  public a(i parami, r0 paramr0)
  {
    a = parami;
    b = paramr0;
  }
  
  public final Task<com.google.firebase.firestore.b> a(b paramb)
  {
    if (paramb != null)
    {
      paramb = new TaskCompletionSource();
      ((Task)a.b.a(new e(this, 0))).continueWith(f.b, new k1.a(9, this, paramb));
      return paramb.getTask();
    }
    throw new NullPointerException("AggregateSource must not be null");
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    paramObject = (a)paramObject;
    if ((!a.equals(a)) || (!b.equals(b))) {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { a, b });
  }
}

/* Location:
 * Qualified Name:     d9.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */