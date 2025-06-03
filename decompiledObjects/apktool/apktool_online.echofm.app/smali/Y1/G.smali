.class public LY1/G;
.super LY1/F;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY1/G$a;,
        LY1/G$c;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LY1/G;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final x:LY1/G$c;


# instance fields
.field public t:LO1/V;

.field public u:Ljava/lang/String;

.field public final v:Ljava/lang/String;

.field public final w:Lx1/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LY1/G$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LY1/G$c;-><init>(Lkotlin/jvm/internal/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LY1/G;->x:LY1/G$c;

    .line 8
    .line 9
    new-instance v0, LY1/G$b;

    .line 10
    .line 11
    invoke-direct {v0}, LY1/G$b;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, LY1/G;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(LY1/u;)V
    .locals 1

    .line 1
    const-string v0, "loginClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LY1/F;-><init>(LY1/u;)V

    const-string p1, "web_view"

    iput-object p1, p0, LY1/G;->v:Ljava/lang/String;

    sget-object p1, Lx1/h;->t:Lx1/h;

    iput-object p1, p0, LY1/G;->w:Lx1/h;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 2
    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LY1/F;-><init>(Landroid/os/Parcel;)V

    const-string v0, "web_view"

    iput-object v0, p0, LY1/G;->v:Ljava/lang/String;

    sget-object v0, Lx1/h;->t:Lx1/h;

    iput-object v0, p0, LY1/G;->w:Lx1/h;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LY1/G;->u:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, LY1/G;->t:LO1/V;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, LO1/V;->cancel()V

    .line 9
    .line 10
    .line 11
    :goto_0
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, LY1/G;->t:LO1/V;

    .line 13
    .line 14
    :cond_1
    return-void
.end method

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
    iget-object v0, p0, LY1/G;->v:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public o(LY1/u$e;)I
    .locals 6

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, LY1/F;->q(LY1/u$e;)Landroid/os/Bundle;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, LY1/G$d;

    .line 11
    .line 12
    invoke-direct {v1, p0, p1}, LY1/G$d;-><init>(LY1/G;LY1/u$e;)V

    .line 13
    .line 14
    .line 15
    sget-object v2, LY1/u;->A:LY1/u$c;

    .line 16
    .line 17
    invoke-virtual {v2}, LY1/u$c;->a()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iput-object v2, p0, LY1/G;->u:Ljava/lang/String;

    .line 22
    .line 23
    const-string v3, "e2e"

    .line 24
    .line 25
    invoke-virtual {p0, v3, v2}, LY1/A;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, LY1/A;->d()LY1/u;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, LY1/u;->i()Landroidx/fragment/app/e;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    if-nez v2, :cond_0

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    return p1

    .line 40
    :cond_0
    invoke-static {v2}, LO1/P;->W(Landroid/content/Context;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    new-instance v4, LY1/G$a;

    .line 45
    .line 46
    invoke-virtual {p1}, LY1/u$e;->a()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-direct {v4, p0, v2, v5, v0}, LY1/G$a;-><init>(LY1/G;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, LY1/G;->u:Ljava/lang/String;

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    invoke-virtual {v4, v0}, LY1/G$a;->m(Ljava/lang/String;)LY1/G$a;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0, v3}, LY1/G$a;->p(Z)LY1/G$a;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p1}, LY1/u$e;->c()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v0, v3}, LY1/G$a;->k(Ljava/lang/String;)LY1/G$a;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {p1}, LY1/u$e;->j()LY1/t;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v0, v3}, LY1/G$a;->q(LY1/t;)LY1/G$a;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {p1}, LY1/u$e;->k()LY1/B;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v0, v3}, LY1/G$a;->r(LY1/B;)LY1/G$a;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {p1}, LY1/u$e;->q()Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    invoke-virtual {v0, v3}, LY1/G$a;->o(Z)LY1/G$a;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {p1}, LY1/u$e;->v()Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    invoke-virtual {v0, p1}, LY1/G$a;->s(Z)LY1/G$a;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1, v1}, LO1/V$a;->h(LO1/V$d;)LO1/V$a;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p1}, LO1/V$a;->a()LO1/V;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    iput-object p1, p0, LY1/G;->t:LO1/V;

    .line 114
    .line 115
    new-instance p1, LO1/i;

    .line 116
    .line 117
    invoke-direct {p1}, LO1/i;-><init>()V

    .line 118
    .line 119
    .line 120
    const/4 v0, 0x1

    .line 121
    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->D1(Z)V

    .line 122
    .line 123
    .line 124
    iget-object v1, p0, LY1/G;->t:LO1/V;

    .line 125
    .line 126
    invoke-virtual {p1, v1}, LO1/i;->b2(Landroid/app/Dialog;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, Landroidx/fragment/app/e;->n()Landroidx/fragment/app/n;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    const-string v2, "FacebookDialogFragment"

    .line 134
    .line 135
    invoke-virtual {p1, v1, v2}, Landroidx/fragment/app/d;->T1(Landroidx/fragment/app/n;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    return v0

    .line 139
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 140
    .line 141
    const-string v0, "null cannot be cast to non-null type kotlin.String"

    .line 142
    .line 143
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw p1
.end method

.method public t()Lx1/h;
    .locals 1

    .line 1
    iget-object v0, p0, LY1/G;->w:Lx1/h;

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
    iget-object p2, p0, LY1/G;->u:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final x(LY1/u$e;Landroid/os/Bundle;Lx1/o;)V
    .locals 1

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, LY1/F;->v(LY1/u$e;Landroid/os/Bundle;Lx1/o;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
