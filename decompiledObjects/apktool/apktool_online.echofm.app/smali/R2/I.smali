.class public final LR2/I;
.super LB2/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LR2/I;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final o:Ljava/lang/String;

.field public final p:LR2/D;

.field public final q:Ljava/lang/String;

.field public final r:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LR2/H;

    .line 2
    .line 3
    invoke-direct {v0}, LR2/H;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR2/I;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(LR2/I;J)V
    .locals 1

    .line 1
    invoke-direct {p0}, LB2/a;-><init>()V

    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, LR2/I;->o:Ljava/lang/String;

    iput-object v0, p0, LR2/I;->o:Ljava/lang/String;

    iget-object v0, p1, LR2/I;->p:LR2/D;

    iput-object v0, p0, LR2/I;->p:LR2/D;

    iget-object p1, p1, LR2/I;->q:Ljava/lang/String;

    iput-object p1, p0, LR2/I;->q:Ljava/lang/String;

    iput-wide p2, p0, LR2/I;->r:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LR2/D;Ljava/lang/String;J)V
    .locals 0

    .line 2
    invoke-direct {p0}, LB2/a;-><init>()V

    iput-object p1, p0, LR2/I;->o:Ljava/lang/String;

    iput-object p2, p0, LR2/I;->p:LR2/D;

    iput-object p3, p0, LR2/I;->q:Ljava/lang/String;

    iput-wide p4, p0, LR2/I;->r:J

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, LR2/I;->q:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, LR2/I;->o:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, LR2/I;->p:LR2/D;

    .line 6
    .line 7
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    new-instance v3, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v4, "origin="

    .line 14
    .line 15
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v0, ",name="

    .line 22
    .line 23
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v0, ",params="

    .line 30
    .line 31
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0
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
    iget-object v1, p0, LR2/I;->o:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-static {p1, v2, v1, v3}, LB2/c;->n(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    iget-object v2, p0, LR2/I;->p:LR2/D;

    .line 14
    .line 15
    invoke-static {p1, v1, v2, p2, v3}, LB2/c;->m(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 16
    .line 17
    .line 18
    const/4 p2, 0x4

    .line 19
    iget-object v1, p0, LR2/I;->q:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {p1, p2, v1, v3}, LB2/c;->n(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    const/4 p2, 0x5

    .line 25
    iget-wide v1, p0, LR2/I;->r:J

    .line 26
    .line 27
    invoke-static {p1, p2, v1, v2}, LB2/c;->k(Landroid/os/Parcel;IJ)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v0}, LB2/c;->b(Landroid/os/Parcel;I)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
