package com.facebook.appevents.codeless.internal;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SensitiveUserDataUtils
{
  private static boolean isCreditCard(TextView paramTextView)
  {
    boolean bool1 = CrashShieldHandler.isObjectCrashing(SensitiveUserDataUtils.class);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      paramTextView = ViewHierarchy.getTextOfView(paramTextView).replaceAll("\\s", "");
      int i = paramTextView.length();
      bool1 = bool2;
      if (i >= 12) {
        if (i > 19)
        {
          bool1 = bool2;
        }
        else
        {
          int j = i - 1;
          int k = 0;
          int m = k;
          while (j >= 0)
          {
            i = paramTextView.charAt(j);
            if ((i >= 48) && (i <= 57))
            {
              int n = i - 48;
              i = n;
              if (m != 0)
              {
                n *= 2;
                i = n;
                if (n > 9) {
                  i = n % 10 + 1;
                }
              }
              k += i;
              m ^= 0x1;
              j--;
            }
            else
            {
              return false;
            }
          }
          bool1 = bool2;
          if (k % 10 == 0) {
            bool1 = true;
          }
        }
      }
      return bool1;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramTextView, SensitiveUserDataUtils.class);
    }
    return false;
  }
  
  private static boolean isEmail(TextView paramTextView)
  {
    if (CrashShieldHandler.isObjectCrashing(SensitiveUserDataUtils.class)) {
      return false;
    }
    try
    {
      if (paramTextView.getInputType() == 32) {
        return true;
      }
      paramTextView = ViewHierarchy.getTextOfView(paramTextView);
      if ((paramTextView != null) && (paramTextView.length() != 0))
      {
        boolean bool = Patterns.EMAIL_ADDRESS.matcher(paramTextView).matches();
        return bool;
      }
      return false;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramTextView, SensitiveUserDataUtils.class);
    }
    return false;
  }
  
  private static boolean isPassword(TextView paramTextView)
  {
    if (CrashShieldHandler.isObjectCrashing(SensitiveUserDataUtils.class)) {
      return false;
    }
    try
    {
      if (paramTextView.getInputType() == 128) {
        return true;
      }
      boolean bool = paramTextView.getTransformationMethod() instanceof PasswordTransformationMethod;
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramTextView, SensitiveUserDataUtils.class);
    }
    return false;
  }
  
  private static boolean isPersonName(TextView paramTextView)
  {
    boolean bool1 = CrashShieldHandler.isObjectCrashing(SensitiveUserDataUtils.class);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      int i = paramTextView.getInputType();
      if (i == 96) {
        bool2 = true;
      }
      return bool2;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramTextView, SensitiveUserDataUtils.class);
    }
    return false;
  }
  
  private static boolean isPhoneNumber(TextView paramTextView)
  {
    boolean bool1 = CrashShieldHandler.isObjectCrashing(SensitiveUserDataUtils.class);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      int i = paramTextView.getInputType();
      if (i == 3) {
        bool2 = true;
      }
      return bool2;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramTextView, SensitiveUserDataUtils.class);
    }
    return false;
  }
  
  private static boolean isPostalAddress(TextView paramTextView)
  {
    boolean bool1 = CrashShieldHandler.isObjectCrashing(SensitiveUserDataUtils.class);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    try
    {
      int i = paramTextView.getInputType();
      if (i == 112) {
        bool2 = true;
      }
      return bool2;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramTextView, SensitiveUserDataUtils.class);
    }
    return false;
  }
  
  public static boolean isSensitiveUserData(View paramView)
  {
    boolean bool1 = CrashShieldHandler.isObjectCrashing(SensitiveUserDataUtils.class);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    bool1 = bool2;
    try
    {
      if ((paramView instanceof TextView))
      {
        paramView = (TextView)paramView;
        if ((!isPassword(paramView)) && (!isCreditCard(paramView)) && (!isPersonName(paramView)) && (!isPostalAddress(paramView)) && (!isPhoneNumber(paramView)))
        {
          boolean bool3 = isEmail(paramView);
          bool1 = bool2;
          if (!bool3) {}
        }
        else
        {
          bool1 = true;
        }
      }
      return bool1;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, SensitiveUserDataUtils.class);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.internal.SensitiveUserDataUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */