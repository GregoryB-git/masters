package androidx.window.layout;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class FoldingFeature$Orientation
{
  @NotNull
  public static final Companion Companion = new Companion(null);
  @NotNull
  public static final Orientation HORIZONTAL = new Orientation("HORIZONTAL");
  @NotNull
  public static final Orientation VERTICAL = new Orientation("VERTICAL");
  @NotNull
  private final String description;
  
  private FoldingFeature$Orientation(String paramString)
  {
    description = paramString;
  }
  
  @NotNull
  public String toString()
  {
    return description;
  }
  
  @Metadata
  public static final class Companion {}
}

/* Location:
 * Qualified Name:     androidx.window.layout.FoldingFeature.Orientation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */