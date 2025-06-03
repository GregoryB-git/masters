.class public final LR2/R5;
.super LB2/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LR2/R5;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final o:I

.field public final p:Ljava/lang/String;

.field public final q:J

.field public final r:Ljava/lang/Long;

.field public final s:Ljava/lang/Float;

.field public final t:Ljava/lang/String;

.field public final u:Ljava/lang/String;

.field public final v:Ljava/lang/Double;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LR2/Q5;

    .line 2
    .line 3
    invoke-direct {v0}, LR2/Q5;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR2/R5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;JLjava/lang/Long;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LB2/a;-><init>()V

    iput p1, p0, LR2/R5;->o:I

    iput-object p2, p0, LR2/R5;->p:Ljava/lang/String;

    iput-wide p3, p0, LR2/R5;->q:J

    iput-object p5, p0, LR2/R5;->r:Ljava/lang/Long;

    const/4 p2, 0x0

    iput-object p2, p0, LR2/R5;->s:Ljava/lang/Float;

    const/4 p3, 0x1

    if-ne p1, p3, :cond_1

    if-eqz p6, :cond_0

    invoke-virtual {p6}, Ljava/lang/Float;->doubleValue()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    :cond_0
    iput-object p2, p0, LR2/R5;->v:Ljava/lang/Double;

    goto :goto_0

    :cond_1
    iput-object p9, p0, LR2/R5;->v:Ljava/lang/Double;

    :goto_0
    iput-object p7, p0, LR2/R5;->t:Ljava/lang/String;

    iput-object p8, p0, LR2/R5;->u:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(LR2/T5;)V
    .locals 6

    .line 2
    iget-object v1, p1, LR2/T5;->c:Ljava/lang/String;

    iget-wide v2, p1, LR2/T5;->d:J

    iget-object v4, p1, LR2/T5;->e:Ljava/lang/Object;

    iget-object v5, p1, LR2/T5;->b:Ljava/lang/String;

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, LR2/R5;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V
    .locals 1

    .line 3
    invoke-direct {p0}, LB2/a;-><init>()V

    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    const/4 v0, 0x2

    iput v0, p0, LR2/R5;->o:I

    iput-object p1, p0, LR2/R5;->p:Ljava/lang/String;

    iput-wide p2, p0, LR2/R5;->q:J

    iput-object p5, p0, LR2/R5;->u:Ljava/lang/String;

    const/4 p1, 0x0

    if-nez p4, :cond_0

    iput-object p1, p0, LR2/R5;->r:Ljava/lang/Long;

    iput-object p1, p0, LR2/R5;->s:Ljava/lang/Float;

    iput-object p1, p0, LR2/R5;->v:Ljava/lang/Double;

    iput-object p1, p0, LR2/R5;->t:Ljava/lang/String;

    return-void

    :cond_0
    instance-of p2, p4, Ljava/lang/Long;

    if-eqz p2, :cond_1

    check-cast p4, Ljava/lang/Long;

    iput-object p4, p0, LR2/R5;->r:Ljava/lang/Long;

    iput-object p1, p0, LR2/R5;->s:Ljava/lang/Float;

    iput-object p1, p0, LR2/R5;->v:Ljava/lang/Double;

    iput-object p1, p0, LR2/R5;->t:Ljava/lang/String;

    return-void

    :cond_1
    instance-of p2, p4, Ljava/lang/String;

    if-eqz p2, :cond_2

    iput-object p1, p0, LR2/R5;->r:Ljava/lang/Long;

    iput-object p1, p0, LR2/R5;->s:Ljava/lang/Float;

    iput-object p1, p0, LR2/R5;->v:Ljava/lang/Double;

    check-cast p4, Ljava/lang/String;

    iput-object p4, p0, LR2/R5;->t:Ljava/lang/String;

    return-void

    :cond_2
    instance-of p2, p4, Ljava/lang/Double;

    if-eqz p2, :cond_3

    iput-object p1, p0, LR2/R5;->r:Ljava/lang/Long;

    iput-object p1, p0, LR2/R5;->s:Ljava/lang/Float;

    check-cast p4, Ljava/lang/Double;

    iput-object p4, p0, LR2/R5;->v:Ljava/lang/Double;

    iput-object p1, p0, LR2/R5;->t:Ljava/lang/String;

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "User attribute given of un-supported type"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LR2/R5;->r:Ljava/lang/Long;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, LR2/R5;->v:Ljava/lang/Double;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_1
    iget-object v0, p0, LR2/R5;->t:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_2
    const/4 v0, 0x0

    .line 17
    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    .line 1
    invoke-static {p1}, LB2/c;->a(Landroid/os/Parcel;)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x1

    .line 6
    iget v1, p0, LR2/R5;->o:I

    .line 7
    .line 8
    invoke-static {p1, v0, v1}, LB2/c;->i(Landroid/os/Parcel;II)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LR2/R5;->p:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-static {p1, v1, v0, v2}, LB2/c;->n(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x3

    .line 19
    iget-wide v3, p0, LR2/R5;->q:J

    .line 20
    .line 21
    invoke-static {p1, v0, v3, v4}, LB2/c;->k(Landroid/os/Parcel;IJ)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x4

    .line 25
    iget-object v1, p0, LR2/R5;->r:Ljava/lang/Long;

    .line 26
    .line 27
    invoke-static {p1, v0, v1, v2}, LB2/c;->l(Landroid/os/Parcel;ILjava/lang/Long;Z)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x5

    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-static {p1, v0, v1, v2}, LB2/c;->g(Landroid/os/Parcel;ILjava/lang/Float;Z)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x6

    .line 36
    iget-object v1, p0, LR2/R5;->t:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {p1, v0, v1, v2}, LB2/c;->n(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x7

    .line 42
    iget-object v1, p0, LR2/R5;->u:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {p1, v0, v1, v2}, LB2/c;->n(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 45
    .line 46
    .line 47
    const/16 v0, 0x8

    .line 48
    .line 49
    iget-object v1, p0, LR2/R5;->v:Ljava/lang/Double;

    .line 50
    .line 51
    invoke-static {p1, v0, v1, v2}, LB2/c;->f(Landroid/os/Parcel;ILjava/lang/Double;Z)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1, p2}, LB2/c;->b(Landroid/os/Parcel;I)V

    .line 55
    .line 56
    .line 57
    return-void
.end method
