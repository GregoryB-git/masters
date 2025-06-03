package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import b;
import d;

public class AccessibilityWindowInfoCompat
{
  public static final int TYPE_ACCESSIBILITY_OVERLAY = 4;
  public static final int TYPE_APPLICATION = 1;
  public static final int TYPE_INPUT_METHOD = 2;
  public static final int TYPE_SPLIT_SCREEN_DIVIDER = 5;
  public static final int TYPE_SYSTEM = 3;
  private static final int UNDEFINED = -1;
  private final Object mInfo;
  
  private AccessibilityWindowInfoCompat(Object paramObject)
  {
    mInfo = paramObject;
  }
  
  @Nullable
  public static AccessibilityWindowInfoCompat obtain()
  {
    return wrapNonNullInstance(Api21Impl.obtain());
  }
  
  @Nullable
  public static AccessibilityWindowInfoCompat obtain(@Nullable AccessibilityWindowInfoCompat paramAccessibilityWindowInfoCompat)
  {
    if (paramAccessibilityWindowInfoCompat == null) {
      paramAccessibilityWindowInfoCompat = null;
    } else {
      paramAccessibilityWindowInfoCompat = wrapNonNullInstance(Api21Impl.obtain((AccessibilityWindowInfo)mInfo));
    }
    return paramAccessibilityWindowInfoCompat;
  }
  
  private static String typeToString(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3)
        {
          if (paramInt != 4) {
            return "<UNKNOWN>";
          }
          return "TYPE_ACCESSIBILITY_OVERLAY";
        }
        return "TYPE_SYSTEM";
      }
      return "TYPE_INPUT_METHOD";
    }
    return "TYPE_APPLICATION";
  }
  
  public static AccessibilityWindowInfoCompat wrapNonNullInstance(Object paramObject)
  {
    if (paramObject != null) {
      return new AccessibilityWindowInfoCompat(paramObject);
    }
    return null;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (!(paramObject instanceof AccessibilityWindowInfoCompat)) {
      return false;
    }
    paramObject = (AccessibilityWindowInfoCompat)paramObject;
    Object localObject = mInfo;
    if (localObject == null)
    {
      if (mInfo != null) {
        bool = false;
      }
      return bool;
    }
    return localObject.equals(mInfo);
  }
  
  @Nullable
  public AccessibilityNodeInfoCompat getAnchor()
  {
    return AccessibilityNodeInfoCompat.wrapNonNullInstance(Api24Impl.getAnchor((AccessibilityWindowInfo)mInfo));
  }
  
  public void getBoundsInScreen(@NonNull Rect paramRect)
  {
    Api21Impl.getBoundsInScreen((AccessibilityWindowInfo)mInfo, paramRect);
  }
  
  @Nullable
  public AccessibilityWindowInfoCompat getChild(int paramInt)
  {
    return wrapNonNullInstance(Api21Impl.getChild((AccessibilityWindowInfo)mInfo, paramInt));
  }
  
  public int getChildCount()
  {
    return Api21Impl.getChildCount((AccessibilityWindowInfo)mInfo);
  }
  
  public int getDisplayId()
  {
    if (Build.VERSION.SDK_INT >= 33) {
      return Api33Impl.getDisplayId((AccessibilityWindowInfo)mInfo);
    }
    return 0;
  }
  
  public int getId()
  {
    return Api21Impl.getId((AccessibilityWindowInfo)mInfo);
  }
  
  public int getLayer()
  {
    return Api21Impl.getLayer((AccessibilityWindowInfo)mInfo);
  }
  
  @Nullable
  public AccessibilityWindowInfoCompat getParent()
  {
    return wrapNonNullInstance(Api21Impl.getParent((AccessibilityWindowInfo)mInfo));
  }
  
  public void getRegionInScreen(@NonNull Region paramRegion)
  {
    if (Build.VERSION.SDK_INT >= 33)
    {
      Api33Impl.getRegionInScreen((AccessibilityWindowInfo)mInfo, paramRegion);
    }
    else
    {
      Rect localRect = new Rect();
      Api21Impl.getBoundsInScreen((AccessibilityWindowInfo)mInfo, localRect);
      paramRegion.set(localRect);
    }
  }
  
  @Nullable
  public AccessibilityNodeInfoCompat getRoot()
  {
    return AccessibilityNodeInfoCompat.wrapNonNullInstance(Api21Impl.getRoot((AccessibilityWindowInfo)mInfo));
  }
  
  @Nullable
  public CharSequence getTitle()
  {
    return Api24Impl.getTitle((AccessibilityWindowInfo)mInfo);
  }
  
  public int getType()
  {
    return Api21Impl.getType((AccessibilityWindowInfo)mInfo);
  }
  
  public int hashCode()
  {
    Object localObject = mInfo;
    int i;
    if (localObject == null) {
      i = 0;
    } else {
      i = localObject.hashCode();
    }
    return i;
  }
  
  public boolean isAccessibilityFocused()
  {
    return Api21Impl.isAccessibilityFocused((AccessibilityWindowInfo)mInfo);
  }
  
  public boolean isActive()
  {
    return Api21Impl.isActive((AccessibilityWindowInfo)mInfo);
  }
  
  public boolean isFocused()
  {
    return Api21Impl.isFocused((AccessibilityWindowInfo)mInfo);
  }
  
  public boolean isInPictureInPictureMode()
  {
    if (Build.VERSION.SDK_INT >= 33) {
      return Api33Impl.isInPictureInPictureMode((AccessibilityWindowInfo)mInfo);
    }
    return false;
  }
  
  public void recycle()
  {
    Api21Impl.recycle((AccessibilityWindowInfo)mInfo);
  }
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = new Rect();
    getBoundsInScreen((Rect)localObject);
    localStringBuilder.append("AccessibilityWindowInfo[");
    localStringBuilder.append("id=");
    localStringBuilder.append(getId());
    localStringBuilder.append(", type=");
    localStringBuilder.append(typeToString(getType()));
    localStringBuilder.append(", layer=");
    localStringBuilder.append(getLayer());
    localStringBuilder.append(", bounds=");
    localStringBuilder.append(localObject);
    localStringBuilder.append(", focused=");
    localStringBuilder.append(isFocused());
    localStringBuilder.append(", active=");
    localStringBuilder.append(isActive());
    localStringBuilder.append(", hasParent=");
    localObject = getParent();
    boolean bool1 = true;
    boolean bool2;
    if (localObject != null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    localStringBuilder.append(bool2);
    localStringBuilder.append(", hasChildren=");
    if (getChildCount() > 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    localStringBuilder.append(bool2);
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
  
  @Nullable
  public AccessibilityWindowInfo unwrap()
  {
    return (AccessibilityWindowInfo)mInfo;
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static void getBoundsInScreen(AccessibilityWindowInfo paramAccessibilityWindowInfo, Rect paramRect)
    {
      paramAccessibilityWindowInfo.getBoundsInScreen(paramRect);
    }
    
    @DoNotInline
    public static AccessibilityWindowInfo getChild(AccessibilityWindowInfo paramAccessibilityWindowInfo, int paramInt)
    {
      return paramAccessibilityWindowInfo.getChild(paramInt);
    }
    
    @DoNotInline
    public static int getChildCount(AccessibilityWindowInfo paramAccessibilityWindowInfo)
    {
      return paramAccessibilityWindowInfo.getChildCount();
    }
    
    @DoNotInline
    public static int getId(AccessibilityWindowInfo paramAccessibilityWindowInfo)
    {
      return paramAccessibilityWindowInfo.getId();
    }
    
    @DoNotInline
    public static int getLayer(AccessibilityWindowInfo paramAccessibilityWindowInfo)
    {
      return paramAccessibilityWindowInfo.getLayer();
    }
    
    @DoNotInline
    public static AccessibilityWindowInfo getParent(AccessibilityWindowInfo paramAccessibilityWindowInfo)
    {
      return paramAccessibilityWindowInfo.getParent();
    }
    
    @DoNotInline
    public static AccessibilityNodeInfo getRoot(AccessibilityWindowInfo paramAccessibilityWindowInfo)
    {
      return paramAccessibilityWindowInfo.getRoot();
    }
    
    @DoNotInline
    public static int getType(AccessibilityWindowInfo paramAccessibilityWindowInfo)
    {
      return paramAccessibilityWindowInfo.getType();
    }
    
    @DoNotInline
    public static boolean isAccessibilityFocused(AccessibilityWindowInfo paramAccessibilityWindowInfo)
    {
      return paramAccessibilityWindowInfo.isAccessibilityFocused();
    }
    
    @DoNotInline
    public static boolean isActive(AccessibilityWindowInfo paramAccessibilityWindowInfo)
    {
      return paramAccessibilityWindowInfo.isActive();
    }
    
    @DoNotInline
    public static boolean isFocused(AccessibilityWindowInfo paramAccessibilityWindowInfo)
    {
      return paramAccessibilityWindowInfo.isFocused();
    }
    
    @DoNotInline
    public static AccessibilityWindowInfo obtain()
    {
      return AccessibilityWindowInfo.obtain();
    }
    
    @DoNotInline
    public static AccessibilityWindowInfo obtain(AccessibilityWindowInfo paramAccessibilityWindowInfo)
    {
      return AccessibilityWindowInfo.obtain(paramAccessibilityWindowInfo);
    }
    
    @DoNotInline
    public static void recycle(AccessibilityWindowInfo paramAccessibilityWindowInfo)
    {
      paramAccessibilityWindowInfo.recycle();
    }
  }
  
  @RequiresApi(24)
  public static class Api24Impl
  {
    @DoNotInline
    public static AccessibilityNodeInfo getAnchor(AccessibilityWindowInfo paramAccessibilityWindowInfo)
    {
      return paramAccessibilityWindowInfo.getAnchor();
    }
    
    @DoNotInline
    public static CharSequence getTitle(AccessibilityWindowInfo paramAccessibilityWindowInfo)
    {
      return paramAccessibilityWindowInfo.getTitle();
    }
  }
  
  @RequiresApi(33)
  public static class Api33Impl
  {
    @DoNotInline
    public static int getDisplayId(AccessibilityWindowInfo paramAccessibilityWindowInfo)
    {
      return d.b(paramAccessibilityWindowInfo);
    }
    
    @DoNotInline
    public static void getRegionInScreen(AccessibilityWindowInfo paramAccessibilityWindowInfo, Region paramRegion)
    {
      d.u(paramAccessibilityWindowInfo, paramRegion);
    }
    
    @DoNotInline
    public static boolean isInPictureInPictureMode(AccessibilityWindowInfo paramAccessibilityWindowInfo)
    {
      return b.v(paramAccessibilityWindowInfo);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.accessibility.AccessibilityWindowInfoCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */