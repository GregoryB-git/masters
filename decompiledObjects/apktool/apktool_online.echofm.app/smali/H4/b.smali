.class public final LH4/b;
.super LH4/e;
.source "SourceFile"


# instance fields
.field public final a:LN4/g;


# direct methods
.method public constructor <init>(LN4/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LH4/e;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LH4/b;->a:LN4/g;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public c()Z
    .locals 1

    .line 1
    iget-object v0, p0, LH4/b;->a:LN4/g;

    .line 2
    .line 3
    invoke-virtual {v0}, LN4/g;->h0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, LH4/b;->a:LN4/g;

    .line 10
    .line 11
    invoke-virtual {v0}, LN4/g;->d0()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-gtz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, LH4/b;->a:LN4/g;

    .line 18
    .line 19
    invoke-virtual {v0}, LN4/g;->c0()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-gtz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, LH4/b;->a:LN4/g;

    .line 26
    .line 27
    invoke-virtual {v0}, LN4/g;->g0()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, LH4/b;->a:LN4/g;

    .line 34
    .line 35
    invoke-virtual {v0}, LN4/g;->f0()LN4/f;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, LN4/f;->Y()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    :cond_0
    const/4 v0, 0x1

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 v0, 0x0

    .line 48
    :goto_0
    return v0
.end method
