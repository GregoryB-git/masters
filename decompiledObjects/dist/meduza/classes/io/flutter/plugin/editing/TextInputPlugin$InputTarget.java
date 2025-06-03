package io.flutter.plugin.editing;

class TextInputPlugin$InputTarget
{
  public int id;
  public Type type;
  
  public TextInputPlugin$InputTarget(Type paramType, int paramInt)
  {
    type = paramType;
    id = paramInt;
  }
  
  public static enum Type
  {
    static
    {
      FRAMEWORK_CLIENT = new Type("FRAMEWORK_CLIENT", 1);
      VIRTUAL_DISPLAY_PLATFORM_VIEW = new Type("VIRTUAL_DISPLAY_PLATFORM_VIEW", 2);
      PHYSICAL_DISPLAY_PLATFORM_VIEW = new Type("PHYSICAL_DISPLAY_PLATFORM_VIEW", 3);
    }
    
    private Type() {}
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.editing.TextInputPlugin.InputTarget
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */