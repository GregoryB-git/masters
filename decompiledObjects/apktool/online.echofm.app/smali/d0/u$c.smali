.class public final Ld0/u$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld0/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Landroid/net/Uri;

.field public c:Ljava/lang/String;

.field public d:Ld0/u$d$a;

.field public e:Ld0/u$f$a;

.field public f:Ljava/util/List;

.field public g:Ljava/lang/String;

.field public h:LX2/v;

.field public i:Ljava/lang/Object;

.field public j:J

.field public k:Ld0/w;

.field public l:Ld0/u$g$a;

.field public m:Ld0/u$i;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ld0/u$d$a;

    invoke-direct {v0}, Ld0/u$d$a;-><init>()V

    iput-object v0, p0, Ld0/u$c;->d:Ld0/u$d$a;

    new-instance v0, Ld0/u$f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld0/u$f$a;-><init>(Ld0/u$a;)V

    iput-object v0, p0, Ld0/u$c;->e:Ld0/u$f$a;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ld0/u$c;->f:Ljava/util/List;

    invoke-static {}, LX2/v;->Y()LX2/v;

    move-result-object v0

    iput-object v0, p0, Ld0/u$c;->h:LX2/v;

    new-instance v0, Ld0/u$g$a;

    invoke-direct {v0}, Ld0/u$g$a;-><init>()V

    iput-object v0, p0, Ld0/u$c;->l:Ld0/u$g$a;

    sget-object v0, Ld0/u$i;->d:Ld0/u$i;

    iput-object v0, p0, Ld0/u$c;->m:Ld0/u$i;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Ld0/u$c;->j:J

    return-void
.end method

.method public constructor <init>(Ld0/u;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ld0/u$c;-><init>()V

    iget-object v0, p1, Ld0/u;->f:Ld0/u$d;

    invoke-virtual {v0}, Ld0/u$d;->a()Ld0/u$d$a;

    move-result-object v0

    iput-object v0, p0, Ld0/u$c;->d:Ld0/u$d$a;

    iget-object v0, p1, Ld0/u;->a:Ljava/lang/String;

    iput-object v0, p0, Ld0/u$c;->a:Ljava/lang/String;

    iget-object v0, p1, Ld0/u;->e:Ld0/w;

    iput-object v0, p0, Ld0/u$c;->k:Ld0/w;

    iget-object v0, p1, Ld0/u;->d:Ld0/u$g;

    invoke-virtual {v0}, Ld0/u$g;->a()Ld0/u$g$a;

    move-result-object v0

    iput-object v0, p0, Ld0/u$c;->l:Ld0/u$g$a;

    iget-object v0, p1, Ld0/u;->h:Ld0/u$i;

    iput-object v0, p0, Ld0/u$c;->m:Ld0/u$i;

    iget-object p1, p1, Ld0/u;->b:Ld0/u$h;

    if-eqz p1, :cond_1

    iget-object v0, p1, Ld0/u$h;->e:Ljava/lang/String;

    iput-object v0, p0, Ld0/u$c;->g:Ljava/lang/String;

    iget-object v0, p1, Ld0/u$h;->b:Ljava/lang/String;

    iput-object v0, p0, Ld0/u$c;->c:Ljava/lang/String;

    iget-object v0, p1, Ld0/u$h;->a:Landroid/net/Uri;

    iput-object v0, p0, Ld0/u$c;->b:Landroid/net/Uri;

    iget-object v0, p1, Ld0/u$h;->d:Ljava/util/List;

    iput-object v0, p0, Ld0/u$c;->f:Ljava/util/List;

    iget-object v0, p1, Ld0/u$h;->f:LX2/v;

    iput-object v0, p0, Ld0/u$c;->h:LX2/v;

    iget-object v0, p1, Ld0/u$h;->h:Ljava/lang/Object;

    iput-object v0, p0, Ld0/u$c;->i:Ljava/lang/Object;

    iget-object v0, p1, Ld0/u$h;->c:Ld0/u$f;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ld0/u$f;->b()Ld0/u$f$a;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ld0/u$f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld0/u$f$a;-><init>(Ld0/u$a;)V

    :goto_0
    iput-object v0, p0, Ld0/u$c;->e:Ld0/u$f$a;

    iget-wide v0, p1, Ld0/u$h;->i:J

    iput-wide v0, p0, Ld0/u$c;->j:J

    :cond_1
    return-void
.end method

.method public synthetic constructor <init>(Ld0/u;Ld0/u$a;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Ld0/u$c;-><init>(Ld0/u;)V

    return-void
.end method


# virtual methods
.method public a()Ld0/u;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ld0/u$c;->e:Ld0/u$f$a;

    .line 4
    .line 5
    invoke-static {v1}, Ld0/u$f$a;->e(Ld0/u$f$a;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    iget-object v1, v0, Ld0/u$c;->e:Ld0/u$f$a;

    .line 12
    .line 13
    invoke-static {v1}, Ld0/u$f$a;->f(Ld0/u$f$a;)Ljava/util/UUID;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x0

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 23
    :goto_1
    invoke-static {v1}, Lg0/a;->f(Z)V

    .line 24
    .line 25
    .line 26
    iget-object v3, v0, Ld0/u$c;->b:Landroid/net/Uri;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    if-eqz v3, :cond_3

    .line 30
    .line 31
    new-instance v14, Ld0/u$h;

    .line 32
    .line 33
    iget-object v4, v0, Ld0/u$c;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v2, v0, Ld0/u$c;->e:Ld0/u$f$a;

    .line 36
    .line 37
    invoke-static {v2}, Ld0/u$f$a;->f(Ld0/u$f$a;)Ljava/util/UUID;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    iget-object v1, v0, Ld0/u$c;->e:Ld0/u$f$a;

    .line 44
    .line 45
    invoke-virtual {v1}, Ld0/u$f$a;->i()Ld0/u$f;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    :cond_2
    move-object v5, v1

    .line 50
    iget-object v7, v0, Ld0/u$c;->f:Ljava/util/List;

    .line 51
    .line 52
    iget-object v8, v0, Ld0/u$c;->g:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v9, v0, Ld0/u$c;->h:LX2/v;

    .line 55
    .line 56
    iget-object v10, v0, Ld0/u$c;->i:Ljava/lang/Object;

    .line 57
    .line 58
    iget-wide v11, v0, Ld0/u$c;->j:J

    .line 59
    .line 60
    const/4 v13, 0x0

    .line 61
    const/4 v6, 0x0

    .line 62
    move-object v2, v14

    .line 63
    invoke-direct/range {v2 .. v13}, Ld0/u$h;-><init>(Landroid/net/Uri;Ljava/lang/String;Ld0/u$f;Ld0/u$b;Ljava/util/List;Ljava/lang/String;LX2/v;Ljava/lang/Object;JLd0/u$a;)V

    .line 64
    .line 65
    .line 66
    move-object/from16 v18, v14

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    move-object/from16 v18, v1

    .line 70
    .line 71
    :goto_2
    new-instance v1, Ld0/u;

    .line 72
    .line 73
    iget-object v2, v0, Ld0/u$c;->a:Ljava/lang/String;

    .line 74
    .line 75
    if-eqz v2, :cond_4

    .line 76
    .line 77
    :goto_3
    move-object/from16 v16, v2

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_4
    const-string v2, ""

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :goto_4
    iget-object v2, v0, Ld0/u$c;->d:Ld0/u$d$a;

    .line 84
    .line 85
    invoke-virtual {v2}, Ld0/u$d$a;->g()Ld0/u$e;

    .line 86
    .line 87
    .line 88
    move-result-object v17

    .line 89
    iget-object v2, v0, Ld0/u$c;->l:Ld0/u$g$a;

    .line 90
    .line 91
    invoke-virtual {v2}, Ld0/u$g$a;->f()Ld0/u$g;

    .line 92
    .line 93
    .line 94
    move-result-object v19

    .line 95
    iget-object v2, v0, Ld0/u$c;->k:Ld0/w;

    .line 96
    .line 97
    if-eqz v2, :cond_5

    .line 98
    .line 99
    :goto_5
    move-object/from16 v20, v2

    .line 100
    .line 101
    goto :goto_6

    .line 102
    :cond_5
    sget-object v2, Ld0/w;->H:Ld0/w;

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :goto_6
    iget-object v2, v0, Ld0/u$c;->m:Ld0/u$i;

    .line 106
    .line 107
    const/16 v22, 0x0

    .line 108
    .line 109
    move-object v15, v1

    .line 110
    move-object/from16 v21, v2

    .line 111
    .line 112
    invoke-direct/range {v15 .. v22}, Ld0/u;-><init>(Ljava/lang/String;Ld0/u$e;Ld0/u$h;Ld0/u$g;Ld0/w;Ld0/u$i;Ld0/u$a;)V

    .line 113
    .line 114
    .line 115
    return-object v1
.end method

.method public b(Ljava/lang/String;)Ld0/u$c;
    .locals 0

    .line 1
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    iput-object p1, p0, Ld0/u$c;->a:Ljava/lang/String;

    .line 8
    .line 9
    return-object p0
.end method

.method public c(Ljava/lang/String;)Ld0/u$c;
    .locals 0

    .line 1
    iput-object p1, p0, Ld0/u$c;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public d(Ljava/lang/Object;)Ld0/u$c;
    .locals 0

    .line 1
    iput-object p1, p0, Ld0/u$c;->i:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public e(Landroid/net/Uri;)Ld0/u$c;
    .locals 0

    .line 1
    iput-object p1, p0, Ld0/u$c;->b:Landroid/net/Uri;

    .line 2
    .line 3
    return-object p0
.end method
