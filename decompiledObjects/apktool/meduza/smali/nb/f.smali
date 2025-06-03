.class public final Lnb/f;
.super Lnb/c;
.source "SourceFile"


# instance fields
.field public a:Leb/k0;

.field public final synthetic b:Lnb/e;


# direct methods
.method public constructor <init>(Lnb/e;)V
    .locals 0

    iput-object p1, p0, Lnb/f;->b:Lnb/e;

    invoke-direct {p0}, Lnb/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Leb/n;Leb/k0$j;)V
    .locals 5

    .line 1
    sget-object v0, Leb/n;->b:Leb/n;

    .line 2
    .line 3
    iget-object v1, p0, Lnb/f;->a:Leb/k0;

    .line 4
    .line 5
    iget-object v2, p0, Lnb/f;->b:Lnb/e;

    .line 6
    .line 7
    iget-object v3, v2, Lnb/e;->k:Leb/k0;

    .line 8
    .line 9
    if-ne v1, v3, :cond_0

    .line 10
    .line 11
    iget-boolean v1, v2, Lnb/e;->n:Z

    .line 12
    .line 13
    const-string v2, "there\'s pending lb while current lb has been out of READY"

    .line 14
    .line 15
    invoke-static {v1, v2}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lnb/f;->b:Lnb/e;

    .line 19
    .line 20
    iput-object p1, v1, Lnb/e;->l:Leb/n;

    .line 21
    .line 22
    iput-object p2, v1, Lnb/e;->m:Leb/k0$j;

    .line 23
    .line 24
    if-ne p1, v0, :cond_3

    .line 25
    .line 26
    invoke-virtual {v1}, Lnb/e;->h()V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    iget-object v4, v2, Lnb/e;->i:Leb/k0;

    .line 31
    .line 32
    if-ne v1, v4, :cond_3

    .line 33
    .line 34
    if-ne p1, v0, :cond_1

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v0, 0x0

    .line 39
    :goto_0
    iput-boolean v0, v2, Lnb/e;->n:Z

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    iget-object v0, v2, Lnb/e;->f:Lnb/e$a;

    .line 44
    .line 45
    if-eq v3, v0, :cond_2

    .line 46
    .line 47
    invoke-virtual {v2}, Lnb/e;->h()V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    iget-object v0, v2, Lnb/e;->g:Leb/k0$e;

    .line 52
    .line 53
    invoke-virtual {v0, p1, p2}, Leb/k0$e;->f(Leb/n;Leb/k0$j;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    :goto_1
    return-void
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
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

.method public final g()Leb/k0$e;
    .locals 1

    iget-object v0, p0, Lnb/f;->b:Lnb/e;

    iget-object v0, v0, Lnb/e;->g:Leb/k0$e;

    return-object v0
.end method
