.class public abstract LJ3/B$e$d$a$b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ3/B$e$d$a$b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()LJ3/B$e$d$a$b$a;
.end method

.method public abstract b(J)LJ3/B$e$d$a$b$a$a;
.end method

.method public abstract c(Ljava/lang/String;)LJ3/B$e$d$a$b$a$a;
.end method

.method public abstract d(J)LJ3/B$e$d$a$b$a$a;
.end method

.method public abstract e(Ljava/lang/String;)LJ3/B$e$d$a$b$a$a;
.end method

.method public f([B)LJ3/B$e$d$a$b$a$a;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {}, LJ3/B;->a()Ljava/nio/charset/Charset;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, LJ3/B$e$d$a$b$a$a;->e(Ljava/lang/String;)LJ3/B$e$d$a$b$a$a;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method
