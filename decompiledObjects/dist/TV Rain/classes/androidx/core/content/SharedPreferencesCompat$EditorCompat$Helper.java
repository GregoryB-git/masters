package androidx.core.content;

import android.content.SharedPreferences.Editor;
import androidx.annotation.NonNull;

class SharedPreferencesCompat$EditorCompat$Helper
{
  public void apply(@NonNull SharedPreferences.Editor paramEditor)
  {
    try
    {
      paramEditor.apply();
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      paramEditor.commit();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.SharedPreferencesCompat.EditorCompat.Helper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */