.class public Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$FlutterError;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$GenerateInterfaces;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$GenerateInterfacesCodec;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorTotpSecretHostApi;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorTotpHostApi;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorTotpHostApiCodec;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactoResolverHostApi;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactoResolverHostApiCodec;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorUserHostApi;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$MultiFactorUserHostApiCodec;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$FirebaseAuthUserHostApi;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$FirebaseAuthUserHostApiCodec;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$FirebaseAuthHostApi;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$FirebaseAuthHostApiCodec;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$VoidResult;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$NullableResult;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$Result;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonTotpSecret;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonUserProfile;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonIdTokenResult;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonVerifyPhoneNumberRequest;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonSignInProvider;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonFirebaseAuthSettings;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonActionCodeSettings;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonUserCredential;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonUserDetails;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonUserInfo;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonAuthCredential;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonAdditionalUserInfo;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonActionCodeInfo;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonActionCodeInfoData;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$AuthPigeonFirebaseApp;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonMultiFactorInfo;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonPhoneMultiFactorAssertion;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$PigeonMultiFactorSession;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$ActionCodeInfoOperation;,
        Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$CanIgnoreReturnValue;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static wrapError(Ljava/lang/Throwable;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    instance-of v1, p0, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$FlutterError;

    if-eqz v1, :cond_0

    check-cast p0, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$FlutterError;

    iget-object v1, p0, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$FlutterError;->code:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p0, p0, Lio/flutter/plugins/firebase/auth/GeneratedAndroidFirebaseAuth$FlutterError;->details:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cause: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", Stacktrace: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_0
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method
