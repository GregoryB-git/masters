package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z2;

@Metadata(d1={"\000*\n\000\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\020\021\n\002\020\000\n\002\b\002\0326\020\004\032\n\022\004\022\002H\006\030\0010\005\"\004\b\000\020\0062\f\020\007\032\b\022\004\022\002H\0060\0022\020\020\b\032\f\022\b\022\006\022\002\b\0030\0020\001H\000\032I\020\t\032\002H\006\"\n\b\000\020\006*\004\030\0010\n2\f\020\007\032\b\022\004\022\002H\0060\0022\f\020\013\032\b\022\004\022\002H\0060\0052\022\020\f\032\n\022\006\b\001\022\0020\0160\r\"\0020\016H\000¢\006\002\020\017\"\030\020\000\032\f\022\b\022\006\022\002\b\0030\0020\001X\004¢\006\002\n\000\"\030\020\003\032\f\022\b\022\006\022\002\b\0030\0020\001X\004¢\006\002\n\000¨\006\020"}, d2={"ANDROID_VIEWMODEL_SIGNATURE", "", "Ljava/lang/Class;", "VIEWMODEL_SIGNATURE", "findMatchingConstructor", "Ljava/lang/reflect/Constructor;", "T", "modelClass", "signature", "newInstance", "Landroidx/lifecycle/ViewModel;", "constructor", "params", "", "", "(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel-savedstate_release"}, k=2, mv={1, 6, 0}, xi=48)
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
public final class SavedStateViewModelFactoryKt
{
  @NotNull
  private static final List<Class<?>> ANDROID_VIEWMODEL_SIGNATURE = CollectionsKt.listOf(new Class[] { Application.class, SavedStateHandle.class });
  @NotNull
  private static final List<Class<?>> VIEWMODEL_SIGNATURE = CollectionsKt.listOf(SavedStateHandle.class);
  
  @Nullable
  public static final <T> Constructor<T> findMatchingConstructor(@NotNull Class<T> paramClass, @NotNull List<? extends Class<?>> paramList)
  {
    Intrinsics.checkNotNullParameter(paramClass, "modelClass");
    Intrinsics.checkNotNullParameter(paramList, "signature");
    Object localObject1 = paramClass.getConstructors();
    Intrinsics.checkNotNullExpressionValue(localObject1, "modelClass.constructors");
    int i = localObject1.length;
    for (int j = 0; j < i; j++)
    {
      Constructor<T> localConstructor = localObject1[j];
      Object localObject2 = localConstructor.getParameterTypes();
      Intrinsics.checkNotNullExpressionValue(localObject2, "constructor.parameterTypes");
      localObject2 = ArraysKt.toList((Object[])localObject2);
      if (Intrinsics.areEqual(paramList, localObject2)) {
        return localConstructor;
      }
      if ((paramList.size() == ((List)localObject2).size()) && (((List)localObject2).containsAll(paramList)))
      {
        localObject1 = z2.t("Class ");
        ((StringBuilder)localObject1).append(paramClass.getSimpleName());
        ((StringBuilder)localObject1).append(" must have parameters in the proper order: ");
        ((StringBuilder)localObject1).append(paramList);
        throw new UnsupportedOperationException(((StringBuilder)localObject1).toString());
      }
    }
    return null;
  }
  
  public static final <T extends ViewModel> T newInstance(@NotNull Class<T> paramClass, @NotNull Constructor<T> paramConstructor, @NotNull Object... paramVarArgs)
  {
    Intrinsics.checkNotNullParameter(paramClass, "modelClass");
    Intrinsics.checkNotNullParameter(paramConstructor, "constructor");
    Intrinsics.checkNotNullParameter(paramVarArgs, "params");
    try
    {
      paramConstructor = (ViewModel)paramConstructor.newInstance(Arrays.copyOf(paramVarArgs, paramVarArgs.length));
      return paramConstructor;
    }
    catch (InvocationTargetException paramVarArgs)
    {
      paramConstructor = new StringBuilder();
      paramConstructor.append("An exception happened in constructor of ");
      paramConstructor.append(paramClass);
      throw new RuntimeException(paramConstructor.toString(), paramVarArgs.getCause());
    }
    catch (InstantiationException paramVarArgs)
    {
      paramConstructor = new StringBuilder();
      paramConstructor.append("A ");
      paramConstructor.append(paramClass);
      paramConstructor.append(" cannot be instantiated.");
      throw new RuntimeException(paramConstructor.toString(), paramVarArgs);
    }
    catch (IllegalAccessException paramConstructor)
    {
      paramVarArgs = new StringBuilder();
      paramVarArgs.append("Failed to access ");
      paramVarArgs.append(paramClass);
      throw new RuntimeException(paramVarArgs.toString(), paramConstructor);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.SavedStateViewModelFactoryKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */