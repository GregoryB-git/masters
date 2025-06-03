.class public final Lk9/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/p;


# static fields
.field public static final a:Lk9/n;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk9/n;

    invoke-direct {v0}, Lk9/n;-><init>()V

    sput-object v0, Lk9/n;->a:Lk9/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lka/d0;Lka/d0;)Lka/d0;
    .locals 0

    return-object p2
.end method

.method public final b(Lu7/m;Lka/d0;)Lka/d0;
    .locals 5

    .line 1
    invoke-static {}, Lka/d0;->d0()Lka/d0$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "server_timestamp"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lka/d0$a;->v(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lma/w$a;->k()Lma/w;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lka/d0;

    .line 15
    .line 16
    invoke-static {}, Lka/d0;->d0()Lka/d0$a;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {}, Lma/n1;->L()Lma/n1$a;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget-wide v3, p1, Lu7/m;->a:J

    .line 25
    .line 26
    invoke-virtual {v2, v3, v4}, Lma/n1$a;->p(J)V

    .line 27
    .line 28
    .line 29
    iget p1, p1, Lu7/m;->b:I

    .line 30
    .line 31
    invoke-virtual {v2}, Lma/w$a;->m()V

    .line 32
    .line 33
    .line 34
    iget-object v3, v2, Lma/w$a;->b:Lma/w;

    .line 35
    .line 36
    check-cast v3, Lma/n1;

    .line 37
    .line 38
    invoke-static {v3, p1}, Lma/n1;->H(Lma/n1;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2}, Lka/d0$a;->w(Lma/n1$a;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Lma/w$a;->k()Lma/w;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lka/d0;

    .line 49
    .line 50
    invoke-static {}, Lka/u;->M()Lka/u$a;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const-string v2, "__type__"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v2}, Lka/u$a;->p(Lka/d0;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const-string v0, "__local_write_time__"

    .line 60
    .line 61
    invoke-virtual {v1, p1, v0}, Lka/u$a;->p(Lka/d0;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-static {p2}, Lj9/p;->c(Lka/d0;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_0

    .line 69
    .line 70
    invoke-static {p2}, Lj9/p;->b(Lka/d0;)Lka/d0;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    :cond_0
    if-eqz p2, :cond_1

    .line 75
    .line 76
    const-string p1, "__previous_value__"

    .line 77
    .line 78
    invoke-virtual {v1, p2, p1}, Lka/u$a;->p(Lka/d0;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_1
    invoke-static {}, Lka/d0;->d0()Lka/d0$a;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p1, v1}, Lka/d0$a;->t(Lka/u$a;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Lma/w$a;->k()Lma/w;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, Lka/d0;

    .line 93
    .line 94
    return-object p1
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

.method public final c(Lka/d0;)Lka/d0;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method
