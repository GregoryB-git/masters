.class public final LR2/e;
.super LB2/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LR2/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public o:Ljava/lang/String;

.field public p:Ljava/lang/String;

.field public q:LR2/R5;

.field public r:J

.field public s:Z

.field public t:Ljava/lang/String;

.field public u:LR2/I;

.field public v:J

.field public w:LR2/I;

.field public x:J

.field public y:LR2/I;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LR2/h;

    .line 2
    .line 3
    invoke-direct {v0}, LR2/h;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR2/e;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(LR2/e;)V
    .locals 2

    .line 1
    invoke-direct {p0}, LB2/a;-><init>()V

    invoke-static {p1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, LR2/e;->o:Ljava/lang/String;

    iput-object v0, p0, LR2/e;->o:Ljava/lang/String;

    iget-object v0, p1, LR2/e;->p:Ljava/lang/String;

    iput-object v0, p0, LR2/e;->p:Ljava/lang/String;

    iget-object v0, p1, LR2/e;->q:LR2/R5;

    iput-object v0, p0, LR2/e;->q:LR2/R5;

    iget-wide v0, p1, LR2/e;->r:J

    iput-wide v0, p0, LR2/e;->r:J

    iget-boolean v0, p1, LR2/e;->s:Z

    iput-boolean v0, p0, LR2/e;->s:Z

    iget-object v0, p1, LR2/e;->t:Ljava/lang/String;

    iput-object v0, p0, LR2/e;->t:Ljava/lang/String;

    iget-object v0, p1, LR2/e;->u:LR2/I;

    iput-object v0, p0, LR2/e;->u:LR2/I;

    iget-wide v0, p1, LR2/e;->v:J

    iput-wide v0, p0, LR2/e;->v:J

    iget-object v0, p1, LR2/e;->w:LR2/I;

    iput-object v0, p0, LR2/e;->w:LR2/I;

    iget-wide v0, p1, LR2/e;->x:J

    iput-wide v0, p0, LR2/e;->x:J

    iget-object p1, p1, LR2/e;->y:LR2/I;

    iput-object p1, p0, LR2/e;->y:LR2/I;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;LR2/R5;JZLjava/lang/String;LR2/I;JLR2/I;JLR2/I;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LB2/a;-><init>()V

    iput-object p1, p0, LR2/e;->o:Ljava/lang/String;

    iput-object p2, p0, LR2/e;->p:Ljava/lang/String;

    iput-object p3, p0, LR2/e;->q:LR2/R5;

    iput-wide p4, p0, LR2/e;->r:J

    iput-boolean p6, p0, LR2/e;->s:Z

    iput-object p7, p0, LR2/e;->t:Ljava/lang/String;

    iput-object p8, p0, LR2/e;->u:LR2/I;

    iput-wide p9, p0, LR2/e;->v:J

    iput-object p11, p0, LR2/e;->w:LR2/I;

    iput-wide p12, p0, LR2/e;->x:J

    iput-object p14, p0, LR2/e;->y:LR2/I;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 6

    .line 1
    invoke-static {p1}, LB2/c;->a(Landroid/os/Parcel;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, LR2/e;->o:Ljava/lang/String;

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
    iget-object v2, p0, LR2/e;->p:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {p1, v1, v2, v3}, LB2/c;->n(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    iget-object v2, p0, LR2/e;->q:LR2/R5;

    .line 20
    .line 21
    invoke-static {p1, v1, v2, p2, v3}, LB2/c;->m(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x5

    .line 25
    iget-wide v4, p0, LR2/e;->r:J

    .line 26
    .line 27
    invoke-static {p1, v1, v4, v5}, LB2/c;->k(Landroid/os/Parcel;IJ)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x6

    .line 31
    iget-boolean v2, p0, LR2/e;->s:Z

    .line 32
    .line 33
    invoke-static {p1, v1, v2}, LB2/c;->c(Landroid/os/Parcel;IZ)V

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x7

    .line 37
    iget-object v2, p0, LR2/e;->t:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {p1, v1, v2, v3}, LB2/c;->n(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    const/16 v1, 0x8

    .line 43
    .line 44
    iget-object v2, p0, LR2/e;->u:LR2/I;

    .line 45
    .line 46
    invoke-static {p1, v1, v2, p2, v3}, LB2/c;->m(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 47
    .line 48
    .line 49
    const/16 v1, 0x9

    .line 50
    .line 51
    iget-wide v4, p0, LR2/e;->v:J

    .line 52
    .line 53
    invoke-static {p1, v1, v4, v5}, LB2/c;->k(Landroid/os/Parcel;IJ)V

    .line 54
    .line 55
    .line 56
    const/16 v1, 0xa

    .line 57
    .line 58
    iget-object v2, p0, LR2/e;->w:LR2/I;

    .line 59
    .line 60
    invoke-static {p1, v1, v2, p2, v3}, LB2/c;->m(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 61
    .line 62
    .line 63
    const/16 v1, 0xb

    .line 64
    .line 65
    iget-wide v4, p0, LR2/e;->x:J

    .line 66
    .line 67
    invoke-static {p1, v1, v4, v5}, LB2/c;->k(Landroid/os/Parcel;IJ)V

    .line 68
    .line 69
    .line 70
    const/16 v1, 0xc

    .line 71
    .line 72
    iget-object v2, p0, LR2/e;->y:LR2/I;

    .line 73
    .line 74
    invoke-static {p1, v1, v2, p2, v3}, LB2/c;->m(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 75
    .line 76
    .line 77
    invoke-static {p1, v0}, LB2/c;->b(Landroid/os/Parcel;I)V

    .line 78
    .line 79
    .line 80
    return-void
.end method
