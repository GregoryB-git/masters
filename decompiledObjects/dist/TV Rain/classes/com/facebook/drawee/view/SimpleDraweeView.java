package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.util.UriUtil;
import com.facebook.drawee.R.styleable;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.interfaces.SimpleDraweeControllerBuilder;
import javax.annotation.Nullable;

public class SimpleDraweeView
  extends GenericDraweeView
{
  private static Supplier<? extends SimpleDraweeControllerBuilder> sDraweeControllerBuilderSupplier;
  private SimpleDraweeControllerBuilder mSimpleDraweeControllerBuilder;
  
  public SimpleDraweeView(Context paramContext)
  {
    super(paramContext);
    init(paramContext, null);
  }
  
  public SimpleDraweeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext, paramAttributeSet);
  }
  
  public SimpleDraweeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext, paramAttributeSet);
  }
  
  @TargetApi(21)
  public SimpleDraweeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    init(paramContext, paramAttributeSet);
  }
  
  public SimpleDraweeView(Context paramContext, GenericDraweeHierarchy paramGenericDraweeHierarchy)
  {
    super(paramContext, paramGenericDraweeHierarchy);
    init(paramContext, null);
  }
  
  private void init(Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    if (isInEditMode()) {
      return;
    }
    Preconditions.checkNotNull(sDraweeControllerBuilderSupplier, "SimpleDraweeView was not initialized!");
    mSimpleDraweeControllerBuilder = ((SimpleDraweeControllerBuilder)sDraweeControllerBuilderSupplier.get());
    if (paramAttributeSet != null)
    {
      paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.SimpleDraweeView);
      try
      {
        int i = R.styleable.SimpleDraweeView_actualImageUri;
        if (paramAttributeSet.hasValue(i))
        {
          setImageURI(Uri.parse(paramAttributeSet.getString(i)), null);
        }
        else
        {
          i = R.styleable.SimpleDraweeView_actualImageResource;
          if (paramAttributeSet.hasValue(i))
          {
            i = paramAttributeSet.getResourceId(i, -1);
            if (i != -1) {
              setActualImageResource(i);
            }
          }
        }
      }
      finally
      {
        paramAttributeSet.recycle();
      }
    }
  }
  
  public static void initialize(Supplier<? extends SimpleDraweeControllerBuilder> paramSupplier)
  {
    sDraweeControllerBuilderSupplier = paramSupplier;
  }
  
  public static void shutDown()
  {
    sDraweeControllerBuilderSupplier = null;
  }
  
  public SimpleDraweeControllerBuilder getControllerBuilder()
  {
    return mSimpleDraweeControllerBuilder;
  }
  
  public void setActualImageResource(@DrawableRes int paramInt)
  {
    setActualImageResource(paramInt, null);
  }
  
  public void setActualImageResource(@DrawableRes int paramInt, @Nullable Object paramObject)
  {
    setImageURI(UriUtil.getUriForResourceId(paramInt), paramObject);
  }
  
  public void setImageResource(int paramInt)
  {
    super.setImageResource(paramInt);
  }
  
  public void setImageURI(Uri paramUri)
  {
    setImageURI(paramUri, null);
  }
  
  public void setImageURI(Uri paramUri, @Nullable Object paramObject)
  {
    setController(mSimpleDraweeControllerBuilder.setCallerContext(paramObject).setUri(paramUri).setOldController(getController()).build());
  }
  
  public void setImageURI(@Nullable String paramString)
  {
    setImageURI(paramString, null);
  }
  
  public void setImageURI(@Nullable String paramString, @Nullable Object paramObject)
  {
    if (paramString != null) {
      paramString = Uri.parse(paramString);
    } else {
      paramString = null;
    }
    setImageURI(paramString, paramObject);
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.view.SimpleDraweeView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */