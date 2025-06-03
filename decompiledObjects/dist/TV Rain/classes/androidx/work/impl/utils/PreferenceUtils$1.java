package androidx.work.impl.utils;

import androidx.arch.core.util.Function;

class PreferenceUtils$1
  implements Function<Long, Long>
{
  public PreferenceUtils$1(PreferenceUtils paramPreferenceUtils) {}
  
  public Long apply(Long paramLong)
  {
    long l;
    if (paramLong != null) {
      l = paramLong.longValue();
    } else {
      l = 0L;
    }
    return Long.valueOf(l);
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.PreferenceUtils.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */