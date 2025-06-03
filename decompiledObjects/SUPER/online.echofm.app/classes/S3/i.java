package S3;

public class i
  extends j
{
  public i(Object paramObject1, Object paramObject2)
  {
    super(paramObject1, paramObject2, g.j(), g.j());
  }
  
  public i(Object paramObject1, Object paramObject2, h paramh1, h paramh2)
  {
    super(paramObject1, paramObject2, paramh1, paramh2);
  }
  
  public boolean d()
  {
    return true;
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
    return new i(localObject, paramObject1, (h)paramObject2, paramh1);
  }
  
  public h.a n()
  {
    return h.a.o;
  }
  
  public int size()
  {
    return a().size() + 1 + f().size();
  }
}

/* Location:
 * Qualified Name:     S3.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */