package androidx.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.MustBeDocumented;

@Documented
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.ANNOTATION_TYPE})
@Metadata(d1={"\000 \n\002\030\002\n\002\020\033\n\000\n\002\020\016\n\000\n\002\020\021\n\002\b\002\n\002\020\013\n\002\b\006\b\002\030\0002\0020\001:\002\f\rB4\022\b\b\002\020\002\032\0020\003\022\016\b\002\020\004\032\b\022\004\022\0020\0030\005\022\016\b\002\020\006\032\b\022\004\022\0020\0030\005\022\b\b\002\020\007\032\0020\bR\025\020\004\032\b\022\004\022\0020\0030\005¢\006\006\032\004\b\004\020\tR\025\020\006\032\b\022\004\022\0020\0030\005¢\006\006\032\004\b\006\020\tR\017\020\007\032\0020\b¢\006\006\032\004\b\007\020\nR\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\013¨\006\016"}, d2={"Landroidx/annotation/RequiresPermission;", "", "value", "", "allOf", "", "anyOf", "conditional", "", "()[Ljava/lang/String;", "()Z", "()Ljava/lang/String;", "Read", "Write", "annotation"}, k=1, mv={1, 7, 1}, xi=48)
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER, kotlin.annotation.AnnotationTarget.CONSTRUCTOR, kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER})
public @interface RequiresPermission
{
  String[] allOf() default {};
  
  String[] anyOf() default {};
  
  boolean conditional() default false;
  
  String value() default "";
  
  @java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
  @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER})
  @Metadata(d1={"\000\022\n\002\030\002\n\002\020\033\n\000\n\002\030\002\n\002\b\002\b\002\030\0002\0020\001B\n\022\b\b\002\020\002\032\0020\003R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\004¨\006\005"}, d2={"Landroidx/annotation/RequiresPermission$Read;", "", "value", "Landroidx/annotation/RequiresPermission;", "()Landroidx/annotation/RequiresPermission;", "annotation"}, k=1, mv={1, 7, 1}, xi=48)
  @kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER})
  public static @interface Read
  {
    RequiresPermission value() default @RequiresPermission;
  }
  
  @java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
  @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER})
  @Metadata(d1={"\000\022\n\002\030\002\n\002\020\033\n\000\n\002\030\002\n\002\b\002\b\002\030\0002\0020\001B\n\022\b\b\002\020\002\032\0020\003R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\004¨\006\005"}, d2={"Landroidx/annotation/RequiresPermission$Write;", "", "value", "Landroidx/annotation/RequiresPermission;", "()Landroidx/annotation/RequiresPermission;", "annotation"}, k=1, mv={1, 7, 1}, xi=48)
  @kotlin.annotation.Target(allowedTargets={kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER})
  public static @interface Write
  {
    RequiresPermission value() default @RequiresPermission;
  }
}

/* Location:
 * Qualified Name:     androidx.annotation.RequiresPermission
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */