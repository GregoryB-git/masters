.class public Lcom/pichillilorenzo/flutter_inappwebview_android/types/SslErrorExt;
.super Landroid/net/http/SslError;
.source "SourceFile"


# direct methods
.method private constructor <init>(ILandroid/net/http/SslCertificate;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/net/http/SslError;-><init>(ILandroid/net/http/SslCertificate;Ljava/lang/String;)V

    return-void
.end method

.method public static toMap(Landroid/net/http/SslError;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/http/SslError;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/net/http/SslError;->getPrimaryError()I

    move-result p0

    if-eqz p0, :cond_6

    const/4 v1, 0x1

    if-eq p0, v1, :cond_5

    const/4 v1, 0x2

    if-eq p0, v1, :cond_4

    const/4 v1, 0x3

    if-eq p0, v1, :cond_3

    const/4 v1, 0x4

    if-eq p0, v1, :cond_2

    const/4 v1, 0x5

    if-eq p0, v1, :cond_1

    move-object v1, v0

    goto :goto_0

    :cond_1
    const-string v1, "A generic error occurred"

    goto :goto_0

    :cond_2
    const-string v1, "The date of the certificate is invalid"

    goto :goto_0

    :cond_3
    const-string v1, "The certificate authority is not trusted"

    goto :goto_0

    :cond_4
    const-string v1, "Hostname mismatch"

    goto :goto_0

    :cond_5
    const-string v1, "The certificate has expired"

    goto :goto_0

    :cond_6
    const-string v1, "The certificate is not yet valid"

    :goto_0
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    if-ltz p0, :cond_7

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_7
    const-string p0, "code"

    invoke-virtual {v2, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p0, "message"

    invoke-virtual {v2, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2
.end method
