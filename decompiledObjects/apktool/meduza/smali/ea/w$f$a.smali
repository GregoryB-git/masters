.class public final Lea/w$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lea/w$f;->collect(Lqc/f;Lub/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lqc/f;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lqc/f;

.field public final synthetic b:Lea/w;


# direct methods
.method public constructor <init>(Lqc/f;Lea/w;)V
    .locals 0

    iput-object p1, p0, Lea/w$f$a;->a:Lqc/f;

    iput-object p2, p0, Lea/w$f$a;->b:Lea/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lea/w$f$a$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lea/w$f$a$a;

    .line 7
    .line 8
    iget v1, v0, Lea/w$f$a$a;->b:I

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
    iput v1, v0, Lea/w$f$a$a;->b:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lea/w$f$a$a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lea/w$f$a$a;-><init>(Lea/w$f$a;Lub/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lea/w$f$a$a;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lvb/a;->a:Lvb/a;

    .line 28
    .line 29
    iget v2, v0, Lea/w$f$a$a;->b:I

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
    iget-object p2, p0, Lea/w$f$a;->a:Lqc/f;

    .line 52
    .line 53
    check-cast p1, Lr0/d;

    .line 54
    .line 55
    iget-object v2, p0, Lea/w$f$a;->b:Lea/w;

    .line 56
    .line 57
    sget-object v4, Lea/w;->e:Lea/w$c;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance v2, Lea/p;

    .line 63
    .line 64
    sget-object v4, Lea/w$d;->a:Lr0/d$a;

    .line 65
    .line 66
    invoke-virtual {p1, v4}, Lr0/d;->b(Lr0/d$a;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, Ljava/lang/String;

    .line 71
    .line 72
    invoke-direct {v2, p1}, Lea/p;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iput v3, v0, Lea/w$f$a$a;->b:I

    .line 76
    .line 77
    invoke-interface {p2, v2, v0}, Lqc/f;->emit(Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

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
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 85
    .line 86
    return-object p1
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method
