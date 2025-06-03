package c8;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import g;
import java.util.Arrays;
import java.util.List;

public final class p
{
  public static Status a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return new Status(17499, null, null, null);
    }
    paramString = paramString.split(":", 2);
    paramString[0] = paramString[0].trim();
    if (paramString.length > 1)
    {
      Object localObject = paramString[1];
      if (localObject != null) {
        paramString[1] = ((String)localObject).trim();
      }
    }
    paramString = Arrays.asList(paramString);
    if (paramString.size() > 1) {
      return b((String)paramString.get(0), (String)paramString.get(1));
    }
    return b((String)paramString.get(0), null);
  }
  
  public static Status b(String paramString1, String paramString2)
  {
    paramString1.getClass();
    int i = paramString1.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 2082564316: 
      if (paramString1.equals("UNSUPPORTED_TENANT_OPERATION")) {
        j = 81;
      }
      break;
    case 2063209097: 
      if (paramString1.equals("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
        j = 80;
      }
      break;
    case 1898790704: 
      if (paramString1.equals("MISSING_SESSION_INFO")) {
        j = 79;
      }
      break;
    case 1803454477: 
      if (paramString1.equals("MISSING_CONTINUE_URI")) {
        j = 78;
      }
      break;
    case 1497901284: 
      if (paramString1.equals("TOO_MANY_ATTEMPTS_TRY_LATER")) {
        j = 77;
      }
      break;
    case 1494923453: 
      if (paramString1.equals("INVALID_APP_CREDENTIAL")) {
        j = 76;
      }
      break;
    case 1442968770: 
      if (paramString1.equals("INVALID_PHONE_NUMBER")) {
        j = 75;
      }
      break;
    case 1433767024: 
      if (paramString1.equals("USER_DISABLED")) {
        j = 74;
      }
      break;
    case 1388786705: 
      if (paramString1.equals("INVALID_IDENTIFIER")) {
        j = 73;
      }
      break;
    case 1308491624: 
      if (paramString1.equals("MISSING_RECAPTCHA_TOKEN")) {
        j = 72;
      }
      break;
    case 1226505451: 
      if (paramString1.equals("FEDERATED_USER_ID_ALREADY_LINKED")) {
        j = 71;
      }
      break;
    case 1199811910: 
      if (paramString1.equals("MISSING_CODE")) {
        j = 70;
      }
      break;
    case 1141576252: 
      if (paramString1.equals("SESSION_EXPIRED")) {
        j = 69;
      }
      break;
    case 1113992697: 
      if (paramString1.equals("INVALID_RECAPTCHA_TOKEN")) {
        j = 68;
      }
      break;
    case 1107081238: 
      if (paramString1.equals("<<Network Error>>")) {
        j = 67;
      }
      break;
    case 1094975491: 
      if (paramString1.equals("INVALID_PASSWORD")) {
        j = 66;
      }
      break;
    case 1072360691: 
      if (paramString1.equals("INVALID_CUSTOM_TOKEN")) {
        j = 65;
      }
      break;
    case 1034932393: 
      if (paramString1.equals("INVALID_PENDING_TOKEN")) {
        j = 64;
      }
      break;
    case 989000548: 
      if (paramString1.equals("RESET_PASSWORD_EXCEED_LIMIT")) {
        j = 63;
      }
      break;
    case 922685102: 
      if (paramString1.equals("INVALID_MESSAGE_PAYLOAD")) {
        j = 62;
      }
      break;
    case 895302372: 
      if (paramString1.equals("MISSING_CLIENT_IDENTIFIER")) {
        j = 61;
      }
      break;
    case 886186878: 
      if (paramString1.equals("REQUIRES_SECOND_FACTOR_AUTH")) {
        j = 60;
      }
      break;
    case 844240628: 
      if (paramString1.equals("WEB_CONTEXT_CANCELED")) {
        j = 59;
      }
      break;
    case 819646646: 
      if (paramString1.equals("CREDENTIAL_MISMATCH")) {
        j = 58;
      }
      break;
    case 799258561: 
      if (paramString1.equals("INVALID_PROVIDER_ID")) {
        j = 57;
      }
      break;
    case 786916712: 
      if (paramString1.equals("INVALID_VERIFICATION_PROOF")) {
        j = 56;
      }
      break;
    case 745638750: 
      if (paramString1.equals("INVALID_MFA_PENDING_CREDENTIAL")) {
        j = 55;
      }
      break;
    case 605031096: 
      if (paramString1.equals("REJECTED_CREDENTIAL")) {
        j = 54;
      }
      break;
    case 582457886: 
      if (paramString1.equals("UNVERIFIED_EMAIL")) {
        j = 53;
      }
      break;
    case 542728406: 
      if (paramString1.equals("PASSWORD_LOGIN_DISABLED")) {
        j = 52;
      }
      break;
    case 530628231: 
      if (paramString1.equals("MISSING_RECAPTCHA_VERSION")) {
        j = 51;
      }
      break;
    case 492515765: 
      if (paramString1.equals("MISSING_CLIENT_TYPE")) {
        j = 50;
      }
      break;
    case 492072102: 
      if (paramString1.equals("WEB_STORAGE_UNSUPPORTED")) {
        j = 49;
      }
      break;
    case 491979549: 
      if (paramString1.equals("INVALID_ID_TOKEN")) {
        j = 48;
      }
      break;
    case 483847807: 
      if (paramString1.equals("EMAIL_EXISTS")) {
        j = 47;
      }
      break;
    case 429251986: 
      if (paramString1.equals("UNSUPPORTED_PASSTHROUGH_OPERATION")) {
        j = 46;
      }
      break;
    case 423563023: 
      if (paramString1.equals("MISSING_MFA_PENDING_CREDENTIAL")) {
        j = 45;
      }
      break;
    case 408411681: 
      if (paramString1.equals("INVALID_DYNAMIC_LINK_DOMAIN")) {
        j = 44;
      }
      break;
    case 278802867: 
      if (paramString1.equals("MISSING_PHONE_NUMBER")) {
        j = 43;
      }
      break;
    case 269327773: 
      if (paramString1.equals("INVALID_SENDER")) {
        j = 42;
      }
      break;
    case 210308040: 
      if (paramString1.equals("UNSUPPORTED_FIRST_FACTOR")) {
        j = 41;
      }
      break;
    case 15352275: 
      if (paramString1.equals("EMAIL_NOT_FOUND")) {
        j = 40;
      }
      break;
    case -40686718: 
      if (paramString1.equals("WEAK_PASSWORD")) {
        j = 39;
      }
      break;
    case -52772551: 
      if (paramString1.equals("CAPTCHA_CHECK_FAILED")) {
        j = 38;
      }
      break;
    case -75433118: 
      if (paramString1.equals("USER_NOT_FOUND")) {
        j = 37;
      }
      break;
    case -122667194: 
      if (paramString1.equals("MISSING_MFA_ENROLLMENT_ID")) {
        j = 36;
      }
      break;
    case -217128228: 
      if (paramString1.equals("SECOND_FACTOR_LIMIT_EXCEEDED")) {
        j = 35;
      }
      break;
    case -294485423: 
      if (paramString1.equals("WEB_INTERNAL_ERROR")) {
        j = 34;
      }
      break;
    case -333672188: 
      if (paramString1.equals("OPERATION_NOT_ALLOWED")) {
        j = 33;
      }
      break;
    case -380728810: 
      if (paramString1.equals("INVALID_RECAPTCHA_ACTION")) {
        j = 32;
      }
      break;
    case -406804866: 
      if (paramString1.equals("INVALID_LOGIN_CREDENTIALS")) {
        j = 31;
      }
      break;
    case -505579581: 
      if (paramString1.equals("INVALID_REQ_TYPE")) {
        j = 30;
      }
      break;
    case -595928767: 
      if (paramString1.equals("TIMEOUT")) {
        j = 29;
      }
      break;
    case -646022241: 
      if (paramString1.equals("CREDENTIAL_TOO_OLD_LOGIN_AGAIN")) {
        j = 28;
      }
      break;
    case -736207500: 
      if (paramString1.equals("MISSING_PASSWORD")) {
        j = 27;
      }
      break;
    case -749743758: 
      if (paramString1.equals("MFA_ENROLLMENT_NOT_FOUND")) {
        j = 26;
      }
      break;
    case -828507413: 
      if (paramString1.equals("NO_SUCH_PROVIDER")) {
        j = 25;
      }
      break;
    case -863830559: 
      if (paramString1.equals("INVALID_CERT_HASH")) {
        j = 24;
      }
      break;
    case -974503964: 
      if (paramString1.equals("MISSING_OR_INVALID_NONCE")) {
        j = 23;
      }
      break;
    case -1063710844: 
      if (paramString1.equals("ADMIN_ONLY_OPERATION")) {
        j = 22;
      }
      break;
    case -1112393964: 
      if (paramString1.equals("INVALID_EMAIL")) {
        j = 21;
      }
      break;
    case -1202691903: 
      if (paramString1.equals("SECOND_FACTOR_EXISTS")) {
        j = 20;
      }
      break;
    case -1232010689: 
      if (paramString1.equals("INVALID_SESSION_INFO")) {
        j = 19;
      }
      break;
    case -1242922234: 
      if (paramString1.equals("ALTERNATE_CLIENT_IDENTIFIER_REQUIRED")) {
        j = 18;
      }
      break;
    case -1340100504: 
      if (paramString1.equals("INVALID_TENANT_ID")) {
        j = 17;
      }
      break;
    case -1345867105: 
      if (paramString1.equals("TOKEN_EXPIRED")) {
        j = 16;
      }
      break;
    case -1368998244: 
      if (paramString1.equals("INVALID_HOSTING_LINK_DOMAIN")) {
        j = 15;
      }
      break;
    case -1421414571: 
      if (paramString1.equals("INVALID_CODE")) {
        j = 14;
      }
      break;
    case -1458751677: 
      if (paramString1.equals("MISSING_EMAIL")) {
        j = 13;
      }
      break;
    case -1583894766: 
      if (paramString1.equals("INVALID_OOB_CODE")) {
        j = 12;
      }
      break;
    case -1584641425: 
      if (paramString1.equals("UNAUTHORIZED_DOMAIN")) {
        j = 11;
      }
      break;
    case -1587614300: 
      if (paramString1.equals("EXPIRED_OOB_CODE")) {
        j = 10;
      }
      break;
    case -1603818979: 
      if (paramString1.equals("RECAPTCHA_NOT_ENABLED")) {
        j = 9;
      }
      break;
    case -1699246888: 
      if (paramString1.equals("INVALID_RECAPTCHA_VERSION")) {
        j = 8;
      }
      break;
    case -1774756919: 
      if (paramString1.equals("WEB_NETWORK_REQUEST_FAILED")) {
        j = 7;
      }
      break;
    case -1800638118: 
      if (paramString1.equals("QUOTA_EXCEEDED")) {
        j = 6;
      }
      break;
    case -1944433728: 
      if (paramString1.equals("DYNAMIC_LINK_NOT_ACTIVATED")) {
        j = 5;
      }
      break;
    case -2001169389: 
      if (paramString1.equals("INVALID_IDP_RESPONSE")) {
        j = 4;
      }
      break;
    case -2005236790: 
      if (paramString1.equals("INTERNAL_SUCCESS_SIGN_OUT")) {
        j = 3;
      }
      break;
    case -2014808264: 
      if (paramString1.equals("WEB_CONTEXT_ALREADY_PRESENTED")) {
        j = 2;
      }
      break;
    case -2065866930: 
      if (paramString1.equals("INVALID_RECIPIENT_EMAIL")) {
        j = 1;
      }
      break;
    case -2130504259: 
      if (paramString1.equals("USER_CANCELLED")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      j = 17499;
      break;
    case 81: 
      j = 17073;
      break;
    case 80: 
      j = 17090;
      break;
    case 79: 
      j = 17045;
      break;
    case 78: 
      j = 17040;
      break;
    case 76: 
      j = 17028;
      break;
    case 75: 
      j = 17042;
      break;
    case 74: 
      j = 17005;
      break;
    case 72: 
      j = 17201;
      break;
    case 71: 
      j = 17025;
      break;
    case 70: 
      j = 17043;
      break;
    case 69: 
      j = 17051;
      break;
    case 68: 
      j = 17202;
      break;
    case 66: 
      j = 17009;
      break;
    case 65: 
      j = 17000;
      break;
    case 63: 
    case 77: 
      j = 17010;
      break;
    case 62: 
      j = 17031;
      break;
    case 61: 
      j = 17093;
      break;
    case 60: 
      j = 17078;
      break;
    case 59: 
      j = 17058;
      break;
    case 58: 
      j = 17002;
      break;
    case 57: 
      j = 17071;
      break;
    case 56: 
      j = 17049;
      break;
    case 55: 
      j = 17083;
      break;
    case 54: 
      j = 17075;
      break;
    case 53: 
      j = 17086;
      break;
    case 51: 
      j = 17205;
      break;
    case 50: 
      j = 17204;
      break;
    case 49: 
      j = 17065;
      break;
    case 48: 
      j = 17017;
      break;
    case 47: 
      j = 17007;
      break;
    case 46: 
      j = 17095;
      break;
    case 45: 
      j = 17081;
      break;
    case 44: 
      j = 17074;
      break;
    case 43: 
      j = 17041;
      break;
    case 42: 
      j = 17032;
      break;
    case 41: 
      j = 17089;
      break;
    case 39: 
      j = 17026;
      break;
    case 38: 
      j = 17056;
      break;
    case 37: 
    case 40: 
      j = 17011;
      break;
    case 36: 
      j = 17082;
      break;
    case 35: 
      j = 17088;
      break;
    case 34: 
      j = 17062;
      break;
    case 33: 
    case 52: 
      j = 17006;
      break;
    case 32: 
      j = 17203;
      break;
    case 30: 
      j = 17207;
      break;
    case 29: 
    case 67: 
      j = 17020;
      break;
    case 28: 
      j = 17014;
      break;
    case 27: 
      j = 17035;
      break;
    case 26: 
      j = 17084;
      break;
    case 25: 
      j = 17016;
      break;
    case 24: 
      j = 17064;
      break;
    case 23: 
      j = 17094;
      break;
    case 22: 
      j = 17085;
      break;
    case 21: 
    case 73: 
      j = 17008;
      break;
    case 20: 
      j = 17087;
      break;
    case 19: 
      j = 17046;
      break;
    case 18: 
      j = 18002;
      break;
    case 17: 
      j = 17079;
      break;
    case 16: 
      j = 17021;
      break;
    case 15: 
      j = 17214;
      break;
    case 14: 
      j = 17044;
      break;
    case 13: 
      j = 17034;
      break;
    case 12: 
      j = 17030;
      break;
    case 11: 
      j = 17038;
      break;
    case 10: 
      j = 17029;
      break;
    case 9: 
      j = 17200;
      break;
    case 8: 
      j = 17206;
      break;
    case 7: 
      j = 17061;
      break;
    case 6: 
      j = 17052;
      break;
    case 5: 
      j = 17068;
      break;
    case 4: 
    case 31: 
    case 64: 
      j = 17004;
      break;
    case 3: 
      j = 17091;
      break;
    case 2: 
      j = 17057;
      break;
    case 1: 
      j = 17033;
      break;
    case 0: 
      j = 18001;
    }
    if (j == 17499)
    {
      if (paramString2 != null) {
        return new Status(j, g.e(paramString1, ":", paramString2), null, null);
      }
      return new Status(j, paramString1, null, null);
    }
    return new Status(j, paramString2, null, null);
  }
}

/* Location:
 * Qualified Name:     c8.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */