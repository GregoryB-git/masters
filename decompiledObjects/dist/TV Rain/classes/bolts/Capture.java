package bolts;

public class Capture<T>
{
  private T value;
  
  public Capture() {}
  
  public Capture(T paramT)
  {
    value = paramT;
  }
  
  public T get()
  {
    return (T)value;
  }
  
  public void set(T paramT)
  {
    value = paramT;
  }
}

/* Location:
 * Qualified Name:     bolts.Capture
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */