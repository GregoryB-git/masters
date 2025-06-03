package androidx.core.content;

import android.content.SharedPreferences.Editor;
import androidx.annotation.NonNull;

@Deprecated
public final class SharedPreferencesCompat$EditorCompat
{
  private static EditorCompat sInstance;
  private final Helper mHelper = new Helper();
  
  @Deprecated
  public static EditorCompat getInstance()
  {
    if (sInstance == null) {
      sInstance = new EditorCompat();
    }
    return sInstance;
  }
  
  @Deprecated
  public void apply(@NonNull SharedPreferences.Editor paramEditor)
  {
    mHelper.apply(paramEditor);
  }
  
  public static class Helper
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
}

/* Location:
 * Qualified Name:     androidx.core.content.SharedPreferencesCompat.EditorCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */