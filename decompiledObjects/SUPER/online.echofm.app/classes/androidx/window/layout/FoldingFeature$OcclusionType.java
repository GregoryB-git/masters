package androidx.window.layout;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class FoldingFeature$OcclusionType
{
  @NotNull
  public static final Companion Companion = new Companion(null);
  @NotNull
  public static final OcclusionType FULL = new OcclusionType("FULL");
  @NotNull
  public static final OcclusionType NONE = new OcclusionType("NONE");
  @NotNull
  private final String description;
  
  private FoldingFeature$OcclusionType(String paramString)
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
 * Qualified Name:     androidx.window.layout.FoldingFeature.OcclusionType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */