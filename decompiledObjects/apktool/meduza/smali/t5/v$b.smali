.class public final Lt5/v$b;
.super Lt5/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt5/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>(ILjava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lt5/l;-><init>(ILjava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/io/FileNotFoundException;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lt5/l;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
