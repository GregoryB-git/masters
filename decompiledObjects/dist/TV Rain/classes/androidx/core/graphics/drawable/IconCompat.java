package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import androidx.versionedparcelable.CustomVersionedParcelable;
import c;
import d;
import f0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import z2;

public class IconCompat
  extends CustomVersionedParcelable
{
  private static final float ADAPTIVE_ICON_INSET_FACTOR = 0.25F;
  private static final int AMBIENT_SHADOW_ALPHA = 30;
  private static final float BLUR_FACTOR = 0.010416667F;
  public static final PorterDuff.Mode DEFAULT_TINT_MODE = PorterDuff.Mode.SRC_IN;
  private static final float DEFAULT_VIEW_PORT_SCALE = 0.6666667F;
  @VisibleForTesting
  public static final String EXTRA_INT1 = "int1";
  @VisibleForTesting
  public static final String EXTRA_INT2 = "int2";
  @VisibleForTesting
  public static final String EXTRA_OBJ = "obj";
  @VisibleForTesting
  public static final String EXTRA_STRING1 = "string1";
  @VisibleForTesting
  public static final String EXTRA_TINT_LIST = "tint_list";
  @VisibleForTesting
  public static final String EXTRA_TINT_MODE = "tint_mode";
  @VisibleForTesting
  public static final String EXTRA_TYPE = "type";
  private static final float ICON_DIAMETER_FACTOR = 0.9166667F;
  private static final int KEY_SHADOW_ALPHA = 61;
  private static final float KEY_SHADOW_OFFSET_FACTOR = 0.020833334F;
  private static final String TAG = "IconCompat";
  public static final int TYPE_ADAPTIVE_BITMAP = 5;
  public static final int TYPE_BITMAP = 1;
  public static final int TYPE_DATA = 3;
  public static final int TYPE_RESOURCE = 2;
  public static final int TYPE_UNKNOWN = -1;
  public static final int TYPE_URI = 4;
  public static final int TYPE_URI_ADAPTIVE_BITMAP = 6;
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public byte[] mData;
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public int mInt1;
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public int mInt2;
  public Object mObj1;
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public Parcelable mParcelable;
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public String mString1;
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public ColorStateList mTintList;
  public PorterDuff.Mode mTintMode;
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public String mTintModeStr;
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public int mType;
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public IconCompat()
  {
    mType = -1;
    mData = null;
    mParcelable = null;
    mInt1 = 0;
    mInt2 = 0;
    mTintList = null;
    mTintMode = DEFAULT_TINT_MODE;
    mTintModeStr = null;
  }
  
  public IconCompat(int paramInt)
  {
    mData = null;
    mParcelable = null;
    mInt1 = 0;
    mInt2 = 0;
    mTintList = null;
    mTintMode = DEFAULT_TINT_MODE;
    mTintModeStr = null;
    mType = paramInt;
  }
  
  @Nullable
  public static IconCompat createFromBundle(@NonNull Bundle paramBundle)
  {
    int i = paramBundle.getInt("type");
    IconCompat localIconCompat = new IconCompat(i);
    mInt1 = paramBundle.getInt("int1");
    mInt2 = paramBundle.getInt("int2");
    mString1 = paramBundle.getString("string1");
    if (paramBundle.containsKey("tint_list")) {
      mTintList = ((ColorStateList)paramBundle.getParcelable("tint_list"));
    }
    if (paramBundle.containsKey("tint_mode")) {
      mTintMode = PorterDuff.Mode.valueOf(paramBundle.getString("tint_mode"));
    }
    switch (i)
    {
    case 0: 
    default: 
      paramBundle = new StringBuilder();
      paramBundle.append("Unknown type ");
      paramBundle.append(i);
      Log.w("IconCompat", paramBundle.toString());
      return null;
    case 3: 
      mObj1 = paramBundle.getByteArray("obj");
      break;
    case 2: 
    case 4: 
    case 6: 
      mObj1 = paramBundle.getString("obj");
      break;
    case -1: 
    case 1: 
    case 5: 
      mObj1 = paramBundle.getParcelable("obj");
    }
    return localIconCompat;
  }
  
  @Nullable
  @RequiresApi(23)
  public static IconCompat createFromIcon(@NonNull Context paramContext, @NonNull Icon paramIcon)
  {
    Preconditions.checkNotNull(paramIcon);
    return Api23Impl.createFromIcon(paramContext, paramIcon);
  }
  
  @Nullable
  @RequiresApi(23)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static IconCompat createFromIcon(@NonNull Icon paramIcon)
  {
    return Api23Impl.createFromIconInner(paramIcon);
  }
  
  @Nullable
  @RequiresApi(23)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static IconCompat createFromIconOrNullIfZeroResId(@NonNull Icon paramIcon)
  {
    if ((Api23Impl.getType(paramIcon) == 2) && (Api23Impl.getResId(paramIcon) == 0)) {
      return null;
    }
    return Api23Impl.createFromIconInner(paramIcon);
  }
  
  @VisibleForTesting
  public static Bitmap createLegacyIconFromAdaptiveIcon(Bitmap paramBitmap, boolean paramBoolean)
  {
    int i = (int)(Math.min(paramBitmap.getWidth(), paramBitmap.getHeight()) * 0.6666667F);
    Bitmap localBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint(3);
    float f1 = i;
    float f2 = 0.5F * f1;
    float f3 = 0.9166667F * f2;
    if (paramBoolean)
    {
      float f4 = 0.010416667F * f1;
      localPaint.setColor(0);
      localPaint.setShadowLayer(f4, 0.0F, f1 * 0.020833334F, 1023410176);
      localCanvas.drawCircle(f2, f2, f3, localPaint);
      localPaint.setShadowLayer(f4, 0.0F, 0.0F, 503316480);
      localCanvas.drawCircle(f2, f2, f3, localPaint);
      localPaint.clearShadowLayer();
    }
    localPaint.setColor(-16777216);
    Object localObject = Shader.TileMode.CLAMP;
    BitmapShader localBitmapShader = new BitmapShader(paramBitmap, (Shader.TileMode)localObject, (Shader.TileMode)localObject);
    localObject = new Matrix();
    ((Matrix)localObject).setTranslate(-(paramBitmap.getWidth() - i) / 2.0F, -(paramBitmap.getHeight() - i) / 2.0F);
    localBitmapShader.setLocalMatrix((Matrix)localObject);
    localPaint.setShader(localBitmapShader);
    localCanvas.drawCircle(f2, f2, f3, localPaint);
    localCanvas.setBitmap(null);
    return localBitmap;
  }
  
  @NonNull
  public static IconCompat createWithAdaptiveBitmap(@NonNull Bitmap paramBitmap)
  {
    ObjectsCompat.requireNonNull(paramBitmap);
    IconCompat localIconCompat = new IconCompat(5);
    mObj1 = paramBitmap;
    return localIconCompat;
  }
  
  @NonNull
  public static IconCompat createWithAdaptiveBitmapContentUri(@NonNull Uri paramUri)
  {
    ObjectsCompat.requireNonNull(paramUri);
    return createWithAdaptiveBitmapContentUri(paramUri.toString());
  }
  
  @NonNull
  public static IconCompat createWithAdaptiveBitmapContentUri(@NonNull String paramString)
  {
    ObjectsCompat.requireNonNull(paramString);
    IconCompat localIconCompat = new IconCompat(6);
    mObj1 = paramString;
    return localIconCompat;
  }
  
  @NonNull
  public static IconCompat createWithBitmap(@NonNull Bitmap paramBitmap)
  {
    ObjectsCompat.requireNonNull(paramBitmap);
    IconCompat localIconCompat = new IconCompat(1);
    mObj1 = paramBitmap;
    return localIconCompat;
  }
  
  @NonNull
  public static IconCompat createWithContentUri(@NonNull Uri paramUri)
  {
    ObjectsCompat.requireNonNull(paramUri);
    return createWithContentUri(paramUri.toString());
  }
  
  @NonNull
  public static IconCompat createWithContentUri(@NonNull String paramString)
  {
    ObjectsCompat.requireNonNull(paramString);
    IconCompat localIconCompat = new IconCompat(4);
    mObj1 = paramString;
    return localIconCompat;
  }
  
  @NonNull
  public static IconCompat createWithData(@NonNull byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    ObjectsCompat.requireNonNull(paramArrayOfByte);
    IconCompat localIconCompat = new IconCompat(3);
    mObj1 = paramArrayOfByte;
    mInt1 = paramInt1;
    mInt2 = paramInt2;
    return localIconCompat;
  }
  
  @NonNull
  public static IconCompat createWithResource(@NonNull Context paramContext, @DrawableRes int paramInt)
  {
    ObjectsCompat.requireNonNull(paramContext);
    return createWithResource(paramContext.getResources(), paramContext.getPackageName(), paramInt);
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static IconCompat createWithResource(@Nullable Resources paramResources, @NonNull String paramString, @DrawableRes int paramInt)
  {
    ObjectsCompat.requireNonNull(paramString);
    if (paramInt != 0)
    {
      IconCompat localIconCompat = new IconCompat(2);
      mInt1 = paramInt;
      if (paramResources != null) {
        try
        {
          mObj1 = paramResources.getResourceName(paramInt);
        }
        catch (Resources.NotFoundException paramResources)
        {
          throw new IllegalArgumentException("Icon resource cannot be found");
        }
      } else {
        mObj1 = paramString;
      }
      mString1 = paramString;
      return localIconCompat;
    }
    throw new IllegalArgumentException("Drawable resource ID must not be 0");
  }
  
  public static Resources getResources(Context paramContext, String paramString)
  {
    if ("android".equals(paramString)) {
      return Resources.getSystem();
    }
    PackageManager localPackageManager = paramContext.getPackageManager();
    try
    {
      paramContext = localPackageManager.getApplicationInfo(paramString, 8192);
      if (paramContext != null)
      {
        paramContext = localPackageManager.getResourcesForApplication(paramContext);
        return paramContext;
      }
      return null;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", new Object[] { paramString }), paramContext);
    }
    return null;
  }
  
  private Drawable loadDrawableInner(Context paramContext)
  {
    Object localObject;
    switch (mType)
    {
    default: 
      break;
    case 6: 
      localObject = getUriInputStream(paramContext);
      if (localObject != null)
      {
        if (Build.VERSION.SDK_INT >= 26) {
          return Api26Impl.createAdaptiveIconDrawable(null, new BitmapDrawable(paramContext.getResources(), BitmapFactory.decodeStream((InputStream)localObject)));
        }
        return new BitmapDrawable(paramContext.getResources(), createLegacyIconFromAdaptiveIcon(BitmapFactory.decodeStream((InputStream)localObject), false));
      }
      break;
    case 5: 
      return new BitmapDrawable(paramContext.getResources(), createLegacyIconFromAdaptiveIcon((Bitmap)mObj1, false));
    case 4: 
      localObject = getUriInputStream(paramContext);
      if (localObject != null) {
        return new BitmapDrawable(paramContext.getResources(), BitmapFactory.decodeStream((InputStream)localObject));
      }
      break;
    case 3: 
      return new BitmapDrawable(paramContext.getResources(), BitmapFactory.decodeByteArray((byte[])mObj1, mInt1, mInt2));
    case 2: 
      String str = getResPackage();
      localObject = str;
      if (TextUtils.isEmpty(str)) {
        localObject = paramContext.getPackageName();
      }
      localObject = getResources(paramContext, (String)localObject);
      try
      {
        paramContext = ResourcesCompat.getDrawable((Resources)localObject, mInt1, paramContext.getTheme());
        return paramContext;
      }
      catch (RuntimeException paramContext)
      {
        Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", new Object[] { Integer.valueOf(mInt1), mObj1 }), paramContext);
      }
    case 1: 
      return new BitmapDrawable(paramContext.getResources(), (Bitmap)mObj1);
    }
    return null;
  }
  
  private static String typeToString(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "UNKNOWN";
    case 6: 
      return "URI_MASKABLE";
    case 5: 
      return "BITMAP_MASKABLE";
    case 4: 
      return "URI";
    case 3: 
      return "DATA";
    case 2: 
      return "RESOURCE";
    }
    return "BITMAP";
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void addToShortcutIntent(@NonNull Intent paramIntent, @Nullable Drawable paramDrawable, @NonNull Context paramContext)
  {
    checkResource(paramContext);
    int i = mType;
    Object localObject;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 5) {
          paramContext = createLegacyIconFromAdaptiveIcon((Bitmap)mObj1, true);
        } else {
          throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
        }
      }
      else {
        try
        {
          paramContext = paramContext.createPackageContext(getResPackage(), 0);
          if (paramDrawable == null)
          {
            paramIntent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(paramContext, mInt1));
            return;
          }
          localObject = ContextCompat.getDrawable(paramContext, mInt1);
          if ((((Drawable)localObject).getIntrinsicWidth() > 0) && (((Drawable)localObject).getIntrinsicHeight() > 0))
          {
            paramContext = Bitmap.createBitmap(((Drawable)localObject).getIntrinsicWidth(), ((Drawable)localObject).getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
          }
          else
          {
            i = ((ActivityManager)paramContext.getSystemService("activity")).getLauncherLargeIconSize();
            paramContext = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
          }
          ((Drawable)localObject).setBounds(0, 0, paramContext.getWidth(), paramContext.getHeight());
          Canvas localCanvas = new android/graphics/Canvas;
          localCanvas.<init>(paramContext);
          ((Drawable)localObject).draw(localCanvas);
        }
        catch (PackageManager.NameNotFoundException paramIntent)
        {
          paramDrawable = z2.t("Can't find package ");
          paramDrawable.append(mObj1);
          throw new IllegalArgumentException(paramDrawable.toString(), paramIntent);
        }
      }
    }
    else
    {
      localObject = (Bitmap)mObj1;
      paramContext = (Context)localObject;
      if (paramDrawable != null) {
        paramContext = ((Bitmap)localObject).copy(((Bitmap)localObject).getConfig(), true);
      }
    }
    if (paramDrawable != null)
    {
      int j = paramContext.getWidth();
      i = paramContext.getHeight();
      paramDrawable.setBounds(j / 2, i / 2, j, i);
      paramDrawable.draw(new Canvas(paramContext));
    }
    paramIntent.putExtra("android.intent.extra.shortcut.ICON", paramContext);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void checkResource(@NonNull Context paramContext)
  {
    if (mType == 2)
    {
      Object localObject = mObj1;
      if (localObject != null)
      {
        localObject = (String)localObject;
        if (!((String)localObject).contains(":")) {
          return;
        }
        String str1 = localObject.split(":", -1)[1];
        String str2 = str1.split("/", -1)[0];
        String str3 = str1.split("/", -1)[1];
        String str4 = localObject.split(":", -1)[0];
        if ("0_resource_name_obfuscated".equals(str3))
        {
          Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
          return;
        }
        str1 = getResPackage();
        int i = getResources(paramContext, str1).getIdentifier(str3, str2, str4);
        if (mInt1 != i)
        {
          paramContext = new StringBuilder();
          paramContext.append("Id has changed for ");
          paramContext.append(str1);
          paramContext.append(" ");
          paramContext.append((String)localObject);
          Log.i("IconCompat", paramContext.toString());
          mInt1 = i;
        }
      }
    }
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public Bitmap getBitmap()
  {
    int i = mType;
    if (i == -1)
    {
      localObject = mObj1;
      if ((localObject instanceof Bitmap)) {
        return (Bitmap)localObject;
      }
      return null;
    }
    if (i == 1) {
      return (Bitmap)mObj1;
    }
    if (i == 5) {
      return createLegacyIconFromAdaptiveIcon((Bitmap)mObj1, true);
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("called getBitmap() on ");
    ((StringBuilder)localObject).append(this);
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  @DrawableRes
  public int getResId()
  {
    int i = mType;
    if (i == -1) {
      return Api23Impl.getResId(mObj1);
    }
    if (i == 2) {
      return mInt1;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("called getResId() on ");
    localStringBuilder.append(this);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  @NonNull
  public String getResPackage()
  {
    int i = mType;
    if (i == -1) {
      return Api23Impl.getResPackage(mObj1);
    }
    if (i == 2)
    {
      localObject = mString1;
      if ((localObject != null) && (!TextUtils.isEmpty((CharSequence)localObject))) {
        return mString1;
      }
      return ((String)mObj1).split(":", -1)[0];
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("called getResPackage() on ");
    ((StringBuilder)localObject).append(this);
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public int getType()
  {
    int i = mType;
    int j = i;
    if (i == -1) {
      j = Api23Impl.getType(mObj1);
    }
    return j;
  }
  
  @NonNull
  public Uri getUri()
  {
    int i = mType;
    if (i == -1) {
      return Api23Impl.getUri(mObj1);
    }
    if ((i != 4) && (i != 6))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("called getUri() on ");
      localStringBuilder.append(this);
      throw new IllegalStateException(localStringBuilder.toString());
    }
    return Uri.parse((String)mObj1);
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public InputStream getUriInputStream(@NonNull Context paramContext)
  {
    Uri localUri = getUri();
    String str = localUri.getScheme();
    if ((!"content".equals(str)) && (!"file".equals(str))) {
      try
      {
        paramContext = new java/io/File;
        paramContext.<init>((String)mObj1);
        paramContext = new FileInputStream(paramContext);
        return paramContext;
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        paramContext = new StringBuilder();
        paramContext.append("Unable to load image from path: ");
        paramContext.append(localUri);
        Log.w("IconCompat", paramContext.toString(), localFileNotFoundException);
      }
    } else {
      try
      {
        paramContext = paramContext.getContentResolver().openInputStream(localUri);
        return paramContext;
      }
      catch (Exception localException)
      {
        paramContext = new StringBuilder();
        paramContext.append("Unable to load image from URI: ");
        paramContext.append(localUri);
        Log.w("IconCompat", paramContext.toString(), localException);
      }
    }
    return null;
  }
  
  @Nullable
  public Drawable loadDrawable(@NonNull Context paramContext)
  {
    checkResource(paramContext);
    return Api23Impl.loadDrawable(toIcon(paramContext), paramContext);
  }
  
  public void onPostParceling()
  {
    mTintMode = PorterDuff.Mode.valueOf(mTintModeStr);
    Object localObject;
    switch (mType)
    {
    case 0: 
    default: 
      break;
    case 3: 
      mObj1 = mData;
      break;
    case 2: 
    case 4: 
    case 6: 
      localObject = new String(mData, Charset.forName("UTF-16"));
      mObj1 = localObject;
      if ((mType == 2) && (mString1 == null)) {
        mString1 = localObject.split(":", -1)[0];
      }
      break;
    case 1: 
    case 5: 
      localObject = mParcelable;
      if (localObject != null)
      {
        mObj1 = localObject;
      }
      else
      {
        localObject = mData;
        mObj1 = localObject;
        mType = 3;
        mInt1 = 0;
        mInt2 = localObject.length;
      }
      break;
    case -1: 
      localObject = mParcelable;
      if (localObject != null) {
        mObj1 = localObject;
      } else {
        throw new IllegalArgumentException("Invalid icon");
      }
      break;
    }
  }
  
  public void onPreParceling(boolean paramBoolean)
  {
    mTintModeStr = mTintMode.name();
    switch (mType)
    {
    case 0: 
    default: 
      break;
    case 4: 
    case 6: 
      mData = mObj1.toString().getBytes(Charset.forName("UTF-16"));
      break;
    case 3: 
      mData = ((byte[])mObj1);
      break;
    case 2: 
      mData = ((String)mObj1).getBytes(Charset.forName("UTF-16"));
      break;
    case 1: 
    case 5: 
      if (paramBoolean)
      {
        Bitmap localBitmap = (Bitmap)mObj1;
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        localBitmap.compress(Bitmap.CompressFormat.PNG, 90, localByteArrayOutputStream);
        mData = localByteArrayOutputStream.toByteArray();
      }
      else
      {
        mParcelable = ((Parcelable)mObj1);
      }
      break;
    case -1: 
      if (!paramBoolean) {
        mParcelable = ((Parcelable)mObj1);
      } else {
        throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
      }
      break;
    }
  }
  
  @NonNull
  public IconCompat setTint(@ColorInt int paramInt)
  {
    return setTintList(ColorStateList.valueOf(paramInt));
  }
  
  @NonNull
  public IconCompat setTintList(@Nullable ColorStateList paramColorStateList)
  {
    mTintList = paramColorStateList;
    return this;
  }
  
  @NonNull
  public IconCompat setTintMode(@Nullable PorterDuff.Mode paramMode)
  {
    mTintMode = paramMode;
    return this;
  }
  
  @NonNull
  public Bundle toBundle()
  {
    Bundle localBundle = new Bundle();
    switch (mType)
    {
    case 0: 
    default: 
      throw new IllegalArgumentException("Invalid icon");
    case 3: 
      localBundle.putByteArray("obj", (byte[])mObj1);
      break;
    case 2: 
    case 4: 
    case 6: 
      localBundle.putString("obj", (String)mObj1);
      break;
    case 1: 
    case 5: 
      localBundle.putParcelable("obj", (Bitmap)mObj1);
      break;
    case -1: 
      localBundle.putParcelable("obj", (Parcelable)mObj1);
    }
    localBundle.putInt("type", mType);
    localBundle.putInt("int1", mInt1);
    localBundle.putInt("int2", mInt2);
    localBundle.putString("string1", mString1);
    Object localObject = mTintList;
    if (localObject != null) {
      localBundle.putParcelable("tint_list", (Parcelable)localObject);
    }
    localObject = mTintMode;
    if (localObject != DEFAULT_TINT_MODE) {
      localBundle.putString("tint_mode", ((Enum)localObject).name());
    }
    return localBundle;
  }
  
  @Deprecated
  @NonNull
  @RequiresApi(23)
  public Icon toIcon()
  {
    return toIcon(null);
  }
  
  @NonNull
  @RequiresApi(23)
  public Icon toIcon(@Nullable Context paramContext)
  {
    return Api23Impl.toIcon(this, paramContext);
  }
  
  @NonNull
  public String toString()
  {
    if (mType == -1) {
      return String.valueOf(mObj1);
    }
    StringBuilder localStringBuilder = new StringBuilder("Icon(typ=");
    localStringBuilder.append(typeToString(mType));
    switch (mType)
    {
    default: 
      break;
    case 4: 
    case 6: 
      localStringBuilder.append(" uri=");
      localStringBuilder.append(mObj1);
      break;
    case 3: 
      localStringBuilder.append(" len=");
      localStringBuilder.append(mInt1);
      if (mInt2 != 0)
      {
        localStringBuilder.append(" off=");
        localStringBuilder.append(mInt2);
      }
      break;
    case 2: 
      localStringBuilder.append(" pkg=");
      localStringBuilder.append(mString1);
      localStringBuilder.append(" id=");
      localStringBuilder.append(String.format("0x%08x", new Object[] { Integer.valueOf(getResId()) }));
      break;
    case 1: 
    case 5: 
      localStringBuilder.append(" size=");
      localStringBuilder.append(((Bitmap)mObj1).getWidth());
      localStringBuilder.append("x");
      localStringBuilder.append(((Bitmap)mObj1).getHeight());
    }
    if (mTintList != null)
    {
      localStringBuilder.append(" tint=");
      localStringBuilder.append(mTintList);
    }
    if (mTintMode != DEFAULT_TINT_MODE)
    {
      localStringBuilder.append(" mode=");
      localStringBuilder.append(mTintMode);
    }
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  @RequiresApi(23)
  public static class Api23Impl
  {
    @Nullable
    public static IconCompat createFromIcon(@NonNull Context paramContext, @NonNull Icon paramIcon)
    {
      int i = getType(paramIcon);
      if (i != 2)
      {
        if (i != 4)
        {
          if (i != 6)
          {
            paramContext = new IconCompat(-1);
            mObj1 = paramIcon;
            return paramContext;
          }
          return IconCompat.createWithAdaptiveBitmapContentUri(getUri(paramIcon));
        }
        return IconCompat.createWithContentUri(getUri(paramIcon));
      }
      String str = getResPackage(paramIcon);
      try
      {
        paramContext = IconCompat.createWithResource(IconCompat.getResources(paramContext, str), str, getResId(paramIcon));
        return paramContext;
      }
      catch (Resources.NotFoundException paramContext)
      {
        throw new IllegalArgumentException("Icon resource cannot be found");
      }
    }
    
    public static IconCompat createFromIconInner(@NonNull Object paramObject)
    {
      Preconditions.checkNotNull(paramObject);
      int i = getType(paramObject);
      if (i != 2)
      {
        if (i != 4)
        {
          if (i != 6)
          {
            IconCompat localIconCompat = new IconCompat(-1);
            mObj1 = paramObject;
            return localIconCompat;
          }
          return IconCompat.createWithAdaptiveBitmapContentUri(getUri(paramObject));
        }
        return IconCompat.createWithContentUri(getUri(paramObject));
      }
      return IconCompat.createWithResource(null, getResPackage(paramObject), getResId(paramObject));
    }
    
    @DrawableRes
    @IdRes
    public static int getResId(@NonNull Object paramObject)
    {
      if (Build.VERSION.SDK_INT >= 28) {
        return IconCompat.Api28Impl.getResId(paramObject);
      }
      try
      {
        int i = ((Integer)paramObject.getClass().getMethod("getResId", new Class[0]).invoke(paramObject, new Object[0])).intValue();
        return i;
      }
      catch (NoSuchMethodException paramObject)
      {
        Log.e("IconCompat", "Unable to get icon resource", (Throwable)paramObject);
        return 0;
      }
      catch (InvocationTargetException paramObject)
      {
        Log.e("IconCompat", "Unable to get icon resource", (Throwable)paramObject);
        return 0;
      }
      catch (IllegalAccessException paramObject)
      {
        Log.e("IconCompat", "Unable to get icon resource", (Throwable)paramObject);
      }
      return 0;
    }
    
    @Nullable
    public static String getResPackage(@NonNull Object paramObject)
    {
      if (Build.VERSION.SDK_INT >= 28) {
        return IconCompat.Api28Impl.getResPackage(paramObject);
      }
      try
      {
        paramObject = (String)paramObject.getClass().getMethod("getResPackage", new Class[0]).invoke(paramObject, new Object[0]);
        return (String)paramObject;
      }
      catch (NoSuchMethodException paramObject)
      {
        Log.e("IconCompat", "Unable to get icon package", (Throwable)paramObject);
        return null;
      }
      catch (InvocationTargetException paramObject)
      {
        Log.e("IconCompat", "Unable to get icon package", (Throwable)paramObject);
        return null;
      }
      catch (IllegalAccessException paramObject)
      {
        Log.e("IconCompat", "Unable to get icon package", (Throwable)paramObject);
      }
      return null;
    }
    
    public static int getType(@NonNull Object paramObject)
    {
      if (Build.VERSION.SDK_INT >= 28) {
        return IconCompat.Api28Impl.getType(paramObject);
      }
      try
      {
        int i = ((Integer)paramObject.getClass().getMethod("getType", new Class[0]).invoke(paramObject, new Object[0])).intValue();
        return i;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append("Unable to get icon type ");
        localStringBuilder2.append(paramObject);
        Log.e("IconCompat", localStringBuilder2.toString(), localNoSuchMethodException);
        return -1;
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        StringBuilder localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append("Unable to get icon type ");
        localStringBuilder2.append(paramObject);
        Log.e("IconCompat", localStringBuilder2.toString(), localInvocationTargetException);
        return -1;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        StringBuilder localStringBuilder1 = new StringBuilder();
        localStringBuilder1.append("Unable to get icon type ");
        localStringBuilder1.append(paramObject);
        Log.e("IconCompat", localStringBuilder1.toString(), localIllegalAccessException);
      }
      return -1;
    }
    
    @DoNotInline
    @Nullable
    public static Uri getUri(@NonNull Object paramObject)
    {
      if (Build.VERSION.SDK_INT >= 28) {
        return IconCompat.Api28Impl.getUri(paramObject);
      }
      try
      {
        paramObject = (Uri)paramObject.getClass().getMethod("getUri", new Class[0]).invoke(paramObject, new Object[0]);
        return (Uri)paramObject;
      }
      catch (NoSuchMethodException paramObject)
      {
        Log.e("IconCompat", "Unable to get icon uri", (Throwable)paramObject);
        return null;
      }
      catch (InvocationTargetException paramObject)
      {
        Log.e("IconCompat", "Unable to get icon uri", (Throwable)paramObject);
        return null;
      }
      catch (IllegalAccessException paramObject)
      {
        Log.e("IconCompat", "Unable to get icon uri", (Throwable)paramObject);
      }
      return null;
    }
    
    @DoNotInline
    public static Drawable loadDrawable(Icon paramIcon, Context paramContext)
    {
      return paramIcon.loadDrawable(paramContext);
    }
    
    @DoNotInline
    public static Icon toIcon(IconCompat paramIconCompat, Context paramContext)
    {
      switch (mType)
      {
      case 0: 
      default: 
        throw new IllegalArgumentException("Unknown type");
      case 6: 
        int i = Build.VERSION.SDK_INT;
        if (i >= 30)
        {
          paramContext = IconCompat.Api30Impl.createWithAdaptiveBitmapContentUri(paramIconCompat.getUri());
        }
        else if (paramContext != null)
        {
          paramContext = paramIconCompat.getUriInputStream(paramContext);
          if (paramContext != null)
          {
            if (i >= 26) {
              paramContext = IconCompat.Api26Impl.createWithAdaptiveBitmap(BitmapFactory.decodeStream(paramContext));
            } else {
              paramContext = Icon.createWithBitmap(IconCompat.createLegacyIconFromAdaptiveIcon(BitmapFactory.decodeStream(paramContext), false));
            }
          }
          else
          {
            paramContext = z2.t("Cannot load adaptive icon from uri: ");
            paramContext.append(paramIconCompat.getUri());
            throw new IllegalStateException(paramContext.toString());
          }
        }
        else
        {
          paramContext = z2.t("Context is required to resolve the file uri of the icon: ");
          paramContext.append(paramIconCompat.getUri());
          throw new IllegalArgumentException(paramContext.toString());
        }
      case 5: 
        if (Build.VERSION.SDK_INT >= 26) {
          paramContext = IconCompat.Api26Impl.createWithAdaptiveBitmap((Bitmap)mObj1);
        } else {
          paramContext = Icon.createWithBitmap(IconCompat.createLegacyIconFromAdaptiveIcon((Bitmap)mObj1, false));
        }
        break;
      case 4: 
        paramContext = Icon.createWithContentUri((String)mObj1);
        break;
      case 3: 
        paramContext = Icon.createWithData((byte[])mObj1, mInt1, mInt2);
        break;
      case 2: 
        paramContext = Icon.createWithResource(paramIconCompat.getResPackage(), mInt1);
        break;
      case 1: 
        paramContext = Icon.createWithBitmap((Bitmap)mObj1);
        ColorStateList localColorStateList = mTintList;
        if (localColorStateList != null) {
          paramContext.setTintList(localColorStateList);
        }
        paramIconCompat = mTintMode;
        if (paramIconCompat != IconCompat.DEFAULT_TINT_MODE) {
          paramContext.setTintMode(paramIconCompat);
        }
        return paramContext;
      }
      return (Icon)mObj1;
    }
  }
  
  @RequiresApi(26)
  public static class Api26Impl
  {
    @DoNotInline
    public static Drawable createAdaptiveIconDrawable(Drawable paramDrawable1, Drawable paramDrawable2)
    {
      return new AdaptiveIconDrawable(paramDrawable1, paramDrawable2);
    }
    
    @DoNotInline
    public static Icon createWithAdaptiveBitmap(Bitmap paramBitmap)
    {
      return f0.o(paramBitmap);
    }
  }
  
  @RequiresApi(28)
  public static class Api28Impl
  {
    @DoNotInline
    public static int getResId(Object paramObject)
    {
      return c.a((Icon)paramObject);
    }
    
    @DoNotInline
    public static String getResPackage(Object paramObject)
    {
      return c.l((Icon)paramObject);
    }
    
    @DoNotInline
    public static int getType(Object paramObject)
    {
      return c.w((Icon)paramObject);
    }
    
    @DoNotInline
    public static Uri getUri(Object paramObject)
    {
      return c.f((Icon)paramObject);
    }
  }
  
  @RequiresApi(30)
  public static class Api30Impl
  {
    @DoNotInline
    public static Icon createWithAdaptiveBitmapContentUri(Uri paramUri)
    {
      return d.e(paramUri);
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static @interface IconType {}
}

/* Location:
 * Qualified Name:     androidx.core.graphics.drawable.IconCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */