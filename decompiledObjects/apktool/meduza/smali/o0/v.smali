.class public final Lo0/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lqc/f<",
        "Lo0/b0<",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lqc/f;


# direct methods
.method public constructor <init>(Lqc/f;)V
    .locals 0

    iput-object p1, p0, Lo0/v;->a:Lqc/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lo0/v$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lo0/v$a;

    .line 7
    .line 8
    iget v1, v0, Lo0/v$a;->b:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lo0/v$a;->b:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lo0/v$a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lo0/v$a;-><init>(Lo0/v;Lub/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lo0/v$a;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lvb/a;->a:Lvb/a;

    .line 28
    .line 29
    iget v2, v0, Lo0/v$a;->b:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p2}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    invoke-static {p2}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object p2, p0, Lo0/v;->a:Lqc/f;

    .line 52
    .line 53
    check-cast p1, Lo0/b0;

    .line 54
    .line 55
    instance-of v2, p1, Lo0/l;

    .line 56
    .line 57
    if-nez v2, :cond_7

    .line 58
    .line 59
    instance-of v2, p1, Lo0/j;

    .line 60
    .line 61
    if-nez v2, :cond_6

    .line 62
    .line 63
    instance-of v2, p1, Lo0/c;

    .line 64
    .line 65
    if-eqz v2, :cond_4

    .line 66
    .line 67
    check-cast p1, Lo0/c;

    .line 68
    .line 69
    iget-object p1, p1, Lo0/c;->a:Ljava/lang/Object;

    .line 70
    .line 71
    iput v3, v0, Lo0/v$a;->b:I

    .line 72
    .line 73
    invoke-interface {p2, p1, v0}, Lqc/f;->emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-ne p1, v1, :cond_3

    .line 78
    .line 79
    return-object v1

    .line 80
    :cond_3
    :goto_1
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_4
    instance-of p1, p1, Lo0/c0;

    .line 84
    .line 85
    if-eqz p1, :cond_5

    .line 86
    .line 87
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    const-string p2, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    .line 90
    .line 91
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p1

    .line 99
    :cond_5
    new-instance p1, Ln7/w;

    .line 100
    .line 101
    invoke-direct {p1}, Ln7/w;-><init>()V

    .line 102
    .line 103
    .line 104
    throw p1

    .line 105
    :cond_6
    check-cast p1, Lo0/j;

    .line 106
    .line 107
    iget-object p1, p1, Lo0/j;->a:Ljava/lang/Throwable;

    .line 108
    .line 109
    throw p1

    .line 110
    :cond_7
    check-cast p1, Lo0/l;

    .line 111
    .line 112
    iget-object p1, p1, Lo0/l;->a:Ljava/lang/Throwable;

    .line 113
    .line 114
    throw p1
    .line 115
.end method
