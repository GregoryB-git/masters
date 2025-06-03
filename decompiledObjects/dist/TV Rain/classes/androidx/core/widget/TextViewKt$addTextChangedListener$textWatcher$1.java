package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000'\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\020\r\n\000\n\002\020\b\n\002\b\005*\001\000\b\n\030\0002\0020\001J\022\020\002\032\0020\0032\b\020\004\032\004\030\0010\005H\026J*\020\006\032\0020\0032\b\020\007\032\004\030\0010\b2\006\020\t\032\0020\n2\006\020\013\032\0020\n2\006\020\f\032\0020\nH\026J*\020\r\032\0020\0032\b\020\007\032\004\030\0010\b2\006\020\t\032\0020\n2\006\020\016\032\0020\n2\006\020\013\032\0020\nH\026¨\006\017"}, d2={"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", "after", "onTextChanged", "before", "core-ktx_release"}, k=1, mv={1, 7, 1}, xi=176)
public final class TextViewKt$addTextChangedListener$textWatcher$1
  implements TextWatcher
{
  public TextViewKt$addTextChangedListener$textWatcher$1(Function1<? super Editable, Unit> paramFunction1, Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> paramFunction41, Function4<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> paramFunction42) {}
  
  public void afterTextChanged(@Nullable Editable paramEditable)
  {
    $afterTextChanged.invoke(paramEditable);
  }
  
  public void beforeTextChanged(@Nullable CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    $beforeTextChanged.invoke(paramCharSequence, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3));
  }
  
  public void onTextChanged(@Nullable CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    $onTextChanged.invoke(paramCharSequence, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3));
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.TextViewKt.addTextChangedListener.textWatcher.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */