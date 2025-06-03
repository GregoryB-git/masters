package androidx.profileinstaller;

import android.util.Log;

public final class c$b
  implements c.c
{
  public final void a()
  {
    Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
  }
  
  public final void b(int paramInt, Object paramObject)
  {
    String str;
    switch (paramInt)
    {
    case 9: 
    default: 
      str = "";
      break;
    case 11: 
      str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
      break;
    case 10: 
      str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
      break;
    case 8: 
      str = "RESULT_PARSE_EXCEPTION";
      break;
    case 7: 
      str = "RESULT_IO_EXCEPTION";
      break;
    case 6: 
      str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
      break;
    case 5: 
      str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
      break;
    case 4: 
      str = "RESULT_NOT_WRITABLE";
      break;
    case 3: 
      str = "RESULT_UNSUPPORTED_ART_VERSION";
      break;
    case 2: 
      str = "RESULT_ALREADY_INSTALLED";
      break;
    case 1: 
      str = "RESULT_INSTALL_SUCCESS";
    }
    if ((paramInt != 6) && (paramInt != 7) && (paramInt != 8)) {
      Log.d("ProfileInstaller", str);
    } else {
      Log.e("ProfileInstaller", str, (Throwable)paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.profileinstaller.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */