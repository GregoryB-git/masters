package Z5;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

public abstract class g
{
  public static final void a(int paramInt1, int paramInt2)
  {
    if (paramInt2 <= paramInt1) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Debug metadata version mismatch. Expected: ");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(", got ");
    localStringBuilder.append(paramInt2);
    localStringBuilder.append(". Please update the Kotlin standard library.");
    throw new IllegalStateException(localStringBuilder.toString().toString());
  }
  
  public static final f b(a parama)
  {
    return (f)parama.getClass().getAnnotation(f.class);
  }
  
  public static final int c(a parama)
  {
    int i;
    try
    {
      Field localField = parama.getClass().getDeclaredField("label");
      localField.setAccessible(true);
      parama = localField.get(parama);
      if ((parama instanceof Integer)) {
        parama = (Integer)parama;
      } else {
        parama = null;
      }
      if (parama != null) {
        i = parama.intValue();
      } else {
        i = 0;
      }
      i--;
    }
    catch (Exception parama)
    {
      i = -1;
    }
    return i;
  }
  
  public static final StackTraceElement d(a parama)
  {
    Intrinsics.checkNotNullParameter(parama, "<this>");
    f localf = b(parama);
    if (localf == null) {
      return null;
    }
    a(1, localf.v());
    int i = c(parama);
    if (i < 0) {
      i = -1;
    } else {
      i = localf.l()[i];
    }
    String str = i.a.b(parama);
    if (str == null)
    {
      parama = localf.c();
    }
    else
    {
      parama = new StringBuilder();
      parama.append(str);
      parama.append('/');
      parama.append(localf.c());
      parama = parama.toString();
    }
    return new StackTraceElement(parama, localf.m(), localf.f(), i);
  }
}

/* Location:
 * Qualified Name:     Z5.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */