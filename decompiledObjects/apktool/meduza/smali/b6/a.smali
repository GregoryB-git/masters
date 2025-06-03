.class public final Lb6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lk6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk6/a<",
            "Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk6/a$g;

    invoke-direct {v0}, Lk6/a$g;-><init>()V

    new-instance v0, Lk6/a$g;

    invoke-direct {v0}, Lk6/a$g;-><init>()V

    new-instance v1, Lb6/d;

    invoke-direct {v1}, Lb6/d;-><init>()V

    new-instance v1, Lb6/e;

    invoke-direct {v1}, Lb6/e;-><init>()V

    sget-object v2, Lb6/b;->a:Lk6/a;

    new-instance v2, Lk6/a;

    const-string v3, "Auth.GOOGLE_SIGN_IN_API"

    invoke-direct {v2, v3, v1, v0}, Lk6/a;-><init>(Ljava/lang/String;Lk6/a$a;Lk6/a$g;)V

    sput-object v2, Lb6/a;->a:Lk6/a;

    new-instance v0, Lcom/google/android/gms/internal/auth-api/zbd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/auth-api/zbd;-><init>()V

    return-void
.end method
