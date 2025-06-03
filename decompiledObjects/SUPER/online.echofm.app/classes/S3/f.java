package S3;

public class f
  extends j
{
  public int e = -1;
  
  public f(Object paramObject1, Object paramObject2, h paramh1, h paramh2)
  {
    super(paramObject1, paramObject2, paramh1, paramh2);
  }
  
  public boolean d()
  {
    return false;
  }
  
  public j l(Object paramObject1, Object paramObject2, h paramh1, h paramh2)
  {
    Object localObject = paramObject1;
    if (paramObject1 == null) {
      localObject = getKey();
    }
    paramObject1 = paramObject2;
    if (paramObject2 == null) {
      paramObject1 = getValue();
    }
    paramObject2 = paramh1;
    if (paramh1 == null) {
      paramObject2 = a();
    }
    paramh1 = paramh2;
    if (paramh2 == null) {
      paramh1 = f();
    }
    return new f(localObject, paramObject1, (h)paramObject2, paramh1);
  }
  
  public h.a n()
  {
    return h.a.p;
  }
  
  public int size()
  {
    if (e == -1) {
      e = (a().size() + 1 + f().size());
    }
    return e;
  }
  
  public void u(h paramh)
  {
    if (e == -1)
    {
      super.u(paramh);
      return;
    }
    throw new IllegalStateException("Can't set left after using size");
  }
}

/* Location:
 * Qualified Name:     S3.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */