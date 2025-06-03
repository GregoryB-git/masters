.class public Lv3/a1;
.super Ljava/io/IOException;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Exception;ZI)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-boolean p3, p0, Lv3/a1;->a:Z

    iput p4, p0, Lv3/a1;->b:I

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/RuntimeException;)Lv3/a1;
    .locals 2

    new-instance v0, Lv3/a1;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1, v1}, Lv3/a1;-><init>(Ljava/lang/String;Ljava/lang/Exception;ZI)V

    return-object v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/Exception;)Lv3/a1;
    .locals 3

    new-instance v0, Lv3/a1;

    const/4 v1, 0x1

    const/4 v2, 0x4

    invoke-direct {v0, p0, p1, v1, v2}, Lv3/a1;-><init>(Ljava/lang/String;Ljava/lang/Exception;ZI)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;)Lv3/a1;
    .locals 4

    new-instance v0, Lv3/a1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, p0, v1, v2, v3}, Lv3/a1;-><init>(Ljava/lang/String;Ljava/lang/Exception;ZI)V

    return-object v0
.end method
