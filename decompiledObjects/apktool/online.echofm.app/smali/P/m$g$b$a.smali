.class public final LP/m$g$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP/m$g$b;->a(Ls6/c;LX5/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic o:Ls6/c;


# direct methods
.method public constructor <init>(Ls6/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP/m$g$b$a;->o:Ls6/c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public emit(Ljava/lang/Object;LX5/d;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, LP/m$g$b$a$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LP/m$g$b$a$a;

    .line 7
    .line 8
    iget v1, v0, LP/m$g$b$a$a;->p:I

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
    iput v1, v0, LP/m$g$b$a$a;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LP/m$g$b$a$a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LP/m$g$b$a$a;-><init>(LP/m$g$b$a;LX5/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LP/m$g$b$a$a;->o:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, LY5/b;->c()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LP/m$g$b$a$a;->p:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p2}, LV5/o;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p2}, LV5/o;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, LP/m$g$b$a;->o:Ls6/c;

    .line 54
    .line 55
    check-cast p1, LP/n;

    .line 56
    .line 57
    instance-of v2, p1, LP/j;

    .line 58
    .line 59
    if-nez v2, :cond_7

    .line 60
    .line 61
    instance-of v2, p1, LP/h;

    .line 62
    .line 63
    if-nez v2, :cond_6

    .line 64
    .line 65
    instance-of v2, p1, LP/c;

    .line 66
    .line 67
    if-eqz v2, :cond_4

    .line 68
    .line 69
    check-cast p1, LP/c;

    .line 70
    .line 71
    invoke-virtual {p1}, LP/c;->b()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iput v3, v0, LP/m$g$b$a$a;->p:I

    .line 76
    .line 77
    invoke-interface {p2, p1, v0}, Ls6/c;->emit(Ljava/lang/Object;LX5/d;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    if-ne p1, v1, :cond_3

    .line 82
    .line 83
    return-object v1

    .line 84
    :cond_3
    :goto_1
    sget-object p1, LV5/t;->a:LV5/t;

    .line 85
    .line 86
    return-object p1

    .line 87
    :cond_4
    instance-of p1, p1, LP/o;

    .line 88
    .line 89
    if-eqz p1, :cond_5

    .line 90
    .line 91
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 92
    .line 93
    const-string p2, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p1

    .line 103
    :cond_5
    new-instance p1, LV5/l;

    .line 104
    .line 105
    invoke-direct {p1}, LV5/l;-><init>()V

    .line 106
    .line 107
    .line 108
    throw p1

    .line 109
    :cond_6
    check-cast p1, LP/h;

    .line 110
    .line 111
    invoke-virtual {p1}, LP/h;->a()Ljava/lang/Throwable;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    throw p1

    .line 116
    :cond_7
    check-cast p1, LP/j;

    .line 117
    .line 118
    invoke-virtual {p1}, LP/j;->a()Ljava/lang/Throwable;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    throw p1
.end method
