package androidx.core.util;

import android.annotation.SuppressLint;
import i2;
import java.util.Objects;
import u3;
import v3;

@SuppressLint({"UnknownNullness"})
public abstract interface Predicate<T>
{
  @SuppressLint({"MissingNullability"})
  public static <T> Predicate<T> isEqual(@SuppressLint({"MissingNullability"}) Object paramObject)
  {
    if (paramObject == null) {
      paramObject = new i2(11);
    } else {
      paramObject = new v3(paramObject, 0);
    }
    return (Predicate<T>)paramObject;
  }
  
  @SuppressLint({"MissingNullability"})
  public static <T> Predicate<T> not(@SuppressLint({"MissingNullability"}) Predicate<? super T> paramPredicate)
  {
    Objects.requireNonNull(paramPredicate);
    return paramPredicate.negate();
  }
  
  @SuppressLint({"MissingNullability"})
  public Predicate<T> and(@SuppressLint({"MissingNullability"}) Predicate<? super T> paramPredicate)
  {
    Objects.requireNonNull(paramPredicate);
    return new u3(this, paramPredicate, 1);
  }
  
  @SuppressLint({"MissingNullability"})
  public Predicate<T> negate()
  {
    return new v3(this, 1);
  }
  
  @SuppressLint({"MissingNullability"})
  public Predicate<T> or(@SuppressLint({"MissingNullability"}) Predicate<? super T> paramPredicate)
  {
    Objects.requireNonNull(paramPredicate);
    return new u3(this, paramPredicate, 0);
  }
  
  public abstract boolean test(T paramT);
}

/* Location:
 * Qualified Name:     androidx.core.util.Predicate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */