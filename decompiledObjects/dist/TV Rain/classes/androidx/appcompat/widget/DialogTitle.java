package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.styleable;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class DialogTitle
  extends AppCompatTextView
{
  public DialogTitle(@NonNull Context paramContext)
  {
    super(paramContext);
  }
  
  public DialogTitle(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public DialogTitle(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    Object localObject = getLayout();
    if (localObject != null)
    {
      int i = ((Layout)localObject).getLineCount();
      if ((i > 0) && (((Layout)localObject).getEllipsisCount(i - 1) > 0))
      {
        setSingleLine(false);
        setMaxLines(2);
        localObject = getContext().obtainStyledAttributes(null, R.styleable.TextAppearance, 16842817, 16973892);
        i = ((TypedArray)localObject).getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, 0);
        if (i != 0) {
          setTextSize(0, i);
        }
        ((TypedArray)localObject).recycle();
        super.onMeasure(paramInt1, paramInt2);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.DialogTitle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */