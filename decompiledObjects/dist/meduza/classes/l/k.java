package l;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode.Callback;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import e0.c.a;
import e0.c.b;
import e0.c.c;
import e0.d0;
import i0.a;
import i0.b;
import j0.h;
import j0.i;
import j0.j;

public final class k
  extends EditText
  implements e0.v, j
{
  public final d a;
  public final b0 b;
  public final a0 c;
  public final i d;
  public final l e;
  public a f;
  
  public k(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 2130968717);
    u0.a(this, getContext());
    paramContext = new d(this);
    a = paramContext;
    paramContext.d(paramAttributeSet, 2130968717);
    paramContext = new b0(this);
    b = paramContext;
    paramContext.f(paramAttributeSet, 2130968717);
    paramContext.b();
    c = new a0(this);
    d = new i();
    paramContext = new l(this);
    e = paramContext;
    paramContext.c(paramAttributeSet, 2130968717);
    paramAttributeSet = getKeyListener();
    if ((paramAttributeSet instanceof NumberKeyListener ^ true))
    {
      boolean bool1 = isFocusable();
      boolean bool2 = isClickable();
      boolean bool3 = isLongClickable();
      int i = getInputType();
      paramContext = paramContext.b(paramAttributeSet);
      if (paramContext != paramAttributeSet)
      {
        super.setKeyListener(paramContext);
        setRawInputType(i);
        setFocusable(bool1);
        setClickable(bool2);
        setLongClickable(bool3);
      }
    }
  }
  
  private a getSuperCaller()
  {
    if (f == null) {
      f = new a();
    }
    return f;
  }
  
  public final e0.c a(e0.c paramc)
  {
    return d.a(this, paramc);
  }
  
  public final void drawableStateChanged()
  {
    super.drawableStateChanged();
    Object localObject = a;
    if (localObject != null) {
      ((d)localObject).a();
    }
    localObject = b;
    if (localObject != null) {
      ((b0)localObject).b();
    }
  }
  
  public ActionMode.Callback getCustomSelectionActionModeCallback()
  {
    return h.e(super.getCustomSelectionActionModeCallback());
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    Object localObject = a;
    if (localObject != null) {
      localObject = ((d)localObject).b();
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    Object localObject = a;
    if (localObject != null) {
      localObject = ((d)localObject).c();
    } else {
      localObject = null;
    }
    return (PorterDuff.Mode)localObject;
  }
  
  public ColorStateList getSupportCompoundDrawablesTintList()
  {
    return b.d();
  }
  
  public PorterDuff.Mode getSupportCompoundDrawablesTintMode()
  {
    return b.e();
  }
  
  public Editable getText()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return super.getText();
    }
    return getEditableText();
  }
  
  public TextClassifier getTextClassifier()
  {
    if (Build.VERSION.SDK_INT < 28)
    {
      a0 locala0 = c;
      if (locala0 != null)
      {
        TextClassifier localTextClassifier1 = b;
        TextClassifier localTextClassifier2 = localTextClassifier1;
        if (localTextClassifier1 == null) {
          localTextClassifier2 = a0.a.a(a);
        }
        return localTextClassifier2;
      }
    }
    return getSuperCallera.getTextClassifier();
  }
  
  public final InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    InputConnection localInputConnection = super.onCreateInputConnection(paramEditorInfo);
    b.getClass();
    b0.h(this, localInputConnection, paramEditorInfo);
    b.a0.y(this, paramEditorInfo, localInputConnection);
    Object localObject = localInputConnection;
    if (localInputConnection != null)
    {
      int i = Build.VERSION.SDK_INT;
      localObject = localInputConnection;
      if (i <= 30)
      {
        String[] arrayOfString = d0.d(this);
        localObject = localInputConnection;
        if (arrayOfString != null)
        {
          a.b(paramEditorInfo, arrayOfString);
          localObject = new d(this, 1);
          if (i >= 25) {}
          for (localObject = new b(localInputConnection, (d)localObject);; localObject = new i0.c(localInputConnection, (d)localObject))
          {
            break;
            if (a.a(paramEditorInfo).length == 0)
            {
              localObject = localInputConnection;
              break;
            }
          }
        }
      }
    }
    return e.d((InputConnection)localObject, paramEditorInfo);
  }
  
  public final boolean onDragEvent(DragEvent paramDragEvent)
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i < 31)
    {
      bool2 = bool1;
      if (i >= 24)
      {
        bool2 = bool1;
        if (paramDragEvent.getLocalState() == null) {
          if (d0.d(this) == null)
          {
            bool2 = bool1;
          }
          else
          {
            for (Object localObject = getContext(); (localObject instanceof ContextWrapper); localObject = ((ContextWrapper)localObject).getBaseContext()) {
              if ((localObject instanceof Activity))
              {
                localObject = (Activity)localObject;
                break label95;
              }
            }
            localObject = null;
            label95:
            if (localObject == null)
            {
              localObject = new StringBuilder();
              ((StringBuilder)localObject).append("Can't handle drop: no activity: view=");
              ((StringBuilder)localObject).append(this);
              Log.i("ReceiveContent", ((StringBuilder)localObject).toString());
              bool2 = bool1;
            }
            else if (paramDragEvent.getAction() == 1)
            {
              bool2 = bool1;
            }
            else
            {
              bool2 = bool1;
              if (paramDragEvent.getAction() == 3) {
                bool2 = v.a(paramDragEvent, this, (Activity)localObject);
              }
            }
          }
        }
      }
    }
    if (bool2) {
      return true;
    }
    return super.onDragEvent(paramDragEvent);
  }
  
  public final boolean onTextContextMenuItem(int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 0;
    int k = 0;
    int m = j;
    if (i < 31)
    {
      m = j;
      if (d0.d(this) != null) {
        if ((paramInt != 16908322) && (paramInt != 16908337))
        {
          m = j;
        }
        else
        {
          Object localObject = (ClipboardManager)getContext().getSystemService("clipboard");
          if (localObject == null) {
            localObject = null;
          } else {
            localObject = ((ClipboardManager)localObject).getPrimaryClip();
          }
          if ((localObject != null) && (((ClipData)localObject).getItemCount() > 0))
          {
            if (i >= 31) {
              localObject = new c.a((ClipData)localObject, 1);
            } else {
              localObject = new c.c((ClipData)localObject, 1);
            }
            if (paramInt == 16908322) {
              m = k;
            } else {
              m = 1;
            }
            ((c.b)localObject).b(m);
            d0.f(this, ((c.b)localObject).build());
          }
          m = 1;
        }
      }
    }
    if (m != 0) {
      return true;
    }
    return super.onTextContextMenuItem(paramInt);
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    paramDrawable = a;
    if (paramDrawable != null) {
      paramDrawable.e();
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    d locald = a;
    if (locald != null) {
      locald.f(paramInt);
    }
  }
  
  public final void setCompoundDrawables(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawables(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = b;
    if (paramDrawable1 != null) {
      paramDrawable1.b();
    }
  }
  
  public final void setCompoundDrawablesRelative(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = b;
    if (paramDrawable1 != null) {
      paramDrawable1.b();
    }
  }
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback)
  {
    super.setCustomSelectionActionModeCallback(h.f(paramCallback, this));
  }
  
  public void setEmojiCompatEnabled(boolean paramBoolean)
  {
    e.g(paramBoolean);
  }
  
  public void setKeyListener(KeyListener paramKeyListener)
  {
    super.setKeyListener(e.b(paramKeyListener));
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    d locald = a;
    if (locald != null) {
      locald.h(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    d locald = a;
    if (locald != null) {
      locald.i(paramMode);
    }
  }
  
  public void setSupportCompoundDrawablesTintList(ColorStateList paramColorStateList)
  {
    b.l(paramColorStateList);
    b.b();
  }
  
  public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode paramMode)
  {
    b.m(paramMode);
    b.b();
  }
  
  public final void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    b0 localb0 = b;
    if (localb0 != null) {
      localb0.g(paramContext, paramInt);
    }
  }
  
  public void setTextClassifier(TextClassifier paramTextClassifier)
  {
    if (Build.VERSION.SDK_INT < 28)
    {
      a0 locala0 = c;
      if (locala0 != null)
      {
        b = paramTextClassifier;
        return;
      }
    }
    b(getSuperCallera, paramTextClassifier);
  }
  
  public final class a
  {
    public a() {}
  }
}

/* Location:
 * Qualified Name:     l.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */