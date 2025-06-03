package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

public class p
  extends ImageView
{
  public final d a;
  public final o b;
  public boolean c = false;
  
  public p(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public p(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    u0.a(this, getContext());
    paramContext = new d(this);
    a = paramContext;
    paramContext.d(paramAttributeSet, paramInt);
    paramContext = new o(this);
    b = paramContext;
    paramContext.b(paramAttributeSet, paramInt);
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
      ((o)localObject).a();
    }
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
  
  public ColorStateList getSupportImageTintList()
  {
    Object localObject1 = b;
    Object localObject2 = null;
    Object localObject3 = localObject2;
    if (localObject1 != null)
    {
      localObject1 = b;
      localObject3 = localObject2;
      if (localObject1 != null) {
        localObject3 = a;
      }
    }
    return (ColorStateList)localObject3;
  }
  
  public PorterDuff.Mode getSupportImageTintMode()
  {
    Object localObject1 = b;
    Object localObject2 = null;
    Object localObject3 = localObject2;
    if (localObject1 != null)
    {
      localObject1 = b;
      localObject3 = localObject2;
      if (localObject1 != null) {
        localObject3 = b;
      }
    }
    return (PorterDuff.Mode)localObject3;
  }
  
  public final boolean hasOverlappingRendering()
  {
    boolean bool1 = b.a.getBackground() instanceof RippleDrawable;
    boolean bool2 = true;
    if ((!(bool1 ^ true)) || (!super.hasOverlappingRendering())) {
      bool2 = false;
    }
    return bool2;
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
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    super.setImageBitmap(paramBitmap);
    paramBitmap = b;
    if (paramBitmap != null) {
      paramBitmap.a();
    }
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    o localo = b;
    if ((localo != null) && (paramDrawable != null) && (!c)) {
      c = paramDrawable.getLevel();
    }
    super.setImageDrawable(paramDrawable);
    paramDrawable = b;
    if (paramDrawable != null)
    {
      paramDrawable.a();
      if (!c)
      {
        paramDrawable = b;
        if (a.getDrawable() != null) {
          a.getDrawable().setLevel(c);
        }
      }
    }
  }
  
  public void setImageLevel(int paramInt)
  {
    super.setImageLevel(paramInt);
    c = true;
  }
  
  public void setImageResource(int paramInt)
  {
    o localo = b;
    if (localo != null) {
      localo.c(paramInt);
    }
  }
  
  public void setImageURI(Uri paramUri)
  {
    super.setImageURI(paramUri);
    paramUri = b;
    if (paramUri != null) {
      paramUri.a();
    }
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
  
  public void setSupportImageTintList(ColorStateList paramColorStateList)
  {
    o localo = b;
    if (localo != null)
    {
      if (b == null) {
        b = new x0();
      }
      x0 localx0 = b;
      a = paramColorStateList;
      d = true;
      localo.a();
    }
  }
  
  public void setSupportImageTintMode(PorterDuff.Mode paramMode)
  {
    o localo = b;
    if (localo != null)
    {
      if (b == null) {
        b = new x0();
      }
      x0 localx0 = b;
      b = paramMode;
      c = true;
      localo.a();
    }
  }
}

/* Location:
 * Qualified Name:     l.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */