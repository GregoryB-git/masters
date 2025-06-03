package androidx.core.app;

import android.graphics.drawable.Icon;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.IconCompat;

@RequiresApi(28)
class Person$Api28Impl
{
  @DoNotInline
  public static Person fromAndroidPerson(android.app.Person paramPerson)
  {
    Person.Builder localBuilder = new Person.Builder().setName(paramPerson.getName());
    IconCompat localIconCompat;
    if (paramPerson.getIcon() != null) {
      localIconCompat = IconCompat.createFromIcon(paramPerson.getIcon());
    } else {
      localIconCompat = null;
    }
    return localBuilder.setIcon(localIconCompat).setUri(paramPerson.getUri()).setKey(paramPerson.getKey()).setBot(paramPerson.isBot()).setImportant(paramPerson.isImportant()).build();
  }
  
  @DoNotInline
  public static android.app.Person toAndroidPerson(Person paramPerson)
  {
    android.app.Person.Builder localBuilder = new android.app.Person.Builder().setName(paramPerson.getName());
    Icon localIcon;
    if (paramPerson.getIcon() != null) {
      localIcon = paramPerson.getIcon().toIcon();
    } else {
      localIcon = null;
    }
    return localBuilder.setIcon(localIcon).setUri(paramPerson.getUri()).setKey(paramPerson.getKey()).setBot(paramPerson.isBot()).setImportant(paramPerson.isImportant()).build();
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.Person.Api28Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */