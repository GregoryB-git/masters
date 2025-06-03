package androidx.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.RetentionPolicy;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;

@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@Deprecated(message="Replaced by the {@code androidx.resourceinpsection} package.")
@Metadata(d1={"\0004\n\002\030\002\n\002\020\033\n\000\n\002\020\016\n\000\n\002\020\b\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\000\n\002\030\002\n\002\b\n\b\002\030\0002\0020\001:\003\025\026\027BH\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007\022\b\b\002\020\b\032\0020\t\022\016\b\002\020\n\032\b\022\004\022\0020\f0\013\022\016\b\002\020\r\032\b\022\004\022\0020\0160\013R\017\020\004\032\0020\005¢\006\006\032\004\b\004\020\017R\025\020\n\032\b\022\004\022\0020\f0\013¢\006\006\032\004\b\n\020\020R\025\020\r\032\b\022\004\022\0020\0160\013¢\006\006\032\004\b\r\020\021R\017\020\006\032\0020\007¢\006\006\032\004\b\006\020\022R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\023R\017\020\b\032\0020\t¢\006\006\032\004\b\b\020\024¨\006\030"}, d2={"Landroidx/annotation/InspectableProperty;", "", "name", "", "attributeId", "", "hasAttributeId", "", "valueType", "Landroidx/annotation/InspectableProperty$ValueType;", "enumMapping", "", "Landroidx/annotation/InspectableProperty$EnumEntry;", "flagMapping", "Landroidx/annotation/InspectableProperty$FlagEntry;", "()I", "()[Landroidx/annotation/InspectableProperty$EnumEntry;", "()[Landroidx/annotation/InspectableProperty$FlagEntry;", "()Z", "()Ljava/lang/String;", "()Landroidx/annotation/InspectableProperty$ValueType;", "EnumEntry", "FlagEntry", "ValueType", "annotation"}, k=1, mv={1, 7, 1}, xi=48)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
@kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER})
public @interface InspectableProperty
{
  int attributeId() default 0;
  
  EnumEntry[] enumMapping() default {};
  
  FlagEntry[] flagMapping() default {};
  
  boolean hasAttributeId() default true;
  
  String name() default "";
  
  ValueType valueType() default ValueType.INFERRED;
  
  @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
  @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.ANNOTATION_TYPE})
  @Metadata(d1={"\000\030\n\002\030\002\n\002\020\033\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\003\b\002\030\0002\0020\001B\020\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\006R\017\020\004\032\0020\005¢\006\006\032\004\b\004\020\007¨\006\b"}, d2={"Landroidx/annotation/InspectableProperty$EnumEntry;", "", "name", "", "value", "", "()Ljava/lang/String;", "()I", "annotation"}, k=1, mv={1, 7, 1}, xi=48)
  @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
  @kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS, kotlin.annotation.AnnotationTarget.CLASS})
  public static @interface EnumEntry
  {
    String name();
    
    int value();
  }
  
  @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
  @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.ANNOTATION_TYPE})
  @Metadata(d1={"\000\030\n\002\030\002\n\002\020\033\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\004\b\002\030\0002\0020\001B\032\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\005R\017\020\006\032\0020\005¢\006\006\032\004\b\006\020\007R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\bR\017\020\004\032\0020\005¢\006\006\032\004\b\004\020\007¨\006\t"}, d2={"Landroidx/annotation/InspectableProperty$FlagEntry;", "", "name", "", "target", "", "mask", "()I", "()Ljava/lang/String;", "annotation"}, k=1, mv={1, 7, 1}, xi=48)
  @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
  @kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS, kotlin.annotation.AnnotationTarget.CLASS})
  public static @interface FlagEntry
  {
    int mask() default 0;
    
    String name();
    
    int target();
  }
  
  @Metadata(d1={"\000\f\n\002\030\002\n\002\020\020\n\002\b\t\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005j\002\b\006j\002\b\007j\002\b\bj\002\b\t¨\006\n"}, d2={"Landroidx/annotation/InspectableProperty$ValueType;", "", "(Ljava/lang/String;I)V", "NONE", "INFERRED", "INT_ENUM", "INT_FLAG", "COLOR", "GRAVITY", "RESOURCE_ID", "annotation"}, k=1, mv={1, 7, 1}, xi=48)
  public static enum ValueType
  {
    static
    {
      INFERRED = new ValueType("INFERRED", 1);
      INT_ENUM = new ValueType("INT_ENUM", 2);
      INT_FLAG = new ValueType("INT_FLAG", 3);
      COLOR = new ValueType("COLOR", 4);
      GRAVITY = new ValueType("GRAVITY", 5);
      RESOURCE_ID = new ValueType("RESOURCE_ID", 6);
    }
    
    private ValueType() {}
  }
}

/* Location:
 * Qualified Name:     androidx.annotation.InspectableProperty
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */