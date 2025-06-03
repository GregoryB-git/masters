package bolts;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AggregateException
  extends Exception
{
  private static final String DEFAULT_MESSAGE = "There were multiple errors.";
  private static final long serialVersionUID = 1L;
  private List<Throwable> innerThrowables;
  
  public AggregateException(String paramString, List<? extends Throwable> paramList)
  {
    super(paramString, localThrowable);
    innerThrowables = Collections.unmodifiableList(paramList);
  }
  
  public AggregateException(String paramString, Throwable[] paramArrayOfThrowable)
  {
    this(paramString, Arrays.asList(paramArrayOfThrowable));
  }
  
  public AggregateException(List<? extends Throwable> paramList)
  {
    this("There were multiple errors.", paramList);
  }
  
  @Deprecated
  public Throwable[] getCauses()
  {
    List localList = innerThrowables;
    return (Throwable[])localList.toArray(new Throwable[localList.size()]);
  }
  
  @Deprecated
  public List<Exception> getErrors()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject = innerThrowables;
    if (localObject == null) {
      return localArrayList;
    }
    Iterator localIterator = ((List)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = (Throwable)localIterator.next();
      if ((localObject instanceof Exception)) {
        localArrayList.add((Exception)localObject);
      } else {
        localArrayList.add(new Exception((Throwable)localObject));
      }
    }
    return localArrayList;
  }
  
  public List<Throwable> getInnerThrowables()
  {
    return innerThrowables;
  }
  
  public void printStackTrace(PrintStream paramPrintStream)
  {
    super.printStackTrace(paramPrintStream);
    Iterator localIterator = innerThrowables.iterator();
    int i = -1;
    while (localIterator.hasNext())
    {
      Throwable localThrowable = (Throwable)localIterator.next();
      paramPrintStream.append("\n");
      paramPrintStream.append("  Inner throwable #");
      i++;
      paramPrintStream.append(Integer.toString(i));
      paramPrintStream.append(": ");
      localThrowable.printStackTrace(paramPrintStream);
      paramPrintStream.append("\n");
    }
  }
  
  public void printStackTrace(PrintWriter paramPrintWriter)
  {
    super.printStackTrace(paramPrintWriter);
    Iterator localIterator = innerThrowables.iterator();
    int i = -1;
    while (localIterator.hasNext())
    {
      Throwable localThrowable = (Throwable)localIterator.next();
      paramPrintWriter.append("\n");
      paramPrintWriter.append("  Inner throwable #");
      i++;
      paramPrintWriter.append(Integer.toString(i));
      paramPrintWriter.append(": ");
      localThrowable.printStackTrace(paramPrintWriter);
      paramPrintWriter.append("\n");
    }
  }
}

/* Location:
 * Qualified Name:     bolts.AggregateException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */