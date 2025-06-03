.class public abstract LJ3/B$e$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ3/B$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()LJ3/B$e;
.end method

.method public abstract b(LJ3/B$e$a;)LJ3/B$e$b;
.end method

.method public abstract c(Ljava/lang/String;)LJ3/B$e$b;
.end method

.method public abstract d(Z)LJ3/B$e$b;
.end method

.method public abstract e(LJ3/B$e$c;)LJ3/B$e$b;
.end method

.method public abstract f(Ljava/lang/Long;)LJ3/B$e$b;
.end method

.method public abstract g(LJ3/C;)LJ3/B$e$b;
.end method

.method public abstract h(Ljava/lang/String;)LJ3/B$e$b;
.end method

.method public abstract i(I)LJ3/B$e$b;
.end method

.method public abstract j(Ljava/lang/String;)LJ3/B$e$b;
.end method

.method public k([B)LJ3/B$e$b;
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
    invoke-virtual {p0, v0}, LJ3/B$e$b;->j(Ljava/lang/String;)LJ3/B$e$b;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public abstract l(LJ3/B$e$e;)LJ3/B$e$b;
.end method

.method public abstract m(J)LJ3/B$e$b;
.end method

.method public abstract n(LJ3/B$e$f;)LJ3/B$e$b;
.end method
