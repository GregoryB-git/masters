package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.ColorSpace.Named;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import b;
import f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\000>\n\000\n\002\020\b\n\002\b\002\n\002\020\007\n\002\020\t\n\002\b\004\n\002\030\002\n\002\b\005\n\002\020\013\n\002\b\b\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\004\n\002\020\016\n\002\b\002\032\r\020\030\032\0020\004*\0020\031H\n\032\r\020\030\032\0020\001*\0020\001H\n\032\r\020\030\032\0020\004*\0020\005H\n\032\r\020\032\032\0020\004*\0020\031H\n\032\r\020\032\032\0020\001*\0020\001H\n\032\r\020\032\032\0020\004*\0020\005H\n\032\r\020\033\032\0020\004*\0020\031H\n\032\r\020\033\032\0020\001*\0020\001H\n\032\r\020\033\032\0020\004*\0020\005H\n\032\r\020\034\032\0020\004*\0020\031H\n\032\r\020\034\032\0020\001*\0020\001H\n\032\r\020\034\032\0020\004*\0020\005H\n\032\025\020\035\032\0020\031*\0020\0312\006\020\t\032\0020\nH\f\032\025\020\035\032\0020\031*\0020\0312\006\020\t\032\0020\036H\f\032\025\020\035\032\0020\005*\0020\0012\006\020\t\032\0020\nH\f\032\025\020\035\032\0020\005*\0020\0012\006\020\t\032\0020\036H\f\032\025\020\035\032\0020\005*\0020\0052\006\020\t\032\0020\nH\f\032\025\020\035\032\0020\005*\0020\0052\006\020\t\032\0020\036H\f\032\025\020\037\032\0020\031*\0020\0312\006\020 \032\0020\031H\002\032\r\020!\032\0020\031*\0020\001H\b\032\r\020!\032\0020\031*\0020\005H\b\032\r\020\"\032\0020\001*\0020\005H\b\032\r\020\"\032\0020\001*\0020#H\b\032\r\020$\032\0020\005*\0020\001H\b\"\026\020\000\032\0020\001*\0020\0018Æ\002¢\006\006\032\004\b\002\020\003\"\026\020\000\032\0020\004*\0020\0058Ç\002¢\006\006\032\004\b\002\020\006\"\026\020\007\032\0020\001*\0020\0018Æ\002¢\006\006\032\004\b\b\020\003\"\026\020\007\032\0020\004*\0020\0058Ç\002¢\006\006\032\004\b\b\020\006\"\026\020\t\032\0020\n*\0020\0058Ç\002¢\006\006\032\004\b\013\020\f\"\026\020\r\032\0020\001*\0020\0018Æ\002¢\006\006\032\004\b\016\020\003\"\026\020\r\032\0020\004*\0020\0058Ç\002¢\006\006\032\004\b\016\020\006\"\026\020\017\032\0020\020*\0020\0058Ç\002¢\006\006\032\004\b\017\020\021\"\026\020\022\032\0020\020*\0020\0058Ç\002¢\006\006\032\004\b\022\020\021\"\026\020\023\032\0020\004*\0020\0018Ç\002¢\006\006\032\004\b\024\020\025\"\026\020\023\032\0020\004*\0020\0058Ç\002¢\006\006\032\004\b\024\020\006\"\026\020\026\032\0020\001*\0020\0018Æ\002¢\006\006\032\004\b\027\020\003\"\026\020\026\032\0020\004*\0020\0058Ç\002¢\006\006\032\004\b\027\020\006¨\006%"}, d2={"alpha", "", "getAlpha", "(I)I", "", "", "(J)F", "blue", "getBlue", "colorSpace", "Landroid/graphics/ColorSpace;", "getColorSpace", "(J)Landroid/graphics/ColorSpace;", "green", "getGreen", "isSrgb", "", "(J)Z", "isWideGamut", "luminance", "getLuminance", "(I)F", "red", "getRed", "component1", "Landroid/graphics/Color;", "component2", "component3", "component4", "convertTo", "Landroid/graphics/ColorSpace$Named;", "plus", "c", "toColor", "toColorInt", "", "toColorLong", "core-ktx_release"}, k=2, mv={1, 7, 1}, xi=48)
public final class ColorKt
{
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  public static final float component1(long paramLong)
  {
    return b.x(paramLong);
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  public static final float component1(@NotNull Color paramColor)
  {
    Intrinsics.checkNotNullParameter(paramColor, "<this>");
    return b.y(paramColor);
  }
  
  public static final int component1(@ColorInt int paramInt)
  {
    return paramInt >> 24 & 0xFF;
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  public static final float component2(long paramLong)
  {
    return b.A(paramLong);
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  public static final float component2(@NotNull Color paramColor)
  {
    Intrinsics.checkNotNullParameter(paramColor, "<this>");
    return b.D(paramColor);
  }
  
  public static final int component2(@ColorInt int paramInt)
  {
    return paramInt >> 16 & 0xFF;
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  public static final float component3(long paramLong)
  {
    return b.C(paramLong);
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  public static final float component3(@NotNull Color paramColor)
  {
    Intrinsics.checkNotNullParameter(paramColor, "<this>");
    return b.B(paramColor);
  }
  
  public static final int component3(@ColorInt int paramInt)
  {
    return paramInt >> 8 & 0xFF;
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  public static final float component4(long paramLong)
  {
    return f0.a(paramLong);
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  public static final float component4(@NotNull Color paramColor)
  {
    Intrinsics.checkNotNullParameter(paramColor, "<this>");
    return b.b(paramColor);
  }
  
  public static final int component4(@ColorInt int paramInt)
  {
    return paramInt & 0xFF;
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  public static final long convertTo(@ColorInt int paramInt, @NotNull ColorSpace.Named paramNamed)
  {
    Intrinsics.checkNotNullParameter(paramNamed, "colorSpace");
    return Color.convert(paramInt, ColorSpace.get(paramNamed));
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  public static final long convertTo(@ColorInt int paramInt, @NotNull ColorSpace paramColorSpace)
  {
    Intrinsics.checkNotNullParameter(paramColorSpace, "colorSpace");
    return b.h(paramInt, paramColorSpace);
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  public static final long convertTo(long paramLong, @NotNull ColorSpace.Named paramNamed)
  {
    Intrinsics.checkNotNullParameter(paramNamed, "colorSpace");
    return Color.convert(paramLong, ColorSpace.get(paramNamed));
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  public static final long convertTo(long paramLong, @NotNull ColorSpace paramColorSpace)
  {
    Intrinsics.checkNotNullParameter(paramColorSpace, "colorSpace");
    return f0.h(paramLong, paramColorSpace);
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  @NotNull
  public static final Color convertTo(@NotNull Color paramColor, @NotNull ColorSpace.Named paramNamed)
  {
    Intrinsics.checkNotNullParameter(paramColor, "<this>");
    Intrinsics.checkNotNullParameter(paramNamed, "colorSpace");
    paramColor = paramColor.convert(ColorSpace.get(paramNamed));
    Intrinsics.checkNotNullExpressionValue(paramColor, "convert(ColorSpace.get(colorSpace))");
    return paramColor;
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  @NotNull
  public static final Color convertTo(@NotNull Color paramColor, @NotNull ColorSpace paramColorSpace)
  {
    Intrinsics.checkNotNullParameter(paramColor, "<this>");
    Intrinsics.checkNotNullParameter(paramColorSpace, "colorSpace");
    paramColor = b.k(paramColor, paramColorSpace);
    Intrinsics.checkNotNullExpressionValue(paramColor, "convert(colorSpace)");
    return paramColor;
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  public static final float getAlpha(long paramLong)
  {
    return f0.a(paramLong);
  }
  
  public static final int getAlpha(@ColorInt int paramInt)
  {
    return paramInt >> 24 & 0xFF;
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  public static final float getBlue(long paramLong)
  {
    return b.C(paramLong);
  }
  
  public static final int getBlue(@ColorInt int paramInt)
  {
    return paramInt & 0xFF;
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  @NotNull
  public static final ColorSpace getColorSpace(long paramLong)
  {
    ColorSpace localColorSpace = b.l(paramLong);
    Intrinsics.checkNotNullExpressionValue(localColorSpace, "colorSpace(this)");
    return localColorSpace;
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  public static final float getGreen(long paramLong)
  {
    return b.A(paramLong);
  }
  
  public static final int getGreen(@ColorInt int paramInt)
  {
    return paramInt >> 8 & 0xFF;
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  public static final float getLuminance(@ColorInt int paramInt)
  {
    return Color.luminance(paramInt);
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  public static final float getLuminance(long paramLong)
  {
    return b.a(paramLong);
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  public static final float getRed(long paramLong)
  {
    return b.x(paramLong);
  }
  
  public static final int getRed(@ColorInt int paramInt)
  {
    return paramInt >> 16 & 0xFF;
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  public static final boolean isSrgb(long paramLong)
  {
    return f0.v(paramLong);
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  public static final boolean isWideGamut(long paramLong)
  {
    return b.t(paramLong);
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  @NotNull
  public static final Color plus(@NotNull Color paramColor1, @NotNull Color paramColor2)
  {
    Intrinsics.checkNotNullParameter(paramColor1, "<this>");
    Intrinsics.checkNotNullParameter(paramColor2, "c");
    paramColor1 = ColorUtils.compositeColors(paramColor2, paramColor1);
    Intrinsics.checkNotNullExpressionValue(paramColor1, "compositeColors(c, this)");
    return paramColor1;
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  @NotNull
  public static final Color toColor(@ColorInt int paramInt)
  {
    Color localColor = b.j(paramInt);
    Intrinsics.checkNotNullExpressionValue(localColor, "valueOf(this)");
    return localColor;
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  @NotNull
  public static final Color toColor(long paramLong)
  {
    Color localColor = f0.k(paramLong);
    Intrinsics.checkNotNullExpressionValue(localColor, "valueOf(this)");
    return localColor;
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @ColorInt
  @RequiresApi(26)
  public static final int toColorInt(long paramLong)
  {
    return b.c(paramLong);
  }
  
  @ColorInt
  public static final int toColorInt(@NotNull String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "<this>");
    return Color.parseColor(paramString);
  }
  
  @SuppressLint({"ClassVerificationFailure"})
  @RequiresApi(26)
  public static final long toColorLong(@ColorInt int paramInt)
  {
    return f0.g(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.ColorKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */