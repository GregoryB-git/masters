.class public final LA2/I;
.super LB2/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LA2/I;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final o:I

.field public final p:Landroid/os/IBinder;

.field public final q:Lx2/b;

.field public final r:Z

.field public final s:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LA2/J;

    .line 2
    .line 3
    invoke-direct {v0}, LA2/J;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LA2/I;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(ILandroid/os/IBinder;Lx2/b;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, LB2/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LA2/I;->o:I

    .line 5
    .line 6
    iput-object p2, p0, LA2/I;->p:Landroid/os/IBinder;

    .line 7
    .line 8
    iput-object p3, p0, LA2/I;->q:Lx2/b;

    .line 9
    .line 10
    iput-boolean p4, p0, LA2/I;->r:Z

    .line 11
    .line 12
    iput-boolean p5, p0, LA2/I;->s:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()Lx2/b;
    .locals 1

    .line 1
    iget-object v0, p0, LA2/I;->q:Lx2/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()LA2/i;
    .locals 1

    .line 1
    iget-object v0, p0, LA2/I;->p:Landroid/os/IBinder;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-static {v0}, LA2/i$a;->o(Landroid/os/IBinder;)LA2/i;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x1

    .line 6
    if-ne p0, p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    instance-of v2, p1, LA2/I;

    .line 10
    .line 11
    if-nez v2, :cond_2

    .line 12
    .line 13
    return v0

    .line 14
    :cond_2
    check-cast p1, LA2/I;

    .line 15
    .line 16
    iget-object v2, p0, LA2/I;->q:Lx2/b;

    .line 17
    .line 18
    iget-object v3, p1, LA2/I;->q:Lx2/b;

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Lx2/b;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_3

    .line 25
    .line 26
    invoke-virtual {p0}, LA2/I;->d()LA2/i;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {p1}, LA2/I;->d()LA2/i;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {v2, p1}, LA2/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_3

    .line 39
    .line 40
    return v1

    .line 41
    :cond_3
    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    invoke-static {p1}, LB2/c;->a(Landroid/os/Parcel;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    iget v2, p0, LA2/I;->o:I

    .line 7
    .line 8
    invoke-static {p1, v1, v2}, LB2/c;->i(Landroid/os/Parcel;II)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LA2/I;->p:Landroid/os/IBinder;

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static {p1, v2, v1, v3}, LB2/c;->h(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x3

    .line 19
    iget-object v2, p0, LA2/I;->q:Lx2/b;

    .line 20
    .line 21
    invoke-static {p1, v1, v2, p2, v3}, LB2/c;->m(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 22
    .line 23
    .line 24
    const/4 p2, 0x4

    .line 25
    iget-boolean v1, p0, LA2/I;->r:Z

    .line 26
    .line 27
    invoke-static {p1, p2, v1}, LB2/c;->c(Landroid/os/Parcel;IZ)V

    .line 28
    .line 29
    .line 30
    const/4 p2, 0x5

    .line 31
    iget-boolean v1, p0, LA2/I;->s:Z

    .line 32
    .line 33
    invoke-static {p1, p2, v1}, LB2/c;->c(Landroid/os/Parcel;IZ)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v0}, LB2/c;->b(Landroid/os/Parcel;I)V

    .line 37
    .line 38
    .line 39
    return-void
.end method
