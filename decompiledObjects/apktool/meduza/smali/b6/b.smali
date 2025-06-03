.class public final Lb6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lk6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk6/a<",
            "Lb6/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk6/a$g;

    invoke-direct {v0}, Lk6/a$g;-><init>()V

    new-instance v1, Lb6/h;

    invoke-direct {v1}, Lb6/h;-><init>()V

    new-instance v2, Lk6/a;

    const-string v3, "Auth.PROXY_API"

    invoke-direct {v2, v3, v1, v0}, Lk6/a;-><init>(Ljava/lang/String;Lk6/a$a;Lk6/a$g;)V

    sput-object v2, Lb6/b;->a:Lk6/a;

    new-instance v0, Lcom/google/android/gms/internal/auth/zzbt;

    invoke-direct {v0}, Lcom/google/android/gms/internal/auth/zzbt;-><init>()V

    return-void
.end method
