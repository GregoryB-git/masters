package u;

import android.app.Person;
import android.app.Person.Builder;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.graphics.drawable.IconCompat.a;

public final class x$a
{
  public static x a(Person paramPerson)
  {
    x.b localb = new x.b();
    a = paramPerson.getName();
    Object localObject1 = paramPerson.getIcon();
    Object localObject2 = null;
    if (localObject1 != null)
    {
      localObject1 = paramPerson.getIcon();
      localObject2 = IconCompat.k;
      localObject1.getClass();
      int i = IconCompat.a.c(localObject1);
      if (i != 2)
      {
        if (i != 4)
        {
          if (i != 6)
          {
            localObject2 = new IconCompat(-1);
            b = localObject1;
          }
          else
          {
            localObject2 = IconCompat.a.d(localObject1);
            localObject2.getClass();
            localObject1 = ((Uri)localObject2).toString();
            localObject1.getClass();
            localObject2 = new IconCompat(6);
            b = localObject1;
          }
        }
        else
        {
          localObject2 = IconCompat.a.d(localObject1);
          localObject2.getClass();
          localObject1 = ((Uri)localObject2).toString();
          localObject1.getClass();
          localObject2 = new IconCompat(4);
          b = localObject1;
        }
      }
      else {
        localObject2 = IconCompat.d(null, IconCompat.a.b(localObject1), IconCompat.a.a(localObject1));
      }
    }
    b = ((IconCompat)localObject2);
    c = paramPerson.getUri();
    d = paramPerson.getKey();
    e = paramPerson.isBot();
    f = paramPerson.isImportant();
    return new x(localb);
  }
  
  public static Person b(x paramx)
  {
    Person.Builder localBuilder = new Person.Builder().setName(a);
    IconCompat localIconCompat = b;
    Icon localIcon = null;
    if (localIconCompat != null)
    {
      localIconCompat.getClass();
      localIcon = IconCompat.a.f(localIconCompat, null);
    }
    return localBuilder.setIcon(localIcon).setUri(c).setKey(d).setBot(e).setImportant(f).build();
  }
}

/* Location:
 * Qualified Name:     u.x.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */