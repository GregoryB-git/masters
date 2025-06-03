.class public final Lc8/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp6/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lp6/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "GetTokenResultFactory"

    invoke-direct {v0, v2, v1}, Lp6/a;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lc8/d0;->a:Lp6/a;

    return-void
.end method

.method public static a(Ljava/lang/String;)Lb8/s;
    .locals 4

    :try_start_0
    invoke-static {p0}, Lc8/c0;->b(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/firebase-auth-api/zzzp; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lc8/d0;->a:Lp6/a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Error parsing token claims"

    invoke-virtual {v1, v3, v0, v2}, Lp6/a;->b(Ljava/lang/String;Ljava/lang/Exception;[Ljava/lang/Object;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :goto_0
    new-instance v1, Lb8/s;

    invoke-direct {v1, p0, v0}, Lb8/s;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object v1
.end method
