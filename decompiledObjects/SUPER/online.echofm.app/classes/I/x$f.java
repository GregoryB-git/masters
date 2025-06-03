package I;

import A.f;
import androidx.annotation.NonNull;

public abstract class x$f
{
  public final x a;
  public f[] b;
  
  public x$f()
  {
    this(new x(null));
  }
  
  public x$f(@NonNull x paramx)
  {
    a = paramx;
  }
  
  public final void a()
  {
    Object localObject1 = b;
    if (localObject1 != null)
    {
      Object localObject2 = localObject1[x.m.a(1)];
      Object localObject3 = b[x.m.a(2)];
      localObject1 = localObject3;
      if (localObject3 == null) {
        localObject1 = a.f(2);
      }
      localObject3 = localObject2;
      if (localObject2 == null) {
        localObject3 = a.f(1);
      }
      f(f.a((f)localObject3, (f)localObject1));
      localObject1 = b[x.m.a(16)];
      if (localObject1 != null) {
        e((f)localObject1);
      }
      localObject1 = b[x.m.a(32)];
      if (localObject1 != null) {
        c((f)localObject1);
      }
      localObject1 = b[x.m.a(64)];
      if (localObject1 != null) {
        g((f)localObject1);
      }
    }
  }
  
  @NonNull
  public abstract x b();
  
  public void c(@NonNull f paramf) {}
  
  public abstract void d(@NonNull f paramf);
  
  public void e(@NonNull f paramf) {}
  
  public abstract void f(@NonNull f paramf);
  
  public void g(@NonNull f paramf) {}
}

/* Location:
 * Qualified Name:     I.x.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */