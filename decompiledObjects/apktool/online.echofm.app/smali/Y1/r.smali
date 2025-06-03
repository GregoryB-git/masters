.class public final LY1/r;
.super LY1/D;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY1/r$b;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LY1/r;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final u:LY1/r$b;


# instance fields
.field public final s:Ljava/lang/String;

.field public final t:Lx1/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LY1/r$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LY1/r$b;-><init>(Lkotlin/jvm/internal/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LY1/r;->u:LY1/r$b;

    .line 8
    .line 9
    new-instance v0, LY1/r$a;

    .line 10
    .line 11
    invoke-direct {v0}, LY1/r$a;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, LY1/r;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(LY1/u;)V
    .locals 1

    .line 1
    const-string v0, "loginClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LY1/D;-><init>(LY1/u;)V

    const-string p1, "instagram_login"

    iput-object p1, p0, LY1/r;->s:Ljava/lang/String;

    sget-object p1, Lx1/h;->y:Lx1/h;

    iput-object p1, p0, LY1/r;->t:Lx1/h;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 2
    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LY1/D;-><init>(Landroid/os/Parcel;)V

    const-string p1, "instagram_login"

    iput-object p1, p0, LY1/r;->s:Ljava/lang/String;

    sget-object p1, Lx1/h;->y:Lx1/h;

    iput-object p1, p0, LY1/r;->t:Lx1/h;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LY1/r;->s:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public o(LY1/u$e;)I
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "request"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget-object v1, LY1/u;->A:LY1/u$c;

    .line 11
    .line 12
    invoke-virtual {v1}, LY1/u$c;->a()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v15

    .line 16
    sget-object v3, LO1/E;->a:LO1/E;

    .line 17
    .line 18
    invoke-virtual/range {p0 .. p0}, LY1/A;->d()LY1/u;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, LY1/u;->i()Landroidx/fragment/app/e;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    if-nez v3, :cond_0

    .line 27
    .line 28
    invoke-static {}, Lx1/B;->l()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    :cond_0
    invoke-virtual/range {p1 .. p1}, LY1/u$e;->a()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual/range {p1 .. p1}, LY1/u$e;->n()Ljava/util/Set;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual/range {p1 .. p1}, LY1/u$e;->t()Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    invoke-virtual/range {p1 .. p1}, LY1/u$e;->p()Z

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    invoke-virtual/range {p1 .. p1}, LY1/u$e;->g()LY1/e;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    if-nez v8, :cond_1

    .line 53
    .line 54
    sget-object v8, LY1/e;->p:LY1/e;

    .line 55
    .line 56
    :cond_1
    invoke-virtual/range {p1 .. p1}, LY1/u$e;->b()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    invoke-virtual {v0, v9}, LY1/A;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    invoke-virtual/range {p1 .. p1}, LY1/u$e;->c()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v10

    .line 68
    invoke-virtual/range {p1 .. p1}, LY1/u$e;->l()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v11

    .line 72
    invoke-virtual/range {p1 .. p1}, LY1/u$e;->o()Z

    .line 73
    .line 74
    .line 75
    move-result v12

    .line 76
    invoke-virtual/range {p1 .. p1}, LY1/u$e;->q()Z

    .line 77
    .line 78
    .line 79
    move-result v13

    .line 80
    invoke-virtual/range {p1 .. p1}, LY1/u$e;->v()Z

    .line 81
    .line 82
    .line 83
    move-result v14

    .line 84
    move-object v2, v3

    .line 85
    move-object v3, v4

    .line 86
    move-object v4, v5

    .line 87
    move-object v5, v15

    .line 88
    invoke-static/range {v2 .. v14}, LO1/E;->j(Landroid/content/Context;Ljava/lang/String;Ljava/util/Collection;Ljava/lang/String;ZZLY1/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)Landroid/content/Intent;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    const-string v3, "e2e"

    .line 93
    .line 94
    invoke-virtual {v0, v3, v15}, LY1/A;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, LY1/u$c;->b()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    invoke-virtual {v0, v2, v1}, LY1/D;->B(Landroid/content/Intent;I)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    return v1
.end method

.method public u()Lx1/h;
    .locals 1

    .line 1
    iget-object v0, p0, LY1/r;->t:Lx1/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    const-string v0, "dest"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, LY1/A;->writeToParcel(Landroid/os/Parcel;I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
