package androidx.window.layout;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class HardwareFoldingFeature$Type
{
  @NotNull
  public static final Companion Companion = new Companion(null);
  @NotNull
  private static final Type FOLD = new Type("FOLD");
  @NotNull
  private static final Type HINGE = new Type("HINGE");
  @NotNull
  private final String description;
  
  private HardwareFoldingFeature$Type(String paramString)
  {
    description = paramString;
  }
  
  @NotNull
  public String toString()
  {
    return description;
  }
  
  @Metadata
  public static final class Companion
  {
    @NotNull
    public final HardwareFoldingFeature.Type getFOLD()
    {
      return HardwareFoldingFeature.Type.access$getFOLD$cp();
    }
    
    @NotNull
    public final HardwareFoldingFeature.Type getHINGE()
    {
      return HardwareFoldingFeature.Type.access$getHINGE$cp();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.HardwareFoldingFeature.Type
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */