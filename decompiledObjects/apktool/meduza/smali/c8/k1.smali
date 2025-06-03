.class public final Lc8/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb8/g;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lc8/k1;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Lc8/i;

.field public b:Lc8/i1;

.field public c:Lb8/c1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc8/j1;

    invoke-direct {v0}, Lc8/j1;-><init>()V

    sput-object v0, Lc8/k1;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lc8/i;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    iput-object p1, p0, Lc8/k1;->a:Lc8/i;

    .line 1
    iget-object v0, p1, Lc8/i;->e:Ljava/util/List;

    const/4 v1, 0x0

    .line 2
    iput-object v1, p0, Lc8/k1;->b:Lc8/i1;

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc8/e;

    .line 3
    iget-object v2, v2, Lc8/e;->q:Ljava/lang/String;

    .line 4
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v2, Lc8/i1;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc8/e;

    .line 5
    iget-object v3, v3, Lc8/e;->b:Ljava/lang/String;

    .line 6
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc8/e;

    .line 7
    iget-object v4, v4, Lc8/e;->q:Ljava/lang/String;

    .line 8
    iget-boolean v5, p1, Lc8/i;->r:Z

    .line 9
    invoke-direct {v2, v3, v4, v5}, Lc8/i1;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v2, p0, Lc8/k1;->b:Lc8/i1;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lc8/k1;->b:Lc8/i1;

    if-nez v0, :cond_2

    new-instance v0, Lc8/i1;

    .line 10
    iget-boolean v1, p1, Lc8/i;->r:Z

    .line 11
    invoke-direct {v0, v1}, Lc8/i1;-><init>(Z)V

    iput-object v0, p0, Lc8/k1;->b:Lc8/i1;

    .line 12
    :cond_2
    iget-object p1, p1, Lc8/i;->s:Lb8/c1;

    .line 13
    iput-object p1, p0, Lc8/k1;->c:Lb8/c1;

    return-void
.end method

.method public constructor <init>(Lc8/i;Lc8/i1;Lb8/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc8/k1;->a:Lc8/i;

    iput-object p2, p0, Lc8/k1;->b:Lc8/i1;

    iput-object p3, p0, Lc8/k1;->c:Lb8/c1;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final s()Lc8/i1;
    .locals 1

    iget-object v0, p0, Lc8/k1;->b:Lc8/i1;

    return-object v0
.end method

.method public final t()Lb8/c1;
    .locals 1

    iget-object v0, p0, Lc8/k1;->c:Lb8/c1;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {v0, p1}, Lb/z;->J(ILandroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    iget-object v2, p0, Lc8/k1;->a:Lc8/i;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v1, v2, p2, v3}, Lb/z;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    iget-object v2, p0, Lc8/k1;->b:Lc8/i1;

    .line 16
    .line 17
    invoke-static {p1, v1, v2, p2, v3}, Lb/z;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    iget-object v2, p0, Lc8/k1;->c:Lb8/c1;

    .line 22
    .line 23
    invoke-static {p1, v1, v2, p2, v3}, Lb/z;->E(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, p1}, Lb/z;->L(ILandroid/os/Parcel;)V

    .line 27
    .line 28
    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
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

.method public final z()Lc8/i;
    .locals 1

    iget-object v0, p0, Lc8/k1;->a:Lc8/i;

    return-object v0
.end method
