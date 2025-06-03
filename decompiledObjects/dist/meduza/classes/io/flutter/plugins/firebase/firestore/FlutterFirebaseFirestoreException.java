package io.flutter.plugins.firebase.firestore;

import com.google.firebase.firestore.f;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FlutterFirebaseFirestoreException
  extends Exception
{
  private static final String ERROR_ABORTED = "The operation was aborted, typically due to a concurrency issue like transaction aborts, etc.";
  private static final String ERROR_ALREADY_EXISTS = "Some document that we attempted to create already exists.";
  private static final String ERROR_CANCELLED = "The operation was cancelled (typically by the caller).";
  private static final String ERROR_DATA_LOSS = "Unrecoverable data loss or corruption.";
  private static final String ERROR_DEADLINE_EXCEEDED = "Deadline expired before operation could complete. For operations that change the state of the system, this error may be returned even if the operation has completed successfully. For example, a successful response from a server could have been delayed long enough for the deadline to expire.";
  private static final String ERROR_FAILED_PRECONDITION = "Operation was rejected because the system is not in a state required for the operation's execution. If performing a query, ensure it has been indexed via the Firebase console.";
  private static final String ERROR_INTERNAL = "Internal errors. Means some invariants expected by underlying system has been broken. If you see one of these errors, something is very broken.";
  private static final String ERROR_INVALID_ARGUMENT = "Client specified an invalid argument. Note that this differs from failed-precondition. invalid-argument indicates arguments that are problematic regardless of the state of the system (e.g., an invalid field name).";
  private static final String ERROR_NOT_FOUND = "Some requested document was not found.";
  private static final String ERROR_OUT_OF_RANGE = "Operation was attempted past the valid range.";
  private static final String ERROR_PERMISSION_DENIED = "The caller does not have permission to execute the specified operation.";
  private static final String ERROR_RESOURCE_EXHAUSTED = "Some resource has been exhausted, perhaps a per-user quota, or perhaps the entire file system is out of space.";
  private static final String ERROR_UNAUTHENTICATED = "The request does not have valid authentication credentials for the operation.";
  private static final String ERROR_UNAVAILABLE = "The service is currently unavailable. This is a most likely a transient condition and may be corrected by retrying with a backoff.";
  private static final String ERROR_UNIMPLEMENTED = "Operation is not implemented or not supported/enabled.";
  private static final String ERROR_UNKNOWN = "Operation is not implemented or not supported/enabled.";
  private final String code;
  private final String message;
  
  public FlutterFirebaseFirestoreException(f paramf, Throwable paramThrowable)
  {
    super(str1, paramThrowable);
    String str1 = null;
    if ((paramThrowable != null) && (paramThrowable.getMessage() != null) && (paramThrowable.getMessage().contains(":")))
    {
      paramThrowable = paramThrowable.getMessage();
      paramThrowable = Pattern.compile("([A-Z_]{3,25}):\\s(.*)").matcher(paramThrowable);
      if (paramThrowable.find())
      {
        String str2 = paramThrowable.group(1).trim();
        paramThrowable = paramThrowable.group(2).trim();
        str2.getClass();
        switch (str2.hashCode())
        {
        }
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          do
                          {
                            do
                            {
                              do
                              {
                                do
                                {
                                  do
                                  {
                                    do
                                    {
                                      do
                                      {
                                        i = -1;
                                        break;
                                      } while (!str2.equals("UNIMPLEMENTED"));
                                      i = 15;
                                      break;
                                    } while (!str2.equals("ALREADY_EXISTS"));
                                    i = 14;
                                    break;
                                  } while (!str2.equals("UNAVAILABLE"));
                                  i = 13;
                                  break;
                                } while (!str2.equals("INTERNAL"));
                                i = 12;
                                break;
                              } while (!str2.equals("NOT_FOUND"));
                              i = 11;
                              break;
                            } while (!str2.equals("FAILED_PRECONDITION"));
                            i = 10;
                            break;
                          } while (!str2.equals("OUT_OF_RANGE"));
                          i = 9;
                          break;
                        } while (!str2.equals("UNKNOWN"));
                        i = 8;
                        break;
                      } while (!str2.equals("DEADLINE_EXCEEDED"));
                      i = 7;
                      break;
                    } while (!str2.equals("ABORTED"));
                    i = 6;
                    break;
                  } while (!str2.equals("UNAUTHENTICATED"));
                  i = 5;
                  break;
                } while (!str2.equals("RESOURCE_EXHAUSTED"));
                i = 4;
                break;
              } while (!str2.equals("CANCELLED"));
              i = 3;
              break;
            } while (!str2.equals("PERMISSION_DENIED"));
            i = 2;
            break;
          } while (!str2.equals("INVALID_ARGUMENT"));
          i = 1;
          break;
        } while (!str2.equals("DATA_LOSS"));
        int i = 0;
        switch (i)
        {
        default: 
          break;
        case 15: 
          paramThrowable = "Operation is not implemented or not supported/enabled.";
          str1 = "unimplemented";
          break;
        case 14: 
          paramThrowable = "Some document that we attempted to create already exists.";
          str1 = "already-exists";
          break;
        case 13: 
          paramThrowable = "The service is currently unavailable. This is a most likely a transient condition and may be corrected by retrying with a backoff.";
          str1 = "unavailable";
          break;
        case 12: 
          paramThrowable = "Internal errors. Means some invariants expected by underlying system has been broken. If you see one of these errors, something is very broken.";
          str1 = "internal";
          break;
        case 11: 
          paramThrowable = "Some requested document was not found.";
          str1 = "not-found";
          break;
        case 10: 
          boolean bool = paramThrowable.contains("index");
          str1 = "failed-precondition";
          if (bool) {
            break label797;
          }
          paramThrowable = "Operation was rejected because the system is not in a state required for the operation's execution. If performing a query, ensure it has been indexed via the Firebase console.";
          break;
        case 9: 
          paramThrowable = "Operation was attempted past the valid range.";
          str1 = "out-of-range";
          break;
        case 8: 
          str1 = "unknown";
          paramThrowable = "Operation is not implemented or not supported/enabled.";
          break;
        case 7: 
          paramThrowable = "Deadline expired before operation could complete. For operations that change the state of the system, this error may be returned even if the operation has completed successfully. For example, a successful response from a server could have been delayed long enough for the deadline to expire.";
          str1 = "deadline-exceeded";
          break;
        case 6: 
          paramThrowable = "The operation was aborted, typically due to a concurrency issue like transaction aborts, etc.";
          str1 = "aborted";
          break;
        case 5: 
          paramThrowable = "The request does not have valid authentication credentials for the operation.";
          str1 = "unauthenticated";
          break;
        case 4: 
          paramThrowable = "Some resource has been exhausted, perhaps a per-user quota, or perhaps the entire file system is out of space.";
          str1 = "resource-exhausted";
          break;
        case 3: 
          paramThrowable = "The operation was cancelled (typically by the caller).";
          str1 = "cancelled";
          break;
        case 2: 
          paramThrowable = "The caller does not have permission to execute the specified operation.";
          str1 = "permission-denied";
          break;
        case 1: 
          paramThrowable = "Client specified an invalid argument. Note that this differs from failed-precondition. invalid-argument indicates arguments that are problematic regardless of the state of the system (e.g., an invalid field name).";
          str1 = "invalid-argument";
          break;
        case 0: 
          paramThrowable = "Unrecoverable data loss or corruption.";
          str1 = "data-loss";
          break;
        }
      }
    }
    paramThrowable = null;
    label797:
    if ((str1 == null) && (paramf != null))
    {
      switch (1.$SwitchMap$com$google$firebase$firestore$FirebaseFirestoreException$Code[a.ordinal()])
      {
      default: 
        paramf = "An unknown error occurred";
        break;
      case 16: 
        paramf = "Unknown error or an error from a different error domain.";
        paramThrowable = "unknown";
        break;
      case 15: 
        paramf = "Operation is not implemented or not supported/enabled.";
        paramThrowable = "unimplemented";
        break;
      case 14: 
        paramf = "The service is currently unavailable. This is a most likely a transient condition and may be corrected by retrying with a backoff.";
        paramThrowable = "unavailable";
        break;
      case 13: 
        paramf = "The request does not have valid authentication credentials for the operation.";
        paramThrowable = "unauthenticated";
        break;
      case 12: 
        paramf = "Some resource has been exhausted, perhaps a per-user quota, or perhaps the entire file system is out of space.";
        paramThrowable = "resource-exhausted";
        break;
      case 11: 
        paramf = "The caller does not have permission to execute the specified operation.";
        paramThrowable = "permission-denied";
        break;
      case 10: 
        paramf = "Operation was attempted past the valid range.";
        paramThrowable = "out-of-range";
        break;
      case 9: 
        paramf = "Some requested document was not found.";
        paramThrowable = "not-found";
        break;
      case 8: 
        paramf = "Client specified an invalid argument. Note that this differs from failed-precondition. invalid-argument indicates arguments that are problematic regardless of the state of the system (e.g., an invalid field name).";
        paramThrowable = "invalid-argument";
        break;
      case 7: 
        paramf = "Internal errors. Means some invariants expected by underlying system has been broken. If you see one of these errors, something is very broken.";
        paramThrowable = "internal";
        break;
      case 6: 
        if (((paramf.getMessage() != null) && (paramf.getMessage().contains("query requires an index"))) || (paramf.getMessage().contains("ensure it has been indexed")))
        {
          paramf = paramf.getMessage();
          paramThrowable = "failed-precondition";
        }
        else
        {
          paramThrowable = "failed-precondition";
          paramf = "Operation was rejected because the system is not in a state required for the operation's execution. If performing a query, ensure it has been indexed via the Firebase console.";
        }
        break;
      case 5: 
        paramf = "Deadline expired before operation could complete. For operations that change the state of the system, this error may be returned even if the operation has completed successfully. For example, a successful response from a server could have been delayed long enough for the deadline to expire.";
        paramThrowable = "deadline-exceeded";
        break;
      case 4: 
        paramf = "Unrecoverable data loss or corruption.";
        paramThrowable = "data-loss";
        break;
      case 3: 
        paramf = "The operation was cancelled (typically by the caller).";
        paramThrowable = "cancelled";
        break;
      case 2: 
        paramf = "Some document that we attempted to create already exists.";
        paramThrowable = "already-exists";
        break;
      }
      paramf = "The operation was aborted, typically due to a concurrency issue like transaction aborts, etc.";
      paramThrowable = "aborted";
    }
    else
    {
      paramf = paramThrowable;
      paramThrowable = str1;
    }
    code = paramThrowable;
    message = paramf;
  }
  
  public String getCode()
  {
    return code;
  }
  
  public String getMessage()
  {
    return message;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestoreException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */