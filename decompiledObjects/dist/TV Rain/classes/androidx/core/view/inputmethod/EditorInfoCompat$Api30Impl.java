package androidx.core.view.inputmethod;

import android.view.inputmethod.EditorInfo;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import d;

@RequiresApi(30)
class EditorInfoCompat$Api30Impl
{
  public static CharSequence getInitialSelectedText(@NonNull EditorInfo paramEditorInfo, int paramInt)
  {
    return d.j(paramEditorInfo, paramInt);
  }
  
  public static CharSequence getInitialTextAfterCursor(@NonNull EditorInfo paramEditorInfo, int paramInt1, int paramInt2)
  {
    return d.k(paramEditorInfo, paramInt1, paramInt2);
  }
  
  public static CharSequence getInitialTextBeforeCursor(@NonNull EditorInfo paramEditorInfo, int paramInt1, int paramInt2)
  {
    return d.C(paramEditorInfo, paramInt1, paramInt2);
  }
  
  public static void setInitialSurroundingSubText(@NonNull EditorInfo paramEditorInfo, CharSequence paramCharSequence, int paramInt)
  {
    d.v(paramEditorInfo, paramCharSequence, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.inputmethod.EditorInfoCompat.Api30Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */