.class public final Lx2/F;
.super LB2/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lx2/F;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final o:Ljava/lang/String;

.field public final p:Z

.field public final q:Z

.field public final r:Landroid/content/Context;

.field public final s:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lx2/G;

    .line 2
    .line 3
    invoke-direct {v0}, Lx2/G;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lx2/F;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZZLandroid/os/IBinder;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, LB2/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx2/F;->o:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p2, p0, Lx2/F;->p:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lx2/F;->q:Z

    .line 9
    .line 10
    invoke-static {p4}, LH2/a$a;->o(Landroid/os/IBinder;)LH2/a;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, LH2/b;->v(LH2/a;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Landroid/content/Context;

    .line 19
    .line 20
    iput-object p1, p0, Lx2/F;->r:Landroid/content/Context;

    .line 21
    .line 22
    iput-boolean p5, p0, Lx2/F;->s:Z

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 1
    invoke-static {p1}, LB2/c;->a(Landroid/os/Parcel;)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    iget-object v0, p0, Lx2/F;->o:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {p1, v1, v0, v2}, LB2/c;->n(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    iget-boolean v1, p0, Lx2/F;->p:Z

    .line 14
    .line 15
    invoke-static {p1, v0, v1}, LB2/c;->c(Landroid/os/Parcel;IZ)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x3

    .line 19
    iget-boolean v1, p0, Lx2/F;->q:Z

    .line 20
    .line 21
    invoke-static {p1, v0, v1}, LB2/c;->c(Landroid/os/Parcel;IZ)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lx2/F;->r:Landroid/content/Context;

    .line 25
    .line 26
    invoke-static {v0}, LH2/b;->Z0(Ljava/lang/Object;)LH2/a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const/4 v1, 0x4

    .line 31
    invoke-static {p1, v1, v0, v2}, LB2/c;->h(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x5

    .line 35
    iget-boolean v1, p0, Lx2/F;->s:Z

    .line 36
    .line 37
    invoke-static {p1, v0, v1}, LB2/c;->c(Landroid/os/Parcel;IZ)V

    .line 38
    .line 39
    .line 40
    invoke-static {p1, p2}, LB2/c;->b(Landroid/os/Parcel;I)V

    .line 41
    .line 42
    .line 43
    return-void
.end method
