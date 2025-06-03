.class public final Lk3/e;
.super Lc3/g;
.source "SourceFile"


# instance fields
.field public final a:Lk3/o;


# direct methods
.method public constructor <init>(Lk3/o;Lc3/y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc3/g;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1, p2}, Lk3/e;->a(Lk3/o;Lc3/y;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lk3/e;->a:Lk3/o;

    .line 8
    .line 9
    return-void
.end method

.method public static a(Lk3/o;Lc3/y;)V
    .locals 1

    .line 1
    sget-object v0, Lk3/e$a;->b:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Lk3/o;->d()Lp3/y$c;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    aget p0, v0, p0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    if-eq p0, v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    if-eq p0, v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-static {p1}, Lc3/y;->b(Lc3/y;)Lc3/y;

    .line 21
    .line 22
    .line 23
    :goto_0
    return-void
.end method
