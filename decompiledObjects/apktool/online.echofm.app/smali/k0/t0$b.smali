.class public final Lk0/t0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/t0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Lx0/T;

.field public final c:I

.field public final d:J


# direct methods
.method public constructor <init>(Ljava/util/List;Lx0/T;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk0/t0$b;->a:Ljava/util/List;

    iput-object p2, p0, Lk0/t0$b;->b:Lx0/T;

    iput p3, p0, Lk0/t0$b;->c:I

    iput-wide p4, p0, Lk0/t0$b;->d:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lx0/T;IJLk0/t0$a;)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p5}, Lk0/t0$b;-><init>(Ljava/util/List;Lx0/T;IJ)V

    return-void
.end method

.method public static synthetic a(Lk0/t0$b;)I
    .locals 0

    .line 1
    iget p0, p0, Lk0/t0$b;->c:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic b(Lk0/t0$b;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lk0/t0$b;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(Lk0/t0$b;)Lx0/T;
    .locals 0

    .line 1
    iget-object p0, p0, Lk0/t0$b;->b:Lx0/T;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic d(Lk0/t0$b;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lk0/t0$b;->d:J

    .line 2
    .line 3
    return-wide v0
.end method
