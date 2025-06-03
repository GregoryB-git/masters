.class public final Lcom/google/android/gms/internal/auth-api/zbas;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final zba:Lj6/d;

.field public static final zbb:Lj6/d;

.field public static final zbc:Lj6/d;

.field public static final zbd:Lj6/d;

.field public static final zbe:Lj6/d;

.field public static final zbf:Lj6/d;

.field public static final zbg:Lj6/d;

.field public static final zbh:Lj6/d;

.field public static final zbi:[Lj6/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    new-instance v0, Lj6/d;

    const-string v1, "auth_api_credentials_begin_sign_in"

    const-wide/16 v2, 0x8

    invoke-direct {v0, v1, v2, v3}, Lj6/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lcom/google/android/gms/internal/auth-api/zbas;->zba:Lj6/d;

    new-instance v1, Lj6/d;

    const-string v2, "auth_api_credentials_sign_out"

    const-wide/16 v3, 0x2

    invoke-direct {v1, v2, v3, v4}, Lj6/d;-><init>(Ljava/lang/String;J)V

    sput-object v1, Lcom/google/android/gms/internal/auth-api/zbas;->zbb:Lj6/d;

    new-instance v2, Lj6/d;

    const-string v3, "auth_api_credentials_authorize"

    const-wide/16 v4, 0x1

    invoke-direct {v2, v3, v4, v5}, Lj6/d;-><init>(Ljava/lang/String;J)V

    sput-object v2, Lcom/google/android/gms/internal/auth-api/zbas;->zbc:Lj6/d;

    new-instance v3, Lj6/d;

    const-string v6, "auth_api_credentials_revoke_access"

    invoke-direct {v3, v6, v4, v5}, Lj6/d;-><init>(Ljava/lang/String;J)V

    sput-object v3, Lcom/google/android/gms/internal/auth-api/zbas;->zbd:Lj6/d;

    new-instance v4, Lj6/d;

    const-string v5, "auth_api_credentials_save_password"

    const-wide/16 v6, 0x4

    invoke-direct {v4, v5, v6, v7}, Lj6/d;-><init>(Ljava/lang/String;J)V

    sput-object v4, Lcom/google/android/gms/internal/auth-api/zbas;->zbe:Lj6/d;

    new-instance v5, Lj6/d;

    const-string v6, "auth_api_credentials_get_sign_in_intent"

    const-wide/16 v7, 0x6

    invoke-direct {v5, v6, v7, v8}, Lj6/d;-><init>(Ljava/lang/String;J)V

    sput-object v5, Lcom/google/android/gms/internal/auth-api/zbas;->zbf:Lj6/d;

    new-instance v6, Lj6/d;

    const-string v7, "auth_api_credentials_save_account_linking_token"

    const-wide/16 v8, 0x3

    invoke-direct {v6, v7, v8, v9}, Lj6/d;-><init>(Ljava/lang/String;J)V

    sput-object v6, Lcom/google/android/gms/internal/auth-api/zbas;->zbg:Lj6/d;

    new-instance v7, Lj6/d;

    const-string v10, "auth_api_credentials_get_phone_number_hint_intent"

    invoke-direct {v7, v10, v8, v9}, Lj6/d;-><init>(Ljava/lang/String;J)V

    sput-object v7, Lcom/google/android/gms/internal/auth-api/zbas;->zbh:Lj6/d;

    const/16 v8, 0x8

    new-array v8, v8, [Lj6/d;

    const/4 v9, 0x0

    aput-object v0, v8, v9

    const/4 v0, 0x1

    aput-object v1, v8, v0

    const/4 v0, 0x2

    aput-object v2, v8, v0

    const/4 v0, 0x3

    aput-object v3, v8, v0

    const/4 v0, 0x4

    aput-object v4, v8, v0

    const/4 v0, 0x5

    aput-object v5, v8, v0

    const/4 v0, 0x6

    aput-object v6, v8, v0

    const/4 v0, 0x7

    aput-object v7, v8, v0

    sput-object v8, Lcom/google/android/gms/internal/auth-api/zbas;->zbi:[Lj6/d;

    return-void
.end method
