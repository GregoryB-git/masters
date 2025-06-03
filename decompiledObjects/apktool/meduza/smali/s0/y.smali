.class public Ls0/y;
.super Ljava/io/IOException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls0/y$a;
    }
.end annotation


# static fields
.field public static final synthetic a:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static a()Ls0/y;
    .locals 2

    new-instance v0, Ls0/y;

    const-string v1, "Protocol message had invalid UTF-8."

    invoke-direct {v0, v1}, Ls0/y;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static b()Ls0/y$a;
    .locals 1

    new-instance v0, Ls0/y$a;

    invoke-direct {v0}, Ls0/y$a;-><init>()V

    return-object v0
.end method

.method public static c()Ls0/y;
    .locals 2

    new-instance v0, Ls0/y;

    const-string v1, "CodedInputStream encountered a malformed varint."

    invoke-direct {v0, v1}, Ls0/y;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static d()Ls0/y;
    .locals 2

    new-instance v0, Ls0/y;

    const-string v1, "CodedInputStream encountered an embedded string or message which claimed to have negative size."

    invoke-direct {v0, v1}, Ls0/y;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static e()Ls0/y;
    .locals 2

    new-instance v0, Ls0/y;

    const-string v1, "Failed to parse the message."

    invoke-direct {v0, v1}, Ls0/y;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static f()Ls0/y;
    .locals 2

    new-instance v0, Ls0/y;

    const-string v1, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."

    invoke-direct {v0, v1}, Ls0/y;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
