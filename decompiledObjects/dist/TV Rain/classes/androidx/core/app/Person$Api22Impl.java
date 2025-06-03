package androidx.core.app;

import android.os.BaseBundle;
import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(22)
class Person$Api22Impl
{
  @DoNotInline
  public static Person fromPersistableBundle(PersistableBundle paramPersistableBundle)
  {
    return new Person.Builder().setName(paramPersistableBundle.getString("name")).setUri(paramPersistableBundle.getString("uri")).setKey(paramPersistableBundle.getString("key")).setBot(paramPersistableBundle.getBoolean("isBot")).setImportant(paramPersistableBundle.getBoolean("isImportant")).build();
  }
  
  @DoNotInline
  public static PersistableBundle toPersistableBundle(Person paramPerson)
  {
    PersistableBundle localPersistableBundle = new PersistableBundle();
    Object localObject = mName;
    if (localObject != null) {
      localObject = ((CharSequence)localObject).toString();
    } else {
      localObject = null;
    }
    localPersistableBundle.putString("name", (String)localObject);
    localPersistableBundle.putString("uri", mUri);
    localPersistableBundle.putString("key", mKey);
    localPersistableBundle.putBoolean("isBot", mIsBot);
    localPersistableBundle.putBoolean("isImportant", mIsImportant);
    return localPersistableBundle;
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.Person.Api22Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */