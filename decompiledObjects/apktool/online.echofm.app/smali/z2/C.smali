.class public final Lz2/C;
.super Lz2/q;
.source "SourceFile"


# instance fields
.field public final c:Ly2/d;


# direct methods
.method public constructor <init>(Ly2/d;)V
    .locals 1

    .line 1
    const-string v0, "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method."

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lz2/q;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lz2/C;->c:Ly2/d;

    .line 7
    .line 8
    return-void
.end method
