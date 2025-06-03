package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;

public class g
  extends ImageButton
{
  public final d o;
  public final h p;
  
  public g(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(U.b(paramContext), paramAttributeSet, paramInt);
    T.a(this, getContext());
    paramContext = new d(this);
    o = paramContext;
    paramContext.e(paramAttributeSet, paramInt);
    paramContext = new h(this);
    p = paramContext;
    paramContext.f(paramAttributeSet, paramInt);
  }
  
  public void drawableStateChanged()
  {
    super.drawableStateChanged();
    Object localObject = o;
    if (localObject != null) {
      ((d)localObject).b();
    }
    localObject = p;
    if (localObject != null) {
      ((h)localObject).b();
    }
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    Object localObject = o;
    if (localObject != null) {
      localObject = ((d)localObject).c();
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    Object localObject = o;
    if (localObject != null) {
      localObject = ((d)localObject).d();
    } else {
      localObject = null;
    }
    return (PorterDuff.Mode)localObject;
  }
  
  public ColorStateList getSupportImageTintList()
  {
    Object localObject = p;
    if (localObject != null) {
      localObject = ((h)localObject).c();
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  public PorterDuff.Mode getSupportImageTintMode()
  {
    Object localObject = p;
    if (localObject != null) {
      localObject = ((h)localObject).d();
    } else {
      localObject = null;
    }
    return (PorterDuff.Mode)localObject;
  }
  
  public boolean hasOverlappingRendering()
  {
    boolean bool;
    if ((p.e()) && (super.hasOverlappingRendering())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    d locald = o;
    if (locald != null) {
      locald.f(paramDrawable);
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    d locald = o;
    if (locald != null) {
      locald.g(paramInt);
    }
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    super.setImageBitmap(paramBitmap);
    paramBitmap = p;
    if (paramBitmap != null) {
      paramBitmap.b();
    }
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    super.setImageDrawable(paramDrawable);
    paramDrawable = p;
    if (paramDrawable != null) {
      paramDrawable.b();
    }
  }
  
  public void setImageResource(int paramInt)
  {
    p.g(paramInt);
  }
  
  public void setImageURI(Uri paramUri)
  {
    super.setImageURI(paramUri);
    paramUri = p;
    if (paramUri != null) {
      paramUri.b();
    }
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    d locald = o;
    if (locald != null) {
      locald.i(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    d locald = o;
    if (locald != null) {
      locald.j(paramMode);
    }
  }
  
  public void setSupportImageTintList(ColorStateList paramColorStateList)
  {
    h localh = p;
    if (localh != null) {
      localh.h(paramColorStateList);
    }
  }
  
  public void setSupportImageTintMode(PorterDuff.Mode paramMode)
  {
    h localh = p;
    if (localh != null) {
      localh.i(paramMode);
    }
  }
}

/* Location:
 * Qualified Name:     l.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */