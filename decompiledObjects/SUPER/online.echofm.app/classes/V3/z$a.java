package V3;

public class z$a
  implements z
{
  public void a(Thread paramThread, String paramString)
  {
    paramThread.setName(paramString);
  }
  
  public void b(Thread paramThread, boolean paramBoolean)
  {
    paramThread.setDaemon(paramBoolean);
  }
  
  public void c(Thread paramThread, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler)
  {
    paramThread.setUncaughtExceptionHandler(paramUncaughtExceptionHandler);
  }
}

/* Location:
 * Qualified Name:     V3.z.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */