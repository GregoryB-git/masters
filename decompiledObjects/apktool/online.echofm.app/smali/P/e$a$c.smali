.class public final LP/e$a$c;
.super LZ5/k;
.source "SourceFile"

# interfaces
.implements Lg6/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP/e$a;->c(Ljava/util/List;LP/i;LX5/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;

.field public r:I

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/util/List;

.field public final synthetic u:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;LX5/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP/e$a$c;->t:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, LP/e$a$c;->u:Ljava/util/List;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, LZ5/k;-><init>(ILX5/d;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;LX5/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LP/e$a$c;->create(Ljava/lang/Object;LX5/d;)LX5/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LP/e$a$c;

    .line 6
    .line 7
    sget-object p2, LV5/t;->a:LV5/t;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, LP/e$a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;LX5/d;)LX5/d;
    .locals 3

    .line 1
    new-instance v0, LP/e$a$c;

    .line 2
    .line 3
    iget-object v1, p0, LP/e$a$c;->t:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, LP/e$a$c;->u:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, LP/e$a$c;-><init>(Ljava/util/List;Ljava/util/List;LX5/d;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, LP/e$a$c;->s:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, LX5/d;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LP/e$a$c;->a(Ljava/lang/Object;LX5/d;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, LY5/b;->c()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, LP/e$a$c;->r:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    const/4 v3, 0x2

    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    if-ne v0, v3, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LP/e$a$c;->o:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/util/Iterator;

    .line 18
    .line 19
    iget-object v3, p0, LP/e$a$c;->s:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Ljava/util/List;

    .line 22
    .line 23
    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    iget-object v0, p0, LP/e$a$c;->q:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v4, p0, LP/e$a$c;->p:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {v4}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v4, p0, LP/e$a$c;->o:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v4, Ljava/util/Iterator;

    .line 45
    .line 46
    iget-object v5, p0, LP/e$a$c;->s:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v5, Ljava/util/List;

    .line 49
    .line 50
    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    check-cast p1, Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-nez p1, :cond_2

    .line 60
    .line 61
    move-object p1, v0

    .line 62
    move-object v0, v4

    .line 63
    move-object v3, v5

    .line 64
    goto :goto_0

    .line 65
    :cond_2
    new-instance p1, LP/e$a$c$a;

    .line 66
    .line 67
    invoke-direct {p1, v2, v2}, LP/e$a$c$a;-><init>(LP/d;LX5/d;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v5, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    iput-object v5, p0, LP/e$a$c;->s:Ljava/lang/Object;

    .line 74
    .line 75
    iput-object v4, p0, LP/e$a$c;->o:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object v2, p0, LP/e$a$c;->p:Ljava/lang/Object;

    .line 78
    .line 79
    iput-object v2, p0, LP/e$a$c;->q:Ljava/lang/Object;

    .line 80
    .line 81
    iput v3, p0, LP/e$a$c;->r:I

    .line 82
    .line 83
    throw v2

    .line 84
    :cond_3
    invoke-static {p1}, LV5/o;->b(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, LP/e$a$c;->s:Ljava/lang/Object;

    .line 88
    .line 89
    iget-object v0, p0, LP/e$a$c;->t:Ljava/util/List;

    .line 90
    .line 91
    check-cast v0, Ljava/lang/Iterable;

    .line 92
    .line 93
    iget-object v3, p0, LP/e$a$c;->u:Ljava/util/List;

    .line 94
    .line 95
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-nez v4, :cond_4

    .line 104
    .line 105
    return-object p1

    .line 106
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-static {v4}, Landroid/support/v4/media/a;->a(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iput-object v3, p0, LP/e$a$c;->s:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v0, p0, LP/e$a$c;->o:Ljava/lang/Object;

    .line 116
    .line 117
    iput-object v2, p0, LP/e$a$c;->p:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object p1, p0, LP/e$a$c;->q:Ljava/lang/Object;

    .line 120
    .line 121
    iput v1, p0, LP/e$a$c;->r:I

    .line 122
    .line 123
    throw v2
.end method
