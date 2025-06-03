.class public final Lbc/b;
.super Lbc/c;
.source "SourceFile"


# direct methods
.method public synthetic constructor <init>(Ljava/io/File;)V
    .locals 2

    const/4 v0, 0x0

    const-string v1, "The source file doesn\'t exist."

    .line 1
    invoke-direct {p0, p1, v0, v1}, Lbc/c;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lbc/c;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V

    return-void
.end method
